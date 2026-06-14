package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.model.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/VungleAds;", "", "()V", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleAds {

    @NotNull
    public static final String TAG = "VungleAds";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static VungleInternal vungleInternal = new VungleInternal();

    @NotNull
    private static VungleInitializer initializer = new VungleInitializer();

    @NotNull
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/VungleAds$Companion;", "", "()V", "TAG", "", "firstPartyData", "Lcom/vungle/ads/fpd/FirstPartyData;", "initializer", "Lcom/vungle/ads/internal/VungleInitializer;", "vungleInternal", "Lcom/vungle/ads/internal/VungleInternal;", "deInit", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getBiddingToken", "callback", "Lcom/vungle/ads/BidTokenCallback;", "getSdkVersion", "init", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/vungle/ads/InitializationListener;", "isInitialized", "", "isInline", "placementId", "setIntegrationName", "wrapperFramework", "Lcom/vungle/ads/VungleWrapperFramework;", "wrapperFrameworkVersion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deInit(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final void getBiddingToken(@NotNull Context context, @NotNull BidTokenCallback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            VungleAds.vungleInternal.getAvailableBidTokensAsync(context, callback);
        }

        @NotNull
        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(@NotNull Context context, @NotNull String appId, @NotNull InitializationListener callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            vungleInitializer.init(appId, context, callback);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final boolean isInline(@NotNull String placementId) {
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final void setIntegrationName(@NotNull VungleWrapperFramework wrapperFramework, @NotNull String wrapperFrameworkVersion) {
            Intrinsics.checkNotNullParameter(wrapperFramework, "wrapperFramework");
            Intrinsics.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
            VungleAds.initializer.setIntegrationName(wrapperFramework, wrapperFrameworkVersion);
        }

        private Companion() {
        }
    }

    public static final void deInit(@NotNull Context context) {
        INSTANCE.deInit(context);
    }

    public static final void getBiddingToken(@NotNull Context context, @NotNull BidTokenCallback bidTokenCallback) {
        INSTANCE.getBiddingToken(context, bidTokenCallback);
    }

    @NotNull
    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    public static final void init(@NotNull Context context, @NotNull String str, @NotNull InitializationListener initializationListener) {
        INSTANCE.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public static final boolean isInline(@NotNull String str) {
        return INSTANCE.isInline(str);
    }

    public static final void setIntegrationName(@NotNull VungleWrapperFramework vungleWrapperFramework, @NotNull String str) {
        INSTANCE.setIntegrationName(vungleWrapperFramework, str);
    }
}
