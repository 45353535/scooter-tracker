package com.moloco.sdk.internal.services.bidtoken;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f55368c;

    public n(String bidToken, String publicKey, i bidTokenConfig) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        this.f55366a = bidToken;
        this.f55367b = publicKey;
        this.f55368c = bidTokenConfig;
    }

    public final String a() {
        return this.f55366a;
    }

    public final i b() {
        return this.f55368c;
    }

    public final String c() {
        return this.f55367b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f55366a, nVar.f55366a) && Intrinsics.areEqual(this.f55367b, nVar.f55367b) && Intrinsics.areEqual(this.f55368c, nVar.f55368c);
    }

    public int hashCode() {
        return (((this.f55366a.hashCode() * 31) + this.f55367b.hashCode()) * 31) + this.f55368c.hashCode();
    }

    public String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f55366a + ", publicKey=" + this.f55367b + ", bidTokenConfig=" + this.f55368c + ')';
    }
}
