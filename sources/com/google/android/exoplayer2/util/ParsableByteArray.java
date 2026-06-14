package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.of(Charsets.US_ASCII, Charsets.UTF_8, Charsets.UTF_16, Charsets.UTF_16BE, Charsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.position
        L46:
            int r2 = r4.limit
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.data
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L69
            goto La2
        L69:
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.data
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L8a
            goto La2
        L8a:
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.data
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = com.google.android.exoplayer2.util.Util.isLinebreak(r2)
            if (r2 == 0) goto La3
        La2:
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private int peekCharacterAndSize(Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i10 = 1;
        if ((charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) && bytesLeft() >= 1) {
            bCheckedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i11 = this.position;
                cFromBytes = Chars.fromBytes(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(Charsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i12 = this.position;
                cFromBytes = Chars.fromBytes(bArr2[i12 + 1], bArr2[i12]);
            }
            bCheckedCast = (byte) cFromBytes;
            i10 = 2;
        }
        return (Chars.checkedCast(bCheckedCast) << 16) + i10;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c10 = (char) (iPeekCharacterAndSize >> 16);
        if (!Chars.contains(cArr, c10)) {
            return (char) 0;
        }
        this.position += iPeekCharacterAndSize & 65535;
        return c10;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i10) {
        if (i10 > capacity()) {
            this.data = Arrays.copyOf(this.data, i10);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i10 = this.position;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i10) {
        readBytes(parsableBitArray.data, 0, i10);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c10) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && this.data[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.data;
        int i11 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i11, i10 - i11);
        this.position = i10;
        if (i10 < this.limit) {
            this.position = i10 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.position = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.position = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.position = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    @Nullable
    public String readLine() {
        return readLine(Charsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.position = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.position = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.position = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.position = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.position = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.position = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & 255;
        this.position = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.position = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.position = i10 + 3;
        return ((bArr[i13] & 255) << 16) | i14;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = bArr[i10] & 255;
        this.position = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.position = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.position = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.position = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.position = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.position = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String readNullTerminatedString(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.position;
        int i12 = (i11 + i10) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i11, (i12 >= this.limit || this.data[i12] != 0) ? i10 : i10 - 1);
        this.position += i10;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.position = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String readString(int i10) {
        return readString(i10, Charsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.position = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.position = i10 + 4;
        return i13;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.position = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.position = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.position = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.position = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.position = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int readUnsignedIntToInt() {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException("Top bit not zero: " + i10);
    }

    public long readUnsignedLongToLong() {
        long j10 = readLong();
        if (j10 >= 0) {
            return j10;
        }
        throw new IllegalStateException("Top bit not zero: " + j10);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.position = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long readUtf8EncodedLong() {
        int i10;
        int i11;
        long j10 = this.data[this.position];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.data[this.position + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.position += i11;
        return j10;
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i10 = this.position;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.position = i10 + 3;
                return Charsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i11 = this.position;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.position = i11 + 2;
            return Charsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.position = i11 + 2;
        return Charsets.UTF_16LE;
    }

    public void reset(int i10) {
        reset(capacity() < i10 ? new byte[i10] : this.data, i10);
    }

    public void setLimit(int i10) {
        Assertions.checkArgument(i10 >= 0 && i10 <= this.data.length);
        this.limit = i10;
    }

    public void setPosition(int i10) {
        Assertions.checkArgument(i10 >= 0 && i10 <= this.limit);
        this.position = i10;
    }

    public void skipBytes(int i10) {
        setPosition(this.position + i10);
    }

    public char peekChar(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(Charsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.data, this.position, i10, charset);
        this.position += i10;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i10) {
        this.data = new byte[i10];
        this.limit = i10;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.data, this.position, bArr, i10, i11);
        this.position += i11;
    }

    public void reset(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.data, this.position, i10);
        this.position += i10;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
    }
}
