package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4653z9 extends AbstractC4391k3<B9, AdapterAdInteractionListener> {
    public C4653z9(List<NetworkSettings> list, E9 e92, String str, C4432ma c4432ma, C4246ba c4246ba) {
        super(new A9(str, list, e92), c4432ma, c4246ba);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4425m3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public B9 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i10, String str, C4424m2 c4424m2) {
        return new B9(this, new C4405l0(IronSource.a.INTERSTITIAL, this.f43656o.o(), i10, this.f43648g, str, this.f43646e, this.f43647f, networkSettings, this.f43656o.n()), baseAdAdapter, c4424m2, this);
    }

    @Override // com.ironsource.AbstractC4425m3
    protected K0 g() {
        return new I9();
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC4425m3
    protected String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    C4653z9(I7 i72, H7 h72, List<NetworkSettings> list, E9 e92, String str, C4432ma c4432ma, C4246ba c4246ba) {
        super(i72, h72, new A9(str, list, e92), c4432ma, c4246ba);
    }

    @Override // com.ironsource.AbstractC4425m3
    protected JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
