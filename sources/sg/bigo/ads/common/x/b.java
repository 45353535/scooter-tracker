package sg.bigo.ads.common.x;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import sg.bigo.ads.common.x.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f103120a;

    public static SharedPreferences a(String str) {
        Context context = f103120a;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        sg.bigo.ads.common.t.a.a(0, "SharedPreferenceManager", "sContext is null");
        return null;
    }

    public static SharedPreferences.Editor b(String str) {
        try {
            return a(str).edit();
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "SharedPreferenceManager", Log.getStackTraceString(e10));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(SharedPreferences.Editor editor, String str, T t10, int i10) {
        if (editor != null) {
            if (i10 == 0) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putInt(str, ((Number) t10).intValue());
                return;
            }
            if (i10 == 1) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putLong(str, ((Number) t10).longValue());
                return;
            }
            if (i10 == 2) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                editor.putFloat(str, ((Number) t10).floatValue());
                return;
            }
            if (i10 == 3) {
                if (t10 != 0 && !(t10 instanceof String)) {
                    throw new ClassCastException();
                }
                editor.putString(str, (String) t10);
                return;
            }
            if (i10 == 4) {
                if (!(t10 instanceof Boolean)) {
                    throw new ClassCastException();
                }
                editor.putBoolean(str, ((Boolean) t10).booleanValue());
            } else {
                if (i10 != 5) {
                    return;
                }
                if (t10 != 0 && !(t10 instanceof Set)) {
                    throw new ClassCastException();
                }
                editor.putStringSet(str, (Set) t10);
            }
        }
    }

    public static <T> Object b(String str, T t10, int i10) {
        return b("sp_ads", str, t10, i10);
    }

    public static <T> void a(String str, T t10, int i10) {
        a("sp_ads", str, t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T> Object b(String str, String str2, T t10, int i10) {
        SharedPreferences sharedPreferencesA = a(str);
        if (sharedPreferencesA != null) {
            if (i10 == 0) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                int iIntValue = ((Number) t10).intValue();
                Object obj = sharedPreferencesA.getAll().get(str2);
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (Exception unused) {
                    }
                }
                return Integer.valueOf(iIntValue);
            }
            if (i10 == 1) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                long jLongValue = ((Number) t10).longValue();
                Object obj2 = sharedPreferencesA.getAll().get(str2);
                if (obj2 instanceof Long) {
                    jLongValue = ((Long) obj2).longValue();
                } else if (obj2 instanceof String) {
                    try {
                        jLongValue = Long.parseLong((String) obj2);
                    } catch (Exception unused2) {
                    }
                }
                return Long.valueOf(jLongValue);
            }
            if (i10 == 2) {
                if (!(t10 instanceof Number)) {
                    throw new NumberFormatException();
                }
                float fFloatValue = ((Number) t10).floatValue();
                Object obj3 = sharedPreferencesA.getAll().get(str2);
                if (obj3 instanceof Float) {
                    fFloatValue = ((Float) obj3).floatValue();
                } else if (obj3 instanceof String) {
                    try {
                        fFloatValue = Float.parseFloat((String) obj3);
                    } catch (Exception unused3) {
                    }
                }
                return Float.valueOf(fFloatValue);
            }
            if (i10 == 3) {
                if (t10 != 0 && !(t10 instanceof String)) {
                    throw new ClassCastException();
                }
                try {
                    return sharedPreferencesA.getString(str2, (String) t10);
                } catch (ClassCastException unused4) {
                    return null;
                }
            }
            if (i10 == 4) {
                if (!(t10 instanceof Boolean)) {
                    throw new ClassCastException();
                }
                boolean zBooleanValue = ((Boolean) t10).booleanValue();
                Object obj4 = sharedPreferencesA.getAll().get(str2);
                if (obj4 instanceof Boolean) {
                    zBooleanValue = ((Boolean) obj4).booleanValue();
                } else if (obj4 instanceof String) {
                    try {
                        zBooleanValue = Boolean.parseBoolean((String) obj4);
                    } catch (Exception unused5) {
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
            if (i10 == 5) {
                if (t10 == 0 || (t10 instanceof Set)) {
                    return sharedPreferencesA.getStringSet(str2, (Set) t10);
                }
                throw new ClassCastException();
            }
        }
        return null;
    }

    static <T> void a(String str, String str2, T t10, int i10) {
        try {
            SharedPreferences.Editor editorB = b(str);
            a(editorB, str2, t10, i10);
            c.a.a();
            c.a.C1278a.a(editorB);
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "SharedPreferenceManager", Log.getStackTraceString(e10));
        }
    }

    public static boolean a() {
        return f103120a != null;
    }
}
