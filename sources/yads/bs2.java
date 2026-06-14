package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bs2 implements cs2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hr2 f109089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy f109090b;

    public bs2(hr2 hr2Var, jy jyVar) {
        this.f109089a = hr2Var;
        this.f109090b = jyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs2)) {
            return false;
        }
        bs2 bs2Var = (bs2) obj;
        return Intrinsics.areEqual(this.f109089a, bs2Var.f109089a) && this.f109090b == bs2Var.f109090b;
    }

    public final int hashCode() {
        return this.f109090b.hashCode() + (this.f109089a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.f109089a + ", configurationSource=" + this.f109090b + ")";
    }
}
