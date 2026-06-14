package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.g;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.c f46675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f46676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.f f46677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f46678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f46679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f46680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f46681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f46682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f46683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.a f46684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f46685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i f46686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.b f46687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f46688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h f46689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n f46690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f46691r;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f46674a = cVar;
        this.f46675b = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.f46676c = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f46677d = new com.mbridge.msdk.config.component.common.express.operator.f(cVar);
        this.f46678e = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f46679f = new o(cVar);
        this.f46680g = new q(cVar);
        this.f46681h = new m(cVar);
        this.f46682i = new k(cVar);
        this.f46683j = new j(cVar);
        this.f46684k = new com.mbridge.msdk.config.component.common.express.operator.a(cVar);
        this.f46685l = new g(cVar);
        this.f46686m = new i(cVar);
        this.f46687n = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.f46688o = new p(cVar);
        this.f46689p = new h();
        this.f46690q = new n(cVar);
        this.f46691r = new l(cVar);
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        q0.a("ExpressionOperator", "execute-expr: " + str);
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f46691r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f46678e.a(strB, objA, listC);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f46677d.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f46676c.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f46679f.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f46686m.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f46682i.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f46680g.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f46681h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f46683j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f46684k.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f46688o.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f46690q.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f46689p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f46675b.a(strB, objA, listC);
            return aVarA11.b() ? aVarA11.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
