package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.v0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
final class f1 implements x1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f18993r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f18994s = w2.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f18995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f18996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MessageLite f18999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19001g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f19004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i1 f19007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q0 f19008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q2 f19009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x f19010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final y0 f19011q;

    private f1(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, i1 i1Var, q0 q0Var, q2 q2Var, x xVar, y0 y0Var) {
        this.f18995a = iArr;
        this.f18996b = objArr;
        this.f18997c = i10;
        this.f18998d = i11;
        boolean z12 = false;
        this.f19002h = z10;
        if (xVar != null && xVar.d(messageLite)) {
            z12 = true;
        }
        this.f19000f = z12;
        this.f19003i = z11;
        this.f19004j = iArr2;
        this.f19005k = i12;
        this.f19006l = i13;
        this.f19007m = i1Var;
        this.f19008n = q0Var;
        this.f19009o = q2Var;
        this.f19010p = xVar;
        this.f18999e = messageLite;
        this.f19011q = y0Var;
    }

    private void A(Object obj, int i10, u1 u1Var) {
        if (j(i10)) {
            u1Var.readStringListRequireUtf8(this.f19008n.d(obj, s(i10)));
        } else {
            u1Var.readStringList(this.f19008n.d(obj, s(i10)));
        }
    }

    private void B(Object obj, int i10) {
        int iW = w(i10);
        long j10 = 1048575 & iW;
        if (j10 == 1048575) {
            return;
        }
        w2.V(obj, j10, (1 << (iW >>> 20)) | w2.C(obj, j10));
    }

    private void C(Object obj, int i10, int i11) {
        w2.V(obj, w(i11) & 1048575, i10);
    }

    private int D(int i10, int i11) {
        int length = (this.f18995a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iR = r(i13);
            if (i10 == iR) {
                return i13;
            }
            if (i10 < iR) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void E(com.explorestack.protobuf.b0 r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.f1.E(com.explorestack.protobuf.b0, int[], int, java.lang.Object[]):void");
    }

    private static int F(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int G(int i10) {
        return this.f18995a[i10 + 1];
    }

    private final Object b(Object obj, int i10, Object obj2, q2 q2Var) {
        j0.e eVarD;
        int iR = r(i10);
        Object objG = w2.G(obj, s(G(i10)));
        return (objG == null || (eVarD = d(i10)) == null) ? obj2 : c(i10, iR, this.f19011q.forMutableMapData(objG), eVarD, obj2, q2Var);
    }

    private final Object c(int i10, int i11, Map map, j0.e eVar, Object obj, q2 q2Var) {
        v0.b bVarForMapMetadata = this.f19011q.forMapMetadata(e(i10));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVar.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = q2Var.m();
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(v0.a(bVarForMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    v0.d(codedBuilderNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, entry.getKey(), entry.getValue());
                    q2Var.d(obj, i11, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj;
    }

    private j0.e d(int i10) {
        return (j0.e) this.f18996b[((i10 / 3) * 2) + 1];
    }

    private Object e(int i10) {
        return this.f18996b[(i10 / 3) * 2];
    }

    private x1 f(int i10) {
        int i11 = (i10 / 3) * 2;
        x1 x1Var = (x1) this.f18996b[i11];
        if (x1Var != null) {
            return x1Var;
        }
        x1 x1VarC = s1.a().c((Class) this.f18996b[i11 + 1]);
        this.f18996b[i11] = x1VarC;
        return x1VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int g(Object obj) {
        int i10;
        int i11;
        int iJ;
        int iE;
        boolean z10;
        int iF;
        int i12;
        int iX;
        int iZ;
        Unsafe unsafe = f18994s;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < this.f18995a.length) {
            int iG = G(i15);
            int iR = r(i15);
            int iF2 = F(iG);
            if (iF2 <= 17) {
                i10 = this.f18995a[i15 + 2];
                int i18 = i10 & i13;
                i11 = 1 << (i10 >>> 20);
                if (i18 != i14) {
                    i17 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = (!this.f19003i || iF2 < d0.P.g() || iF2 > d0.f18941c0.g()) ? 0 : this.f18995a[i15 + 2] & i13;
                i11 = 0;
            }
            long jS = s(iG);
            switch (iF2) {
                case 0:
                    if ((i17 & i11) != 0) {
                        iJ = n.j(iR, 0.0d);
                        i16 += iJ;
                    }
                    break;
                case 1:
                    if ((i17 & i11) != 0) {
                        iJ = n.r(iR, 0.0f);
                        i16 += iJ;
                    }
                    break;
                case 2:
                    if ((i17 & i11) != 0) {
                        iJ = n.z(iR, unsafe.getLong(obj, jS));
                        i16 += iJ;
                    }
                    break;
                case 3:
                    if ((i17 & i11) != 0) {
                        iJ = n.a0(iR, unsafe.getLong(obj, jS));
                        i16 += iJ;
                    }
                    break;
                case 4:
                    if ((i17 & i11) != 0) {
                        iJ = n.x(iR, unsafe.getInt(obj, jS));
                        i16 += iJ;
                    }
                    break;
                case 5:
                    if ((i17 & i11) != 0) {
                        iJ = n.p(iR, 0L);
                        i16 += iJ;
                    }
                    break;
                case 6:
                    if ((i17 & i11) != 0) {
                        iJ = n.n(iR, 0);
                        i16 += iJ;
                    }
                    break;
                case 7:
                    if ((i17 & i11) != 0) {
                        iE = n.e(iR, true);
                        i16 += iE;
                    }
                    break;
                case 8:
                    if ((i17 & i11) != 0) {
                        Object object = unsafe.getObject(obj, jS);
                        iE = object instanceof ByteString ? n.h(iR, (ByteString) object) : n.V(iR, (String) object);
                        i16 += iE;
                    }
                    break;
                case 9:
                    if ((i17 & i11) != 0) {
                        iE = z1.o(iR, unsafe.getObject(obj, jS), f(i15));
                        i16 += iE;
                    }
                    break;
                case 10:
                    if ((i17 & i11) != 0) {
                        iE = n.h(iR, (ByteString) unsafe.getObject(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 11:
                    if ((i17 & i11) != 0) {
                        iE = n.Y(iR, unsafe.getInt(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 12:
                    if ((i17 & i11) != 0) {
                        iE = n.l(iR, unsafe.getInt(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 13:
                    if ((i17 & i11) != 0) {
                        iE = n.N(iR, 0);
                        i16 += iE;
                    }
                    break;
                case 14:
                    if ((i17 & i11) != 0) {
                        iE = n.P(iR, 0L);
                        i16 += iE;
                    }
                    break;
                case 15:
                    if ((i17 & i11) != 0) {
                        iE = n.R(iR, unsafe.getInt(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 16:
                    if ((i17 & i11) != 0) {
                        iE = n.T(iR, unsafe.getLong(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 17:
                    if ((i17 & i11) != 0) {
                        iE = n.u(iR, (MessageLite) unsafe.getObject(obj, jS), f(i15));
                        i16 += iE;
                    }
                    break;
                case 18:
                    iE = z1.h(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iE;
                    break;
                case 19:
                    z10 = false;
                    iF = z1.f(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 20:
                    z10 = false;
                    iF = z1.m(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 21:
                    z10 = false;
                    iF = z1.x(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 22:
                    z10 = false;
                    iF = z1.k(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 23:
                    z10 = false;
                    iF = z1.h(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 24:
                    z10 = false;
                    iF = z1.f(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 25:
                    z10 = false;
                    iF = z1.a(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 26:
                    iE = z1.u(iR, (List) unsafe.getObject(obj, jS));
                    i16 += iE;
                    break;
                case 27:
                    iE = z1.p(iR, (List) unsafe.getObject(obj, jS), f(i15));
                    i16 += iE;
                    break;
                case 28:
                    iE = z1.c(iR, (List) unsafe.getObject(obj, jS));
                    i16 += iE;
                    break;
                case 29:
                    iE = z1.v(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iE;
                    break;
                case 30:
                    z10 = false;
                    iF = z1.d(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 31:
                    z10 = false;
                    iF = z1.f(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 32:
                    z10 = false;
                    iF = z1.h(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 33:
                    z10 = false;
                    iF = z1.q(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 34:
                    z10 = false;
                    iF = z1.s(iR, (List) unsafe.getObject(obj, jS), false);
                    i16 += iF;
                    break;
                case 35:
                    i12 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 36:
                    i12 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 37:
                    i12 = z1.n((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 38:
                    i12 = z1.y((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 39:
                    i12 = z1.l((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 40:
                    i12 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 41:
                    i12 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 42:
                    i12 = z1.b((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 43:
                    i12 = z1.w((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 44:
                    i12 = z1.e((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 45:
                    i12 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 46:
                    i12 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 47:
                    i12 = z1.r((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 48:
                    i12 = z1.t((List) unsafe.getObject(obj, jS));
                    if (i12 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i10, i12);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i12);
                        i16 += iX + iZ + i12;
                    }
                    break;
                case 49:
                    iE = z1.j(iR, (List) unsafe.getObject(obj, jS), f(i15));
                    i16 += iE;
                    break;
                case 50:
                    iE = this.f19011q.getSerializedSize(iR, unsafe.getObject(obj, jS), e(i15));
                    i16 += iE;
                    break;
                case 51:
                    if (l(obj, iR, i15)) {
                        iE = n.j(iR, 0.0d);
                        i16 += iE;
                    }
                    break;
                case 52:
                    if (l(obj, iR, i15)) {
                        iE = n.r(iR, 0.0f);
                        i16 += iE;
                    }
                    break;
                case 53:
                    if (l(obj, iR, i15)) {
                        iE = n.z(iR, u(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 54:
                    if (l(obj, iR, i15)) {
                        iE = n.a0(iR, u(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 55:
                    if (l(obj, iR, i15)) {
                        iE = n.x(iR, t(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 56:
                    if (l(obj, iR, i15)) {
                        iE = n.p(iR, 0L);
                        i16 += iE;
                    }
                    break;
                case 57:
                    if (l(obj, iR, i15)) {
                        iE = n.n(iR, 0);
                        i16 += iE;
                    }
                    break;
                case 58:
                    if (l(obj, iR, i15)) {
                        iE = n.e(iR, true);
                        i16 += iE;
                    }
                    break;
                case 59:
                    if (l(obj, iR, i15)) {
                        Object object2 = unsafe.getObject(obj, jS);
                        iE = object2 instanceof ByteString ? n.h(iR, (ByteString) object2) : n.V(iR, (String) object2);
                        i16 += iE;
                    }
                    break;
                case 60:
                    if (l(obj, iR, i15)) {
                        iE = z1.o(iR, unsafe.getObject(obj, jS), f(i15));
                        i16 += iE;
                    }
                    break;
                case 61:
                    if (l(obj, iR, i15)) {
                        iE = n.h(iR, (ByteString) unsafe.getObject(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 62:
                    if (l(obj, iR, i15)) {
                        iE = n.Y(iR, t(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 63:
                    if (l(obj, iR, i15)) {
                        iE = n.l(iR, t(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 64:
                    if (l(obj, iR, i15)) {
                        iE = n.N(iR, 0);
                        i16 += iE;
                    }
                    break;
                case 65:
                    if (l(obj, iR, i15)) {
                        iE = n.P(iR, 0L);
                        i16 += iE;
                    }
                    break;
                case 66:
                    if (l(obj, iR, i15)) {
                        iE = n.R(iR, t(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 67:
                    if (l(obj, iR, i15)) {
                        iE = n.T(iR, u(obj, jS));
                        i16 += iE;
                    }
                    break;
                case 68:
                    if (l(obj, iR, i15)) {
                        iE = n.u(iR, (MessageLite) unsafe.getObject(obj, jS), f(i15));
                        i16 += iE;
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        int i19 = i16 + i(this.f19009o, obj);
        return this.f19000f ? i19 + this.f19010p.b(obj).x() : i19;
    }

    private int h(Object obj) {
        int iJ;
        int i10;
        int iX;
        int iZ;
        Unsafe unsafe = f18994s;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f18995a.length; i12 += 3) {
            int iG = G(i12);
            int iF = F(iG);
            int iR = r(i12);
            long jS = s(iG);
            int i13 = (iF < d0.P.g() || iF > d0.f18941c0.g()) ? 0 : this.f18995a[i12 + 2] & 1048575;
            switch (iF) {
                case 0:
                    if (k(obj, i12)) {
                        iJ = n.j(iR, 0.0d);
                        i11 += iJ;
                    }
                    break;
                case 1:
                    if (k(obj, i12)) {
                        iJ = n.r(iR, 0.0f);
                        i11 += iJ;
                    }
                    break;
                case 2:
                    if (k(obj, i12)) {
                        iJ = n.z(iR, w2.E(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 3:
                    if (k(obj, i12)) {
                        iJ = n.a0(iR, w2.E(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 4:
                    if (k(obj, i12)) {
                        iJ = n.x(iR, w2.C(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 5:
                    if (k(obj, i12)) {
                        iJ = n.p(iR, 0L);
                        i11 += iJ;
                    }
                    break;
                case 6:
                    if (k(obj, i12)) {
                        iJ = n.n(iR, 0);
                        i11 += iJ;
                    }
                    break;
                case 7:
                    if (k(obj, i12)) {
                        iJ = n.e(iR, true);
                        i11 += iJ;
                    }
                    break;
                case 8:
                    if (k(obj, i12)) {
                        Object objG = w2.G(obj, jS);
                        iJ = objG instanceof ByteString ? n.h(iR, (ByteString) objG) : n.V(iR, (String) objG);
                        i11 += iJ;
                    }
                    break;
                case 9:
                    if (k(obj, i12)) {
                        iJ = z1.o(iR, w2.G(obj, jS), f(i12));
                        i11 += iJ;
                    }
                    break;
                case 10:
                    if (k(obj, i12)) {
                        iJ = n.h(iR, (ByteString) w2.G(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 11:
                    if (k(obj, i12)) {
                        iJ = n.Y(iR, w2.C(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 12:
                    if (k(obj, i12)) {
                        iJ = n.l(iR, w2.C(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 13:
                    if (k(obj, i12)) {
                        iJ = n.N(iR, 0);
                        i11 += iJ;
                    }
                    break;
                case 14:
                    if (k(obj, i12)) {
                        iJ = n.P(iR, 0L);
                        i11 += iJ;
                    }
                    break;
                case 15:
                    if (k(obj, i12)) {
                        iJ = n.R(iR, w2.C(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 16:
                    if (k(obj, i12)) {
                        iJ = n.T(iR, w2.E(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 17:
                    if (k(obj, i12)) {
                        iJ = n.u(iR, (MessageLite) w2.G(obj, jS), f(i12));
                        i11 += iJ;
                    }
                    break;
                case 18:
                    iJ = z1.h(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 19:
                    iJ = z1.f(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 20:
                    iJ = z1.m(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 21:
                    iJ = z1.x(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 22:
                    iJ = z1.k(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 23:
                    iJ = z1.h(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 24:
                    iJ = z1.f(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 25:
                    iJ = z1.a(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 26:
                    iJ = z1.u(iR, m(obj, jS));
                    i11 += iJ;
                    break;
                case 27:
                    iJ = z1.p(iR, m(obj, jS), f(i12));
                    i11 += iJ;
                    break;
                case 28:
                    iJ = z1.c(iR, m(obj, jS));
                    i11 += iJ;
                    break;
                case 29:
                    iJ = z1.v(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 30:
                    iJ = z1.d(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 31:
                    iJ = z1.f(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 32:
                    iJ = z1.h(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 33:
                    iJ = z1.q(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 34:
                    iJ = z1.s(iR, m(obj, jS), false);
                    i11 += iJ;
                    break;
                case 35:
                    i10 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 36:
                    i10 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 37:
                    i10 = z1.n((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 38:
                    i10 = z1.y((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 39:
                    i10 = z1.l((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 40:
                    i10 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 41:
                    i10 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 42:
                    i10 = z1.b((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 43:
                    i10 = z1.w((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 44:
                    i10 = z1.e((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 45:
                    i10 = z1.g((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 46:
                    i10 = z1.i((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 47:
                    i10 = z1.r((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 48:
                    i10 = z1.t((List) unsafe.getObject(obj, jS));
                    if (i10 > 0) {
                        if (this.f19003i) {
                            unsafe.putInt(obj, i13, i10);
                        }
                        iX = n.X(iR);
                        iZ = n.Z(i10);
                        iJ = iX + iZ + i10;
                        i11 += iJ;
                    }
                    break;
                case 49:
                    iJ = z1.j(iR, m(obj, jS), f(i12));
                    i11 += iJ;
                    break;
                case 50:
                    iJ = this.f19011q.getSerializedSize(iR, w2.G(obj, jS), e(i12));
                    i11 += iJ;
                    break;
                case 51:
                    if (l(obj, iR, i12)) {
                        iJ = n.j(iR, 0.0d);
                        i11 += iJ;
                    }
                    break;
                case 52:
                    if (l(obj, iR, i12)) {
                        iJ = n.r(iR, 0.0f);
                        i11 += iJ;
                    }
                    break;
                case 53:
                    if (l(obj, iR, i12)) {
                        iJ = n.z(iR, u(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 54:
                    if (l(obj, iR, i12)) {
                        iJ = n.a0(iR, u(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 55:
                    if (l(obj, iR, i12)) {
                        iJ = n.x(iR, t(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 56:
                    if (l(obj, iR, i12)) {
                        iJ = n.p(iR, 0L);
                        i11 += iJ;
                    }
                    break;
                case 57:
                    if (l(obj, iR, i12)) {
                        iJ = n.n(iR, 0);
                        i11 += iJ;
                    }
                    break;
                case 58:
                    if (l(obj, iR, i12)) {
                        iJ = n.e(iR, true);
                        i11 += iJ;
                    }
                    break;
                case 59:
                    if (l(obj, iR, i12)) {
                        Object objG2 = w2.G(obj, jS);
                        iJ = objG2 instanceof ByteString ? n.h(iR, (ByteString) objG2) : n.V(iR, (String) objG2);
                        i11 += iJ;
                    }
                    break;
                case 60:
                    if (l(obj, iR, i12)) {
                        iJ = z1.o(iR, w2.G(obj, jS), f(i12));
                        i11 += iJ;
                    }
                    break;
                case 61:
                    if (l(obj, iR, i12)) {
                        iJ = n.h(iR, (ByteString) w2.G(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 62:
                    if (l(obj, iR, i12)) {
                        iJ = n.Y(iR, t(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 63:
                    if (l(obj, iR, i12)) {
                        iJ = n.l(iR, t(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 64:
                    if (l(obj, iR, i12)) {
                        iJ = n.N(iR, 0);
                        i11 += iJ;
                    }
                    break;
                case 65:
                    if (l(obj, iR, i12)) {
                        iJ = n.P(iR, 0L);
                        i11 += iJ;
                    }
                    break;
                case 66:
                    if (l(obj, iR, i12)) {
                        iJ = n.R(iR, t(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 67:
                    if (l(obj, iR, i12)) {
                        iJ = n.T(iR, u(obj, jS));
                        i11 += iJ;
                    }
                    break;
                case 68:
                    if (l(obj, iR, i12)) {
                        iJ = n.u(iR, (MessageLite) w2.G(obj, jS), f(i12));
                        i11 += iJ;
                    }
                    break;
            }
        }
        return i11 + i(this.f19009o, obj);
    }

    private int i(q2 q2Var, Object obj) {
        return q2Var.h(q2Var.g(obj));
    }

    private static boolean j(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean k(Object obj, int i10) {
        int iW = w(i10);
        long j10 = 1048575 & iW;
        if (j10 != 1048575) {
            return (w2.C(obj, j10) & (1 << (iW >>> 20))) != 0;
        }
        int iG = G(i10);
        long jS = s(iG);
        switch (F(iG)) {
            case 0:
                return w2.A(obj, jS) != 0.0d;
            case 1:
                return w2.B(obj, jS) != 0.0f;
            case 2:
                return w2.E(obj, jS) != 0;
            case 3:
                return w2.E(obj, jS) != 0;
            case 4:
                return w2.C(obj, jS) != 0;
            case 5:
                return w2.E(obj, jS) != 0;
            case 6:
                return w2.C(obj, jS) != 0;
            case 7:
                return w2.t(obj, jS);
            case 8:
                Object objG = w2.G(obj, jS);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return w2.G(obj, jS) != null;
            case 10:
                return !ByteString.EMPTY.equals(w2.G(obj, jS));
            case 11:
                return w2.C(obj, jS) != 0;
            case 12:
                return w2.C(obj, jS) != 0;
            case 13:
                return w2.C(obj, jS) != 0;
            case 14:
                return w2.E(obj, jS) != 0;
            case 15:
                return w2.C(obj, jS) != 0;
            case 16:
                return w2.E(obj, jS) != 0;
            case 17:
                return w2.G(obj, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean l(Object obj, int i10, int i11) {
        return w2.C(obj, (long) (w(i11) & 1048575)) == i10;
    }

    private static List m(Object obj, long j10) {
        return (List) w2.G(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        r0 = r14.f19005k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r0 >= r14.f19006l) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        r7 = b(r9, r14.f19004j[r0], r7, r15);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (r7 == null) goto L334;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0638 A[LOOP:3: B:197:0x0634->B:199:0x0638, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x060f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(com.explorestack.protobuf.q2 r15, com.explorestack.protobuf.x r16, java.lang.Object r17, com.explorestack.protobuf.u1 r18, com.explorestack.protobuf.w r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.f1.n(com.explorestack.protobuf.q2, com.explorestack.protobuf.x, java.lang.Object, com.explorestack.protobuf.u1, com.explorestack.protobuf.w):void");
    }

    private final void o(Object obj, int i10, Object obj2, w wVar, u1 u1Var) {
        long jS = s(G(i10));
        Object objG = w2.G(obj, jS);
        if (objG == null) {
            objG = this.f19011q.newMapField(obj2);
            w2.X(obj, jS, objG);
        } else if (this.f19011q.isImmutable(objG)) {
            Object objNewMapField = this.f19011q.newMapField(obj2);
            this.f19011q.mergeFrom(objNewMapField, objG);
            w2.X(obj, jS, objNewMapField);
            objG = objNewMapField;
        }
        u1Var.b(this.f19011q.forMutableMapData(objG), this.f19011q.forMapMetadata(obj2), wVar);
    }

    static f1 p(Class cls, c1 c1Var, i1 i1Var, q0 q0Var, q2 q2Var, x xVar, y0 y0Var) {
        return q((g2) c1Var, i1Var, q0Var, q2Var, xVar, y0Var);
    }

    static f1 q(g2 g2Var, i1 i1Var, q0 q0Var, q2 q2Var, x xVar, y0 y0Var) {
        int iP;
        int iP2;
        int i10;
        boolean z10 = g2Var.getSyntax() == r1.PROTO3;
        b0[] b0VarArrB = g2Var.b();
        if (b0VarArrB.length == 0) {
            iP = 0;
            iP2 = 0;
        } else {
            iP = b0VarArrB[0].p();
            iP2 = b0VarArrB[b0VarArrB.length - 1].p();
        }
        int length = b0VarArrB.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (b0 b0Var : b0VarArrB) {
            if (b0Var.v() == d0.f18943e0) {
                i11++;
            } else if (b0Var.v().g() >= 18 && b0Var.v().g() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] iArrA = g2Var.a();
        if (iArrA == null) {
            iArrA = f18993r;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < b0VarArrB.length) {
            b0 b0Var2 = b0VarArrB[i13];
            int iP3 = b0Var2.p();
            E(b0Var2, iArr, i14, objArr);
            if (i15 < iArrA.length && iArrA[i15] == iP3) {
                iArrA[i15] = i14;
                i15++;
            }
            if (b0Var2.v() == d0.f18943e0) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (b0Var2.v().g() >= 18 && b0Var2.v().g() <= 49) {
                    i10 = i14;
                    iArr3[i17] = (int) w2.M(b0Var2.o());
                    i17++;
                }
                i13++;
                i14 = i10 + 3;
            }
            i10 = i14;
            i13++;
            i14 = i10 + 3;
        }
        if (iArr2 == null) {
            iArr2 = f18993r;
        }
        if (iArr3 == null) {
            iArr3 = f18993r;
        }
        int[] iArr4 = new int[iArrA.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrA, 0, iArr4, 0, iArrA.length);
        System.arraycopy(iArr2, 0, iArr4, iArrA.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrA.length + iArr2.length, iArr3.length);
        return new f1(iArr, objArr, iP, iP2, g2Var.getDefaultInstance(), z10, true, iArr4, iArrA.length, iArrA.length + iArr2.length, i1Var, q0Var, q2Var, xVar, y0Var);
    }

    private int r(int i10) {
        return this.f18995a[i10];
    }

    private static long s(int i10) {
        return i10 & 1048575;
    }

    private static int t(Object obj, long j10) {
        return ((Integer) w2.G(obj, j10)).intValue();
    }

    private static long u(Object obj, long j10) {
        return ((Long) w2.G(obj, j10)).longValue();
    }

    private int v(int i10) {
        if (i10 < this.f18997c || i10 > this.f18998d) {
            return -1;
        }
        return D(i10, 0);
    }

    private int w(int i10) {
        return this.f18995a[i10 + 2];
    }

    private void x(Object obj, long j10, u1 u1Var, x1 x1Var, w wVar) {
        u1Var.d(this.f19008n.d(obj, j10), x1Var, wVar);
    }

    private void y(Object obj, int i10, u1 u1Var, x1 x1Var, w wVar) {
        u1Var.a(this.f19008n.d(obj, s(i10)), x1Var, wVar);
    }

    private void z(Object obj, int i10, u1 u1Var) {
        if (j(i10)) {
            w2.X(obj, s(i10), u1Var.readStringRequireUtf8());
        } else if (this.f19001g) {
            w2.X(obj, s(i10), u1Var.readString());
        } else {
            w2.X(obj, s(i10), u1Var.readBytes());
        }
    }

    @Override // com.explorestack.protobuf.x1
    public void a(Object obj, u1 u1Var, w wVar) throws Throwable {
        wVar.getClass();
        n(this.f19009o, this.f19010p, obj, u1Var, wVar);
    }

    @Override // com.explorestack.protobuf.x1
    public int getSerializedSize(Object obj) {
        return this.f19002h ? h(obj) : g(obj);
    }

    @Override // com.explorestack.protobuf.x1
    public void makeImmutable(Object obj) {
        int i10;
        int i11 = this.f19005k;
        while (true) {
            i10 = this.f19006l;
            if (i11 >= i10) {
                break;
            }
            long jS = s(G(this.f19004j[i11]));
            Object objG = w2.G(obj, jS);
            if (objG != null) {
                w2.X(obj, jS, this.f19011q.toImmutable(objG));
            }
            i11++;
        }
        int length = this.f19004j.length;
        while (i10 < length) {
            this.f19008n.c(obj, this.f19004j[i10]);
            i10++;
        }
        this.f19009o.j(obj);
        if (this.f19000f) {
            this.f19010p.e(obj);
        }
    }

    @Override // com.explorestack.protobuf.x1
    public Object newInstance() {
        return this.f19007m.newInstance(this.f18999e);
    }
}
