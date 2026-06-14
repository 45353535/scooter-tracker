package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ax2 implements g12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw1 f108853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vn2 f108854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9 f108855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iy f108856d;

    public ax2(rw1 rw1Var, vn2 vn2Var, l9 l9Var, iy iyVar) {
        this.f108853a = rw1Var;
        this.f108854b = vn2Var;
        this.f108855c = l9Var;
        this.f108856d = iyVar;
    }

    @Override // yads.g12
    public final am2 a(t9 t9Var, c4 c4Var, qz1 qz1Var) {
        vn2 vn2Var = this.f108854b;
        rw1 rw1Var = this.f108853a;
        am2 am2VarA = vn2Var.a(t9Var, c4Var);
        if (qz1Var != null) {
            List listA = vn2Var.f117133b.a(qz1Var);
            if (!listA.isEmpty()) {
                am2VarA.a(listA, "image_sizes");
            }
        }
        am2VarA.b(rw1Var.f115625c, "ad_id");
        am2 am2VarA2 = this.f108855c.a(c4Var.f109198e);
        return bm2.a(bm2.a(am2VarA, am2VarA2), this.f108856d.a(c4Var));
    }
}
