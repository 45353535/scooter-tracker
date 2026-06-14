package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3705fb extends AbstractC3821k2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f38570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InMobiAdRequestStatus f38571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Hc f38572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705fb(Map telemetryPayload, InMobiAdRequestStatus status, AbstractC4019s1 abstractC4019s1, InterfaceC4126w8 adManagerComponent, Hc publisherCallbacks, Ac stateMachine) {
        super(abstractC4019s1, adManagerComponent, stateMachine);
        Intrinsics.checkNotNullParameter(telemetryPayload, "telemetryPayload");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38570d = telemetryPayload;
        this.f38571e = status;
        this.f38572f = publisherCallbacks;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        InterfaceC3878m9 interfaceC3878m9C = this.f38851b.c();
        if (interfaceC3878m9C != null) {
            ((C3903n9) interfaceC3878m9C).b("AUM-LoadFailedState", "Initialize Called " + this.f38570d + " " + this.f38571e.getStatusCode() + " " + this.f38571e.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        }
        P4.a(this.f38851b.a(), new C3679eb(this, null));
        C3869m0 c3869m0B = this.f38851b.b();
        Map payload = this.f38570d;
        c3869m0B.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        eg.i.d(c3869m0B.f38999a, null, null, new C3745h0(c3869m0B, payload, null), 3, null);
        AbstractC4019s1 abstractC4019s1 = this.f38850a;
        if (abstractC4019s1 != null) {
            abstractC4019s1.a();
        }
        j();
    }
}
