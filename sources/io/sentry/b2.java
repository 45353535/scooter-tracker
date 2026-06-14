package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f83261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f83262b;

    public b2(Writer writer, int i10) {
        this.f83261a = new io.sentry.vendor.gson.stream.c(writer);
        this.f83262b = new a2(i10);
    }

    @Override // io.sentry.n3
    public String f() {
        return this.f83261a.y();
    }

    @Override // io.sentry.n3
    public n3 g(String str) throws IOException {
        this.f83261a.z(str);
        return this;
    }

    @Override // io.sentry.n3
    public void h(String str) {
        this.f83261a.i0(str);
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b2 beginArray() throws IOException {
        this.f83261a.o();
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b2 beginObject() throws IOException {
        this.f83261a.p();
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b2 endArray() {
        this.f83261a.s();
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b2 endObject() {
        this.f83261a.w();
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b2 e(String str) {
        this.f83261a.M(str);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b2 l() throws IOException {
        this.f83261a.U();
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b2 c(double d10) throws IOException {
        this.f83261a.r0(d10);
        return this;
    }

    @Override // io.sentry.n3
    public void setLenient(boolean z10) {
        this.f83261a.setLenient(z10);
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b2 b(long j10) throws IOException {
        this.f83261a.s0(j10);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b2 j(ILogger iLogger, Object obj) {
        this.f83262b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b2 k(Boolean bool) throws IOException {
        this.f83261a.t0(bool);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b2 i(Number number) throws IOException {
        this.f83261a.u0(number);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b2 a(String str) throws IOException {
        this.f83261a.x0(str);
        return this;
    }

    @Override // io.sentry.n3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b2 d(boolean z10) throws IOException {
        this.f83261a.y0(z10);
        return this;
    }
}
