package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6670d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f6668b = str;
        this.f6669c = str2;
        this.f6670d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f6669c, kVar.f6669c) && Objects.equals(this.f6668b, kVar.f6668b) && Objects.equals(this.f6670d, kVar.f6670d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6668b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6669c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6670d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": domain=" + this.f6668b + ", description=" + this.f6669c;
    }
}
