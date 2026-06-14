package com.mbridge.msdk.interstitial.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(List<Frame> list) {
    }

    public abstract void b(int i10, String str);

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(int i10, String str) {
        b(i10, str);
    }
}
