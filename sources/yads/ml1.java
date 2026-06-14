package yads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface ml1 {
    void addDrmEventListener(Handler handler, kj0 kj0Var);

    void addEventListener(Handler handler, pl1 pl1Var);

    bl1 createPeriod(kl1 kl1Var, ke keVar, long j10);

    void disable(ll1 ll1Var);

    void enable(ll1 ll1Var);

    @Nullable
    f43 getInitialTimeline();

    rk1 getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError();

    void prepareSource(ll1 ll1Var, e63 e63Var, wc2 wc2Var);

    void releasePeriod(bl1 bl1Var);

    void releaseSource(ll1 ll1Var);

    void removeDrmEventListener(kj0 kj0Var);

    void removeEventListener(pl1 pl1Var);
}
