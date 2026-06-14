package com.mobilefuse.videoplayer.tracking;

import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.device.GetLastKnownLocationDataKt;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.device.UserAgentInfoKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.sdk.rtb.IfaType;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.videoplayer.VideoPlayerController;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.model.AdAutoplay;
import com.mobilefuse.videoplayer.model.VastAd;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastEvent;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormattingKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002J@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\nj\u0002`\f\u0018\u00010\u0017J\u001c\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJD\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2(\b\u0002\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\nj\u0002`\f\u0018\u00010\u0017H\u0002J>\u0010\u001e\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2(\b\u0002\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\nj\u0002`\f\u0018\u00010\u0017J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\tH\u0002J\u000e\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\nj\u0002`\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/mobilefuse/videoplayer/tracking/VastEventTracker;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "controller", "Lcom/mobilefuse/videoplayer/VideoPlayerController;", "(Landroid/content/Context;Lcom/mobilefuse/videoplayer/VideoPlayerController;)V", "macrosMap", "", "", "Lkotlin/Function1;", "Lcom/mobilefuse/videoplayer/model/VastError;", "Lcom/mobilefuse/videoplayer/tracking/VastEventMacro;", "sessionUuid", "Ljava/util/UUID;", "createMacros", "", "logDebug", NotificationCompat.CATEGORY_MESSAGE, "parseMacro", IronSourceConstants.REQUEST_URL, "error", "customMacros", "", "sendErrorEvents", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "sendEvent", "event", "sendEvents", "sendUrlRequest", "url", "simpleParseMacro", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VastEventTracker {
    private static final String RESTRICTED_VALUE = "-2";
    private static final String UNKNOWN_VALUE = "-1";
    private final Context context;
    private final VideoPlayerController controller;
    private final Map<String, Function1<VastError, String>> macrosMap;
    private final UUID sessionUuid;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdAutoplay.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdAutoplay.UNMUTED_AUTOPLAY.ordinal()] = 1;
            iArr[AdAutoplay.MUTED_AUTOPLAY.ordinal()] = 2;
        }
    }

    public VastEventTracker(@NotNull Context context, @NotNull VideoPlayerController controller) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.macrosMap = new LinkedHashMap();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.context = applicationContext;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "UUID.randomUUID()");
        this.sessionUuid = uuidRandomUUID;
        try {
            createMacros();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void createMacros() {
        if (this.macrosMap.isEmpty()) {
            this.macrosMap.put("ASSETURI", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String url;
                    String strEncodeUriComponent;
                    VastMediaFile currentMediaFile = VastEventTracker.this.controller.getCurrentMediaFile();
                    return (currentMediaFile == null || (url = currentMediaFile.getUrl()) == null || (strEncodeUriComponent = StringEncodingAndFormattingKt.encodeUriComponent(url)) == null) ? "-1" : strEncodeUriComponent;
                }
            });
            this.macrosMap.put("APIFRAMEWORKS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.2
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    Set<ApiFramework> supportedApiFrameworks = VideoPlayerSettings.INSTANCE.getSupportedApiFrameworks();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedApiFrameworks, 10));
                    Iterator<T> it = supportedApiFrameworks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((ApiFramework) it.next()).getValue()));
                    }
                    return StringEncodingAndFormattingKt.encodeUriComponent(arrayList);
                }
            });
            this.macrosMap.put("APPBUNDLE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String packageName = VastEventTracker.this.context.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                    return StringEncodingAndFormattingKt.encodeUriComponent(packageName);
                }
            });
            this.macrosMap.put("ADCOUNT", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.4
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "1";
                }
            });
            this.macrosMap.put("ADTYPE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String adType;
                    VastAd currentAd = VastEventTracker.this.controller.getCurrentAd();
                    return (currentAd == null || (adType = currentAd.getAdType()) == null) ? "-1" : adType;
                }
            });
            this.macrosMap.put("ADCATEGORIES", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.6
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("ADSERVINGID", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.7
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BREAKPOSITION", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.8
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "0";
                }
            });
            this.macrosMap.put("BREAKMAXDURATION", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.9
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BREAKMINDURATION", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.10
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BREAKMAXADS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.11
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BREAKMINADLENGTH", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.12
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BREAKMAXADLENGTH", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.13
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("BLOCKEDADCATEGORIES", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.14
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("CACHEBUSTING", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.15
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "10000000" + ((int) (Math.random() * ((double) 89999999)));
                }
            });
            this.macrosMap.put("CLIENTUA", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.16
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.encodeUriComponent("MobileFuseVASTPlayer/Android_1.9.3");
                }
            });
            this.macrosMap.put("CLICKTYPE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.17
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return String.valueOf(VideoPlayerSettings.INSTANCE.getSupportedClickType().getValue()) + "";
                }
            });
            this.macrosMap.put("CLICKPOS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.18
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("CONTENTID", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.19
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("CONTENTPLAYHEAD", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.20
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("CONTENTURI", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.21
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("DEVICEIP", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.22
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String strEncodeUriComponent;
                    String deviceIp = VideoPlayerSettings.INSTANCE.getDeviceIp();
                    return (deviceIp == null || (strEncodeUriComponent = StringEncodingAndFormattingKt.encodeUriComponent(deviceIp)) == null) ? "-1" : strEncodeUriComponent;
                }
            });
            this.macrosMap.put("DEVICEUA", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.23
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.encodeUriComponent(UserAgentInfoKt.getUserAgentInfo().getUserAgent());
                }
            });
            this.macrosMap.put("DOMAIN", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.24
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("ADPLAYHEAD", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.25
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.encodeUriComponent(StringEncodingAndFormattingKt.millisToFormattedTime(VastEventTracker.this.controller.getPlayer().getCurrentPlaybackPositionMillis()));
                }
            });
            this.macrosMap.put("ERRORCODE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.26
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String strValueOf;
                    return (vastError == null || (strValueOf = String.valueOf(vastError.getErrorCode())) == null) ? "-1" : strValueOf;
                }
            });
            this.macrosMap.put("EXTENSIONS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.27
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return z.f66069w;
                }
            });
            this.macrosMap.put("GDPRCONSENT", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.28
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("IFA", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.29
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String advertisingId = VideoPlayerSettings.INSTANCE.getAdvertisingId();
                    return advertisingId == null ? "-1" : advertisingId;
                }
            });
            this.macrosMap.put("IFATYPE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.30
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(@Nullable VastError vastError) {
                    return IfaType.ANDROID_ID.getValue();
                }
            });
            this.macrosMap.put("INVENTORYSTATE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.31
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    ArrayList arrayList = new ArrayList();
                    if (VastEventTracker.this.controller.isAdSkippable()) {
                        arrayList.add("skippable");
                    }
                    int i10 = WhenMappings.$EnumSwitchMapping$0[VastEventTracker.this.controller.getPlayer().getAdAutoplay().ordinal()];
                    if (i10 == 1) {
                        arrayList.add("autoplayed");
                    } else if (i10 == 2) {
                        arrayList.add("mautoplayed");
                    }
                    return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                }
            });
            this.macrosMap.put("LATLONG", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.32
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    if (VideoPlayerSettings.INSTANCE.isLimitTrackingEnabled()) {
                        return VastEventTracker.RESTRICTED_VALUE;
                    }
                    LocationData lastKnownLocationData = GetLastKnownLocationDataKt.getLastKnownLocationData();
                    if (lastKnownLocationData == null) {
                        return "-1";
                    }
                    String str = String.valueOf(lastKnownLocationData.getLatitude()) + StringUtils.COMMA + String.valueOf(lastKnownLocationData.getLongitude());
                    return str == null ? "-1" : str;
                }
            });
            this.macrosMap.put("LIMITADTRACKING", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.33
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return VideoPlayerSettings.INSTANCE.isLimitTrackingEnabled() ? "1" : "0";
                }
            });
            this.macrosMap.put("MEDIAMIME", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.34
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String strEncodeUriComponent = StringEncodingAndFormattingKt.encodeUriComponent(VideoPlayerSettings.INSTANCE.getSupportedVideoContainers());
                    return strEncodeUriComponent.length() == 0 ? "-1" : strEncodeUriComponent;
                }
            });
            this.macrosMap.put("MEDIAPLAYHEAD", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.35
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("OMIDPARTNER", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.36
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    VastOmidBridge omidBridge = VastEventTracker.this.controller.getOmidBridge();
                    if (omidBridge == null) {
                        return "-1";
                    }
                    String str = omidBridge.getPartnerName() + "/" + omidBridge.getPartnerVersion();
                    return str == null ? "-1" : str;
                }
            });
            this.macrosMap.put("PAGEURL", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.37
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "0";
                }
            });
            this.macrosMap.put("PLAYERSTATE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.38
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    ArrayList arrayList = new ArrayList();
                    if (VastEventTracker.this.controller.getPlayer().fillsEntireScreen()) {
                        arrayList.add("fullscreen");
                    }
                    if (VastEventTracker.this.controller.getPlayer().isMuted()) {
                        arrayList.add("muted");
                    }
                    return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                }
            });
            this.macrosMap.put("PLAYERSIZE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.39
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String str;
                    int[] sizeInDp = VastEventTracker.this.controller.getPlayer().getSizeInDp();
                    if (sizeInDp != null) {
                        if (sizeInDp[0] <= 0 || sizeInDp[1] <= 0) {
                            str = "-1";
                        } else {
                            str = String.valueOf(sizeInDp[0]) + StringUtils.COMMA + String.valueOf(sizeInDp[1]);
                        }
                        if (str != null) {
                            return str;
                        }
                    }
                    return "-1";
                }
            });
            this.macrosMap.put("PLAYERCAPABILITIES", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.40
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.enumCollectionToString(VastEventTracker.this.controller.getPlayerCapabilities().getCapabilities());
                }
            });
            this.macrosMap.put("PLACEMENTTYPE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.41
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "5";
                }
            });
            this.macrosMap.put("PODSEQUENCE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.42
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("REASON", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.43
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "2";
                }
            });
            this.macrosMap.put("REGULATIONS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.44
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.enumCollectionToString(VideoPlayerSettings.INSTANCE.getApplicableDataRegulations());
                }
            });
            this.macrosMap.put("SERVERSIDE", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.45
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "0";
                }
            });
            this.macrosMap.put("SERVERUA", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.46
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("TIMESTAMP", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.47
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.encodeUriComponent(StringEncodingAndFormattingKt.getIso8601Timestamp());
                }
            });
            this.macrosMap.put("TRANSACTIONID", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.48
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    String string = VastEventTracker.this.sessionUuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "sessionUuid.toString()");
                    return StringEncodingAndFormattingKt.encodeUriComponent(string);
                }
            });
            this.macrosMap.put("UNIVERSALADID", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.49
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return "-1";
                }
            });
            this.macrosMap.put("VASTVERSIONS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.50
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) {
                    return StringEncodingAndFormattingKt.enumCollectionToString(VideoPlayerSettings.INSTANCE.getSupportedVastVersions());
                }
            });
            this.macrosMap.put("VERIFICATIONVENDORS", new Function1<VastError, String>() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.createMacros.51
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final String invoke(@Nullable VastError vastError) throws Throwable {
                    VastOmidBridge omidBridge = VastEventTracker.this.controller.getOmidBridge();
                    if (omidBridge == null) {
                        return "-1";
                    }
                    Set<String> registeredVerificationVendors = omidBridge.getRegisteredVerificationVendors();
                    Intrinsics.checkNotNullExpressionValue(registeredVerificationVendors, "it.registeredVerificationVendors");
                    String strEncodeUriComponent = StringEncodingAndFormattingKt.encodeUriComponent(registeredVerificationVendors);
                    return strEncodeUriComponent == null ? "-1" : strEncodeUriComponent;
                }
            });
        }
    }

    private final void logDebug(String msg) {
        Log.d("VastTracker", msg);
    }

    private final void sendEvent(VastEvent event, VastError error, Map<String, ? extends Function1<? super VastError, String>> customMacros) {
        if (event.getUrl() == null) {
            return;
        }
        try {
            logDebug("Send \"" + event.getEventType() + "\" event to: " + event.getUrl());
            sendUrlRequest(parseMacro(event.getUrl(), error, customMacros));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendEvent$default(VastEventTracker vastEventTracker, VastEvent vastEvent, VastError vastError, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        vastEventTracker.sendEvent(vastEvent, vastError, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendEvents$default(VastEventTracker vastEventTracker, Set set, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        vastEventTracker.sendEvents(set, map);
    }

    private final void sendUrlRequest(String url) {
        HttpRequestTracker.logHttpRequest(url);
        HttpFlowKt.requestHttpGet$default(FlowKt.flowSingle(url), 6000L, null, false, null, 10, null).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.tracking.VastEventTracker.sendUrlRequest.2
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends Either<? extends HttpError, HttpResponse>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t10) {
                FlowCollector.DefaultImpls.emitSuccess(this, t10);
            }
        });
    }

    @NotNull
    public final String parseMacro(@NotNull String requestUrl, @Nullable VastError error, @Nullable Map<String, ? extends Function1<? super VastError, String>> customMacros) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            int length = requestUrl.length() - 1;
            String string = requestUrl;
            int i10 = -1;
            while (length >= 0) {
                char cCharAt = string.charAt(length);
                if (cCharAt == ']') {
                    i10 = length;
                } else if (cCharAt == '[' && i10 > 0 && i10 > length) {
                    String strSubstring = string.substring(length + 1, i10);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Function1<VastError, String> function1 = (customMacros == null || !customMacros.containsKey(strSubstring)) ? this.macrosMap.get(strSubstring) : (Function1) customMacros.get(strSubstring);
                    String strInvoke = function1 != null ? function1.invoke(error) : null;
                    if (strInvoke != null) {
                        StringBuilder sb2 = new StringBuilder();
                        String strSubstring2 = string.substring(0, length);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring2);
                        sb2.append(strInvoke);
                        String strSubstring3 = string.substring(i10 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(strSubstring3);
                        string = sb2.toString();
                    }
                    i10 = -1;
                }
                length--;
                string = string;
            }
            errorResult = new SuccessResult(string);
        } catch (Throwable th2) {
            if (VastEventTracker$parseMacro$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = requestUrl;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (String) value;
    }

    public final void sendErrorEvents(@NotNull VastError error, @NotNull Set<VastEvent> events) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator<VastEvent> it = events.iterator();
        while (it.hasNext()) {
            sendEvent$default(this, it.next(), error, null, 4, null);
        }
    }

    public final void sendEvents(@NotNull Set<VastEvent> events, @Nullable Map<String, ? extends Function1<? super VastError, String>> customMacros) {
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            sendEvent((VastEvent) it.next(), null, customMacros);
        }
    }

    @NotNull
    public final String simpleParseMacro(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return parseMacro(url, null, null);
    }
}
