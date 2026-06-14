package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {

    private final class BufferingHasher extends AbstractHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ExposedByteArrayOutputStream f30717a;

        BufferingHasher(int i10) {
            this.f30717a = new ExposedByteArrayOutputStream(i10);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return AbstractNonStreamingHashFunction.this.hashBytes(this.f30717a.m(), 0, this.f30717a.n());
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b10) throws IOException {
            this.f30717a.write(b10);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i10, int i11) throws IOException {
            this.f30717a.write(bArr, i10, i11);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            this.f30717a.o(byteBuffer);
            return this;
        }
    }

    private static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        ExposedByteArrayOutputStream(int i10) {
            super(i10);
        }

        byte[] m() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int n() {
            return ((ByteArrayOutputStream) this).count;
        }

        void o(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i10 = ((ByteArrayOutputStream) this).count;
            int i11 = i10 + iRemaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i11 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i10 + iRemaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, iRemaining);
            ((ByteArrayOutputStream) this).count += iRemaining;
        }
    }

    AbstractNonStreamingHashFunction() {
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public abstract HashCode hashBytes(byte[] bArr, int i10, int i11);

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i10) {
        return hashBytes(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j10) {
        return hashBytes(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i10 = 0; i10 < length; i10++) {
            byteBufferOrder.putChar(charSequence.charAt(i10));
        }
        return hashBytes(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return newHasher(32);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public Hasher newHasher(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        return new BufferingHasher(i10);
    }
}
