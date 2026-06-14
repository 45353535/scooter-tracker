package com.pubmatic.sdk.rewardedad;

import android.content.Context;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.openwrap.core.rewarded.POBRewardedAdRenderer;
import com.pubmatic.sdk.openwrap.core.rewarded.POBSkipConfirmationInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class POBRewardedUtil {
    @NonNull
    public static POBRewardedAdRendering getRewardedRenderer(@NonNull Context context, int i10, @NonNull POBSkipConfirmationInfo pOBSkipConfirmationInfo) {
        return new POBRewardedAdRenderer(context, i10, pOBSkipConfirmationInfo);
    }
}
