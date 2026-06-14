package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4616x6 implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4599w6 f45820a;

    public C4616x6(@NotNull C4599w6 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f45820a = strategy;
    }

    @Override // com.ironsource.B6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45820a.a("show called before load success");
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45820a.a("load success before load called");
    }

    @Override // com.ironsource.B6
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45820a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.B6
    public void loadAd() {
        C4498q6 c4498q6A = this.f45820a.b().a(true, this.f45820a.c());
        this.f45820a.a(new C4650z6(this.f45820a, c4498q6A, true));
        c4498q6A.a(this.f45820a);
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45820a.a("ad expired before load called");
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45820a.a("load failed before load called");
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45820a.a("ad display success before load called");
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45820a.a("ad display failed before load called");
    }
}
