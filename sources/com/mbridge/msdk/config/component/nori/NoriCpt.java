package com.mbridge.msdk.config.component.nori;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.nori.monitor.b;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class NoriCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f47165h;

    class a implements com.mbridge.msdk.config.component.common.network.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47166a;

        a(String str) {
            this.f47166a = str;
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            q0.a("NetworkRequestComponent", "Request started: " + this.f47166a);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.c(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.a(aVar);
        }

        @Override // com.mbridge.msdk.config.component.common.network.a
        public void d(com.mbridge.msdk.config.component.common.network.result.a aVar) {
            NoriCpt.this.b(aVar);
        }
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("<htm") || str.contains("<body") || str.contains("<div");
    }

    private void f(String str) {
        if (d(str)) {
            g(str);
        } else {
            c(str);
        }
    }

    private void g(String str) {
        HashMap map = new HashMap();
        map.put("result", "1");
        map.put("state_code", "200");
        map.put("response_data", str);
        map.put("is_html", e(str) ? "1" : "2");
        map.put(Reporting.Key.REQUEST_TYPE, this.f47165h.f());
        a(a("906002", map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.nori.model.a aVar = this.f47165h;
        if (aVar == null || aVar.l() == null || this.f47165h.l().isEmpty()) {
            HashMap map = new HashMap();
            map.put("code", "500001");
            map.put("reason", "Network request model or URLs is null/empty");
            a(a("906002", map));
            return;
        }
        for (String str : this.f47165h.l()) {
            if (!TextUtils.isEmpty(str)) {
                f(c.a(str, this.f47165h.d()));
            }
        }
    }

    private void c(String str) {
        com.mbridge.msdk.config.component.nori.monitor.a aVar = new com.mbridge.msdk.config.component.nori.monitor.a();
        com.mbridge.msdk.config.component.common.network.result.a aVar2 = new com.mbridge.msdk.config.component.common.network.result.a();
        aVar2.a(aVar);
        a aVar3 = new a(str);
        b bVar = new b(this.f47165h.k());
        aVar2.a(bVar);
        bVar.a(aVar2);
        bVar.a(aVar3);
        bVar.d();
        com.mbridge.msdk.config.component.common.network.c cVar = new com.mbridge.msdk.config.component.common.network.c(this.f47165h, aVar2);
        cVar.a(str, aVar3);
        cVar.b();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "906001";
        this.f47165h = new com.mbridge.msdk.config.component.nori.model.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put("result", aVar.e() + "");
            map.put("state_code", aVar.g() + "");
            map.put("response_data", aVar.f());
            map.put("is_html", e(aVar.f()) ? "1" : "2");
        }
        map.put(Reporting.Key.REQUEST_TYPE, this.f47165h.f());
        a(a("906002", map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        HashMap map = new HashMap();
        map.put("result", "2");
        if (aVar != null) {
            if (aVar.a() != null) {
                aVar.a().b();
            }
            if (aVar.h()) {
                return;
            }
            aVar.a(true);
            map.put("state_code", aVar.g() + "");
            map.put("reason", aVar.d());
            map.put("code", Integer.valueOf(aVar.c()));
        }
        map.put(Reporting.Key.REQUEST_TYPE, this.f47165h.f());
        a(a("906002", map));
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str) && this.f47165h.c() != null) {
            try {
                return this.f47165h.c().contains(Uri.parse(str).getHost());
            } catch (Exception e10) {
                q0.b("NetworkRequestComponent", "Error checking host: " + e10.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        String strF = aVar.f();
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        if (d(strF)) {
            g(strF);
        } else {
            c(strF);
        }
    }
}
