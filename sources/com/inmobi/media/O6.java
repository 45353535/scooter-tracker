package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class O6 extends AbstractC4167y implements InterfaceC3636cj, InterfaceC3678ea, InterfaceC3719g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4142x f37477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4019s1 f37478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f37479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f37480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O6(C4142x adComponent, AbstractC4019s1 adUnitTimeout, Hc publisherCallbacks, Ac stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f37477b = adComponent;
        this.f37478c = adUnitTimeout;
        this.f37479d = publisherCallbacks;
        this.f37480e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3678ea
    public final void e() {
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-FetchedState", "transitionToLoadFailedState Called");
        }
        this.f37480e.a(new C3705fb(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2138)), inMobiAdRequestStatus, this.f37478c, this.f37477b, this.f37479d, this.f37480e), this);
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-FetchedState", "onDestroy Called");
        }
        this.f37480e.a(new C3998r5(null, this.f37478c, this.f37477b), this);
    }
}
