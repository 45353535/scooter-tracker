package io.appmetrica.analytics.protobuf.nano;

import androidx.work.WorkInfo;
import com.amazon.device.ads.DtbConstants;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes12.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int i10, int i11) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i10 + " limit " + i11 + ").");
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i10, int i11) {
        this(ByteBuffer.wrap(bArr, i10, i11));
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeBytesSize(int i10, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeRawVarint32Size(i10);
    }

    static int computeFieldSize(int i10, int i11, Object obj) {
        switch (i11) {
            case 1:
                return computeDoubleSize(i10, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i10, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i10, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i10, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i10, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i10, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i10, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i10, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i10, (String) obj);
            case 10:
                return computeGroupSize(i10, (MessageNano) obj);
            case 11:
                return computeMessageSize(i10, (MessageNano) obj);
            case 12:
                return computeBytesSize(i10, (byte[]) obj);
            case 13:
                return computeUInt32Size(i10, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i10, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i10, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i10, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i10, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i10, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException("Unknown type: " + i11);
        }
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    public static int computeGroupSize(int i10, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i10) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeRawVarint32Size(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int computeMessageSize(int i10, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i10) {
        if ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeSFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int iEncodedLength = encodedLength(str);
        return computeRawVarint32Size(iEncodedLength) + iEncodedLength;
    }

    public static int computeTagSize(int i10) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(i10);
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeUInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | 960));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i11 = i10 + 1;
                    if (i11 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                    sb2.append(i10 - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i10++;
        }
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i10);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i10);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i10, boolean z10) throws IOException {
        writeTag(i10, 0);
        writeBoolNoTag(z10);
    }

    public void writeBoolNoTag(boolean z10) throws IOException {
        writeRawByte(z10 ? 1 : 0);
    }

    public void writeBytes(int i10, byte[] bArr) throws IOException {
        writeTag(i10, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i10, double d10) throws IOException {
        writeTag(i10, 1);
        writeDoubleNoTag(d10);
    }

    public void writeDoubleNoTag(double d10) throws IOException {
        writeRawLittleEndian64(Double.doubleToLongBits(d10));
    }

    public void writeEnum(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeEnumNoTag(i11);
    }

    public void writeEnumNoTag(int i10) throws IOException {
        writeRawVarint32(i10);
    }

    void writeField(int i10, int i11, Object obj) throws IOException {
        switch (i11) {
            case 1:
                writeDouble(i10, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i10, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i10, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i10, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i10, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i10, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i10, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i10, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i10, (String) obj);
                return;
            case 10:
                writeGroup(i10, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i10, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i10, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i10, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i10, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i10, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i10, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i10, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i10, ((Long) obj).longValue());
                return;
            default:
                throw new IOException("Unknown type: " + i11);
        }
    }

    public void writeFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeFixed32NoTag(i11);
    }

    public void writeFixed32NoTag(int i10) throws IOException {
        writeRawLittleEndian32(i10);
    }

    public void writeFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeFixed64NoTag(j10);
    }

    public void writeFixed64NoTag(long j10) throws IOException {
        writeRawLittleEndian64(j10);
    }

    public void writeFloat(int i10, float f10) throws IOException {
        writeTag(i10, 5);
        writeFloatNoTag(f10);
    }

    public void writeFloatNoTag(float f10) throws IOException {
        writeRawLittleEndian32(Float.floatToIntBits(f10));
    }

    public void writeGroup(int i10, MessageNano messageNano) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageNano);
        writeTag(i10, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) throws IOException {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    public void writeInt32NoTag(int i10) throws IOException {
        if (i10 >= 0) {
            writeRawVarint32(i10);
        } else {
            writeRawVarint64(i10);
        }
    }

    public void writeInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeInt64NoTag(j10);
    }

    public void writeInt64NoTag(long j10) throws IOException {
        writeRawVarint64(j10);
    }

    public void writeMessage(int i10, MessageNano messageNano) throws IOException {
        writeTag(i10, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws IOException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b10) throws IOException {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b10);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i10) throws IOException {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i10);
    }

    public void writeRawLittleEndian64(long j10) throws IOException {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j10);
    }

    public void writeRawVarint32(int i10) throws IOException {
        while ((i10 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            writeRawByte((i10 & 127) | 128);
            i10 >>>= 7;
        }
        writeRawByte(i10);
    }

    public void writeRawVarint64(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            writeRawByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        writeRawByte((int) j10);
    }

    public void writeSFixed32(int i10, int i11) throws IOException {
        writeTag(i10, 5);
        writeSFixed32NoTag(i11);
    }

    public void writeSFixed32NoTag(int i10) throws IOException {
        writeRawLittleEndian32(i10);
    }

    public void writeSFixed64(int i10, long j10) throws IOException {
        writeTag(i10, 1);
        writeSFixed64NoTag(j10);
    }

    public void writeSFixed64NoTag(long j10) throws IOException {
        writeRawLittleEndian64(j10);
    }

    public void writeSInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeSInt32NoTag(i11);
    }

    public void writeSInt32NoTag(int i10) throws IOException {
        writeRawVarint32(encodeZigZag32(i10));
    }

    public void writeSInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeSInt64NoTag(j10);
    }

    public void writeSInt64NoTag(long j10) throws IOException {
        writeRawVarint64(encodeZigZag64(j10));
    }

    public void writeString(int i10, String str) throws IOException {
        writeTag(i10, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws IOException {
        try {
            int iComputeRawVarint32Size = computeRawVarint32Size(str.length());
            if (iComputeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int iPosition = this.buffer.position();
            if (this.buffer.remaining() < iComputeRawVarint32Size) {
                throw new OutOfSpaceException(iPosition + iComputeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(iPosition + iComputeRawVarint32Size);
            encode(str, this.buffer);
            int iPosition2 = this.buffer.position();
            this.buffer.position(iPosition);
            writeRawVarint32((iPosition2 - iPosition) - iComputeRawVarint32Size);
            this.buffer.position(iPosition2);
        } catch (BufferOverflowException e10) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e10);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i10, int i11) throws IOException {
        writeRawVarint32(WireFormatNano.makeTag(i10, i11));
    }

    public void writeUInt32(int i10, int i11) throws IOException {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    public void writeUInt32NoTag(int i10) throws IOException {
        writeRawVarint32(i10);
    }

    public void writeUInt64(int i10, long j10) throws IOException {
        writeTag(i10, 0);
        writeUInt64NoTag(j10);
    }

    public void writeUInt64NoTag(long j10) throws IOException {
        writeRawVarint64(j10);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i10, int i11) {
        return new CodedOutputByteBufferNano(bArr, i10, i11);
    }

    public void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        if (this.buffer.remaining() < i11) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i10, i11);
    }

    public void writeRawByte(int i10) throws IOException {
        writeRawByte((byte) i10);
    }

    private static int encode(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        char cCharAt;
        int length = charSequence.length();
        int i13 = i11 + i10;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i10) < i13 && (cCharAt = charSequence.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i10 + length;
        }
        int i15 = i10 + i14;
        while (i14 < length) {
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                    if (i15 <= i13 - 4) {
                        int i17 = i14 + 1;
                        if (i17 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i17);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i18 = i15 + 3;
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i18] = (byte) ((codePoint & 63) | 128);
                                i14 = i17;
                            } else {
                                i14 = i17;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                        sb2.append(i14 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }
}
