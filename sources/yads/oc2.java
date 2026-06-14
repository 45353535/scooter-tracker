package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface oc2 {
    void a(int i10);

    void a(b63 b63Var);

    void a(c20 c20Var);

    void a(fr1 fr1Var);

    void a(gc2 gc2Var);

    void a(lm0 lm0Var);

    void a(nc2 nc2Var);

    void a(pc2 pc2Var, pc2 pc2Var2, int i10);

    void a(qf0 qf0Var);

    void a(rk1 rk1Var, int i10);

    void a(tg3 tg3Var);

    void a(vk1 vk1Var);

    void a(boolean z10, int i10);

    void b(lm0 lm0Var);

    void onCues(List list);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerStateChanged(boolean z10, int i10);

    void onRenderedFirstFrame();

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i10, int i11);

    void onVolumeChanged(float f10);
}
