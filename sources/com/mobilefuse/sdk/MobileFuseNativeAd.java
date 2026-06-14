package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.mobilefuse.adsession.AdEvents;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.iab.omid.library.mobilefuse.adsession.CreativeType;
import com.ironsource.Df;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.config.Apply_BidResponse_to_ObservableConfigKt;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.controllers.AdLoadingController;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.internal.repository.AdLoadingConfig;
import com.mobilefuse.sdk.internal.repository.BiddingAdRepository;
import com.mobilefuse.sdk.internal.repository.MfxAdRepository;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.nativeads.NativeAdMarkup;
import com.mobilefuse.sdk.nativeads.NativeAdParser;
import com.mobilefuse.sdk.nativeads.NativeAsset;
import com.mobilefuse.sdk.nativeads.NativeEventTracker;
import com.mobilefuse.sdk.nativeads.NativeEventTrackerType;
import com.mobilefuse.sdk.nativeads.NativeImgAsset;
import com.mobilefuse.sdk.nativeads.NativeTextAsset;
import com.mobilefuse.sdk.nativeads.NativeVideoAsset;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.omid.OmidService;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.state.AdState;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypesKt;
import com.mobilefuse.sdk.tracking.ViewVisibilityTracker;
import com.mobilefuse.sdk.utils.PlacementUtil;
import com.mobilefuse.sdk.utils.StartActivityFromUrlKt;
import com.mobilefuse.sdk.vast.endcard.BaseVastEndCardScheduler;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.model.VastError;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0081\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010>\u001a\u00020?H\u0002J\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020AH\u0002J\r\u0010C\u001a\u0004\u0018\u00010D¢\u0006\u0002\u0010EJ\u0012\u0010F\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u0007H\u0007J\u0012\u0010H\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u0007H\u0007J\u0012\u0010I\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u0007H\u0007J\b\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u0004\u0018\u00010MJ\b\u0010N\u001a\u0004\u0018\u00010OJ\b\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u0004\u0018\u00010\u0019J\u0010\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020\u0007H\u0002J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0018H\u0002J\b\u0010W\u001a\u0004\u0018\u00010\u0019J\b\u0010X\u001a\u0004\u0018\u00010OJ\b\u0010Y\u001a\u0004\u0018\u00010\u0019J\b\u0010Z\u001a\u0004\u0018\u00010[J\u0006\u0010\\\u001a\u00020\u0019J\u0012\u0010]\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u0007H\u0007J\u0018\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020`2\u0006\u0010G\u001a\u00020\u0007H\u0002J\u0012\u0010a\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020\u0007H\u0007J\u0010\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020VH\u0002J\u0010\u0010e\u001a\u00020c2\u0006\u0010d\u001a\u00020VH\u0002J\n\u0010f\u001a\u0004\u0018\u00010gH\u0016J\b\u0010h\u001a\u00020AH\u0002J\b\u0010i\u001a\u00020AH\u0002J\u0010\u0010j\u001a\u00020#2\u0006\u0010_\u001a\u00020`H\u0002J\u0006\u0010k\u001a\u00020AJ\u000e\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020\u0007J\b\u0010n\u001a\u00020AH\u0002J\b\u0010o\u001a\u00020AH\u0002J\u0018\u0010p\u001a\u00020A2\u0006\u00102\u001a\u00020q2\u0006\u0010m\u001a\u00020rH\u0002J\b\u0010s\u001a\u00020AH\u0002J\u0010\u0010t\u001a\u00020A2\u0006\u0010T\u001a\u00020\u0007H\u0002J\b\u0010u\u001a\u00020AH\u0002J\b\u0010v\u001a\u00020AH\u0002J\b\u0010w\u001a\u00020AH\u0002J\u001c\u0010x\u001a\u00020A2\u0006\u0010y\u001a\u00020\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0010\u0010z\u001a\u00020A2\u0006\u0010d\u001a\u00020VH\u0002J\u0010\u0010{\u001a\u00020A2\u0006\u0010|\u001a\u00020\u0007H\u0002J\u000e\u0010}\u001a\u00020A2\u0006\u0010\r\u001a\u00020DJ\u0010\u0010~\u001a\u00020A2\b\u0010\u007f\u001a\u0004\u0018\u00010\u0002J\u0007\u0010\u0080\u0001\u001a\u00020AR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0011\u0010%\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0011\u0010(\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010)\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0011\u0010*\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010+\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010/\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b/\u0010$R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseNativeAd;", "Lcom/mobilefuse/sdk/MobileFuseBaseAd;", "Lcom/mobilefuse/sdk/MobileFuseNativeAd$Listener;", "Lcom/mobilefuse/sdk/WinningBidInfoSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "placement", "", "(Landroid/content/Context;Ljava/lang/String;)V", "activityLifecycleObserver", "Lcom/mobilefuse/sdk/AppLifecycleHelper$ActivityLifecycleObserver;", "adEvents", "Lcom/iab/omid/library/mobilefuse/adsession/AdEvents;", "value", "adListener", "getAdListener$annotations", "()V", "getAdListener", "()Lcom/mobilefuse/sdk/MobileFuseNativeAd$Listener;", "setAdListener", "(Lcom/mobilefuse/sdk/MobileFuseNativeAd$Listener;)V", "adSession", "Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "clickableViews", "", "Landroid/view/View;", "containerView", "getContext", "()Landroid/content/Context;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "handler", "Landroid/os/Handler;", "hasCtaButtonText", "", "()Z", "hasDescriptionText", "hasDisplayUrl", "hasIcon", "hasMainImage", "hasMainVideo", "hasSponsoredText", "hasTitle", "iconBitmap", "Landroid/graphics/Bitmap;", "impressionTrackersSent", "isTestMode", "loadingController", "Lcom/mobilefuse/sdk/controllers/AdLoadingController;", "markup", "Lcom/mobilefuse/sdk/nativeads/NativeAdMarkup;", "player", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "getPlayer", "()Lcom/mobilefuse/videoplayer/VideoPlayer;", "player$delegate", "Lkotlin/Lazy;", "rtbCacheExpired", "Ljava/lang/Runnable;", "visibilityTracker", "Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker;", "buildAdLoadingConfig", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "clearBidFloor", "", "configureVideoPlayerConfig", "getBidFloor", "", "()Ljava/lang/Float;", "getCtaButtonText", "default", "getDescriptionText", "getDisplayUrl", "getDrawableBitmap", "Landroid/graphics/drawable/BitmapDrawable;", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "getIconImage", "Lcom/mobilefuse/sdk/nativeads/NativeImgAsset;", "getIconImageView", "Landroid/widget/ImageView;", "getIconView", "getImageView", "url", "getImpressionEventTrackers", "Lcom/mobilefuse/sdk/nativeads/NativeEventTracker;", "getMainContentView", "getMainImage", "getMainImageView", "getMainVideo", "Lcom/mobilefuse/sdk/nativeads/NativeVideoAsset;", "getMainVideoView", "getSponsoredText", "getText", "asset", "Lcom/mobilefuse/sdk/NativeAssetId;", "getTitle", "getVisibilityPercentFromEvent", "", "nativeEventTracker", "getVisibilityTimeFromEvent", "getWinningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "handleContentAttachedToWindow", "handleLoadingControllerStateChange", "hasAsset", "loadAd", "loadAdFromBiddingToken", "bidResponse", "onAdLoaded", "onAdShown", "onReceiveMarkup", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "playVideo", "preloadIcon", "registerClickViews", "registerContentView", "registerEventTrackers", "registerViewForInteraction", "container", "sendEventTracker", "sendUrlTracker", "urlTracker", "setBidFloor", "setListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterViews", "Listener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseNativeAd extends MobileFuseBaseAd<Listener> implements WinningBidInfoSource {
    private AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver;
    private AdEvents adEvents;

    @Nullable
    private Listener adListener;
    private AdSession adSession;
    private List<? extends View> clickableViews;
    private View containerView;

    @NotNull
    private final Context context;
    private final ExecutorService executor;
    private final Handler handler;
    private Bitmap iconBitmap;
    private boolean impressionTrackersSent;
    private final AdLoadingController loadingController;
    private NativeAdMarkup markup;

    /* JADX INFO: renamed from: player$delegate, reason: from kotlin metadata */
    private final Lazy player;
    private final Runnable rtbCacheExpired;
    private ViewVisibilityTracker visibilityTracker;

    /* JADX INFO: renamed from: com.mobilefuse.sdk.MobileFuseNativeAd$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "p1", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "p2", "", "invoke", "(Lcom/mobilefuse/sdk/component/ParsedAdMarkup;Lcom/mobilefuse/sdk/network/model/MfxBidResponse;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.y implements Function2<ParsedAdMarkup, MfxBidResponse, Unit> {
        AnonymousClass2(MobileFuseNativeAd mobileFuseNativeAd) {
            super(2, mobileFuseNativeAd, MobileFuseNativeAd.class, "onReceiveMarkup", "onReceiveMarkup(Lcom/mobilefuse/sdk/component/ParsedAdMarkup;Lcom/mobilefuse/sdk/network/model/MfxBidResponse;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ParsedAdMarkup parsedAdMarkup, MfxBidResponse mfxBidResponse) {
            invoke2(parsedAdMarkup, mfxBidResponse);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ParsedAdMarkup p12, @NotNull MfxBidResponse p22) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            ((MobileFuseNativeAd) this.receiver).onReceiveMarkup(p12, p22);
        }
    }

    /* JADX INFO: renamed from: com.mobilefuse.sdk.MobileFuseNativeAd$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.y implements Function0<Unit> {
        AnonymousClass3(MobileFuseNativeAd mobileFuseNativeAd) {
            super(0, mobileFuseNativeAd, MobileFuseNativeAd.class, "handleLoadingControllerStateChange", "handleLoadingControllerStateChange()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((MobileFuseNativeAd) this.receiver).handleLoadingControllerStateChange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseNativeAd$Listener;", "Lcom/mobilefuse/sdk/LoadableAdListener;", Df.f40645f, "", "onAdRendered", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface Listener extends LoadableAdListener {
        void onAdClicked();

        void onAdRendered();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseNativeAd(@NotNull Context context, @NotNull String placement) {
        super(placement, MobileFuseNativeAdKt.AD_TYPE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.context = context;
        AdLoadingController adLoadingController = new AdLoadingController();
        this.loadingController = adLoadingController;
        this.executor = Executors.newSingleThreadExecutor();
        this.clickableViews = CollectionsKt.emptyList();
        this.player = lf.i.a(new Function0<VideoPlayer>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$player$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final VideoPlayer invoke() {
                VideoPlayer videoPlayer = new VideoPlayer(this.this$0.getContext());
                videoPlayer.setMuteAllowed();
                return videoPlayer;
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        this.rtbCacheExpired = new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$rtbCacheExpired$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    DebuggingKt.logDebug$default(this.this$0, "RTB cache expired", null, 2, null);
                    this.this$0.setState(AdState.RTB_EXPIRED);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this.this$0, th2);
                }
            }
        };
        adLoadingController.setOnError(new Function1<AdError, Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AdError adError) {
                invoke2(adError);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AdError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Listener listener = MobileFuseNativeAd.this.getListener();
                if (listener != null) {
                    listener.onAdError(error);
                }
            }
        });
        adLoadingController.setOnMarkupReceived(new AnonymousClass2(this));
        adLoadingController.setOnStateChanged(new AnonymousClass3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdLoadingConfig buildAdLoadingConfig() {
        return new AdLoadingConfig(AdLoadingConfig.INSTANCE.nextConfigUid(), getObservableConfig(), 1, 1, isTestMode(), MobileFuseNativeAdKt.AD_TYPE, getPlacementId(), getAdInstanceInfo().getInstanceId());
    }

    private final void configureVideoPlayerConfig() throws Throwable {
        getObservableConfig().setValue(ObservableConfigKey.MUTE_ENABLED, Boolean.TRUE);
        getPlayer().setMuted(getObservableConfig().getBooleanValue(ObservableConfigKey.MUTED));
        getPlayer().setMuteChangedListener(new MuteChangedListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.configureVideoPlayerConfig.1
            @Override // com.mobilefuse.sdk.MuteChangedListener
            public final void onMutedChanged(boolean z10) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    MobileFuseNativeAd.this.getObservableConfig().setValue(ObservableConfigKey.MUTED, Boolean.valueOf(z10));
                } catch (Throwable th2) {
                    int i10 = MobileFuseNativeAd$configureVideoPlayerConfig$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new lf.m();
                    }
                }
            }
        });
        ObservableConfig observableConfig = getObservableConfig();
        ObservableConfigKey observableConfigKey = ObservableConfigKey.ENDCARD_CLOSABLE;
        getPlayer().setEndCardScheduler(new BaseVastEndCardScheduler(getObservableConfig().getFloatValue(ObservableConfigKey.END_CARD_CLOSE_SECONDS, 0.0f), observableConfig.hasValue(observableConfigKey) ? getObservableConfig().getBooleanValue(observableConfigKey) : false));
        int intValue = getObservableConfig().getIntValue(ObservableConfigKey.MAX_END_CARDS, 1);
        if (intValue >= 0) {
            getPlayer().setMaxEndCardsToShow(intValue);
        }
        ObservableConfig observableConfig2 = getObservableConfig();
        ObservableConfigKey observableConfigKey2 = ObservableConfigKey.VIDEO_CLICK_THROUGH_BEHAVIOUR;
        if (observableConfig2.hasValue(observableConfigKey2)) {
            Object value = getObservableConfig().getValue(observableConfigKey2);
            if (value instanceof ClickthroughBehaviour) {
                getPlayer().setClickthroughBehaviour((ClickthroughBehaviour) value);
            }
        }
        ObservableConfig observableConfig3 = getObservableConfig();
        ObservableConfigKey observableConfigKey3 = ObservableConfigKey.FORCE_SKIP_SECONDS;
        if (observableConfig3.hasValue(observableConfigKey3)) {
            float floatValue = getObservableConfig().getFloatValue(observableConfigKey3, -1.0f);
            if (floatValue > -1) {
                getPlayer().setForceSkipSeconds(floatValue);
            }
        }
        ObservableConfig observableConfig4 = getObservableConfig();
        ObservableConfigKey observableConfigKey4 = ObservableConfigKey.BLOCK_SKIP_SECONDS;
        if (observableConfig4.hasValue(observableConfigKey4)) {
            float floatValue2 = getObservableConfig().getFloatValue(observableConfigKey4, -1.0f);
            if (floatValue2 > -1) {
                getPlayer().setBlockSkipSeconds(floatValue2);
            }
        }
    }

    public static /* synthetic */ void getAdListener$annotations() {
    }

    public static /* synthetic */ String getCtaButtonText$default(MobileFuseNativeAd mobileFuseNativeAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Learn More";
        }
        return mobileFuseNativeAd.getCtaButtonText(str);
    }

    public static /* synthetic */ String getDescriptionText$default(MobileFuseNativeAd mobileFuseNativeAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return mobileFuseNativeAd.getDescriptionText(str);
    }

    public static /* synthetic */ String getDisplayUrl$default(MobileFuseNativeAd mobileFuseNativeAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return mobileFuseNativeAd.getDisplayUrl(str);
    }

    private final BitmapDrawable getDrawableBitmap() {
        onAdShown();
        return new BitmapDrawable(this.context.getResources(), this.iconBitmap);
    }

    private final ImageView getIconImageView() {
        onAdShown();
        final ImageView imageView = new ImageView(this.context);
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.getIconImageView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                imageView.setImageBitmap(MobileFuseNativeAd.this.iconBitmap);
            }
        }, 1, null);
        return imageView;
    }

    private final ImageView getImageView(final String url) {
        onAdShown();
        final ImageView imageView = new ImageView(this.context);
        this.executor.execute(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.getImageView.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URL(url).openConnection().getInputStream());
                    SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.getImageView.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            imageView.setImageBitmap(bitmapDecodeStream);
                        }
                    }, 1, null);
                } catch (Exception e10) {
                    StabilityHelper.logException(MobileFuseNativeAd.this, e10);
                }
            }
        });
        return imageView;
    }

    private final List<NativeEventTracker> getImpressionEventTrackers() {
        ArrayList arrayList = new ArrayList();
        NativeAdMarkup nativeAdMarkup = this.markup;
        if (nativeAdMarkup != null) {
            for (NativeEventTracker nativeEventTracker : nativeAdMarkup.getEventTrackers()) {
                if (nativeEventTracker.getEvent() == NativeEventTrackerType.IMPRESSION) {
                    arrayList.add(nativeEventTracker);
                }
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoPlayer getPlayer() {
        return (VideoPlayer) this.player.getValue();
    }

    public static /* synthetic */ String getSponsoredText$default(MobileFuseNativeAd mobileFuseNativeAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "(Sponsored)";
        }
        return mobileFuseNativeAd.getSponsoredText(str);
    }

    private final String getText(NativeAssetId asset, String str) {
        NativeAsset next;
        String text;
        onAdShown();
        NativeAdMarkup nativeAdMarkup = this.markup;
        if (nativeAdMarkup != null) {
            int id2 = asset.getId();
            Iterator<NativeAsset> it = nativeAdMarkup.getAssets().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getId() == id2 && (next instanceof NativeTextAsset)) {
                    break;
                }
            }
            NativeTextAsset nativeTextAsset = (NativeTextAsset) next;
            if (nativeTextAsset != null && (text = nativeTextAsset.getText()) != null) {
                return text;
            }
        }
        return str;
    }

    public static /* synthetic */ String getTitle$default(MobileFuseNativeAd mobileFuseNativeAd, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return mobileFuseNativeAd.getTitle(str);
    }

    private final int getVisibilityPercentFromEvent(NativeEventTracker nativeEventTracker) {
        return (nativeEventTracker.getEvent() == NativeEventTrackerType.VIEWABLE_MRC_50 || nativeEventTracker.getEvent() == NativeEventTrackerType.VIEWABLE_VIDEO_50) ? 50 : 100;
    }

    private final int getVisibilityTimeFromEvent(NativeEventTracker nativeEventTracker) {
        return (nativeEventTracker.getEvent() == NativeEventTrackerType.VIEWABLE_MRC_50 || nativeEventTracker.getEvent() == NativeEventTrackerType.VIEWABLE_MRC_100) ? 1000 : 2000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContentAttachedToWindow() {
        if (getState() != AdState.LOADED) {
            return;
        }
        Listener listener = getListener();
        if (listener != null) {
            listener.onAdRendered();
        }
        if (getImpressionEventTrackers().isEmpty() || this.impressionTrackersSent) {
            return;
        }
        this.impressionTrackersSent = true;
        Iterator<NativeEventTracker> it = getImpressionEventTrackers().iterator();
        while (it.hasNext()) {
            sendEventTracker(it.next());
        }
        NativeAdMarkup nativeAdMarkup = this.markup;
        if (nativeAdMarkup != null) {
            Iterator<String> it2 = nativeAdMarkup.getImpTrackers().iterator();
            while (it2.hasNext()) {
                sendUrlTracker(it2.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadingControllerStateChange() {
        if (this.loadingController.getState() == AdState.LOADED) {
            return;
        }
        setState(this.loadingController.getState());
    }

    private final boolean hasAsset(NativeAssetId asset) {
        NativeAsset next;
        NativeAdMarkup nativeAdMarkup = this.markup;
        if (nativeAdMarkup == null) {
            return false;
        }
        int id2 = asset.getId();
        Iterator<NativeAsset> it = nativeAdMarkup.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getId() == id2) {
                break;
            }
        }
        return next != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdLoaded() {
        setState(AdState.LOADED);
        View view = this.containerView;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        handleContentAttachedToWindow();
    }

    private final void onAdShown() {
        this.handler.removeCallbacks(this.rtbCacheExpired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReceiveMarkup(ParsedAdMarkup markup, MfxBidResponse bidResponse) {
        if (!(markup instanceof NativeAdMarkup)) {
            DebuggingKt.logDebug$default(this, "Ad markup was not native ad! " + markup.getAdm(), null, 2, null);
            Listener listener = getListener();
            if (listener != null) {
                listener.onAdError(AdError.AD_LOAD_ERROR);
                return;
            }
            return;
        }
        this.markup = (NativeAdMarkup) markup;
        Apply_BidResponse_to_ObservableConfigKt.applyConfigFromBidResponse(getObservableConfig(), bidResponse);
        registerClickViews();
        registerEventTrackers();
        NativeImgAsset iconImage = getIconImage();
        if (iconImage != null) {
            preloadIcon(iconImage.getUrl());
        } else {
            onAdLoaded();
        }
        DebuggingKt.logDebug$default(this, "set rtb cache callback", null, 2, null);
        this.handler.postDelayed(this.rtbCacheExpired, ((long) bidResponse.getExpires()) * ((long) 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playVideo() throws Throwable {
        final Activity currentActivity = AppLifecycleHelper.getCurrentActivity();
        if (currentActivity != null) {
            AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$playVideo$$inlined$let$lambda$1
                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityPaused(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (activity != currentActivity) {
                        return;
                    }
                    this.getPlayer().onActivityPause();
                }

                @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
                public void onActivityResumed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (activity != currentActivity) {
                        return;
                    }
                    this.getPlayer().onActivityResume();
                }
            };
            AppLifecycleHelper.addActivityLifecycleObserver(activityLifecycleObserver);
            Unit unit = Unit.f93236a;
            this.activityLifecycleObserver = activityLifecycleObserver;
        }
        configureVideoPlayerConfig();
        getPlayer().play(currentActivity, new VideoPlayer.PlaybackListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.playVideo.2
            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onAdCompleted() {
                DebuggingKt.logDebug$default(this, "onAdCompleted", null, 2, null);
                MobileFuseNativeAd.this.getPlayer().destroy();
                AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver2 = MobileFuseNativeAd.this.activityLifecycleObserver;
                if (activityLifecycleObserver2 != null) {
                    AppLifecycleHelper.removeActivityLifecycleObserver(activityLifecycleObserver2);
                }
                MobileFuseNativeAd.this.activityLifecycleObserver = null;
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onClicked(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                DebuggingKt.logDebug$default(this, "onClicked with url " + url, null, 2, null);
                Listener listener = MobileFuseNativeAd.this.getListener();
                if (listener != null) {
                    listener.onAdClicked();
                }
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoCompleted() {
                DebuggingKt.logDebug$default(this, "onVideoCompleted", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoError() {
                DebuggingKt.logDebug$default(this, "onVideoError", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoFirstQuartile() {
                DebuggingKt.logDebug$default(this, "onVideoFirstQuartile", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoMidpoint() {
                DebuggingKt.logDebug$default(this, "onVideoMidpoint", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoPaused() {
                DebuggingKt.logDebug$default(this, "onVideoPaused", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoPlaying() {
                DebuggingKt.logDebug$default(this, "onVideoPlaying", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoSkipped() {
                DebuggingKt.logDebug$default(this, "onVideoSkipped", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoStarted() {
                DebuggingKt.logDebug$default(this, "onVideoStarted", null, 2, null);
            }

            @Override // com.mobilefuse.videoplayer.VideoPlayer.PlaybackListener
            public void onVideoThirdQuartile() {
                DebuggingKt.logDebug$default(this, "onVideoThirdQuartile", null, 2, null);
            }
        });
    }

    private final void preloadIcon(final String url) {
        this.executor.execute(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.preloadIcon.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    URL url2 = new URL(url);
                    MobileFuseNativeAd.this.iconBitmap = BitmapFactory.decodeStream(url2.openConnection().getInputStream());
                } catch (Exception e10) {
                    StabilityHelper.logException(MobileFuseNativeAd.this, e10);
                }
                SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.preloadIcon.1.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MobileFuseNativeAd.this.onAdLoaded();
                    }
                }, 1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerClickViews() {
        NativeAdMarkup nativeAdMarkup = this.markup;
        if (nativeAdMarkup == null) {
            return;
        }
        for (View view : this.clickableViews) {
            final String link = nativeAdMarkup.getLink();
            view.setOnClickListener(new View.OnClickListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.registerClickViews.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StartActivityFromUrlKt.startActivityFromUrl$default(MobileFuseNativeAd.this.getContext(), link, new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.registerClickViews.1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Listener listener = MobileFuseNativeAd.this.getListener();
                            if (listener != null) {
                                listener.onAdClicked();
                            }
                        }
                    }, null, 4, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerContentView() {
        final View view = this.containerView;
        if (view == null) {
            return;
        }
        AdSession nativeAdSession = OmidService.getNativeAdSession(this.context, view, CollectionsKt.emptyList(), CreativeType.NATIVE_DISPLAY.toString());
        this.adSession = nativeAdSession;
        if (nativeAdSession != null) {
            this.adEvents = AdEvents.createAdEvents(nativeAdSession);
            nativeAdSession.start();
        }
        this.visibilityTracker = new ViewVisibilityTracker(this.context, view);
        registerEventTrackers();
        if (view.isAttachedToWindow()) {
            DebuggingKt.logDebug$default(this, "container is attached to window", null, 2, null);
            handleContentAttachedToWindow();
        } else {
            DebuggingKt.logDebug$default(this, "container is NOT attached to window", null, 2, null);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.registerContentView.2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View p02) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    DebuggingKt.logDebug$default(this, "container was just attached to window", null, 2, null);
                    MobileFuseNativeAd.this.handleContentAttachedToWindow();
                    view.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View p02) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                }
            });
        }
    }

    private final void registerEventTrackers() {
        NativeAdMarkup nativeAdMarkup;
        ViewVisibilityTracker viewVisibilityTracker;
        if (this.containerView == null || (nativeAdMarkup = this.markup) == null) {
            return;
        }
        for (final NativeEventTracker nativeEventTracker : nativeAdMarkup.getEventTrackers()) {
            if (nativeEventTracker.getEvent() != NativeEventTrackerType.IMPRESSION && (viewVisibilityTracker = this.visibilityTracker) != null) {
                viewVisibilityTracker.registerTimedVisibilityListener(getVisibilityTimeFromEvent(nativeEventTracker), getVisibilityPercentFromEvent(nativeEventTracker), new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$registerEventTrackers$$inlined$let$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.sendEventTracker(nativeEventTracker);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEventTracker(final NativeEventTracker nativeEventTracker) {
        DebuggingKt.logDebug$default(this, "sending tracker request to " + nativeEventTracker.getUrl(), null, 2, null);
        HttpRequestTracker.logHttpRequest(nativeEventTracker.getUrl());
        this.executor.execute(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.sendEventTracker.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new URL(nativeEventTracker.getUrl()).getContent();
                } catch (Throwable th2) {
                    StabilityHelper.logException(MobileFuseNativeAd.this, th2);
                }
            }
        });
    }

    private final void sendUrlTracker(final String urlTracker) {
        DebuggingKt.logDebug$default(this, "sending URL tracker request to " + urlTracker, null, 2, null);
        HttpRequestTracker.logHttpRequest(urlTracker);
        this.executor.execute(new Runnable() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.sendUrlTracker.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    new URL(urlTracker).getContent();
                } catch (Throwable th2) {
                    StabilityHelper.logException(MobileFuseNativeAd.this, th2);
                }
            }
        });
    }

    public final void clearBidFloor() throws Throwable {
        PlacementUtil.clearBidFloor(getObservableConfig());
    }

    @Nullable
    public final Listener getAdListener() {
        return this.adListener;
    }

    @Nullable
    public final Float getBidFloor() {
        return getObservableConfig().getFloatValueOrNull(ObservableConfigKey.BID_FLOOR);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getCtaButtonText() {
        return getCtaButtonText$default(this, null, 1, null);
    }

    @NotNull
    public final String getDescriptionText() {
        return getDescriptionText$default(this, null, 1, null);
    }

    @NotNull
    public final String getDisplayUrl() {
        return getDisplayUrl$default(this, null, 1, null);
    }

    @Nullable
    public final Drawable getIconDrawable() {
        onAdShown();
        if (hasIcon()) {
            return getDrawableBitmap();
        }
        return null;
    }

    @Nullable
    public final NativeImgAsset getIconImage() {
        onAdShown();
        NativeAdMarkup nativeAdMarkup = this.markup;
        NativeAsset nativeAsset = null;
        if (nativeAdMarkup == null) {
            return null;
        }
        int id2 = NativeAssetId.ICON_IMAGE.getId();
        Iterator<NativeAsset> it = nativeAdMarkup.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NativeAsset next = it.next();
            if (next.getId() == id2 && (next instanceof NativeImgAsset)) {
                nativeAsset = next;
                break;
            }
        }
        return (NativeImgAsset) nativeAsset;
    }

    @Nullable
    public final View getIconView() {
        onAdShown();
        if (hasIcon()) {
            return getIconImageView();
        }
        return null;
    }

    @Nullable
    public final View getMainContentView() {
        onAdShown();
        if (hasMainImage()) {
            return getMainImageView();
        }
        if (hasMainVideo()) {
            return getMainVideoView();
        }
        return null;
    }

    @Nullable
    public final NativeImgAsset getMainImage() {
        onAdShown();
        NativeAdMarkup nativeAdMarkup = this.markup;
        NativeAsset nativeAsset = null;
        if (nativeAdMarkup == null) {
            return null;
        }
        int id2 = NativeAssetId.MAIN_IMAGE.getId();
        Iterator<NativeAsset> it = nativeAdMarkup.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NativeAsset next = it.next();
            if (next.getId() == id2 && (next instanceof NativeImgAsset)) {
                nativeAsset = next;
                break;
            }
        }
        return (NativeImgAsset) nativeAsset;
    }

    @Nullable
    public final View getMainImageView() {
        onAdShown();
        NativeImgAsset mainImage = getMainImage();
        if (mainImage != null) {
            return getImageView(mainImage.getUrl());
        }
        return null;
    }

    @Nullable
    public final NativeVideoAsset getMainVideo() {
        onAdShown();
        NativeAdMarkup nativeAdMarkup = this.markup;
        NativeAsset nativeAsset = null;
        if (nativeAdMarkup == null) {
            return null;
        }
        int id2 = NativeAssetId.VIDEO.getId();
        Iterator<NativeAsset> it = nativeAdMarkup.getAssets().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NativeAsset next = it.next();
            if (next.getId() == id2 && (next instanceof NativeVideoAsset)) {
                nativeAsset = next;
                break;
            }
        }
        return (NativeVideoAsset) nativeAsset;
    }

    @NotNull
    public final View getMainVideoView() {
        onAdShown();
        if (getPlayer().getPlayerState() != VideoPlayer.PlayerState.IDLE) {
            return getPlayer();
        }
        NativeVideoAsset mainVideo = getMainVideo();
        if (mainVideo != null) {
            getPlayer().loadVast(mainVideo.getVastTag(), new VideoPlayer.LoadListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1
                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onError(@Nullable VastError error) {
                }

                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onVideoLoaded() throws Throwable {
                    if (this.this$0.getPlayer().isAttachedToWindow() && this.this$0.getPlayer().hasWindowFocus()) {
                        this.this$0.playVideo();
                    } else if (this.this$0.getPlayer().isAttachedToWindow()) {
                        this.this$0.getPlayer().getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.2
                            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                            public void onWindowFocusChanged(boolean hasFocus) throws Throwable {
                                if (hasFocus) {
                                    MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.this.this$0.getPlayer().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                                    MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.this.this$0.playVideo();
                                }
                            }
                        });
                    } else {
                        this.this$0.getPlayer().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(@NotNull View p02) throws Throwable {
                                Intrinsics.checkNotNullParameter(p02, "p0");
                                MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.this.this$0.playVideo();
                                MobileFuseNativeAd$getMainVideoView$$inlined$let$lambda$1.this.this$0.getPlayer().removeOnAttachStateChangeListener(this);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(@NotNull View p02) {
                                Intrinsics.checkNotNullParameter(p02, "p0");
                            }
                        });
                    }
                }
            });
        }
        return getPlayer();
    }

    @NotNull
    public final String getSponsoredText() {
        return getSponsoredText$default(this, null, 1, null);
    }

    @NotNull
    public final String getTitle() {
        return getTitle$default(this, null, 1, null);
    }

    @Override // com.mobilefuse.sdk.WinningBidInfoSource
    @Nullable
    public WinningBidInfo getWinningBidInfo() {
        return this.loadingController.getWinningBidInfo();
    }

    public final boolean hasCtaButtonText() {
        return hasAsset(NativeAssetId.CTA_BUTTON_TEXT);
    }

    public final boolean hasDescriptionText() {
        return hasAsset(NativeAssetId.DESCRIPTION_TEXT);
    }

    public final boolean hasDisplayUrl() {
        return hasAsset(NativeAssetId.DISPLAY_URL);
    }

    public final boolean hasIcon() {
        return hasAsset(NativeAssetId.ICON_IMAGE) && this.iconBitmap != null;
    }

    public final boolean hasMainImage() {
        return hasAsset(NativeAssetId.MAIN_IMAGE);
    }

    public final boolean hasMainVideo() {
        return hasAsset(NativeAssetId.VIDEO);
    }

    public final boolean hasSponsoredText() {
        return hasAsset(NativeAssetId.SPONSORED_TEXT);
    }

    public final boolean hasTitle() {
        return hasAsset(NativeAssetId.AD_TITLE);
    }

    public final boolean isTestMode() {
        return getForcedTestMode() || MobileFuseSettings.isTestMode();
    }

    public final void loadAd() {
        MobileFuseServices.requireAllServices(new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.loadAd.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    MobileFuseNativeAd.this.getAdInstanceInfo().getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceLoadAdAction(MobileFuseNativeAd.this.getAdInstanceInfo()));
                    AdLoadingController adLoadingController = MobileFuseNativeAd.this.loadingController;
                    TelemetryAgent telemetryAgent = MobileFuseNativeAd.this.getAdInstanceInfo().getTelemetryAgent();
                    Intrinsics.checkNotNullExpressionValue(telemetryAgent, "adInstanceInfo.getTelemetryAgent()");
                    adLoadingController.loadAd(new MfxAdRepository(telemetryAgent, MobileFuseNativeAd.this.buildAdLoadingConfig(), new Function1<AdmMediaType, AdmParser>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.loadAd.1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final AdmParser invoke(@NotNull AdmMediaType it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new NativeAdParser();
                        }
                    }, null, null, 24, null));
                } catch (Throwable th2) {
                    MobileFuseNativeAd mobileFuseNativeAd = MobileFuseNativeAd.this;
                    StabilityHelper.logAdErrorException(mobileFuseNativeAd, th2, mobileFuseNativeAd.getObservableConfig(), AdError.AD_LOAD_ERROR);
                }
            }
        });
    }

    public final void loadAdFromBiddingToken(@NotNull final String bidResponse) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        MobileFuseServices.requireAllServices(new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.loadAdFromBiddingToken.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    MobileFuseNativeAd.this.getAdInstanceInfo().getTelemetryAgent().onAction(TelemetrySdkActionFactory.createAdInstanceAction(TelemetryActionSdkEvents.AD_BIDDING_LOAD_REQUESTED, MobileFuseNativeAd.this.getAdInstanceInfo(), CollectionsKt.listOf(TelemetrySdkTypesKt.createParamBidResponseToken(bidResponse))));
                    AdLoadingController adLoadingController = MobileFuseNativeAd.this.loadingController;
                    String str = bidResponse;
                    TelemetryAgent telemetryAgent = MobileFuseNativeAd.this.getAdInstanceInfo().getTelemetryAgent();
                    Intrinsics.checkNotNullExpressionValue(telemetryAgent, "adInstanceInfo.getTelemetryAgent()");
                    adLoadingController.loadAd(new BiddingAdRepository(str, telemetryAgent, MobileFuseNativeAd.this.buildAdLoadingConfig(), new Function1<AdmMediaType, AdmParser>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.loadAdFromBiddingToken.1.1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final AdmParser invoke(@NotNull AdmMediaType it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new NativeAdParser();
                        }
                    }));
                } catch (Throwable th2) {
                    MobileFuseNativeAd mobileFuseNativeAd = MobileFuseNativeAd.this;
                    StabilityHelper.logAdErrorException(mobileFuseNativeAd, th2, mobileFuseNativeAd.getObservableConfig(), AdError.AD_LOAD_ERROR);
                }
            }
        });
    }

    public final void registerViewForInteraction(@NotNull View container, @NotNull List<? extends View> clickableViews) throws Throwable {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(clickableViews, "clickableViews");
        unregisterViews();
        this.clickableViews = clickableViews;
        this.containerView = container;
        SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.MobileFuseNativeAd.registerViewForInteraction.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MobileFuseNativeAd.this.registerClickViews();
                MobileFuseNativeAd.this.registerContentView();
            }
        }, 1, null);
    }

    public final void setAdListener(@Nullable Listener listener) {
        this.adListener = listener;
        setListener(listener);
    }

    public final void setBidFloor(float value) throws Throwable {
        getObservableConfig().setValue(ObservableConfigKey.BID_FLOOR, Float.valueOf(value));
    }

    public final void setListener(@Nullable Listener listener) {
        setListener(listener);
    }

    public final void unregisterViews() throws Throwable {
        Iterator<? extends View> it = this.clickableViews.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(null);
        }
        this.clickableViews = CollectionsKt.emptyList();
        ViewVisibilityTracker viewVisibilityTracker = this.visibilityTracker;
        if (viewVisibilityTracker != null) {
            viewVisibilityTracker.dispose();
        }
        this.containerView = null;
    }

    @NotNull
    public final String getCtaButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return getText(NativeAssetId.CTA_BUTTON_TEXT, str);
    }

    @NotNull
    public final String getDescriptionText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return getText(NativeAssetId.DESCRIPTION_TEXT, str);
    }

    @NotNull
    public final String getDisplayUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return getText(NativeAssetId.DISPLAY_URL, str);
    }

    @NotNull
    public final String getSponsoredText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return getText(NativeAssetId.SPONSORED_TEXT, str);
    }

    @NotNull
    public final String getTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return getText(NativeAssetId.AD_TITLE, str);
    }
}
