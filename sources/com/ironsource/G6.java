package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class G6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6 f40952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f40953b;

    public G6(@NotNull C6 strategy, @NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f40952a = strategy;
        this.f40953b = adUnit;
    }

    @Override // com.ironsource.I6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40953b.a(activity, this.f40952a);
    }

    @Override // com.ironsource.I6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40952a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.I6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40952a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.I6
    public void loadAd() {
        C6 c62 = this.f40952a;
        c62.a(new D6(c62, null, false, 4, null));
        this.f40952a.loadAd();
    }

    @Override // com.ironsource.I6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f40952a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.I6
    public void c(@Nullable IronSourceError ironSourceError) {
        if (!C4258c5.f42807a.a(ironSourceError)) {
            C6 c62 = this.f40952a;
            c62.a(new D6(c62, null, false, 4, null));
        }
        this.f40952a.d().c(ironSourceError);
    }

    @Override // com.ironsource.I6
    public void a() {
        C6 c62 = this.f40952a;
        c62.a(new D6(c62, null, true));
        this.f40952a.d().a();
    }

    @Override // com.ironsource.I6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40952a.d().a(adInfo);
        C4498q6 c4498q6A = this.f40952a.b().a(false, this.f40952a.c());
        C6 c62 = this.f40952a;
        c62.a(new F6(c62, this.f40953b, c4498q6A));
        c4498q6A.a(this.f40952a);
    }
}
