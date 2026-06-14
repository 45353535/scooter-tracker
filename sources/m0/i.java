package m0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import d0.y;
import g0.o;
import j0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k0.k;
import k0.l;
import k0.m;
import l0.q;
import l0.u;
import q0.p;

/* JADX INFO: loaded from: classes5.dex */
public class i extends m0.b {
    private final StringBuilder E;
    private final RectF F;
    private final Matrix G;
    private final Paint H;
    private final Paint I;
    private final Map J;
    private final LongSparseArray K;
    private final List L;
    private final o M;
    private final com.airbnb.lottie.o N;
    private final d0.i O;
    private u P;
    private g0.a Q;
    private g0.a R;
    private g0.a S;
    private g0.a T;
    private g0.a U;
    private g0.a V;
    private g0.a W;
    private g0.a X;
    private g0.a Y;
    private g0.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private g0.a f94388a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private g0.a f94389b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private g0.a f94390c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private g0.a f94391d0;

    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94394a;

        static {
            int[] iArr = new int[b.a.values().length];
            f94394a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94394a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94394a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(com.airbnb.lottie.o oVar, e eVar) {
        l lVar;
        l lVar2;
        k0.d dVar;
        l lVar3;
        k0.d dVar2;
        l lVar4;
        k0.d dVar3;
        m mVar;
        k0.d dVar4;
        m mVar2;
        k0.b bVar;
        m mVar3;
        k0.b bVar2;
        m mVar4;
        k0.a aVar;
        m mVar5;
        k0.a aVar2;
        super(oVar, eVar);
        this.E = new StringBuilder(2);
        this.F = new RectF();
        this.G = new Matrix();
        this.H = new a(1);
        this.I = new b(1);
        this.J = new HashMap();
        this.K = new LongSparseArray();
        this.L = new ArrayList();
        this.P = u.INDEX;
        this.N = oVar;
        this.O = eVar.c();
        o oVarA = eVar.t().a();
        this.M = oVarA;
        oVarA.a(this);
        j(oVarA);
        k kVarU = eVar.u();
        if (kVarU != null && (mVar5 = kVarU.f85929a) != null && (aVar2 = mVar5.f85935a) != null) {
            g0.a aVarA = aVar2.a();
            this.Q = aVarA;
            aVarA.a(this);
            j(this.Q);
        }
        if (kVarU != null && (mVar4 = kVarU.f85929a) != null && (aVar = mVar4.f85936b) != null) {
            g0.a aVarA2 = aVar.a();
            this.S = aVarA2;
            aVarA2.a(this);
            j(this.S);
        }
        if (kVarU != null && (mVar3 = kVarU.f85929a) != null && (bVar2 = mVar3.f85937c) != null) {
            g0.d dVarA = bVar2.a();
            this.U = dVarA;
            dVarA.a(this);
            j(this.U);
        }
        if (kVarU != null && (mVar2 = kVarU.f85929a) != null && (bVar = mVar2.f85938d) != null) {
            g0.d dVarA2 = bVar.a();
            this.W = dVarA2;
            dVarA2.a(this);
            j(this.W);
        }
        if (kVarU != null && (mVar = kVarU.f85929a) != null && (dVar4 = mVar.f85939e) != null) {
            g0.a aVarA3 = dVar4.a();
            this.Y = aVarA3;
            aVarA3.a(this);
            j(this.Y);
        }
        if (kVarU != null && (lVar4 = kVarU.f85930b) != null && (dVar3 = lVar4.f85931a) != null) {
            g0.a aVarA4 = dVar3.a();
            this.f94389b0 = aVarA4;
            aVarA4.a(this);
            j(this.f94389b0);
        }
        if (kVarU != null && (lVar3 = kVarU.f85930b) != null && (dVar2 = lVar3.f85932b) != null) {
            g0.a aVarA5 = dVar2.a();
            this.f94390c0 = aVarA5;
            aVarA5.a(this);
            j(this.f94390c0);
        }
        if (kVarU != null && (lVar2 = kVarU.f85930b) != null && (dVar = lVar2.f85933c) != null) {
            g0.a aVarA6 = dVar.a();
            this.f94391d0 = aVarA6;
            aVarA6.a(this);
            j(this.f94391d0);
        }
        if (kVarU == null || (lVar = kVarU.f85930b) == null) {
            return;
        }
        this.P = lVar.f85934d;
    }

    private String P(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.K.containsKey(j10)) {
            return (String) this.K.get(j10);
        }
        this.E.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.E.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.E.toString();
        this.K.put(j10, string);
        return string;
    }

    private void Q(j0.b bVar, int i10, int i11) {
        g0.a aVar = this.R;
        if (aVar != null) {
            this.H.setColor(((Integer) aVar.h()).intValue());
        } else if (this.Q == null || !d0(i11)) {
            this.H.setColor(bVar.f85425h);
        } else {
            this.H.setColor(((Integer) this.Q.h()).intValue());
        }
        g0.a aVar2 = this.T;
        if (aVar2 != null) {
            this.I.setColor(((Integer) aVar2.h()).intValue());
        } else if (this.S == null || !d0(i11)) {
            this.I.setColor(bVar.f85426i);
        } else {
            this.I.setColor(((Integer) this.S.h()).intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f94342x.h() == null ? 100 : ((Integer) this.f94342x.h().h()).intValue();
        if (this.Y != null && d0(i11)) {
            iIntValue = ((Integer) this.Y.h()).intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i10) / 255.0f);
        this.H.setAlpha(iRound);
        this.I.setAlpha(iRound);
        g0.a aVar3 = this.V;
        if (aVar3 != null) {
            this.I.setStrokeWidth(((Float) aVar3.h()).floatValue());
        } else if (this.U == null || !d0(i11)) {
            this.I.setStrokeWidth(bVar.f85427j * p.e());
        } else {
            this.I.setStrokeWidth(((Float) this.U.h()).floatValue());
        }
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void S(j0.d dVar, float f10, j0.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        List listA0 = a0(dVar);
        for (int i12 = 0; i12 < listA0.size(); i12++) {
            Path path = ((f0.d) listA0.get(i12)).getPath();
            path.computeBounds(this.F, false);
            this.G.reset();
            this.G.preTranslate(0.0f, (-bVar.f85424g) * p.e());
            this.G.preScale(f10, f10);
            path.transform(this.G);
            if (bVar.f85428k) {
                V(path, this.H, canvas);
                V(path, this.I, canvas);
            } else {
                V(path, this.I, canvas);
                V(path, this.H, canvas);
            }
        }
    }

    private void T(String str, j0.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        if (bVar.f85428k) {
            R(str, this.H, canvas);
            R(str, this.I, canvas);
        } else {
            R(str, this.I, canvas);
            R(str, this.H, canvas);
        }
    }

    private void U(String str, j0.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            j0.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(strP, bVar2, canvas2, i10 + length, i11);
            canvas2.translate(this.H.measureText(strP) + f10, 0.0f);
            length += strP.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, j0.b bVar, j0.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        j0.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            j0.d dVar = (j0.d) this.O.c().get(j0.d.c(str.charAt(i12), cVar.a(), cVar.c()));
            if (dVar == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                S(dVar, f13, bVar2, canvas2, i12, i11);
                canvas2.translate((((float) dVar.b()) * f13 * p.e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            bVar = bVar2;
            canvas = canvas2;
            i10 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void X(j0.b r18, j0.c r19, android.graphics.Canvas r20, int r21) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i.X(j0.b, j0.c, android.graphics.Canvas, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Y(j0.b r17, android.graphics.Matrix r18, j0.c r19, android.graphics.Canvas r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            g0.a r1 = r0.Z
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.f85420c
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = q0.p.g(r18)
            java.lang.String r1 = r7.f85418a
            java.util.List r9 = r0.b0(r1)
            int r10 = r9.size()
            int r1 = r7.f85422e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            g0.a r2 = r0.X
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            g0.a r2 = r0.W
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto Lb0
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.f85430m
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.g0(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto La6
            java.lang.Object r1 = r14.get(r15)
            m0.i$d r1 = (m0.i.d) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = m0.i.d.a(r1)
            r3 = r20
            boolean r2 = r0.f0(r3, r7, r12, r2)
            if (r2 == 0) goto L98
            java.lang.String r1 = m0.i.d.b(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r8 = r21
            r0.W(r1, r2, r3, r4, r5, r6, r7, r8)
            r4 = r6
            goto L9a
        L98:
            r7 = r5
            r5 = r8
        L9a:
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r8 = r5
            r5 = r7
            r7 = r17
            goto L69
        La6:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i.Y(j0.b, android.graphics.Matrix, j0.c, android.graphics.Canvas, int):void");
    }

    private d Z(int i10) {
        for (int size = this.L.size(); size < i10; size++) {
            this.L.add(new d(null));
        }
        return (d) this.L.get(i10 - 1);
    }

    private List a0(j0.d dVar) {
        if (this.J.containsKey(dVar)) {
            return (List) this.J.get(dVar);
        }
        List listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new f0.d(this.N, this, (q) listA.get(i10), this.O));
        }
        this.J.put(dVar, arrayList);
        return arrayList;
    }

    private List b0(String str) {
        return Arrays.asList(str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\r").replaceAll("\u0003", "\r").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\r").split("\r"));
    }

    private Typeface c0(j0.c cVar) {
        Typeface typeface;
        g0.a aVar = this.f94388a0;
        if (aVar != null && (typeface = (Typeface) aVar.h()) != null) {
            return typeface;
        }
        Typeface typefaceA0 = this.N.a0(cVar);
        return typefaceA0 != null ? typefaceA0 : cVar.d();
    }

    private boolean d0(int i10) {
        int length = ((j0.b) this.M.h()).f85418a.length();
        g0.a aVar = this.f94389b0;
        if (aVar == null || this.f94390c0 == null) {
            return true;
        }
        int iMin = Math.min(((Integer) aVar.h()).intValue(), ((Integer) this.f94390c0.h()).intValue());
        int iMax = Math.max(((Integer) this.f94389b0.h()).intValue(), ((Integer) this.f94390c0.h()).intValue());
        g0.a aVar2 = this.f94391d0;
        if (aVar2 != null) {
            int iIntValue = ((Integer) aVar2.h()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.P == u.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    private boolean e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    private boolean f0(Canvas canvas, j0.b bVar, int i10, float f10) {
        PointF pointF = bVar.f85429l;
        PointF pointF2 = bVar.f85430m;
        float fE = p.e();
        float f11 = (i10 * bVar.f85423f * fE) + (pointF == null ? 0.0f : (bVar.f85423f * fE) + pointF.y);
        if (this.N.G() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f85420c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f94394a[bVar.f85421d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List g0(String str, float f10, j0.c cVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                j0.d dVar = (j0.d) this.O.c().get(j0.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVar != null) {
                    fMeasureText = ((float) dVar.b()) * f11 * p.e();
                }
            } else {
                fMeasureText = this.H.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                d dVarZ = Z(i10);
                if (i12 == i11) {
                    dVarZ.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    dVarZ.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Z(i10).c(str.substring(i11), f13);
        }
        return this.L.subList(0, i10);
    }

    @Override // m0.b, j0.f
    public void b(Object obj, r0.c cVar) {
        super.b(obj, cVar);
        if (obj == y.f68394a) {
            g0.a aVar = this.R;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            g0.q qVar = new g0.q(cVar);
            this.R = qVar;
            qVar.a(this);
            j(this.R);
            return;
        }
        if (obj == y.f68395b) {
            g0.a aVar2 = this.T;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            g0.q qVar2 = new g0.q(cVar);
            this.T = qVar2;
            qVar2.a(this);
            j(this.T);
            return;
        }
        if (obj == y.f68412s) {
            g0.a aVar3 = this.V;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            g0.q qVar3 = new g0.q(cVar);
            this.V = qVar3;
            qVar3.a(this);
            j(this.V);
            return;
        }
        if (obj == y.f68413t) {
            g0.a aVar4 = this.X;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            g0.q qVar4 = new g0.q(cVar);
            this.X = qVar4;
            qVar4.a(this);
            j(this.X);
            return;
        }
        if (obj == y.F) {
            g0.a aVar5 = this.Z;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            g0.q qVar5 = new g0.q(cVar);
            this.Z = qVar5;
            qVar5.a(this);
            j(this.Z);
            return;
        }
        if (obj != y.M) {
            if (obj == y.O) {
                this.M.s(cVar);
                return;
            }
            return;
        }
        g0.a aVar6 = this.f94388a0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f94388a0 = null;
            return;
        }
        g0.q qVar6 = new g0.q(cVar);
        this.f94388a0 = qVar6;
        qVar6.a(this);
        j(this.f94388a0);
    }

    @Override // m0.b, f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.O.b().width(), this.O.b().height());
    }

    @Override // m0.b
    void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        Canvas canvas2;
        j0.b bVar = (j0.b) this.M.h();
        j0.c cVar = (j0.c) this.O.g().get(bVar.f85419b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVar, i10, 0);
        if (this.N.U0()) {
            canvas2 = canvas;
            Y(bVar, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            X(bVar, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f94395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f94396b;

        private d() {
            this.f94395a = "";
            this.f94396b = 0.0f;
        }

        void c(String str, float f10) {
            this.f94395a = str;
            this.f94396b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
