package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface AdProcessCallback {
    void onBrokenCreativeEvent(@Nullable Map<String, Object> map);

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(@NonNull ae.a aVar);

    void processLoadSuccess();

    void processShowFail(@NonNull ae.a aVar);

    void processShown();

    void processStartVisibilityTracker();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown();

    void setVisibilitySource(@NonNull io.bidmachine.core.k kVar);
}
