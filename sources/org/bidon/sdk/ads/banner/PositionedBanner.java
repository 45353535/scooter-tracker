package org.bidon.sdk.ads.banner;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.constraintlayout.motion.widget.Key;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H&J \u0010%\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH&J\b\u0010)\u001a\u00020\u000eH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006*"}, d2 = {"Lorg/bidon/sdk/ads/banner/PositionedBanner;", "", C4240b4.i.O, "Lorg/bidon/sdk/ads/banner/AdSize;", "getAdSize", "()Lorg/bidon/sdk/ads/banner/AdSize;", "isDisplaying", "", "()Z", "bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "setPosition", "", C4240b4.i.L, "Lorg/bidon/sdk/ads/banner/BannerPosition;", "setCustomPosition", "offset", "Landroid/graphics/Point;", Key.ROTATION, "", "anchor", "Landroid/graphics/PointF;", "setBannerFormat", "loadAd", "activity", "Landroid/app/Activity;", "pricefloor", "", "isReady", "showAd", "hideAd", "destroyAd", "setBannerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/bidon/sdk/ads/banner/BannerListener;", "notifyLoss", "winnerDemandId", "", "winnerPrice", "notifyWin", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PositionedBanner {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void loadAd$default(PositionedBanner positionedBanner, Activity activity, double d10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
            }
            if ((i10 & 2) != 0) {
                d10 = 0.0d;
            }
            positionedBanner.loadAd(activity, d10);
        }
    }

    void destroyAd(@NotNull Activity activity);

    @Nullable
    AdSize getAdSize();

    @NotNull
    BannerFormat getBannerFormat();

    void hideAd(@NotNull Activity activity);

    boolean isDisplaying();

    boolean isReady();

    void loadAd(@NotNull Activity activity, double pricefloor);

    void notifyLoss(@NotNull Activity activity, @NotNull String winnerDemandId, double winnerPrice);

    void notifyWin();

    void setBannerFormat(@NotNull BannerFormat bannerFormat);

    void setBannerListener(@Nullable BannerListener listener);

    void setCustomPosition(@NotNull Point offset, int rotation, @NotNull PointF anchor);

    void setPosition(@NotNull BannerPosition position);

    void showAd(@NotNull Activity activity);
}
