package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.RewardVideoStrategy;

/* JADX INFO: loaded from: classes10.dex */
public class MBRewardVideoHandler extends NonBidAdHandler {
    private static final String TAG = "MBRewardVideoHandler";

    public MBRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    protected void initStrategy(String str, String str2) {
        this.iBaseVideoAdStrategy = checkComponentizedLogic() ? new ComponentStrategy(str2, str, 94) : new RewardVideoStrategy(str2, str);
    }

    public void setRewardVideoListener(RewardVideoListener rewardVideoListener) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.setRewardVideoListener(rewardVideoListener);
        }
    }

    public MBRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
