package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f51292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f51293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f51294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f51295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f51297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f51298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f51299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f51300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f51301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f51302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f51303l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f51292a = list;
        this.f51295d = cVar2;
        this.f51293b = gVar;
        this.f51294c = cVar;
        this.f51296e = i10;
        this.f51297f = yVar;
        this.f51298g = dVar;
        this.f51299h = oVar;
        this.f51300i = i11;
        this.f51301j = i12;
        this.f51302k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f51300i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f51301j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f51302k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f51297f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f51298g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f51295d;
    }

    public o g() {
        return this.f51299h;
    }

    public c h() {
        return this.f51294c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f51293b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.f51293b, this.f51294c, this.f51295d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f51296e < this.f51292a.size()) {
            this.f51303l++;
            if (this.f51294c != null && !this.f51295d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f51292a.get(this.f51296e - 1) + " must retain the same host and port");
            }
            if (this.f51294c != null && this.f51303l > 1) {
                throw new IllegalStateException("network interceptor " + this.f51292a.get(this.f51296e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f51292a, gVar, cVar, cVar2, this.f51296e + 1, yVar, this.f51298g, this.f51299h, this.f51300i, this.f51301j, this.f51302k);
            t tVar = this.f51292a.get(this.f51296e);
            a0 a0VarA = tVar.a(gVar2);
            if (cVar != null && this.f51296e + 1 < this.f51292a.size() && gVar2.f51303l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a0VarA != null) {
                if (a0VarA.d() != null) {
                    return a0VarA;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
