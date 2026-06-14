package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MediationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {
    public static final void a(ve.p pVar, String str, String str2, MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb2.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb2.append("Android/" + str2 + ';');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        pVar.e("X-Moloco-User-Agent", string);
    }

    public static /* synthetic */ void b(ve.p pVar, String str, String str2, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            mediationInfo = null;
        }
        a(pVar, str, str2, mediationInfo);
    }
}
