package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class qe extends ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerCallbacks f14310a;

    @Override // com.appodeal.ads.ka
    public final void b(te teVar, uc ucVar, Object obj) {
        Log.log("Banner", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerClicked();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void c(te teVar, uc ucVar) {
        Log.log("Banner", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerExpired();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void d(te teVar, uc ucVar, Object obj) {
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShowFailed();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void f(te teVar, uc ucVar, Object obj) {
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShown();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void g(te teVar, uc ucVar) {
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerFailedToLoad();
        }
    }

    @Override // com.appodeal.ads.ka
    public final void h(te teVar, uc ucVar) {
        cf cfVar = (cf) ucVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOADED, "height: " + cfVar.f13183s + "dp, isPrecache: " + cfVar.f14937c.f15228e, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f14310a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerLoaded(cfVar.f13183s, cfVar.f14937c.f15228e);
        }
    }
}
