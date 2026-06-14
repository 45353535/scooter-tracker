package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r8 extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9 f70977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f70981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1.e f70982i;

    public r8(String auctionId, List impressionIds, j9 engagementType, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(engagementType, "engagementType");
        this.f70975b = auctionId;
        this.f70976c = impressionIds;
        this.f70977d = engagementType;
        this.f70978e = str;
        this.f70979f = str2;
        this.f70980g = str3;
        this.f70981h = str4;
        this.f70982i = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ENGAGEMENT_TYPE", this.f70977d.g());
        Pair pair2 = TuplesKt.to("CB_ERROR", w8.a(this.f70978e, this.f70981h));
        String str = this.f70979f;
        if (str == null) {
            str = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f70980g;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return Intrinsics.areEqual(this.f70975b, r8Var.f70975b) && Intrinsics.areEqual(this.f70976c, r8Var.f70976c) && this.f70977d == r8Var.f70977d && Intrinsics.areEqual(this.f70978e, r8Var.f70978e) && Intrinsics.areEqual(this.f70979f, r8Var.f70979f) && Intrinsics.areEqual(this.f70980g, r8Var.f70980g) && Intrinsics.areEqual(this.f70981h, r8Var.f70981h) && Intrinsics.areEqual(this.f70982i, r8Var.f70982i);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f70982i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f70975b.hashCode() * 31) + this.f70976c.hashCode()) * 31) + this.f70977d.hashCode()) * 31;
        String str = this.f70978e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70979f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70980g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70981h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f70982i;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "EngagementEventPayload(auctionId=" + this.f70975b + ", impressionIds=" + this.f70976c + ", engagementType=" + this.f70977d + ", errorString=" + this.f70978e + ", errorCode=" + this.f70979f + ", errorConstant=" + this.f70980g + ", errorCauseDescription=" + this.f70981h + ", mediation=" + this.f70982i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8(String str, List list, j9 j9Var, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
        this(str, list, j9Var, str2, str3, str4, str6, eVar2);
    }
}
