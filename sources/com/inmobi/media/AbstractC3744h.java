package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import j$.util.Objects;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3744h extends AbstractC3713fj implements InterfaceC3870m1, InterfaceC3678ea, InterfaceC3719g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3744h(CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
    }

    public final void a(byte[] bArr) {
        (bArr != null ? Integer.valueOf(bArr.length) : "null").toString();
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        Y4 y42 = interfaceC3636cj instanceof Y4 ? (Y4) interfaceC3636cj : null;
        if (y42 != null) {
            y42.a(bArr);
        }
    }

    public final void c() {
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        Y4 y42 = interfaceC3636cj instanceof Y4 ? (Y4) interfaceC3636cj : null;
        if (y42 == null) {
            Kb.a((byte) 1, "InMobi", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return;
        }
        C3903n9 c3903n9 = y42.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-CreatedState", "fetch called");
        }
        C3617c0 c3617c0 = y42.f38480f;
        c3617c0.getClass();
        c3617c0.f38308a = SystemClock.elapsedRealtime();
        C3869m0 c3869m0 = y42.f38481g;
        eg.i.d(c3869m0.f38999a, null, null, new C3694f0(c3869m0, null), 3, null);
        if (y42.b()) {
            C3903n9 c3903n92 = y42.f38479e;
            if (c3903n92 != null) {
                c3903n92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C3920o1 adManagerComponent = y42.f38022h;
        Ac stateMachine = y42.f38024j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C3602bb adUnitTimeout = new C3602bb(adManagerComponent, stateMachine);
        Tc tc2 = (Tc) y42;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        C3903n9 c3903n93 = tc2.f38479e;
        if (c3903n93 != null) {
            c3903n93.a("AUM-NativeCreatedState", "transitionToFetchingState");
        }
        tc2.f37764m.a(new C3604bd(tc2.f37762k, adUnitTimeout, tc2.f37764m, tc2.f37763l), tc2);
    }

    @Override // com.inmobi.media.InterfaceC3678ea
    public final void e() {
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        InterfaceC3678ea interfaceC3678ea = interfaceC3636cj instanceof InterfaceC3678ea ? (InterfaceC3678ea) interfaceC3636cj : null;
        if (interfaceC3678ea != null) {
            interfaceC3678ea.e();
        }
    }

    public final void g() {
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        AbstractC4011ri abstractC4011ri = interfaceC3636cj instanceof AbstractC4011ri ? (AbstractC4011ri) interfaceC3636cj : null;
        if (abstractC4011ri != null) {
            InterfaceC3878m9 interfaceC3878m9L = abstractC4011ri.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("AUM-RenderedState", "onAdImpression");
            }
            P4.a(abstractC4011ri.k(), new C3962pi(abstractC4011ri, null));
        }
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        InterfaceC3719g interfaceC3719g = interfaceC3636cj instanceof InterfaceC3719g ? (InterfaceC3719g) interfaceC3636cj : null;
        if (interfaceC3719g != null) {
            interfaceC3719g.j();
        }
    }

    public final void a(InMobiAdRequestStatus status, short s10) {
        Intrinsics.checkNotNullParameter(status, "status");
        Objects.toString(status);
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        AbstractC3805jb abstractC3805jb = interfaceC3636cj instanceof AbstractC3805jb ? (AbstractC3805jb) interfaceC3636cj : null;
        if (abstractC3805jb != null) {
            Intrinsics.checkNotNullParameter(status, "status");
            InterfaceC3878m9 interfaceC3878m9L = abstractC3805jb.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).b("AUM-LoadingState", "onLoadFailure");
            }
            abstractC3805jb.a(status, s10);
        }
    }

    public final void a(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Objects.toString(params);
        InterfaceC3636cj interfaceC3636cj = ((Ac) this).f36566c;
        AbstractC4011ri abstractC4011ri = interfaceC3636cj instanceof AbstractC4011ri ? (AbstractC4011ri) interfaceC3636cj : null;
        if (abstractC4011ri != null) {
            Intrinsics.checkNotNullParameter(params, "params");
            InterfaceC3878m9 interfaceC3878m9L = abstractC4011ri.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("AUM-RenderedState", com.ironsource.Df.f40645f);
            }
            P4.a(abstractC4011ri.k(), new C3937oi(abstractC4011ri, params, null));
        }
    }
}
