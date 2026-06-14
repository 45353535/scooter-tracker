package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class h40 {

    @NotNull
    public static final g40 Companion = new g40();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KSerializer[] f111470g = {null, null, new yg.f(y90.f118118a), null, null, new yg.f(s90.f115721a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f111473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f111474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x90 f111475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f111476f;

    public /* synthetic */ h40(int i10, String str, String str2, List list, String str3, x90 x90Var, List list2) {
        if (54 != (i10 & 54)) {
            yg.e2.a(i10, 54, f40.f110596a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f111471a = null;
        } else {
            this.f111471a = str;
        }
        this.f111472b = str2;
        this.f111473c = list;
        if ((i10 & 8) == 0) {
            this.f111474d = null;
        } else {
            this.f111474d = str3;
        }
        this.f111475e = x90Var;
        this.f111476f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return Intrinsics.areEqual(this.f111471a, h40Var.f111471a) && Intrinsics.areEqual(this.f111472b, h40Var.f111472b) && Intrinsics.areEqual(this.f111473c, h40Var.f111473c) && Intrinsics.areEqual(this.f111474d, h40Var.f111474d) && Intrinsics.areEqual(this.f111475e, h40Var.f111475e) && Intrinsics.areEqual(this.f111476f, h40Var.f111476f);
    }

    public final int hashCode() {
        String str = this.f111471a;
        int iA = cb.a(this.f111473c, j4.a(this.f111472b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f111474d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        x90 x90Var = this.f111475e;
        return this.f111476f.hashCode() + ((iHashCode + (x90Var != null ? x90Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitWaterfallMediation(adapter=" + this.f111471a + ", networkName=" + this.f111472b + ", waterfallParameters=" + this.f111473c + ", networkAdUnitIdName=" + this.f111474d + ", currency=" + this.f111475e + ", cpmFloors=" + this.f111476f + ")";
    }
}
