package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3781ib extends AbstractC3668e0 implements InterfaceC3636cj, InterfaceC3678ea, InterfaceC3719g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f38754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3920o1 f38755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC4019s1 f38756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hc f38757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ac f38758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X f38759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineScope f38760n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3781ib(byte[] bArr, C3920o1 adManagerComponent, AbstractC4019s1 adUnitTimeout, Hc publisherCallbacks, Ac stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38754h = bArr;
        this.f38755i = adManagerComponent;
        this.f38756j = adUnitTimeout;
        this.f38757k = publisherCallbacks;
        this.f38758l = stateMachine;
        this.f38759m = new X(this.f38480f, this.f38481g);
        this.f38760n = P4.a(this.f38476b);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-LoadResponseState", "Initialize Called");
        }
        byte[] bArr = this.f38754h;
        if (bArr != null && bArr.length != 0) {
            C3564a c3564a = new C3564a(bArr, this.f38478d.f37141a, this.f38479e);
            this.f38756j.d();
            eg.i.d(this.f38760n, null, null, new C3756hb(c3564a, this, null), 3, null);
        } else {
            C3903n9 c3903n92 = this.f38479e;
            if (c3903n92 != null) {
                c3903n92.b("AUM-LoadResponseState", "Empty response on Load");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public abstract void a(AdResponse adResponse);

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
        F3.a(this.f38760n);
    }

    @Override // com.inmobi.media.InterfaceC3678ea
    public final void e() {
        a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 2138)), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
    }

    @Override // com.inmobi.media.InterfaceC3719g
    public final void j() {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.b("AUM-LoadResponseState", "onDestroy");
        }
        this.f38758l.a(new C3998r5(null, this.f38756j, this.f38755i), this);
    }

    public final void a(Map map, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState " + map);
        }
        this.f38758l.a(new M6(map, inMobiAdRequestStatus, this.f38756j, this.f38755i, this.f38757k, this.f38758l), this);
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            c3903n9.b("AUM-LoadResponseState", "transitionToLoadDroppedState 2143");
        }
        this.f38758l.a(new C3654db((short) 2143, inMobiAdRequestStatus, this.f38755i, this.f38757k, this.f38758l), this);
    }
}
