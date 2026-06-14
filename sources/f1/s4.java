package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s4 extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f71044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1.e f71050i;

    public s4(String auctionId, List impressionIds, boolean z10, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f71043b = auctionId;
        this.f71044c = impressionIds;
        this.f71045d = z10;
        this.f71046e = str;
        this.f71047f = str2;
        this.f71048g = str3;
        this.f71049h = str4;
        this.f71050i = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_REWARD_SKIPPED", String.valueOf(this.f71045d));
        Pair pair2 = TuplesKt.to("CB_ERROR", w8.a(this.f71046e, this.f71049h));
        String str = this.f71047f;
        if (str == null) {
            str = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f71048g;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return Intrinsics.areEqual(this.f71043b, s4Var.f71043b) && Intrinsics.areEqual(this.f71044c, s4Var.f71044c) && this.f71045d == s4Var.f71045d && Intrinsics.areEqual(this.f71046e, s4Var.f71046e) && Intrinsics.areEqual(this.f71047f, s4Var.f71047f) && Intrinsics.areEqual(this.f71048g, s4Var.f71048g) && Intrinsics.areEqual(this.f71049h, s4Var.f71049h) && Intrinsics.areEqual(this.f71050i, s4Var.f71050i);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f71050i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f71043b.hashCode() * 31) + this.f71044c.hashCode()) * 31) + androidx.compose.foundation.c.a(this.f71045d)) * 31;
        String str = this.f71046e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71047f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71048g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71049h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f71050i;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "RewardEventPayload(auctionId=" + this.f71043b + ", impressionIds=" + this.f71044c + ", rewardSkipped=" + this.f71045d + ", errorString=" + this.f71046e + ", errorCode=" + this.f71047f + ", errorConstant=" + this.f71048g + ", errorCauseDescription=" + this.f71049h + ", mediation=" + this.f71050i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s4(String str, List list, boolean z10, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        b1.e eVar2;
        String str6;
        str2 = (i10 & 8) != 0 ? null : str2;
        str3 = (i10 & 16) != 0 ? null : str3;
        str4 = (i10 & 32) != 0 ? null : str4;
        if ((i10 & 64) != 0) {
            eVar2 = eVar;
            str6 = null;
        } else {
            eVar2 = eVar;
            str6 = str5;
        }
        this(str, list, z10, str2, str3, str4, str6, eVar2);
    }
}
