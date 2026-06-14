package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80 f112262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112263b;

    public j80(i80 i80Var, List list) {
        this.f112262a = i80Var;
        this.f112263b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return this.f112262a == j80Var.f112262a && Intrinsics.areEqual(this.f112263b, j80Var.f112263b);
    }

    public final int hashCode() {
        int iHashCode = this.f112262a.hashCode() * 31;
        List list = this.f112263b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f112262a + ", messages=" + this.f112263b + ")";
    }
}
