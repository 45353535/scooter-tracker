package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class V5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC5442t9 enumC5442t9;
        Bundle bundle = parcel.readBundle(I6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i10 = bundle.getInt("CounterReport.Source");
            EnumC5442t9[] enumC5442t9ArrValues = EnumC5442t9.values();
            int length = enumC5442t9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC5442t9 = EnumC5442t9.NATIVE;
                    break;
                }
                enumC5442t9 = enumC5442t9ArrValues[i11];
                if (enumC5442t9.f78288a == i10) {
                    break;
                }
                i11++;
            }
        } else {
            enumC5442t9 = null;
        }
        W5 w52 = new W5("", "", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = bundle.getInt("CounterReport.Type", -1);
        w52.f76618e = bundle.getInt("CounterReport.CustomType");
        w52.f76615b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        w52.f76616c = bundle.getString("CounterReport.Environment");
        w52.f76614a = bundle.getString("CounterReport.Event");
        w52.f76619f = W5.a(bundle);
        w52.f76620g = bundle.getInt("CounterReport.TRUNCATED");
        w52.f76621h = bundle.getString("CounterReport.ProfileID");
        w52.f76622i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        w52.f76623j = bundle.getLong("CounterReport.CreationTimestamp");
        w52.f76624k = EnumC5218ka.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        w52.f76625l = enumC5442t9;
        w52.f76626m = bundle.getBundle("CounterReport.Payload");
        w52.f76627n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        w52.f76628o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        w52.f76629p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return w52;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new W5[i10];
    }
}
