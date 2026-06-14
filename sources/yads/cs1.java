package yads;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class cs1 extends zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xj2 f109554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s62 f109555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k01 f109556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o01 f109557d;

    public cs1(SSLSocketFactory sSLSocketFactory, xj2 xj2Var, s62 s62Var, k01 k01Var, p01 p01Var) {
        this.f109554a = xj2Var;
        this.f109555b = s62Var;
        this.f109556c = k01Var;
        p01Var.getClass();
        this.f109557d = p01.a(sSLSocketFactory);
    }

    @Override // yads.zn
    public final j01 a(km2 km2Var, Map map) {
        boolean z10;
        synchronized (qs1.f115144a) {
            z10 = qs1.f115145b;
        }
        return z10 ? (j01) new bs1(this, map).invoke(km2Var) : b(km2Var, map);
    }

    public final j01 b(km2 km2Var, Map map) {
        r62 r62VarA = this.f109555b.a(km2Var);
        if (r62VarA == null) {
            return this.f109557d.a(km2Var, map);
        }
        this.f109554a.getClass();
        ArrayList arrayList = new ArrayList();
        Map map2 = r62VarA.f115342c;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new bz0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return new j01(r62VarA.f115340a, arrayList, r62VarA.f115341b);
    }
}
