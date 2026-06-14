package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class g1 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f119427e;

    public g1(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f119427e = source;
    }

    @Override // zg.a
    public String F(String keyToMatch, boolean z10) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i10 = this.f119378a;
        try {
            if (k() == 6 && Intrinsics.areEqual(H(z10), keyToMatch)) {
                v();
                if (k() == 5) {
                    return H(z10);
                }
            }
            return null;
        } finally {
            this.f119378a = i10;
            v();
        }
    }

    @Override // zg.a
    public int I(int i10) {
        if (i10 < D().length()) {
            return i10;
        }
        return -1;
    }

    @Override // zg.a
    public int K() {
        char cCharAt;
        int i10 = this.f119378a;
        if (i10 == -1) {
            return i10;
        }
        String strD = D();
        while (i10 < strD.length() && ((cCharAt = strD.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f119378a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zg.a
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f119427e;
    }

    @Override // zg.a
    public boolean f() {
        int i10 = this.f119378a;
        if (i10 == -1) {
            return false;
        }
        String strD = D();
        while (i10 < strD.length()) {
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f119378a = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.f119378a = i10;
        return false;
    }

    @Override // zg.a
    public String j() {
        m('\"');
        int i10 = this.f119378a;
        int iU0 = StringsKt.u0(D(), '\"', i10, false, 4, null);
        if (iU0 != -1) {
            for (int i11 = i10; i11 < iU0; i11++) {
                if (D().charAt(i11) == '\\') {
                    return r(D(), this.f119378a, i11);
                }
            }
            this.f119378a = iU0 + 1;
            String strSubstring = D().substring(i10, iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        s();
        String strC = b.c((byte) 1);
        int i12 = this.f119378a;
        a.z(this, "Expected " + strC + ", but had '" + ((i12 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new lf.g();
    }

    @Override // zg.a
    public byte k() {
        String strD = D();
        int i10 = this.f119378a;
        while (i10 != -1 && i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f119378a = i11;
                return b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f119378a = strD.length();
        return (byte) 10;
    }

    @Override // zg.a
    public void m(char c10) {
        if (this.f119378a == -1) {
            Q(c10);
        }
        String strD = D();
        int i10 = this.f119378a;
        while (i10 < strD.length()) {
            int i11 = i10 + 1;
            char cCharAt = strD.charAt(i10);
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
        this.f119378a = -1;
        Q(c10);
    }
}
