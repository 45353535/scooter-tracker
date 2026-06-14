package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4650z6 implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4599w6 f45970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f45971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45972c;

    public C4650z6(@NotNull C4599w6 strategy, @NotNull C4498q6 currentAdUnit, boolean z10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f45970a = strategy;
        this.f45971b = currentAdUnit;
        this.f45972c = z10;
    }

    @Override // com.ironsource.B6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45970a.a("show called while loading");
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.f45972c) {
            this.f45970a.a(new C4633y6(this.f45970a, this.f45971b, null, false));
            return;
        }
        C4498q6 c4498q6A = this.f45970a.b().a(false, this.f45970a.c());
        this.f45970a.a(new C4633y6(this.f45970a, this.f45971b, c4498q6A, true));
        this.f45970a.d().b(adInfo);
        c4498q6A.a(this.f45970a);
    }

    @Override // com.ironsource.B6
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45970a.a("ad info changed while loading");
    }

    @Override // com.ironsource.B6
    public void loadAd() {
        if (this.f45972c) {
            this.f45970a.a("load called while loading");
        }
        this.f45972c = true;
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45970a.a("show success while loading");
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45970a.a("show failed while loading");
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45970a.a("ad expired while loading");
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45970a.a(new C4616x6(this.f45970a));
        if (this.f45972c) {
            this.f45970a.d().a(ironSourceError);
        }
    }
}
