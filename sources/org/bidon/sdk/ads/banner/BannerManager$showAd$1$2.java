package org.bidon.sdk.ads.banner;

import android.app.Activity;
import kotlin.Metadata;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"org/bidon/sdk/ads/banner/BannerManager$showAd$1$2", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderListener;", "onRendered", "", "onRenderFailed", "onVisibilityIssued", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerManager$showAd$1$2 implements AdRenderer.RenderListener {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ BannerView $bannerView;
    final /* synthetic */ BannerManager this$0;

    BannerManager$showAd$1$2(BannerManager bannerManager, Activity activity, BannerView bannerView) {
        this.this$0 = bannerManager;
        this.$activity = activity;
        this.$bannerView = bannerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVisibilityIssued$lambda$0(BannerView bannerView, BannerManager bannerManager) {
        bannerView.destroyAd();
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onAdShowFailed(BidonError.AdNotReady.INSTANCE);
        }
        LogExtKt.logInfo(bannerManager.getTag(), "RenderListener.onVisibilityIssued");
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderListener
    public void onRenderFailed() {
        LogExtKt.logInfo(this.this$0.getTag(), "RenderListener.onRenderFailed");
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderListener
    public void onRendered() {
        LogExtKt.logInfo(this.this$0.getTag(), "RenderListener.onRendered");
        this.this$0.isDisplaying = true;
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderListener
    public void onVisibilityIssued() {
        Activity activity = this.$activity;
        final BannerView bannerView = this.$bannerView;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.n
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$2.onVisibilityIssued$lambda$0(bannerView, bannerManager);
            }
        });
    }
}
