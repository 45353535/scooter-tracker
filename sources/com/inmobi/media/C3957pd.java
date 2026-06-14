package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3957pd extends AbstractC4167y implements InterfaceC4010rh, InterfaceC3636cj, I, InterfaceC3719g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fc f39273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4142x f39274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC4019s1 f39275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f39276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3605be f39277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4142x f39278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Fc f39279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f39280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f39281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3957pd(C3605be nativePubData, C4142x adComponent, Fc adUnit, AbstractC4019s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(nativePubData, "nativePubData");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39273b = adUnit;
        this.f39274c = adComponent;
        this.f39275d = adUnitTimeout;
        this.f39276e = stateMachine;
        this.f39277f = nativePubData;
        this.f39278g = adComponent;
        this.f39279h = adUnit;
        this.f39280i = nativeCallback;
        this.f39281j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC3878m9 interfaceC3878m9L2 = l();
        if (interfaceC3878m9L2 != null) {
            ((C3903n9) interfaceC3878m9L2).a("AUM-LoadedState", "Initialize Called");
        }
        this.f39275d.e();
        C3617c0 c3617c0 = this.f39960a.f39882a.f39146d;
        c3617c0.getClass();
        c3617c0.f38314g = SystemClock.elapsedRealtime();
        P4.a(k(), new C3932od(this, null));
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC3878m9 interfaceC3878m9L2 = l();
        if (interfaceC3878m9L2 != null) {
            ((C3903n9) interfaceC3878m9L2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.f39281j.a(new C4032se(this.f39279h, this.f39278g, this.f39280i, this.f39281j), this);
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadedState", "onDestroy");
        }
        this.f39276e.a(new C3998r5(this.f39273b, this.f39275d, this.f39274c), this);
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Fc fc2 = this.f39279h;
        fc2.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fc2.f36845b.a(inMobiNativeViewData);
    }
}
