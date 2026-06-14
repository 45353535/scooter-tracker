package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class LogCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f47104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    x f47105i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        super.b(map);
        this.f46644f = "913001";
        com.mbridge.msdk.config.component.log.model.a aVar = new com.mbridge.msdk.config.component.log.model.a();
        this.f47104h = aVar;
        aVar.a(map);
        this.f47105i = new x.b().a(this.f47104h.k()).b(this.f47104h.d()).d(this.f47104h.g()).c(this.f47104h.b()).e(this.f47104h.a()).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.log.a
            @Override // com.mbridge.msdk.tracker.f
            public final boolean a(e eVar) {
                return LogCpt.a(eVar);
            }
        }).a(new n()).a(this.f47104h.f(), a(this.f47104h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f47105i);
        if (this.f47104h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f47104h.h());
        }
        if (this.f47104h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f47104h.i(), this.f47104h.j()) : new p(new h(), this.f47104h.c(), 0);
    }
}
