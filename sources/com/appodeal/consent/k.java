package com.appodeal.consent;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    public static ConsentStatus a(String str) {
        ConsentStatus consentStatus;
        ConsentStatus[] consentStatusArrValues = ConsentStatus.values();
        int length = consentStatusArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                consentStatus = null;
                break;
            }
            consentStatus = consentStatusArrValues[i10];
            if (Intrinsics.areEqual(consentStatus.getStatusName(), str)) {
                break;
            }
            i10++;
        }
        return consentStatus == null ? ConsentStatus.Unknown : consentStatus;
    }
}
