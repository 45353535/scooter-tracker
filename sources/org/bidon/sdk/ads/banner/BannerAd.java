package org.bidon.sdk.ads.banner;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.stats.WinLossNotifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\bH&J\b\u0010\u0013\u001a\u00020\bH&J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerAd;", "Lorg/bidon/sdk/stats/WinLossNotifier;", "Lorg/bidon/sdk/databinders/extras/Extras;", C4240b4.i.O, "Lorg/bidon/sdk/ads/banner/AdSize;", "getAdSize", "()Lorg/bidon/sdk/ads/banner/AdSize;", "setBannerFormat", "", "bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "loadAd", "activity", "Landroid/app/Activity;", "pricefloor", "", "isReady", "", "showAd", "destroyAd", "setBannerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/bidon/sdk/ads/banner/BannerListener;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BannerAd extends WinLossNotifier, Extras {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void loadAd$default(BannerAd bannerAd, Activity activity, double d10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
            }
            if ((i10 & 2) != 0) {
                d10 = 0.0d;
            }
            bannerAd.loadAd(activity, d10);
        }
    }

    void destroyAd();

    @Nullable
    AdSize getAdSize();

    boolean isReady();

    void loadAd(@NotNull Activity activity, double pricefloor);

    void setBannerFormat(@NotNull BannerFormat bannerFormat);

    void setBannerListener(@Nullable BannerListener listener);

    void showAd();
}
