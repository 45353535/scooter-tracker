package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class gt2 implements h32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ it2 f111336a;

    public gt2(it2 it2Var) {
        this.f111336a = it2Var;
    }

    @Override // yads.h32
    public final void a(k4 k4Var) {
        it2 it2Var = this.f111336a;
        if (it2Var.f112135o) {
            return;
        }
        it2Var.f112133m = null;
        it2Var.f112134n = null;
        it2Var.f112121a.b(k4Var);
    }

    @Override // yads.h32
    public final void a(jz1 jz1Var) {
        final it2 it2Var = this.f111336a;
        if (it2Var.f112135o) {
            return;
        }
        it2Var.f112134n = jz1Var;
        it2Var.f112127g.post(new Runnable() { // from class: yads.v7
            @Override // java.lang.Runnable
            public final void run() {
                gt2.a(it2Var);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(yads.it2 r25) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gt2.a(yads.it2):void");
    }
}
