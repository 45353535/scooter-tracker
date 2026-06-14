package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import j$.util.Objects;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class R6 extends AbstractC3668e0 implements InterfaceC3636cj, InterfaceC3678ea, InterfaceC3719g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3920o1 f37639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ac f37640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC4019s1 f37641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f37642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CoroutineScope f37643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3906nc f37644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f37645n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(C3920o1 adManagerComponent, AbstractC4019s1 adUnitTimeout, Ac stateMachine, Hc publisherCallbacks) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        this.f37639h = adManagerComponent;
        this.f37640i = stateMachine;
        this.f37641j = adUnitTimeout;
        this.f37642k = publisherCallbacks;
        this.f37643l = P4.a(this.f38476b);
        TimeoutConfigurations.MediationConfig mediationConfigX = this.f38477c.getTimeouts().X();
        String str = this.f38478d.f37147g;
        this.f38475a.getClass();
        C3906nc c3906ncA = AbstractC3881mc.a(mediationConfigX, str, "native", Ki.f37226b);
        this.f37644m = c3906ncA;
        this.f37645n = new Z(adManagerComponent, c3906ncA);
    }

    public final void a(Y y10) {
        V v10 = y10.f38018b;
        InMobiAdRequestStatus inMobiAdRequestStatus = y10.f38017a;
        Objects.toString(v10);
        Objects.toString(inMobiAdRequestStatus);
        V v11 = y10.f38018b;
        if (v11 instanceof Pi) {
            C3869m0 c3869m0 = this.f38481g;
            eg.i.d(c3869m0.f38999a, null, null, new C3844l0(c3869m0, null), 3, null);
            a(y10.f38017a, ((Pi) y10.f38018b).f37548a);
            return;
        }
        if (v11 instanceof J6) {
            a(y10.f38017a, ((J6) v11).f37108a);
        } else if (v11 instanceof K6) {
            a(y10.f38017a, (short) ((K6) v11).f37210a);
        } else {
            if (!(v11 instanceof Ni)) {
                throw new lf.m();
            }
            a(((Ni) v11).f37457a, y10.f38017a);
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
        F3.a(this.f37643l);
    }

    @Override // com.inmobi.media.InterfaceC3678ea
    public final void e() {
        a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2138);
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        this.f37640i.a(new C3998r5(this.f37639h), this);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-FetchingState", "Initialize Called");
        }
        AbstractC4213zk.b();
        this.f37641j.b();
        eg.i.d(this.f37643l, null, null, new Q6(this, null), 3, null);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.b("AUM-FetchingState", "transitionToFetchFailedState " + map);
        }
        this.f37640i.a(new M6(map, inMobiAdRequestStatus, this.f37641j, this.f37639h, this.f37642k, this.f37640i), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf(s10))), inMobiAdRequestStatus);
    }
}
