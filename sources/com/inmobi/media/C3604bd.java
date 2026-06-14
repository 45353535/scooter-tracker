package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3604bd extends R6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3920o1 f38263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC4019s1 f38264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f38265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f38266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3604bd(C3920o1 adManagerComponent, AbstractC4019s1 adUnitTimeout, Ac stateMachine, Hc nativeCallback) {
        super(adManagerComponent, adUnitTimeout, stateMachine, nativeCallback);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f38263o = adManagerComponent;
        this.f38264p = adUnitTimeout;
        this.f38265q = nativeCallback;
        this.f38266r = stateMachine;
    }

    @Override // com.inmobi.media.R6
    public final void a(AdResponse obj) {
        Intrinsics.checkNotNullParameter(obj, "adResponse");
        C3903n9 c3903n9 = this.f38479e;
        if (c3903n9 != null) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            c3903n9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3879ma.a(obj, AdResponse.class));
        }
        S0.a(this.f38263o, obj, new Zc(this), new C3578ad(this));
    }
}
