package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ao implements sb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f108733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg1 f108734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag1 f108735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rb1 f108736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f108737e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i00 f108738f;

    public ao(Context context, fg1 fg1Var, ag1 ag1Var, rb1 rb1Var) {
        this.f108733a = context;
        this.f108734b = fg1Var;
        this.f108735c = ag1Var;
        this.f108736d = rb1Var;
    }

    @Override // yads.sb1
    public final void a(final e9 e9Var) {
        this.f108734b.a();
        if (this.f108738f == null) {
            wa1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f108735c.a(new Runnable() { // from class: yads.a3
            @Override // java.lang.Runnable
            public final void run() {
                ao.a(this.f108542b, e9Var);
            }
        });
    }

    public static final void a(ao aoVar, e9 e9Var) {
        qb1 qb1VarA = aoVar.f108736d.a(aoVar.f108733a, aoVar, e9Var, null);
        aoVar.f108737e.add(qb1VarA);
        String str = e9Var.f110252a;
        qb1VarA.f115507c.a(str);
        qb1VarA.F.f114338f = str;
        qb1VarA.a(aoVar.f108738f);
        qb1VarA.b(e9Var);
    }

    @Override // yads.q5
    public final void a(rw0 rw0Var) {
        qb1 qb1Var = (qb1) rw0Var;
        if (this.f108738f == null) {
            wa1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        qb1Var.a((i00) null);
        this.f108737e.remove(qb1Var);
    }

    @Override // yads.sb1
    public final void a(iq3 iq3Var) {
        this.f108734b.a();
        this.f108738f = iq3Var;
        Iterator it = this.f108737e.iterator();
        while (it.hasNext()) {
            ((qb1) it.next()).a((i00) iq3Var);
        }
    }
}
