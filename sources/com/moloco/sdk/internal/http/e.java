package com.moloco.sdk.internal.http;

import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.publisher.Moloco;
import ie.i;
import ie.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.a1;
import oe.f;
import oe.h;
import oe.l1;
import oe.n1;
import oe.p0;
import ve.p;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {
    public static final ie.c a(final u appInfo, final h0 deviceInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return k.a(new Function1() { // from class: com.moloco.sdk.internal.http.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b(appInfo, deviceInfo, (i) obj);
            }
        });
    }

    public static final Unit b(final u uVar, final h0 h0Var, i HttpClient) {
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.m(n1.d(), new Function1() { // from class: com.moloco.sdk.internal.http.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.e((l1) obj);
            }
        });
        i.n(HttpClient, a1.m(), null, 2, null);
        i.n(HttpClient, p0.s(), null, 2, null);
        h.c(HttpClient, new Function1() { // from class: com.moloco.sdk.internal.http.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.c(uVar, h0Var, (f.a) obj);
            }
        });
        return Unit.f93236a;
    }

    public static final Unit c(final u uVar, final h0 h0Var, f.a defaultRequest) {
        Intrinsics.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
        re.f.b(defaultRequest, new Function1() { // from class: com.moloco.sdk.internal.http.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d(uVar, h0Var, (p) obj);
            }
        });
        return Unit.f93236a;
    }

    public static final Unit d(u uVar, h0 h0Var, p headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        headers.e("X-Moloco-App-Info", "AppBundle/" + uVar.a() + "; AppVersion/" + uVar.b() + "; AppKey/" + Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
        headers.e("X-Moloco-Device-Info", "make/" + h0Var.f() + "; model/" + h0Var.h() + "; hwv/" + h0Var.d() + "; osv/" + h0Var.j() + "; OS/Android;");
        headers.e("X-Moloco-SDK-Info", "SdkVersion/4.3.1");
        return Unit.f93236a;
    }

    public static final Unit e(l1 install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        install.b(com.moloco.sdk.xenoss.sdkdevkit.android.core.e.b().invoke());
        return Unit.f93236a;
    }
}
