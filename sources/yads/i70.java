package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z40 f111886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h80 f111887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o30 f111888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q40 f111889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g50 f111890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h70 f111891g;

    public i70(List list, z40 z40Var, h80 h80Var, o30 o30Var, q40 q40Var, g50 g50Var, h70 h70Var) {
        this.f111885a = list;
        this.f111886b = z40Var;
        this.f111887c = h80Var;
        this.f111888d = o30Var;
        this.f111889e = q40Var;
        this.f111890f = g50Var;
        this.f111891g = h70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return Intrinsics.areEqual(this.f111885a, i70Var.f111885a) && Intrinsics.areEqual(this.f111886b, i70Var.f111886b) && Intrinsics.areEqual(this.f111887c, i70Var.f111887c) && Intrinsics.areEqual(this.f111888d, i70Var.f111888d) && Intrinsics.areEqual(this.f111889e, i70Var.f111889e) && Intrinsics.areEqual(this.f111890f, i70Var.f111890f) && Intrinsics.areEqual(this.f111891g, i70Var.f111891g);
    }

    public final int hashCode() {
        return this.f111891g.hashCode() + ((this.f111890f.hashCode() + cb.a(this.f111889e.f114871a, (this.f111888d.hashCode() + ((this.f111887c.hashCode() + ((this.f111886b.hashCode() + (this.f111885a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f111885a + ", appData=" + this.f111886b + ", sdkIntegrationData=" + this.f111887c + ", adNetworkSettingsData=" + this.f111888d + ", adaptersData=" + this.f111889e + ", consentsData=" + this.f111890f + ", debugErrorIndicatorData=" + this.f111891g + ")";
    }
}
