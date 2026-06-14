package androidx.emoji2.text.flatbuffer;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    static class DecodeUtil {
        DecodeUtil() {
        }

        static void handleFourBytes(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws IllegalArgumentException {
            if (isNotTrailingByte(b11) || (((b10 << Ascii.FS) + (b11 + 112)) >> 30) != 0 || isNotTrailingByte(b12) || isNotTrailingByte(b13)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b10 & 7) << 18) | (trailingByteValue(b11) << 12) | (trailingByteValue(b12) << 6) | trailingByteValue(b13);
            cArr[i10] = highSurrogate(iTrailingByteValue);
            cArr[i10 + 1] = lowSurrogate(iTrailingByteValue);
        }

        static void handleOneByte(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        static void handleThreeBytes(byte b10, byte b11, byte b12, char[] cArr, int i10) throws IllegalArgumentException {
            if (isNotTrailingByte(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || isNotTrailingByte(b12)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i10] = (char) (((b10 & Ascii.SI) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12));
        }

        static void handleTwoBytes(byte b10, byte b11, char[] cArr, int i10) throws IllegalArgumentException {
            if (b10 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b11)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i10] = (char) (((b10 & Ascii.US) << 6) | trailingByteValue(b11));
        }

        private static char highSurrogate(int i10) {
            return (char) ((i10 >>> 10) + com.applovin.shadow.okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b10) {
            return b10 > -65;
        }

        static boolean isOneByte(byte b10) {
            return b10 >= 0;
        }

        static boolean isThreeBytes(byte b10) {
            return b10 < -16;
        }

        static boolean isTwoBytes(byte b10) {
            return b10 < -32;
        }

        private static char lowSurrogate(int i10) {
            return (char) ((i10 & 1023) + com.applovin.shadow.okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b10) {
            return b10 & com.applovin.shadow.okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
