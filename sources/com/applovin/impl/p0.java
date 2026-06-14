package com.applovin.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f10068a = new a("Age Restricted User", z4.f11633r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f10069b = new a("Has User Consent", z4.f11632q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f10070c = new a("\"Do Not Sell\"", z4.f11634s);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z4 f10072b;

        a(String str, z4 z4Var) {
            this.f10071a = str;
            this.f10072b = z4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f10072b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f10072b);
            return null;
        }

        public String a() {
            return this.f10071a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f10070c;
    }

    public static a b() {
        return f10069b;
    }

    public static a c() {
        return f10068a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(z4.f11634s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(z4.f11632q, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f10069b, context) + a(f10070c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return IOUtils.LINE_SEPARATOR_UNIX + aVar.f10071a + " - " + aVar.a(context);
    }
}
