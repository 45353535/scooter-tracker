package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.B1;
import com.taurusx.tax.y.z.w.s;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AppSetIdInfo f36600a;

    static {
        b();
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static void b() {
        Context context = Ji.f37157a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: w3.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B1.a((AppSetIdInfo) obj);
                }
            };
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: w3.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    B1.a(function1, obj);
                }
            });
        }
    }

    public static final Unit a(AppSetIdInfo appSetIdInfo) {
        f36600a = appSetIdInfo;
        return Unit.f93236a;
    }

    public static boolean a() {
        try {
            kotlin.jvm.internal.v0.b(AppSetIdInfo.class).getSimpleName();
            kotlin.jvm.internal.v0.b(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError e10) {
            Intrinsics.checkNotNullExpressionValue("B1", s.z.f67720z);
            e10.toString();
            return false;
        }
    }

    public static void a(LinkedHashMap mutableMap) {
        AppSetIdInfo appSetIdInfo;
        Intrinsics.checkNotNullParameter(mutableMap, "mutableMap");
        if (a() && (appSetIdInfo = f36600a) != null) {
            mutableMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(scope);
        }
    }
}
