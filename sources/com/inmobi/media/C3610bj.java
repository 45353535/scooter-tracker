package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3610bj implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f38282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f38283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f38284c;

    public C3610bj(Mc vastBeaconDataModel, Function0 getBeacons) {
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.f38282a = vastBeaconDataModel;
        this.f38283b = getBeacons;
        this.f38284c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c22) {
        Te beaconExtras = Te.f37766a;
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (this.f38284c.getAndSet(true)) {
            return;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        List listPlus = CollectionsKt.plus((Collection) this.f38283b.invoke(), (Iterable) CollectionsKt.emptyList());
        if (listPlus.isEmpty()) {
            return;
        }
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            String url = Oc.a((String) it.next(), this.f38282a, mapEmptyMap);
            C4121w3 c4121w3 = C4121w3.f39816a;
            Intrinsics.checkNotNullParameter(url, "url");
            C4121w3.a(url, false, null);
        }
    }
}
