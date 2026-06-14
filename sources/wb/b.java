package wb;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import io.bidmachine.media3.common.a;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.l0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.w;
import oa.w0;
import oa.x;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f107836h = new x() { // from class: wb.a
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return b.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oa.t f107837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f107838b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC1325b f107841e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107839c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f107840d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f107842f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f107843g = -1;

    private static final class a implements InterfaceC1325b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f107844m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f107845n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final oa.t f107846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f107847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wb.c f107848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f107849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f107850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f107851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f107852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final io.bidmachine.media3.common.a f107853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f107854i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f107855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f107856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f107857l;

        public a(oa.t tVar, s0 s0Var, wb.c cVar) throws n9.x {
            this.f107846a = tVar;
            this.f107847b = s0Var;
            this.f107848c = cVar;
            int iMax = Math.max(1, cVar.f107868c / 10);
            this.f107852g = iMax;
            d0 d0Var = new d0(cVar.f107872g);
            d0Var.z();
            int iZ = d0Var.z();
            this.f107849d = iZ;
            int i10 = cVar.f107867b;
            int i11 = (((cVar.f107870e - (i10 * 4)) * 8) / (cVar.f107871f * i10)) + 1;
            if (iZ == i11) {
                int iK = o0.k(iMax, iZ);
                this.f107850e = new byte[cVar.f107870e * iK];
                this.f107851f = new d0(iK * f(iZ, i10));
                int i12 = ((cVar.f107868c * cVar.f107870e) * 8) / iZ;
                this.f107853h = new a.b().u0("audio/raw").Q(i12).p0(i12).k0(f(iMax, i10)).R(cVar.f107867b).v0(cVar.f107868c).o0(2).N();
                return;
            }
            throw n9.x.a("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }

        private void b(byte[] bArr, int i10, d0 d0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f107848c.f107867b; i12++) {
                    c(bArr, i11, i12, d0Var.e());
                }
            }
            int iE = e(this.f107849d * i10);
            d0Var.W(0);
            d0Var.V(iE);
        }

        private void c(byte[] bArr, int i10, int i11, byte[] bArr2) {
            wb.c cVar = this.f107848c;
            int i12 = cVar.f107870e;
            int i13 = cVar.f107867b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iP = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f107845n[iMin];
            int i18 = ((i10 * this.f107849d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iP & 255);
            bArr2[i18 + 1] = (byte) (iP >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & Ascii.SI : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iP = o0.p(iP + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iP & 255);
                bArr2[i18 + 1] = (byte) (iP >> 8);
                int i22 = iMin + f107844m[i20];
                int[] iArr = f107845n;
                iMin = o0.p(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int d(int i10) {
            return i10 / (this.f107848c.f107867b * 2);
        }

        private int e(int i10) {
            return f(i10, this.f107848c.f107867b);
        }

        private static int f(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void g(int i10) {
            long jC1 = this.f107855j + o0.c1(this.f107857l, 1000000L, this.f107848c.f107868c);
            int iE = e(i10);
            this.f107847b.e(jC1, 1, iE, this.f107856k - iE, null);
            this.f107857l += (long) i10;
            this.f107856k -= iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // wb.b.InterfaceC1325b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(oa.s r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f107852g
                int r1 = r6.f107856k
                int r1 = r6.d(r1)
                int r0 = r0 - r1
                int r1 = r6.f107849d
                int r0 = q9.o0.k(r0, r1)
                wb.c r1 = r6.f107848c
                int r1 = r1.f107870e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f107854i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f107850e
                int r5 = r6.f107854i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f107854i
                int r4 = r4 + r3
                r6.f107854i = r4
                goto L1e
            L3e:
                int r7 = r6.f107854i
                wb.c r8 = r6.f107848c
                int r8 = r8.f107870e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f107850e
                q9.d0 r9 = r6.f107851f
                r6.b(r8, r7, r9)
                int r8 = r6.f107854i
                wb.c r9 = r6.f107848c
                int r9 = r9.f107870e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f107854i = r8
                q9.d0 r7 = r6.f107851f
                int r7 = r7.g()
                oa.s0 r8 = r6.f107847b
                q9.d0 r9 = r6.f107851f
                r8.c(r9, r7)
                int r8 = r6.f107856k
                int r8 = r8 + r7
                r6.f107856k = r8
                int r7 = r6.d(r8)
                int r8 = r6.f107852g
                if (r7 < r8) goto L75
                r6.g(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f107856k
                int r7 = r6.d(r7)
                if (r7 <= 0) goto L82
                r6.g(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wb.b.a.a(oa.s, long):boolean");
        }

        @Override // wb.b.InterfaceC1325b
        public void init(int i10, long j10) {
            e eVar = new e(this.f107848c, this.f107849d, i10, j10);
            this.f107846a.e(eVar);
            this.f107847b.f(this.f107853h);
            this.f107847b.d(eVar.getDurationUs());
        }

        @Override // wb.b.InterfaceC1325b
        public void reset(long j10) {
            this.f107854i = 0;
            this.f107855j = j10;
            this.f107856k = 0;
            this.f107857l = 0L;
        }
    }

    /* JADX INFO: renamed from: wb.b$b, reason: collision with other inner class name */
    private interface InterfaceC1325b {
        boolean a(s sVar, long j10);

        void init(int i10, long j10);

        void reset(long j10);
    }

    private static final class c implements InterfaceC1325b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final oa.t f107858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f107859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wb.c f107860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.bidmachine.media3.common.a f107861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f107862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f107863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f107864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f107865h;

        public c(oa.t tVar, s0 s0Var, wb.c cVar, String str, int i10) throws n9.x {
            this.f107858a = tVar;
            this.f107859b = s0Var;
            this.f107860c = cVar;
            int i11 = (cVar.f107867b * cVar.f107871f) / 8;
            if (cVar.f107870e == i11) {
                int i12 = cVar.f107868c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f107862e = iMax;
                this.f107861d = new a.b().U("audio/wav").u0(str).Q(i13).p0(i13).k0(iMax).R(cVar.f107867b).v0(cVar.f107868c).o0(i10).N();
                return;
            }
            throw n9.x.a("Expected block size: " + i11 + "; got: " + cVar.f107870e, null);
        }

        @Override // wb.b.InterfaceC1325b
        public boolean a(s sVar, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f107864g) < (i11 = this.f107862e)) {
                int iB = this.f107859b.b(sVar, (int) Math.min(i11 - i10, j11), true);
                if (iB == -1) {
                    j11 = 0;
                } else {
                    this.f107864g += iB;
                    j11 -= (long) iB;
                }
            }
            int i12 = this.f107860c.f107870e;
            int i13 = this.f107864g / i12;
            if (i13 > 0) {
                long jC1 = this.f107863f + o0.c1(this.f107865h, 1000000L, r1.f107868c);
                int i14 = i13 * i12;
                int i15 = this.f107864g - i14;
                this.f107859b.e(jC1, 1, i14, i15, null);
                this.f107865h += (long) i13;
                this.f107864g = i15;
            }
            return j11 <= 0;
        }

        @Override // wb.b.InterfaceC1325b
        public void init(int i10, long j10) {
            e eVar = new e(this.f107860c, 1, i10, j10);
            this.f107858a.e(eVar);
            this.f107859b.f(this.f107861d);
            this.f107859b.d(eVar.getDurationUs());
        }

        @Override // wb.b.InterfaceC1325b
        public void reset(long j10) {
            this.f107863f = j10;
            this.f107864g = 0;
            this.f107865h = 0L;
        }
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new b()};
    }

    private void e() {
        q9.a.i(this.f107838b);
        o0.i(this.f107837a);
    }

    private void f(s sVar) throws n9.x {
        q9.a.g(sVar.getPosition() == 0);
        int i10 = this.f107842f;
        if (i10 != -1) {
            sVar.skipFully(i10);
            this.f107839c = 4;
        } else {
            if (!d.a(sVar)) {
                throw n9.x.a("Unsupported or unrecognized wav file type.", null);
            }
            sVar.skipFully((int) (sVar.getPeekPosition() - sVar.getPosition()));
            this.f107839c = 1;
        }
    }

    private void g(s sVar) throws n9.x {
        wb.c cVarB = d.b(sVar);
        int i10 = cVarB.f107866a;
        if (i10 == 17) {
            this.f107841e = new a(this.f107837a, this.f107838b, cVarB);
        } else if (i10 == 6) {
            this.f107841e = new c(this.f107837a, this.f107838b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f107841e = new c(this.f107837a, this.f107838b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = w0.a(i10, cVarB.f107871f);
            if (iA == 0) {
                throw n9.x.d("Unsupported WAV format type: " + cVarB.f107866a);
            }
            this.f107841e = new c(this.f107837a, this.f107838b, cVarB, "audio/raw", iA);
        }
        this.f107839c = 3;
    }

    private void h(s sVar) {
        this.f107840d = d.c(sVar);
        this.f107839c = 2;
    }

    private int i(s sVar) {
        q9.a.g(this.f107843g != -1);
        return ((InterfaceC1325b) q9.a.e(this.f107841e)).a(sVar, this.f107843g - sVar.getPosition()) ? -1 : 0;
    }

    private void j(s sVar) throws n9.x {
        Pair pairE = d.e(sVar);
        this.f107842f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f107840d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f107843g = ((long) this.f107842f) + jLongValue;
        long length = sVar.getLength();
        if (length != -1 && this.f107843g > length) {
            u.h("WavExtractor", "Data exceeds input length: " + this.f107843g + ", " + length);
            this.f107843g = length;
        }
        ((InterfaceC1325b) q9.a.e(this.f107841e)).init(this.f107842f, this.f107843g);
        this.f107839c = 4;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws n9.x {
        e();
        int i10 = this.f107839c;
        if (i10 == 0) {
            f(sVar);
            return 0;
        }
        if (i10 == 1) {
            h(sVar);
            return 0;
        }
        if (i10 == 2) {
            g(sVar);
            return 0;
        }
        if (i10 == 3) {
            j(sVar);
            return 0;
        }
        if (i10 == 4) {
            return i(sVar);
        }
        throw new IllegalStateException();
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f107837a = tVar;
        this.f107838b = tVar.track(0, 1);
        tVar.endTracks();
    }

    @Override // oa.r
    public boolean c(s sVar) {
        return d.a(sVar);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f107839c = j10 == 0 ? 0 : 4;
        InterfaceC1325b interfaceC1325b = this.f107841e;
        if (interfaceC1325b != null) {
            interfaceC1325b.reset(j11);
        }
    }

    @Override // oa.r
    public void release() {
    }
}
