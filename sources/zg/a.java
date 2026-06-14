package zg;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119378a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f119380c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f119379b = new l0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f119381d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        z(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new lf.g();
    }

    private final String M() {
        String str = this.f119380c;
        Intrinsics.checkNotNull(str);
        this.f119380c = null;
        return str;
    }

    public static /* synthetic */ boolean P(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.O(z10);
    }

    private final boolean R() {
        return D().charAt(this.f119378a - 1) != '\"';
    }

    private final int b(int i10) {
        int I = I(i10);
        if (I == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new lf.g();
        }
        int i11 = I + 1;
        char cCharAt = D().charAt(I);
        if (cCharAt == 'u') {
            return d(D(), i11);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.f119381d.append(cB);
            return i11;
        }
        z(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    private final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    private final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f119381d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f119378a = i10;
        w();
        if (this.f119378a + 4 < charSequence.length()) {
            return d(charSequence, this.f119378a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new lf.g();
    }

    private final boolean g(int i10) {
        int I = I(i10);
        if (I >= D().length() || I == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new lf.g();
        }
        int i11 = I + 1;
        int iCharAt = D().charAt(I) | ' ';
        if (iCharAt == 102) {
            i("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            i("rue", i11);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new lf.g();
    }

    private final void i(String str, int i10) {
        if (D().length() - i10 < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new lf.g();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (D().charAt(i10 + i11) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new lf.g();
            }
        }
        this.f119378a = i10 + str.length();
    }

    private static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new lf.m();
    }

    private final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f119381d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f119381d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void z(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f119378a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return aVar.y(str, i10, str2);
    }

    public final void A(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iC0 = StringsKt.C0(L(0, this.f119378a), key, 0, false, 6, null);
        throw new e0("Encountered an unknown key '" + key + "' at offset " + iC0 + " at path: " + this.f119379b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) i0.i(D(), iC0)));
    }

    protected final StringBuilder C() {
        return this.f119381d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence D();

    protected final boolean E(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String F(String str, boolean z10);

    public byte G() {
        CharSequence charSequenceD = D();
        int i10 = this.f119378a;
        while (true) {
            int I = I(i10);
            if (I == -1) {
                this.f119378a = I;
                return (byte) 10;
            }
            char cCharAt = charSequenceD.charAt(I);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f119378a = I;
                return b.a(cCharAt);
            }
            i10 = I + 1;
        }
    }

    public final String H(boolean z10) {
        String strQ;
        byte bG = G();
        if (z10) {
            if (bG != 1 && bG != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bG != 1) {
                return null;
            }
            strQ = q();
        }
        this.f119380c = strQ;
        return strQ;
    }

    public abstract int I(int i10);

    public final void J(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bG = G();
        if (bG != 8 && bG != 6) {
            s();
            return;
        }
        while (true) {
            byte bG2 = G();
            if (bG2 != 1) {
                if (bG2 == 8 || bG2 == 6) {
                    arrayList.add(Byte.valueOf(bG2));
                } else if (bG2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw i0.f(this.f119378a, "found ] instead of } at path: " + this.f119379b, D());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bG2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw i0.f(this.f119378a, "found } instead of ] at path: " + this.f119379b, D());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bG2 == 10) {
                    z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new lf.g();
                }
                k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                j();
            }
        }
    }

    public abstract int K();

    public String L(int i10, int i11) {
        return D().subSequence(i10, i11).toString();
    }

    public final boolean N() {
        int iK = K();
        CharSequence charSequenceD = D();
        if (iK >= charSequenceD.length() || iK == -1 || charSequenceD.charAt(iK) != ',') {
            return false;
        }
        this.f119378a++;
        return true;
    }

    public final boolean O(boolean z10) {
        int I = I(K());
        int length = D().length() - I;
        if (length < 4 || I == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != D().charAt(I + i10)) {
                return false;
            }
        }
        if (length > 4 && b.a(D().charAt(I + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f119378a = I + 4;
        return true;
    }

    protected final void Q(char c10) {
        int i10 = this.f119378a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f119378a = i10 - 1;
                String strS = s();
                this.f119378a = i10;
                if (Intrinsics.areEqual(strS, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f119378a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new lf.g();
                }
            } catch (Throwable th2) {
                this.f119378a = i10;
                throw th2;
            }
        }
        String strC = b.c(b.a(c10));
        int i11 = this.f119378a;
        int i12 = i11 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i11 == D().length() || i12 < 0) ? "EOF" : String.valueOf(D().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new lf.g();
    }

    protected void e(int i10, int i11) {
        this.f119381d.append(D(), i10, i11);
    }

    public abstract boolean f();

    public final boolean h() {
        boolean z10;
        int iK = K();
        if (iK == D().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new lf.g();
        }
        if (D().charAt(iK) == '\"') {
            iK++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(iK);
        if (!z10) {
            return zG;
        }
        if (this.f119378a == D().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new lf.g();
        }
        if (D().charAt(this.f119378a) == '\"') {
            this.f119378a++;
            return zG;
        }
        z(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new lf.g();
    }

    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte bK = k();
        if (bK == b10) {
            return bK;
        }
        String strC = b.c(b10);
        int i10 = this.f119378a;
        int i11 = i10 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new lf.g();
    }

    public abstract void m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        z(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0201, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        z(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (D().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        z(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        z(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r18.f119378a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r1 = r10 * o(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        z(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        throw new lf.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e0, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        throw new lf.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n() {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.a.n():long");
    }

    public final long p() {
        long jN = n();
        if (k() == 10) {
            return jN;
        }
        b.c((byte) 10);
        int i10 = this.f119378a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == D().length() || i11 < 0) ? "EOF" : String.valueOf(D().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new lf.g();
    }

    public final String q() {
        return this.f119380c != null ? M() : j();
    }

    protected final String r(CharSequence source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int I = I(c(i10, i11));
                if (I == -1) {
                    z(this, "Unexpected EOF", I, null, 4, null);
                    throw new lf.g();
                }
                z10 = true;
                i10 = I;
                i11 = i10;
            } else {
                i11++;
                if (i11 >= source.length()) {
                    e(i10, i11);
                    int I2 = I(i11);
                    if (I2 == -1) {
                        z(this, "Unexpected EOF", I2, null, 4, null);
                        throw new lf.g();
                    }
                    i10 = I2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i11);
        }
        String strL = !z10 ? L(i10, i11) : u(i10, i11);
        this.f119378a = i11 + 1;
        return strL;
    }

    public final String s() {
        if (this.f119380c != null) {
            return M();
        }
        int iK = K();
        if (iK >= D().length() || iK == -1) {
            z(this, "EOF", iK, null, 4, null);
            throw new lf.g();
        }
        byte bA = b.a(D().charAt(iK));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            z(this, "Expected beginning of the string, but got " + D().charAt(iK), 0, null, 6, null);
            throw new lf.g();
        }
        boolean z10 = false;
        while (b.a(D().charAt(iK)) == 0) {
            iK++;
            if (iK >= D().length()) {
                e(this.f119378a, iK);
                int I = I(iK);
                if (I == -1) {
                    this.f119378a = iK;
                    return u(0, 0);
                }
                iK = I;
                z10 = true;
            }
        }
        String strL = !z10 ? L(this.f119378a, iK) : u(this.f119378a, iK);
        this.f119378a = iK;
        return strL;
    }

    public final String t() {
        String strS = s();
        if (!Intrinsics.areEqual(strS, "null") || !R()) {
            return strS;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new lf.g();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f119378a + ')';
    }

    public final void v() {
        this.f119380c = null;
    }

    public final void x() {
        if (k() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + D().charAt(this.f119378a - 1) + " instead", 0, null, 6, null);
        throw new lf.g();
    }

    public final Void y(String message, int i10, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw i0.f(i10, message + " at path: " + this.f119379b.a() + str, D());
    }

    public void w() {
    }
}
