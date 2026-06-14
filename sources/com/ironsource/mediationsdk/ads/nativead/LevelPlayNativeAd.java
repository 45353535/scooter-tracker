package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C4283dd;
import com.ironsource.C4462o4;
import com.ironsource.Wb;
import com.ironsource.Yb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f43770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private C4283dd f43771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private LevelPlayNativeAdListener f43772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Wb f43773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f43774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f43775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f43776g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f43777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private LevelPlayNativeAdListener f43778b;

        @NotNull
        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        @Nullable
        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f43778b;
        }

        @Nullable
        public final String getMPlacementName$mediationsdk_release() {
            return this.f43777a;
        }

        public final void setMListener$mediationsdk_release(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f43778b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(@Nullable String str) {
            this.f43777a = str;
        }

        @NotNull
        public final Builder withActivity(@Nullable Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull LevelPlayNativeAdListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f43778b = listener;
            return this;
        }

        @NotNull
        public final Builder withPlacementName(@Nullable String str) {
            this.f43777a = str;
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
        Wb wb2 = this$0.f43773d;
        if (wb2 != null) {
            wb2.a(this$0.f43771b);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.a();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Wb wb2 = this.f43773d;
            if (wb2 != null) {
                wb2.M();
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f43774e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f43774e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f43774e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f43774e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    @Nullable
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f43775f;
    }

    @Nullable
    public final UUID getObjectId() {
        Wb wb2 = this.f43773d;
        if (wb2 != null) {
            return wb2.k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f43774e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String initError = r.m().e();
        Intrinsics.checkNotNullExpressionValue(initError, "initError");
        if (initError.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new Runnable() { // from class: o4.b
                @Override // java.lang.Runnable
                public final void run() {
                    LevelPlayNativeAd.a(this.f96331b);
                }
            });
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): " + initError, IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: o4.a
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f96329b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: o4.d
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.b(this.f96334b, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(@Nullable final IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: o4.c
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f96332b, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(@Nullable final AdInfo adInfo, @NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: o4.e
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(this.f96336b, adapterNativeAdData, nativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f43772c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f43776g = new AtomicBoolean(false);
        this.f43770a = builder.getMPlacementName$mediationsdk_release();
        this.f43772c = builder.getMListener$mediationsdk_release();
    }

    private final void b() {
        if (this.f43776g.compareAndSet(false, true)) {
            Wb wbF = r.m().f();
            this.f43773d = wbF;
            if (wbF != null) {
                wbF.a(this);
                Yb ybM = r.m().m(this.f43770a);
                Intrinsics.checkNotNullExpressionValue(ybM, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f43771b = new C4283dd(ybM);
            }
        }
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f43774e = adapterNativeAdData;
        this$0.f43775f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f43772c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }
}
