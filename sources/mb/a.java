package mb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lb.k;
import lb.p;
import lb.q;
import p9.a;
import q9.d0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f94756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f94757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f94758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f94759l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f94762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f94763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f94764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f94765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f94766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f94767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f94768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f94769v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f94771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f94772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f94754z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    private static final int[] E = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    private static final int[] F = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f94755h = new d0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f94760m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1088a f94761n = new C1088a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f94770w = 0;

    /* JADX INFO: renamed from: mb.a$a, reason: collision with other inner class name */
    private static final class C1088a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f94773a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f94774b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f94775c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f94776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f94777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f94778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f94779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94780h;

        /* JADX INFO: renamed from: mb.a$a$a, reason: collision with other inner class name */
        private static class C1089a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f94781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f94782b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f94783c;

            public C1089a(int i10, boolean z10, int i11) {
                this.f94781a = i10;
                this.f94782b = z10;
                this.f94783c = i11;
            }
        }

        public C1088a(int i10, int i11) {
            j(i10);
            this.f94780h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f94775c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f94773a.size()) {
                C1089a c1089a = (C1089a) this.f94773a.get(i14);
                boolean z11 = c1089a.f94782b;
                int i16 = c1089a.f94781a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c1089a.f94783c;
                i14++;
                if (i17 != (i14 < this.f94773a.size() ? ((C1089a) this.f94773a.get(i14)).f94783c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f94775c.length() < 32) {
                this.f94775c.append(c10);
            }
        }

        public void f() {
            int length = this.f94775c.length();
            if (length > 0) {
                this.f94775c.delete(length - 1, length);
                for (int size = this.f94773a.size() - 1; size >= 0; size--) {
                    C1089a c1089a = (C1089a) this.f94773a.get(size);
                    int i10 = c1089a.f94783c;
                    if (i10 != length) {
                        return;
                    }
                    c1089a.f94783c = i10 - 1;
                }
            }
        }

        public p9.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f94774b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f94774b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f94777e + this.f94778f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f94779g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f94779g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f94776d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f94779g == 1) {
                i14 -= this.f94780h - 1;
            }
            return new a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f94773a.isEmpty() && this.f94774b.isEmpty() && this.f94775c.length() == 0;
        }

        public void j(int i10) {
            this.f94779g = i10;
            this.f94773a.clear();
            this.f94774b.clear();
            this.f94775c.setLength(0);
            this.f94776d = 15;
            this.f94777e = 0;
            this.f94778f = 0;
        }

        public void k() {
            this.f94774b.add(h());
            this.f94775c.setLength(0);
            this.f94773a.clear();
            int iMin = Math.min(this.f94780h, this.f94776d);
            while (this.f94774b.size() >= iMin) {
                this.f94774b.remove(0);
            }
        }

        public void l(int i10) {
            this.f94779g = i10;
        }

        public void m(int i10) {
            this.f94780h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f94773a.add(new C1089a(i10, z10, this.f94775c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            q9.a.a(j10 >= 16000);
            this.f94759l = j10 * 1000;
        } else {
            this.f94759l = -9223372036854775807L;
        }
        this.f94756i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f94758k = 0;
            this.f94757j = 0;
        } else if (i10 == 2) {
            this.f94758k = 1;
            this.f94757j = 0;
        } else if (i10 == 3) {
            this.f94758k = 0;
            this.f94757j = 1;
        } else if (i10 != 4) {
            u.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f94758k = 0;
            this.f94757j = 0;
        } else {
            this.f94758k = 1;
            this.f94757j = 1;
        }
        J(0);
        I();
        this.f94771x = true;
        this.f94772y = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean B(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean C(boolean z10, byte b10, byte b11) {
        if (!z10 || !B(b10)) {
            this.f94767t = false;
        } else {
            if (this.f94767t && this.f94768u == b10 && this.f94769v == b11) {
                this.f94767t = false;
                return true;
            }
            this.f94767t = true;
            this.f94768u = b10;
            this.f94769v = b11;
        }
        return false;
    }

    private static boolean D(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean G(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void H(byte b10, byte b11) {
        if (G(b10)) {
            this.f94771x = false;
            return;
        }
        if (D(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f94771x = false;
                                break;
                        }
                        return;
                }
            }
            this.f94771x = true;
        }
    }

    private void I() {
        this.f94761n.j(this.f94764q);
        this.f94760m.clear();
        this.f94760m.add(this.f94761n);
    }

    private void J(int i10) {
        int i11 = this.f94764q;
        if (i11 == i10) {
            return;
        }
        this.f94764q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f94760m.size(); i12++) {
                ((C1088a) this.f94760m.get(i12)).l(i10);
            }
            return;
        }
        I();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f94762o = Collections.EMPTY_LIST;
        }
    }

    private void K(int i10) {
        this.f94765r = i10;
        this.f94761n.m(i10);
    }

    private boolean L() {
        return (this.f94759l == -9223372036854775807L || this.f94772y == -9223372036854775807L || g() - this.f94772y < this.f94759l) ? false : true;
    }

    private boolean M(byte b10) {
        if (w(b10)) {
            this.f94770w = n(b10);
        }
        return this.f94770w == this.f94758k;
    }

    private static char m(byte b10) {
        return (char) C[(b10 & Ascii.DEL) - 32];
    }

    private static int n(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List o() {
        int size = this.f94760m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            p9.a aVarG = ((C1088a) this.f94760m.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f98085i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            p9.a aVar = (p9.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f98085i != iMin) {
                    aVar = (p9.a) q9.a.e(((C1088a) this.f94760m.get(i11)).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char p(byte b10) {
        return (char) E[b10 & Ascii.US];
    }

    private static char q(byte b10) {
        return (char) F[b10 & Ascii.US];
    }

    private static char r(byte b10, byte b11) {
        return (b10 & 1) == 0 ? p(b11) : q(b11);
    }

    private static char s(byte b10) {
        return (char) D[b10 & Ascii.SI];
    }

    private void t(byte b10) {
        this.f94761n.e(' ');
        this.f94761n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void u(byte b10) {
        if (b10 == 32) {
            J(2);
            return;
        }
        if (b10 == 41) {
            J(3);
            return;
        }
        switch (b10) {
            case 37:
                J(1);
                K(2);
                break;
            case 38:
                J(1);
                K(3);
                break;
            case 39:
                J(1);
                K(4);
                break;
            default:
                int i10 = this.f94764q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f94762o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    I();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f94761n.i()) {
                                    this.f94761n.k();
                                    break;
                                }
                                break;
                            case 46:
                                I();
                                break;
                            case 47:
                                this.f94762o = o();
                                I();
                                break;
                        }
                    } else {
                        this.f94761n.f();
                        break;
                    }
                }
                break;
        }
    }

    private void v(byte b10, byte b11) {
        int i10 = f94754z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f94761n.f94776d) {
            if (this.f94764q != 1 && !this.f94761n.i()) {
                C1088a c1088a = new C1088a(this.f94764q, this.f94765r);
                this.f94761n = c1088a;
                this.f94760m.add(c1088a);
            }
            this.f94761n.f94776d = i10;
        }
        boolean z10 = (b11 & Ascii.DLE) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f94761n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f94761n.f94777e = A[i11];
        }
    }

    private static boolean w(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean x(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean y(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean z(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    @Override // mb.e
    protected k b() {
        List list = this.f94762o;
        this.f94763p = list;
        return new f((List) q9.a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // mb.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void c(lb.p r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.c(lb.p):void");
    }

    @Override // mb.e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ p dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // mb.e, t9.d, ca.c
    /* JADX INFO: renamed from: e */
    public q dequeueOutputBuffer() {
        q qVarF;
        q qVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (qVarDequeueOutputBuffer != null) {
            return qVarDequeueOutputBuffer;
        }
        if (!L() || (qVarF = f()) == null) {
            return null;
        }
        this.f94762o = Collections.EMPTY_LIST;
        this.f94772y = -9223372036854775807L;
        qVarF.m(g(), b(), Long.MAX_VALUE);
        return qVarF;
    }

    @Override // mb.e, t9.d
    public void flush() {
        super.flush();
        this.f94762o = null;
        this.f94763p = null;
        J(0);
        K(4);
        I();
        this.f94766s = false;
        this.f94767t = false;
        this.f94768u = (byte) 0;
        this.f94769v = (byte) 0;
        this.f94770w = 0;
        this.f94771x = true;
        this.f94772y = -9223372036854775807L;
    }

    @Override // mb.e
    protected boolean h() {
        return this.f94762o != this.f94763p;
    }

    @Override // mb.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void queueInputBuffer(p pVar) {
        super.queueInputBuffer(pVar);
    }

    @Override // mb.e, lb.l
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    @Override // mb.e, t9.d
    public void release() {
    }
}
