package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class m1 extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f19227b;

    m1(ByteBuffer byteBuffer) {
        j0.b(byteBuffer, "buffer");
        this.f19227b = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer b(int i10, int i11) {
        if (i10 < this.f19227b.position() || i11 > this.f19227b.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f19227b.slice();
        byteBufferSlice.position(i10 - this.f19227b.position());
        byteBufferSlice.limit(i11 - this.f19227b.position());
        return byteBufferSlice;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f19227b.slice());
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f19227b.asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        try {
            return this.f19227b.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f19227b.slice());
    }

    @Override // com.explorestack.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f19227b.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof m1 ? this.f19227b.equals(((m1) obj).f19227b) : obj instanceof w1 ? obj.equals(this) : this.f19227b.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString.LeafByteString
    boolean equalsRange(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        return x2.r(this.f19227b);
    }

    @Override // com.explorestack.protobuf.ByteString
    public l newCodedInput() {
        return l.k(this.f19227b, true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f19227b.get(i13);
        }
        return i10;
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        return x2.u(i10, this.f19227b, i11, i12 + i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f19227b.remaining();
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        try {
            return new m1(b(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f19227b.hasArray()) {
            byteArray = this.f19227b.array();
            iArrayOffset = this.f19227b.arrayOffset() + this.f19227b.position();
            length = this.f19227b.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.f19227b.hasArray()) {
            i.g(b(i10, i11 + i10), outputStream);
        } else {
            outputStream.write(this.f19227b.array(), this.f19227b.arrayOffset() + this.f19227b.position() + i10, i11);
        }
    }

    class a extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f19228b;

        a() {
            this.f19228b = m1.this.f19227b.slice();
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f19228b.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f19228b.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f19228b.hasRemaining()) {
                return this.f19228b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f19228b.reset();
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f19228b.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.f19228b.remaining());
            this.f19228b.get(bArr, i10, iMin);
            return iMin;
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeTo(j jVar) {
        jVar.a(this.f19227b.slice());
    }
}
