package yads;

import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vj3 {
    public static pb3 a(oj3 oj3Var) {
        if (oj3Var instanceof vk0) {
            return ob3.a((vk0) oj3Var);
        }
        if (oj3Var instanceof y92) {
            return ob3.a();
        }
        r62 r62Var = oj3Var.f114340b;
        if (r62Var == null) {
            return ob3.a(oj3Var.getMessage());
        }
        int i10 = r62Var.f115340a;
        if (i10 >= 500) {
            return ob3.b();
        }
        String str = ("Network Error.  Code: " + i10 + ".") + " Data: \n" + new String(r62Var.f115341b, Charsets.UTF_8);
        boolean z10 = lb1.f113032a;
        return ob3.b(str);
    }
}
