package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.tools.FastKV;

/* JADX INFO: loaded from: classes10.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static FastKV f49093a;

    public static Object a(Context context, String str, Object obj) {
        if (context != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
            if (com.mbridge.msdk.foundation.controller.d.a().e() && f49093a == null) {
                try {
                    f49093a = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "share_date").build();
                } catch (Exception unused) {
                    f49093a = null;
                }
            }
            if (f49093a != null) {
                try {
                    if ("String".equals(simpleName)) {
                        return f49093a.getString(str, (String) obj);
                    }
                    if ("Integer".equals(simpleName)) {
                        return Integer.valueOf(f49093a.getInt(str, ((Integer) obj).intValue()));
                    }
                    if ("Boolean".equals(simpleName)) {
                        return Boolean.valueOf(f49093a.getBoolean(str, ((Boolean) obj).booleanValue()));
                    }
                    if ("Float".equals(simpleName)) {
                        return Float.valueOf(f49093a.getFloat(str, ((Float) obj).floatValue()));
                    }
                    if ("Long".equals(simpleName)) {
                        return Long.valueOf(f49093a.getLong(str, ((Long) obj).longValue()));
                    }
                } catch (Exception unused2) {
                }
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
                if ("String".equals(simpleName)) {
                    return sharedPreferences.getString(str, (String) obj);
                }
                if ("Integer".equals(simpleName)) {
                    return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
                }
                if ("Boolean".equals(simpleName)) {
                    return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                }
                if ("Float".equals(simpleName)) {
                    return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                }
                if ("Long".equals(simpleName)) {
                    return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
                }
            }
        }
        return obj;
    }

    public static void b(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        if (com.mbridge.msdk.foundation.controller.d.a().e() && f49093a == null) {
            try {
                f49093a = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                f49093a = null;
            }
        }
        if (f49093a != null) {
            try {
                if ("String".equals(simpleName)) {
                    f49093a.putString(str, (String) obj);
                } else if ("Integer".equals(simpleName)) {
                    f49093a.putInt(str, ((Integer) obj).intValue());
                } else if ("Boolean".equals(simpleName)) {
                    f49093a.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if ("Float".equals(simpleName)) {
                    f49093a.putFloat(str, ((Float) obj).floatValue());
                } else if ("Long".equals(simpleName)) {
                    f49093a.putLong(str, ((Long) obj).longValue());
                }
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
        if ("String".equals(simpleName)) {
            editorEdit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            editorEdit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            editorEdit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            editorEdit.putLong(str, ((Long) obj).longValue());
        }
        editorEdit.apply();
    }
}
