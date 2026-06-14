package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bj3 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc3 f109021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh3 f109022b;

    public /* synthetic */ bj3(h42 h42Var, v52 v52Var) {
        this(h42Var, gv1.a(v52Var));
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        if (this.f109022b.a()) {
            if (this.f109021a.isPlayingAd()) {
                return;
            }
            this.f109021a.resumeAd();
        } else if (this.f109021a.isPlayingAd()) {
            this.f109021a.pauseAd();
        }
    }

    public bj3(h42 h42Var, mh3 mh3Var) {
        this.f109021a = h42Var;
        this.f109022b = mh3Var;
    }
}
