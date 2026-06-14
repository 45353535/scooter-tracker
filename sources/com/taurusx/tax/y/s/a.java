package com.taurusx.tax.y.s;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static a f67647y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SharedPreferences f67648w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f67649z;

    public static a w() {
        if (f67647y == null) {
            synchronized (a.class) {
                try {
                    if (f67647y == null) {
                        f67647y = new a();
                    }
                } finally {
                }
            }
        }
        return f67647y;
    }

    private SharedPreferences y() {
        Context context;
        if (this.f67648w == null && (context = this.f67649z) != null) {
            this.f67648w = context.getApplicationContext().getSharedPreferences(com.taurusx.tax.y.w.z.f67706z, 0);
        }
        return this.f67648w;
    }

    public String c(String str) {
        return z(str, (String) null);
    }

    public void o(String str) {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.remove(str);
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(Context context) {
        this.f67649z = context.getApplicationContext();
        y();
    }

    public boolean z(String str) {
        return z(str, false);
    }

    public boolean z(String str, boolean z10) {
        try {
            return !y().contains(str) ? z10 : y().getBoolean(str, z10);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return z10;
        }
    }

    public long y(String str) {
        return z(str, 0L);
    }

    public void w(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public String z(String str, String str2) {
        try {
            return !y().contains(str) ? str2 : y().getString(str, str2);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return str2;
        }
    }

    public long z(String str, long j10) {
        try {
            return !y().contains(str) ? j10 : y().getLong(str, j10);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return j10;
        }
    }

    public void w(String str, long j10) {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.putLong(str, j10);
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public int z(String str, int i10) {
        try {
            return !y().contains(str) ? i10 : y().getInt(str, i10);
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public void w(String str, int i10) {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.putInt(str, i10);
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z() {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.clear();
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public void w(String str, boolean z10) {
        try {
            SharedPreferences.Editor editorEdit = y().edit();
            editorEdit.putBoolean(str, z10);
            editorEdit.commit();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
        }
    }

    public int w(String str) {
        return z(str, 0);
    }
}
