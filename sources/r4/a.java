package r4;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static void a(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerAdClicked();
    }

    public static void b(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerAdLeftApplication();
    }

    public static void c(BannerSmashListener bannerSmashListener, IronSourceError ironSourceError, Map map) {
        bannerSmashListener.onBannerAdLoadFailed(ironSourceError);
    }

    public static void d(BannerSmashListener bannerSmashListener, View view, FrameLayout.LayoutParams layoutParams, Map map) {
        bannerSmashListener.onBannerAdLoaded(view, layoutParams);
    }

    public static void e(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerAdScreenDismissed();
    }

    public static void f(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerAdScreenPresented();
    }

    public static void g(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerAdShown();
    }

    public static void h(BannerSmashListener bannerSmashListener, IronSourceError ironSourceError, Map map) {
        bannerSmashListener.onBannerInitFailed(ironSourceError);
    }

    public static void i(BannerSmashListener bannerSmashListener, Map map) {
        bannerSmashListener.onBannerInitSuccess();
    }
}
