package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3907nd extends AbstractC3781ib {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3920o1 f39099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC4019s1 f39100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f39101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f39102r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3907nd(byte[] bArr, C3920o1 adManagerComponent, AbstractC4019s1 adUnitTimeout, Hc nativeCallback, Ac stateMachine) {
        super(bArr, adManagerComponent, adUnitTimeout, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f39099o = adManagerComponent;
        this.f39100p = adUnitTimeout;
        this.f39101q = nativeCallback;
        this.f39102r = stateMachine;
    }

    @Override // com.inmobi.media.AbstractC3781ib
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c3903n9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC3879ma.a(obj, AdResponse.class));
        }
        S0.a(this.f39099o, obj, new C3857ld(this), new C3882md(this));
    }
}
