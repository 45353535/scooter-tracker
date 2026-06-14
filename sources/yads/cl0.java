package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cl0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cl0 f109440c = new cl0(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109442b;

    public cl0(int i10, String str) {
        this.f109441a = str;
        this.f109442b = i10;
    }

    public final String a() {
        return this.f109441a;
    }

    public final int b() {
        return this.f109442b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj;
        return Intrinsics.areEqual(this.f109441a, cl0Var.f109441a) && this.f109442b == cl0Var.f109442b;
    }

    public final int hashCode() {
        return this.f109442b + (this.f109441a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f109441a + ", version=" + this.f109442b + ")";
    }
}
