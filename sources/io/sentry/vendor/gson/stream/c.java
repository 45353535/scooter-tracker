package io.sentry.vendor.gson.stream;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f84398k = new String[128];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f84399l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Writer f84400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f84401c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f84402d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f84405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f84406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f84407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f84408j;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f84398k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f84398k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f84399l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        b0(6);
        this.f84404f = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.f84408j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f84400b = writer;
    }

    private void R() throws IOException {
        if (this.f84403e == null) {
            return;
        }
        this.f84400b.write(10);
        int i10 = this.f84402d;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f84400b.write(this.f84403e);
        }
    }

    private c V(int i10, char c10) throws IOException {
        n();
        b0(i10);
        this.f84400b.write(c10);
        return this;
    }

    private int W() {
        int i10 = this.f84402d;
        if (i10 != 0) {
            return this.f84401c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void b0(int i10) {
        int i11 = this.f84402d;
        int[] iArr = this.f84401c;
        if (i11 == iArr.length) {
            this.f84401c = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f84401c;
        int i12 = this.f84402d;
        this.f84402d = i12 + 1;
        iArr2[i12] = i10;
    }

    private void e0(int i10) {
        this.f84401c[this.f84402d - 1] = i10;
    }

    private void m() throws IOException {
        int iW = W();
        if (iW == 5) {
            this.f84400b.write(44);
        } else if (iW != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        R();
        e0(4);
    }

    private void n() throws IOException {
        int iW = W();
        if (iW == 1) {
            e0(2);
            R();
            return;
        }
        if (iW == 2) {
            this.f84400b.append(',');
            R();
        } else {
            if (iW == 4) {
                this.f84400b.append((CharSequence) this.f84404f);
                e0(5);
                return;
            }
            if (iW != 6) {
                if (iW != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f84405g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            e0(7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f84406h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f84399l
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f84398k
        L9:
            java.io.Writer r1 = r8.f84400b
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f84400b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f84400b
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f84400b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f84400b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.n0(java.lang.String):void");
    }

    private c q(int i10, int i11, char c10) throws IOException {
        int iW = W();
        if (iW != i11 && iW != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f84407i != null) {
            throw new IllegalStateException("Dangling name: " + this.f84407i);
        }
        this.f84402d--;
        if (iW == i11) {
            R();
        }
        this.f84400b.write(c10);
        return this;
    }

    private void z0() throws IOException {
        if (this.f84407i != null) {
            m();
            n0(this.f84407i);
            this.f84407i = null;
        }
    }

    public c M(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f84407i != null) {
            throw new IllegalStateException();
        }
        if (this.f84402d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f84407i = str;
        return this;
    }

    public c U() throws IOException {
        if (this.f84407i != null) {
            if (!this.f84408j) {
                this.f84407i = null;
                return this;
            }
            z0();
        }
        n();
        this.f84400b.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f84400b.close();
        int i10 = this.f84402d;
        if (i10 > 1 || (i10 == 1 && this.f84401c[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f84402d = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f84402d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f84400b.flush();
    }

    public final void i0(String str) {
        if (str == null || str.length() == 0) {
            this.f84403e = null;
            this.f84404f = StringUtils.PROCESS_POSTFIX_DELIMITER;
        } else {
            this.f84403e = str;
            this.f84404f = ": ";
        }
    }

    public c o() throws IOException {
        z0();
        return V(1, '[');
    }

    public c p() throws IOException {
        z0();
        return V(3, '{');
    }

    public c r0(double d10) throws IOException {
        z0();
        if (this.f84405g || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            n();
            this.f84400b.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c s() {
        return q(1, 2, ']');
    }

    public c s0(long j10) throws IOException {
        z0();
        n();
        this.f84400b.write(Long.toString(j10));
        return this;
    }

    public final void setLenient(boolean z10) {
        this.f84405g = z10;
    }

    public c t0(Boolean bool) throws IOException {
        if (bool == null) {
            return U();
        }
        z0();
        n();
        this.f84400b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c u0(Number number) throws IOException {
        if (number == null) {
            return U();
        }
        z0();
        String string = number.toString();
        if (this.f84405g || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            n();
            this.f84400b.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c w() {
        return q(3, 5, '}');
    }

    public c x0(String str) throws IOException {
        if (str == null) {
            return U();
        }
        z0();
        n();
        n0(str);
        return this;
    }

    public String y() {
        return this.f84403e;
    }

    public c y0(boolean z10) throws IOException {
        z0();
        n();
        this.f84400b.write(z10 ? "true" : "false");
        return this;
    }

    public c z(String str) throws IOException {
        if (str == null) {
            return U();
        }
        z0();
        n();
        this.f84400b.append((CharSequence) str);
        return this;
    }
}
