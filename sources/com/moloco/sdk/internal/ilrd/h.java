package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.ilrd.a;
import com.moloco.sdk.internal.services.bidtoken.providers.q;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {
    public static final q b(a aVar) {
        a.ImpressionCounts impressionCountsE = aVar.e();
        return new q(aVar.f(), aVar.g(), impressionCountsE.getLastEventReceivedTs(), impressionCountsE.getBanner(), impressionCountsE.getMrec(), impressionCountsE.getNative(), impressionCountsE.getInterstitial(), impressionCountsE.getRewarded());
    }
}
