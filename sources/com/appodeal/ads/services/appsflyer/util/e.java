package com.appodeal.ads.services.appsflyer.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import lf.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f14634c;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14632a = context;
        this.f14633b = i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.util.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.e(this.f14629b);
            }
        });
        this.f14634c = i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.util.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(this.f14630b);
            }
        });
    }

    public static final h a(e eVar) {
        Object value = eVar.f14633b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return new h((SharedPreferences) value);
    }

    public static final Unit b(e eVar, Ref$ObjectRef ref$ObjectRef, String it) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(it, "it");
        LogExtKt.logInternal$default("AppsflyerService", "conversionData received from callback: " + it, null, 4, null);
        eVar.getClass();
        if (StringsKt.y0(it)) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(it);
            } catch (Exception unused) {
                jSONObject = null;
            }
        }
        if (jSONObject != null) {
            Function1 function1 = (Function1) ref$ObjectRef.f93280b;
            if (function1 != null) {
                function1.invoke(JsonExtKt.toMap(jSONObject));
            }
            ref$ObjectRef.f93280b = null;
        }
        return Unit.f93236a;
    }

    public static final Unit c(Ref$ObjectRef ref$ObjectRef, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogExtKt.logInternal$default("AppsflyerService", "attributionId received from callback: " + it, null, 4, null);
        Function1 function1 = (Function1) ref$ObjectRef.f93280b;
        if (function1 != null) {
            function1.invoke(it);
        }
        ref$ObjectRef.f93280b = null;
        return Unit.f93236a;
    }

    public static final SharedPreferences e(e eVar) {
        return eVar.f14632a.getSharedPreferences("appsflyer-data", 0);
    }

    public final void d(Function1 callback) {
        Object objB;
        String appsFlyerUID;
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = callback;
        ((h) ((f) this.f14634c.getValue())).b("AF_INSTALLATION", new Function1() { // from class: com.appodeal.ads.services.appsflyer.util.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.c(ref$ObjectRef, (String) obj);
            }
        });
        try {
            Result.Companion companion = Result.f93230c;
            appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this.f14632a);
            if (appsFlyerUID == null) {
                Object value = this.f14633b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                appsFlyerUID = ((SharedPreferences) value).getString("AF_INSTALLATION", null);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (appsFlyerUID == null) {
            throw new IllegalArgumentException("No AttributionId found");
        }
        objB = Result.b(appsFlyerUID);
        if (Result.j(objB)) {
            String str = (String) objB;
            LogExtKt.logInternal$default("AppsflyerService", "attributionId was read: " + str, null, 4, null);
            Function1 function1 = (Function1) ref$ObjectRef.f93280b;
            if (function1 != null) {
                function1.invoke(str);
            }
            ref$ObjectRef.f93280b = null;
            ((h) ((f) this.f14634c.getValue())).a("AF_INSTALLATION");
        }
    }

    public final void f(Function1 callback) {
        Object objB;
        String string;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(callback, "callback");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = callback;
        ((h) ((f) this.f14634c.getValue())).b("attributionId", new Function1() { // from class: com.appodeal.ads.services.appsflyer.util.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b(this.f14627b, ref$ObjectRef, (String) obj);
            }
        });
        try {
            Result.Companion companion = Result.f93230c;
            Object value = this.f14633b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            string = ((SharedPreferences) value).getString("attributionId", null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (string == null) {
            throw new IllegalArgumentException("No ConversionData found");
        }
        if (StringsKt.y0(string)) {
            jSONObject = null;
            objB = Result.b(JsonExtKt.toMap(jSONObject));
        } else {
            try {
                jSONObject = new JSONObject(string);
            } catch (Exception unused) {
                jSONObject = null;
            }
            objB = Result.b(JsonExtKt.toMap(jSONObject));
        }
        if (Result.j(objB)) {
            Map map = (Map) objB;
            LogExtKt.logInternal$default("AppsflyerService", "conversionData was read: " + map, null, 4, null);
            Function1 function1 = (Function1) ref$ObjectRef.f93280b;
            if (function1 != null) {
                function1.invoke(map);
            }
            ref$ObjectRef.f93280b = null;
            ((h) ((f) this.f14634c.getValue())).a("attributionId");
        }
    }
}
