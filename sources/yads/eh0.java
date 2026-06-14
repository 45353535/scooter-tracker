package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh0 f110373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110374b;

    public eh0(fh0 fh0Var, String str) {
        this.f110373a = fh0Var;
        this.f110374b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        return this.f110373a == eh0Var.f110373a && Intrinsics.areEqual(this.f110374b, eh0Var.f110374b);
    }

    public final int hashCode() {
        return this.f110374b.hashCode() + (this.f110373a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f110373a + ", assetName=" + this.f110374b + ")";
    }
}
