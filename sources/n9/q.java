package n9;

import j$.util.Objects;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f95443c = o0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f95444d = o0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95446b;

    public q(String str, String str2) {
        this.f95445a = o0.S0(str);
        this.f95446b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (Objects.equals(this.f95445a, qVar.f95445a) && Objects.equals(this.f95446b, qVar.f95446b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f95446b.hashCode() * 31;
        String str = this.f95445a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
