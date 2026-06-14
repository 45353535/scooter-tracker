package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class MacHashFunction extends AbstractHashFunction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Mac f30777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f30778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f30781f;

    private static final class MacHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Mac f30782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f30783c;

        private void f() {
            Preconditions.checkState(!this.f30783c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void b(byte b10) {
            f();
            this.f30782b.update(b10);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void c(ByteBuffer byteBuffer) {
            f();
            Preconditions.checkNotNull(byteBuffer);
            this.f30782b.update(byteBuffer);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void d(byte[] bArr) {
            f();
            this.f30782b.update(bArr);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void e(byte[] bArr, int i10, int i11) {
            f();
            this.f30782b.update(bArr, i10, i11);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            f();
            this.f30783c = true;
            return HashCode.c(this.f30782b.doFinal());
        }

        private MacHasher(Mac mac) {
            this.f30782b = mac;
        }
    }

    MacHashFunction(String str, Key key, String str2) {
        Mac macA = a(str, key);
        this.f30777b = macA;
        this.f30778c = (Key) Preconditions.checkNotNull(key);
        this.f30779d = (String) Preconditions.checkNotNull(str2);
        this.f30780e = macA.getMacLength() * 8;
        this.f30781f = b(macA);
    }

    private static Mac a(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static boolean b(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f30780e;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f30781f) {
            try {
                return new MacHasher((Mac) this.f30777b.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MacHasher(a(this.f30777b.getAlgorithm(), this.f30778c));
    }

    public String toString() {
        return this.f30779d;
    }
}
