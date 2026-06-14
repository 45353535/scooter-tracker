package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class xr2 implements go, pm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr2 f117938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr2 f117939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f117940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f117941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jy f117942e = jy.f112503c;

    public xr2(Context context, rr2 rr2Var, nr2 nr2Var, v5 v5Var) {
        this.f117938a = rr2Var;
        this.f117939b = nr2Var;
        this.f117940c = v5Var;
        this.f117941d = context.getApplicationContext();
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        this.f117940c.a(u5.f116509m);
        nr2 nr2Var = this.f117939b;
        jy jyVar = this.f117942e;
        if (nr2Var.f114005a.isActive()) {
            CancellableContinuation cancellableContinuation = nr2Var.f114005a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(new as2(oj3Var, jyVar)));
        }
    }

    @Override // yads.pm2
    public final void b() {
        this.f117940c.a(u5.f116508l);
        this.f117940c.a(u5.f116509m, null);
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        HashSet hashSet;
        Object objB;
        hr2 hr2Var = (hr2) obj;
        rr2 rr2Var = this.f117938a;
        Context context = this.f117941d;
        rr2Var.getClass();
        synchronized (rr2.f115559b) {
            hashSet = new HashSet(rr2Var.f115561a.keySet());
            Object obj2 = vt2.f117186j;
            ut2.a().a(context, hr2Var);
            Unit unit = Unit.f93236a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            boolean z10 = !((ir2) it.next()).f112112a.f116233a.b(context);
            try {
                Result.Companion companion = Result.f93230c;
                AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z10);
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.g(objB) != null) {
                boolean z11 = lb1.f113032a;
            }
        }
        this.f117940c.a(u5.f116509m);
        nr2 nr2Var = this.f117939b;
        jy jyVar = this.f117942e;
        if (nr2Var.f114005a.isActive()) {
            CancellableContinuation cancellableContinuation = nr2Var.f114005a;
            Result.Companion companion3 = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(new bs2(hr2Var, jyVar)));
        }
    }
}
