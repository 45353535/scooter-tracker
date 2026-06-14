package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f19464a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q2 f19465b = C(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q2 f19466c = C(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q2 f19467d = new t2();

    private static Class A() {
        try {
            boolean z10 = h0.alwaysUseFieldBuilders;
            return h0.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object B(Class cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + I(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return w2.H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static q2 C(boolean z10) {
        try {
            Class clsD = D();
            if (clsD == null) {
                return null;
            }
            return (q2) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class D() {
        return u2.class;
    }

    public static q2 E() {
        return f19465b;
    }

    public static q2 F() {
        return f19466c;
    }

    public static void G(Class cls) {
        Class cls2;
        if (!g0.class.isAssignableFrom(cls) && (cls2 = f19464a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static Object H(int i10, int i11, Object obj, q2 q2Var) {
        if (obj == null) {
            obj = q2Var.m();
        }
        q2Var.e(obj, i10, i11);
        return obj;
    }

    static String I(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static q2 J() {
        return f19467d;
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? n.X(i10) + n.E(size) : size * n.e(i10, true);
    }

    static int b(List list) {
        return list.size();
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = size * n.X(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += n.i((ByteString) list.get(i11));
        }
        return iX;
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? n.X(i10) + n.E(iE) : iE + (size * n.X(i10));
    }

    static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iM = 0;
            while (i10 < size) {
                iM += n.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM;
        }
        i0 i0Var = (i0) list;
        int iM2 = 0;
        while (i10 < size) {
            iM2 += n.m(i0Var.getInt(i10));
            i10++;
        }
        return iM2;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? n.X(i10) + n.E(size * 4) : size * n.n(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? n.X(i10) + n.E(size * 8) : size * n.p(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, x1 x1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iU += n.u(i10, (MessageLite) list.get(i11), x1Var);
        }
        return iU;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? n.X(i10) + n.E(iL) : iL + (size * n.X(i10));
    }

    static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iY = 0;
            while (i10 < size) {
                iY += n.y(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += n.y(i0Var.getInt(i10));
            i10++;
        }
        return iY2;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? n.X(i10) + n.E(iN) : iN + (list.size() * n.X(i10));
    }

    static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s0)) {
            int iA = 0;
            while (i10 < size) {
                iA += n.A(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        s0 s0Var = (s0) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += n.A(s0Var.getLong(i10));
            i10++;
        }
        return iA2;
    }

    static int o(int i10, Object obj, x1 x1Var) {
        return obj instanceof n0 ? n.C(i10, (n0) obj) : n.H(i10, (MessageLite) obj, x1Var);
    }

    static int p(int i10, List list, x1 x1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = n.X(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iX += obj instanceof n0 ? n.D((n0) obj) : n.J((MessageLite) obj, x1Var);
        }
        return iX;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? n.X(i10) + n.E(iR) : iR + (size * n.X(i10));
    }

    static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iS = 0;
            while (i10 < size) {
                iS += n.S(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iS;
        }
        i0 i0Var = (i0) list;
        int iS2 = 0;
        while (i10 < size) {
            iS2 += n.S(i0Var.getInt(i10));
            i10++;
        }
        return iS2;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? n.X(i10) + n.E(iT) : iT + (size * n.X(i10));
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s0)) {
            int iU = 0;
            while (i10 < size) {
                iU += n.U(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iU;
        }
        s0 s0Var = (s0) list;
        int iU2 = 0;
        while (i10 < size) {
            iU2 += n.U(s0Var.getLong(i10));
            i10++;
        }
        return iU2;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iX = n.X(i10) * size;
        if (!(list instanceof p0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iX += obj instanceof ByteString ? n.i((ByteString) obj) : n.W((String) obj);
                i11++;
            }
            return iX;
        }
        p0 p0Var = (p0) list;
        while (i11 < size) {
            Object raw = p0Var.getRaw(i11);
            iX += raw instanceof ByteString ? n.i((ByteString) raw) : n.W((String) raw);
            i11++;
        }
        return iX;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? n.X(i10) + n.E(iW) : iW + (size * n.X(i10));
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iZ = 0;
            while (i10 < size) {
                iZ += n.Z(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iZ;
        }
        i0 i0Var = (i0) list;
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += n.Z(i0Var.getInt(i10));
            i10++;
        }
        return iZ2;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? n.X(i10) + n.E(iY) : iY + (size * n.X(i10));
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof s0)) {
            int iB0 = 0;
            while (i10 < size) {
                iB0 += n.b0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iB0;
        }
        s0 s0Var = (s0) list;
        int iB02 = 0;
        while (i10 < size) {
            iB02 += n.b0(s0Var.getLong(i10));
            i10++;
        }
        return iB02;
    }

    static Object z(int i10, List list, j0.e eVar, Object obj, q2 q2Var) {
        if (eVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!eVar.isInRange(iIntValue)) {
                    obj = H(i10, iIntValue, obj, q2Var);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj = H(i10, iIntValue2, obj, q2Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj;
    }
}
