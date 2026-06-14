package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f114575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f114576b;

    public p70(List list, List list2) {
        this.f114575a = list;
        this.f114576b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p70)) {
            return false;
        }
        p70 p70Var = (p70) obj;
        return Intrinsics.areEqual(this.f114575a, p70Var.f114575a) && Intrinsics.areEqual(this.f114576b, p70Var.f114576b);
    }

    public final int hashCode() {
        return this.f114576b.hashCode() + (this.f114575a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f114575a + ", networkLogs=" + this.f114576b + ")";
    }
}
