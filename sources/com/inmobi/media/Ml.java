package com.inmobi.media;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f37385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f37386b;

    public Ml(C3840kl vastBeaconData, C3617c0 adLifecycleData, C3743gn responseBeaconData) {
        int iA;
        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        this.f37385a = new Mc(adLifecycleData, vastBeaconData.f38902a, vastBeaconData.f38903b);
        ArrayList arrayList = vastBeaconData.f38905d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C4107ve c4107ve = (C4107ve) obj;
            if (!(c4107ve instanceof O5)) {
                String type = c4107ve.f39775b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (!Intrinsics.areEqual(type, com.taurusx.tax.f.y.f66057w) && !Intrinsics.areEqual(type, "click")) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = vastBeaconData.f38905d;
        ArrayList<O5> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof O5) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (O5 o52 : arrayList4) {
            int i10 = vastBeaconData.f38904c;
            Intrinsics.checkNotNullParameter(o52, "<this>");
            int i11 = 0;
            if (StringsKt.M(o52.f37476c, "%", false, 2, null)) {
                try {
                    i11 = Integer.parseInt(StringsKt.B1(o52.f37476c, 1));
                } catch (Exception unused) {
                }
                iA = (i10 * i11) / 100;
            } else {
                iA = Jl.a(o52.f37476c);
            }
            arrayList5.add(new M5(o52.f39774a, iA));
        }
        this.f37386b = new Ll(this.f37385a, new Nl(responseBeaconData, arrayList2, arrayList5));
    }
}
