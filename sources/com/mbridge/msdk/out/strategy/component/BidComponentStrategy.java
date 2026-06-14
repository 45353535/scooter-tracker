package com.mbridge.msdk.out.strategy.component;

import com.ironsource.C4424m2;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class BidComponentStrategy extends BaseComponentStrategy implements IBidVideoAdStrategy {
    public BidComponentStrategy(String str, String str2, int i10) {
        super(str, str2, i10);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        try {
            return isReadyWithSyncWait(true);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e10.getMessage(), e10);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        try {
            this.bidToken = str;
            HashMap map = new HashMap();
            map.put("bid_token", str);
            map.put("is_hb", 1);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "load", map);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy loadFromBid error: " + e10.getMessage(), e10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        try {
            HashMap map = new HashMap();
            map.put("user_id", this.userId);
            map.put("user_extra_data", this.extraData);
            map.put("bid_token", this.bidToken);
            map.put("is_hb", 1);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), C4424m2.f43623v, map);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy showFromBid error: " + e10.getMessage(), e10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        this.userId = str;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        showFromBid();
    }
}
