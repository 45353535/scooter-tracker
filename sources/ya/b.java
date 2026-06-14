package ya;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import n9.v;
import q9.c0;
import xa.c;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends c {
    private static v c(c0 c0Var) {
        c0Var.r(12);
        int iD = (c0Var.d() + c0Var.h(12)) - 4;
        c0Var.r(44);
        c0Var.s(c0Var.h(12));
        c0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (c0Var.d() >= iD) {
                break;
            }
            c0Var.r(48);
            int iH = c0Var.h(8);
            c0Var.r(4);
            int iD2 = c0Var.d() + c0Var.h(12);
            String strL2 = null;
            while (c0Var.d() < iD2) {
                int iH2 = c0Var.h(8);
                int iH3 = c0Var.h(8);
                int iD3 = c0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = c0Var.h(16);
                    c0Var.r(8);
                    if (iH4 == 3) {
                        while (c0Var.d() < iD3) {
                            strL = c0Var.l(c0Var.h(8), StandardCharsets.US_ASCII);
                            int iH5 = c0Var.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                c0Var.s(c0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = c0Var.l(iH3, StandardCharsets.US_ASCII);
                }
                c0Var.p(iD3 * 8);
            }
            c0Var.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v(arrayList);
    }

    @Override // xa.c
    protected v b(xa.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new c0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
