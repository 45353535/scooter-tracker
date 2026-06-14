package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Cd extends AbstractC3805jb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4142x f36671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC4019s1 f36672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Hc f36673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f36674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fc f36675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(C4142x adComponent, InMobiJsonResponse inMobiJsonResponse, AbstractC4019s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(adComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f36671f = adComponent;
        this.f36672g = adUnitTimeout;
        this.f36673h = nativeCallback;
        this.f36674i = stateMachine;
        this.f36675j = new Fc(new Ec(adComponent, inMobiJsonResponse, stateMachine));
    }

    public final void a(C3605be pubData) {
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-NativeLoadingState", "onLoadSuccess - ad loaded successfully " + pubData);
        }
        this.f36674i.a(new C3957pd(pubData, this.f36671f, this.f36675j, this.f36672g, this.f36673h, this.f36674i), this);
    }
}
