package net.pubnative.lite.sdk.vpaid;

import android.view.View;
import java.util.List;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityFriendlyObstruction;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityNativeVideoAdSession;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.utils.UrlClickSource;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoAdController {

    public interface OnPreparedListener {
        void onPrepared();
    }

    boolean adFinishedPlaying();

    void addEndCardData(EndCardData endCardData);

    void addViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str);

    void buildVideoAdView(VideoAdView videoAdView);

    void closeEndCard();

    void closeSelf();

    void destroy();

    void dismiss();

    AdParams getAdParams();

    int getProgress();

    HyBidViewabilityNativeVideoAdSession getViewabilityAdSession();

    List<HyBidViewabilityFriendlyObstruction> getViewabilityFriendlyObstructions();

    boolean isRewarded();

    boolean isVideoVisible();

    void onCustomCTAClick(boolean z10);

    void onCustomCTALoadFail();

    void onCustomCTAShow();

    void onCustomEndCardClick(String str);

    void onCustomEndCardShow(String str);

    void onDefaultEndCardClick(String str);

    void onDefaultEndCardShow(String str);

    void onEndCardClosed(Boolean bool);

    void onEndCardLoadFail(Boolean bool);

    void onEndCardLoadSuccess(Boolean bool);

    void onVolumeChanged();

    void openUrl(String str, UrlClickSource urlClickSource);

    void pause();

    void pauseEndCardCloseButtonTimer();

    void playAd();

    void prepare(OnPreparedListener onPreparedListener);

    void resume();

    void resumeEndCardCloseButtonTimer();

    void setEndCardFilePath(String str);

    void setVideoFilePath(String str);

    void setVideoVisible(boolean z10);

    void setVolume(boolean z10);

    void skipEndCard();

    void skipVideo();

    void toggleMute();
}
