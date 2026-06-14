package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Pb extends AbstractC4421m implements InterfaceC4282dc, L0, InterfaceC4610x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sb f41592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4441n0 f41593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Zb f41594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4248bc f41595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f41596f;

    public Pb(@NotNull Sb listener, @NotNull C4441n0 adTools, @NotNull Zb nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.f41592b = listener;
        this.f41593c = adTools;
        this.f41594d = nativeAdProperties;
        this.f41596f = m();
    }

    private final LevelPlayAdInfo m() {
        String string = this.f41594d.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "nativeAdProperties.adId.toString()");
        String strC = this.f41594d.c();
        String string2 = this.f41594d.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void a() {
        li.a(this);
    }

    @Override // com.ironsource.L0
    public /* synthetic */ void b(C4525s0 c4525s0) {
        li.b(this, c4525s0);
    }

    @Override // com.ironsource.InterfaceC4610x0
    public void c(@Nullable IronSourceError ironSourceError) {
        throw new lf.n("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.J0
    public void e() {
        this.f41592b.b(this.f41596f);
    }

    public final void n() {
        this.f41596f = m();
        C4248bc c4248bc = this.f41595e;
        if (c4248bc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4248bc = null;
        }
        c4248bc.a(true);
    }

    public final void o() {
        C4248bc c4248bcA = a(this.f41593c, this.f41594d);
        this.f41595e = c4248bcA;
        if (c4248bcA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4248bcA = null;
        }
        c4248bcA.a((L0) this);
    }

    public final void a(@NotNull Mb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C4248bc c4248bc = this.f41595e;
        if (c4248bc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4248bc = null;
        }
        c4248bc.a(new Ub(nativeAdBinder), this);
    }

    private final C4248bc a(C4441n0 c4441n0, Zb zb2) {
        IronLog.INTERNAL.verbose();
        return new C4248bc(c4441n0, C4265cc.f42815y.a(zb2, l().a()), this);
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4525s0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f41596f = levelPlayAdInfoC;
            this.f41592b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.InterfaceC4610x0
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new lf.n("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.L0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f41592b.onNativeAdLoadFailed(ironSourceError);
    }
}
