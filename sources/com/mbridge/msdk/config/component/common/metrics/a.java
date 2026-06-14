package com.mbridge.msdk.config.component.common.metrics;

import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f46765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x f46766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    JSONObject f46767c;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f46768a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f46765a;
            if (mVar == null) {
                m mVarB = m.b("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f46765a = mVarB;
                if (mVarB != null) {
                    JSONObject jSONObject = this.f46767c;
                    if (jSONObject != null) {
                        mVarB.a(jSONObject);
                    }
                    this.f46765a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f46767c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f46765a;
    }

    public void d() {
        if (this.f46765a == null) {
            this.f46765a = c();
        }
        this.f46765a.a();
    }

    private a() {
    }

    public static a a() {
        return b.f46768a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f46767c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(C4240b4.i.W));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th2) {
                q0.b("ComponentMetrics", th2.getMessage(), th2);
            }
        }
    }

    private x b() {
        if (this.f46766b == null) {
            this.f46766b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.c
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    return a.a(eVar);
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f48728d, 0)).a();
        }
        return this.f46766b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f46766b = xVar;
            m mVar = this.f46765a;
            if (mVar != null) {
                mVar.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), xVar);
            }
        }
    }
}
