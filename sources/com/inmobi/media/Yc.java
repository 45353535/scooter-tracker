package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Yc extends O6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4142x f38047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InMobiJsonResponse f38048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC4019s1 f38049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hc f38050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ac f38051j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yc(C4142x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4019s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38047f = adComponent;
        this.f38048g = inMobiJsonResponse;
        this.f38049h = adUnitTimeout;
        this.f38050i = nativeCallback;
        this.f38051j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeFetchedState", "Initialize Called - ad fetched successfully");
        }
        InterfaceC3878m9 interfaceC3878m9L2 = l();
        if (interfaceC3878m9L2 != null) {
            ((C3903n9) interfaceC3878m9L2).a("AUM-FetchedState", "Initialize Called");
        }
        this.f37478c.getClass();
        C4142x c4142x = this.f39960a;
        C3869m0 c3869m0 = c4142x.f39882a.f39148f;
        G adContext = c4142x.f39883b;
        c3869m0.getClass();
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        eg.i.d(c3869m0.f38999a, null, null, new C3770i0(adContext, c3869m0, null), 3, null);
        P4.a(k(), new N6(this, null));
    }
}
