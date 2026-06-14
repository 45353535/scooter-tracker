package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class z70 {

    @NotNull
    public static final y70 Companion = new y70();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f118583g = {null, null, new yg.f(ip1.f112075a), null, new yg.f(jt1.f112455a), new yg.f(rs1.f115564a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z40 f118584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g80 f118585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f118586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g50 f118587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f118588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f118589f;

    public /* synthetic */ z70(int i10, z40 z40Var, g80 g80Var, List list, g50 g50Var, List list2, List list3) {
        if (63 != (i10 & 63)) {
            yg.e2.a(i10, 63, x70.f117731a.getDescriptor());
        }
        this.f118584a = z40Var;
        this.f118585b = g80Var;
        this.f118586c = list;
        this.f118587d = g50Var;
        this.f118588e = list2;
        this.f118589f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        return Intrinsics.areEqual(this.f118584a, z70Var.f118584a) && Intrinsics.areEqual(this.f118585b, z70Var.f118585b) && Intrinsics.areEqual(this.f118586c, z70Var.f118586c) && Intrinsics.areEqual(this.f118587d, z70Var.f118587d) && Intrinsics.areEqual(this.f118588e, z70Var.f118588e) && Intrinsics.areEqual(this.f118589f, z70Var.f118589f);
    }

    public final int hashCode() {
        return this.f118589f.hashCode() + cb.a(this.f118588e, (this.f118587d.hashCode() + cb.a(this.f118586c, (this.f118585b.hashCode() + (this.f118584a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelReportData(appData=" + this.f118584a + ", sdkData=" + this.f118585b + ", networksData=" + this.f118586c + ", consentsData=" + this.f118587d + ", sdkLogs=" + this.f118588e + ", networkLogs=" + this.f118589f + ")";
    }

    public z70(z40 z40Var, g80 g80Var, List list, g50 g50Var, List list2, List list3) {
        this.f118584a = z40Var;
        this.f118585b = g80Var;
        this.f118586c = list;
        this.f118587d = g50Var;
        this.f118588e = list2;
        this.f118589f = list3;
    }
}
