package com.ironsource;

import android.app.Activity;
import com.ironsource.C4498q6;
import com.ironsource.InterfaceC4582v6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class J6 implements InterfaceC4582v6, C4498q6.b, C4498q6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f41167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4582v6.a f41168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4514r6 f41169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4548t6 f41170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4565u6 f41171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private C4498q6 f41172f;

    public J6(@NotNull C4441n0 adTools, @NotNull InterfaceC4582v6.a config, @NotNull InterfaceC4514r6 fullscreenAdUnitFactory, @NotNull InterfaceC4548t6 fullscreenAdUnitListener, @NotNull InterfaceC4565u6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f41167a = adTools;
        this.f41168b = config;
        this.f41169c = fullscreenAdUnitFactory;
        this.f41170d = fullscreenAdUnitListener;
        this.f41171e = listener;
    }

    @NotNull
    public final C4441n0 a() {
        return this.f41167a;
    }

    @NotNull
    public final InterfaceC4582v6.a b() {
        return this.f41168b;
    }

    @Override // com.ironsource.C4498q6.b
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41171e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void loadAd() {
        C4498q6 c4498q6A = this.f41169c.a(true, this.f41170d);
        c4498q6A.a(this);
        this.f41172f = c4498q6A;
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4498q6 c4498q6 = this.f41172f;
        if (c4498q6 != null) {
            c4498q6.a(activity, this);
        }
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41171e.b(adInfo);
    }

    @Override // com.ironsource.C4498q6.b
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41172f = null;
        this.f41171e.a();
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41171e.a(ironSourceError);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41171e.a(adInfo);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f41171e.c(ironSourceError);
    }
}
