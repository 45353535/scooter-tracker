package com.ironsource;

import android.app.Activity;
import com.ironsource.Za;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4264cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final I7 f42812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Za f42813b;

    /* JADX INFO: renamed from: com.ironsource.cb$a */
    public static final class a implements InterfaceC4593w0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4593w0
        @NotNull
        public AbstractC4576v0 a(boolean z10, @NotNull C4304f0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C9.f40479z.a(adProperties, C4264cb.this.f42812a.e().a(), z10);
        }
    }

    public C4264cb(@NotNull String adUnitId, @NotNull Za.b config, @NotNull C4441n0 adTools, @NotNull C4310f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4496q4 currentTimeProvider, @NotNull C4600w7 idFactory) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f42812a = provider;
        this.f42813b = new Za(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, a(), provider, currentTimeProvider, idFactory);
    }

    @NotNull
    public final String b() {
        String string = this.f42813b.e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f42813b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f42813b.n();
    }

    public final void a(@Nullable LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f42813b.a(levelPlayInterstitialAdListener != null ? C4281db.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f42813b.a(activity, str);
    }

    private final InterfaceC4593w0 a() {
        return new a();
    }
}
