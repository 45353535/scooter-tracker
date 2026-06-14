package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.ironsource.C4240b4;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, VCCpt> f47301l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f47302h = "1200001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f47303i = "1200002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f47304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f47305k;

    private static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47306a;

        private b() {
        }

        public void a(String str) {
            this.f47306a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.f47301l == null || VCCpt.f47301l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f47301l.get(this.f47306a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", new HashMap()));
            vCCpt.c(C4240b4.i.f42655u0);
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            if (VCCpt.f47301l == null || VCCpt.f47301l.isEmpty() || ((VCCpt) VCCpt.f47301l.get(this.f47306a)) == null) {
                return;
            }
            q0.b("RenderViewComponent", "onBackPressed clicked");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f47301l == null || VCCpt.f47301l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f47301l.get(this.f47306a)) == null) {
                return;
            }
            Object objB = vCCpt.f46642d.b("sdk_context");
            if (objB instanceof Map) {
                ((Map) objB).put("rootView", viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put("rootView", viewGroup);
                vCCpt.f46642d.a("sdk_context", map);
            }
            vCCpt.a(vCCpt.a("902002", new HashMap()));
            vCCpt.a(vCCpt.a("902003", new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.f47301l == null || VCCpt.f47301l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f47301l.get(this.f47306a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", new HashMap()));
            vCCpt.c("onStop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f46642d;
        if (aVar == null) {
            return;
        }
        Object objB = aVar.b("sdk_context");
        try {
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    synchronized (list) {
                        try {
                            for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                                if (aVar2 != null) {
                                    aVar2.a(str);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            q0.b("RenderViewComponent", th3.getMessage(), th3);
        }
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        Object objB = this.f46642d.b("sdk_context");
        if (objB instanceof Map) {
            ((Map) objB).put("lifecycleListeners", arrayList);
            return;
        }
        HashMap map = new HashMap();
        map.put("lifecycleListeners", arrayList);
        this.f46642d.a("sdk_context", map);
    }

    private void i() {
        a(a("902005", new HashMap()));
        k();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            r4 = this;
            com.mbridge.msdk.config.component.vc.model.a r0 = r4.f47305k
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = "1200001"
            java.lang.String r1 = "Input parameter error"
            r4.a(r0, r1)
            return
        L14:
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L2e
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            r3 = 1
            if (r1 == r2) goto L30
            r2 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r1 == r2) goto L24
            goto L3a
        L24:
            java.lang.String r1 = "close"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L3a
            r0 = r3
            goto L3b
        L2e:
            r0 = move-exception
            goto L48
        L30:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L3a
            r0 = 0
            goto L3b
        L3a:
            r0 = -1
        L3b:
            if (r0 == 0) goto L44
            if (r0 == r3) goto L40
            goto L56
        L40:
            r4.i()     // Catch: java.lang.Exception -> L2e
            return
        L44:
            r4.l()     // Catch: java.lang.Exception -> L2e
            return
        L48:
            java.lang.String r1 = "RenderViewComponent"
            java.lang.String r2 = "Error in doRenderTemplateAction"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r2, r0)
            java.lang.String r0 = "1200002"
            java.lang.String r1 = "Root view render fail"
            r4.a(r0, r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.vc.VCCpt.j():void");
    }

    private void k() {
        try {
            Object objB = this.f46642d.b("sdk_context");
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get("component_cache");
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f47301l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f47304j);
                if (f47301l.isEmpty()) {
                    f47301l = null;
                }
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage(), th2);
        }
    }

    private void l() {
        h();
        Intent intent = new Intent(c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("hide_status_bar", this.f47305k.c());
        intent.putExtra("modal", this.f47305k.d());
        intent.putExtra("width", this.f47305k.f());
        intent.putExtra("height", this.f47305k.b());
        intent.putExtra("orientation", this.f47305k.e());
        b bVar = new b();
        bVar.a(this.f47304j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (c.n() != null && c.n().f() != null) {
                ((Activity) c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage());
        }
        intent.addFlags(268435456);
        c.n().d().startActivity(intent);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "902001";
        this.f47305k = new com.mbridge.msdk.config.component.vc.model.a(map);
        f47301l = new ConcurrentHashMap<>();
        String string = UUID.randomUUID().toString();
        this.f47304j = string;
        f47301l.put(string, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        i();
    }
}
