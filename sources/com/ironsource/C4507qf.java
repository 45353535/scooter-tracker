package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.R8;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4507qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final R8.a f44738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakReference<TestSuiteActivity> f44739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f44740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayBannerAdView> f44741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayInterstitialAd> f44742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicReference<LevelPlayRewardedAd> f44743f;

    public C4507qf(@NotNull TestSuiteActivity activity, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f44738a = Ib.f41088s.a().c();
        this.f44739b = new WeakReference<>(activity);
        this.f44740c = handler;
        this.f44741d = new AtomicReference<>();
        this.f44742e = new AtomicReference<>();
        this.f44743f = new AtomicReference<>();
    }

    public final void a(@NotNull C4642yf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f44738a.a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f44742e;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strA);
        levelPlayInterstitialAd.setListener(new C4591vf());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    public final void b(@NotNull C4642yf loadAdConfig) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        this.f44738a.a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f44743f;
        String strA = loadAdConfig.a();
        if (strA == null) {
            strA = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strA);
        levelPlayRewardedAd.setListener(new Ef());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    public final void e() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f44742e.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final void f() {
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f44743f.get();
            Intrinsics.checkNotNullExpressionValue(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityB, null, 2, null);
        }
    }

    public final boolean c() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f44742e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    public final boolean d() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f44743f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    public final void a(@NotNull C4642yf loadAdConfig, @NotNull String description, int i10, int i11) {
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        Intrinsics.checkNotNullParameter(description, "description");
        a();
        TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB != null) {
            this.f44738a.a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(Bf.f40456a.b(description, i10, i11)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f44741d;
            String strA = loadAdConfig.a();
            if (strA == null) {
                strA = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityB, strA, configBuild);
            levelPlayBannerAdView.setBannerListener(new C4523rf());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    private final TestSuiteActivity b() {
        return this.f44739b.get();
    }

    public final void a(double d10) {
        final LevelPlayBannerAdView levelPlayBannerAdView;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (levelPlayBannerAdView = this.f44741d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f44740c.post(new Runnable() { // from class: com.ironsource.ql
            @Override // java.lang.Runnable
            public final void run() {
                C4507qf.a(testSuiteActivityB, levelPlayBannerAdView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        Intrinsics.checkNotNullParameter(testSuiteActivity, "$testSuiteActivity");
        Intrinsics.checkNotNullParameter(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, Gf.f41012a.a((Context) testSuiteActivity));
    }

    public final void a() {
        final LevelPlayBannerAdView andSet;
        final TestSuiteActivity testSuiteActivityB = b();
        if (testSuiteActivityB == null || (andSet = this.f44741d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f44740c.post(new Runnable() { // from class: com.ironsource.pl
            @Override // java.lang.Runnable
            public final void run() {
                C4507qf.b(testSuiteActivityB, andSet);
            }
        });
    }
}
