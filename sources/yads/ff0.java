package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110702c;

    public ff0(String str, String str2, String str3) {
        this.f110700a = str;
        this.f110701b = str2;
        this.f110702c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff0.class == obj.getClass()) {
            ff0 ff0Var = (ff0) obj;
            if (w83.a(this.f110700a, ff0Var.f110700a) && w83.a(this.f110701b, ff0Var.f110701b) && w83.a(this.f110702c, ff0Var.f110702c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f110700a.hashCode() * 31;
        String str = this.f110701b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f110702c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
