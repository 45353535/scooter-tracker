package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u40 f116869c;

    public v40(String str, String str2, u40 u40Var) {
        this.f116867a = str;
        this.f116868b = str2;
        this.f116869c = u40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v40)) {
            return false;
        }
        v40 v40Var = (v40) obj;
        return Intrinsics.areEqual(this.f116867a, v40Var.f116867a) && Intrinsics.areEqual(this.f116868b, v40Var.f116868b) && this.f116869c == v40Var.f116869c;
    }

    public final int hashCode() {
        String str = this.f116867a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f116868b;
        return this.f116869c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f116867a + ", message=" + this.f116868b + ", type=" + this.f116869c + ")";
    }
}
