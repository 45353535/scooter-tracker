package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f30719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30721c;

    protected AbstractStreamingHasher(int i10) {
        this(i10, i10);
    }

    private void b() {
        Java8Compatibility.b(this.f30719a);
        while (this.f30719a.remaining() >= this.f30721c) {
            d(this.f30719a);
        }
        this.f30719a.compact();
    }

    private void c() {
        if (this.f30719a.remaining() < 8) {
            b();
        }
    }

    private Hasher f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f30719a.remaining()) {
            this.f30719a.put(byteBuffer);
            c();
            return this;
        }
        int iPosition = this.f30720b - this.f30719a.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            this.f30719a.put(byteBuffer.get());
        }
        b();
        while (byteBuffer.remaining() >= this.f30721c) {
            d(byteBuffer);
        }
        this.f30719a.put(byteBuffer);
        return this;
    }

    protected abstract HashCode a();

    protected abstract void d(ByteBuffer byteBuffer);

    protected void e(ByteBuffer byteBuffer) {
        Java8Compatibility.d(byteBuffer, byteBuffer.limit());
        Java8Compatibility.c(byteBuffer, this.f30721c + 7);
        while (true) {
            int iPosition = byteBuffer.position();
            int i10 = this.f30721c;
            if (iPosition >= i10) {
                Java8Compatibility.c(byteBuffer, i10);
                Java8Compatibility.b(byteBuffer);
                d(byteBuffer);
                return;
            }
            byteBuffer.putLong(0L);
        }
    }

    @Override // com.google.common.hash.Hasher
    public final HashCode hash() {
        b();
        Java8Compatibility.b(this.f30719a);
        if (this.f30719a.remaining() > 0) {
            e(this.f30719a);
            ByteBuffer byteBuffer = this.f30719a;
            Java8Compatibility.d(byteBuffer, byteBuffer.limit());
        }
        return a();
    }

    protected AbstractStreamingHasher(int i10, int i11) {
        Preconditions.checkArgument(i11 % i10 == 0);
        this.f30719a = ByteBuffer.allocate(i11 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f30720b = i11;
        this.f30721c = i10;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putByte(byte b10) {
        this.f30719a.put(b10);
        c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putChar(char c10) {
        this.f30719a.putChar(c10);
        c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putInt(int i10) {
        this.f30719a.putInt(i10);
        c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putLong(long j10) {
        this.f30719a.putLong(j10);
        c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putShort(short s10) {
        this.f30719a.putShort(s10);
        c();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putBytes(byte[] bArr, int i10, int i11) {
        return f(ByteBuffer.wrap(bArr, i10, i11).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    @CanIgnoreReturnValue
    public final Hasher putBytes(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return f(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }
}
