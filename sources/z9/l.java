package z9;

import android.net.Uri;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Map;
import n9.r;
import s9.g;
import s9.m;
import z9.h;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f119287a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r.f f119288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f119289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g.a f119290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f119291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ka.m f119292f;

    private w b(r.f fVar) {
        g.a aVarB = this.f119290d;
        if (aVarB == null) {
            aVarB = new m.b().b(this.f119291e);
        }
        Uri uri = fVar.f95506c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f95511h, aVarB);
        UnmodifiableIterator it = fVar.f95508e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l0Var.c((String) entry.getKey(), (String) entry.getValue());
        }
        h.b bVarE = new h.b().f(fVar.f95504a, k0.f119283d).c(fVar.f95509f).d(fVar.f95510g).e(Ints.toArray(fVar.f95513j));
        ka.m mVar = this.f119292f;
        if (mVar != null) {
            bVarE.b(mVar);
        }
        h hVarA = bVarE.a(l0Var);
        hVarA.E(0, fVar.c());
        return hVarA;
    }

    @Override // z9.z
    public w a(n9.r rVar) {
        w wVar;
        q9.a.e(rVar.f95455b);
        r.f fVar = rVar.f95455b.f95549c;
        if (fVar == null) {
            return w.f119322a;
        }
        synchronized (this.f119287a) {
            try {
                if (!fVar.equals(this.f119288b)) {
                    this.f119288b = fVar;
                    this.f119289c = b(fVar);
                }
                wVar = (w) q9.a.e(this.f119289c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }
}
