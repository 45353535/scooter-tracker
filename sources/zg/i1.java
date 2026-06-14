package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends g1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // zg.a
    public byte G() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f119378a = iK;
        return b.a(strD.charAt(iK));
    }

    @Override // zg.g1, zg.a
    public int K() {
        int i10;
        int iU0 = this.f119378a;
        if (iU0 == -1) {
            return iU0;
        }
        String strD = D();
        while (iU0 < strD.length()) {
            char cCharAt = strD.charAt(iU0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iU0 + 1) >= strD.length()) {
                    break;
                }
                char cCharAt2 = strD.charAt(i10);
                if (cCharAt2 == '*') {
                    int iV0 = StringsKt.v0(strD, "*/", iU0 + 2, false, 4, null);
                    if (iV0 == -1) {
                        this.f119378a = strD.length();
                        a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new lf.g();
                    }
                    iU0 = iV0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iU0 = StringsKt.u0(strD, '\n', iU0 + 2, false, 4, null);
                    iU0 = iU0 == -1 ? strD.length() : iU0 + 1;
                }
            }
        }
        this.f119378a = iU0;
        return iU0;
    }

    @Override // zg.g1, zg.a
    public boolean f() {
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // zg.g1, zg.a
    public byte k() {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f119378a = iK + 1;
        return b.a(strD.charAt(iK));
    }

    @Override // zg.g1, zg.a
    public void m(char c10) {
        String strD = D();
        int iK = K();
        if (iK >= strD.length() || iK == -1) {
            this.f119378a = -1;
            Q(c10);
        }
        char cCharAt = strD.charAt(iK);
        this.f119378a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
