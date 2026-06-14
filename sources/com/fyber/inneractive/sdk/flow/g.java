package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f20734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f20735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IFyberAdIdentifier f20736d;

    public g(Context context, boolean z10, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f20733a = context;
        this.f20734b = inneractiveAdRequest;
        this.f20735c = eVar;
        new FyberAdIdentifierFactory();
        IFyberAdIdentifier fyberAdIdentifierRemote = z10 ? new FyberAdIdentifierRemote(rVar) : new FyberAdIdentifierLocal(rVar);
        this.f20736d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.f23815a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long demandId;
        String demandSource;
        com.fyber.inneractive.sdk.response.e eVar = this.f20735c;
        String str = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.f23740t;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f20735c.f23740t;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f20735c.f23740t;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f20733a, this, str, demandSource, demandId);
    }
}
