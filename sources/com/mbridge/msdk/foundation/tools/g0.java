package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f49001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f49002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f49003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f49004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IntentFilter f49005e;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g0 f49006a = new g0();
    }

    public static g0 a() {
        return b.f49006a;
    }

    public String b() {
        try {
            if (this.f49001a == null) {
                this.f49001a = new JSONObject();
            }
            if (this.f49001a.length() < 2) {
                try {
                    this.f49001a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f49001a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f49001a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f49001a.optLong("KEY_TIME") > (gVarB != null ? gVarB.R() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b()).S() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f49005e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.f49004d, this.f49005e);
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f49003c > 3000) {
            if (this.f49002b == null) {
                this.f49002b = new com.mbridge.msdk.setting.j();
            }
            this.f49002b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f49003c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f49004d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private g0() {
        this.f49001a = new JSONObject();
        this.f49004d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f49005e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f49001a == null) {
            this.f49001a = new JSONObject();
        }
        try {
            if (!this.f49001a.optString("KEY_INFO", "").equals(str)) {
                this.f49001a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f49001a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }
}
