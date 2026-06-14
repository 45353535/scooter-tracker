package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends AbstractHasher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f30713a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    AbstractByteHasher() {
    }

    private Hasher a(int i10) {
        try {
            e(this.f30713a.array(), 0, i10);
            return this;
        } finally {
            Java8Compatibility.a(this.f30713a);
        }
    }

    protected abstract void b(byte b10);

    protected void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            e(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            Java8Compatibility.d(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                b(byteBuffer.get());
            }
        }
    }

    protected void d(byte[] bArr) {
        e(bArr, 0, bArr.length);
    }

    protected void e(byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            b(bArr[i12]);
        }
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putByte(byte b10) {
        b(b10);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putChar(char c10) {
        this.f30713a.putChar(c10);
        return a(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putInt(int i10) {
        this.f30713a.putInt(i10);
        return a(4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putLong(long j10) {
        this.f30713a.putLong(j10);
        return a(8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putShort(short s10) {
        this.f30713a.putShort(s10);
        return a(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        d(bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        e(bArr, i10, i11);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public Hasher putBytes(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return this;
    }
}
