package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3805jb extends AbstractC4167y implements InterfaceC3636cj, InterfaceC3678ea, InterfaceC3719g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4142x f38803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4019s1 f38804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hc f38805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ac f38806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3805jb(C4142x adComponent, AbstractC4019s1 adUnitTimeout, Hc publisherCallbacks, Ac stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38803b = adComponent;
        this.f38804c = adUnitTimeout;
        this.f38805d = publisherCallbacks;
        this.f38806e = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadingState", "Initialize Called");
        }
        this.f38804c.getClass();
        InterfaceC3636cj interfaceC3636cj = ((Cd) this).f36675j.f36845b.f37130c;
        Uc uc2 = interfaceC3636cj instanceof Uc ? (Uc) interfaceC3636cj : null;
        if (uc2 != null) {
            C3903n9 c3903n9 = uc2.f37845a.f36789a.f39882a.f39145c;
            if (c3903n9 != null) {
                c3903n9.a("NativeCreatedState", "Inflate Called");
            }
            uc2.f37846b.a(new Dd(uc2.f37845a, uc2.f37846b), uc2);
        }
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3678ea
    public final void e() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadingState", "onInternalLoadTimeout");
        }
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), Re.a() == null ? (short) 2139 : (short) 2203);
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadingState", "onDestroy");
        }
        this.f38806e.a(new C3998r5(((Cd) this).f36675j, this.f38804c, this.f38803b), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("AUM-LoadingState", "transitionToLoadFailedState " + ((int) s10));
        }
        this.f38806e.a(new C3705fb(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf(s10))), inMobiAdRequestStatus, this.f38804c, this.f38803b, this.f38805d, this.f38806e), this);
    }
}
