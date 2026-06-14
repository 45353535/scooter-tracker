package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes12.dex */
public final class S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f76410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f76411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f76412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f76413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5366q7 f76414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC5168ib f76415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f76416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f76417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f76418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f76419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f76420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f76421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final N8 f76422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC5218ka f76423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC5442t9 f76424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f76425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f76426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f76427t;

    public S8(ContentValues contentValues) {
        C5266m7 model = new C5291n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f76408a = model.a().j();
        this.f76409b = model.a().p();
        this.f76410c = model.c();
        this.f76411d = model.b();
        this.f76412e = model.a().k();
        this.f76413f = model.d();
        this.f76414g = model.a().i();
        this.f76415h = model.e();
        this.f76416i = model.a().d();
        this.f76417j = model.a().f();
        this.f76418k = model.a().o();
        this.f76419l = model.a().c();
        this.f76420m = model.a().b();
        this.f76421n = model.a().m();
        N8 n8E = model.a().e();
        this.f76422o = n8E == null ? N8.a(null) : n8E;
        EnumC5218ka enumC5218kaH = model.a().h();
        this.f76423p = enumC5218kaH == null ? EnumC5218ka.a(null) : enumC5218kaH;
        this.f76424q = model.a().n();
        this.f76425r = model.a().a();
        this.f76426s = model.a().l();
        this.f76427t = model.a().g();
    }
}
