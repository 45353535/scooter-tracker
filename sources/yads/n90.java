package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n90 extends o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(boolean z10) {
        super(0);
        m90 m90Var = m90.f113351b;
        this.f113761a = z10;
    }

    @Override // yads.o90
    public final boolean a(Object obj) {
        if (!(obj instanceof n90)) {
            return false;
        }
        ((n90) obj).getClass();
        if (!Intrinsics.areEqual("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        m90 m90Var = m90.f113351b;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        n90Var.getClass();
        if (!Intrinsics.areEqual("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        m90 m90Var = m90.f113351b;
        return this.f113761a == n90Var.f113761a;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.f113761a) + ((m90.f113351b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + m90.f113351b + ", initialState=" + this.f113761a + ")";
    }
}
