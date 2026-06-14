package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p53 f116558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93 f116559b;

    public u72(p53 p53Var, e93 e93Var) {
        this.f116558a = p53Var;
        this.f116559b = e93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u72)) {
            return false;
        }
        u72 u72Var = (u72) obj;
        return Intrinsics.areEqual(this.f116558a, u72Var.f116558a) && Intrinsics.areEqual(this.f116559b, u72Var.f116559b);
    }

    public final int hashCode() {
        return this.f116559b.hashCode() + (this.f116558a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f116558a + ", validationResult=" + this.f116559b + ")";
    }
}
