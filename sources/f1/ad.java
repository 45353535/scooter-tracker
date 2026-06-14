package f1;

import f1.bd;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ad extends bd {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x5 f69397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f69398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jc f69399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f69400o;

    public ad(x5 x5Var, i iVar, jc jcVar, File file, String str) {
        super(bd.c.f69468b, jcVar.f70203d, r.f70879e, file);
        this.f69463j = bd.b.f69465c;
        this.f69397l = x5Var;
        this.f69398m = iVar;
        this.f69399n = jcVar;
        this.f69400o = str;
    }

    @Override // f1.bd
    public qd a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.f69400o);
        map.put("X-Chartboost-Client", g3.c());
        map.put("X-Chartboost-Reachability", Integer.toString(this.f69398m.c().g()));
        return new qd(map, null, null);
    }

    @Override // f1.bd
    public void c(g1.a aVar, ef efVar) {
        this.f69397l.d(this, aVar, efVar);
    }

    @Override // f1.bd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void d(Void r12, ef efVar) {
        this.f69397l.d(this, null, null);
    }
}
