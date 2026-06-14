package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableSupplier f30733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30735d;

    private final class ChecksumHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Checksum f30736b;

        @Override // com.google.common.hash.AbstractByteHasher
        protected void b(byte b10) {
            this.f30736b.update(b10);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void e(byte[] bArr, int i10, int i11) {
            this.f30736b.update(bArr, i10, i11);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.f30736b.getValue();
            return ChecksumHashFunction.this.f30734c == 32 ? HashCode.fromInt((int) value) : HashCode.fromLong(value);
        }

        private ChecksumHasher(Checksum checksum) {
            this.f30736b = (Checksum) Preconditions.checkNotNull(checksum);
        }
    }

    ChecksumHashFunction(ImmutableSupplier immutableSupplier, int i10, String str) {
        this.f30733b = (ImmutableSupplier) Preconditions.checkNotNull(immutableSupplier);
        Preconditions.checkArgument(i10 == 32 || i10 == 64, "bits (%s) must be either 32 or 64", i10);
        this.f30734c = i10;
        this.f30735d = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f30734c;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new ChecksumHasher((Checksum) this.f30733b.get());
    }

    public String toString() {
        return this.f30735d;
    }
}
