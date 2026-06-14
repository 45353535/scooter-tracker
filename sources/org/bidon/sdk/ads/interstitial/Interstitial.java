package org.bidon.sdk.ads.interstitial;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.stats.WinLossNotifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/ads/interstitial/Interstitial;", "Lorg/bidon/sdk/databinders/extras/Extras;", "Lorg/bidon/sdk/stats/WinLossNotifier;", "loadAd", "", "activity", "Landroid/app/Activity;", "pricefloor", "", "destroyAd", "isReady", "", "showAd", "setInterstitialListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/bidon/sdk/ads/interstitial/InterstitialListener;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Interstitial extends Extras, WinLossNotifier {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void loadAd$default(Interstitial interstitial, Activity activity, double d10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAd");
            }
            if ((i10 & 2) != 0) {
                d10 = 0.0d;
            }
            interstitial.loadAd(activity, d10);
        }
    }

    void destroyAd();

    boolean isReady();

    void loadAd(@NotNull Activity activity, double pricefloor);

    void setInterstitialListener(@NotNull InterstitialListener listener);

    void showAd(@NotNull Activity activity);
}
