package com.yandex.mobile.ads.video.playback;

import androidx.annotation.MainThread;
import com.ironsource.Df;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;", "", Df.f40645f, "", "videoAd", "Lcom/yandex/mobile/ads/video/playback/model/VideoAd;", "onAdCompleted", TelemetryAdLifecycleEvent.AD_ERROR, "onAdPaused", "onAdPrepared", "onAdResumed", "onAdSkipped", "onAdStarted", "onAdStopped", "onImpression", "onVolumeChanged", "volume", "", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
public interface VideoAdPlaybackListener {
    void onAdClicked(@NotNull VideoAd videoAd);

    void onAdCompleted(@NotNull VideoAd videoAd);

    void onAdError(@NotNull VideoAd videoAd);

    void onAdPaused(@NotNull VideoAd videoAd);

    void onAdPrepared(@NotNull VideoAd videoAd);

    void onAdResumed(@NotNull VideoAd videoAd);

    void onAdSkipped(@NotNull VideoAd videoAd);

    void onAdStarted(@NotNull VideoAd videoAd);

    void onAdStopped(@NotNull VideoAd videoAd);

    void onImpression(@NotNull VideoAd videoAd);

    void onVolumeChanged(@NotNull VideoAd videoAd, float volume);
}
