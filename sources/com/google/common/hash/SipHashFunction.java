package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final HashFunction f30810f = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30814e;

    private static final class SipHasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f30815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f30816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f30817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f30818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f30819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f30820i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f30821j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f30822k;

        SipHasher(int i10, int i11, long j10, long j11) {
            super(8);
            this.f30821j = 0L;
            this.f30822k = 0L;
            this.f30815d = i10;
            this.f30816e = i11;
            this.f30817f = 8317987319222330741L ^ j10;
            this.f30818g = 7237128888997146477L ^ j11;
            this.f30819h = 7816392313619706465L ^ j10;
            this.f30820i = 8387220255154660723L ^ j11;
        }

        private void g(long j10) {
            this.f30820i ^= j10;
            h(this.f30815d);
            this.f30817f = j10 ^ this.f30817f;
        }

        private void h(int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                long j10 = this.f30817f;
                long j11 = this.f30818g;
                this.f30817f = j10 + j11;
                this.f30819h += this.f30820i;
                this.f30818g = Long.rotateLeft(j11, 13);
                long jRotateLeft = Long.rotateLeft(this.f30820i, 16);
                long j12 = this.f30818g;
                long j13 = this.f30817f;
                this.f30818g = j12 ^ j13;
                this.f30820i = jRotateLeft ^ this.f30819h;
                long jRotateLeft2 = Long.rotateLeft(j13, 32);
                long j14 = this.f30819h;
                long j15 = this.f30818g;
                this.f30819h = j14 + j15;
                this.f30817f = jRotateLeft2 + this.f30820i;
                this.f30818g = Long.rotateLeft(j15, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f30820i, 21);
                long j16 = this.f30818g;
                long j17 = this.f30819h;
                this.f30818g = j16 ^ j17;
                this.f30820i = jRotateLeft3 ^ this.f30817f;
                this.f30819h = Long.rotateLeft(j17, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode a() {
            long j10 = this.f30822k ^ (this.f30821j << 56);
            this.f30822k = j10;
            g(j10);
            this.f30819h ^= 255;
            h(this.f30816e);
            return HashCode.fromLong(((this.f30817f ^ this.f30818g) ^ this.f30819h) ^ this.f30820i);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void d(ByteBuffer byteBuffer) {
            this.f30821j += 8;
            g(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void e(ByteBuffer byteBuffer) {
            this.f30821j += (long) byteBuffer.remaining();
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f30822k ^= (((long) byteBuffer.get()) & 255) << i10;
                i10 += 8;
            }
        }
    }

    SipHashFunction(int i10, int i11, long j10, long j11) {
        Preconditions.checkArgument(i10 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i10);
        Preconditions.checkArgument(i11 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i11);
        this.f30811b = i10;
        this.f30812c = i11;
        this.f30813d = j10;
        this.f30814e = j11;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f30811b == sipHashFunction.f30811b && this.f30812c == sipHashFunction.f30812c && this.f30813d == sipHashFunction.f30813d && this.f30814e == sipHashFunction.f30814e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f30811b) ^ this.f30812c)) ^ this.f30813d) ^ this.f30814e);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f30811b, this.f30812c, this.f30813d, this.f30814e);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f30811b + "" + this.f30812c + "(" + this.f30813d + ", " + this.f30814e + ")";
    }
}
