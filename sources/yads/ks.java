package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public final class ks implements wo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg1 f112830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag1 f112831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo2 f112832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final op2 f112833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dg2 f112834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f112835g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c10 f112836h;

    public ks(Context context, fg1 fg1Var, ag1 ag1Var, vo2 vo2Var, op2 op2Var, dg2 dg2Var) {
        this.f112829a = context;
        this.f112830b = fg1Var;
        this.f112831c = ag1Var;
        this.f112832d = vo2Var;
        this.f112833e = op2Var;
        this.f112834f = dg2Var;
    }

    @Override // yads.wo2
    public final void a(final e9 e9Var) {
        this.f112830b.a();
        if (this.f112836h == null) {
            wa1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f112831c.a(new Runnable() { // from class: yads.di
            @Override // java.lang.Runnable
            public final void run() {
                ks.a(this.f109930b, e9Var);
            }
        });
    }

    public final void b(final e9 e9Var) {
        this.f112831c.a(new Runnable() { // from class: yads.ki
            @Override // java.lang.Runnable
            public final void run() {
                ks.b(this.f112706b, e9Var);
            }
        });
    }

    public static final void b(ks ksVar, e9 e9Var) {
        boolean zB;
        ksVar.f112834f.getClass();
        if (dg2.a(e9Var)) {
            op2 op2Var = ksVar.f112833e;
            synchronized (op2Var) {
                zB = op2Var.f114386a.b();
            }
            if (zB) {
                ksVar.a(e9Var, new hs(ksVar, e9Var), Reporting.EventType.RENDER);
            }
        }
    }

    public final void a(e9 e9Var, c10 c10Var, String str) {
        e9 e9VarA = e9.a(e9Var, null, str, 2047);
        uo2 uo2VarA = this.f112832d.a(this.f112829a, this, e9VarA, new js(this, e9VarA));
        this.f112835g.add(uo2VarA);
        String str2 = e9VarA.f110252a;
        uo2VarA.f115507c.a(str2);
        uo2VarA.F.f115016d = str2;
        uo2VarA.a(c10Var);
        uo2VarA.b(e9VarA);
    }

    public static final void a(ks ksVar, e9 e9Var) {
        yo2 yo2Var;
        ksVar.f112834f.getClass();
        if (dg2.a(e9Var)) {
            op2 op2Var = ksVar.f112833e;
            synchronized (op2Var) {
                fg2 fg2Var = op2Var.f114386a;
                op2Var.f114387b.getClass();
                yo2Var = (yo2) fg2Var.a(ax0.a(e9Var));
            }
            if (yo2Var != null) {
                c10 c10Var = ksVar.f112836h;
                if (c10Var != null) {
                    c10Var.a(yo2Var);
                    return;
                }
                return;
            }
            ksVar.a(e9Var, new is(ksVar), "default");
            return;
        }
        ksVar.a(e9Var, new is(ksVar), "default");
    }

    @Override // yads.q5
    public final void a(rw0 rw0Var) {
        uo2 uo2Var = (uo2) rw0Var;
        if (this.f112836h == null) {
            wa1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        uo2Var.a((c10) null);
        this.f112835g.remove(uo2Var);
    }

    @Override // yads.wo2
    public final void a(or3 or3Var) {
        this.f112830b.a();
        this.f112836h = or3Var;
    }
}
