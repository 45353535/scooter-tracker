package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ca;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.r1;
import com.startapp.sdk.internal.s7;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class BannerRequest {

    @NonNull
    private final lb adCacheManager;

    @NonNull
    private BannerFormat adFormat;

    @Nullable
    private AdPreferences adPreferences;

    @Nullable
    private Point adSizeDp;

    @NonNull
    private final lb consentManager;

    @NonNull
    private final Context context;

    @NonNull
    private final lb eventTracer;

    @NonNull
    private final lb externalAds;

    @NonNull
    protected final lb httpClient;

    @NonNull
    protected final lb motionProcessor;

    @NonNull
    protected final lb networkApiExecutor;

    @NonNull
    private final lb videoAdCacheManager;

    @NonNull
    protected final lb webViewCacheLoader;

    @NonNull
    private final lb webViewFactory;

    @Keep
    public interface Callback {
        @Keep
        void onFinished(@Nullable BannerCreator bannerCreator, @Nullable String str);
    }

    @Keep
    public BannerRequest(@NonNull Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).f64183j, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).N, com.startapp.sdk.components.a.a(context).f64175b, com.startapp.sdk.components.a.a(context).f64187n, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).f64196w, com.startapp.sdk.components.a.a(context).f64176c, com.startapp.sdk.components.a.a(context).f64174a);
    }

    public static Unit a(BannerRequest bannerRequest, Callback callback, Point point, AdPreferences adPreferences, AdUnitConfig adUnitConfig, int i10, MetaData metaData, ea eaVar) {
        bannerRequest.getClass();
        if (eaVar == null) {
            callback.onFinished(null, null);
            return Unit.f93236a;
        }
        s7 s7Var = (s7) eaVar;
        s7Var.f65245c = point.x;
        s7Var.f65246d = point.y;
        s7Var.f65247e = new d(bannerRequest, callback, adPreferences, point, adUnitConfig, i10, metaData);
        s7Var.a();
        return Unit.f93236a;
    }

    public static /* synthetic */ void b(BannerRequest bannerRequest, Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            ((z6) ((y6) bannerRequest.eventTracer.a())).c(bannerRequest, ii.f64701f);
        } else {
            ((z6) ((y6) bannerRequest.eventTracer.a())).c(bannerRequest, ii.f64702g);
        }
        ((z6) ((y6) bannerRequest.eventTracer.a())).b(bannerRequest, ii.f64699d);
        callback.onFinished(bannerCreator, str);
    }

    public static /* synthetic */ void c(BannerRequest bannerRequest, Callback callback, String str, BannerCreator bannerCreator, String str2) {
        bannerRequest.getClass();
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str2);
            return;
        }
        ExternalConfig externalConfigU = MetaData.E().u();
        if (externalConfigU == null || !externalConfigU.getLoadInnerAdIfNoExternal()) {
            callback.onFinished(null, str2);
        } else {
            bannerRequest.loadInnerAd(callback, str);
        }
    }

    @NonNull
    private Point chooseSize() {
        int i10;
        int i11;
        Point point = this.adSizeDp;
        if (point != null) {
            i10 = point.x;
            i11 = point.y;
        } else {
            BannerFormat bannerFormat = this.adFormat;
            i10 = bannerFormat.widthDp;
            i11 = bannerFormat.heightDp;
        }
        return new Point(i10, i11);
    }

    public static /* synthetic */ void d(BannerRequest bannerRequest, Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            bannerRequest.getClass();
            callback.onFinished(bannerCreator, str);
        } else if (e7.a(true, bannerRequest.getAdTag(), true, false)) {
            bannerRequest.loadExternalAd(callback, 2);
        } else {
            callback.onFinished(null, str);
        }
    }

    public static /* synthetic */ void e(final BannerRequest bannerRequest, Callback callback, final int i10) {
        final Callback callback2;
        Throwable th2;
        final AdUnitConfig adUnitConfig;
        bannerRequest.getClass();
        try {
            AdPreferences adPreferences = bannerRequest.adPreferences;
            if (adPreferences == null) {
                adPreferences = new AdPreferences();
            }
            final AdPreferences adPreferences2 = adPreferences;
            final MetaData metaDataE = MetaData.E();
            ExternalAdConfig externalAdConfigV = metaDataE.v();
            if (externalAdConfigV != null) {
                try {
                    adUnitConfig = externalAdConfigV.getMapping().get(adPreferences2.getAdTag());
                } catch (Throwable th3) {
                    th2 = th3;
                    callback2 = callback;
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                callback.onFinished(null, "No ad unit found");
                return;
            }
            final Point pointChooseSize = bannerRequest.chooseSize();
            callback2 = callback;
            try {
                ((k0) bannerRequest.externalAds.a()).a(adUnitConfig, new Function1() { // from class: com.startapp.sdk.ads.banner.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BannerRequest.a(this.f63776b, callback2, pointChooseSize, adPreferences2, adUnitConfig, i10, metaDataE, (ea) obj);
                    }
                });
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            callback2 = callback;
        }
        th2 = th;
        callback2.onFinished(null, th2.getMessage());
        g9.a(th2);
    }

    @Nullable
    private String getAdTag() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences.getAdTag();
        }
        return null;
    }

    private void loadExternalAd(@NonNull final Callback callback, final int i10) {
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.C);
        h0.a(new Runnable() { // from class: com.startapp.sdk.ads.banner.j
            @Override // java.lang.Runnable
            public final void run() {
                BannerRequest.e(this.f63783b, callback, i10);
            }
        });
    }

    private void loadImpl(@NonNull final Callback callback, @Nullable final String str) {
        if (e7.a(false, getAdTag(), true, false)) {
            loadExternalAd(new Callback() { // from class: com.startapp.sdk.ads.banner.f
                @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
                public final void onFinished(BannerCreator bannerCreator, String str2) {
                    BannerRequest.c(this.f63769a, callback, str, bannerCreator, str2);
                }
            }, 1);
        } else {
            loadInnerAd(callback, str);
        }
    }

    private void loadInnerAd(@NonNull final Callback callback, @Nullable String str) {
        loadInnerAdImpl(new Callback() { // from class: com.startapp.sdk.ads.banner.g
            @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
            public final void onFinished(BannerCreator bannerCreator, String str2) {
                BannerRequest.d(this.f63772a, callback, bannerCreator, str2);
            }
        }, str);
    }

    private void loadInnerAdImpl(@NonNull Callback callback, @Nullable String str) {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        r1 r1Var = new r1(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point pointChooseSize = chooseSize();
        ((z6) ((y6) this.eventTracer.a())).a(this, r1Var);
        ((z6) ((y6) this.eventTracer.a())).c(this, ii.D);
        r1Var.f65182t = bannerFormat.type;
        int i10 = pointChooseSize.x;
        int i11 = pointChooseSize.y;
        r1Var.f64998c = i10;
        r1Var.f64999d = i11;
        r1Var.load(adPreferences, new c(callback, bannerFormat, adPreferences, r1Var), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z10, @NonNull String uuid, @NonNull String originalTS, @NonNull AdPreferences adPreferences, @NonNull Point size, @NonNull AdUnitConfig config, int i10) {
        Context context = this.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        ca caVar = new ca(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4);
        caVar.f64356b = z10;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        caVar.f64357c = uuid;
        Intrinsics.checkNotNullParameter(originalTS, "originalTS");
        caVar.f64359e = originalTS;
        Intrinsics.checkNotNullParameter(config, "config");
        caVar.f64358d = config;
        Intrinsics.checkNotNullParameter(size, "size");
        caVar.f64360f = size;
        caVar.f64361g = Integer.valueOf(this.adFormat.type);
        caVar.f64362h = Integer.valueOf(i10);
        caVar.f64363i = config.getSioPrice();
        new da(context, adPreferences, placement, lbVar, lbVar2, lbVar3, lbVar4, caVar).a();
    }

    @Keep
    public void load(@NonNull Callback callback) {
        load(callback, null);
    }

    @NonNull
    @Keep
    public BannerRequest setAdFormat(@NonNull BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    @NonNull
    @Keep
    public BannerRequest setAdPreferences(@Nullable AdPreferences adPreferences) {
        this.adPreferences = adPreferences;
        return this;
    }

    @NonNull
    @Keep
    public BannerRequest setAdSize(int i10, int i11) {
        this.adSizeDp = new Point(i10, i11);
        return this;
    }

    @Keep
    public void load(@NonNull final Callback callback, @Nullable String str) {
        ((z6) ((y6) this.eventTracer.a())).a((Object) this, ii.f64699d);
        loadImpl(new Callback() { // from class: com.startapp.sdk.ads.banner.h
            @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
            public final void onFinished(BannerCreator bannerCreator, String str2) {
                BannerRequest.b(this.f63774a, callback, bannerCreator, str2);
            }
        }, str);
    }

    @VisibleForTesting(otherwise = 4)
    public BannerRequest(@NonNull Context context, @NonNull lb lbVar, @NonNull lb lbVar2, @NonNull lb lbVar3, @NonNull lb lbVar4, @NonNull lb lbVar5, @NonNull lb lbVar6, @NonNull lb lbVar7, @NonNull lb lbVar8, @NonNull lb lbVar9, @NonNull lb lbVar10) {
        this.adFormat = BannerFormat.BANNER;
        this.context = context.getApplicationContext();
        this.eventTracer = lbVar;
        this.consentManager = lbVar2;
        this.adCacheManager = lbVar3;
        this.videoAdCacheManager = lbVar4;
        this.webViewFactory = lbVar5;
        this.httpClient = lbVar6;
        this.networkApiExecutor = lbVar7;
        this.motionProcessor = lbVar8;
        this.webViewCacheLoader = lbVar9;
        this.externalAds = lbVar10;
    }
}
