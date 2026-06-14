package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f19740c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f19738a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19739b = t0.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f19741d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f19742e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap f19743f = new ConcurrentHashMap();

    private t0() {
    }

    public static final String b() {
        if (e3.a.d(t0.class)) {
            return null;
        }
        try {
            if (!f19741d.get()) {
                f19738a.d();
            }
            HashMap map = new HashMap();
            map.putAll(f19742e);
            map.putAll(f19738a.c());
            return com.facebook.internal.z.b0(map);
        } catch (Throwable th2) {
            e3.a.b(th2, t0.class);
            return null;
        }
    }

    private final Map c() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set setB = k2.d.f85957d.b();
            for (String str : f19743f.keySet()) {
                if (setB.contains(str)) {
                    map.put(str, f19743f.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final synchronized void d() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f19741d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.s.m());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            f19740c = defaultSharedPreferences;
            SharedPreferences sharedPreferences = null;
            if (defaultSharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = f19740c;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f19742e.putAll(com.facebook.internal.z.Y(string));
            f19743f.putAll(com.facebook.internal.z.Y(string2));
            atomicBoolean.set(true);
            return;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return;
        }
    }

    public static final void e() {
        if (e3.a.d(t0.class)) {
            return;
        }
        try {
            if (f19741d.get()) {
                return;
            }
            f19738a.d();
        } catch (Throwable th2) {
            e3.a.b(th2, t0.class);
        }
    }

    private final String f(String str, String str2) {
        String strSubstring;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String lowerCase = str2.subSequence(i10, length + 1).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(f19739b, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    if (lowerCase.length() > 0) {
                        strSubstring = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        strSubstring = "";
                    }
                    if (!Intrinsics.areEqual(InneractiveMediationDefs.GENDER_FEMALE, strSubstring) && !Intrinsics.areEqual("m", strSubstring)) {
                        Log.e(f19739b, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final void g(Map ud2) {
        String[] strArr;
        List listJ;
        if (e3.a.d(t0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            if (!f19741d.get()) {
                f19738a.d();
            }
            for (Map.Entry entry : ud2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                t0 t0Var = f19738a;
                int length = str2.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                String strP0 = com.facebook.internal.z.p0(t0Var.f(str, str2.subSequence(i10, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = f19743f;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listJ = new Regex(StringUtils.COMMA).j(str3, 0)) == null || (strArr = (String[]) listJ.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (setMutableSetOf.contains(strP0)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strP0);
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(StringUtils.COMMA);
                        sb2.append(strP0);
                    } else {
                        for (int i11 = 1; i11 < 5; i11++) {
                            sb2.append(strArr[i11]);
                            sb2.append(StringUtils.COMMA);
                        }
                        sb2.append(strP0);
                        setMutableSetOf.remove(strArr[0]);
                    }
                    f19743f.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, strP0);
                }
            }
            f19738a.h("com.facebook.appevents.UserDataStore.internalUserData", com.facebook.internal.z.b0(f19743f));
        } catch (Throwable th2) {
            e3.a.b(th2, t0.class);
        }
    }

    private final void h(final String str, final String str2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            com.facebook.s.t().execute(new Runnable() { // from class: com.facebook.appevents.s0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.i(str, str2);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String key, String value) {
        if (e3.a.d(t0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!f19741d.get()) {
                f19738a.d();
            }
            SharedPreferences sharedPreferences = f19740c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(key, value).apply();
        } catch (Throwable th2) {
            e3.a.b(th2, t0.class);
        }
    }
}
