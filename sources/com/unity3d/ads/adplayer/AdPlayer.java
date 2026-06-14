package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.ironsource.C4329g8;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import hg.c0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.i;
import lf.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 E2\u00020\u0001:\u0001EJ+\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010 J\u001b\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001b\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u00052\u0006\u0010#\u001a\u00020&H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u00052\u0006\u0010#\u001a\u00020)H¦@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u00052\u0006\u0010#\u001a\u00020,H¦@ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<078&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010:R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?078&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B078&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer;", "", "", "", "unityAdsShowOptions", "", "requestShow", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", C4424m2.f43623v, "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", C4329g8.f43166k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "sendUserConsentChange", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/c;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "()Lkotlinx/coroutines/flow/Flow;", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/adplayer/AdPlayer$Companion;", "", "()V", "OFFERWALL_EVENT_QUEUE_SIZE", "", "SCAR_EVENT_QUEUE_SIZE", "broadcastEventChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getBroadcastEventChannel", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final int OFFERWALL_EVENT_QUEUE_SIZE = 5;
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final MutableSharedFlow broadcastEventChannel = c0.b(0, 0, null, 7, null);

        private Companion() {
        }

        @NotNull
        public final MutableSharedFlow getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull Continuation continuation) {
            i.f(adPlayer.getScope(), null, 1, null);
            return Unit.f93236a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new n(null, 1, null);
        }
    }

    @CallSuper
    @Nullable
    Object destroy(@NotNull Continuation continuation);

    void dispatchShowCompleted();

    @NotNull
    Flow getOnLoadEvent();

    @NotNull
    Flow getOnOfferwallEvent();

    @NotNull
    Flow getOnScarEvent();

    @NotNull
    Flow getOnShowEvent();

    @NotNull
    CoroutineScope getScope();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull Continuation continuation);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull Continuation continuation);

    @Nullable
    Object sendActivityDestroyed(@NotNull Continuation continuation);

    @Nullable
    Object sendFocusChange(boolean z10, @NotNull Continuation continuation);

    @Nullable
    Object sendGmaEvent(@NotNull com.unity3d.scar.adapter.common.c cVar, @NotNull Continuation continuation);

    @Nullable
    Object sendMuteChange(boolean z10, @NotNull Continuation continuation);

    @Nullable
    Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull Continuation continuation);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull Continuation continuation);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull Continuation continuation);

    @Nullable
    Object sendVisibilityChange(boolean z10, @NotNull Continuation continuation);

    @Nullable
    Object sendVolumeChange(double d10, @NotNull Continuation continuation);

    void show(@NotNull ShowOptions showOptions);
}
