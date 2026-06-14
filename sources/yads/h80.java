package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j80 f111512b;

    public h80(String str, j80 j80Var) {
        this.f111511a = str;
        this.f111512b = j80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return Intrinsics.areEqual(this.f111511a, h80Var.f111511a) && Intrinsics.areEqual(this.f111512b, h80Var.f111512b);
    }

    public final int hashCode() {
        return this.f111512b.hashCode() + (this.f111511a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f111511a + ", sdkIntegrationStatusData=" + this.f111512b + ")";
    }
}
