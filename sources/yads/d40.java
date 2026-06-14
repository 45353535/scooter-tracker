package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f109750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f109751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c40 f109752f;

    public d40(String str, String str2, ArrayList arrayList, String str3, String str4, c40 c40Var) {
        this.f109747a = str;
        this.f109748b = str2;
        this.f109749c = arrayList;
        this.f109750d = str3;
        this.f109751e = str4;
        this.f109752f = c40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d40)) {
            return false;
        }
        d40 d40Var = (d40) obj;
        return Intrinsics.areEqual(this.f109747a, d40Var.f109747a) && Intrinsics.areEqual(this.f109748b, d40Var.f109748b) && Intrinsics.areEqual(this.f109749c, d40Var.f109749c) && Intrinsics.areEqual(this.f109750d, d40Var.f109750d) && Intrinsics.areEqual(this.f109751e, d40Var.f109751e) && Intrinsics.areEqual(this.f109752f, d40Var.f109752f);
    }

    public final int hashCode() {
        String str = this.f109747a;
        int iA = cb.a(this.f109749c, j4.a(this.f109748b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f109750d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f109751e;
        return this.f109752f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.f109747a + ", adapterName=" + this.f109748b + ", parameters=" + this.f109749c + ", adUnitId=" + this.f109750d + ", networkAdUnitIdName=" + this.f109751e + ", type=" + this.f109752f + ")";
    }
}
