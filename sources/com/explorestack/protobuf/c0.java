package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.m0;
import com.explorestack.protobuf.z2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f18888d = new c0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f18889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18891c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f18893b;

        static {
            int[] iArr = new int[z2.b.values().length];
            f18893b = iArr;
            try {
                iArr[z2.b.f19473d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18893b[z2.b.f19474e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18893b[z2.b.f19475f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18893b[z2.b.f19476g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18893b[z2.b.f19477h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18893b[z2.b.f19478i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18893b[z2.b.f19479j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18893b[z2.b.f19480k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18893b[z2.b.f19482m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18893b[z2.b.f19483n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18893b[z2.b.f19481l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18893b[z2.b.f19484o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18893b[z2.b.f19485p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18893b[z2.b.f19487r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18893b[z2.b.f19488s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18893b[z2.b.f19489t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18893b[z2.b.f19490u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f18893b[z2.b.f19486q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z2.c.values().length];
            f18892a = iArr2;
            try {
                iArr2[z2.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f18892a[z2.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f18892a[z2.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f18892a[z2.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f18892a[z2.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f18892a[z2.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f18892a[z2.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f18892a[z2.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f18892a[z2.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b2 f18894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18897d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.f18896c) {
                return;
            }
            this.f18894a = c0.k(this.f18894a, true);
            this.f18896c = true;
        }

        private void n(Map.Entry entry) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof m0) {
                value = ((m0) value).d();
            }
            if (cVar.isRepeated()) {
                Object objF = f(cVar);
                if (objF == null) {
                    objF = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) objF).add(c0.m(it.next()));
                }
                this.f18894a.p(cVar, objF);
                return;
            }
            if (cVar.getLiteJavaType() != z2.c.MESSAGE) {
                this.f18894a.p(cVar, c0.m(value));
                return;
            }
            Object objF2 = f(cVar);
            if (objF2 == null) {
                this.f18894a.p(cVar, c0.m(value));
            } else if (objF2 instanceof MessageLite.Builder) {
                cVar.internalMergeFrom((MessageLite.Builder) objF2, (MessageLite) value);
            } else {
                this.f18894a.p(cVar, cVar.internalMergeFrom(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            }
        }

        private static Object o(Object obj) {
            return obj instanceof MessageLite.Builder ? ((MessageLite.Builder) obj).build() : obj;
        }

        private static Object p(c cVar, Object obj) {
            if (obj == null || cVar.getLiteJavaType() != z2.c.MESSAGE) {
                return obj;
            }
            if (!cVar.isRepeated()) {
                return o(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj2 = arrayList.get(i10);
                Object objO = o(obj2);
                if (objO != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i10, objO);
                }
            }
            return arrayList;
        }

        private static void q(b2 b2Var) {
            for (int i10 = 0; i10 < b2Var.i(); i10++) {
                r(b2Var.h(i10));
            }
            Iterator it = b2Var.k().iterator();
            while (it.hasNext()) {
                r((Map.Entry) it.next());
            }
        }

        private static void r(Map.Entry entry) {
            entry.setValue(p((c) entry.getKey(), entry.getValue()));
        }

        private void u(c cVar, Object obj) {
            if (c0.D(cVar.getLiteType(), obj)) {
                return;
            }
            if (cVar.getLiteType().d() != z2.c.MESSAGE || !(obj instanceof MessageLite.Builder)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().d(), obj.getClass().getName()));
            }
        }

        public void a(c cVar, Object obj) {
            List arrayList;
            d();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f18897d = this.f18897d || (obj instanceof MessageLite.Builder);
            u(cVar, obj);
            Object objF = f(cVar);
            if (objF == null) {
                arrayList = new ArrayList();
                this.f18894a.p(cVar, arrayList);
            } else {
                arrayList = (List) objF;
            }
            arrayList.add(obj);
        }

        public c0 b() {
            if (this.f18894a.isEmpty()) {
                return c0.q();
            }
            this.f18896c = false;
            b2 b2VarK = this.f18894a;
            if (this.f18897d) {
                b2VarK = c0.k(b2VarK, false);
                q(b2VarK);
            }
            c0 c0Var = new c0(b2VarK, null);
            c0Var.f18891c = this.f18895b;
            return c0Var;
        }

        public void c(c cVar) {
            d();
            this.f18894a.remove(cVar);
            if (this.f18894a.isEmpty()) {
                this.f18895b = false;
            }
        }

        public Map e() {
            if (!this.f18895b) {
                return this.f18894a.m() ? this.f18894a : DesugarCollections.unmodifiableMap(this.f18894a);
            }
            b2 b2VarK = c0.k(this.f18894a, false);
            if (this.f18894a.m()) {
                b2VarK.n();
                return b2VarK;
            }
            q(b2VarK);
            return b2VarK;
        }

        public Object f(c cVar) {
            return p(cVar, g(cVar));
        }

        Object g(c cVar) {
            Object obj = this.f18894a.get(cVar);
            return obj instanceof m0 ? ((m0) obj).d() : obj;
        }

        public Object h(c cVar, int i10) {
            if (this.f18897d) {
                d();
            }
            return o(i(cVar, i10));
        }

        Object i(c cVar, int i10) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = g(cVar);
            if (objG != null) {
                return ((List) objG).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int j(c cVar) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = f(cVar);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        public boolean k(c cVar) {
            if (cVar.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f18894a.get(cVar) != null;
        }

        public boolean l() {
            for (int i10 = 0; i10 < this.f18894a.i(); i10++) {
                if (!c0.C(this.f18894a.h(i10))) {
                    return false;
                }
            }
            Iterator it = this.f18894a.k().iterator();
            while (it.hasNext()) {
                if (!c0.C((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void m(c0 c0Var) {
            d();
            for (int i10 = 0; i10 < c0Var.f18889a.i(); i10++) {
                n(c0Var.f18889a.h(i10));
            }
            Iterator it = c0Var.f18889a.k().iterator();
            while (it.hasNext()) {
                n((Map.Entry) it.next());
            }
        }

        public void s(c cVar, Object obj) {
            d();
            if (!cVar.isRepeated()) {
                u(cVar, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    u(cVar, obj2);
                    this.f18897d = this.f18897d || (obj2 instanceof MessageLite.Builder);
                }
                obj = arrayList;
            }
            if (obj instanceof m0) {
                this.f18895b = true;
            }
            this.f18897d = this.f18897d || (obj instanceof MessageLite.Builder);
            this.f18894a.p(cVar, obj);
        }

        public void t(c cVar, int i10, Object obj) {
            d();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f18897d = this.f18897d || (obj instanceof MessageLite.Builder);
            Object objF = f(cVar);
            if (objF == null) {
                throw new IndexOutOfBoundsException();
            }
            u(cVar, obj);
            ((List) objF).set(i10, obj);
        }

        private b() {
            this(b2.o(16));
        }

        private b(b2 b2Var) {
            this.f18894a = b2Var;
            this.f18896c = true;
        }
    }

    public interface c extends Comparable {
        z2.c getLiteJavaType();

        z2.b getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ c0(b2 b2Var, a aVar) {
        this(b2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        if (cVar.getLiteJavaType() == z2.c.MESSAGE) {
            if (cVar.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof m0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(z2.b bVar, Object obj) {
        j0.a(obj);
        switch (a.f18892a[bVar.d().ordinal()]) {
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof j0.c)) {
                }
                break;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof m0)) {
                }
                break;
        }
        return false;
    }

    private void H(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof m0) {
            value = ((m0) value).d();
        }
        if (cVar.isRepeated()) {
            Object objS = s(cVar);
            if (objS == null) {
                objS = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objS).add(m(it.next()));
            }
            this.f18889a.p(cVar, objS);
            return;
        }
        if (cVar.getLiteJavaType() != z2.c.MESSAGE) {
            this.f18889a.p(cVar, m(value));
            return;
        }
        Object objS2 = s(cVar);
        if (objS2 == null) {
            this.f18889a.p(cVar, m(value));
        } else {
            this.f18889a.p(cVar, cVar.internalMergeFrom(((MessageLite) objS2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static b I() {
        return new b((a) null);
    }

    public static c0 J() {
        return new c0();
    }

    public static Object K(l lVar, z2.b bVar, boolean z10) {
        return z10 ? z2.d(lVar, bVar, z2.d.f19506c) : z2.d(lVar, bVar, z2.d.f19505b);
    }

    private void N(c cVar, Object obj) {
        if (!D(cVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().d(), obj.getClass().getName()));
        }
    }

    static void O(n nVar, z2.b bVar, int i10, Object obj) {
        if (bVar == z2.b.f19482m) {
            nVar.D0(i10, (MessageLite) obj);
        } else {
            nVar.V0(i10, y(bVar, false));
            P(nVar, bVar, obj);
        }
    }

    static void P(n nVar, z2.b bVar, Object obj) {
        switch (a.f18893b[bVar.ordinal()]) {
            case 1:
                nVar.u0(((Double) obj).doubleValue());
                break;
            case 2:
                nVar.C0(((Float) obj).floatValue());
                break;
            case 3:
                nVar.I0(((Long) obj).longValue());
                break;
            case 4:
                nVar.Z0(((Long) obj).longValue());
                break;
            case 5:
                nVar.G0(((Integer) obj).intValue());
                break;
            case 6:
                nVar.A0(((Long) obj).longValue());
                break;
            case 7:
                nVar.y0(((Integer) obj).intValue());
                break;
            case 8:
                nVar.o0(((Boolean) obj).booleanValue());
                break;
            case 9:
                nVar.E0((MessageLite) obj);
                break;
            case 10:
                nVar.K0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    nVar.U0((String) obj);
                } else {
                    nVar.s0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    nVar.p0((byte[]) obj);
                } else {
                    nVar.s0((ByteString) obj);
                }
                break;
            case 13:
                nVar.X0(((Integer) obj).intValue());
                break;
            case 14:
                nVar.O0(((Integer) obj).intValue());
                break;
            case 15:
                nVar.P0(((Long) obj).longValue());
                break;
            case 16:
                nVar.R0(((Integer) obj).intValue());
                break;
            case 17:
                nVar.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof j0.c)) {
                    nVar.w0(((Integer) obj).intValue());
                } else {
                    nVar.w0(((j0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void Q(c cVar, Object obj, n nVar) {
        z2.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof m0) {
                O(nVar, liteType, number, ((m0) obj).d());
                return;
            } else {
                O(nVar, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O(nVar, liteType, number, it.next());
            }
            return;
        }
        nVar.V0(number, 2);
        Iterator it2 = list.iterator();
        int iO = 0;
        while (it2.hasNext()) {
            iO += o(liteType, it2.next());
        }
        nVar.N0(iO);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            P(nVar, liteType, it3.next());
        }
    }

    private void S(Map.Entry entry, n nVar) {
        c cVar = (c) entry.getKey();
        if (cVar.getLiteJavaType() != z2.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
            Q(cVar, entry.getValue(), nVar);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof m0) {
            value = ((m0) value).d();
        }
        nVar.L0(((c) entry.getKey()).getNumber(), (MessageLite) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b2 k(b2 b2Var, boolean z10) {
        b2 b2VarO = b2.o(16);
        for (int i10 = 0; i10 < b2Var.i(); i10++) {
            l(b2VarO, b2Var.h(i10), z10);
        }
        Iterator it = b2Var.k().iterator();
        while (it.hasNext()) {
            l(b2VarO, (Map.Entry) it.next(), z10);
        }
        return b2VarO;
    }

    private static void l(Map map, Map.Entry entry, boolean z10) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof m0) {
            map.put(cVar, ((m0) value).d());
        } else if (z10 && (value instanceof List)) {
            map.put(cVar, new ArrayList((List) value));
        } else {
            map.put(cVar, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object m(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int n(z2.b bVar, int i10, Object obj) {
        int iX = n.X(i10);
        if (bVar == z2.b.f19482m) {
            iX *= 2;
        }
        return iX + o(bVar, obj);
    }

    static int o(z2.b bVar, Object obj) {
        switch (a.f18893b[bVar.ordinal()]) {
            case 1:
                return n.k(((Double) obj).doubleValue());
            case 2:
                return n.s(((Float) obj).floatValue());
            case 3:
                return n.A(((Long) obj).longValue());
            case 4:
                return n.b0(((Long) obj).longValue());
            case 5:
                return n.y(((Integer) obj).intValue());
            case 6:
                return n.q(((Long) obj).longValue());
            case 7:
                return n.o(((Integer) obj).intValue());
            case 8:
                return n.f(((Boolean) obj).booleanValue());
            case 9:
                return n.v((MessageLite) obj);
            case 10:
                return obj instanceof m0 ? n.D((m0) obj) : n.I((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? n.i((ByteString) obj) : n.W((String) obj);
            case 12:
                return obj instanceof ByteString ? n.i((ByteString) obj) : n.g((byte[]) obj);
            case 13:
                return n.Z(((Integer) obj).intValue());
            case 14:
                return n.O(((Integer) obj).intValue());
            case 15:
                return n.Q(((Long) obj).longValue());
            case 16:
                return n.S(((Integer) obj).intValue());
            case 17:
                return n.U(((Long) obj).longValue());
            case 18:
                return obj instanceof j0.c ? n.m(((j0.c) obj).getNumber()) : n.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int p(c cVar, Object obj) {
        z2.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return n(liteType, number, obj);
        }
        int iN = 0;
        if (cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iN += o(liteType, it.next());
            }
            return n.X(number) + iN + n.M(iN);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iN += n(liteType, number, it2.next());
        }
        return iN;
    }

    public static c0 q() {
        return f18888d;
    }

    private int u(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        return (cVar.getLiteJavaType() != z2.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) ? p(cVar, value) : value instanceof m0 ? n.B(((c) entry.getKey()).getNumber(), (m0) value) : n.F(((c) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static int y(z2.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    public boolean A() {
        return this.f18890b;
    }

    public boolean B() {
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            if (!C(this.f18889a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f18889a.k().iterator();
        while (it.hasNext()) {
            if (!C((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator E() {
        return this.f18891c ? new m0.c(this.f18889a.entrySet().iterator()) : this.f18889a.entrySet().iterator();
    }

    public void F() {
        if (this.f18890b) {
            return;
        }
        this.f18889a.n();
        this.f18890b = true;
    }

    public void G(c0 c0Var) {
        for (int i10 = 0; i10 < c0Var.f18889a.i(); i10++) {
            H(c0Var.f18889a.h(i10));
        }
        Iterator it = c0Var.f18889a.k().iterator();
        while (it.hasNext()) {
            H((Map.Entry) it.next());
        }
    }

    public void L(c cVar, Object obj) {
        if (!cVar.isRepeated()) {
            N(cVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                N(cVar, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof m0) {
            this.f18891c = true;
        }
        this.f18889a.p(cVar, obj);
    }

    public void M(c cVar, int i10, Object obj) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objS = s(cVar);
        if (objS == null) {
            throw new IndexOutOfBoundsException();
        }
        N(cVar, obj);
        ((List) objS).set(i10, obj);
    }

    public void R(n nVar) {
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            S(this.f18889a.h(i10), nVar);
        }
        Iterator it = this.f18889a.k().iterator();
        while (it.hasNext()) {
            S((Map.Entry) it.next(), nVar);
        }
    }

    public void T(n nVar) {
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            Map.Entry entryH = this.f18889a.h(i10);
            Q((c) entryH.getKey(), entryH.getValue(), nVar);
        }
        for (Map.Entry entry : this.f18889a.k()) {
            Q((c) entry.getKey(), entry.getValue(), nVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f18889a.equals(((c0) obj).f18889a);
        }
        return false;
    }

    public void g(c cVar, Object obj) {
        List arrayList;
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        N(cVar, obj);
        Object objS = s(cVar);
        if (objS == null) {
            arrayList = new ArrayList();
            this.f18889a.p(cVar, arrayList);
        } else {
            arrayList = (List) objS;
        }
        arrayList.add(obj);
    }

    public void h() {
        this.f18889a.clear();
        this.f18891c = false;
    }

    public int hashCode() {
        return this.f18889a.hashCode();
    }

    public void i(c cVar) {
        this.f18889a.remove(cVar);
        if (this.f18889a.isEmpty()) {
            this.f18891c = false;
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c0 clone() {
        c0 c0VarJ = J();
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            Map.Entry entryH = this.f18889a.h(i10);
            c0VarJ.L((c) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f18889a.k()) {
            c0VarJ.L((c) entry.getKey(), entry.getValue());
        }
        c0VarJ.f18891c = this.f18891c;
        return c0VarJ;
    }

    public Map r() {
        if (!this.f18891c) {
            return this.f18889a.m() ? this.f18889a : DesugarCollections.unmodifiableMap(this.f18889a);
        }
        b2 b2VarK = k(this.f18889a, false);
        if (this.f18889a.m()) {
            b2VarK.n();
        }
        return b2VarK;
    }

    public Object s(c cVar) {
        Object obj = this.f18889a.get(cVar);
        return obj instanceof m0 ? ((m0) obj).d() : obj;
    }

    public int t() {
        int iU = 0;
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            iU += u(this.f18889a.h(i10));
        }
        Iterator it = this.f18889a.k().iterator();
        while (it.hasNext()) {
            iU += u((Map.Entry) it.next());
        }
        return iU;
    }

    public Object v(c cVar, int i10) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objS = s(cVar);
        if (objS != null) {
            return ((List) objS).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int w(c cVar) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objS = s(cVar);
        if (objS == null) {
            return 0;
        }
        return ((List) objS).size();
    }

    public int x() {
        int iP = 0;
        for (int i10 = 0; i10 < this.f18889a.i(); i10++) {
            Map.Entry entryH = this.f18889a.h(i10);
            iP += p((c) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f18889a.k()) {
            iP += p((c) entry.getKey(), entry.getValue());
        }
        return iP;
    }

    public boolean z(c cVar) {
        if (cVar.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f18889a.get(cVar) != null;
    }

    private c0() {
        this.f18889a = b2.o(16);
    }

    private c0(boolean z10) {
        this(b2.o(0));
        F();
    }

    private c0(b2 b2Var) {
        this.f18889a = b2Var;
        F();
    }
}
