package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.d6;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.applovin.impl.sdk.k f8222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f8223c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f8224a;

    public a5(com.applovin.impl.sdk.k kVar) {
        this.f8224a = com.applovin.impl.sdk.k.o().getSharedPreferences("com.applovin.sdk.preferences." + kVar.i0(), 0);
        f8222b = kVar;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void b(z4 z4Var, Object obj) {
        b(z4Var, obj, this.f8224a);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        a(z4Var.a(), obj, sharedPreferences);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = editor != null;
        if (!z10) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                com.applovin.impl.sdk.o.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z10) {
            return;
        }
        a(editor);
    }

    public static void b(z4 z4Var, Object obj, Context context) {
        a(z4Var.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public void b(z4 z4Var) {
        a(this.f8224a.edit().remove(z4Var.a()));
    }

    public Object a(z4 z4Var, Object obj) {
        return a(z4Var, obj, this.f8224a);
    }

    public Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences);
    }

    public static Object a(z4 z4Var, Object obj, Context context) {
        return a(z4Var.a(), obj, z4Var.b(), a(context));
    }

    public static Object a(z4 z4Var, Object obj, SharedPreferences sharedPreferences, boolean z10) {
        return a(z4Var.a(), obj, z4Var.b(), sharedPreferences, z10);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th2) {
            if (z10) {
                try {
                    com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Error getting value for key: " + str, th2);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(z4 z4Var) {
        Object objA = a(z4Var, null);
        b(z4Var);
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public static void a(final SharedPreferences.Editor editor) {
        try {
            if (n7.i()) {
                com.applovin.impl.sdk.k kVar = f8222b;
                if (kVar != null && kVar.q0() != null) {
                    d6 d6VarQ0 = f8222b.q0();
                    com.applovin.impl.sdk.k kVar2 = f8222b;
                    Objects.requireNonNull(editor);
                    d6VarQ0.a((i5) new r6(kVar2, true, "commitSharedPreferencesChanges", new Runnable() { // from class: com.applovin.impl.d9
                        @Override // java.lang.Runnable
                        public final void run() {
                            editor.commit();
                        }
                    }), d6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Unable to apply changes", th2);
            try {
                f8222b.D().a("SharedPreferencesManager", "persistChanges", th2);
            } catch (Throwable unused) {
            }
        }
    }

    private static SharedPreferences a(Context context) {
        if (f8223c == null) {
            f8223c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f8223c;
    }
}
