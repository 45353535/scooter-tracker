package yads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
public final class lu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu2 f113228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu2 f113229b;

    public lu2(pu2 pu2Var) {
        this(pu2Var, pu2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lu2.class == obj.getClass()) {
            lu2 lu2Var = (lu2) obj;
            if (this.f113228a.equals(lu2Var.f113228a) && this.f113229b.equals(lu2Var.f113229b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f113229b.hashCode() + (this.f113228a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C4240b4.j.f42672d);
        sb2.append(this.f113228a);
        if (this.f113228a.equals(this.f113229b)) {
            str = "";
        } else {
            str = ", " + this.f113229b;
        }
        sb2.append(str);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    public lu2(pu2 pu2Var, pu2 pu2Var2) {
        this.f113228a = (pu2) fi.a(pu2Var);
        this.f113229b = (pu2) fi.a(pu2Var2);
    }
}
