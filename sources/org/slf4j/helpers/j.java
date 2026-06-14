package org.slf4j.helpers;

import com.taurusx.tax.y.z.w.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class j implements yh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile yh.d f97918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f97919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f97920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zh.a f97921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Queue f97922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f97923h;

    public j(String str, Queue queue, boolean z10) {
        this.f97917b = str;
        this.f97922g = queue;
        this.f97923h = z10;
    }

    private yh.d b() {
        if (this.f97921f == null) {
            this.f97921f = new zh.a(this, this.f97922g);
        }
        return this.f97921f;
    }

    public yh.d a() {
        return this.f97918c != null ? this.f97918c : this.f97923h ? e.f97912b : b();
    }

    public String c() {
        return this.f97917b;
    }

    @Override // yh.d
    public boolean d() {
        return a().d();
    }

    public boolean e() {
        Boolean bool = this.f97919d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f97920e = this.f97918c.getClass().getMethod(s.z.f67719y, zh.c.class);
            this.f97919d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f97919d = Boolean.FALSE;
        }
        return this.f97919d.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f97917b.equals(((j) obj).f97917b);
    }

    public boolean f() {
        return this.f97918c instanceof e;
    }

    @Override // yh.d
    public boolean g() {
        return a().g();
    }

    @Override // yh.d
    public void h(String str, Throwable th2) {
        a().h(str, th2);
    }

    public int hashCode() {
        return this.f97917b.hashCode();
    }

    @Override // yh.d
    public void i(String str) {
        a().i(str);
    }

    @Override // yh.d
    public boolean j() {
        return a().j();
    }

    @Override // yh.d
    public boolean k() {
        return a().k();
    }

    @Override // yh.d
    public boolean l() {
        return a().l();
    }

    @Override // yh.d
    public boolean m(zh.b bVar) {
        return a().m(bVar);
    }

    @Override // yh.d
    public void n(String str) {
        a().n(str);
    }

    public boolean o() {
        return this.f97918c == null;
    }

    public void p(zh.c cVar) {
        if (e()) {
            try {
                this.f97920e.invoke(this.f97918c, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void q(yh.d dVar) {
        this.f97918c = dVar;
    }
}
