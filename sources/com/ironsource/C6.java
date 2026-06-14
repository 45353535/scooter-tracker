package com.ironsource;

import android.app.Activity;
import com.ironsource.C4498q6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class C6 implements InterfaceC4582v6, C4498q6.b, C4498q6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f40470f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f40471g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f40472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4514r6 f40473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4548t6 f40474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4565u6 f40475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private I6 f40476e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6(@NotNull C4441n0 adTools, @NotNull InterfaceC4514r6 factory, @NotNull InterfaceC4548t6 fullscreenAdUnitListener, @NotNull InterfaceC4565u6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40472a = adTools;
        this.f40473b = factory;
        this.f40474c = fullscreenAdUnitListener;
        this.f40475d = listener;
        this.f40476e = new D6(this, null, false, 4, null);
    }

    @NotNull
    public final C4441n0 a() {
        return this.f40472a;
    }

    @NotNull
    public final InterfaceC4514r6 b() {
        return this.f40473b;
    }

    @NotNull
    public final InterfaceC4548t6 c() {
        return this.f40474c;
    }

    @NotNull
    public final InterfaceC4565u6 d() {
        return this.f40475d;
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void loadAd() {
        this.f40476e.loadAd();
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40476e.a(activity);
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40476e.c(adInfo);
    }

    @Override // com.ironsource.C4498q6.b
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40476e.b(adInfo);
    }

    public final void a(@NotNull I6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f40476e = state;
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f40476e.a(ironSourceError);
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f40472a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40476e.a(adInfo);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f40476e.c(ironSourceError);
    }

    @Override // com.ironsource.C4498q6.b
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f40476e.a();
    }
}
