package com.ironsource;

import android.app.Activity;
import com.ironsource.C4498q6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4599w6 implements InterfaceC4582v6, C4498q6.b, C4498q6.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f45713f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f45714g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4441n0 f45715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4514r6 f45716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4548t6 f45717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4565u6 f45718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private B6 f45719e;

    /* JADX INFO: renamed from: com.ironsource.w6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4599w6(@NotNull C4441n0 adTools, @NotNull InterfaceC4514r6 factory, @NotNull InterfaceC4548t6 fullscreenAdUnitListener, @NotNull InterfaceC4565u6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45715a = adTools;
        this.f45716b = factory;
        this.f45717c = fullscreenAdUnitListener;
        this.f45718d = listener;
        this.f45719e = new C4616x6(this);
    }

    @NotNull
    public final C4441n0 a() {
        return this.f45715a;
    }

    @NotNull
    public final InterfaceC4514r6 b() {
        return this.f45716b;
    }

    @NotNull
    public final InterfaceC4548t6 c() {
        return this.f45717c;
    }

    @NotNull
    public final InterfaceC4565u6 d() {
        return this.f45718d;
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void loadAd() {
        this.f45719e.loadAd();
    }

    public final void a(@NotNull B6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f45719e = state;
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45719e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C4498q6.b
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45719e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC4582v6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45719e.a(activity);
    }

    @Override // com.ironsource.C4498q6.b
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45719e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C4498q6.b
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45719e.a(adUnit);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45719e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C4498q6.a
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f45719e.a(adUnit, ironSourceError);
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f45715a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
