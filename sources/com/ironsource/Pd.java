package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes8.dex */
public class Pd extends C4461o3<U0> implements RewardedVideoAdListener {
    public Pd(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C4424m2 c4424m2, U0 u02) {
        super(interfaceC4435md, c4405l0, baseAdAdapter, new C4237b1(c4405l0.g(), c4405l0.g().getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), c4424m2, u02);
    }
}
