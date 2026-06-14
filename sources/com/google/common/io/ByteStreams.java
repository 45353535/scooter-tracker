package com.google.common.io;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class ByteStreams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OutputStream f30896a = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i10, i11 + i10, bArr.length);
        }
    };

    private static byte[] a(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    private static long c(InputStream inputStream, long j10) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j10));
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArrB = b();
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArrB);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArrB, 0, i10);
            j10 += (long) i10;
        }
    }

    static long d(InputStream inputStream, long j10) {
        byte[] bArr = null;
        long j11 = 0;
        while (j11 < j10) {
            long j12 = j10 - j11;
            long jC = c(inputStream, j12);
            if (jC == 0) {
                int iMin = (int) Math.min(j12, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jC = inputStream.read(bArr, 0, iMin);
                if (jC == -1) {
                    break;
                }
            }
            j11 += jC;
        }
        return j11;
    }

    static byte[] e(InputStream inputStream, long j10) throws IOException {
        Preconditions.checkArgument(j10 >= 0, "expectedSize (%s) must be non-negative", j10);
        if (j10 > 2147483639) {
            throw new OutOfMemoryError(j10 + " bytes is too large to fit in a byte array");
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i10 - i11;
            int i13 = inputStream.read(bArr, i12, i11);
            if (i13 == -1) {
                return Arrays.copyOf(bArr, i12);
            }
            i11 -= i13;
        }
        int i14 = inputStream.read();
        if (i14 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i14});
        return f(inputStream, arrayDeque, i10 + 1);
    }

    @CanIgnoreReturnValue
    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] bArrB = b();
        long j10 = 0;
        while (true) {
            long j11 = inputStream.read(bArrB);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    private static byte[] f(InputStream inputStream, Queue queue, int i10) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(queue, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = IntMath.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream limit(InputStream inputStream, long j10) {
        return new LimitedInputStream(inputStream, j10);
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static OutputStream nullOutputStream() {
        return f30896a;
    }

    @CanIgnoreReturnValue
    public static int read(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i11)));
        }
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int i10;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] bArrB = b();
        do {
            i10 = inputStream.read(bArrB);
            if (i10 == -1) {
                break;
            }
        } while (byteProcessor.processBytes(bArrB, 0, i10));
        return byteProcessor.getResult();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void skipFully(InputStream inputStream, long j10) throws IOException {
        long jD = d(inputStream, j10);
        if (jD >= j10) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jD + " bytes; " + j10 + " bytes expected");
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static class ByteArrayDataInputStream implements ByteArrayDataInput {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataInput f30897b;

        ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.f30897b = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f30897b.readBoolean();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.f30897b.readByte();
            } catch (EOFException e10) {
                throw new IllegalStateException(e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.f30897b.readChar();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.f30897b.readDouble();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.f30897b.readFloat();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.f30897b.readFully(bArr);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.f30897b.readInt();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readLine() {
            try {
                return this.f30897b.readLine();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.f30897b.readLong();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.f30897b.readShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.f30897b.readUTF();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f30897b.readUnsignedByte();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f30897b.readUnsignedShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i10) {
            try {
                return this.f30897b.skipBytes(i10);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            try {
                this.f30897b.readFully(bArr, i10, i11);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static class ByteArrayDataOutputStream implements ByteArrayDataOutput {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataOutput f30898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ByteArrayOutputStream f30899c;

        ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.f30899c = byteArrayOutputStream;
            this.f30898b = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.f30899c.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i10) {
            try {
                this.f30898b.write(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z10) {
            try {
                this.f30898b.writeBoolean(z10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i10) {
            try {
                this.f30898b.writeByte(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.f30898b.writeBytes(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i10) {
            try {
                this.f30898b.writeChar(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.f30898b.writeChars(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d10) {
            try {
                this.f30898b.writeDouble(d10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f10) {
            try {
                this.f30898b.writeFloat(f10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i10) {
            try {
                this.f30898b.writeInt(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j10) {
            try {
                this.f30898b.writeLong(j10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i10) {
            try {
                this.f30898b.writeShort(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.f30898b.writeUTF(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.f30898b.write(bArr);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i10, int i11) {
            try {
                this.f30898b.write(bArr, i10, i11);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static ByteArrayDataInput newDataInput(byte[] bArr, int i10) {
        Preconditions.checkPositionIndex(i10, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i10, bArr.length - i10));
    }

    public static ByteArrayDataOutput newDataOutput(int i10) {
        if (i10 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i10));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i10)));
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = read(inputStream, bArr, i10, i11);
        if (i12 == i11) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + i12 + " bytes; " + i11 + " bytes expected");
    }

    private static final class LimitedInputStream extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f30901c;

        LimitedInputStream(InputStream inputStream, long j10) {
            super(inputStream);
            this.f30901c = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j10 >= 0, "limit must be non-negative");
            this.f30900b = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f30900b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f30901c = this.f30900b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f30900b == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f30900b--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f30901c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f30900b = this.f30901c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f30900b));
            this.f30900b -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f30900b;
            if (j10 == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (i12 != -1) {
                this.f30900b -= (long) i12;
            }
            return i12;
        }
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j10 = jPosition;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long jTransferTo = fileChannel.transferTo(j10, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel2);
                j10 += jTransferTo;
                fileChannel.position(j10);
                if (jTransferTo <= 0 && j10 >= fileChannel.size()) {
                    return j10 - jPosition;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(b());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                Java8Compatibility.b(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                Java8Compatibility.a(byteBufferWrap);
            }
            return jWrite;
        }
    }
}
