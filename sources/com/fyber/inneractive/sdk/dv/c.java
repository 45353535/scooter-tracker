package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20527m;

    public c() {
        boolean z10;
        try {
            Class.forName("com.google.android.gms.ads.InterstitialAd");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        this.f20527m = !z10;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        x xVar = this.f20754c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f20518g = null;
            aVar.f20520i = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f20754c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f20518g = null;
            aVar.f20520i = null;
        }
        this.f20762k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        r.f23896b.removeCallbacks(this.f20763l);
        this.f20752a = null;
        this.f20753b = null;
        this.f20754c = null;
        this.f20755d = null;
        this.f20756e = null;
        this.f20757f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
        if (eVar == null || ((i) eVar).f23741u == null) {
            j();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f20752a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        i iVar = (i) this.f20753b;
        UnitDisplayType unitDisplayType = iVar.f23736p;
        QueryInfo queryInfo = iVar.f23741u.f20547a;
        int i10 = b.f20521a[unitDisplayType.ordinal()];
        x bVar = i10 != 1 ? (i10 == 2 || i10 == 3) ? new com.fyber.inneractive.sdk.dv.banner.b(f(), this.f20758g, (i) this.f20753b) : i10 != 4 ? null : this.f20527m ? new com.fyber.inneractive.sdk.dv.rewarded.d(f(), this.f20758g, (i) this.f20753b) : new com.fyber.inneractive.sdk.dv.rewarded.g(f(), this.f20758g, (i) this.f20753b) : this.f20527m ? new com.fyber.inneractive.sdk.dv.interstitial.d(f(), this.f20758g, (i) this.f20753b) : new com.fyber.inneractive.sdk.dv.interstitial.g(f(), this.f20758g, (i) this.f20753b);
        this.f20754c = bVar;
        if (queryInfo == null || bVar == null || this.f20753b == null) {
            j();
            return;
        }
        try {
            AdRequest.Builder builder = new AdRequest.Builder();
            try {
                AdRequest.Builder.class.getMethod("setAdString", String.class).invoke(builder, ((i) this.f20753b).N);
            } catch (Exception unused2) {
                builder.setAdInfo(new AdInfo(queryInfo, ((i) this.f20753b).N));
            }
            ((a) this.f20754c).a(builder.build(), this);
        } catch (Throwable unused3) {
            j();
        }
    }

    public final void j() {
        b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR));
    }
}
