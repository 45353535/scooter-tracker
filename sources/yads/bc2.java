package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class bc2 implements sc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc3 f108967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cc2 f108968b;

    public bc2(cc2 cc2Var) {
        this.f108968b = cc2Var;
    }

    @Override // yads.sc3
    public final void a() {
        sc3 sc3Var = this.f108967a;
        if (sc3Var != null) {
            sc3Var.a();
        }
    }

    @Override // yads.sc3
    public final void b() {
        r52 r52Var = (r52) this.f108968b.f109342a.b();
        if (r52Var != null) {
            d42 d42Var = r52Var.f115325c;
            t52 t52Var = this.f108968b.f109344c;
            sj1 sj1Var = d42Var.f109755b;
            t52Var.getClass();
            if (sj1Var != null) {
                CheckBox muteControl = sj1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = sj1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = sj1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        sc3 sc3Var = this.f108967a;
        if (sc3Var != null) {
            sc3Var.b();
        }
    }

    @Override // yads.sc3
    public final void c() {
        r52 r52Var = (r52) this.f108968b.f109342a.b();
        if (r52Var != null) {
            this.f108968b.f109345d.a(r52Var);
        }
        sc3 sc3Var = this.f108967a;
        if (sc3Var != null) {
            sc3Var.c();
        }
    }
}
