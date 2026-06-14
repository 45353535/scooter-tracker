package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4180yc implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f39988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f39989b;

    public C4180yc(Mc nativeBeaconMacroData, Function0 getBeacons) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.f39988a = nativeBeaconMacroData;
        this.f39989b = getBeacons;
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        boolean z10 = beaconExtras instanceof Fo;
        List listPlus = CollectionsKt.plus((Collection) this.f39989b.invoke(), (Iterable) (z10 ? ((Fo) beaconExtras).f36897b : CollectionsKt.emptyList()));
        if (listPlus.isEmpty()) {
            return;
        }
        Map mapEmptyMap = z10 ? ((Fo) beaconExtras).f36896a : MapsKt.emptyMap();
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            String url = Oc.a((String) it.next(), this.f39988a, mapEmptyMap);
            C4121w3 c4121w3 = C4121w3.f39816a;
            Intrinsics.checkNotNullParameter(url, "url");
            C4121w3.a(url, false, null);
        }
    }
}
