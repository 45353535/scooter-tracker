package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f21365a;

    public r(s sVar) {
        this.f21365a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.getClass();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f21365a.f21346d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f21365a.f21346d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f21138d.a(this.f21365a.f21346d).d();
                break;
        }
    }
}
