package yads;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class t13 extends km2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f116025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pn2 f116026t;

    public t13(String str, pn2 pn2Var, on2 on2Var) {
        super(0, str, on2Var);
        this.f116025s = new Object();
        this.f116026t = pn2Var;
    }

    @Override // yads.km2
    public final void a() {
        super.a();
        synchronized (this.f116025s) {
            this.f116026t = null;
        }
    }

    @Override // yads.km2
    public final void a(Object obj) {
        pn2 pn2Var;
        String str = (String) obj;
        synchronized (this.f116025s) {
            pn2Var = this.f116026t;
        }
        if (pn2Var != null) {
            pn2Var.a(str);
        }
    }

    @Override // yads.km2
    public final qn2 a(r62 r62Var) {
        String str;
        try {
            str = new String(r62Var.f115341b, g01.a(r62Var.f115342c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(r62Var.f115341b);
        }
        return new qn2(str, g01.a(r62Var));
    }
}
