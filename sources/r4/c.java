package r4;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {
    public static void a(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdClicked();
    }

    public static void b(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdClosed();
    }

    public static void c(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdEnded();
    }

    public static void d(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdOpened();
    }

    public static void e(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdRewarded();
    }

    public static void f(RewardedVideoSmashListener rewardedVideoSmashListener, IronSourceError ironSourceError, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ironSourceError);
    }

    public static void g(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdStarted();
    }

    public static void h(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAdVisible();
    }

    public static void i(RewardedVideoSmashListener rewardedVideoSmashListener, boolean z10, Map map) {
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(z10);
    }

    public static void j(RewardedVideoSmashListener rewardedVideoSmashListener, IronSourceError ironSourceError, Map map) {
        rewardedVideoSmashListener.onRewardedVideoInitFailed(ironSourceError);
    }

    public static void k(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public static void l(RewardedVideoSmashListener rewardedVideoSmashListener, IronSourceError ironSourceError, Map map) {
        rewardedVideoSmashListener.onRewardedVideoLoadFailed(ironSourceError);
    }

    public static void m(RewardedVideoSmashListener rewardedVideoSmashListener, Map map) {
        rewardedVideoSmashListener.onRewardedVideoLoadSuccess();
    }
}
