package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes7.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23873b;

    public h1(int i10, int i11) {
        this.f23872a = i10;
        this.f23873b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f23872a == h1Var.f23872a && this.f23873b == h1Var.f23873b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23872a * 31) + this.f23873b;
    }
}
