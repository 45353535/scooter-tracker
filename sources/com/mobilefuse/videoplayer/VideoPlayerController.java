package com.mobilefuse.videoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.device.GetDeviceScreenDensityKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.video.AdmClickInfo;
import com.mobilefuse.videoplayer.model.EventType;
import com.mobilefuse.videoplayer.model.VastAd;
import com.mobilefuse.videoplayer.model.VastAdContent;
import com.mobilefuse.videoplayer.model.VastBaseVerificationResource;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastDataModelExtensionsKt;
import com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastEvent;
import com.mobilefuse.videoplayer.model.VastIcon;
import com.mobilefuse.videoplayer.model.VastJavaScriptResource;
import com.mobilefuse.videoplayer.model.VastLinear;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.VastModel;
import com.mobilefuse.videoplayer.model.VastTag;
import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.model.VastVerification;
import com.mobilefuse.videoplayer.model.VastVerificationError;
import com.mobilefuse.videoplayer.model.VastVerificationResourceType;
import com.mobilefuse.videoplayer.model.VerificationApiFramework;
import com.mobilefuse.videoplayer.network.NetworkUtils;
import com.mobilefuse.videoplayer.tracking.VastEventTracker;
import com.mobilefuse.videoplayer.utils.EnumExtensionsKt;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0094\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001eH\u0002¢\u0006\u0004\b!\u0010\u0017J1\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\b2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u00110#¢\u0006\u0004\b'\u0010(J+\u0010.\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u00110+¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020\n00¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b8\u00107J\r\u00109\u001a\u00020\u0011¢\u0006\u0004\b9\u0010\u0019J\r\u0010:\u001a\u00020\u0011¢\u0006\u0004\b:\u0010\u0019J\r\u0010;\u001a\u00020\u0011¢\u0006\u0004\b;\u0010\u0019J\u0015\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0011¢\u0006\u0004\b@\u0010\u0019J\u000f\u0010B\u001a\u00020\u0011H\u0000¢\u0006\u0004\bA\u0010\u0019J\u000f\u0010D\u001a\u00020\u0011H\u0000¢\u0006\u0004\bC\u0010\u0019J\u0015\u0010E\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020%¢\u0006\u0004\bE\u0010FJ\u001d\u0010K\u001a\u00020\u00112\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110GH\u0000¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u001d\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u0002012\u0006\u0010\u001d\u001a\u00020L¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00112\u0006\u0010O\u001a\u000201¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0011¢\u0006\u0004\bT\u0010\u0019J\u000f\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u0004\u0018\u00010X¢\u0006\u0004\b[\u0010ZJ\r\u0010\\\u001a\u00020\u0011¢\u0006\u0004\b\\\u0010\u0019J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010fR&\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00150h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0017\u0010l\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010t\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010|\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010z8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u0083\u0001\u001a\u0004\u0018\u00010,2\b\u0010{\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\n0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010jR)\u0010\u0088\u0001\u001a\u00020$2\u0006\u0010{\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u0088\u0001\u0010\u008a\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R\u001d\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayerController;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/mobilefuse/videoplayer/VideoPlayer;", "player", "<init>", "(Landroid/content/Context;Lcom/mobilefuse/videoplayer/VideoPlayer;)V", "", "iconUid", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "getCurrentIconByUid", "(Ljava/lang/String;)Lcom/mobilefuse/videoplayer/model/VastIcon;", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "vastVerification", "Lcom/mobilefuse/videoplayer/model/VastVerificationError;", "error", "", "sendAdVerificationError", "(Lcom/mobilefuse/videoplayer/model/VastVerification;Lcom/mobilefuse/videoplayer/model/VastVerificationError;)V", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "createClickTrackingEvents", "()Ljava/util/Set;", "sendClickTrackingEvent", "()V", "updateNextProgressEventPosition", "sendAwaitingProgressEvents", "Lcom/mobilefuse/videoplayer/model/EventType;", "eventType", "", "getVastContentEvents", "(Lcom/mobilefuse/videoplayer/model/EventType;)Ljava/util/Set;", "getNoAdResponseErrorEvents", "vastXml", "Lkotlin/Function2;", "", "Lcom/mobilefuse/videoplayer/model/VastError;", "loadListener", "loadVastTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "playerContainerSize", "Lkotlin/Function1;", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "selectMediaFileListener", "selectBestMediaFile", "([ILkotlin/jvm/functions/Function1;)V", "", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "selectCompanionAds", "([I)Ljava/util/List;", "getIcons", "()Ljava/util/List;", "onIconView", "(Ljava/lang/String;)V", "onIconClick", "onVideoClickThrough", "onMuteChanged", "onFullscreenChanged", "", C4240b4.i.L, "onPlaying", "(J)V", "onSkipped", "initOmid$mobilefuse_video_player_release", "initOmid", "callOmidLoadedEvent$mobilefuse_video_player_release", "callOmidLoadedEvent", "sendErrorEvent", "(Lcom/mobilefuse/videoplayer/model/VastError;)V", "Lkotlin/Function0;", "onComplete", "sendImpressionEvent$mobilefuse_video_player_release", "(Lkotlin/jvm/functions/Function0;)V", "sendImpressionEvent", "Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;", "sendTrackingEvent", "(Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;)V", "vastCompanion", "sendCompanionAdTrackingEvent", "(Lcom/mobilefuse/videoplayer/model/VastCompanion;Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;)V", "sendCompanionAdClickTrackingEvent", "(Lcom/mobilefuse/videoplayer/model/VastCompanion;)V", "prepareProgressTrackingEvents", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "getClickThrough", "()Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "Lcom/mobilefuse/videoplayer/model/VastTime;", "getAdDuration", "()Lcom/mobilefuse/videoplayer/model/VastTime;", "getAdSkipOffset", "destroy", "Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "getPlayerCapabilities", "()Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "Lcom/mobilefuse/sdk/video/AdmClickInfo;", "getAdmClickInfo", "()Lcom/mobilefuse/sdk/video/AdmClickInfo;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/content/Context;", "", "Landroid/util/Pair;", "progressTrackingEvents", "Ljava/util/List;", "Lcom/mobilefuse/videoplayer/tracking/VastEventTracker;", "eventTracker", "Lcom/mobilefuse/videoplayer/tracking/VastEventTracker;", "getEventTracker", "()Lcom/mobilefuse/videoplayer/tracking/VastEventTracker;", "Lcom/mobilefuse/videoplayer/model/VastModel;", "vastModel", "Lcom/mobilefuse/videoplayer/model/VastModel;", "Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "omidBridge", "Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "getOmidBridge", "()Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "setOmidBridge", "(Lcom/mobilefuse/sdk/omid/VastOmidBridge;)V", "Lcom/mobilefuse/videoplayer/model/VastAd;", "<set-?>", "currentAd", "Lcom/mobilefuse/videoplayer/model/VastAd;", "getCurrentAd", "()Lcom/mobilefuse/videoplayer/model/VastAd;", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "currentAdLinear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "currentMediaFile", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "getCurrentMediaFile", "()Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "currentIcons", "isAdSkippable", "Z", "()Z", "noAdResponseErrorEvents", "Ljava/util/Set;", "contentErrorEvents", "impressionEvents", "nextProgressEventPosition", "J", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "getPlayer", "()Lcom/mobilefuse/videoplayer/VideoPlayer;", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoPlayerController {
    public static final long OM_IMPRESSION_EVENT_DELAY_MILLIS = 200;
    private final Set<VastEvent> contentErrorEvents;
    private final Context context;

    @Nullable
    private VastAd currentAd;
    private VastLinear currentAdLinear;
    private final List<VastIcon> currentIcons;

    @Nullable
    private VastMediaFile currentMediaFile;

    @NotNull
    private final VastEventTracker eventTracker;
    private final Handler handler;
    private final Set<VastEvent> impressionEvents;
    private boolean isAdSkippable;
    private long nextProgressEventPosition;
    private final Set<VastEvent> noAdResponseErrorEvents;

    @Nullable
    private VastOmidBridge omidBridge;

    @NotNull
    private final VideoPlayer player;
    private final List<Pair<Long, VastEvent>> progressTrackingEvents;
    private VastModel vastModel;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VastTrackingEventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[VastTrackingEventType.start.ordinal()] = 1;
            iArr[VastTrackingEventType.pause.ordinal()] = 2;
            iArr[VastTrackingEventType.resume.ordinal()] = 3;
            iArr[VastTrackingEventType.firstQuartile.ordinal()] = 4;
            iArr[VastTrackingEventType.midpoint.ordinal()] = 5;
            iArr[VastTrackingEventType.thirdQuartile.ordinal()] = 6;
            iArr[VastTrackingEventType.complete.ordinal()] = 7;
            iArr[VastTrackingEventType.skip.ordinal()] = 8;
            iArr[VastTrackingEventType.mute.ordinal()] = 9;
            iArr[VastTrackingEventType.unmute.ordinal()] = 10;
        }
    }

    public VideoPlayerController(@NotNull Context context, @NotNull VideoPlayer player) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(player, "player");
        this.player = player;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressTrackingEvents = new ArrayList();
        this.currentIcons = new ArrayList();
        this.noAdResponseErrorEvents = new LinkedHashSet();
        this.contentErrorEvents = new LinkedHashSet();
        this.impressionEvents = new LinkedHashSet();
        this.nextProgressEventPosition = Long.MAX_VALUE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.context = applicationContext;
        this.eventTracker = new VastEventTracker(context, this);
    }

    private final Set<VastEvent> createClickTrackingEvents() {
        Set<VastEvent> events;
        Set<VastEvent> mutableSet;
        try {
            VastLinear vastLinear = this.currentAdLinear;
            if (vastLinear != null && (events = vastLinear.getEvents(EventType.ClickTracking)) != null && (mutableSet = CollectionsKt.toMutableSet(events)) != null) {
                VastModel vastModel = this.vastModel;
                if (vastModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vastModel");
                }
                Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, true);
                while (adsChainIterator.hasNext()) {
                    VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(adsChainIterator.next());
                    if (firstAdLinear != null) {
                        mutableSet.addAll(firstAdLinear.getEvents(EventType.ClickTracking));
                    }
                }
                return mutableSet;
            }
            return null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return null;
        }
    }

    private final VastIcon getCurrentIconByUid(String iconUid) {
        for (VastIcon vastIcon : this.currentIcons) {
            if (Intrinsics.areEqual(vastIcon.getUid(), iconUid)) {
                return vastIcon;
            }
        }
        return null;
    }

    private final Set<VastEvent> getNoAdResponseErrorEvents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            VastModel vastModel = this.vastModel;
            if (vastModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vastModel");
            }
            Iterator<VastTag> it = vastModel.getVastTagChain().iterator();
            while (it.hasNext()) {
                linkedHashSet.addAll(it.next().getEvents(EventType.Error));
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return linkedHashSet;
    }

    private final Set<VastEvent> getVastContentEvents(EventType eventType) {
        VastAdContent content;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            VastModel vastModel = this.vastModel;
            if (vastModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vastModel");
            }
            Iterator<VastTag> it = vastModel.getVastTagChain().iterator();
            while (it.hasNext()) {
                VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(it.next());
                if (firstAd != null && (content = firstAd.getContent()) != null) {
                    linkedHashSet.addAll(content.getEvents(eventType));
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return linkedHashSet;
    }

    private final void sendAdVerificationError(VastVerification vastVerification, final VastVerificationError error) {
        try {
            this.eventTracker.sendEvents(vastVerification.getEvents(EventType.Tracking, VastTrackingEventType.verificationNotExecuted.name()), MapsKt.mapOf(TuplesKt.to("REASON", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.VideoPlayerController$sendAdVerificationError$customMacros$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return String.valueOf(error.getErrorCode());
                }
            })));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void sendAwaitingProgressEvents() {
        try {
            LinkedHashSet<Pair> linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Pair<Long, VastEvent> pair : this.progressTrackingEvents) {
                if (((Number) pair.first).longValue() <= this.nextProgressEventPosition) {
                    linkedHashSet.add(pair);
                }
            }
            if (linkedHashSet.isEmpty()) {
                return;
            }
            for (Pair pair2 : linkedHashSet) {
                this.progressTrackingEvents.remove(pair2);
                Object obj = pair2.second;
                Intrinsics.checkNotNullExpressionValue(obj, "item.second");
                linkedHashSet2.add(obj);
            }
            VastEventTracker.sendEvents$default(this.eventTracker, linkedHashSet2, null, 2, null);
            updateNextProgressEventPosition();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void sendClickTrackingEvent() {
        try {
            Set<VastEvent> setCreateClickTrackingEvents = createClickTrackingEvents();
            if (setCreateClickTrackingEvents == null) {
                return;
            }
            VastEventTracker.sendEvents$default(this.eventTracker, setCreateClickTrackingEvents, null, 2, null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void updateNextProgressEventPosition() {
        try {
            long jLongValue = Long.MAX_VALUE;
            if (this.progressTrackingEvents.isEmpty()) {
                this.nextProgressEventPosition = Long.MAX_VALUE;
                return;
            }
            Iterator<Pair<Long, VastEvent>> it = this.progressTrackingEvents.iterator();
            while (it.hasNext()) {
                Long position = (Long) it.next().first;
                if (position.longValue() < jLongValue) {
                    Intrinsics.checkNotNullExpressionValue(position, "position");
                    jLongValue = position.longValue();
                }
            }
            this.nextProgressEventPosition = jLongValue;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void callOmidLoadedEvent$mobilefuse_video_player_release() {
        if (this.omidBridge == null) {
            return;
        }
        try {
            VastTime adSkipOffset = getAdSkipOffset();
            int valueInSeconds = adSkipOffset != null ? adSkipOffset.getValueInSeconds() : 0;
            VastOmidBridge vastOmidBridge = this.omidBridge;
            if (vastOmidBridge != null) {
                vastOmidBridge.signalAdLoadedEvent(this.isAdSkippable, valueInSeconds, EnumExtensionsKt.isAutoplayed(this.player.getAdAutoplay()));
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void destroy() {
        if (this.omidBridge != null) {
            this.omidBridge = null;
        }
    }

    @Nullable
    public final VastTime getAdDuration() {
        VastLinear vastLinear = this.currentAdLinear;
        if (vastLinear != null) {
            return vastLinear.getDuration();
        }
        return null;
    }

    @Nullable
    public final VastTime getAdSkipOffset() {
        VastLinear firstAdLinear;
        VastTime skipOffset;
        try {
            VastLinear vastLinear = this.currentAdLinear;
            if (vastLinear != null && (skipOffset = vastLinear.getSkipOffset()) != null) {
                return skipOffset;
            }
            VastModel vastModel = this.vastModel;
            if (vastModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vastModel");
            }
            Iterator<VastTag> it = vastModel.getVastTagChain().iterator();
            while (it.hasNext()) {
                VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(it.next());
                VastTime skipOffset2 = (firstAd == null || (firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(firstAd)) == null) ? null : firstAdLinear.getSkipOffset();
                if (skipOffset2 != null) {
                    return skipOffset2;
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return null;
    }

    @Nullable
    public final AdmClickInfo getAdmClickInfo() {
        Set<VastEvent> setCreateClickTrackingEvents = createClickTrackingEvents();
        ArrayList arrayList = new ArrayList();
        if (setCreateClickTrackingEvents != null) {
            Iterator<T> it = setCreateClickTrackingEvents.iterator();
            while (it.hasNext()) {
                String url = ((VastEvent) it.next()).getUrl();
                if (url != null) {
                    arrayList.add(this.eventTracker.parseMacro(url, null, null));
                }
            }
        }
        VastClickThrough clickThrough = getClickThrough();
        if (clickThrough != null) {
            return new AdmClickInfo(this.eventTracker.parseMacro(clickThrough.getUrl(), null, null), arrayList);
        }
        return null;
    }

    @Nullable
    public final VastClickThrough getClickThrough() {
        VastClickThrough clickThrough;
        try {
            VastLinear vastLinear = this.currentAdLinear;
            if (vastLinear != null && (clickThrough = vastLinear.getClickThrough()) != null) {
                return clickThrough;
            }
            VastModel vastModel = this.vastModel;
            if (vastModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vastModel");
            }
            Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, true);
            while (adsChainIterator.hasNext()) {
                VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(adsChainIterator.next());
                VastClickThrough clickThrough2 = firstAdLinear != null ? firstAdLinear.getClickThrough() : null;
                if (clickThrough2 != null) {
                    return clickThrough2;
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        return null;
    }

    @Nullable
    public final VastAd getCurrentAd() {
        return this.currentAd;
    }

    @Nullable
    public final VastMediaFile getCurrentMediaFile() {
        return this.currentMediaFile;
    }

    @NotNull
    public final VastEventTracker getEventTracker() {
        return this.eventTracker;
    }

    @NotNull
    public final List<VastIcon> getIcons() {
        this.currentIcons.clear();
        VastLinear vastLinear = this.currentAdLinear;
        if (vastLinear == null) {
            return this.currentIcons;
        }
        ArrayList arrayList = new ArrayList();
        this.currentIcons.addAll(VastDataModelExtensionsKt.getIcons(vastLinear, arrayList));
        VastModel vastModel = this.vastModel;
        if (vastModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vastModel");
        }
        Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, true);
        while (adsChainIterator.hasNext()) {
            VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(adsChainIterator.next());
            if (firstAdLinear != null) {
                this.currentIcons.addAll(VastDataModelExtensionsKt.getIcons(firstAdLinear, arrayList));
            }
        }
        return this.currentIcons;
    }

    @Nullable
    public final VastOmidBridge getOmidBridge() {
        return this.omidBridge;
    }

    @NotNull
    public final VideoPlayer getPlayer() {
        return this.player;
    }

    @NotNull
    public final VideoPlayerCapabilities getPlayerCapabilities() {
        return this.player.getPlayerCapabilities();
    }

    public final void initOmid$mobilefuse_video_player_release() {
        List<VastVerification> verificationList;
        try {
            if (this.omidBridge != null && this.currentAd != null) {
                ArrayList<VastVerification> arrayList = new ArrayList();
                VastModel vastModel = this.vastModel;
                if (vastModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vastModel");
                }
                Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, false);
                while (adsChainIterator.hasNext()) {
                    VastAdContent content = adsChainIterator.next().getContent();
                    if (content != null && (verificationList = content.getVerificationList()) != null) {
                        CollectionsKt.addAll(arrayList, verificationList);
                    }
                }
                for (VastVerification vastVerification : arrayList) {
                    VastBaseVerificationResource resource = vastVerification.getResource();
                    if ((resource != null ? resource.getResourceType() : null) != VastVerificationResourceType.JAVASCRIPT) {
                        sendAdVerificationError(vastVerification, VastVerificationError.NOT_SUPPORTED);
                    } else {
                        VastJavaScriptResource vastJavaScriptResource = (VastJavaScriptResource) vastVerification.getResource();
                        if (vastJavaScriptResource != null && vastJavaScriptResource.getUri() != null) {
                            if (vastJavaScriptResource.getApiFramework() != VerificationApiFramework.OMID) {
                                sendAdVerificationError(vastVerification, VastVerificationError.NOT_SUPPORTED);
                            } else {
                                VastOmidBridge vastOmidBridge = this.omidBridge;
                                if (vastOmidBridge != null) {
                                    vastOmidBridge.registerVerificationScript(vastVerification.getVendor(), vastJavaScriptResource.getUri(), vastVerification.getVerificationParameters());
                                }
                            }
                        }
                    }
                }
                VastOmidBridge vastOmidBridge2 = this.omidBridge;
                if (vastOmidBridge2 != null) {
                    vastOmidBridge2.initAdSession(this.context, this.player);
                }
                VastOmidBridge vastOmidBridge3 = this.omidBridge;
                if (vastOmidBridge3 != null) {
                    vastOmidBridge3.startAdSession();
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: renamed from: isAdSkippable, reason: from getter */
    public final boolean getIsAdSkippable() {
        return this.isAdSkippable;
    }

    public final void loadVastTag(@NotNull String vastXml, @NotNull Function2<? super Boolean, ? super VastError, Unit> loadListener) {
        Either errorResult;
        Intrinsics.checkNotNullParameter(vastXml, "vastXml");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Either<VastError, VastModel> eitherCreateVastModelFromXml = VastDataModelFromXmlKt.createVastModelFromXml(this.context, vastXml, new VideoPlayerController$loadVastTag$1$result$1(this.eventTracker));
            if (eitherCreateVastModelFromXml instanceof SuccessResult) {
                this.vastModel = (VastModel) ((SuccessResult) eitherCreateVastModelFromXml).getValue();
                this.noAdResponseErrorEvents.addAll(getNoAdResponseErrorEvents());
                this.contentErrorEvents.addAll(getVastContentEvents(EventType.Error));
                this.impressionEvents.addAll(getVastContentEvents(EventType.Impression));
                loadListener.invoke(Boolean.TRUE, null);
            } else if (eitherCreateVastModelFromXml instanceof ErrorResult) {
                sendErrorEvent((VastError) ((ErrorResult) eitherCreateVastModelFromXml).getValue());
                loadListener.invoke(Boolean.FALSE, ((ErrorResult) eitherCreateVastModelFromXml).getValue());
            }
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (VideoPlayerController$loadVastTag$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (!(errorResult instanceof ErrorResult)) {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            ((SuccessResult) errorResult).getValue();
        } else {
            VastError vastError = VastError.XML_PARSING_FAILED;
            sendErrorEvent(vastError);
            loadListener.invoke(Boolean.FALSE, vastError);
        }
    }

    public final void onFullscreenChanged() {
        if (this.player.getFullscreen()) {
            sendTrackingEvent(VastTrackingEventType.playerExpand);
            sendTrackingEvent(VastTrackingEventType.fullscreen);
        } else {
            sendTrackingEvent(VastTrackingEventType.playerCollapse);
            sendTrackingEvent(VastTrackingEventType.exitFullscreen);
        }
    }

    public final void onIconClick(@NotNull String iconUid) {
        Intrinsics.checkNotNullParameter(iconUid, "iconUid");
        VastIcon currentIconByUid = getCurrentIconByUid(iconUid);
        if (currentIconByUid == null) {
            return;
        }
        VastEventTracker.sendEvents$default(this.eventTracker, currentIconByUid.getEvents(EventType.IconClickTracking), null, 2, null);
        VastClickThrough clickThrough = currentIconByUid.getClickThrough();
        if (clickThrough != null) {
            VastDataModelExtensionsKt.openUrl(clickThrough, this.context, this.eventTracker, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayerController.onIconClick.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            });
        }
    }

    public final void onIconView(@NotNull String iconUid) {
        Intrinsics.checkNotNullParameter(iconUid, "iconUid");
        VastIcon currentIconByUid = getCurrentIconByUid(iconUid);
        if (currentIconByUid == null) {
            return;
        }
        VastEventTracker.sendEvents$default(this.eventTracker, currentIconByUid.getEvents(EventType.IconViewTracking), null, 2, null);
    }

    public final void onMuteChanged() {
        sendTrackingEvent(this.player.isMuted() ? VastTrackingEventType.mute : VastTrackingEventType.unmute);
    }

    public final void onPlaying(long position) {
        if (this.nextProgressEventPosition <= position) {
            sendAwaitingProgressEvents();
        }
    }

    public final void onSkipped() {
        sendTrackingEvent(VastTrackingEventType.skip);
    }

    public final void onVideoClickThrough() {
        try {
            VastClickThrough clickThrough = getClickThrough();
            if (clickThrough == null) {
                return;
            }
            VastDataModelExtensionsKt.openUrl(clickThrough, this.context, this.eventTracker, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayerController.onVideoClickThrough.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }
            });
            sendClickTrackingEvent();
            VastOmidBridge vastOmidBridge = this.omidBridge;
            if (vastOmidBridge != null) {
                vastOmidBridge.adUserInteractionClick();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void prepareProgressTrackingEvents() {
        Set<VastEvent> events;
        Set<VastEvent> mutableSet;
        if (this.currentAd == null || this.currentAdLinear == null) {
            return;
        }
        try {
            this.progressTrackingEvents.clear();
            VastLinear vastLinear = this.currentAdLinear;
            if (vastLinear != null && (events = vastLinear.getEvents(EventType.Tracking, VastTrackingEventType.progress.name())) != null && (mutableSet = CollectionsKt.toMutableSet(events)) != null) {
                VastModel vastModel = this.vastModel;
                if (vastModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vastModel");
                }
                Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, true);
                while (adsChainIterator.hasNext()) {
                    VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(adsChainIterator.next());
                    if (firstAdLinear != null) {
                        mutableSet.addAll(firstAdLinear.getEvents(EventType.Tracking, VastTrackingEventType.progress.name()));
                    }
                }
                long playbackDurationMillis = this.player.getPlaybackDurationMillis();
                for (VastEvent vastEvent : mutableSet) {
                    VastTime offset = vastEvent.getOffset();
                    if (offset != null) {
                        this.progressTrackingEvents.add(new Pair<>(Long.valueOf(offset.getValueInMillisForDuration(playbackDurationMillis)), vastEvent));
                    }
                }
                updateNextProgressEventPosition();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void selectBestMediaFile(@NotNull int[] playerContainerSize, @NotNull final Function1<? super VastMediaFile, Unit> selectMediaFileListener) {
        Intrinsics.checkNotNullParameter(playerContainerSize, "playerContainerSize");
        Intrinsics.checkNotNullParameter(selectMediaFileListener, "selectMediaFileListener");
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayerController$selectBestMediaFile$selectFailureCallback$1
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
                selectMediaFileListener.invoke(null);
            }
        };
        VastModel vastModel = this.vastModel;
        if (vastModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vastModel");
        }
        VastAd selectedAd = vastModel.getSelectedAd();
        if (selectedAd == null) {
            function0.invoke();
            return;
        }
        this.currentAd = selectedAd;
        VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(selectedAd);
        if (firstAdLinear == null) {
            function0.invoke();
            return;
        }
        this.currentAdLinear = firstAdLinear;
        this.isAdSkippable = false;
        VastTime duration = firstAdLinear.getDuration();
        if (duration != null) {
            long valueInMillis = duration.getValueInMillis();
            VastTime adSkipOffset = getAdSkipOffset();
            if (adSkipOffset != null) {
                long valueInMillisForDuration = adSkipOffset.getValueInMillisForDuration(valueInMillis);
                if (1 <= valueInMillisForDuration && valueInMillis > valueInMillisForDuration) {
                    this.isAdSkippable = true;
                }
            }
        }
        VastLinear vastLinear = this.currentAdLinear;
        List<VastMediaFile> supportedMediaFiles = vastLinear != null ? VastDataModelExtensionsKt.getSupportedMediaFiles(vastLinear, this.context, playerContainerSize) : null;
        if (supportedMediaFiles != null && !supportedMediaFiles.isEmpty()) {
            NetworkUtils.INSTANCE.probeMediaFiles(supportedMediaFiles, new Function2<VastMediaFile, VastError, Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayerController.selectBestMediaFile.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(VastMediaFile vastMediaFile, VastError vastError) {
                    invoke2(vastMediaFile, vastError);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable VastMediaFile vastMediaFile, @Nullable VastError vastError) {
                    try {
                        VideoPlayerController.this.currentMediaFile = vastMediaFile;
                        if (vastError != null) {
                            VideoPlayerController.this.sendErrorEvent(vastError);
                        }
                        selectMediaFileListener.invoke(vastMediaFile);
                    } catch (Throwable th2) {
                        StabilityHelper.logException(VideoPlayerController.this, th2);
                    }
                }
            });
        } else {
            sendErrorEvent(VastError.MEDIAFILES_UNSUPPORTED);
            function0.invoke();
        }
    }

    @NotNull
    public final List<VastCompanion> selectCompanionAds(@NotNull int[] playerContainerSize) {
        Intrinsics.checkNotNullParameter(playerContainerSize, "playerContainerSize");
        VastModel vastModel = this.vastModel;
        if (vastModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vastModel");
        }
        Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, false);
        ArrayList arrayList = new ArrayList();
        while (adsChainIterator.hasNext()) {
            arrayList.addAll(VastDataModelExtensionsKt.getAllCreativesWithCompanionAds(adsChainIterator.next()));
        }
        return arrayList.isEmpty() ? CollectionsKt.emptyList() : MediaUtilsKt.selectEndCardCompanions(MediaUtilsKt.getAllCompanionsFromVastCreatives(arrayList), this.player.getMaxEndCardsToShow(), playerContainerSize, GetDeviceScreenDensityKt.getDeviceScreenDensity(this.context));
    }

    public final void sendCompanionAdClickTrackingEvent(@NotNull VastCompanion vastCompanion) {
        Intrinsics.checkNotNullParameter(vastCompanion, "vastCompanion");
        try {
            VastEventTracker.sendEvents$default(this.eventTracker, vastCompanion.getEvents(EventType.CompanionClickTracking), null, 2, null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void sendCompanionAdTrackingEvent(@NotNull VastCompanion vastCompanion, @NotNull VastTrackingEventType eventType) {
        Intrinsics.checkNotNullParameter(vastCompanion, "vastCompanion");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        try {
            VastEventTracker.sendEvents$default(this.eventTracker, vastCompanion.getEvents(EventType.Tracking, eventType.name()), null, 2, null);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void sendErrorEvent(@NotNull VastError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.eventTracker.sendErrorEvents(error, error == VastError.NO_VAST_RESPONSE ? this.noAdResponseErrorEvents : this.contentErrorEvents);
        } catch (Throwable th2) {
            int i10 = VideoPlayerController$sendErrorEvent$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void sendImpressionEvent$mobilefuse_video_player_release(@NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.videoplayer.VideoPlayerController$sendImpressionEvent$1
            @Override // java.lang.Runnable
            public final void run() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    VastEventTracker.sendEvents$default(this.this$0.getEventTracker(), this.this$0.impressionEvents, null, 2, null);
                    VastOmidBridge omidBridge = this.this$0.getOmidBridge();
                    if (omidBridge != null) {
                        omidBridge.signalAdImpressionEvent();
                    }
                    onComplete.invoke();
                } catch (Throwable th2) {
                    int i10 = VideoPlayerController$sendImpressionEvent$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
        }, 200L);
    }

    public final void sendTrackingEvent(@NotNull VastTrackingEventType eventType) {
        Set<VastEvent> events;
        Set mutableSet;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        try {
            VastLinear vastLinear = this.currentAdLinear;
            if (vastLinear != null && (events = vastLinear.getEvents(EventType.Tracking, eventType.name())) != null && (mutableSet = CollectionsKt.toMutableSet(events)) != null) {
                VastModel vastModel = this.vastModel;
                if (vastModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vastModel");
                }
                Iterator<VastAd> adsChainIterator = VastDataModelExtensionsKt.getAdsChainIterator(vastModel, true);
                while (adsChainIterator.hasNext()) {
                    VastLinear firstAdLinear = VastDataModelExtensionsKt.getFirstAdLinear(adsChainIterator.next());
                    if (firstAdLinear != null) {
                        mutableSet.addAll(firstAdLinear.getEvents(EventType.Tracking, eventType.name()));
                    }
                }
                VastEventTracker.sendEvents$default(this.eventTracker, mutableSet, null, 2, null);
                if (this.omidBridge != null) {
                    switch (WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()]) {
                        case 1:
                            VastOmidBridge vastOmidBridge = this.omidBridge;
                            if (vastOmidBridge != null) {
                                vastOmidBridge.start(this.player.getPlaybackDurationMillis() / 1000.0f, 1.0f);
                            }
                            break;
                        case 2:
                            VastOmidBridge vastOmidBridge2 = this.omidBridge;
                            if (vastOmidBridge2 != null) {
                                vastOmidBridge2.pause();
                            }
                            break;
                        case 3:
                            VastOmidBridge vastOmidBridge3 = this.omidBridge;
                            if (vastOmidBridge3 != null) {
                                vastOmidBridge3.resume();
                            }
                            break;
                        case 4:
                            VastOmidBridge vastOmidBridge4 = this.omidBridge;
                            if (vastOmidBridge4 != null) {
                                vastOmidBridge4.firstQuartile();
                            }
                            break;
                        case 5:
                            VastOmidBridge vastOmidBridge5 = this.omidBridge;
                            if (vastOmidBridge5 != null) {
                                vastOmidBridge5.midpoint();
                            }
                            break;
                        case 6:
                            VastOmidBridge vastOmidBridge6 = this.omidBridge;
                            if (vastOmidBridge6 != null) {
                                vastOmidBridge6.thirdQuartile();
                            }
                            break;
                        case 7:
                            VastOmidBridge vastOmidBridge7 = this.omidBridge;
                            if (vastOmidBridge7 != null) {
                                vastOmidBridge7.complete();
                            }
                            break;
                        case 8:
                            VastOmidBridge vastOmidBridge8 = this.omidBridge;
                            if (vastOmidBridge8 != null) {
                                vastOmidBridge8.skipped();
                            }
                            break;
                        case 9:
                            VastOmidBridge vastOmidBridge9 = this.omidBridge;
                            if (vastOmidBridge9 != null) {
                                vastOmidBridge9.mute();
                            }
                            break;
                        case 10:
                            VastOmidBridge vastOmidBridge10 = this.omidBridge;
                            if (vastOmidBridge10 != null) {
                                vastOmidBridge10.unmute();
                            }
                            break;
                    }
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void setOmidBridge(@Nullable VastOmidBridge vastOmidBridge) {
        this.omidBridge = vastOmidBridge;
    }
}
