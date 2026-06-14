package com.appodeal.ads.unified;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.nativead.NativeAdView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\tH&¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/unified/AdNetworkConnector;", "", "obtainIconView", "Landroid/view/View;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "obtainMediaView", "obtainAdChoice", "processClick", "", "clickTrackListener", "Lkotlin/Function1;", "Lcom/appodeal/ads/unified/UnifiedAdCallbackClickTrackListener;", "onRegisterForInteraction", "nativeAdView", "Lcom/appodeal/ads/nativead/NativeAdView;", "onUnregisterForInteraction", "containsVideo", "", "onDestroy", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdNetworkConnector {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onRegisterForInteraction(@NotNull AdNetworkConnector adNetworkConnector, @NotNull NativeAdView nativeAdView) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        }

        public static void onUnregisterForInteraction(@NotNull AdNetworkConnector adNetworkConnector, @NotNull NativeAdView nativeAdView) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        }

        public static void processClick(@NotNull AdNetworkConnector adNetworkConnector, @NotNull Function1<? super UnifiedAdCallbackClickTrackListener, Unit> clickTrackListener) {
            Intrinsics.checkNotNullParameter(clickTrackListener, "clickTrackListener");
        }
    }

    boolean containsVideo();

    @Nullable
    View obtainAdChoice(@NotNull Context context);

    @NotNull
    View obtainIconView(@NotNull Context context);

    @NotNull
    View obtainMediaView(@NotNull Context context);

    void onDestroy();

    void onRegisterForInteraction(@NotNull NativeAdView nativeAdView);

    void onUnregisterForInteraction(@NotNull NativeAdView nativeAdView);

    void processClick(@NotNull Function1<? super UnifiedAdCallbackClickTrackListener, Unit> clickTrackListener);
}
