package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3654db extends AbstractC3821k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f38437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f38438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f38439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3654db(short s10, InMobiAdRequestStatus status, C3920o1 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(null, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38437d = s10;
        this.f38438e = status;
        this.f38439f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9C = this.f38851b.c();
        if (interfaceC3878m9C != null) {
            short s10 = this.f38437d;
            ((C3903n9) interfaceC3878m9C).b("AUM-LoadDroppedState", "Initialize Called " + ((int) s10) + " " + this.f38438e.getStatusCode() + " " + this.f38438e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        P4.a(this.f38851b.a(), new C3628cb(this, null));
        C3869m0 c3869m0B = this.f38851b.b();
        eg.i.d(c3869m0B.f38999a, null, null, new C3720g0(c3869m0B, this.f38437d, null), 3, null);
        AbstractC4019s1 abstractC4019s1 = this.f38850a;
        if (abstractC4019s1 != null) {
            abstractC4019s1.a();
        }
        j();
    }
}
