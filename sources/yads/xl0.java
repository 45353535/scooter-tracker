package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl0 f117862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117863b;

    public xl0(yl0 yl0Var, String str) {
        this.f117862a = yl0Var;
        this.f117863b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        return this.f117862a == xl0Var.f117862a && Intrinsics.areEqual(this.f117863b, xl0Var.f117863b);
    }

    public final int hashCode() {
        return this.f117863b.hashCode() + (this.f117862a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f117862a + ", value=" + this.f117863b + ")";
    }
}
