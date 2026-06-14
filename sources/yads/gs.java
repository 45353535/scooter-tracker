package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public final class gs implements sb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg1 f111319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag1 f111320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb1 f111321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bc1 f111322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dg2 f111323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f111324g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i00 f111325h;

    public gs(Context context, fg1 fg1Var, ag1 ag1Var, rb1 rb1Var, bc1 bc1Var, dg2 dg2Var) {
        this.f111318a = context;
        this.f111319b = fg1Var;
        this.f111320c = ag1Var;
        this.f111321d = rb1Var;
        this.f111322e = bc1Var;
        this.f111323f = dg2Var;
    }

    @Override // yads.sb1
    public final void a(final e9 e9Var) {
        this.f111319b.a();
        if (this.f111325h == null) {
            wa1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f111320c.a(new Runnable() { // from class: yads.x6
            @Override // java.lang.Runnable
            public final void run() {
                gs.a(this.f117722b, e9Var);
            }
        });
    }

    public final void b(final e9 e9Var) {
        this.f111320c.a(new Runnable() { // from class: yads.z6
            @Override // java.lang.Runnable
            public final void run() {
                gs.b(this.f118554b, e9Var);
            }
        });
    }

    public static final void b(gs gsVar, e9 e9Var) {
        boolean zB;
        gsVar.f111323f.getClass();
        if (dg2.a(e9Var)) {
            bc1 bc1Var = gsVar.f111322e;
            synchronized (bc1Var) {
                zB = bc1Var.f108965a.b();
            }
            if (zB) {
                gsVar.a(e9Var, new es(gsVar, e9Var), Reporting.EventType.RENDER);
            }
        }
    }

    public final void a(e9 e9Var, i00 i00Var, String str) {
        e9 e9VarA = e9.a(e9Var, null, str, 2047);
        qb1 qb1VarA = this.f111321d.a(this.f111318a, this, e9VarA, new ds(this, e9VarA));
        this.f111324g.add(qb1VarA);
        String str2 = e9VarA.f110252a;
        qb1VarA.f115507c.a(str2);
        qb1VarA.F.f114338f = str2;
        qb1VarA.a(i00Var);
        qb1VarA.b(e9VarA);
    }

    public static final void a(gs gsVar, e9 e9Var) {
        ub1 ub1Var;
        gsVar.f111323f.getClass();
        if (dg2.a(e9Var)) {
            bc1 bc1Var = gsVar.f111322e;
            synchronized (bc1Var) {
                fg2 fg2Var = bc1Var.f108965a;
                bc1Var.f108966b.getClass();
                ub1Var = (ub1) fg2Var.a(ax0.a(e9Var));
            }
            if (ub1Var != null) {
                i00 i00Var = gsVar.f111325h;
                if (i00Var != null) {
                    i00Var.a(ub1Var);
                    return;
                }
                return;
            }
            gsVar.a(e9Var, new fs(gsVar), "default");
            return;
        }
        gsVar.a(e9Var, new fs(gsVar), "default");
    }

    @Override // yads.q5
    public final void a(rw0 rw0Var) {
        qb1 qb1Var = (qb1) rw0Var;
        if (this.f111325h == null) {
            wa1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        qb1Var.a((i00) null);
        this.f111324g.remove(qb1Var);
    }

    @Override // yads.sb1
    public final void a(iq3 iq3Var) {
        this.f111319b.a();
        this.f111325h = iq3Var;
    }
}
