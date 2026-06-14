package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f46788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f46789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f46790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f46791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f46792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f46793f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f46788a = aVar;
        this.f46789b = aVar2;
        this.f46790c = aVar3;
        this.f46793f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f46788a, this.f46789b, this.f46790c);
        this.f46792e = bVar;
        bVar.c(str);
        this.f46792e.a(this.f46791d);
        c.a().a(this.f46792e, this.f46793f);
        return this.f46789b;
    }

    public void a() {
        b bVar = this.f46792e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f46791d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f46789b.a(str);
        this.f46789b.c(i10);
        this.f46789b.a(i11);
        this.f46789b.b(2);
        return this.f46789b;
    }
}
