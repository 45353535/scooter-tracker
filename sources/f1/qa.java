package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qa extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1.e f70843h;

    public qa(String auctionId, List impressionIds, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f70837b = auctionId;
        this.f70838c = impressionIds;
        this.f70839d = str;
        this.f70840e = str2;
        this.f70841f = str3;
        this.f70842g = str4;
        this.f70843h = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ERROR", w8.a(this.f70839d, this.f70842g));
        String str = this.f70840e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f70841f;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return Intrinsics.areEqual(this.f70837b, qaVar.f70837b) && Intrinsics.areEqual(this.f70838c, qaVar.f70838c) && Intrinsics.areEqual(this.f70839d, qaVar.f70839d) && Intrinsics.areEqual(this.f70840e, qaVar.f70840e) && Intrinsics.areEqual(this.f70841f, qaVar.f70841f) && Intrinsics.areEqual(this.f70842g, qaVar.f70842g) && Intrinsics.areEqual(this.f70843h, qaVar.f70843h);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f70843h;
    }

    public int hashCode() {
        int iHashCode = ((this.f70837b.hashCode() * 31) + this.f70838c.hashCode()) * 31;
        String str = this.f70839d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70840e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70841f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70842g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f70843h;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "ExpirationEventPayload(auctionId=" + this.f70837b + ", impressionIds=" + this.f70838c + ", errorString=" + this.f70839d + ", errorCode=" + this.f70840e + ", errorConstant=" + this.f70841f + ", errorCauseDescription=" + this.f70842g + ", mediation=" + this.f70843h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qa(String str, List list, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
