package zg;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends a1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a0 reader, char[] buffer) {
        super(reader, buffer);
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    private final Pair W(int i10) {
        int i11 = i10 + 2;
        char cCharAt = D().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return TuplesKt.to(Integer.valueOf(i10), Boolean.FALSE);
            }
            int I = i11;
            while (i10 != -1) {
                int iU0 = StringsKt.u0(D(), '\n', I, false, 4, null);
                if (iU0 != -1) {
                    return TuplesKt.to(Integer.valueOf(iU0 + 1), Boolean.TRUE);
                }
                I = I(D().length());
                i10 = I;
            }
            return TuplesKt.to(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iX = i11;
        while (i10 != -1) {
            int iV0 = StringsKt.v0(D(), "*/", iX, false, 4, null);
            if (iV0 != -1) {
                return TuplesKt.to(Integer.valueOf(iV0 + 2), Boolean.TRUE);
            }
            if (D().charAt(D().length() - 1) == '*') {
                iX = X(D().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iX = I(D().length());
            }
            i10 = iX;
        }
        this.f119378a = D().length();
        a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new lf.g();
    }

    private final int X(int i10) {
        if (D().length() - i10 > this.f119384g) {
            return i10;
        }
        this.f119378a = i10;
        w();
        return (this.f119378a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // zg.a
    public byte G() {
        w();
        h hVarD = D();
        int iK = K();
        if (iK >= hVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f119378a = iK;
        return b.a(hVarD.charAt(iK));
    }

    @Override // zg.a1, zg.a
    public int K() {
        int I;
        int i10 = this.f119378a;
        while (true) {
            I = I(i10);
            if (I == -1) {
                break;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = I + 1;
            } else {
                if (cCharAt != '/' || I + 1 >= D().length()) {
                    break;
                }
                Pair pairW = W(I);
                int iIntValue = ((Number) pairW.component1()).intValue();
                if (!((Boolean) pairW.component2()).booleanValue()) {
                    I = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.f119378a = I;
        return I;
    }

    @Override // zg.a1, zg.a
    public boolean f() {
        w();
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            return false;
        }
        return E(D().charAt(iK));
    }

    @Override // zg.a1, zg.a
    public byte k() {
        w();
        h hVarD = D();
        int iK = K();
        if (iK >= hVarD.length() || iK == -1) {
            return (byte) 10;
        }
        this.f119378a = iK + 1;
        return b.a(hVarD.charAt(iK));
    }

    @Override // zg.a1, zg.a
    public void m(char c10) {
        w();
        h hVarD = D();
        int iK = K();
        if (iK >= hVarD.length() || iK == -1) {
            this.f119378a = -1;
            Q(c10);
        }
        char cCharAt = hVarD.charAt(iK);
        this.f119378a = iK + 1;
        if (cCharAt == c10) {
            return;
        }
        Q(c10);
    }
}
