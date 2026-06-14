package io.bidmachine.analytics.internal.b;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f79525a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f79526b = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return c.f79525a.a();
        }
    }

    private c() {
    }

    private final SecureRandom b() {
        SecureRandom secureRandom = (SecureRandom) f79526b.get();
        return secureRandom == null ? a() : secureRandom;
    }

    public final byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f79525a.b().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
