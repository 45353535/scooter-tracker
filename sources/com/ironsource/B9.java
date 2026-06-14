package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;

/* JADX INFO: loaded from: classes8.dex */
public class B9 extends AbstractC4408l3<I0> implements InterstitialAdListener {
    public B9(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, C4424m2 c4424m2, I0 i02) {
        super(interfaceC4435md, c4405l0, baseAdAdapter, new C4237b1(c4405l0.g(), c4405l0.g().getInterstitialSettings(), IronSource.a.INTERSTITIAL), c4424m2, i02);
    }
}
