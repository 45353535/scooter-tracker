package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ef extends ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedVideoCallbacks f13295a;

    @Override // com.appodeal.ads.ka
    public final void a(te teVar, uc ucVar) {
        ce ceVar = (ce) teVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLOSED, "finished: " + ceVar.f14913y, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClosed(ceVar.f14913y);
        }
    }

    @Override // com.appodeal.ads.ka
    public final void b(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClicked();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void c(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoExpired();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void d(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShowFailed();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void e(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_FINISHED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            JSONObject jSONObjectOptJSONObject = af.a().y().f14496c.optJSONObject("reward");
            double dOptDouble = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("amount", 0.0d) : 0.0d;
            JSONObject jSONObjectOptJSONObject2 = af.a().y().f14496c.optJSONObject("reward");
            rewardedVideoCallbacks.onRewardedVideoFinished(dOptDouble, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("currency", "") : "");
        }
    }

    @Override // com.appodeal.ads.ka
    public final void f(te teVar, uc ucVar, Object obj) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShown();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void g(te teVar, uc ucVar) {
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoFailedToLoad();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void h(te teVar, uc ucVar) {
        vd vdVar = (vd) ucVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOADED, "isPrecache: " + vdVar.f14937c.f15228e, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f13295a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoLoaded(vdVar.f14937c.f15228e);
        }
    }
}
