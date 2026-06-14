package mb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.material.TextFieldImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.WorkInfo;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lb.k;
import lb.p;
import lb.q;
import mb.c;
import p9.a;
import q9.c0;
import q9.d0;
import q9.i;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f94784h = new d0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f94785i = new c0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f94786j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f94787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f94788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f94789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f94790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f94791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f94792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1090c f94793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f94794r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f94795c = new Comparator() { // from class: mb.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f94797b, ((c.a) obj).f94797b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p9.a f94796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94797b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b bVarN = new a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f94796a = bVarN.a();
            this.f94797b = i14;
        }
    }

    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f94798v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f94799w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f94800x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f94801y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f94802z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f94803a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f94804b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f94805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f94806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f94807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f94809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f94811i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f94812j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f94813k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f94814l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f94815m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f94816n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f94817o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f94818p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f94819q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f94820r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f94821s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f94822t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f94823u;

        static {
            int iH = h(0, 0, 0, 0);
            f94799w = iH;
            int iH2 = h(0, 0, 0, 3);
            f94800x = iH2;
            f94801y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f94802z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                q9.a.c(r4, r0, r1)
                q9.a.c(r5, r0, r1)
                q9.a.c(r6, r0, r1)
                q9.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: mb.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f94804b.append(c10);
                return;
            }
            this.f94803a.add(d());
            this.f94804b.clear();
            if (this.f94817o != -1) {
                this.f94817o = 0;
            }
            if (this.f94818p != -1) {
                this.f94818p = 0;
            }
            if (this.f94819q != -1) {
                this.f94819q = 0;
            }
            if (this.f94821s != -1) {
                this.f94821s = 0;
            }
            while (true) {
                if (this.f94803a.size() < this.f94812j && this.f94803a.size() < 15) {
                    this.f94823u = this.f94803a.size();
                    return;
                }
                this.f94803a.remove(0);
            }
        }

        public void b() {
            int length = this.f94804b.length();
            if (length > 0) {
                this.f94804b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            float f12;
            int i11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f94803a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f94803a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i13 = this.f94813k;
            int i14 = 2;
            if (i13 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f94813k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f94808f) {
                f10 = this.f94810h / 99.0f;
                f11 = this.f94809g / 99.0f;
            } else {
                f10 = this.f94810h / 209.0f;
                f11 = this.f94809g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f94811i;
            if (i15 / 3 == 0) {
                i10 = i15;
                f12 = f13;
                i11 = 0;
            } else if (i15 / 3 == 1) {
                i10 = i15;
                f12 = f13;
                i11 = 1;
            } else {
                i10 = i15;
                f12 = f13;
                i11 = 2;
            }
            if (i10 % 3 == 0) {
                i14 = 0;
            } else if (i10 % 3 == 1) {
                i14 = 1;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, this.f94816n != f94799w, this.f94816n, this.f94807e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f94804b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f94817o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f94817o, length, 33);
                }
                if (this.f94818p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f94818p, length, 33);
                }
                if (this.f94819q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f94820r), this.f94819q, length, 33);
                }
                if (this.f94821s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f94822t), this.f94821s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f94803a.clear();
            this.f94804b.clear();
            this.f94817o = -1;
            this.f94818p = -1;
            this.f94819q = -1;
            this.f94821s = -1;
            this.f94823u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f94805c = true;
            this.f94806d = z10;
            this.f94807e = i10;
            this.f94808f = z11;
            this.f94809g = i11;
            this.f94810h = i12;
            this.f94811i = i14;
            int i17 = i13 + 1;
            if (this.f94812j != i17) {
                this.f94812j = i17;
                while (true) {
                    if (this.f94803a.size() < this.f94812j && this.f94803a.size() < 15) {
                        break;
                    } else {
                        this.f94803a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f94814l != i15) {
                this.f94814l = i15;
                int i18 = i15 - 1;
                q(C[i18], f94800x, B[i18], 0, f94802z[i18], A[i18], f94801y[i18]);
            }
            if (i16 == 0 || this.f94815m == i16) {
                return;
            }
            this.f94815m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, E[i19], D[i19]);
            n(f94798v, F[i19], f94799w);
        }

        public boolean i() {
            return this.f94805c;
        }

        public boolean j() {
            if (i()) {
                return this.f94803a.isEmpty() && this.f94804b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f94806d;
        }

        public void l() {
            e();
            this.f94805c = false;
            this.f94806d = false;
            this.f94807e = 4;
            this.f94808f = false;
            this.f94809g = 0;
            this.f94810h = 0;
            this.f94811i = 0;
            this.f94812j = 15;
            this.f94813k = 0;
            this.f94814l = 0;
            this.f94815m = 0;
            int i10 = f94799w;
            this.f94816n = i10;
            this.f94820r = f94798v;
            this.f94822t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f94817o != -1) {
                if (!z10) {
                    this.f94804b.setSpan(new StyleSpan(2), this.f94817o, this.f94804b.length(), 33);
                    this.f94817o = -1;
                }
            } else if (z10) {
                this.f94817o = this.f94804b.length();
            }
            if (this.f94818p == -1) {
                if (z11) {
                    this.f94818p = this.f94804b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f94804b.setSpan(new UnderlineSpan(), this.f94818p, this.f94804b.length(), 33);
                this.f94818p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f94819q != -1 && this.f94820r != i10) {
                this.f94804b.setSpan(new ForegroundColorSpan(this.f94820r), this.f94819q, this.f94804b.length(), 33);
            }
            if (i10 != f94798v) {
                this.f94819q = this.f94804b.length();
                this.f94820r = i10;
            }
            if (this.f94821s != -1 && this.f94822t != i11) {
                this.f94804b.setSpan(new BackgroundColorSpan(this.f94822t), this.f94821s, this.f94804b.length(), 33);
            }
            if (i11 != f94799w) {
                this.f94821s = this.f94804b.length();
                this.f94822t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f94823u != i10) {
                a('\n');
            }
            this.f94823u = i10;
        }

        public void p(boolean z10) {
            this.f94806d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f94816n = i10;
            this.f94813k = i15;
        }
    }

    /* JADX INFO: renamed from: mb.c$c, reason: collision with other inner class name */
    private static final class C1090c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f94824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f94826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f94827d = 0;

        public C1090c(int i10, int i11) {
            this.f94824a = i10;
            this.f94825b = i11;
            this.f94826c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List list) {
        this.f94788l = i10 == -1 ? 1 : i10;
        this.f94787k = list != null && i.v(list);
        this.f94789m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f94789m[i11] = new b();
        }
        this.f94790n = this.f94789m[0];
    }

    private void A() {
        C1090c c1090c = this.f94793q;
        if (c1090c.f94827d != (c1090c.f94825b * 2) - 1) {
            u.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f94793q.f94825b * 2) - 1) + ", but current index is " + this.f94793q.f94827d + " (sequence number " + this.f94793q.f94824a + ");");
        }
        c0 c0Var = this.f94785i;
        C1090c c1090c2 = this.f94793q;
        c0Var.o(c1090c2.f94826c, c1090c2.f94827d);
        boolean z10 = false;
        while (true) {
            if (this.f94785i.b() <= 0) {
                break;
            }
            int iH = this.f94785i.h(3);
            int iH2 = this.f94785i.h(5);
            if (iH == 7) {
                this.f94785i.r(2);
                iH = this.f94785i.h(6);
                if (iH < 7) {
                    u.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    u.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f94788l) {
                this.f94785i.s(iH2);
            } else {
                int iE = this.f94785i.e() + (iH2 * 8);
                while (this.f94785i.e() < iE) {
                    int iH3 = this.f94785i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f94785i.h(8);
                        if (iH4 <= 31) {
                            p(iH4);
                        } else {
                            if (iH4 <= 127) {
                                u(iH4);
                            } else if (iH4 <= 159) {
                                q(iH4);
                            } else if (iH4 <= 255) {
                                v(iH4);
                            } else {
                                u.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        n(iH3);
                    } else {
                        if (iH3 <= 127) {
                            s(iH3);
                        } else if (iH3 <= 159) {
                            o(iH3);
                        } else if (iH3 <= 255) {
                            t(iH3);
                        } else {
                            u.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f94791o = m();
        }
    }

    private void B() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f94789m[i10].l();
        }
    }

    private void l() {
        if (this.f94793q == null) {
            return;
        }
        A();
        this.f94793q = null;
    }

    private List m() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f94789m[i10].j() && this.f94789m[i10].k() && (aVarC = this.f94789m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f94795c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f94796a);
        }
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    private void n(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f94791o = m();
                return;
            }
            if (i10 == 8) {
                this.f94790n.b();
                return;
            }
            switch (i10) {
                case 12:
                    B();
                    break;
                case 13:
                    this.f94790n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        u.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f94785i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        u.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f94785i.r(16);
                    } else {
                        u.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void o(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                int i12 = i10 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                if (this.f94794r != i12) {
                    this.f94794r = i12;
                    this.f94790n = this.f94789m[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f94785i.g()) {
                        this.f94789m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f94785i.g()) {
                        this.f94789m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f94785i.g()) {
                        this.f94789m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f94785i.g()) {
                        this.f94789m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f94785i.g()) {
                        this.f94789m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f94785i.r(8);
                break;
            case 142:
                break;
            case 143:
                B();
                break;
            case 144:
                if (this.f94790n.i()) {
                    w();
                } else {
                    this.f94785i.r(16);
                }
                break;
            case 145:
                if (this.f94790n.i()) {
                    x();
                } else {
                    this.f94785i.r(24);
                }
                break;
            case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                if (this.f94790n.i()) {
                    y();
                } else {
                    this.f94785i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case TextFieldImplKt.AnimationDuration /* 150 */:
            default:
                u.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f94790n.i()) {
                    z();
                } else {
                    this.f94785i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                r(i15);
                if (this.f94794r != i15) {
                    this.f94794r = i15;
                    this.f94790n = this.f94789m[i15];
                }
                break;
        }
    }

    private void p(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f94785i.r(8);
        } else if (i10 <= 23) {
            this.f94785i.r(16);
        } else if (i10 <= 31) {
            this.f94785i.r(24);
        }
    }

    private void q(int i10) {
        if (i10 <= 135) {
            this.f94785i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f94785i.r(40);
        } else if (i10 <= 159) {
            this.f94785i.r(2);
            this.f94785i.r(this.f94785i.h(6) * 8);
        }
    }

    private void r(int i10) {
        b bVar = this.f94789m[i10];
        this.f94785i.r(2);
        boolean zG = this.f94785i.g();
        this.f94785i.r(2);
        int iH = this.f94785i.h(3);
        boolean zG2 = this.f94785i.g();
        int iH2 = this.f94785i.h(7);
        int iH3 = this.f94785i.h(8);
        int iH4 = this.f94785i.h(4);
        int iH5 = this.f94785i.h(4);
        this.f94785i.r(2);
        this.f94785i.r(6);
        this.f94785i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f94785i.h(3), this.f94785i.h(3));
    }

    private void s(int i10) {
        if (i10 == 127) {
            this.f94790n.a((char) 9835);
        } else {
            this.f94790n.a((char) (i10 & 255));
        }
    }

    private void t(int i10) {
        this.f94790n.a((char) (i10 & 255));
    }

    private void u(int i10) {
        if (i10 == 32) {
            this.f94790n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f94790n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f94790n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f94790n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f94790n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f94790n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f94790n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f94790n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f94790n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f94790n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f94790n.a((char) 9608);
                break;
            case 49:
                this.f94790n.a((char) 8216);
                break;
            case 50:
                this.f94790n.a((char) 8217);
                break;
            case 51:
                this.f94790n.a((char) 8220);
                break;
            case 52:
                this.f94790n.a((char) 8221);
                break;
            case 53:
                this.f94790n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f94790n.a((char) 8539);
                        break;
                    case 119:
                        this.f94790n.a((char) 8540);
                        break;
                    case 120:
                        this.f94790n.a((char) 8541);
                        break;
                    case 121:
                        this.f94790n.a((char) 8542);
                        break;
                    case 122:
                        this.f94790n.a((char) 9474);
                        break;
                    case 123:
                        this.f94790n.a((char) 9488);
                        break;
                    case 124:
                        this.f94790n.a((char) 9492);
                        break;
                    case 125:
                        this.f94790n.a((char) 9472);
                        break;
                    case 126:
                        this.f94790n.a((char) 9496);
                        break;
                    case 127:
                        this.f94790n.a((char) 9484);
                        break;
                    default:
                        u.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    private void v(int i10) {
        if (i10 == 160) {
            this.f94790n.a((char) 13252);
            return;
        }
        u.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f94790n.a('_');
    }

    private void w() {
        this.f94790n.m(this.f94785i.h(4), this.f94785i.h(2), this.f94785i.h(2), this.f94785i.g(), this.f94785i.g(), this.f94785i.h(3), this.f94785i.h(3));
    }

    private void x() {
        int iH = b.h(this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2));
        int iH2 = b.h(this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2));
        this.f94785i.r(2);
        this.f94790n.n(iH, iH2, b.g(this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2)));
    }

    private void y() {
        this.f94785i.r(4);
        int iH = this.f94785i.h(4);
        this.f94785i.r(2);
        this.f94790n.o(iH, this.f94785i.h(6));
    }

    private void z() {
        int iH = b.h(this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2));
        int iH2 = this.f94785i.h(2);
        int iG = b.g(this.f94785i.h(2), this.f94785i.h(2), this.f94785i.h(2));
        if (this.f94785i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f94785i.g();
        int iH3 = this.f94785i.h(2);
        int iH4 = this.f94785i.h(2);
        int iH5 = this.f94785i.h(2);
        this.f94785i.r(8);
        this.f94790n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @Override // mb.e
    protected k b() {
        List list = this.f94791o;
        this.f94792p = list;
        return new f((List) q9.a.e(list));
    }

    @Override // mb.e
    protected void c(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(pVar.f104988e);
        this.f94784h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f94784h.a() >= 3) {
            int iH = this.f94784h.H();
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f94784h.H();
            byte bH2 = (byte) this.f94784h.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        l();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f94786j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            B();
                            u.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f94786j + " current=" + i11);
                        }
                        this.f94786j = i11;
                        int i13 = bH & Utf8.REPLACEMENT_BYTE;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C1090c c1090c = new C1090c(i11, i13);
                        this.f94793q = c1090c;
                        byte[] bArr = c1090c.f94826c;
                        int i14 = c1090c.f94827d;
                        c1090c.f94827d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        q9.a.a(i10 == 2);
                        C1090c c1090c2 = this.f94793q;
                        if (c1090c2 == null) {
                            u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c1090c2.f94826c;
                            int i15 = c1090c2.f94827d;
                            int i16 = i15 + 1;
                            c1090c2.f94827d = i16;
                            bArr2[i15] = bH;
                            c1090c2.f94827d = i15 + 2;
                            bArr2[i16] = bH2;
                        }
                    }
                    C1090c c1090c3 = this.f94793q;
                    if (c1090c3.f94827d == (c1090c3.f94825b * 2) - 1) {
                        l();
                    }
                }
            }
        }
    }

    @Override // mb.e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ p dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // mb.e
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ q dequeueOutputBuffer() {
        return super.dequeueOutputBuffer();
    }

    @Override // mb.e, t9.d
    public void flush() {
        super.flush();
        this.f94791o = null;
        this.f94792p = null;
        this.f94794r = 0;
        this.f94790n = this.f94789m[0];
        B();
        this.f94793q = null;
    }

    @Override // mb.e
    protected boolean h() {
        return this.f94791o != this.f94792p;
    }

    @Override // mb.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void queueInputBuffer(p pVar) {
        super.queueInputBuffer(pVar);
    }

    @Override // mb.e, t9.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // mb.e, lb.l
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
