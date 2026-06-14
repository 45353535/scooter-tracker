package com.my.target;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.N6;

/* JADX INFO: loaded from: classes11.dex */
public class v8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile v8 f60957b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f60958a;

    public v8(SharedPreferences sharedPreferences) {
        this.f60958a = sharedPreferences;
    }

    public static v8 a(Context context) {
        v8 v8Var;
        v8 v8Var2 = f60957b;
        if (v8Var2 != null) {
            return v8Var2;
        }
        synchronized (v8.class) {
            try {
                v8Var = f60957b;
                if (v8Var == null) {
                    f60957b = new v8(context.getSharedPreferences("mytarget_prefs", 0));
                    v8Var = f60957b;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v8Var;
    }

    public int b() {
        return a("asis");
    }

    public void c(String str) {
        a(N6.L0, str);
    }

    public void d(String str) {
        a("hoaid", str);
    }

    public String e() {
        return b("hoaid");
    }

    public String f() {
        return b("hosts");
    }

    public String g() {
        return b("instanceId");
    }

    public void b(int i10) {
        a("sdk_flags", i10);
    }

    public int c() {
        return a("sdk_flags");
    }

    public String d() {
        return b("hlimit");
    }

    public void e(String str) {
        a("hlimit", str);
    }

    public void f(String str) {
        a("hosts", str);
    }

    public void g(String str) {
        a("instanceId", str);
    }

    public final String b(String str) {
        try {
            String string = this.f60958a.getString(str, null);
            return string != null ? string : "";
        } catch (Throwable th2) {
            gb.c("PrefsCache exception - " + th2);
            return "";
        }
    }

    public String a() {
        return b(N6.L0);
    }

    public void a(int i10) {
        a("asis", i10);
    }

    public final int a(String str) {
        try {
            return this.f60958a.getInt(str, -1);
        } catch (Throwable th2) {
            gb.c("PrefsCache exception - " + th2);
            return 0;
        }
    }

    public final void a(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f60958a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Throwable th2) {
            gb.c("PrefsCache exception - " + th2);
        }
    }

    public final void a(String str, int i10) {
        try {
            SharedPreferences.Editor editorEdit = this.f60958a.edit();
            editorEdit.putInt(str, i10);
            editorEdit.commit();
        } catch (Throwable th2) {
            gb.c("PrefsCache exception - " + th2);
        }
    }
}
