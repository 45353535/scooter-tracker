package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class is2 implements js2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd f112117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl0 f112118b;

    public is2(pd pdVar, fl0 fl0Var) {
        this.f112117a = pdVar;
        this.f112118b = fl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is2)) {
            return false;
        }
        is2 is2Var = (is2) obj;
        return Intrinsics.areEqual(this.f112117a, is2Var.f112117a) && Intrinsics.areEqual(this.f112118b, is2Var.f112118b);
    }

    public final int hashCode() {
        return this.f112118b.hashCode() + (this.f112117a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.f112117a + ", environmentConfiguration=" + this.f112118b + ")";
    }
}
