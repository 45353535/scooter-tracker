package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f20166a;

    public w(y yVar) {
        this.f20166a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f21138d;
                dVar.a(this.f20166a.f20171d).f();
                dVar.b(this.f20166a.f20171d).f21154c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f20166a.f20171d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f20166a.f20171d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f21138d.b(this.f20166a.f20171d);
                iVarB.f21152a.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), Long.valueOf(System.currentTimeMillis() - iVarB.f21154c));
                break;
        }
    }
}
