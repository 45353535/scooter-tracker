package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rm0 {
    @DoNotInline
    public static wc2 a(Context context, vm0 vm0Var, boolean z10) {
        MediaMetricsManager mediaMetricsManagerA = androidx.media3.exoplayer.analytics.v2.a(context.getSystemService("media_metrics"));
        yk1 yk1Var = mediaMetricsManagerA == null ? null : new yk1(context, mediaMetricsManagerA.createPlaybackSession());
        if (yk1Var == null) {
            uf1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new wc2(new vc2(LogSessionId.LOG_SESSION_ID_NONE));
        }
        if (z10) {
            vm0Var.getClass();
            xa0 xa0Var = (xa0) vm0Var.f117108o;
            xa0Var.getClass();
            ae1 ae1Var = xa0Var.f117759f;
            if (!ae1Var.f108659g) {
                ae1Var.f108656d.add(new zd1(yk1Var));
            }
        }
        return new wc2(new vc2(yk1Var.f118254c.getSessionId()));
    }
}
