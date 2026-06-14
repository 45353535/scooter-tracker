package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class we extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f71458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1.e f71463h;

    public we(String auctionId, List impressionIds, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f71457b = auctionId;
        this.f71458c = impressionIds;
        this.f71459d = str;
        this.f71460e = str2;
        this.f71461f = str3;
        this.f71462g = str4;
        this.f71463h = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ERROR", w8.a(this.f71459d, this.f71461f));
        String str = this.f71460e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f71462g;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return Intrinsics.areEqual(this.f71457b, weVar.f71457b) && Intrinsics.areEqual(this.f71458c, weVar.f71458c) && Intrinsics.areEqual(this.f71459d, weVar.f71459d) && Intrinsics.areEqual(this.f71460e, weVar.f71460e) && Intrinsics.areEqual(this.f71461f, weVar.f71461f) && Intrinsics.areEqual(this.f71462g, weVar.f71462g) && Intrinsics.areEqual(this.f71463h, weVar.f71463h);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f71463h;
    }

    public int hashCode() {
        int iHashCode = ((this.f71457b.hashCode() * 31) + this.f71458c.hashCode()) * 31;
        String str = this.f71459d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71460e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71461f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71462g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f71463h;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "ShowEventPayload(auctionId=" + this.f71457b + ", impressionIds=" + this.f71458c + ", errorString=" + this.f71459d + ", errorCode=" + this.f71460e + ", errorCauseDescription=" + this.f71461f + ", errorConstant=" + this.f71462g + ", mediation=" + this.f71463h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ we(String str, List list, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
