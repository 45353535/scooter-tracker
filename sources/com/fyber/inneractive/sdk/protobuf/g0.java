package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23476b;

    public g0(int i10, Object obj) {
        this.f23475a = obj;
        this.f23476b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f23475a == g0Var.f23475a && this.f23476b == g0Var.f23476b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f23475a) * 65535) + this.f23476b;
    }
}
