package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f46769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f46770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f46771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f46772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46774f = "HTTP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f46775g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f46776h = null;

    class a implements com.mbridge.msdk.config.component.common.network.b {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f46775g != null) {
                c.this.f46775g.a();
            }
        }
    }

    class b implements com.mbridge.msdk.config.component.common.network.b {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f46776h != null) {
                c.this.f46776h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f46771c = aVar;
        this.f46770b = aVar2;
        this.f46772d = aVar2.a();
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f46771c, this.f46770b, this.f46769a);
            this.f46775g = aVar;
            aVar.a(this.f46773e);
            this.f46772d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f46773e = str;
        this.f46769a = aVar;
        this.f46774f = this.f46771c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f46769a;
        if (aVar != null) {
            aVar.a(this.f46770b);
        }
        if (this.f46774f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f46771c, this.f46770b, this.f46769a);
            this.f46776h = aVar;
            aVar.a(this.f46773e);
            this.f46772d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
