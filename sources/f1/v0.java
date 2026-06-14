package f1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f71319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f71321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f71322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f71323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f71327i;

    public v0(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f71319a = num;
        this.f71320b = list;
        this.f71321c = num2;
        this.f71322d = num3;
        this.f71323e = jSONObject;
        this.f71324f = str;
        this.f71325g = str2;
        this.f71326h = str3;
        this.f71327i = str4;
    }

    public final String a() {
        return this.f71327i;
    }

    public final String b() {
        return this.f71326h;
    }

    public final Integer c() {
        return this.f71319a;
    }

    public final Integer d() {
        return this.f71322d;
    }

    public final Integer e() {
        return this.f71321c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.areEqual(this.f71319a, v0Var.f71319a) && Intrinsics.areEqual(this.f71320b, v0Var.f71320b) && Intrinsics.areEqual(this.f71321c, v0Var.f71321c) && Intrinsics.areEqual(this.f71322d, v0Var.f71322d) && Intrinsics.areEqual(this.f71323e, v0Var.f71323e) && Intrinsics.areEqual(this.f71324f, v0Var.f71324f) && Intrinsics.areEqual(this.f71325g, v0Var.f71325g) && Intrinsics.areEqual(this.f71326h, v0Var.f71326h) && Intrinsics.areEqual(this.f71327i, v0Var.f71327i);
    }

    public final String f() {
        return this.f71324f;
    }

    public final JSONObject g() {
        return this.f71323e;
    }

    public final String h() {
        return this.f71325g;
    }

    public int hashCode() {
        Integer num = this.f71319a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f71320b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f71321c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f71322d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.f71323e;
        int iHashCode5 = (iHashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f71324f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71325g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71326h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71327i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final List i() {
        return this.f71320b;
    }

    public String toString() {
        return "PrivacyBodyFields(openRtbConsent=" + this.f71319a + ", whitelistedPrivacyStandardsList=" + this.f71320b + ", openRtbGdpr=" + this.f71321c + ", openRtbCoppa=" + this.f71322d + ", privacyListAsJson=" + this.f71323e + ", piDataUseConsent=" + this.f71324f + ", tcfString=" + this.f71325g + ", gppString=" + this.f71326h + ", gppSid=" + this.f71327i + ")";
    }
}
