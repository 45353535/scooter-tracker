package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f48160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f48161b;

    public a(DyOption dyOption) {
        this.f48160a = dyOption;
        this.f48161b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f48161b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f48160a;
    }
}
