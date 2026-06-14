package f1;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x0 extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1.e f71477g;

    public x0(String str, String str2, String str3, String str4, String str5, b1.e eVar) {
        this.f71472b = str;
        this.f71473c = str2;
        this.f71474d = str3;
        this.f71475e = str4;
        this.f71476f = str5;
        this.f71477g = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ERROR", w8.a(this.f71473c, this.f71476f));
        String str = this.f71474d;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f71475e;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f71472b, x0Var.f71472b) && Intrinsics.areEqual(this.f71473c, x0Var.f71473c) && Intrinsics.areEqual(this.f71474d, x0Var.f71474d) && Intrinsics.areEqual(this.f71475e, x0Var.f71475e) && Intrinsics.areEqual(this.f71476f, x0Var.f71476f) && Intrinsics.areEqual(this.f71477g, x0Var.f71477g);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f71477g;
    }

    public int hashCode() {
        String str = this.f71472b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71473c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71474d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71475e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f71476f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        b1.e eVar = this.f71477g;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "StartEventPayload(auctionId=" + this.f71472b + ", errorString=" + this.f71473c + ", errorCode=" + this.f71474d + ", errorConstant=" + this.f71475e + ", errorCauseDescription=" + this.f71476f + ", mediation=" + this.f71477g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x0(String str, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        b1.e eVar2;
        String str6;
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        if ((i10 & 16) != 0) {
            eVar2 = eVar;
            str6 = null;
        } else {
            eVar2 = eVar;
            str6 = str5;
        }
        this(str, str2, str3, str4, str6, eVar2);
    }
}
