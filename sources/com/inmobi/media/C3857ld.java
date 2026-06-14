package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3857ld extends kotlin.jvm.internal.y implements Function2 {
    public C3857ld(C3907nd c3907nd) {
        super(2, c3907nd, C3907nd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4142x p02 = (C4142x) obj;
        InMobiJsonResponse p12 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        C3907nd c3907nd = (C3907nd) this.receiver;
        C3903n9 c3903n9 = c3907nd.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3907nd.f39102r.a(new Yc(p02, p12, c3907nd.f39100p, c3907nd.f39101q, c3907nd.f39102r), c3907nd);
        return Unit.f93236a;
    }
}
