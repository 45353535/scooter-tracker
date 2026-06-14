package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class M6 extends AbstractC3821k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f37342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f37343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f37344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6(Map payload, InMobiAdRequestStatus inMobiAdRequestStatus, AbstractC4019s1 adUnitTimeout, C3920o1 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(adUnitTimeout, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(inMobiAdRequestStatus, "inMobiAdRequestStatus");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f37342d = payload;
        this.f37343e = inMobiAdRequestStatus;
        this.f37344f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9C = this.f38851b.c();
        if (interfaceC3878m9C != null) {
            ((C3903n9) interfaceC3878m9C).b("AUM-FetchFailedState", "Initialized Called : " + this.f37342d + " " + this.f37343e.getStatusCode() + " " + this.f37343e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        P4.a(this.f38851b.a(), new L6(this, null));
        C3869m0 c3869m0B = this.f38851b.b();
        Map payload = this.f37342d;
        c3869m0B.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        eg.i.d(c3869m0B.f38999a, null, null, new C3794j0(c3869m0B, payload, null), 3, null);
        AbstractC4019s1 abstractC4019s1 = this.f38850a;
        if (abstractC4019s1 != null) {
            abstractC4019s1.a();
        }
        j();
    }
}
