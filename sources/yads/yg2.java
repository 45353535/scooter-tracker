package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class yg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f118180e;

    public yg2(String str, String str2, String str3, String str4, String str5) {
        this.f118176a = str;
        this.f118177b = str2;
        this.f118178c = str3;
        this.f118179d = str4;
        this.f118180e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg2)) {
            return false;
        }
        yg2 yg2Var = (yg2) obj;
        return w83.a(this.f118176a, yg2Var.f118176a) && w83.a(this.f118177b, yg2Var.f118177b) && w83.a(this.f118178c, yg2Var.f118178c) && w83.a(this.f118179d, yg2Var.f118179d) && w83.a(this.f118180e, yg2Var.f118180e);
    }

    public final int hashCode() {
        String str = this.f118176a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f118177b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f118178c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f118179d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f118180e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
