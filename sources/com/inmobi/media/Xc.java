package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xc implements InterfaceC3636cj, InterfaceC3693f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f37997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f37998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f37999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jc f38000d;

    public Xc(short s10, InMobiAdRequestStatus status, Ec nativeAdUnitComponent, Jc stateMachine) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f37997a = s10;
        this.f37998b = status;
        this.f37999c = nativeAdUnitComponent;
        this.f38000d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() {
        C3903n9 c3903n9 = this.f37999c.f36789a.f39882a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("NativeFailedState", "Initialize Called");
        }
        this.f37999c.f36791c.a(this.f37998b, this.f37997a);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3693f
    public final Object a(Continuation continuation) {
        C3903n9 c3903n9 = this.f37999c.f36789a.f39882a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("NativeFailedState", "onDestroy");
        }
        Object objA = this.f38000d.a(new Vc(), this, (kotlin.coroutines.jvm.internal.d) continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
