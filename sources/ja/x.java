package ja;

import j$.util.Objects;
import n9.i0;
import u9.k0;

/* JADX INFO: loaded from: classes12.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0[] f85696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f85697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f85698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f85699e;

    public x(k0[] k0VarArr, r[] rVarArr, i0 i0Var, Object obj) {
        q9.a.a(k0VarArr.length == rVarArr.length);
        this.f85696b = k0VarArr;
        this.f85697c = (r[]) rVarArr.clone();
        this.f85698d = i0Var;
        this.f85699e = obj;
        this.f85695a = k0VarArr.length;
    }

    public boolean a(x xVar) {
        if (xVar == null || xVar.f85697c.length != this.f85697c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f85697c.length; i10++) {
            if (!b(xVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(x xVar, int i10) {
        return xVar != null && Objects.equals(this.f85696b[i10], xVar.f85696b[i10]) && Objects.equals(this.f85697c[i10], xVar.f85697c[i10]);
    }

    public boolean c(int i10) {
        return this.f85696b[i10] != null;
    }
}
