package f1;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ra extends o0 implements e8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1.e f70989h;

    public ra(String auctionId, List impressionIds, String str, String str2, String str3, String str4, b1.e eVar) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f70983b = auctionId;
        this.f70984c = impressionIds;
        this.f70985d = str;
        this.f70986e = str2;
        this.f70987f = str3;
        this.f70988g = str4;
        this.f70989h = eVar;
    }

    @Override // f1.t4
    public Map b() {
        Pair pair = TuplesKt.to("CB_ERROR", w8.a(this.f70985d, this.f70988g));
        String str = this.f70986e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f70987f;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), w8.b(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return Intrinsics.areEqual(this.f70983b, raVar.f70983b) && Intrinsics.areEqual(this.f70984c, raVar.f70984c) && Intrinsics.areEqual(this.f70985d, raVar.f70985d) && Intrinsics.areEqual(this.f70986e, raVar.f70986e) && Intrinsics.areEqual(this.f70987f, raVar.f70987f) && Intrinsics.areEqual(this.f70988g, raVar.f70988g) && Intrinsics.areEqual(this.f70989h, raVar.f70989h);
    }

    @Override // f1.e8
    public b1.e getMediation() {
        return this.f70989h;
    }

    public int hashCode() {
        int iHashCode = ((this.f70983b.hashCode() * 31) + this.f70984c.hashCode()) * 31;
        String str = this.f70985d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70986e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70987f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f70988g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b1.e eVar = this.f70989h;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionEventPayload(auctionId=" + this.f70983b + ", impressionIds=" + this.f70984c + ", errorString=" + this.f70985d + ", errorCode=" + this.f70986e + ", errorConstant=" + this.f70987f + ", errorCauseDescription=" + this.f70988g + ", mediation=" + this.f70989h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ra(String str, List list, String str2, String str3, String str4, String str5, b1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
