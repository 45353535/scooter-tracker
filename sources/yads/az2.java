package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class az2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f108870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vl f108871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sy2 f108872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f108873g;

    public az2(String str, String str2, String str3, String str4, vl vlVar, sy2 sy2Var, ArrayList arrayList) {
        this.f108867a = str;
        this.f108868b = str2;
        this.f108869c = str3;
        this.f108870d = str4;
        this.f108871e = vlVar;
        this.f108872f = sy2Var;
        this.f108873g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        return Intrinsics.areEqual(this.f108867a, az2Var.f108867a) && Intrinsics.areEqual(this.f108868b, az2Var.f108868b) && Intrinsics.areEqual(this.f108869c, az2Var.f108869c) && Intrinsics.areEqual(this.f108870d, az2Var.f108870d) && Intrinsics.areEqual(this.f108871e, az2Var.f108871e) && Intrinsics.areEqual(this.f108872f, az2Var.f108872f) && Intrinsics.areEqual(this.f108873g, az2Var.f108873g);
    }

    public final int hashCode() {
        String str = this.f108867a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f108868b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f108869c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f108870d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        vl vlVar = this.f108871e;
        int iHashCode5 = (iHashCode4 + (vlVar == null ? 0 : vlVar.hashCode())) * 31;
        sy2 sy2Var = this.f108872f;
        int iHashCode6 = (iHashCode5 + (sy2Var == null ? 0 : sy2Var.hashCode())) * 31;
        List list = this.f108873g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f108867a + ", colorWizButtonText=" + this.f108868b + ", colorWizBack=" + this.f108869c + ", colorWizBackRight=" + this.f108870d + ", backgroundColors=" + this.f108871e + ", smartCenter=" + this.f108872f + ", smartCenters=" + this.f108873g + ")";
    }
}
