package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.D0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ca implements InterfaceC4578v2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f40486n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f40487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f40488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final V2 f40489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final LevelPlayBannerAdView.Config f40490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4441n0 f40491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final R8 f40492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdSize f40493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private LevelPlayBannerAdViewListener f40494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f40495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private C4654za f40496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Boolean f40497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4283dd f40498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40499m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<String, LevelPlayBannerAdView.Config> a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(r1, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                Pair<String, LevelPlayBannerAdView.Config> pair = TuplesKt.to(str, builder.build());
                typedArrayObtainStyledAttributes.recycle();
                return pair;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }

        private a() {
        }
    }

    public Ca(@NotNull UUID adId, @NotNull String adUnitId, @NotNull V2 bannerContainer, @NotNull LevelPlayBannerAdView.Config config, @NotNull C4441n0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f40487a = adId;
        this.f40488b = adUnitId;
        this.f40489c = bannerContainer;
        this.f40490d = config;
        this.f40491e = adTools;
        this.f40492f = Ib.f41088s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f40493g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f40495i = placementName == null ? "" : placementName;
        adTools.e().a(new C4440n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Ca this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f40499m) {
            IronLog.INTERNAL.warning(C4441n0.a(this$0.f40491e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f40496j == null) {
            IronLog.INTERNAL.warning(C4441n0.a(this$0.f40491e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C4553tb.a(this$0.f40491e, new Runnable() { // from class: com.ironsource.hh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.b(this.f43282b);
            }
        }, 0L, 2, (Object) null);
        C4654za c4654za = this$0.f40496j;
        if (c4654za != null) {
            c4654za.c();
        }
        this$0.f40496j = null;
        this$0.f40497k = null;
        this$0.f40494h = null;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f40491e.d(new Runnable() { // from class: com.ironsource.mh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f44418b);
            }
        });
    }

    @NotNull
    public final LevelPlayAdSize d() {
        return this.f40493g;
    }

    @NotNull
    public final String e() {
        return this.f40488b;
    }

    private final boolean h() {
        if (this.f40488b.length() == 0) {
            String string = this.f40487a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.f40488b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.f40491e.g()) {
            String string2 = this.f40487a.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.f40488b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        Xa xaA = Ib.f41088s.d().e().a();
        if (xaA != null && xaA.a(this.f40488b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.f40487a.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.f40488b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    @NotNull
    public final UUID c() {
        return this.f40487a;
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void d(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.gh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void e(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.jh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.c(adInfo, this);
            }
        });
    }

    @Nullable
    public final LevelPlayBannerAdViewListener f() {
        return this.f40494h;
    }

    @NotNull
    public final String g() {
        return this.f40495i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f40491e.d(new Runnable() { // from class: com.ironsource.nh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.c(this.f44483b);
            }
        });
    }

    public final void j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C4654za c4654za = this.f40496j;
        if (c4654za != null) {
            this.f40491e.d(new Runnable() { // from class: com.ironsource.lh
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.a(this.f43574b, c4654za);
                }
            });
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f40497k = Boolean.FALSE;
        }
    }

    public final void k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C4654za c4654za = this.f40496j;
        if (c4654za != null) {
            this.f40491e.d(new Runnable() { // from class: com.ironsource.bh
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.b(this.f42777b, c4654za);
                }
            });
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f40497k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ca this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f40489c.removeAllViews();
        ViewParent parent = this$0.f40489c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f40489c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ca this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f40499m) {
            IronLog.INTERNAL.warning(C4441n0.a(this$0.f40491e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.f40499m = true;
        if (this$0.h()) {
            C4654za c4654zaA = this$0.a();
            this$0.f40496j = c4654zaA;
            Boolean bool = this$0.f40497k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    c4654zaA.f();
                } else {
                    c4654zaA.d();
                }
            }
            c4654zaA.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ca this$0, C4654za it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.f40491e.e().f().c();
        it.f();
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void b(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.oh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.b(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    public final void a(@Nullable final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f40491e.d(new Runnable() { // from class: com.ironsource.ih
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(this.f43375b, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ca this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f40494h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ca this$0, C4654za it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.f40491e.e().f().b();
        it.d();
    }

    public /* synthetic */ Ca(UUID uuid, String str, V2 v22, LevelPlayBannerAdView.Config config, C4441n0 c4441n0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C4600w7.f45720a.a() : uuid, str, v22, config, (i10 & 16) != 0 ? new C4441n0(IronSource.a.BANNER, D0.b.MEDIATION) : c4441n0);
    }

    private final C4654za a() {
        C4283dd c4283dd;
        this.f40498l = this.f40491e.a(this.f40495i);
        Context context = this.f40489c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f40487a;
        String str = this.f40488b;
        C4283dd c4283dd2 = this.f40498l;
        C4283dd c4283dd3 = null;
        if (c4283dd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c4283dd = null;
        } else {
            c4283dd = c4283dd2;
        }
        I2 i22 = new I2(uuid, str, c4283dd, this.f40493g, null, null, this.f40492f.a(), this.f40490d.getBidFloor(), 48, null);
        this.f40491e.e().a(new B0(this.f40491e, i22, null, 4, null));
        ISBannerSize iSBannerSizeA = this.f40491e.a(i22.h());
        B5 b5E = this.f40491e.e();
        C4441n0 c4441n0 = this.f40491e;
        C4283dd c4283dd4 = this.f40498l;
        if (c4283dd4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c4283dd3 = c4283dd4;
        }
        b5E.a(new X2(c4441n0, iSBannerSizeA, c4283dd3.c()));
        return new C4654za(this, this.f40491e, i22, this.f40489c);
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void c(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.dh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.d(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void a(@NotNull final LevelPlayAdInfo adInfo, final boolean z10) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.ch
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(z10, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z10, LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z10 + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void a(@Nullable final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f40491e.e(new Runnable() { // from class: com.ironsource.kh
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.a(levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, Ca this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void a(@NotNull final LevelPlayAdInfo adInfo, @Nullable final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f40491e.e(new Runnable() { // from class: com.ironsource.fh
                @Override // java.lang.Runnable
                public final void run() {
                    Ca.a(adInfo, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, Ca this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f40494h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4578v2
    public void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40491e.e(new Runnable() { // from class: com.ironsource.eh
            @Override // java.lang.Runnable
            public final void run() {
                Ca.e(adInfo, this);
            }
        });
    }
}
