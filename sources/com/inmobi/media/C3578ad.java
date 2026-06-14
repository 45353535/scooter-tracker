package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3578ad extends kotlin.jvm.internal.y implements Function1 {
    public C3578ad(C3604bd c3604bd) {
        super(1, c3604bd, C3604bd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3604bd c3604bd = (C3604bd) this.receiver;
        c3604bd.getClass();
        c3604bd.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), sShortValue);
        return Unit.f93236a;
    }
}
