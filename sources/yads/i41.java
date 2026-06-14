package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i41 implements m41, gt1, jf3, il2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h41 f111853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e5 f111854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k41 f111855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f111856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f111857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i5 f111858f;

    public i41(Context context, gy1 gy1Var, e5 e5Var, k41 k41Var) {
        this.f111853a = gy1Var;
        this.f111854b = e5Var;
        this.f111855c = k41Var;
        this.f111856d = context.getApplicationContext();
    }

    public final void a() {
        e5 e5Var = this.f111854b;
        String str = e5Var.f110204a.f115645a;
        if (str != null && str.length() != 0) {
            d5 d5Var = e5Var.f110205b;
            d5Var.getClass();
            synchronized (d5.f109760c) {
                d5Var.f109763b.remove(str);
                d5Var.f109763b.add(str);
            }
        }
        this.f111853a.a(this.f111858f);
    }

    @Override // yads.gt1
    public final void b() {
        if (j()) {
            return;
        }
        k41 k41Var = this.f111855c;
        if (!k41Var.f112588d) {
            k41Var.f112588d = true;
            for (xl2 xl2Var : k41.f112584f) {
                l41 l41Var = k41Var.f112585a;
                Map map = k41Var.f112586b;
                am2 am2VarA = l41Var.a();
                am2VarA.f108722a.putAll(map);
                l41Var.a(xl2Var, am2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // yads.m41
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // yads.jf3
    public final void d() {
        if (j()) {
            return;
        }
        k41 k41Var = this.f111855c;
        if (!k41Var.f112587c) {
            k41Var.f112587c = true;
            for (xl2 xl2Var : k41.f112583e) {
                l41 l41Var = k41Var.f112585a;
                Map map = k41Var.f112586b;
                am2 am2VarA = l41Var.a();
                am2VarA.f108722a.putAll(map);
                l41Var.a(xl2Var, am2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.gt1
    public final void e() {
        if (j()) {
            return;
        }
        k41 k41Var = this.f111855c;
        if (!k41Var.f112587c) {
            k41Var.f112587c = true;
            for (xl2 xl2Var : k41.f112583e) {
                l41 l41Var = k41Var.f112585a;
                Map map = k41Var.f112586b;
                am2 am2VarA = l41Var.a();
                am2VarA.f108722a.putAll(map);
                l41Var.a(xl2Var, am2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.il2
    public final void f() {
    }

    @Override // yads.m41
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.jf3
    public final void h() {
        if (j()) {
            return;
        }
        k41 k41Var = this.f111855c;
        if (!k41Var.f112588d) {
            k41Var.f112588d = true;
            for (xl2 xl2Var : k41.f112584f) {
                l41 l41Var = k41Var.f112585a;
                Map map = k41Var.f112586b;
                am2 am2VarA = l41Var.a();
                am2VarA.f108722a.putAll(map);
                l41Var.a(xl2Var, am2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(this.f111856d);
        return hr2VarA == null || hr2VarA.f111755u;
    }

    public final boolean j() {
        List list = this.f111857e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(List list, i5 i5Var) {
        this.f111857e = list;
        this.f111858f = i5Var;
        k41 k41Var = this.f111855c;
        k41Var.f112587c = false;
        k41Var.f112588d = false;
    }
}
