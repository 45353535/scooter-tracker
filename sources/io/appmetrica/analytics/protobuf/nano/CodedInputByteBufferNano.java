package io.appmetrica.analytics.protobuf.nano;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = 67108864;

    private CodedInputByteBufferNano(byte[] bArr, int i10, int i11) {
        this.buffer = bArr;
        this.bufferStart = i10;
        this.bufferSize = i11 + i10;
        this.bufferPos = i10;
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i10 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i10;
        int i11 = this.currentLimit;
        if (i10 <= i11) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i12 = i10 - i11;
        this.bufferSizeAfterLimit = i12;
        this.bufferSize = i10 - i12;
    }

    public void checkLastTagWas(int i10) throws InvalidProtocolBufferNanoException {
        if (this.lastTag != i10) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i10 = this.currentLimit;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.bufferPos;
    }

    public byte[] getData(int i10, int i11) {
        if (i11 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.buffer, this.bufferStart + i10, bArr, 0, i11);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i10) {
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i10) throws InvalidProtocolBufferNanoException {
        if (i10 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i11 = i10 + this.bufferPos;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i11;
        recomputeBufferSizeAfterLimit();
        return i12;
    }

    public boolean readBool() throws IOException {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(rawVarint32);
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i11, bArr, 0, rawVarint32);
        this.bufferPos += rawVarint32;
        return bArr;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i10) throws IOException {
        int i11 = this.recursionDepth;
        if (i11 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i11 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i10, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    Object readPrimitiveField(int i10) throws IOException {
        switch (i10) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException("Unknown type " + i10);
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() throws IOException {
        int i10 = this.bufferPos;
        if (i10 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i10 + 1;
        return bArr[i10];
    }

    public byte[] readRawBytes(int i10) throws IOException {
        if (i10 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i11 = this.bufferPos;
        int i12 = i11 + i10;
        int i13 = this.currentLimit;
        if (i12 > i13) {
            skipRawBytes(i13 - i11);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i10 > this.bufferSize - i11) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, i11, bArr, 0, i10);
        this.bufferPos += i10;
        return bArr;
    }

    public int readRawLittleEndian32() throws IOException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        byte rawByte = readRawByte();
        return ((((long) readRawByte()) & 255) << 8) | (((long) rawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i10;
        byte rawByte = readRawByte();
        if (rawByte >= 0) {
            return rawByte;
        }
        int i11 = rawByte & Ascii.DEL;
        byte rawByte2 = readRawByte();
        if (rawByte2 >= 0) {
            i10 = rawByte2 << 7;
        } else {
            i11 |= (rawByte2 & Ascii.DEL) << 7;
            byte rawByte3 = readRawByte();
            if (rawByte3 >= 0) {
                i10 = rawByte3 << Ascii.SO;
            } else {
                i11 |= (rawByte3 & Ascii.DEL) << 14;
                byte rawByte4 = readRawByte();
                if (rawByte4 < 0) {
                    int i12 = i11 | ((rawByte4 & Ascii.DEL) << 21);
                    byte rawByte5 = readRawByte();
                    int i13 = i12 | (rawByte5 << Ascii.FS);
                    if (rawByte5 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            if (readRawByte() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i13;
                }
                i10 = rawByte4 << Ascii.NAK;
            }
        }
        return i11 | i10;
    }

    public long readRawVarint64() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & Ascii.DEL)) << i10;
            if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return new String(readRawBytes(rawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i11, rawVarint32, InternalNano.UTF_8);
        this.bufferPos += rawVarint32;
        return str;
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (rawVarint32 != 0) {
            return rawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int i10) {
        int i11 = this.bufferPos;
        int i12 = this.bufferStart;
        if (i10 > i11 - i12) {
            throw new IllegalArgumentException("Position " + i10 + " is beyond current " + (this.bufferPos - this.bufferStart));
        }
        if (i10 >= 0) {
            this.bufferPos = i12 + i10;
        } else {
            throw new IllegalArgumentException("Bad position " + i10);
        }
    }

    public int setRecursionLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.recursionLimit;
            this.recursionLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public int setSizeLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.sizeLimit;
            this.sizeLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public boolean skipField(int i10) throws IOException {
        int tagWireType = WireFormatNano.getTagWireType(i10);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i10), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    public void skipRawBytes(int i10) throws IOException {
        if (i10 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i11 = this.bufferPos;
        int i12 = i11 + i10;
        int i13 = this.currentLimit;
        if (i12 > i13) {
            skipRawBytes(i13 - i11);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i10 > this.bufferSize - i11) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i12;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i10, int i11) {
        return new CodedInputByteBufferNano(bArr, i10, i11);
    }
}
