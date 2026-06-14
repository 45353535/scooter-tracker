package u9;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f105291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f105292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105294e;

    public c(String str, io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2, int i10, int i11) {
        q9.a.a(i10 == 0 || i11 == 0);
        this.f105290a = q9.a.d(str);
        this.f105291b = (io.bidmachine.media3.common.a) q9.a.e(aVar);
        this.f105292c = (io.bidmachine.media3.common.a) q9.a.e(aVar2);
        this.f105293d = i10;
        this.f105294e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f105293d == cVar.f105293d && this.f105294e == cVar.f105294e && this.f105290a.equals(cVar.f105290a) && this.f105291b.equals(cVar.f105291b) && this.f105292c.equals(cVar.f105292c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f105293d) * 31) + this.f105294e) * 31) + this.f105290a.hashCode()) * 31) + this.f105291b.hashCode()) * 31) + this.f105292c.hashCode();
    }
}
