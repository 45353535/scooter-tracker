package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class F6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6 f40874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40876c;

    public F6(@NotNull C6 strategy, @NotNull C4498q6 currentAdUnit, @NotNull C4498q6 progressiveAdUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f40874a = strategy;
        this.f40875b = currentAdUnit;
        this.f40876c = progressiveAdUnit;
    }

    @Override // com.ironsource.I6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40874a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.I6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40874a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.I6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C6 c62 = this.f40874a;
        c62.a(new E6(c62, this.f40875b, this.f40876c, adInfo));
    }

    @Override // com.ironsource.I6
    public void loadAd() {
        C6 c62 = this.f40874a;
        c62.a(new H6(c62, this.f40876c));
    }

    @Override // com.ironsource.I6
    public void a(@Nullable IronSourceError ironSourceError) {
        C6 c62 = this.f40874a;
        c62.a(new D6(c62, this.f40875b, false, 4, null));
    }

    @Override // com.ironsource.I6
    public void a() {
        this.f40874a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.I6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40874a.a("show success before progressive load success");
    }

    @Override // com.ironsource.I6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f40874a.a("show failed before progressive load success");
    }
}
