package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class av2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43[] f108836b;

    public av2(List list) {
        this.f108835a = list;
        this.f108836b = new z43[list.size()];
    }

    public final void a(ap0 ap0Var, y63 y63Var) {
        for (int i10 = 0; i10 < this.f108836b.length; i10++) {
            y63Var.a();
            y63Var.b();
            z43 z43VarA = ap0Var.a(y63Var.f118106d, 3);
            yv0 yv0Var = (yv0) this.f108835a.get(i10);
            String str = yv0Var.f118398m;
            fi.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = yv0Var.f118387b;
            if (str2 == null) {
                y63Var.b();
                str2 = y63Var.f118107e;
            }
            xv0 xv0Var = new xv0();
            xv0Var.f117972a = str2;
            xv0Var.f117982k = str;
            xv0Var.f117975d = yv0Var.f118390e;
            xv0Var.f117974c = yv0Var.f118389d;
            xv0Var.C = yv0Var.E;
            xv0Var.f117984m = yv0Var.f118400o;
            z43VarA.a(new yv0(xv0Var));
            this.f108836b[i10] = z43VarA;
        }
    }
}
