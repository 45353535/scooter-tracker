package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Zc extends kotlin.jvm.internal.y implements Function2 {
    public Zc(C3604bd c3604bd) {
        super(2, c3604bd, C3604bd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4142x p02 = (C4142x) obj;
        InMobiJsonResponse p12 = (InMobiJsonResponse) obj2;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        C3604bd c3604bd = (C3604bd) this.receiver;
        C3903n9 c3903n9 = c3604bd.f38479e;
        if (c3903n9 != null) {
            c3903n9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c3604bd.f38266r.a(new Yc(p02, p12, c3604bd.f38264p, c3604bd.f38265q, c3604bd.f38266r), c3604bd);
        return Unit.f93236a;
    }
}
