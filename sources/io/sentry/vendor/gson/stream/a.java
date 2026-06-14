package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f84383b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f84391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f84392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f84393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f84394m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String[] f84396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f84397p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f84384c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f84385d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f84386e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f84387f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f84388g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84389h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f84390i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f84395n = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f84394m = iArr;
        iArr[0] = 6;
        this.f84396o = new String[32];
        this.f84397p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f84383b = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f84386e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String M(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f84385d
            r1 = 0
        L3:
            int r2 = r9.f84386e
            int r3 = r9.f84387f
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f84386e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f84386e = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.b0()
            r1.append(r2)
            int r2 = r9.f84386e
            int r3 = r9.f84387f
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f84388g
            int r2 = r2 + r6
            r9.f84388g = r2
            r9.f84389h = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f84386e = r2
            boolean r2 = r9.p(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.s0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.M(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String R() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f84386e
            int r4 = r3 + r2
            int r5 = r6.f84387f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f84385d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m()
            goto L5c
        L4e:
            char[] r3 = r6.f84385d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.p(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f84385d
            int r4 = r6.f84386e
            r0.append(r3, r4, r2)
            int r3 = r6.f84386e
            int r3 = r3 + r2
            r6.f84386e = r3
            r2 = 1
            boolean r2 = r6.p(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f84385d
            int r3 = r6.f84386e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f84385d
            int r3 = r6.f84386e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f84386e
            int r2 = r2 + r1
            r6.f84386e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.R():java.lang.String");
    }

    private int U() {
        String str;
        String str2;
        int i10;
        char c10 = this.f84385d[this.f84386e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f84386e + i11 >= this.f84387f && !p(i11 + 1)) {
                return 0;
            }
            char c11 = this.f84385d[this.f84386e + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f84386e + length < this.f84387f || p(length + 1)) && q(this.f84385d[this.f84386e + length])) {
            return 0;
        }
        this.f84386e += length;
        this.f84390i = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (q(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f84391j = r11;
        r19.f84386e += r8;
        r19.f84390i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f84392k = r8;
        r19.f84390i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int V() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.V():int");
    }

    private void W(int i10) {
        int i11 = this.f84395n;
        int[] iArr = this.f84394m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f84394m = Arrays.copyOf(iArr, i12);
            this.f84397p = Arrays.copyOf(this.f84397p, i12);
            this.f84396o = (String[]) Arrays.copyOf(this.f84396o, i12);
        }
        int[] iArr2 = this.f84394m;
        int i13 = this.f84395n;
        this.f84395n = i13 + 1;
        iArr2[i13] = i10;
    }

    private char b0() throws IOException {
        int i10;
        if (this.f84386e == this.f84387f && !p(1)) {
            throw s0("Unterminated escape sequence");
        }
        char[] cArr = this.f84385d;
        int i11 = this.f84386e;
        int i12 = i11 + 1;
        this.f84386e = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f84388g++;
            this.f84389h = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw s0("Invalid escape sequence");
        }
        if (i11 + 5 > this.f84387f && !p(4)) {
            throw s0("Unterminated escape sequence");
        }
        int i13 = this.f84386e;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f84385d[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f84385d, this.f84386e, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f84386e += 4;
        return c11;
    }

    private void e0(char c10) throws IOException {
        char[] cArr = this.f84385d;
        do {
            int i10 = this.f84386e;
            int i11 = this.f84387f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f84386e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f84386e = i12;
                    b0();
                    i10 = this.f84386e;
                    i11 = this.f84387f;
                } else {
                    if (c11 == '\n') {
                        this.f84388g++;
                        this.f84389h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f84386e = i10;
        } while (p(1));
        throw s0("Unterminated string");
    }

    private boolean i0(String str) {
        int length = str.length();
        while (true) {
            if (this.f84386e + length > this.f84387f && !p(length)) {
                return false;
            }
            char[] cArr = this.f84385d;
            int i10 = this.f84386e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f84385d[this.f84386e + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f84388g++;
            this.f84389h = i10 + 1;
            this.f84386e++;
        }
    }

    private void m() throws IOException {
        if (!this.f84384c) {
            throw s0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void n() throws IOException {
        y(true);
        int i10 = this.f84386e;
        int i11 = i10 - 1;
        this.f84386e = i11;
        if (i10 + 4 <= this.f84387f || p(5)) {
            char[] cArr = this.f84385d;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f84386e += 5;
            }
        }
    }

    private void n0() {
        char c10;
        do {
            if (this.f84386e >= this.f84387f && !p(1)) {
                return;
            }
            char[] cArr = this.f84385d;
            int i10 = this.f84386e;
            int i11 = i10 + 1;
            this.f84386e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f84388g++;
                this.f84389h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private boolean p(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f84385d;
        int i13 = this.f84389h;
        int i14 = this.f84386e;
        this.f84389h = i13 - i14;
        int i15 = this.f84387f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f84387f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f84387f = 0;
        }
        this.f84386e = 0;
        do {
            Reader reader = this.f84383b;
            int i17 = this.f84387f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f84387f + i18;
            this.f84387f = i11;
            if (this.f84388g == 0 && (i12 = this.f84389h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f84386e++;
                this.f84389h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean q(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f84386e
            int r2 = r1 + r0
            int r3 = r4.f84387f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f84385d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m()
        L4b:
            int r1 = r4.f84386e
            int r1 = r1 + r0
            r4.f84386e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f84386e = r1
            r0 = 1
            boolean r0 = r4.p(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.r0():void");
    }

    private IOException s0(String str) throws d {
        throw new d(str + s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int y(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f84385d
            int r1 = r8.f84386e
            int r2 = r8.f84387f
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f84386e = r1
            boolean r1 = r8.p(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r9 = -1
            return r9
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            int r1 = r8.f84386e
            int r2 = r8.f84387f
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.f84388g
            int r1 = r1 + r3
            r8.f84388g = r1
            r8.f84389h = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.f84386e = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.f84386e = r1
            boolean r1 = r8.p(r7)
            int r2 = r8.f84386e
            int r2 = r2 + r3
            r8.f84386e = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.m()
            int r1 = r8.f84386e
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.f84386e = r1
            r8.n0()
            int r1 = r8.f84386e
            int r2 = r8.f84387f
            goto L6
        L83:
            int r1 = r1 + 1
            r8.f84386e = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.i0(r1)
            if (r1 == 0) goto L96
            int r1 = r8.f84386e
            int r1 = r1 + r7
            int r2 = r8.f84387f
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.s0(r9)
            throw r9
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.f84386e = r4
            r8.m()
            r8.n0()
            int r1 = r8.f84386e
            int r2 = r8.f84387f
            goto L6
        Laf:
            r8.f84386e = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.y(boolean):int");
    }

    public void beginArray() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 3) {
            W(1);
            this.f84397p[this.f84395n - 1] = 0;
            this.f84390i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + s());
        }
    }

    public void beginObject() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 1) {
            W(3);
            this.f84390i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + s());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84390i = 0;
        this.f84394m[0] = 8;
        this.f84395n = 1;
        this.f84383b.close();
    }

    public void endArray() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + s());
        }
        int i10 = this.f84395n;
        this.f84395n = i10 - 1;
        int[] iArr = this.f84397p;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f84390i = 0;
    }

    public void endObject() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + s());
        }
        int i10 = this.f84395n;
        int i11 = i10 - 1;
        this.f84395n = i11;
        this.f84396o[i11] = null;
        int[] iArr = this.f84397p;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f84390i = 0;
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f84395n;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f84394m[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f84397p[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f84396o[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public boolean hasNext() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        return (iO == 2 || iO == 4) ? false : true;
    }

    public double nextDouble() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f84390i = 0;
            int[] iArr = this.f84397p;
            int i10 = this.f84395n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f84391j;
        }
        if (iO == 16) {
            this.f84393l = new String(this.f84385d, this.f84386e, this.f84392k);
            this.f84386e += this.f84392k;
        } else if (iO == 8 || iO == 9) {
            this.f84393l = M(iO == 8 ? '\'' : '\"');
        } else if (iO == 10) {
            this.f84393l = R();
        } else if (iO != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + s());
        }
        this.f84390i = 11;
        double d10 = Double.parseDouble(this.f84393l);
        if (!this.f84384c && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + s());
        }
        this.f84393l = null;
        this.f84390i = 0;
        int[] iArr2 = this.f84397p;
        int i11 = this.f84395n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            long j10 = this.f84391j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f84390i = 0;
                int[] iArr = this.f84397p;
                int i11 = this.f84395n - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f84391j + s());
        }
        if (iO == 16) {
            this.f84393l = new String(this.f84385d, this.f84386e, this.f84392k);
            this.f84386e += this.f84392k;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + s());
            }
            if (iO == 10) {
                this.f84393l = R();
            } else {
                this.f84393l = M(iO == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f84393l);
                this.f84390i = 0;
                int[] iArr2 = this.f84397p;
                int i13 = this.f84395n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f84390i = 11;
        double d10 = Double.parseDouble(this.f84393l);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f84393l + s());
        }
        this.f84393l = null;
        this.f84390i = 0;
        int[] iArr3 = this.f84397p;
        int i15 = this.f84395n - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f84390i = 0;
            int[] iArr = this.f84397p;
            int i10 = this.f84395n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f84391j;
        }
        if (iO == 16) {
            this.f84393l = new String(this.f84385d, this.f84386e, this.f84392k);
            this.f84386e += this.f84392k;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + s());
            }
            if (iO == 10) {
                this.f84393l = R();
            } else {
                this.f84393l = M(iO == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f84393l);
                this.f84390i = 0;
                int[] iArr2 = this.f84397p;
                int i11 = this.f84395n - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f84390i = 11;
        double d10 = Double.parseDouble(this.f84393l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f84393l + s());
        }
        this.f84393l = null;
        this.f84390i = 0;
        int[] iArr3 = this.f84397p;
        int i12 = this.f84395n - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String nextName() throws IOException {
        String strM;
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 14) {
            strM = R();
        } else if (iO == 12) {
            strM = M('\'');
        } else {
            if (iO != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + s());
            }
            strM = M('\"');
        }
        this.f84390i = 0;
        this.f84396o[this.f84395n - 1] = strM;
        return strM;
    }

    public String nextString() throws IOException {
        String str;
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 10) {
            str = R();
        } else if (iO == 8) {
            str = M('\'');
        } else if (iO == 9) {
            str = M('\"');
        } else if (iO == 11) {
            str = this.f84393l;
            this.f84393l = null;
        } else if (iO == 15) {
            str = Long.toString(this.f84391j);
        } else {
            if (iO != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + s());
            }
            str = new String(this.f84385d, this.f84386e, this.f84392k);
            this.f84386e += this.f84392k;
        }
        this.f84390i = 0;
        int[] iArr = this.f84397p;
        int i10 = this.f84395n - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    int o() throws IOException {
        int iY;
        int[] iArr = this.f84394m;
        int i10 = this.f84395n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iY2 = y(true);
            if (iY2 != 44) {
                if (iY2 != 59) {
                    if (iY2 != 93) {
                        throw s0("Unterminated array");
                    }
                    this.f84390i = 4;
                    return 4;
                }
                m();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iY = y(true)) != 44) {
                    if (iY != 59) {
                        if (iY != 125) {
                            throw s0("Unterminated object");
                        }
                        this.f84390i = 2;
                        return 2;
                    }
                    m();
                }
                int iY3 = y(true);
                if (iY3 == 34) {
                    this.f84390i = 13;
                    return 13;
                }
                if (iY3 == 39) {
                    m();
                    this.f84390i = 12;
                    return 12;
                }
                if (iY3 == 125) {
                    if (i11 == 5) {
                        throw s0("Expected name");
                    }
                    this.f84390i = 2;
                    return 2;
                }
                m();
                this.f84386e--;
                if (!q((char) iY3)) {
                    throw s0("Expected name");
                }
                this.f84390i = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iY4 = y(true);
                if (iY4 != 58) {
                    if (iY4 != 61) {
                        throw s0("Expected ':'");
                    }
                    m();
                    if (this.f84386e < this.f84387f || p(1)) {
                        char[] cArr = this.f84385d;
                        int i12 = this.f84386e;
                        if (cArr[i12] == '>') {
                            this.f84386e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f84384c) {
                    n();
                }
                this.f84394m[this.f84395n - 1] = 7;
            } else if (i11 == 7) {
                if (y(false) == -1) {
                    this.f84390i = 17;
                    return 17;
                }
                m();
                this.f84386e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iY5 = y(true);
        if (iY5 == 34) {
            this.f84390i = 9;
            return 9;
        }
        if (iY5 == 39) {
            m();
            this.f84390i = 8;
            return 8;
        }
        if (iY5 != 44 && iY5 != 59) {
            if (iY5 == 91) {
                this.f84390i = 3;
                return 3;
            }
            if (iY5 != 93) {
                if (iY5 == 123) {
                    this.f84390i = 1;
                    return 1;
                }
                this.f84386e--;
                int iU = U();
                if (iU != 0) {
                    return iU;
                }
                int iV = V();
                if (iV != 0) {
                    return iV;
                }
                if (!q(this.f84385d[this.f84386e])) {
                    throw s0("Expected value");
                }
                m();
                this.f84390i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f84390i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw s0("Unexpected value");
        }
        m();
        this.f84386e--;
        this.f84390i = 7;
        return 7;
    }

    public b peek() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        switch (iO) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    String s() {
        return " at line " + (this.f84388g + 1) + " column " + ((this.f84386e - this.f84389h) + 1) + " path " + getPath();
    }

    public final void setLenient(boolean z10) {
        this.f84384c = z10;
    }

    public void skipValue() throws IOException {
        int i10 = 0;
        do {
            int iO = this.f84390i;
            if (iO == 0) {
                iO = o();
            }
            if (iO == 3) {
                W(1);
            } else if (iO == 1) {
                W(3);
            } else if (iO == 4 || iO == 2) {
                this.f84395n--;
                i10--;
                this.f84390i = 0;
            } else {
                if (iO == 14 || iO == 10) {
                    r0();
                } else if (iO == 8 || iO == 12) {
                    e0('\'');
                } else if (iO == 9 || iO == 13) {
                    e0('\"');
                } else if (iO == 16) {
                    this.f84386e += this.f84392k;
                }
                this.f84390i = 0;
            }
            i10++;
            this.f84390i = 0;
        } while (i10 != 0);
        int[] iArr = this.f84397p;
        int i11 = this.f84395n;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f84396o[i11 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public boolean w() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 5) {
            this.f84390i = 0;
            int[] iArr = this.f84397p;
            int i10 = this.f84395n - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iO == 6) {
            this.f84390i = 0;
            int[] iArr2 = this.f84397p;
            int i11 = this.f84395n - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + s());
    }

    public void z() throws IOException {
        int iO = this.f84390i;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 7) {
            this.f84390i = 0;
            int[] iArr = this.f84397p;
            int i10 = this.f84395n - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + s());
    }
}
