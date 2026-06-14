package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ko implements wo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg1 f112789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag1 f112790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo2 f112791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f112792e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c10 f112793f;

    public ko(Context context, fg1 fg1Var, ag1 ag1Var, vo2 vo2Var) {
        this.f112788a = context;
        this.f112789b = fg1Var;
        this.f112790c = ag1Var;
        this.f112791d = vo2Var;
    }

    @Override // yads.wo2
    public final void a(final e9 e9Var) {
        this.f112789b.a();
        if (this.f112793f == null) {
            wa1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f112790c.a(new Runnable() { // from class: yads.mh
            @Override // java.lang.Runnable
            public final void run() {
                ko.a(this.f113469b, e9Var);
            }
        });
    }

    public static final void a(ko koVar, e9 e9Var) {
        uo2 uo2VarA = koVar.f112791d.a(koVar.f112788a, koVar, e9Var, null);
        koVar.f112792e.add(uo2VarA);
        String str = e9Var.f110252a;
        uo2VarA.f115507c.a(str);
        uo2VarA.F.f115016d = str;
        uo2VarA.a(koVar.f112793f);
        uo2VarA.b(e9Var);
    }

    @Override // yads.q5
    public final void a(rw0 rw0Var) {
        uo2 uo2Var = (uo2) rw0Var;
        if (this.f112793f == null) {
            wa1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        uo2Var.a((c10) null);
        this.f112792e.remove(uo2Var);
    }

    @Override // yads.wo2
    public final void a(or3 or3Var) {
        this.f112789b.a();
        this.f112793f = or3Var;
        Iterator it = this.f112792e.iterator();
        while (it.hasNext()) {
            ((uo2) it.next()).a((c10) or3Var);
        }
    }
}
