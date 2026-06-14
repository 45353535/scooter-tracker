package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gg extends pw2 {
    @Override // yads.pw2
    public final fr1 a(ir1 ir1Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            v92 v92Var = new v92(byteBuffer.limit(), byteBuffer.array());
            v92Var.c(12);
            int iC = (v92Var.c() + v92Var.a(12)) - 4;
            v92Var.c(44);
            v92Var.d(v92Var.a(12));
            v92Var.c(16);
            ArrayList arrayList = new ArrayList();
            while (v92Var.c() < iC) {
                v92Var.c(48);
                int iA = v92Var.a(8);
                v92Var.c(4);
                int iC2 = v92Var.c() + v92Var.a(12);
                String strA = null;
                String strA2 = null;
                while (v92Var.c() < iC2) {
                    int iA2 = v92Var.a(8);
                    int iA3 = v92Var.a(8);
                    int iC3 = v92Var.c() + iA3;
                    if (iA2 == 2) {
                        int iA4 = v92Var.a(16);
                        v92Var.c(8);
                        if (iA4 == 3) {
                            while (v92Var.c() < iC3) {
                                strA = v92Var.a(v92Var.a(8), st.f115923a);
                                int iA5 = v92Var.a(8);
                                for (int i10 = 0; i10 < iA5; i10++) {
                                    v92Var.d(v92Var.a(8));
                                }
                            }
                        }
                    } else if (iA2 == 21) {
                        strA2 = v92Var.a(iA3, st.f115923a);
                    }
                    v92Var.b(iC3 * 8);
                }
                v92Var.b(iC2 * 8);
                if (strA != null && strA2 != null) {
                    arrayList.add(new fg(iA, strA.concat(strA2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new fr1(arrayList);
            }
        }
        return null;
    }
}
