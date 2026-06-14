package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class E6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6 f40678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f40681d;

    public E6(@NotNull C6 strategy, @NotNull C4498q6 currentAdUnit, @NotNull C4498q6 progressiveAdUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40678a = strategy;
        this.f40679b = currentAdUnit;
        this.f40680c = progressiveAdUnit;
        this.f40681d = adInfo;
    }

    @Override // com.ironsource.I6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40678a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.I6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40681d = adInfo;
    }

    @Override // com.ironsource.I6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40678a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.I6
    public void loadAd() {
        this.f40678a.d().b(this.f40681d);
        C6 c62 = this.f40678a;
        c62.a(new G6(c62, this.f40680c));
    }

    @Override // com.ironsource.I6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f40678a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.I6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f40678a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.I6
    public void a() {
        C6 c62 = this.f40678a;
        c62.a(new D6(c62, this.f40679b, true));
    }

    @Override // com.ironsource.I6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40678a.a("show success on progressive ad unit that already loaded");
    }
}
