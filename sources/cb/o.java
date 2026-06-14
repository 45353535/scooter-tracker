package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6682c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f6681b = str2;
        this.f6682c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f6666a.equals(oVar.f6666a) && Objects.equals(this.f6681b, oVar.f6681b) && Objects.equals(this.f6682c, oVar.f6682c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6666a.hashCode()) * 31;
        String str = this.f6681b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6682c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": url=" + this.f6682c;
    }
}
