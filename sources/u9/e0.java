package u9;

import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public interface e0 {
    void a(r.g gVar);

    float getAdjustedPlaybackSpeed(long j10, long j11);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setTargetLiveOffsetOverrideUs(long j10);
}
