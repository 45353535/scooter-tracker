package com.my.target;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.my.target.common.MyTargetVersion;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class q5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f60578h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f60579i = "https://ad.mail.ru/sdk/log/";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f60580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f60581k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f60584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f60586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f60587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f60588g;

    public q5(String str, String str2) {
        this.f60582a = str;
        this.f60583b = str2;
    }

    public static q5 a(String str) {
        return new q5(str, "error");
    }

    public static q5 b(String str) {
        return new q5(str, "info");
    }

    public q5 c(String str) {
        this.f60586e = str;
        return this;
    }

    public q5 d(String str) {
        this.f60587f = str;
        return this;
    }

    public q5 e(String str) {
        this.f60588g = str;
        return this;
    }

    public q5 f(String str) {
        this.f60584c = str;
        return this;
    }

    public q5 a(int i10) {
        this.f60585d = i10;
        return this;
    }

    public void b(final Context context) {
        c(context);
        f0.e(new Runnable() { // from class: k5.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f86139b.a(context);
            }
        });
    }

    public final void c(Context context) {
        if (f60580j == null) {
            f60580j = context.getPackageName();
        }
        if (f60581k != null || f60580j == null) {
            return;
        }
        try {
            f60581k = context.getPackageManager().getPackageInfo(f60580j, 0).versionName;
        } catch (Exception unused) {
            f60581k = null;
        }
    }

    public q5 a(Map map) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(C4240b4.j.f42670c);
            }
            sb2.append((String) entry.getKey());
            sb2.append(C4240b4.j.f42668b);
            sb2.append((String) entry.getValue());
        }
        return e(sb2.toString());
    }

    public final /* synthetic */ void a(Context context) {
        String strA = a();
        gb.a("send message to log:\n " + strA);
        if (f60578h) {
            m2.a().a(f60579i, Base64.encodeToString(strA.getBytes(StandardCharsets.UTF_8), 0), context);
        }
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk", "myTarget");
            jSONObject.put("sdkver", MyTargetVersion.VERSION);
            jSONObject.put("os", "Android");
            jSONObject.put("osver", Build.VERSION.RELEASE);
            jSONObject.put("type", this.f60583b);
            jSONObject.put("name", this.f60582a);
            String str = f60580j;
            if (str != null) {
                jSONObject.put("app", str);
            }
            String str2 = f60581k;
            if (str2 != null) {
                jSONObject.put("appver", str2);
            }
            String str3 = this.f60584c;
            if (str3 != null) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str3);
            }
            int i10 = this.f60585d;
            if (i10 > 0) {
                jSONObject.put("slot", i10);
            }
            String str4 = this.f60586e;
            if (str4 != null) {
                jSONObject.put("url", str4);
            }
            String str5 = this.f60587f;
            if (str5 != null) {
                jSONObject.put("bannerId", str5);
            }
            String str6 = this.f60588g;
            if (str6 != null) {
                jSONObject.put("data", str6);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
