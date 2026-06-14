package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.my.tracker.obfuscated.o1;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w0 {
    public static void a(final y2 y2Var, final e0 e0Var, final w1 w1Var, final Context context) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.b7
            @Override // java.lang.Runnable
            public final void run() {
                w0.a(context, y2Var, e0Var, w1Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, y2 y2Var, e0 e0Var, w1 w1Var) {
        String str;
        String str2;
        y2 y2Var2;
        char c10;
        PackageInfo packageInfoA = t.a(context);
        if (packageInfoA != null) {
            String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfoA.getLongVersionCode()) : Integer.toString(packageInfoA.versionCode);
            str = packageInfoA.versionName;
            str2 = string;
        } else {
            str = "";
            str2 = str;
        }
        p1 p1VarA = p1.a(context);
        String strA = p1VarA.a();
        String strG = y2Var.g();
        if (strG.equals(p1VarA.c())) {
            y2Var2 = y2Var;
            if (str2.equals(strA)) {
                c10 = 0;
            } else {
                if (strA.isEmpty()) {
                    x2.a("InstallHandler: tracking update");
                } else {
                    x2.a("InstallHandler: tracking update from" + strA + " to " + str2);
                }
                e0Var.a(p1VarA.f(), strA, str, str2, t.b(context));
                c10 = 2;
            }
        } else {
            x2.a("InstallHandler: tracking install");
            long jB = packageInfoA != null ? v2.b(packageInfoA.firstInstallTime) : 0L;
            y2Var2 = y2Var;
            o1 o1VarA = o1.a(e0Var, y2Var2, context);
            o1.a aVarA = o1VarA.a();
            e0Var.a(jB, t.b(context), aVarA);
            if (aVarA == null) {
                o1VarA.c();
            }
            p1VarA.e(strG);
            c10 = 1;
        }
        long j10 = p1VarA.j();
        long jA = v2.a();
        String strB = y2Var2.b();
        if (!TextUtils.isEmpty(strB)) {
            if (jA - j10 < TelemetryConfig.DEFAULT_EVENT_TTL_SEC || j10 == 0) {
                x2.a("InstallHandler: tracking apkPreinstallParams");
                e0Var.d(strB);
            } else {
                x2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c10 == 0) {
            x2.a("InstallHandler: no install/update");
            w1Var.a(j10);
            return;
        }
        if (c10 == 1) {
            p1VarA.b(jA);
            w1Var.a(jA);
        } else if (c10 == 2) {
            w1Var.a(j10);
        }
        p1VarA.d(str2);
        p1VarA.g(str);
        p1VarA.c(jA);
    }
}
