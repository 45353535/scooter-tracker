package com.ironsource;

import com.ironsource.C4461o3;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4444n3<Smash extends C4461o3<?>> extends AbstractC4391k3<Smash, AdapterAdRewardListener> implements U0 {
    public AbstractC4444n3(U u10, C4432ma c4432ma, C4246ba c4246ba) {
        super(u10, c4432ma, c4246ba);
    }

    @Override // com.ironsource.U0
    public void a(C4461o3<?> c4461o3, C4283dd c4283dd) {
        IronLog.INTERNAL.verbose(b(c4461o3.k()));
        this.f43661t.b(c4283dd, c4461o3.f());
    }
}
