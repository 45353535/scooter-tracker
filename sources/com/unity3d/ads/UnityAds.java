package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004./01B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0018\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001c\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J$\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\u0004H\u0007J.\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0007J\u001c\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010$H\u0007J&\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0017\u001a\u0004\u0018\u00010$H\u0007J\u001c\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J&\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J0\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007R*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0012¨\u00062"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "()V", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "isInitialized", "isInitialized$annotations", "isSupported", "isSupported$annotations", "token", "", "getToken$annotations", "getToken", "()Ljava/lang/String;", "version", "getVersion$annotations", "getVersion", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "configuration", "Lcom/unity3d/ads/TokenConfiguration;", MobileAdsBridgeBase.initializeMethodName, POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", AndroidGetAdPlayerContext.KEY_GAME_ID, "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "testMode", "load", "placementId", "Lcom/unity3d/ads/IUnityAdsLoadListener;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", C4424m2.f43623v, "activity", "Landroid/app/Activity;", "showListener", "Lcom/unity3d/ads/IUnityAdsShowListener;", "options", "Lcom/unity3d/ads/UnityAdsShowOptions;", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowCompletionState", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAds {

    @NotNull
    public static final UnityAds INSTANCE = new UnityAds();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @Nullable
    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$30$lambda$29$lambda$28(IUnityAdsTokenListener tokenListener) {
        Intrinsics.checkNotNullParameter(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$33$lambda$32(IUnityAdsTokenListener listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }

    @NotNull
    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(@Nullable String placementId) {
        try {
            Result.Companion companion = Result.f93230c;
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(@NotNull String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(@NotNull String placementId2, @NotNull UnityAds.UnityAdsLoadError error, @NotNull String message) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            });
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$26$lambda$25$lambda$24(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void setDebugMode(boolean z10) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().setDebugMode(z10);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener listener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }

    public static final void getToken(@Nullable final IUnityAdsTokenListener listener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().getToken(listener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.a
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.getToken$lambda$30$lambda$29$lambda$28(listener);
            }
        });
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, @Nullable final IUnityAdsInitializationListener initializationListener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        final Throwable thG = Result.g(objB);
        if (thG == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(initializationListener, thG);
            }
        });
    }

    public static final void load(@Nullable final String placementId, @Nullable final IUnityAdsLoadListener listener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().load(placementId, new UnityAdsLoadOptions(), listener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        final Throwable thG = Result.g(objB);
        if (thG == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(listener, placementId, thG);
            }
        });
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable IUnityAdsShowListener showListener) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    public static final void getToken(@NotNull TokenConfiguration configuration, @NotNull final IUnityAdsTokenListener listener) {
        Object objB;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAds.getToken$lambda$33$lambda$32(listener);
                }
            });
        }
    }

    public static final void show(@Nullable Activity activity, @Nullable String placementId, @Nullable UnityAdsShowOptions options) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode) {
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    public static final void load(@Nullable final String placementId, @Nullable UnityAdsLoadOptions loadOptions, @Nullable final IUnityAdsLoadListener listener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        final Throwable thG = Result.g(objB);
        if (thG == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.g
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$26$lambda$25$lambda$24(listener, placementId, thG);
            }
        });
    }

    public static final void show(@Nullable Activity activity, @Nullable final String placementId, @Nullable UnityAdsShowOptions options, @Nullable final IUnityAdsShowListener showListener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        final Throwable thG = Result.g(objB);
        if (thG == null || showListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(showListener, placementId, thG);
            }
        });
    }

    public static final void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable final IUnityAdsInitializationListener initializationListener) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        final Throwable thG = Result.g(objB);
        if (thG == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(initializationListener, thG);
            }
        });
    }
}
