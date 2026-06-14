package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.MainThread;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.common.VideoController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.bm;
import yads.bn2;
import yads.c4;
import yads.cm;
import yads.dm;
import yads.dn2;
import yads.dn3;
import yads.e9;
import yads.eb1;
import yads.ec;
import yads.em;
import yads.gn3;
import yads.km;
import yads.ko3;
import yads.lm;
import yads.oz;
import yads.pr3;
import yads.qz;
import yads.uz;
import yads.v5;
import yads.vz1;
import yads.wa1;
import yads.ze3;
import yads.zh0;
import yads.zn3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdView;", "Lyads/eb1;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;)V", "Lcom/yandex/mobile/ads/banner/BannerAdEventListener;", "bannerAdEventListener", "setBannerAdEventListener", "(Lcom/yandex/mobile/ads/banner/BannerAdEventListener;)V", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", C4240b4.i.O, "setAdSize", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;)V", "", "adUnitId", "setAdUnitId", "(Ljava/lang/String;)V", "destroy", "()V", "Lcom/yandex/mobile/ads/common/VideoController;", "o", "Lcom/yandex/mobile/ads/common/VideoController;", "getVideoController", "()Lcom/yandex/mobile/ads/common/VideoController;", "videoController", "getAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getInfo", "()Ljava/lang/String;", "info", "Lcom/yandex/mobile/ads/common/AdInfo;", "getAdInfo", "()Lcom/yandex/mobile/ads/common/AdInfo;", "adInfo", "", "", "getAdAttributes", "()Ljava/util/List;", "adAttributes", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
@MainThread
public final class BannerAdView extends eb1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final gn3 f68173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final lm f68174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final dn3 f68175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f68176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final VideoController videoController;

    public BannerAdView(@NotNull Context context) {
        this(context, null);
    }

    @Override // yads.eb1
    protected final cm a(Context context, c4 c4Var, bm bmVar, v5 v5Var) {
        return new cm(context, this, bmVar, v5Var, new ze3(), new em(), new dm(getSdkEnvironmentModule$mobileads_externalRelease()), new vz1(c4Var), new zh0());
    }

    @Override // yads.eb1
    public void destroy() {
        super.destroy();
    }

    @NotNull
    public final List<Object> getAdAttributes() {
        List<ec> listB = b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
        for (ec ecVar : listB) {
            this.f68174l.getClass();
            arrayList.add(new km(ecVar));
        }
        return arrayList;
    }

    @NotNull
    public final AdInfo getAdInfo() {
        String str = this.f68176n;
        if (str == null) {
            str = "";
        }
        oz ozVarA = a(str);
        this.f68175m.getClass();
        return dn3.a(ozVarA);
    }

    @Nullable
    public final BannerAdSize getAdSize() {
        uz uzVarC = c();
        if (uzVarC != null) {
            return new BannerAdSize(uzVarC.f115879a);
        }
        return null;
    }

    @Nullable
    public final String getInfo() {
        return d();
    }

    @NotNull
    public final VideoController getVideoController() {
        return this.videoController;
    }

    public final void loadAd(@NotNull AdRequest adRequest) {
        bn2 bn2VarA;
        String str = this.f68176n;
        if (str == null || str.length() <= 0) {
            wa1.a("Failed to load ad with empty ad unit id", new Object[0]);
            return;
        }
        gn3 gn3Var = this.f68173k;
        gn3Var.getClass();
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            gn3Var.f111284a.getClass();
            bn2VarA = dn2.a(preferredTheme);
        } else {
            bn2VarA = null;
        }
        bn2 bn2Var = bn2VarA;
        a(new e9(str, adRequest.getAge(), adRequest.getGender(), adRequest.getContextQuery(), adRequest.getContextTags(), adRequest.getLocation(), adRequest.getParameters(), adRequest.getBiddingData(), null, bn2Var, false, null));
    }

    public final void setAdSize(@NotNull BannerAdSize adSize) {
        a(a.a(adSize));
    }

    @Override // yads.eb1
    public void setAdUnitId(@Nullable String adUnitId) {
        this.f68176n = adUnitId;
        super.setAdUnitId(adUnitId);
    }

    public final void setBannerAdEventListener(@Nullable BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener instanceof ClosableBannerAdEventListener ? new ko3((ClosableBannerAdEventListener) bannerAdEventListener) : bannerAdEventListener != null ? new zn3(bannerAdEventListener) : null);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, new c4(qz.f115221d), new pr3(context));
        this.f68173k = new gn3();
        this.f68174l = new lm();
        this.f68175m = new dn3();
        this.videoController = new VideoController(e());
    }
}
