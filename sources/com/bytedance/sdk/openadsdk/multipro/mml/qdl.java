package com.bytedance.sdk.openadsdk.multipro.mml;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static HashSet<String> qdl = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.mml.qdl.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add(CommonUrlParts.UUID);
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static Context lnr() {
        return yt.qdl();
    }

    private static String mml() {
        return com.bytedance.sdk.openadsdk.multipro.mml.f17770ud + "/t_sp/";
    }

    public static boolean qdl() {
        return yt.qdl() != null;
    }

    private static mo ud() {
        try {
            if (qdl()) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void qdl(String str, String str2, Boolean bool) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, bool);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "boolean/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String ud(String str, String str2, String str3) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, str3);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "string/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals("null")) {
                        return strQdl;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void ud(String str, String str2) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.ud(lnr(), str, str2);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    moVarUd.qdl(Uri.parse(mml() + "long/" + str2 + ud(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, String str3) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, str3);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "string/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, Integer num) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, num);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "int/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void qdl(String str, String str2, Long l10) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.qdl(lnr(), str, str2, l10);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    Uri uri = Uri.parse(mml() + "long/" + str2 + ud(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l10);
                    moVarUd.qdl(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected static String qdl(Context context, String str, String str2, String str3) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, str3);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? str3 : sharedPreferencesQdl.getString(str2, str3);
    }

    public static String qdl(String str, String str2) {
        return qdl.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int qdl(String str, String str2, int i10) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, i10);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "int/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals("null")) {
                        return Integer.parseInt(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    protected static int qdl(Context context, String str, String str2, int i10) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, i10);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? i10 : sharedPreferencesQdl.getInt(str2, i10);
    }

    protected static float qdl(Context context, String str, String str2, float f10) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, f10);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? f10 : sharedPreferencesQdl.getFloat(str2, f10);
    }

    public static boolean qdl(String str, String str2, boolean z10) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, z10);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "boolean/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals("null")) {
                        return Boolean.parseBoolean(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    protected static boolean qdl(Context context, String str, String str2, boolean z10) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, z10);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? z10 : sharedPreferencesQdl.getBoolean(str2, z10);
    }

    public static long qdl(String str, String str2, long j10) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return qdl(lnr(), str, str2, j10);
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    String strQdl = moVarUd.qdl(Uri.parse(mml() + "long/" + str2 + ud(str)));
                    if (strQdl != null && !strQdl.equals("null")) {
                        return Long.parseLong(strQdl);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    protected static long qdl(Context context, String str, String str2, long j10) {
        String strQdl = qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2, j10);
        }
        SharedPreferences sharedPreferencesQdl = ud.qdl(context, strQdl);
        return sharedPreferencesQdl == null ? j10 : sharedPreferencesQdl.getLong(str2, j10);
    }

    public static void qdl(String str) {
        if (qdl()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    ud.ud(lnr(), str);
                    return;
                }
                mo moVarUd = ud();
                if (moVarUd != null) {
                    moVarUd.qdl(Uri.parse(mml() + "clean" + ud(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
