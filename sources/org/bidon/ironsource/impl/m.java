package org.bidon.ironsource.impl;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes12.dex */
public interface m extends ISDemandOnlyInterstitialListener, ISDemandOnlyRewardedVideoListener {
    SharedFlow b();
}
