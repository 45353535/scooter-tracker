package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public final class ParsableByteArray {
    public byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
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

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.position = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (((bArr[i10] & 255) << 24) >> 8);
        this.position = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readLine() {
        /*
            r6 = this;
            int r0 = r6.bytesLeft()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r6.position
        La:
            int r1 = r6.limit
            if (r0 >= r1) goto L1b
            byte[] r1 = r6.data
            r1 = r1[r0]
            boolean r1 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.isLinebreak(r1)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto La
        L1b:
            int r1 = r6.position
            int r2 = r0 - r1
            r3 = 3
            if (r2 < r3) goto L3d
            byte[] r2 = r6.data
            r4 = r2[r1]
            r5 = -17
            if (r4 != r5) goto L3d
            int r4 = r1 + 1
            r4 = r2[r4]
            r5 = -69
            if (r4 != r5) goto L3d
            int r4 = r1 + 2
            r2 = r2[r4]
            r4 = -65
            if (r2 != r4) goto L3d
            int r1 = r1 + r3
            r6.position = r1
        L3d:
            byte[] r1 = r6.data
            int r2 = r6.position
            int r3 = r0 - r2
            java.lang.String r1 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.fromUtf8Bytes(r1, r2, r3)
            r6.position = r0
            int r2 = r6.limit
            if (r0 != r2) goto L4e
            goto L69
        L4e:
            byte[] r3 = r6.data
            r4 = r3[r0]
            r5 = 13
            if (r4 != r5) goto L5d
            int r0 = r0 + 1
            r6.position = r0
            if (r0 != r2) goto L5d
            goto L69
        L5d:
            int r0 = r6.position
            r2 = r3[r0]
            r3 = 10
            if (r2 != r3) goto L69
            int r0 = r0 + 1
            r6.position = r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray.readLine():java.lang.String");
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.position = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        this.position = i10 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 7;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        this.position = i10 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j10;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.position = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 3;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16);
        this.position = i10 + 4;
        return ((((long) bArr[i11]) & 255) << 24) | j10;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        this.position = i10 + 3;
        return ((bArr[i11] & 255) << 16) | i12;
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
        int i12 = bArr[i10] & 255;
        this.position = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        this.position = i10 + 8;
        return (((long) bArr[i11]) & 255) | j10;
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
        int i12 = (bArr[i10] & 255) << 8;
        this.position = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String readString(int i10) {
        return readString(i10, Charset.forName("UTF-8"));
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
        int i11 = (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
        this.position = i10 + 4;
        return i11;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 3;
        long j10 = ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i10 + 1]) & 255) << 16) | ((((long) bArr[i10 + 2]) & 255) << 8);
        this.position = i10 + 4;
        return (((long) bArr[i11]) & 255) | j10;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i10 = this.position;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.position = i10 + 3;
        return (bArr[i11] & 255) | i12;
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

    public ParsableByteArray(int i10) {
        this.data = new byte[i10];
        this.limit = i10;
    }

    public String readString(int i10, Charset charset) {
        String str = new String(this.data, this.position, i10, charset);
        this.position += i10;
        return str;
    }

    public void reset(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
        this.position = 0;
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.data, this.position, bArr, i10, i11);
        this.position += i11;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public void readBytes(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put(this.data, this.position, i10);
        this.position += i10;
    }

    public void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public String readNullTerminatedString() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i10 = this.position;
        while (i10 < this.limit && this.data[i10] != 0) {
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

    public ParsableByteArray(byte[] bArr, int i10) {
        this.data = bArr;
        this.limit = i10;
    }
}
