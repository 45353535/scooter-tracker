package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageDigest f30784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f30786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30787e;

    private static final class MessageDigestHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MessageDigest f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f30790d;

        private void f() {
            Preconditions.checkState(!this.f30790d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void b(byte b10) {
            f();
            this.f30788b.update(b10);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void c(ByteBuffer byteBuffer) {
            f();
            this.f30788b.update(byteBuffer);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        protected void e(byte[] bArr, int i10, int i11) {
            f();
            this.f30788b.update(bArr, i10, i11);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            f();
            this.f30790d = true;
            return this.f30789c == this.f30788b.getDigestLength() ? HashCode.c(this.f30788b.digest()) : HashCode.c(Arrays.copyOf(this.f30788b.digest(), this.f30789c));
        }

        private MessageDigestHasher(MessageDigest messageDigest, int i10) {
            this.f30788b = messageDigest;
            this.f30789c = i10;
        }
    }

    private static final class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f30793d;

        private Object readResolve() {
            return new MessageDigestHashFunction(this.f30791b, this.f30792c, this.f30793d);
        }

        private SerializedForm(String str, int i10, String str2) {
            this.f30791b = str;
            this.f30792c = i10;
            this.f30793d = str2;
        }
    }

    MessageDigestHashFunction(String str, String str2) {
        MessageDigest messageDigestA = a(str);
        this.f30784b = messageDigestA;
        this.f30785c = messageDigestA.getDigestLength();
        this.f30787e = (String) Preconditions.checkNotNull(str2);
        this.f30786d = b(messageDigestA);
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    private static boolean b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f30785c * 8;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f30786d) {
            try {
                return new MessageDigestHasher((MessageDigest) this.f30784b.clone(), this.f30785c);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(a(this.f30784b.getAlgorithm()), this.f30785c);
    }

    public String toString() {
        return this.f30787e;
    }

    Object writeReplace() {
        return new SerializedForm(this.f30784b.getAlgorithm(), this.f30785c, this.f30787e);
    }

    MessageDigestHashFunction(String str, int i10, String str2) {
        this.f30787e = (String) Preconditions.checkNotNull(str2);
        MessageDigest messageDigestA = a(str);
        this.f30784b = messageDigestA;
        int digestLength = messageDigestA.getDigestLength();
        Preconditions.checkArgument(i10 >= 4 && i10 <= digestLength, "bytes (%s) must be >= 4 and < %s", i10, digestLength);
        this.f30785c = i10;
        this.f30786d = b(messageDigestA);
    }
}
