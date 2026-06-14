package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y80 implements z80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118110a;

    public y80(String str) {
        this.f118110a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj;
        y80Var.getClass();
        return Intrinsics.areEqual("Warning", "Warning") && Intrinsics.areEqual(this.f118110a, y80Var.f118110a);
    }

    public final int hashCode() {
        return this.f118110a.hashCode() + 562735108;
    }

    public final String toString() {
        return "Warning(title=Warning, message=" + this.f118110a + ")";
    }
}
