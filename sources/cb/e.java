package cb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6656d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6654b = str;
        this.f6655c = str2;
        this.f6656d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f6655c, eVar.f6655c) && Objects.equals(this.f6654b, eVar.f6654b) && Objects.equals(this.f6656d, eVar.f6656d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6654b;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6655c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6656d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": language=" + this.f6654b + ", description=" + this.f6655c + ", text=" + this.f6656d;
    }
}
