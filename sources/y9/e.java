package y9;

import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108435c;

    public e(String str, String str2, String str3) {
        this.f108433a = str;
        this.f108434b = str2;
        this.f108435c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f108433a, eVar.f108433a) && Objects.equals(this.f108434b, eVar.f108434b) && Objects.equals(this.f108435c, eVar.f108435c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f108433a.hashCode() * 31;
        String str = this.f108434b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108435c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
