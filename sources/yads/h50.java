package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z40 f111478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g80 f111479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o30 f111480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q40 f111481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g50 f111482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h70 f111483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f111484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f111485h;

    public h50(z40 z40Var, g80 g80Var, o30 o30Var, q40 q40Var, g50 g50Var, h70 h70Var, List list, List list2) {
        this.f111478a = z40Var;
        this.f111479b = g80Var;
        this.f111480c = o30Var;
        this.f111481d = q40Var;
        this.f111482e = g50Var;
        this.f111483f = h70Var;
        this.f111484g = list;
        this.f111485h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return Intrinsics.areEqual(this.f111478a, h50Var.f111478a) && Intrinsics.areEqual(this.f111479b, h50Var.f111479b) && Intrinsics.areEqual(this.f111480c, h50Var.f111480c) && Intrinsics.areEqual(this.f111481d, h50Var.f111481d) && Intrinsics.areEqual(this.f111482e, h50Var.f111482e) && Intrinsics.areEqual(this.f111483f, h50Var.f111483f) && Intrinsics.areEqual(this.f111484g, h50Var.f111484g) && Intrinsics.areEqual(this.f111485h, h50Var.f111485h);
    }

    public final int hashCode() {
        return this.f111485h.hashCode() + cb.a(this.f111484g, (this.f111483f.hashCode() + ((this.f111482e.hashCode() + cb.a(this.f111481d.f114871a, (this.f111480c.hashCode() + ((this.f111479b.hashCode() + (this.f111478a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelData(appData=" + this.f111478a + ", sdkData=" + this.f111479b + ", networkSettingsData=" + this.f111480c + ", adaptersData=" + this.f111481d + ", consentsData=" + this.f111482e + ", debugErrorIndicatorData=" + this.f111483f + ", adUnits=" + this.f111484g + ", alerts=" + this.f111485h + ")";
    }
}
