package yads;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public final class ye {
    public static void a(ProgressBar progressBar, long j10, long j11) {
        progressBar.clearAnimation();
        if (j10 > 0) {
            progressBar.setMax((int) j10);
            zg2 zg2Var = new zg2(progressBar, progressBar.getProgress(), (int) j11);
            zg2Var.setDuration(200L);
            progressBar.startAnimation(zg2Var);
        }
    }
}
