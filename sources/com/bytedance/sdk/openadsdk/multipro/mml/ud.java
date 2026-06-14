package com.bytedance.sdk.openadsdk.multipro.mml;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.qdl;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.tvp;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class ud {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> qdl;

    static Map<String, ?> lnr(Context context, String str) {
        SharedPreferences sharedPreferencesQdl = qdl(context, str);
        if (sharedPreferencesQdl == null) {
            return null;
        }
        return sharedPreferencesQdl.getAll();
    }

    @Nullable
    public static SharedPreferences qdl(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(qdl(str), 0);
        } catch (Throwable th2) {
            aaj.lnr("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    private static void ud(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || softReference.get() == null || (map = qdl.get().get(qdl(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String qdl(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object qdl(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(qdl(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object ud(Context context, String str, String str2, String str3) {
        String strQdl = qdl(str);
        if (!qdl(context, strQdl, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_STRING)) {
            return qdl.qdl(context, strQdl, str2, (String) null);
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.valueOf(qdl.qdl(context, strQdl, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(qdl.qdl(context, strQdl, str2, 0));
        }
        if (str3.equalsIgnoreCase(Constants.LONG)) {
            return Long.valueOf(qdl.qdl(context, strQdl, str2, 0L));
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(qdl.qdl(context, strQdl, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return qdl.qdl(context, strQdl, str2, (String) null);
        }
        return null;
    }

    private static void qdl(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || softReference.get() == null) {
            qdl = new SoftReference<>(new ConcurrentHashMap());
        }
        String strQdl = qdl(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = qdl.get();
        if (concurrentHashMap.get(strQdl) == null) {
            concurrentHashMap.put(strQdl, new HashMap());
        }
        concurrentHashMap.get(strQdl).put(str2, obj);
    }

    static synchronized <T> void qdl(Context context, String str, String str2, T t10) {
        String strQdl = qdl.qdl(str, str2);
        if (tvp.wd(strQdl)) {
            com.bytedance.sdk.component.qdl qdlVarQdl = com.bytedance.sdk.component.qdl.qdl(context, strQdl);
            if (t10.equals(qdl(strQdl, str2))) {
                return;
            }
            qdl.lnr lnrVarUd = qdlVarQdl.ud();
            qdl(lnrVarUd, str2, (Object) t10);
            lnrVarUd.apply();
            qdl(strQdl, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
        if (sharedPreferencesQdl == null) {
            return;
        }
        if (t10.equals(qdl(strQdl, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
        qdl(editorEdit, str2, t10);
        editorEdit.apply();
        qdl(strQdl, str2, t10);
    }

    public static void ud(Context context, String str, String str2) {
        try {
            String strQdl = qdl.qdl(str, str2);
            if (tvp.wd(strQdl)) {
                com.bytedance.sdk.component.qdl.qdl(context, strQdl).ud().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
            if (sharedPreferencesQdl == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = qdl.get().get(qdl(strQdl));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    static void ud(Context context, String str) {
        if (tvp.wd(str)) {
            com.bytedance.sdk.component.qdl.qdl(context, str).ud().clear().apply();
            ud(str);
            return;
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, str);
        if (sharedPreferencesQdl == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
        editorEdit.clear();
        editorEdit.apply();
        ud(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void qdl(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void qdl(qdl.lnr lnrVar, String str, T t10) {
        if (t10 instanceof Integer) {
            lnrVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            lnrVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            lnrVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            lnrVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            lnrVar.putString(str, (String) t10);
        }
    }

    static String qdl(Context context, String str, String str2, String str3) {
        Object objQdl = qdl(str, str2);
        if (objQdl != null) {
            return String.valueOf(objQdl);
        }
        Object objUd = ud(context, str, str2, str3);
        qdl(str, str2, objUd);
        return String.valueOf(objUd);
    }

    static boolean qdl(Context context, String str, String str2) {
        String strQdl = qdl.qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2);
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
        return sharedPreferencesQdl != null && sharedPreferencesQdl.contains(str2);
    }
}
