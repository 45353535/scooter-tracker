package com.taurusx.tax.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66086a = "key_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66087c = "appid";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static b f66090i = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f66091m = "key_df";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66092n = "pref_last_config_req_time";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66093o = "session_info";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f66094p = "pref_log_update_time";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66095s = "session";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66097w = "nath_ssp_config";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66098y = "appid_info";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f66099z = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66096t = c.w(new byte[]{Ascii.ESC, -11, -73, 94, 78, 103, -92, 79, -121, -98, -126, -114, 118, 69, -118, -104, -102, -79, -104, -100, 76, 91, -110, -76, -102, -121, -124, -116});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66089g = c.w(new byte[]{-94, -116, 97, -10, 72, 65, -35, -116, SignedBytes.MAX_POWER_OF_TWO, 75, -14, -13, 86, 120, 36, 52, 92, 87, -56, -25, 98, 110, Ascii.SO, 61, 71, 93, -29});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66088f = c.w(new byte[]{-7, -37, -25, -39, 7, -70, -1, 76, 75, 82, 85, 89, -30, -50, -48, -46, 76, 125, 82, 87, -50, -55});

    public static b z() {
        if (f66090i == null) {
            synchronized (b.class) {
                try {
                    if (f66090i == null) {
                        f66090i = new b();
                    }
                } finally {
                }
            }
        }
        return f66090i;
    }

    public String w(Context context, String str, String str2) {
        String string;
        try {
            synchronized (this.f66099z) {
                string = context.getApplicationContext().getSharedPreferences(str, 0).getString(str2, "");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public void y(Context context, String str, String str2) {
        try {
            synchronized (this.f66099z) {
                SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f66097w, 0).edit();
                editorEdit.putString(str, str2);
                editorEdit.commit();
            }
        } catch (Exception unused) {
        }
    }

    public long w(Context context, String str) {
        return z(context, f66097w, str);
    }

    public String y(Context context, String str) {
        String string;
        try {
            synchronized (this.f66099z) {
                string = context.getApplicationContext().getSharedPreferences(f66097w, 0).getString(str, "");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public void z(Context context, String str, int i10) {
        try {
            synchronized (this.f66099z) {
                SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(f66097w, 0).edit();
                editorEdit.putInt(str, i10);
                editorEdit.commit();
            }
        } catch (Exception unused) {
        }
    }

    public int z(Context context, String str) {
        int i10;
        try {
            synchronized (this.f66099z) {
                i10 = context.getApplicationContext().getSharedPreferences(f66097w, 0).getInt(str, 0);
            }
            return i10;
        } catch (Exception unused) {
            return 0;
        }
    }

    public void z(Context context, String str, String str2, String str3) {
        try {
            synchronized (this.f66099z) {
                SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
                editorEdit.putString(str2, str3);
                editorEdit.commit();
            }
        } catch (Exception unused) {
        }
    }

    public void z(Context context, String str, long j10) {
        z(context, f66097w, str, j10);
    }

    public void z(Context context, String str, String str2, long j10) {
        try {
            synchronized (this.f66099z) {
                SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
                editorEdit.putLong(str2, j10);
                editorEdit.commit();
            }
        } catch (Exception unused) {
        }
    }

    public long z(Context context, String str, String str2) {
        long j10;
        try {
            synchronized (this.f66099z) {
                j10 = context.getApplicationContext().getSharedPreferences(str, 0).getLong(str2, 0L);
            }
            return j10;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
