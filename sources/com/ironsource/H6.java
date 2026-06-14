package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class H6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6 f41043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f41044b;

    public H6(@NotNull C6 strategy, @NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41043a = strategy;
        this.f41044b = adUnit;
    }

    @Override // com.ironsource.I6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41043a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.I6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41043a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.I6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C6 c62 = this.f41043a;
        c62.a(new G6(c62, this.f41044b));
        this.f41043a.d().b(adInfo);
    }

    @Override // com.ironsource.I6
    public void loadAd() {
        this.f41043a.d().a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.I6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f41043a.a("show failed while loading");
    }

    @Override // com.ironsource.I6
    public void a(@Nullable IronSourceError ironSourceError) {
        C6 c62 = this.f41043a;
        c62.a(new D6(c62, this.f41044b, false, 4, null));
        this.f41043a.d().a(ironSourceError);
    }

    @Override // com.ironsource.I6
    public void a() {
        this.f41043a.a("ad expired while loading");
    }

    @Override // com.ironsource.I6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41043a.a("show success while loading");
    }
}
