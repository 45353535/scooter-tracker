package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC3845l1;
import com.inmobi.media.C3567a2;
import com.inmobi.media.C3619c2;
import com.inmobi.media.C3670e2;
import com.inmobi.media.C3903n9;
import com.inmobi.media.F3;
import com.inmobi.media.HandlerC3645d2;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.Oj;
import com.inmobi.media.U8;
import com.inmobi.media.V1;
import com.inmobi.media.V8;
import com.inmobi.media.Y1;
import com.inmobi.media.Z1;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.U2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0087\u00012\u00020\u0001:\u0005\u0088\u0001\u0089\u0001ZB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0007¢\u0006\u0004\b:\u0010\rJ\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020'H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010&J\u000f\u0010C\u001a\u00020\u000bH\u0000¢\u0006\u0004\bB\u0010\rJ\u000f\u0010E\u001a\u00020\u000bH\u0001¢\u0006\u0004\bD\u0010\rJ\r\u0010F\u001a\u00020\u000b¢\u0006\u0004\bF\u0010\rJ\r\u0010G\u001a\u00020\u000b¢\u0006\u0004\bG\u0010\rJ\r\u0010H\u001a\u00020\b¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u001d\u0010T\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020N¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020#¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000bH\u0007¢\u0006\u0004\bX\u0010\rR$\u0010`\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010f\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010MR\"\u0010n\u001a\u00020g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010v\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R$\u0010\u0083\u0001\u001a\u00020}8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b~\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010\r\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "getSignals", "()V", "", "response", "load", "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", U2.f41830b, "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", "resume", "pause", "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "", "minBidToWin", "notifyWin", "(D)V", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/Y1;", "a", "Lcom/inmobi/media/Y1;", "getMPubListener$media_release", "()Lcom/inmobi/media/Y1;", "setMPubListener$media_release", "(Lcom/inmobi/media/Y1;)V", "mPubListener", "b", "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/V1;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/inmobi/media/V1;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/V1;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/V1;)V", "audioStatusInternal", "Lcom/inmobi/media/e2;", "d", "Lcom/inmobi/media/e2;", "getMAdManager$media_release", "()Lcom/inmobi/media/e2;", "setMAdManager$media_release", "(Lcom/inmobi/media/e2;)V", "mAdManager", "Lcom/inmobi/media/Jg;", "n", "Lcom/inmobi/media/Jg;", "getMPubSettings$media_release", "()Lcom/inmobi/media/Jg;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "o", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", y.f66058y, "AnimationType", "com/inmobi/media/U8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiBanner extends RelativeLayout {

    @NotNull
    public static final U8 Companion = new U8();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Y1 mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public AudioListener mAudioListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public V1 audioStatusInternal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C3670e2 mAdManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f36493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HandlerC3645d2 f36496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AnimationType f36499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f36501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Jg mPubSettings;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f36503o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = qf.a.a(animationTypeArr$values);
        }

        private AnimationType(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/c2;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3619c2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiBanner banner) {
            super(banner);
            Intrinsics.checkNotNullParameter(banner, "banner");
        }

        @Override // com.inmobi.media.C3619c2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3619c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C3619c2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C3670e2 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.o();
                    }
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    Y1 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.audioStatusInternal = V1.f37871d;
        this.f36493e = new a(this);
        this.f36495g = true;
        this.f36499k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.mPubSettings = jg2;
        this.f36503o = new d(this);
        if (!Ji.d()) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.f36501m = new WeakReference(context);
        }
        this.mAdManager = new C3670e2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", U2.f41830b);
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f37141a = jA;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        a(this, context2);
        C3670e2 c3670e2 = this.mAdManager;
        this.f36494f = c3670e2 != null ? c3670e2.k() : 0;
        this.f36496h = new HandlerC3645d2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) attributeValue2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i10, length + 1).toString()));
            } catch (NumberFormatException unused) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                Kb.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final Unit a(InMobiBanner inMobiBanner, byte[] bArr) {
        C3903n9 c3903n9;
        C3670e2 c3670e2 = inMobiBanner.mAdManager;
        if (c3670e2 != null && (c3903n9 = c3670e2.f36748f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.c("InMobiBanner", "load with response");
        }
        C3670e2 c3670e22 = inMobiBanner.mAdManager;
        if (c3670e22 != null) {
            c3670e22.a(bArr, inMobiBanner.f36493e);
        }
        return Unit.f93236a;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static final boolean access$hasValidSize(InMobiBanner inMobiBanner) {
        return inMobiBanner.f36497i > 0 && inMobiBanner.f36498j > 0;
    }

    private final String getFrameSizeString() {
        return this.f36497i + "x" + this.f36498j;
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final boolean b() {
        C3903n9 c3903n9;
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 == null || (c3903n9 = c3670e2.f36748f) == null) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
        c3903n9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    @UiThread
    public final void destroy() {
        a();
        removeAllViews();
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            c3670e2.j();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.f37144d = true;
    }

    @NotNull
    /* JADX INFO: renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final V1 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final C3670e2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    @Nullable
    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final Y1 getMPubListener() {
        return this.mPubListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getMPubSettings$media_release, reason: from getter */
    public final Jg getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.f37141a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f36503o;
    }

    public final void getSignals() {
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            c3670e2.a(this.f36493e);
        }
    }

    public final boolean isAudioAd() {
        C3567a2 c3567a2;
        Ad adB;
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 == null || (c3567a2 = c3670e2.f38492l) == null || (adB = c3567a2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = adB.getMetaInfo();
        return Intrinsics.areEqual(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    public final void load(@Nullable final byte[] response) {
        b();
        Jg jg2 = this.mPubSettings;
        jg2.getClass();
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        jg2.f37147g = "AB";
        if (getLayoutParams() != null) {
            this.f36497i = F3.b(getLayoutParams().width / J5.b());
            this.f36498j = F3.b(getLayoutParams().height / J5.b());
        }
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 == null || c3670e2.f38490j == null || c3670e2.f38491k == null || c3670e2.f36743a == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
        }
        C3670e2 c3670e22 = this.mAdManager;
        if (c3670e22 != null) {
            c3670e22.g();
        }
        a("load(byte[])", new Function0() { // from class: u3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InMobiBanner.a(this.f105214b, response);
            }
        });
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            Unit unit = Unit.f93236a;
        }
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            if (c3670e2.f() != null) {
                AbstractC3845l1 abstractC3845l1F = c3670e2.f();
                strA = abstractC3845l1F != null ? abstractC3845l1F.a(lossReason, auctionPrice) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            Unit unit = Unit.f93236a;
        }
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            if (c3670e2.f() != null) {
                AbstractC3845l1 abstractC3845l1F = c3670e2.f();
                strA = abstractC3845l1F != null ? abstractC3845l1F.a(minBidToWin) : null;
            }
            if (strA == null || strA.length() <= 0) {
                return;
            }
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3903n9 c3903n9;
        try {
            super.onAttachedToWindow();
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 != null) {
                c3670e2.n();
            }
            if (getLayoutParams() != null) {
                this.f36497i = F3.b(getLayoutParams().width / J5.b());
                this.f36498j = F3.b(getLayoutParams().height / J5.b());
            }
            if (this.f36497i <= 0 || this.f36498j <= 0) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l52 = J5.f37099a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 == null || (c3903n9 = c3670e22.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3903n9 c3903n9;
        try {
            super.onDetachedFromWindow();
            a();
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 != null) {
                c3670e2.t();
            }
        } catch (Exception e10) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 == null || (c3903n9 = c3670e22.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        C3903n9 c3903n9;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 == null || (c3903n9 = c3670e2.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e10);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        C3903n9 c3903n9;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 == null || (c3903n9 = c3670e2.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e10);
        }
    }

    public final void pause() {
        C3903n9 c3903n9;
        C3670e2 c3670e2;
        try {
            if (this.f36501m != null || (c3670e2 = this.mAdManager) == null) {
                return;
            }
            c3670e2.m();
        } catch (Exception e10) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 == null || (c3903n9 = c3670e22.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e10);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.f36493e, "NonAB", true);
    }

    public final void resume() {
        C3903n9 c3903n9;
        C3670e2 c3670e2;
        try {
            if (this.f36501m != null || (c3670e2 = this.mAdManager) == null) {
                return;
            }
            c3670e2.p();
        } catch (Exception e10) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 == null || (c3903n9 = c3670e22.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e10);
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC3645d2 handlerC3645d2;
        if (isShown() && hasWindowFocus()) {
            HandlerC3645d2 handlerC3645d22 = this.f36496h;
            if (handlerC3645d22 != null) {
                handlerC3645d22.removeMessages(1);
            }
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 == null || !c3670e2.i() || !this.f36495g || (handlerC3645d2 = this.f36496h) == null) {
                return;
            }
            handlerC3645d2.sendEmptyMessageDelayed(1, this.f36494f * 1000);
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f36499k = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        Intrinsics.checkNotNullParameter(audioListener, "audioListener");
        this.mAudioListener = audioListener;
        V1 item = this.audioStatusInternal;
        if (item == V1.f37871d || audioListener == null) {
            return;
        }
        V1.f37869b.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        int iOrdinal = item.ordinal();
        audioListener.onAudioStatusChanged(this, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    public final void setAudioStatusInternal$media_release(@NotNull V1 v12) {
        Intrinsics.checkNotNullParameter(v12, "<set-?>");
        this.audioStatusInternal = v12;
    }

    public final void setBannerSize(@IntRange(from = 1) int widthInDp, @IntRange(from = 1) int heightInDp) {
        this.f36497i = widthInDp;
        this.f36498j = heightInDp;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.mPubSettings.f37145e = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        C3903n9 c3903n9;
        try {
            if (this.f36495g == enabled) {
                return;
            }
            this.f36495g = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e10) {
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 == null || (c3903n9 = c3670e2.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e10);
        }
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f37226b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f37225a = str2;
            }
        }
        this.mPubSettings.f37143c = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.mPubSettings.f37142b = keywords;
    }

    public final void setListener(@NotNull BannerAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPubListener = new Z1(listener);
    }

    public final void setMAdManager$media_release(@Nullable C3670e2 c3670e2) {
        this.mAdManager = c3670e2;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable Y1 y12) {
        this.mPubListener = y12;
    }

    public final void setRefreshInterval(int refreshInterval) {
        C3903n9 c3903n9;
        try {
            Jg jg2 = this.mPubSettings;
            jg2.getClass();
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            jg2.f37147g = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
            C3670e2 c3670e2 = this.mAdManager;
            this.f36494f = c3670e2 != null ? c3670e2.a(refreshInterval, this.f36494f) : 0;
        } catch (Exception e10) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 == null || (c3903n9 = c3670e22.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e10);
        }
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            c3670e2.a(watermarkData);
        }
    }

    @TargetApi(16)
    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new V8(this));
    }

    @UiThread
    public final void swapAdUnitsAndDisplayAd$media_release() {
        C3903n9 c3903n9;
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null) {
            c3670e2.s();
        }
        try {
            Animation animationA = b.a(this.f36499k, getWidth(), getHeight());
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 != null) {
                c3670e22.a(this);
            }
            if (animationA != null) {
                startAnimation(animationA);
            }
        } catch (Exception e10) {
            C3670e2 c3670e23 = this.mAdManager;
            if (c3670e23 == null || (c3903n9 = c3670e23.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e10);
        }
    }

    public final boolean b(String str) {
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        if (this.f36497i > 0 && this.f36498j > 0) {
            return true;
        }
        if (getLayoutParams() == null) {
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 != null && (c3903n92 = c3670e2.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n92.b("InMobiBanner", "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            if (getLayoutParams() == null) {
                return true;
            }
            this.f36497i = F3.b(getLayoutParams().width / J5.b());
            this.f36498j = F3.b(getLayoutParams().height / J5.b());
            return true;
        }
        C3670e2 c3670e22 = this.mAdManager;
        if (c3670e22 != null && (c3903n9 = c3670e22.f36748f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.b("InMobiBanner", "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before " + str);
        }
        return false;
    }

    public final void a(final PublisherCallbacks publisherCallbacks, String str, final boolean z10) {
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        C3903n9 c3903n93;
        C3903n9 c3903n94;
        C3903n9 c3903n95;
        try {
            Jg jg2 = this.mPubSettings;
            jg2.getClass();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            jg2.f37147g = str;
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 != null && c3670e2.l()) {
                C3670e2 c3670e22 = this.mAdManager;
                if (c3670e22 != null) {
                    c3670e22.g();
                }
                C3670e2 c3670e23 = this.mAdManager;
                if (c3670e23 != null && (c3903n95 = c3670e23.f36748f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    c3903n95.a("InMobiBanner", "load called - placementType - " + str + " " + this);
                }
                C3670e2 c3670e24 = this.mAdManager;
                if (c3670e24 != null && (c3903n94 = c3670e24.f36748f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    c3903n94.b("InMobiBanner", "load already in progress");
                }
                C3670e2 c3670e25 = this.mAdManager;
                if (c3670e25 != null) {
                    c3670e25.b((short) 2169);
                }
                Y1 y12 = this.mPubListener;
                if (y12 != null) {
                    y12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C3670e2 c3670e26 = this.mAdManager;
                if (c3670e26 != null && (c3903n93 = c3670e26.f36748f) != null) {
                    Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                    c3903n93.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                }
                Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            a(this, context);
            C3670e2 c3670e27 = this.mAdManager;
            if (c3670e27 != null) {
                c3670e27.g();
            }
            C3670e2 c3670e28 = this.mAdManager;
            if (c3670e28 != null && (c3903n92 = c3670e28.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n92.a("InMobiBanner", "load called - placementType - " + str + " " + this);
            }
            a("load", new Function0() { // from class: u3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InMobiBanner.a(this.f105209b, publisherCallbacks, z10);
                }
            });
        } catch (Exception e10) {
            C3670e2 c3670e29 = this.mAdManager;
            if (c3670e29 != null) {
                c3670e29.a((short) 2172);
            }
            Y1 y13 = this.mPubListener;
            if (y13 != null) {
                y13.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3670e2 c3670e210 = this.mAdManager;
            if (c3670e210 == null || (c3903n9 = c3670e210.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "Load failed with unexpected error: ", e10);
        }
    }

    @UiThread
    public final void load() {
        b();
        a((PublisherCallbacks) this.f36493e, "NonAB", false);
    }

    @UiThread
    public final void load(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        this.f36501m = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.f36493e, "NonAB", false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.audioStatusInternal = V1.f37871d;
        this.f36493e = new a(this);
        this.f36495g = true;
        this.f36499k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        Jg jg2 = new Jg();
        this.mPubSettings = jg2;
        this.f36503o = new d(this);
        if (Ji.d()) {
            if (context instanceof Activity) {
                this.f36501m = new WeakReference(context);
            }
            this.mAdManager = new C3670e2();
            jg2.f37141a = j10;
            a(this, context);
            C3670e2 c3670e2 = this.mAdManager;
            this.f36494f = c3670e2 != null ? c3670e2.k() : 0;
            this.f36496h = new HandlerC3645d2(this);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final Unit a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        C3670e2 c3670e2;
        inMobiBanner.a();
        long j10 = inMobiBanner.f36500l;
        if (j10 == 0 || (c3670e2 = inMobiBanner.mAdManager) == null || c3670e2.a(j10)) {
            inMobiBanner.f36500l = SystemClock.elapsedRealtime();
            C3670e2 c3670e22 = inMobiBanner.mAdManager;
            if (c3670e22 != null) {
                c3670e22.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z10);
            }
        }
        return Unit.f93236a;
    }

    public final void a(String str, final Function0 function0) {
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        C3670e2 c3670e2 = this.mAdManager;
        if (c3670e2 != null && (c3903n92 = c3670e2.f36748f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n92.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 != null && (c3903n9 = c3670e22.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n9.b("InMobiBanner", "invalid banner size. fail.");
            }
            C3670e2 c3670e23 = this.mAdManager;
            if (c3670e23 != null) {
                c3670e23.a((short) 2170);
            }
            Y1 y12 = this.mPubListener;
            if (y12 != null) {
                y12.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (this.f36497i > 0 && this.f36498j > 0) {
            function0.invoke();
            return;
        }
        Runnable runnable = new Runnable() { // from class: u3.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiBanner.a(this.f105212b, function0);
            }
        };
        Lazy lazy = Oj.f37505a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) Oj.f37505a.getValue()).postDelayed(runnable, 200L);
    }

    public static final void a(InMobiBanner inMobiBanner, Function0 function0) {
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        try {
            if (inMobiBanner.f36497i > 0 && inMobiBanner.f36498j > 0) {
                function0.invoke();
                return;
            }
            C3670e2 c3670e2 = inMobiBanner.mAdManager;
            if (c3670e2 != null && (c3903n92 = c3670e2.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n92.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C3670e2 c3670e22 = inMobiBanner.mAdManager;
            if (c3670e22 != null) {
                c3670e22.a((short) 2171);
            }
            Y1 y12 = inMobiBanner.mPubListener;
            if (y12 != null) {
                y12.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e10) {
            C3670e2 c3670e23 = inMobiBanner.mAdManager;
            if (c3670e23 != null) {
                c3670e23.a((short) 2172);
            }
            Y1 y13 = inMobiBanner.mPubListener;
            if (y13 != null) {
                y13.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3670e2 c3670e24 = inMobiBanner.mAdManager;
            if (c3670e24 == null || (c3903n9 = c3670e24.f36748f) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e10);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int iA;
        C3670e2 c3670e2 = inMobiBanner.mAdManager;
        if (c3670e2 != null) {
            c3670e2.a(context, inMobiBanner.mPubSettings, inMobiBanner.getFrameSizeString());
        }
        C3670e2 c3670e22 = inMobiBanner.mAdManager;
        if (c3670e22 != null) {
            int i10 = inMobiBanner.f36494f;
            iA = c3670e22.a(i10, i10);
        } else {
            iA = 0;
        }
        inMobiBanner.f36494f = iA;
    }

    public final void a() {
        HandlerC3645d2 handlerC3645d2 = this.f36496h;
        if (handlerC3645d2 != null) {
            handlerC3645d2.removeMessages(1);
        }
    }

    public final long a(String str) {
        C3903n9 c3903n9;
        C3903n9 c3903n92;
        StringBuilder sb2;
        C3903n9 c3903n93;
        try {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
        } catch (NumberFormatException unused) {
            C3670e2 c3670e2 = this.mAdManager;
            if (c3670e2 != null && (c3903n92 = c3670e2.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n92.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            C3670e2 c3670e22 = this.mAdManager;
            if (c3670e22 != null && (c3903n9 = c3670e22.f36748f) != null) {
                Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
                c3903n9.b("InMobiBanner", "Invalid Placement id: " + str);
            }
        }
        if (StringsKt.N("plid-", sb2.substring(0, 5), true)) {
            String strSubstring = sb2.substring(5, sb2.length());
            Intrinsics.checkNotNull(strSubstring);
            int length2 = strSubstring.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length2) {
                boolean z13 = Intrinsics.compare((int) strSubstring.charAt(!z12 ? i11 : length2), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length2--;
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            return Long.parseLong(strSubstring.subSequence(i11, length2 + 1).toString());
        }
        C3670e2 c3670e23 = this.mAdManager;
        if (c3670e23 != null && (c3903n93 = c3670e23.f36748f) != null) {
            Intrinsics.checkNotNullExpressionValue("InMobiBanner", "TAG");
            c3903n93.b("InMobiBanner", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }
}
