package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Od extends AbstractC4444n3<Pd> {
    public Od(List<NetworkSettings> list, Rd rd2, String str, boolean z10, C4432ma c4432ma, C4246ba c4246ba) {
        super(new Md(str, list, rd2, z10), c4432ma, c4246ba);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4425m3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Pd a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i10, String str, C4424m2 c4424m2) {
        return new Pd(this, new C4405l0(IronSource.a.REWARDED_VIDEO, this.f43656o.o(), i10, this.f43648g, str, this.f43646e, this.f43647f, networkSettings, this.f43656o.n()), baseAdAdapter, c4424m2, this);
    }

    @Override // com.ironsource.AbstractC4425m3
    protected K0 g() {
        return new Ud();
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean q() {
        return this.f43656o.h().a() == N0.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected boolean t() {
        return this.f43656o.h().a() == N0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected void a(IronSourceError ironSourceError) {
        N0.a aVarA = this.f43656o.h().a();
        if (aVarA != N0.a.AUTOMATIC_LOAD_AFTER_CLOSE && aVarA != N0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            super.a(ironSourceError);
        } else {
            this.f43661t.a(false, (AdInfo) null);
        }
    }

    @Override // com.ironsource.AbstractC4425m3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }
}
