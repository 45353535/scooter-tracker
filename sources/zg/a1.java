package zg;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f119382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char[] f119383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f119384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h f119385h;

    public a1(a0 reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f119382e = reader;
        this.f119383f = buffer;
        this.f119384g = 128;
        this.f119385h = new h(buffer);
        U(0);
    }

    private final void U(int i10) {
        char[] cArrB = D().b();
        if (i10 != 0) {
            int i11 = this.f119378a;
            ArraysKt.copyInto(cArrB, cArrB, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (true) {
            if (i10 == length) {
                break;
            }
            int iA = this.f119382e.a(cArrB, i10, length - i10);
            if (iA == -1) {
                D().f(i10);
                this.f119384g = -1;
                break;
            }
            i10 += iA;
        }
        this.f119378a = 0;
    }

    @Override // zg.a
    public String F(String keyToMatch, boolean z10) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // zg.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        this.f119378a = i10;
        w();
        return (this.f119378a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // zg.a
    public int K() {
        int I;
        char cCharAt;
        int i10 = this.f119378a;
        while (true) {
            I = I(i10);
            if (I == -1 || !((cCharAt = D().charAt(I)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = I + 1;
        }
        this.f119378a = I;
        return I;
    }

    @Override // zg.a
    public String L(int i10, int i11) {
        return D().e(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zg.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public h D() {
        return this.f119385h;
    }

    public int T(char c10, int i10) {
        h hVarD = D();
        int length = hVarD.length();
        while (i10 < length) {
            if (hVarD.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void V() {
        o.f119459c.c(this.f119383f);
    }

    @Override // zg.a
    protected void e(int i10, int i11) {
        StringBuilder sbC = C();
        sbC.append(D().b(), i10, i11 - i10);
        Intrinsics.checkNotNullExpressionValue(sbC, "append(...)");
    }

    @Override // zg.a
    public boolean f() {
        w();
        int i10 = this.f119378a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f119378a = I;
                return false;
            }
            char cCharAt = D().charAt(I);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f119378a = I;
                return E(cCharAt);
            }
            i10 = I + 1;
        }
    }

    @Override // zg.a
    public String j() {
        m('\"');
        int i10 = this.f119378a;
        int iT = T('\"', i10);
        if (iT != -1) {
            for (int i11 = i10; i11 < iT; i11++) {
                if (D().charAt(i11) == '\\') {
                    return r(D(), this.f119378a, i11);
                }
            }
            this.f119378a = iT + 1;
            return L(i10, iT);
        }
        int I = I(i10);
        if (I != -1) {
            return r(D(), this.f119378a, I);
        }
        String strC = b.c((byte) 1);
        int i12 = this.f119378a;
        int i13 = i12 - 1;
        a.z(this, "Expected " + strC + ", but had '" + ((i12 == D().length() || i13 < 0) ? "EOF" : String.valueOf(D().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new lf.g();
    }

    @Override // zg.a
    public byte k() {
        w();
        h hVarD = D();
        int i10 = this.f119378a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f119378a = I;
                return (byte) 10;
            }
            int i11 = I + 1;
            byte bA = b.a(hVarD.charAt(I));
            if (bA != 3) {
                this.f119378a = i11;
                return bA;
            }
            i10 = i11;
        }
    }

    @Override // zg.a
    public void m(char c10) {
        w();
        h hVarD = D();
        int i10 = this.f119378a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f119378a = I;
                Q(c10);
                return;
            }
            int i11 = I + 1;
            char cCharAt = hVarD.charAt(I);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f119378a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    Q(c10);
                }
            }
            i10 = i11;
        }
    }

    @Override // zg.a
    public void w() {
        int length = D().length() - this.f119378a;
        if (length > this.f119384g) {
            return;
        }
        U(length);
    }
}
