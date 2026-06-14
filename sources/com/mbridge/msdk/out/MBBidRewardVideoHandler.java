package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.BidRewardVideoStrategy;
import com.mbridge.msdk.video.bt.module.orglistener.g;

/* JADX INFO: loaded from: classes10.dex */
public class MBBidRewardVideoHandler extends BidAdHandler {
    private static final String TAG = "MBBidRewardVideoHandler";

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    protected void initStrategy(String str, String str2) {
        this.iBaseVideoAdStrategy = checkComponentizedLogic() ? new BidComponentStrategy(str2, str, 94) : new BidRewardVideoStrategy(str2, str);
    }

    public void setRewardVideoListener(g gVar) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.setRewardVideoListener(gVar);
        }
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
