package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f114189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f114190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f114191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f114192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n40 f114193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f114194h;

    public o40(String str, String str2, boolean z10, String str3, String str4, String str5, n40 n40Var, ArrayList arrayList) {
        this.f114187a = str;
        this.f114188b = str2;
        this.f114189c = z10;
        this.f114190d = str3;
        this.f114191e = str4;
        this.f114192f = str5;
        this.f114193g = n40Var;
        this.f114194h = arrayList;
    }

    public final n40 a() {
        return this.f114193g;
    }

    public final String b() {
        return this.f114190d;
    }

    public final String c() {
        return this.f114191e;
    }

    public final String d() {
        return this.f114188b;
    }

    public final String e() {
        return this.f114187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return Intrinsics.areEqual(this.f114187a, o40Var.f114187a) && Intrinsics.areEqual(this.f114188b, o40Var.f114188b) && this.f114189c == o40Var.f114189c && Intrinsics.areEqual(this.f114190d, o40Var.f114190d) && Intrinsics.areEqual(this.f114191e, o40Var.f114191e) && Intrinsics.areEqual(this.f114192f, o40Var.f114192f) && Intrinsics.areEqual(this.f114193g, o40Var.f114193g) && Intrinsics.areEqual(this.f114194h, o40Var.f114194h);
    }

    public final String f() {
        return this.f114192f;
    }

    public final int hashCode() {
        int iHashCode = this.f114187a.hashCode() * 31;
        String str = this.f114188b;
        int iA = (androidx.compose.foundation.c.a(this.f114189c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f114190d;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f114191e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f114192f;
        int iHashCode4 = (this.f114193g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.f114194h;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f114187a + ", logoUrl=" + this.f114188b + ", adapterIntegrationStatus=" + this.f114189c + ", adapterVersion=" + this.f114190d + ", latestAdapterVersion=" + this.f114191e + ", sdkVersion=" + this.f114192f + ", adapterStatus=" + this.f114193g + ", formats=" + this.f114194h + ")";
    }
}
