package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109938b;

    public dj3(int i10, String str) {
        this.f109937a = i10;
        this.f109938b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj3)) {
            return false;
        }
        dj3 dj3Var = (dj3) obj;
        return this.f109937a == dj3Var.f109937a && Intrinsics.areEqual(this.f109938b, dj3Var.f109938b);
    }

    public final int hashCode() {
        int i10 = this.f109937a * 31;
        String str = this.f109938b;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.f109937a + ", description=" + this.f109938b + ")";
    }
}
