package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mobilefuse.sdk.device.UserAgentInfo;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static String f46895c = "UserAgentProvider";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f46896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f46897b = "";

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(String str);
    }

    public e(final Context context) {
        this.f46896a = "";
        try {
            a(context, new a() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.l
                @Override // com.mbridge.msdk.config.component.info.provider.subprovider.e.a
                public final void a(String str) {
                    this.f46908a.a(context, str);
                }
            });
        } catch (Throwable th2) {
            q0.b(f46895c, th2.getMessage(), th2);
            if (TextUtils.isEmpty(this.f46896a)) {
                this.f46896a = b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) || MBridgeConstans.DNT_GUA_ON_UI) {
            this.f46896a = str;
        } else {
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, a aVar) {
        String defaultUserAgent;
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th2) {
            q0.b(f46895c, th2.getMessage(), th2);
            defaultUserAgent = "";
        }
        if (!TextUtils.isEmpty(defaultUserAgent)) {
            a(defaultUserAgent);
        }
        if (aVar != null) {
            aVar.a(defaultUserAgent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        a(this.f46896a);
    }

    public String c() {
        return (TextUtils.isEmpty(this.f46896a) && TextUtils.isEmpty(this.f46897b)) ? b() : TextUtils.isEmpty(this.f46896a) ? TextUtils.isEmpty(this.f46897b) ? "" : this.f46897b : this.f46896a;
    }

    private void a(final Context context, final a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f46904b.a();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f46905b.b(context, aVar);
            }
        });
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f46896a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46902b.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f46896a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th2) {
            q0.b(f46895c, th2.getMessage(), th2);
        }
        if (TextUtils.isEmpty(this.f46896a)) {
            this.f46896a = b();
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46901b.d();
                }
            });
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b(UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f46897b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a(UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, b());
    }

    private String b() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Mozilla/5.0 (Linux; Android ");
            sb2.append(str);
            sb2.append("; ");
            sb2.append(str2);
            sb2.append(" Build/");
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            return sb2.toString();
        }
        return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }
}
