package com.ironsource;

import com.ironsource.InterfaceC4496q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4654za extends AbstractC4421m implements N2, Ba {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4441n0 f45973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final I2 f45974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakReference<InterfaceC4578v2> f45975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f45976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Aa f45977f;

    public C4654za(@NotNull InterfaceC4578v2 listener, @NotNull C4441n0 adTools, @NotNull I2 bannerAdProperties, @NotNull V2 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.f45973b = adTools;
        this.f45974c = bannerAdProperties;
        this.f45975d = new WeakReference<>(listener);
        this.f45976e = n();
        this.f45977f = Wa.f41992a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (64 & 64) != 0 ? new InterfaceC4496q4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K2 a(C4654za this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.f45973b, this$0.f45974c, z10);
    }

    private final M2 m() {
        return new M2() { // from class: com.ironsource.wn
            @Override // com.ironsource.M2
            public final K2 a(boolean z10) {
                return C4654za.a(this.f45812a, z10);
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String string = this.f45974c.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.f45974c.c();
        String string2 = this.f45974c.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, 120, null);
    }

    public final void c() {
        this.f45977f.c();
    }

    public final void d() {
        this.f45977f.d();
    }

    @Override // com.ironsource.J0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f45977f.f();
    }

    @Override // com.ironsource.N2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.f93236a;
    }

    @Override // com.ironsource.N2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.f93236a;
    }

    @Override // com.ironsource.Ba
    public void i() {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.a(this.f45976e);
        }
    }

    @Override // com.ironsource.N2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.f93236a;
    }

    @Override // com.ironsource.Ba
    public void k() {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.c(this.f45976e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.Ba
    public void onAdClicked() {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.d(this.f45976e);
        }
    }

    @Override // com.ironsource.Ba
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45976e = adInfo;
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.b(this.f45976e);
        }
    }

    @Override // com.ironsource.Ba
    public void onAdLeftApplication() {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.e(this.f45976e);
        }
    }

    @Override // com.ironsource.Ba
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f45976e = adInfo;
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            interfaceC4578v2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final K2 a(C4441n0 c4441n0, I2 i22, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new K2(c4441n0, L2.f41223z.a(i22, l().a(), z10), this);
    }

    public final void b() {
        this.f45977f.b();
    }

    @Override // com.ironsource.Ba
    public void d(@Nullable IronSourceError ironSourceError) {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f45976e;
            String string = this.f45974c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC4578v2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f45974c.c()));
        }
    }

    @Override // com.ironsource.Ba
    public void b(@Nullable IronSourceError ironSourceError) {
        InterfaceC4578v2 interfaceC4578v2 = this.f45975d.get();
        if (interfaceC4578v2 != null) {
            String string = this.f45974c.b().toString();
            Intrinsics.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC4578v2.a(new LevelPlayAdError(ironSourceError, string, this.f45974c.c()));
        }
    }
}
