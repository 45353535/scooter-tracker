package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Jc extends AbstractC3713fj implements InterfaceC4010rh, Ck, InterfaceC3693f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC3636cj f37130c;

    /* JADX WARN: Illegal instructions before constructor call */
    public Jc(Ec nativeAdUnitComponent) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        C4142x adComponent = nativeAdUnitComponent.f36789a;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        super(adComponent.f39882a.f39147e);
        this.f37130c = new Uc(nativeAdUnitComponent, this);
    }

    @Override // com.inmobi.media.AbstractC3713fj
    public final InterfaceC3636cj a() {
        return this.f37130c;
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        InterfaceC3636cj interfaceC3636cj = this.f37130c;
        Ck ck = interfaceC3636cj instanceof Ck ? (Ck) interfaceC3636cj : null;
        if (ck != null) {
            ck.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC3693f
    public final Object a(Continuation continuation) {
        InterfaceC3636cj interfaceC3636cj = this.f37130c;
        InterfaceC3693f interfaceC3693f = interfaceC3636cj instanceof InterfaceC3693f ? (InterfaceC3693f) interfaceC3636cj : null;
        if (interfaceC3693f == null) {
            return Unit.f93236a;
        }
        Object objA = interfaceC3693f.a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3636cj interfaceC3636cj = this.f37130c;
        InterfaceC4010rh interfaceC4010rh = interfaceC3636cj instanceof InterfaceC4010rh ? (InterfaceC4010rh) interfaceC3636cj : null;
        if (interfaceC4010rh != null) {
            interfaceC4010rh.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC3713fj
    public final void a(InterfaceC3636cj interfaceC3636cj) {
        Intrinsics.checkNotNullParameter(interfaceC3636cj, "<set-?>");
        this.f37130c = interfaceC3636cj;
    }
}
