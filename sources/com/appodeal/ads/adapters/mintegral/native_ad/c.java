package com.appodeal.ads.adapters.mintegral.native_ad;

import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements OnMBMediaViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f12508a;

    public c(UnifiedNativeCallback unifiedNativeCallback) {
        this.f12508a = unifiedNativeCallback;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onEnterFullscreen() {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onExitFullscreen() {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onFinishRedirection(Campaign campaign, String str) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f12508a.onAdClicked();
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onStartRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoAdClicked(Campaign campaign) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoStart() {
    }
}
