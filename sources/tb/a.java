package tb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.core.view.ViewCompat;
import com.google.common.collect.ImmutableList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import lb.e;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import q9.c0;
import q9.d0;
import q9.l;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f105033a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f105034b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f105035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f105036d;

    private static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f105038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f105039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int[] f105040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f105041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f105042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Rect f105043g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f105037a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f105044h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f105045i = -1;

        /* JADX INFO: renamed from: tb.a$b$a, reason: collision with other inner class name */
        private static final class C1309a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f105046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f105047b;

            private C1309a() {
            }
        }

        private static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, d0 d0Var, int i10) {
            while (d0Var.f() < i10 && d0Var.a() > 0) {
                switch (d0Var.H()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!g(iArr, d0Var)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!e(d0Var)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!f(d0Var)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!h(d0Var)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        private boolean e(d0 d0Var) {
            if (d0Var.a() < 2 || !this.f105039c) {
                return false;
            }
            int iH = d0Var.H();
            int iH2 = d0Var.H();
            int[] iArr = this.f105037a;
            iArr[3] = n(iArr[3], iH >> 4);
            int[] iArr2 = this.f105037a;
            iArr2[2] = n(iArr2[2], iH & 15);
            int[] iArr3 = this.f105037a;
            iArr3[1] = n(iArr3[1], iH2 >> 4);
            int[] iArr4 = this.f105037a;
            iArr4[0] = n(iArr4[0], iH2 & 15);
            return true;
        }

        private boolean f(d0 d0Var) {
            if (d0Var.a() < 6) {
                return false;
            }
            int iH = d0Var.H();
            int iH2 = d0Var.H();
            int i10 = (iH << 4) | (iH2 >> 4);
            int iH3 = ((iH2 & 15) << 8) | d0Var.H();
            int iH4 = d0Var.H();
            int iH5 = d0Var.H();
            this.f105043g = new Rect(i10, (iH4 << 4) | (iH5 >> 4), iH3 + 1, (d0Var.H() | ((iH5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, d0 d0Var) {
            if (d0Var.a() < 2) {
                return false;
            }
            int iH = d0Var.H();
            int iH2 = d0Var.H();
            this.f105037a[3] = b(iArr, iH >> 4);
            this.f105037a[2] = b(iArr, iH & 15);
            this.f105037a[1] = b(iArr, iH2 >> 4);
            this.f105037a[0] = b(iArr, iH2 & 15);
            this.f105039c = true;
            return true;
        }

        private boolean h(d0 d0Var) {
            if (d0Var.a() < 4) {
                return false;
            }
            this.f105044h = d0Var.P();
            this.f105045i = d0Var.P();
            return true;
        }

        private void j(c0 c0Var, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C1309a c1309a = new C1309a();
            while (true) {
                int i12 = 0;
                do {
                    k(c0Var, iWidth, c1309a);
                    int iMin = Math.min(c1309a.f105047b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f105037a[c1309a.f105046a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                c0Var.c();
            }
        }

        private static void k(c0 c0Var, int i10, C1309a c1309a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (c0Var.b() < 4) {
                    c1309a.f105046a = -1;
                    c1309a.f105047b = 0;
                    return;
                }
                iH = (iH << 4) | c0Var.h(4);
            }
            c1309a.f105046a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c1309a.f105047b = i10;
        }

        private static int n(int i10, int i11) {
            return (i10 & ViewCompat.MEASURED_SIZE_MASK) | ((i11 * 17) << 24);
        }

        public p9.a a(d0 d0Var) {
            Rect rect;
            if (this.f105040d == null || !this.f105038b || !this.f105039c || (rect = this.f105043g) == null || this.f105044h == -1 || this.f105045i == -1 || rect.width() < 2 || this.f105043g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f105043g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            c0 c0Var = new c0();
            d0Var.W(this.f105044h);
            c0Var.m(d0Var);
            j(c0Var, true, rect2, iArr);
            d0Var.W(this.f105045i);
            c0Var.m(d0Var);
            j(c0Var, false, rect2, iArr);
            return new a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f105041e).l(0).h(rect2.top / this.f105042f, 0).i(0).n(rect2.width() / this.f105041e).g(rect2.height() / this.f105042f).a();
        }

        public void i(String str) {
            for (String str2 : o0.j1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrJ1 = o0.j1(str2.substring(9), StringUtils.COMMA);
                    this.f105040d = new int[strArrJ1.length];
                    for (int i10 = 0; i10 < strArrJ1.length; i10++) {
                        this.f105040d[i10] = c(strArrJ1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrJ12 = o0.j1(str2.substring(6).trim(), "x");
                    if (strArrJ12.length == 2) {
                        try {
                            this.f105041e = Integer.parseInt(strArrJ12[0]);
                            this.f105042f = Integer.parseInt(strArrJ12[1]);
                            this.f105038b = true;
                        } catch (RuntimeException e10) {
                            u.i("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public void l(d0 d0Var) {
            int[] iArr = this.f105040d;
            if (iArr == null || !this.f105038b) {
                return;
            }
            d0Var.X(d0Var.P() - 2);
            d(iArr, d0Var, d0Var.P());
        }

        public void m() {
            this.f105039c = false;
            this.f105043g = null;
            this.f105044h = -1;
            this.f105045i = -1;
        }
    }

    public a(List list) {
        b bVar = new b();
        this.f105035c = bVar;
        bVar.i(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    private p9.a b() {
        if (this.f105036d == null) {
            this.f105036d = new Inflater();
        }
        if (o0.N0(this.f105033a, this.f105034b, this.f105036d)) {
            this.f105033a.U(this.f105034b.e(), this.f105034b.g());
        }
        this.f105035c.m();
        int iA = this.f105033a.a();
        if (iA < 2 || this.f105033a.P() != iA) {
            return null;
        }
        this.f105035c.l(this.f105033a);
        return this.f105035c.a(this.f105033a);
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        this.f105033a.U(bArr, i11 + i10);
        this.f105033a.W(i10);
        p9.a aVarB = b();
        lVar.accept(new e(aVarB != null ? ImmutableList.of(aVarB) : ImmutableList.of(), -9223372036854775807L, 5000000L));
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // lb.t
    public /* synthetic */ k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return s.a(this, bArr, i10, i11);
    }

    @Override // lb.t
    public /* synthetic */ void reset() {
        s.b(this);
    }
}
