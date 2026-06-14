package com.appodeal.ads.adapters.admobmediation.rewarded_video;

import com.appodeal.ads.adapters.admob.rewarded_video.AdmobRewarded;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AdmobRewarded {
    @Override // com.appodeal.ads.adapters.admob.rewarded_video.UnifiedAdmobRewarded
    public final RewardedAdLoadCallback createLoadListener(UnifiedRewardedCallback callback, UnifiedAdContainer unifiedAdContainer) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(unifiedAdContainer, "unifiedAdContainer");
        return new a(callback, unifiedAdContainer);
    }
}
