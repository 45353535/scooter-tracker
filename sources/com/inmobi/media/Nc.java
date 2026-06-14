package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f37443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc f37444b;

    public Nc(C3840kl c3840kl, C3617c0 adLifecycleData, C4136wi responseBeaconData) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        ArrayList arrayList = null;
        this.f37443a = new Mc(adLifecycleData, c3840kl != null ? c3840kl.f38902a : null, c3840kl != null ? c3840kl.f38903b : null);
        if (c3840kl != null) {
            ArrayList arrayList2 = c3840kl.f38905d;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                String type = ((C4107ve) obj).f39775b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (Intrinsics.areEqual(type, com.taurusx.tax.f.y.f66057w)) {
                    arrayList.add(obj);
                }
            }
        }
        this.f37444b = new Lc(this.f37443a, new Pc(responseBeaconData, arrayList));
    }

    public final void a(short s10, List trackers) {
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f37444b.f37279c.a(new Fo(MapsKt.mapOf(TuplesKt.to("[EVENTTYPE]", String.valueOf((int) s10))), trackers));
    }
}
