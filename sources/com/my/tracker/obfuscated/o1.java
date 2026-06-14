package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e0 f61738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y2 f61739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f61740c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61743c;

        public a(int i10, String str, String str2) {
            this.f61741a = i10;
            this.f61742b = str;
            this.f61743c = str2;
        }
    }

    o1(e0 e0Var, y2 y2Var, Context context) {
        this.f61738a = e0Var;
        this.f61739b = y2Var;
        this.f61740c = context.getApplicationContext();
    }

    public static o1 a(e0 e0Var, y2 y2Var, Context context) {
        return new o1(e0Var, y2Var, context);
    }

    a b() {
        String str = "ro.mtpi." + this.f61739b.g();
        String strA = c2.a(str);
        if (TextUtils.isEmpty(strA)) {
            x2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        x2.a("PreInstallHandler: raw data in SystemProperties has been found: " + strA);
        return a(3, strA, str);
    }

    public void c() {
        String strR = this.f61739b.r();
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        p1 p1VarA = p1.a(this.f61740c);
        if (p1VarA.q()) {
            return;
        }
        x2.a("PreInstallHandler: checking preinstall");
        try {
            String strA = a(this.f61740c.getPackageManager().getResourcesForApplication(strR), this.f61740c.getPackageName(), strR);
            p1VarA.u();
            if (TextUtils.isEmpty(strA)) {
                x2.a("PreInstallHandler: referrer is empty");
                return;
            }
            x2.a("PreInstallHandler: referrer " + strA);
            this.f61738a.a(strA, t.b(this.f61740c), (Runnable) null);
            p1.a(this.f61740c).v();
        } catch (Throwable unused) {
            x2.a("PreInstallHandler: unable to locate vendor app " + strR);
        }
    }

    static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    static a a(int i10, String str, String str2) {
        try {
            x2.a("PreInstallHandler: converting raw data to json");
            return new a(i10, new JSONObject(str).toString(), str2);
        } catch (Throwable th2) {
            x2.a("PreInstallHandler error: exception when converting raw data to json", th2);
            try {
                x2.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i10, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th3) {
                x2.b("PreInstallHandler error: exception when converting raw data to json with pid", th3);
                x2.a("PreInstallHandler: nothing has been found for source: " + i10);
                return null;
            }
        }
    }

    public a a() {
        if (!this.f61739b.w()) {
            x2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.f61739b.x()) {
            return a(2);
        }
        return null;
    }

    a a(int i10) {
        String str;
        if (i10 == 1) {
            str = "ro.mytracker.preinstall.path";
        } else if (i10 == 2) {
            str = "ro.appsflyer.preinstall.path";
        } else {
            x2.a("PreInstallHandler: wrong property property key");
            return null;
        }
        String strA = c2.a(str);
        if (TextUtils.isEmpty(strA)) {
            x2.a("PreInstallHandler: empty path for source: " + i10);
            return null;
        }
        String strA2 = a(strA);
        if (TextUtils.isEmpty(strA2)) {
            x2.a("PreInstallHandler: empty data for source: " + i10);
            return null;
        }
        x2.a("PreInstallHandler: raw data for source has been found: " + strA2);
        return a(i10, strA2, strA);
    }

    String a(String str) {
        BufferedReader bufferedReader;
        try {
            try {
                x2.a("PreInstallHandler: searching string in file " + str);
                String str2 = this.f61740c.getPackageName() + C4240b4.j.f42668b;
                int length = str2.length();
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            break;
                        }
                        x2.a("PreInstallHandler: processing string " + line);
                        if (line.startsWith(str2) && line.length() > length) {
                            String strSubstring = line.substring(length);
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                                return strSubstring;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            x2.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
        }
    }
}
