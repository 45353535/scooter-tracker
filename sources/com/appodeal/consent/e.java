package com.appodeal.consent;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static CmpType a(String str) {
        CmpType cmpType;
        CmpType[] cmpTypeArrValues = CmpType.values();
        int length = cmpTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cmpType = null;
                break;
            }
            cmpType = cmpTypeArrValues[i10];
            if (Intrinsics.areEqual(cmpType.getTypeName(), str)) {
                break;
            }
            i10++;
        }
        return cmpType == null ? CmpType.None : cmpType;
    }
}
