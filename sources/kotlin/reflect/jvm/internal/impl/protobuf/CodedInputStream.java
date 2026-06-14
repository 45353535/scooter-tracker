package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void ensureAvailable(int i10) throws IOException {
        if (this.bufferSize - this.bufferPos < i10) {
            refillBuffer(i10);
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    private byte[] readRawBytesSlowPath(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.totalBytesRetired;
        int i12 = this.bufferPos;
        int i13 = i11 + i12 + i10;
        int i14 = this.currentLimit;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.bufferSize - i12;
            System.arraycopy(this.buffer, i12, bArr, 0, i15);
            this.bufferPos = this.bufferSize;
            int i16 = i10 - i15;
            ensureAvailable(i16);
            System.arraycopy(this.buffer, 0, bArr, i15, i16);
            this.bufferPos = i16;
            return bArr;
        }
        int i17 = this.bufferSize;
        this.totalBytesRetired = i11 + i17;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.input;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.buffer, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    private void recomputeBufferSizeAfterLimit() {
        int i10 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i10;
        int i11 = this.totalBytesRetired + i10;
        int i12 = this.currentLimit;
        if (i11 <= i12) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i13 = i11 - i12;
        this.bufferSizeAfterLimit = i13;
        this.bufferSize = i10 - i13;
    }

    private void refillBuffer(int i10) throws IOException {
        if (!tryRefillBuffer(i10)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i10) throws IOException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.totalBytesRetired;
        int i12 = this.bufferPos;
        int i13 = i11 + i12 + i10;
        int i14 = this.currentLimit;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i15 = this.bufferSize;
        int i16 = i15 - i12;
        this.bufferPos = i15;
        refillBuffer(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.bufferSize;
            if (i17 <= i18) {
                this.bufferPos = i17;
                return;
            } else {
                i16 += i18;
                this.bufferPos = i18;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i10) throws IOException {
        int i11 = this.bufferPos;
        if (i11 + i10 <= this.bufferSize) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.totalBytesRetired + i11 + i10 > this.currentLimit) {
            return false;
        }
        RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i12 = this.bufferPos;
            if (i12 > 0) {
                int i13 = this.bufferSize;
                if (i13 > i12) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                }
                this.totalBytesRetired += i12;
                this.bufferSize -= i12;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i14 = this.bufferSize;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.buffer.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.bufferSize += i15;
                if ((this.totalBytesRetired + i10) - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i10) {
                    return true;
                }
                return tryRefillBuffer(i10);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.lastTag != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i10 = this.currentLimit;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i10) {
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = i10 + this.totalBytesRetired + this.bufferPos;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i11;
        recomputeBufferSizeAfterLimit();
        return i12;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(rawVarint32));
        }
        ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, rawVarint32) : ByteString.copyFrom(this.buffer, i11, rawVarint32);
        this.bufferPos += rawVarint32;
        return boundedByteString;
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

    public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i11 = this.recursionDepth;
        if (i11 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i11 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i10, 4));
        this.recursionDepth--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.bufferPos;
        this.bufferPos = i10 + 1;
        return bArr[i10];
    }

    public int readRawLittleEndian32() throws IOException {
        int i10 = this.bufferPos;
        if (this.bufferSize - i10 < 4) {
            refillBuffer(4);
            i10 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i10 = this.bufferPos;
        if (this.bufferSize - i10 < 8) {
            refillBuffer(8);
            i10 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.bufferPos;
        int i12 = this.bufferSize;
        if (i12 != i11) {
            byte[] bArr = this.buffer;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.bufferPos = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << Ascii.SO) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << Ascii.NAK);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << Ascii.FS))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.bufferPos = i14;
                return i10;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r10.bufferPos
            int r1 = r10.bufferSize
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            byte[] r2 = r10.buffer
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.bufferPos = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r3 = r3 ^ r5
            goto Lbb
        L2e:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L40
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r3 = r3 ^ r0
        L3d:
            r1 = r7
            goto Lbb
        L40:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L50
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L50:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L61
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L61:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L74:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L87
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L87:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L9a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9a:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbb
        Lb6:
            long r0 = r10.readRawVarint64SlowPath()
            return r0
        Lbb:
            r10.bufferPos = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    long readRawVarint64SlowPath() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & Ascii.DEL)) << i10;
            if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
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
            return rawVarint32 == 0 ? "" : new String(readRawBytesSlowPath(rawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, i11, rawVarint32, "UTF-8");
        this.bufferPos += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i10 = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i10 && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i10 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i10 = 0;
        }
        if (Utf8.isValidUtf8(rawBytesSlowPath, i10, i10 + rawVarint32)) {
            return new String(rawBytesSlowPath, i10, rawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (tagWireType == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (tagWireType == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i10);
            skipMessage(codedOutputStream);
            int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
            checkLastTagWas(iMakeTag);
            codedOutputStream.writeRawVarint32(iMakeTag);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i10);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i10) throws IOException {
        int i11 = this.bufferSize;
        int i12 = this.bufferPos;
        if (i10 > i11 - i12 || i10 < 0) {
            skipRawBytesSlowPath(i10);
        } else {
            this.bufferPos = i12 + i10;
        }
    }

    static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
