package f1;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa f69892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f69893b;

    public g5(sa adFormat, Map extras) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f69892a = adFormat;
        this.f69893b = extras;
    }

    public final sa a() {
        return this.f69892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return this.f69892a == g5Var.f69892a && Intrinsics.areEqual(this.f69893b, g5Var.f69893b);
    }

    public int hashCode() {
        return (this.f69892a.hashCode() * 31) + this.f69893b.hashCode();
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.f69892a + ", extras=" + this.f69893b + ")";
    }

    public /* synthetic */ g5(sa saVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(saVar, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
