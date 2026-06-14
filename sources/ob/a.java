package ob;

import android.graphics.Bitmap;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import lb.e;
import lb.k;
import lb.s;
import lb.t;
import p9.a;
import q9.d0;
import q9.l;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f96677a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f96678b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1113a f96679c = new C1113a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f96680d;

    /* JADX INFO: renamed from: ob.a$a, reason: collision with other inner class name */
    private static final class C1113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f96681a = new d0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f96682b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f96683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f96684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f96685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f96686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f96687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f96688h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f96689i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(d0 d0Var, int i10) {
            int iK;
            if (i10 < 4) {
                return;
            }
            d0Var.X(3);
            int i11 = i10 - 4;
            if ((d0Var.H() & 128) != 0) {
                if (i11 < 7 || (iK = d0Var.K()) < 4) {
                    return;
                }
                this.f96688h = d0Var.P();
                this.f96689i = d0Var.P();
                this.f96681a.S(iK - 4);
                i11 = i10 - 11;
            }
            int iF = this.f96681a.f();
            int iG = this.f96681a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            d0Var.l(this.f96681a.e(), iF, iMin);
            this.f96681a.W(iF + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(d0 d0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f96684d = d0Var.P();
            this.f96685e = d0Var.P();
            d0Var.X(11);
            this.f96686f = d0Var.P();
            this.f96687g = d0Var.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(d0 d0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            d0Var.X(2);
            Arrays.fill(this.f96682b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = d0Var.H();
                int iH2 = d0Var.H();
                int iH3 = d0Var.H();
                int iH4 = d0Var.H();
                int iH5 = d0Var.H();
                double d10 = iH2;
                double d11 = iH3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                double d12 = iH4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                this.f96682b[iH] = (o0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iH5 << 24) | (o0.p((int) ((1.402d * d11) + d10), 0, 255) << 16) | o0.p((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f96683c = true;
        }

        public p9.a d() {
            int iH;
            if (this.f96684d == 0 || this.f96685e == 0 || this.f96688h == 0 || this.f96689i == 0 || this.f96681a.g() == 0 || this.f96681a.f() != this.f96681a.g() || !this.f96683c) {
                return null;
            }
            this.f96681a.W(0);
            int i10 = this.f96688h * this.f96689i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f96681a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f96682b[iH2];
                } else {
                    int iH3 = this.f96681a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f96681a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? this.f96682b[0] : this.f96682b[this.f96681a.H()]);
                    }
                }
                i11 = iH;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.f96688h, this.f96689i, Bitmap.Config.ARGB_8888)).k(this.f96686f / this.f96684d).l(0).h(this.f96687g / this.f96685e, 0).i(0).n(this.f96688h / this.f96684d).g(this.f96689i / this.f96685e).a();
        }

        public void h() {
            this.f96684d = 0;
            this.f96685e = 0;
            this.f96686f = 0;
            this.f96687g = 0;
            this.f96688h = 0;
            this.f96689i = 0;
            this.f96681a.S(0);
            this.f96683c = false;
        }
    }

    private static p9.a b(d0 d0Var, C1113a c1113a) {
        int iG = d0Var.g();
        int iH = d0Var.H();
        int iP = d0Var.P();
        int iF = d0Var.f() + iP;
        p9.a aVarD = null;
        if (iF > iG) {
            d0Var.W(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c1113a.g(d0Var, iP);
                    break;
                case 21:
                    c1113a.e(d0Var, iP);
                    break;
                case 22:
                    c1113a.f(d0Var, iP);
                    break;
            }
        } else {
            aVarD = c1113a.d();
            c1113a.h();
        }
        d0Var.W(iF);
        return aVarD;
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        this.f96677a.U(bArr, i11 + i10);
        this.f96677a.W(i10);
        if (this.f96680d == null) {
            this.f96680d = new Inflater();
        }
        if (o0.N0(this.f96677a, this.f96678b, this.f96680d)) {
            this.f96677a.U(this.f96678b.e(), this.f96678b.g());
        }
        this.f96679c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f96677a.a() >= 3) {
            p9.a aVarB = b(this.f96677a, this.f96679c);
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        lVar.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
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
