package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.annotation.MainThread;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.fn3;
import yads.iq3;
import yads.j00;
import yads.pr3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoader;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoadListener;", "loadListener", "", "setAdLoadListener", "(Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoadListener;)V", "Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "adRequestConfiguration", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequestConfiguration;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
@MainThread
public final class InterstitialAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fn3 f68258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j00 f68259b;

    public InterstitialAdLoader(@NotNull Context context) {
        pr3 pr3Var = new pr3(context);
        this.f68258a = new fn3();
        this.f68259b = new j00(context, pr3Var);
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        this.f68259b.f112207a.a(this.f68258a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable InterstitialAdLoadListener loadListener) {
        this.f68259b.f112207a.a(loadListener != null ? new iq3(loadListener) : null);
    }
}
