package com.moloco.sdk.acm.http;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ve.p;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final Unit a(String str, String str2, String str3, String str4, String str5, String str6, p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("AppBundle/" + str + ';');
        }
        if (str2 != null) {
            sb2.append("AppVersion/" + str2 + ';');
        }
        if (str3 != null) {
            sb2.append("AppKey/" + str3 + ';');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        if (str4 != null) {
            sb3.append("SdkVersion/" + str4 + ';');
        }
        if (str5 != null) {
            sb3.append("Mediator/" + str5 + ';');
        }
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("OS/Android;");
        if (str6 != null) {
            sb4.append("osv/" + str6 + ';');
        }
        String string3 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        pVar.e("X-Moloco-App-Info", string);
        pVar.e("X-Moloco-Device-Info", string3);
        pVar.e("X-Moloco-SDK-Info", string2);
        return Unit.f93236a;
    }

    public final Function1 b(final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        return new Function1() { // from class: com.moloco.sdk.acm.http.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(str4, str5, str3, str, str6, str2, (p) obj);
            }
        };
    }
}
