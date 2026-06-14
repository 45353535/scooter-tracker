package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.impl.H2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f47157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f47158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f47159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f47160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47161l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f47162m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf = String.valueOf(ModelCpt.this.f47162m);
            Map<String, Object> mapD = (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) ? com.mbridge.msdk.config.component.database.a.a().d(strValueOf) : (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            Object obj = mapD.get("code");
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get("data"));
            } else {
                ModelCpt.this.a(false, String.valueOf(mapD.get("reason")), (Object) null);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f47159j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.f47162m)) {
            return;
        }
        a aVar = new a();
        if (this.f47161l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f47158i;
        if (map == null || this.f46642d == null || this.f47159j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(C4240b4.j.D);
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        String str2 = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : this.f47159j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !C4240b4.j.D.equals(entry.getKey())) {
                    try {
                        String key = entry.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = com.mbridge.msdk.config.global.a.a(this.f46642d, str3);
                        if (aVarA == null) {
                            continue;
                        } else if (aVarA.a(str3, key, entry.getValue()).intValue() == 1) {
                            z10 = true;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str2);
                    }
                }
            }
            a(z10, str2, (Object) null);
            return;
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f47158i == null || this.f46642d == null || (map = this.f47159j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f46642d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    private void j() {
        b bVar = new b();
        if (this.f47161l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if ("db".equals(this.f47160k)) {
                g();
                return;
            }
            if ("user_default".equals(this.f47160k)) {
                j();
            } else if (this.f47157h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelModifierComponent", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "914001";
        this.f47158i = map;
        if (map.isEmpty()) {
            q0.b("ModelModifierComponent", "Config parameters is null");
            return;
        }
        this.f47157h = map.containsKey(C4240b4.j.D) ? "withScope" : "withoutScope";
        Object obj = map.get("modifier_config");
        if (obj instanceof Map) {
            this.f47159j = (Map) obj;
        }
        Object obj2 = map.get("type");
        if (obj2 != null) {
            this.f47160k = String.valueOf(obj2);
        }
        Object obj3 = map.get(H2.f75840g);
        if (obj3 != null) {
            this.f47161l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get("expression");
        if (obj4 != null) {
            this.f47162m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put("result", Integer.valueOf(z10 ? 1 : 2));
        map.put("code", "");
        map.put("reason", str);
        if (obj != null) {
            map.put("data", obj);
        }
        a(a("914002", map));
    }
}
