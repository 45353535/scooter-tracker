package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4582v6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4293e6 extends AbstractC4421m implements InterfaceC4548t6, InterfaceC4565u6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4327g6 f42965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4304f0 f42966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4582v6 f42967d;

    public /* synthetic */ C4293e6(InterfaceC4327g6 interfaceC4327g6, C4441n0 c4441n0, C4304f0 c4304f0, InterfaceC4582v6.b bVar, InterfaceC4514r6 interfaceC4514r6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4327g6, c4441n0, c4304f0, (i10 & 8) != 0 ? new InterfaceC4582v6.b() : bVar, interfaceC4514r6);
    }

    public final void a(@NotNull Activity activity, @Nullable C4283dd c4283dd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f42966c.a(c4283dd);
        this.f42967d.a(activity);
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42965b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void c(@Nullable IronSourceError ironSourceError) {
        InterfaceC4327g6 interfaceC4327g6 = this.f42965b;
        String string = this.f42966c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC4327g6.a(new LevelPlayAdError(ironSourceError, string, this.f42966c.c()));
    }

    @Override // com.ironsource.J0
    public void e() {
        this.f42965b.onAdClicked();
    }

    public final void m() {
        this.f42967d.loadAd();
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42965b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4548t6
    public void onClosed() {
        this.f42965b.onAdClosed();
    }

    public C4293e6(@NotNull InterfaceC4327g6 listener, @NotNull C4441n0 adTools, @NotNull C4304f0 adProperties, @NotNull InterfaceC4582v6.b adUnitStrategyFactory, @NotNull InterfaceC4514r6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f42965b = listener;
        this.f42966c = adProperties;
        this.f42967d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC4327g6 interfaceC4327g6 = this.f42965b;
        String string = this.f42966c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC4327g6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f42966c.c()));
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42965b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC4548t6
    public void a(@NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f42965b.a(reward);
    }

    @Override // com.ironsource.InterfaceC4565u6
    public void a() {
        this.f42965b.a();
    }
}
