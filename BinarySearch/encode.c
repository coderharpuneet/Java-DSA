#include <stdio.h>
#include <stdlib.h>
#include <string.h>

static const char BASE64_TABLE[] =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

// Inverse Table for decoding (initialized later)
static int INV_TABLE[128];

// ---------------- ENCODE FUNCTION ----------------
char* base64_encode(const unsigned char* data, int len) {
    int outputLen = 4 * ((len + 2) / 3); // 3 bytes → 4 chars
    char* encoded = (char*)malloc(outputLen + 1);
    if (!encoded) return NULL;

    int i = 0, j = 0;
    while (i < len) {
        int b0 = data[i++] & 0xFF;
        int b1 = (i < len) ? data[i++] & 0xFF : 0;
        int b2 = (i < len) ? data[i++] & 0xFF : 0;

        int block = (b0 << 16) | (b1 << 8) | b2;

        encoded[j++] = BASE64_TABLE[(block >> 18) & 0x3F];
        encoded[j++] = BASE64_TABLE[(block >> 12) & 0x3F];
        encoded[j++] = (i - 1) < len ? BASE64_TABLE[(block >> 6) & 0x3F] : '=';
        encoded[j++] = i < len ? BASE64_TABLE[block & 0x3F] : '=';
    }

    encoded[j] = '\0';
    return encoded;
}

// ---------------- DECODE FUNCTION ----------------
unsigned char* base64_decode(const char* input, int* outLen) {
    int len = strlen(input);
    if (len % 4 != 0) return NULL;

    int padding = 0;
    if (len >= 2 && input[len - 1] == '=' && input[len - 2] == '=') padding = 2;
    else if (len >= 1 && input[len - 1] == '=') padding = 1;

    int bytesLen = (len * 6) / 8 - padding;
    unsigned char* decoded = (unsigned char*)malloc(bytesLen);
    if (!decoded) return NULL;

    int i = 0, j = 0;
    while (i < len) {
        int c0 = input[i] == '=' ? 0 : INV_TABLE[(int)input[i]];
        int c1 = input[i + 1] == '=' ? 0 : INV_TABLE[(int)input[i + 1]];
        int c2 = input[i + 2] == '=' ? 0 : INV_TABLE[(int)input[i + 2]];
        int c3 = input[i + 3] == '=' ? 0 : INV_TABLE[(int)input[i + 3]];

        int block = (c0 << 18) | (c1 << 12) | (c2 << 6) | c3;

        if (j < bytesLen) decoded[j++] = (block >> 16) & 0xFF;
        if (j < bytesLen) decoded[j++] = (block >> 8) & 0xFF;
        if (j < bytesLen) decoded[j++] = block & 0xFF;

        i += 4;
    }

    *outLen = bytesLen;
    return decoded;
}

// ---------------- MAIN FUNCTION ----------------
int main() {
    // Initialize inverse table
    for (int i = 0; i < 128; i++) INV_TABLE[i] = -1;
    for (int i = 0; i < 64; i++) INV_TABLE[(int)BASE64_TABLE[i]] = i;

    const char* text = "Hello World!!";
    printf("Original: %s\n", text);

    // Encode
    char* encoded = base64_encode((const unsigned char*)text, strlen(text));
    printf("Encoded: %s\n", encoded);

    // Decode
    int decodedLen;
    unsigned char* decoded = base64_decode(encoded, &decodedLen);
    printf("Decoded: %.*s\n", decodedLen, decoded);

    // Free memory
    free(encoded);
    free(decoded);

    return 0;
}
