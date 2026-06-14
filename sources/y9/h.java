package y9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f108449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f108450e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f108446a = str;
        this.f108447b = str2;
        this.f108448c = str3;
        this.f108449d = str4;
        this.f108450e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f108446a, hVar.f108446a) && Objects.equals(this.f108447b, hVar.f108447b) && Objects.equals(this.f108448c, hVar.f108448c) && Objects.equals(this.f108449d, hVar.f108449d) && Objects.equals(this.f108450e, hVar.f108450e);
    }

    public int hashCode() {
        String str = this.f108446a;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108447b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f108448c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f108449d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f108450e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
