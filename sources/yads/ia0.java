package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class ia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv0 f111928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yv0 f111929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111931e;

    public ia0(String str, yv0 yv0Var, yv0 yv0Var2, int i10, int i11) {
        fi.a(i10 == 0 || i11 == 0);
        this.f111927a = fi.a(str);
        this.f111928b = (yv0) fi.a(yv0Var);
        this.f111929c = (yv0) fi.a(yv0Var2);
        this.f111930d = i10;
        this.f111931e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ia0.class == obj.getClass()) {
            ia0 ia0Var = (ia0) obj;
            if (this.f111930d == ia0Var.f111930d && this.f111931e == ia0Var.f111931e && this.f111927a.equals(ia0Var.f111927a) && this.f111928b.equals(ia0Var.f111928b) && this.f111929c.equals(ia0Var.f111929c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f111929c.hashCode() + ((this.f111928b.hashCode() + j4.a(this.f111927a, (((this.f111930d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f111931e) * 31, 31)) * 31);
    }
}
