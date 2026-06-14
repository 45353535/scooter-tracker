package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class eg3 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh3 f110367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye f110368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m10 f110369c;

    public /* synthetic */ eg3(jh3 jh3Var) {
        this(jh3Var, new ye(), new m10());
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        r52 r52Var = (r52) this.f110367a.b();
        if (r52Var != null) {
            sj1 sj1Var = r52Var.f115325c.f109755b;
            ProgressBar videoProgress = sj1Var != null ? sj1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f110368b.getClass();
                ye.a(videoProgress, j10, j11);
            }
            sj1 sj1Var2 = r52Var.f115325c.f109755b;
            TextView countDownProgress = sj1Var2 != null ? sj1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f110369c.f113289a.getClass();
                countDownProgress.setText(jh2.a(j10 - j11));
            }
        }
    }

    public eg3(jh3 jh3Var, ye yeVar, m10 m10Var) {
        this.f110367a = jh3Var;
        this.f110368b = yeVar;
        this.f110369c = m10Var;
    }
}
