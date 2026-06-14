package io.bidmachine.media3.exoplayer;

import ga.f0;
import io.bidmachine.media3.exoplayer.g2;

/* JADX INFO: loaded from: classes12.dex */
public interface i2 extends g2.b {

    public interface a {
        void onSleep();

        void onWakeup();
    }

    void c(n9.e0 e0Var);

    void d(u9.k0 k0Var, io.bidmachine.media3.common.a[] aVarArr, ga.c1 c1Var, long j10, boolean z10, boolean z11, long j11, long j12, f0.b bVar);

    void disable();

    void enableMayRenderStartOfStream();

    void f(io.bidmachine.media3.common.a[] aVarArr, ga.c1 c1Var, long j10, long j11, f0.b bVar);

    void g(int i10, v9.c2 c2Var, q9.h hVar);

    j2 getCapabilities();

    long getDurationToProgressUs(long j10, long j11);

    u9.g0 getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    ga.c1 getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    void release();

    void render(long j10, long j11);

    void reset();

    void resetPosition(long j10);

    void setCurrentStreamFinal();

    void setPlaybackSpeed(float f10, float f11);

    void start();

    void stop();
}
