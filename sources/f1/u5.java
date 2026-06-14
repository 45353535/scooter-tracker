package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5 extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f71234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1.e f71239h;

    public u5(String auctionId, List impressionIds, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f71233b = auctionId;
        this.f71234c = impressionIds;
        this.f71235d = str;
        this.f71236e = str2;
        this.f71237f = str3;
        this.f71238g = str4;
        this.f71239h = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ERROR", w8.a(this.f71235d, this.f71238g));
        String str = this.f71236e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f71237f;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Intrinsics.areEqual(this.f71233b, u5Var.f71233b) && Intrinsics.areEqual(this.f71234c, u5Var.f71234c) && Intrinsics.areEqual(this.f71235d, u5Var.f71235d) && Intrinsics.areEqual(this.f71236e, u5Var.f71236e) && Intrinsics.areEqual(this.f71237f, u5Var.f71237f) && Intrinsics.areEqual(this.f71238g, u5Var.f71238g) && Intrinsics.areEqual(this.f71239h, u5Var.f71239h);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f71239h;
    }

    public int hashCode() {
        int iHashCode = ((this.f71233b.hashCode() * 31) + this.f71234c.hashCode()) * 31;
        String str = this.f71235d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71236e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71237f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71238g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f71239h;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "CloseEventPayload(auctionId=" + this.f71233b + ", impressionIds=" + this.f71234c + ", errorString=" + this.f71235d + ", errorCode=" + this.f71236e + ", errorConstant=" + this.f71237f + ", errorCauseDescription=" + this.f71238g + ", mediation=" + this.f71239h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u5(String str, List list, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        b1.e eVar2;
        String str6;
        str2 = (i10 & 4) != 0 ? null : str2;
        str3 = (i10 & 8) != 0 ? null : str3;
        str4 = (i10 & 16) != 0 ? null : str4;
        if ((i10 & 32) != 0) {
            eVar2 = eVar;
            str6 = null;
        } else {
            eVar2 = eVar;
            str6 = str5;
        }
        this(str, list, str2, str3, str4, str6, eVar2);
    }
}
