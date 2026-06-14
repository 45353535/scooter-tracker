package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z40 f114211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g80 f114212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f114213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g50 f114214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h70 f114215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p70 f114216f;

    public o70(z40 z40Var, g80 g80Var, ArrayList arrayList, g50 g50Var, h70 h70Var, p70 p70Var) {
        this.f114211a = z40Var;
        this.f114212b = g80Var;
        this.f114213c = arrayList;
        this.f114214d = g50Var;
        this.f114215e = h70Var;
        this.f114216f = p70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return Intrinsics.areEqual(this.f114211a, o70Var.f114211a) && Intrinsics.areEqual(this.f114212b, o70Var.f114212b) && Intrinsics.areEqual(this.f114213c, o70Var.f114213c) && Intrinsics.areEqual(this.f114214d, o70Var.f114214d) && Intrinsics.areEqual(this.f114215e, o70Var.f114215e) && Intrinsics.areEqual(this.f114216f, o70Var.f114216f);
    }

    public final int hashCode() {
        int iHashCode = (this.f114215e.hashCode() + ((this.f114214d.hashCode() + cb.a(this.f114213c, (this.f114212b.hashCode() + (this.f114211a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        p70 p70Var = this.f114216f;
        return iHashCode + (p70Var == null ? 0 : p70Var.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f114211a + ", sdkData=" + this.f114212b + ", mediationNetworksData=" + this.f114213c + ", consentsData=" + this.f114214d + ", debugErrorIndicatorData=" + this.f114215e + ", logsData=" + this.f114216f + ")";
    }
}
