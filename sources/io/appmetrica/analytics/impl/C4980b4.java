package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4980b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Em f76879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f76880b;

    public C4980b4(Em em, U u10) {
        this.f76879a = em;
        this.f76880b = u10;
    }

    public final C4954a4 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C5204jm c5204jmE = this.f76879a.e();
        U u10 = this.f76880b;
        synchronized (u10) {
            advertisingIdsHolderA = u10.a(new C5067ee());
        }
        return new C4954a4(C4954a4.a(c5204jmE.f77543d), C4954a4.a(c5204jmE.f77540a), C4954a4.a(c5204jmE.f77541b), C4954a4.a(c5204jmE.f77549j), C4954a4.a(c5204jmE.f77548i), C4954a4.a(AbstractC5295nb.a(Jm.a(c5204jmE.f77550k))), C4954a4.a(AbstractC5295nb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), C4954a4.a(AbstractC5295nb.a(c5204jmE.f77547h)), Kn.a(), c5204jmE.f77554o + ((long) c5204jmE.f77565z.f75834a), C4954a4.a(c5204jmE.f77553n.f78213f), new Bundle());
    }
}
