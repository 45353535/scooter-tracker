package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3882md extends kotlin.jvm.internal.y implements Function1 {
    public C3882md(C3907nd c3907nd) {
        super(1, c3907nd, C3907nd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3907nd c3907nd = (C3907nd) this.receiver;
        c3907nd.getClass();
        c3907nd.a(MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf(sShortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return Unit.f93236a;
    }
}
