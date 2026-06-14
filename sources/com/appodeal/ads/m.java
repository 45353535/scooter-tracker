package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends hd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc f13629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te f13630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f13631f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l0 l0Var, te teVar, uc ucVar, uc ucVar2, te teVar2) {
        super(teVar, ucVar);
        this.f13631f = l0Var;
        this.f13629d = ucVar2;
        this.f13630e = teVar2;
    }

    @Override // com.appodeal.ads.hd
    public final void b(LoadingError loadingError) {
        com.appodeal.ads.analytics.breadcrumbs.n nVar = com.appodeal.ads.analytics.breadcrumbs.n.f12678b;
        final uc ucVar = this.f13629d;
        nVar.b(new Function0() { // from class: com.appodeal.ads.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f13300b.f(ucVar);
            }
        });
        this.f13631f.f13567g.I(this.f13630e, this.f13629d, loadingError);
    }

    @Override // com.appodeal.ads.hd
    public final void d() {
        com.appodeal.ads.analytics.breadcrumbs.n nVar = com.appodeal.ads.analytics.breadcrumbs.n.f12678b;
        final uc ucVar = this.f13629d;
        nVar.b(new Function0() { // from class: com.appodeal.ads.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f13332b.g(ucVar);
            }
        });
        d9 d9Var = (d9) h2.f13370d.getValue();
        AdType adType = this.f13631f.f13566f;
        uc adObject = this.f13629d;
        d9Var.getClass();
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new l8(d9Var, adType, adObject, null), 3, null);
        i2 i2Var = this.f13631f.f13567g;
        te adRequest = this.f13630e;
        uc adObject2 = this.f13629d;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject2, "adObject");
        adRequest.q(adObject2);
        i2Var.c().l(LogConstants.EVENT_LOAD_START, adObject2, null);
    }

    public final com.appodeal.ads.analytics.breadcrumbs.e f(uc ucVar) {
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_REQUEST_FAILED, this.f13631f.f13566f, ucVar);
    }

    public final com.appodeal.ads.analytics.breadcrumbs.e g(uc ucVar) {
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_REQUEST_START, this.f13631f.f13566f, ucVar);
    }
}
