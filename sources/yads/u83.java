package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43[] f116569b;

    public u83(List list) {
        this.f116568a = list;
        this.f116569b = new z43[list.size()];
    }

    public final void a(ap0 ap0Var, y63 y63Var) {
        for (int i10 = 0; i10 < this.f116569b.length; i10++) {
            y63Var.a();
            y63Var.b();
            z43 z43VarA = ap0Var.a(y63Var.f118106d, 3);
            yv0 yv0Var = (yv0) this.f116568a.get(i10);
            String str = yv0Var.f118398m;
            fi.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            xv0 xv0Var = new xv0();
            y63Var.b();
            xv0Var.f117972a = y63Var.f118107e;
            xv0Var.f117982k = str;
            xv0Var.f117975d = yv0Var.f118390e;
            xv0Var.f117974c = yv0Var.f118389d;
            xv0Var.C = yv0Var.E;
            xv0Var.f117984m = yv0Var.f118400o;
            z43VarA.a(new yv0(xv0Var));
            this.f116569b[i10] = z43VarA;
        }
    }
}
