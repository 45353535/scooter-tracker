package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00 f108507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108508b;

    public a10(z00 z00Var, String str) {
        this.f108507a = z00Var;
        this.f108508b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return this.f108507a == a10Var.f108507a && Intrinsics.areEqual(this.f108508b, a10Var.f108508b);
    }

    public final int hashCode() {
        int iHashCode = this.f108507a.hashCode() * 31;
        String str = this.f108508b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f108507a + ", text=" + this.f108508b + ")";
    }
}
