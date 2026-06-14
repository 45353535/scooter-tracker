package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class N5 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f37397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nl f37398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3610bj f37399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f37400d;

    public N5(Mc nativeBeaconMacroData, Nl nativeBeaconTrackerData, C3610bj progressReceivedBeacons, C3610bj progressTriggeredBeacons) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(nativeBeaconTrackerData, "nativeBeaconTrackerData");
        Intrinsics.checkNotNullParameter(progressReceivedBeacons, "progressReceivedBeacons");
        Intrinsics.checkNotNullParameter(progressTriggeredBeacons, "progressTriggeredBeacons");
        this.f37397a = nativeBeaconMacroData;
        this.f37398b = nativeBeaconTrackerData;
        this.f37399c = progressTriggeredBeacons;
        this.f37400d = new AtomicInteger(-1);
        if (nativeBeaconTrackerData.f37463c.isEmpty()) {
            return;
        }
        progressReceivedBeacons.a(Te.f37766a);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c22) {
        Te beaconExtras = Te.f37766a;
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        int i10 = this.f37397a.f37365e;
        int i11 = this.f37400d.get();
        if (i10 <= this.f37400d.getAndSet(i10)) {
            return;
        }
        ArrayList arrayList = this.f37398b.f37463c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            int i13 = ((M5) obj).f37340a;
            if (i12 <= i13 && i13 <= i10) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f37399c.a(Te.f37766a);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String url = Oc.a(((M5) it.next()).f37341b, this.f37397a, MapsKt.emptyMap());
            C4121w3 c4121w3 = C4121w3.f39816a;
            Intrinsics.checkNotNullParameter(url, "url");
            C4121w3.a(url, false, null);
        }
    }
}
