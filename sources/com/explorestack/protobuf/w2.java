package com.explorestack.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f19435a = I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f19436b = com.explorestack.protobuf.d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f19437c = q(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f19438d = q(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f19439e = F();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f19440f = Z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f19441g = Y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final long f19442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f19443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f19444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f19445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f19446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f19447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f19448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f19449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f19450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f19451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f19452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f19453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f19454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f19455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f19456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final boolean f19457w;

    static class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean d(Object obj, long j10) {
            return w2.f19457w ? w2.u(obj, j10) : w2.v(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte f(Object obj, long j10) {
            return w2.f19457w ? w2.y(obj, j10) : w2.z(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public Object m(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void o(Object obj, long j10, boolean z10) {
            if (w2.f19457w) {
                w2.O(obj, j10, z10);
            } else {
                w2.P(obj, j10, z10);
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void p(Object obj, long j10, byte b10) {
            if (w2.f19457w) {
                w2.R(obj, j10, b10);
            } else {
                w2.S(obj, j10, b10);
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void q(Object obj, long j10, double d10) {
            t(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public void r(Object obj, long j10, float f10) {
            s(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean w() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean d(Object obj, long j10) {
            return w2.f19457w ? w2.u(obj, j10) : w2.v(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte f(Object obj, long j10) {
            return w2.f19457w ? w2.y(obj, j10) : w2.z(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.explorestack.protobuf.w2.e
        public Object m(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void o(Object obj, long j10, boolean z10) {
            if (w2.f19457w) {
                w2.O(obj, j10, z10);
            } else {
                w2.P(obj, j10, z10);
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void p(Object obj, long j10, byte b10) {
            if (w2.f19457w) {
                w2.R(obj, j10, b10);
            } else {
                w2.S(obj, j10, b10);
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public void q(Object obj, long j10, double d10) {
            t(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public void r(Object obj, long j10, float f10) {
            s(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean w() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f19458a.copyMemory((Object) null, j10, bArr, w2.f19442h + j11, j12);
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean d(Object obj, long j10) {
            return this.f19458a.getBoolean(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte e(long j10) {
            return this.f19458a.getByte(j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public byte f(Object obj, long j10) {
            return this.f19458a.getByte(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public double g(Object obj, long j10) {
            return this.f19458a.getDouble(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public float h(Object obj, long j10) {
            return this.f19458a.getFloat(obj, j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public long j(long j10) {
            return this.f19458a.getLong(j10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public Object m(java.lang.reflect.Field field) {
            return l(this.f19458a.staticFieldBase(field), this.f19458a.staticFieldOffset(field));
        }

        @Override // com.explorestack.protobuf.w2.e
        public void o(Object obj, long j10, boolean z10) {
            this.f19458a.putBoolean(obj, j10, z10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void p(Object obj, long j10, byte b10) {
            this.f19458a.putByte(obj, j10, b10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void q(Object obj, long j10, double d10) {
            this.f19458a.putDouble(obj, j10, d10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public void r(Object obj, long j10, float f10) {
            this.f19458a.putFloat(obj, j10, f10);
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f19458a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                w2.L(th2);
                return false;
            }
        }

        @Override // com.explorestack.protobuf.w2.e
        public boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f19458a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                w2.L(th2);
                return false;
            }
        }
    }

    private static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Unsafe f19458a;

        e(Unsafe unsafe) {
            this.f19458a = unsafe;
        }

        public final int a(Class cls) {
            return this.f19458a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f19458a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f19458a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f19458a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f19458a.getObject(obj, j10);
        }

        public abstract Object m(java.lang.reflect.Field field);

        public final long n(java.lang.reflect.Field field) {
            return this.f19458a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z10);

        public abstract void p(Object obj, long j10, byte b10);

        public abstract void q(Object obj, long j10, double d10);

        public abstract void r(Object obj, long j10, float f10);

        public final void s(Object obj, long j10, int i10) {
            this.f19458a.putInt(obj, j10, i10);
        }

        public final void t(Object obj, long j10, long j11) {
            this.f19458a.putLong(obj, j10, j11);
        }

        public final void u(Object obj, long j10, Object obj2) {
            this.f19458a.putObject(obj, j10, obj2);
        }

        public boolean v() {
            Unsafe unsafe = this.f19458a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                w2.L(th2);
                return false;
            }
        }

        public boolean w() {
            Unsafe unsafe = this.f19458a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return w2.o() != null;
            } catch (Throwable th2) {
                w2.L(th2);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f19442h = jM;
        f19443i = m(boolean[].class);
        f19444j = n(boolean[].class);
        f19445k = m(int[].class);
        f19446l = n(int[].class);
        f19447m = m(long[].class);
        f19448n = n(long[].class);
        f19449o = m(float[].class);
        f19450p = n(float[].class);
        f19451q = m(double[].class);
        f19452r = n(double[].class);
        f19453s = m(Object[].class);
        f19454t = n(Object[].class);
        f19455u = s(o());
        f19456v = (int) (jM & 7);
        f19457w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static double A(Object obj, long j10) {
        return f19439e.g(obj, j10);
    }

    static float B(Object obj, long j10) {
        return f19439e.h(obj, j10);
    }

    static int C(Object obj, long j10) {
        return f19439e.i(obj, j10);
    }

    static long D(long j10) {
        return f19439e.j(j10);
    }

    static long E(Object obj, long j10) {
        return f19439e.k(obj, j10);
    }

    private static e F() {
        Unsafe unsafe = f19435a;
        if (unsafe == null) {
            return null;
        }
        if (!com.explorestack.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f19437c) {
            return new c(unsafe);
        }
        if (f19438d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j10) {
        return f19439e.l(obj, j10);
    }

    static Object H(java.lang.reflect.Field field) {
        return f19439e.m(field);
    }

    static Unsafe I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean J() {
        return f19441g;
    }

    static boolean K() {
        return f19440f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Throwable th2) {
        Logger.getLogger(w2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static long M(java.lang.reflect.Field field) {
        return f19439e.n(field);
    }

    static void N(Object obj, long j10, boolean z10) {
        f19439e.o(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(Object obj, long j10, boolean z10) {
        R(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, boolean z10) {
        S(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void Q(byte[] bArr, long j10, byte b10) {
        f19439e.p(bArr, f19442h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = C(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        V(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        V(obj, j11, ((255 & b10) << i10) | (C(obj, j11) & (~(255 << i10))));
    }

    static void T(Object obj, long j10, double d10) {
        f19439e.q(obj, j10, d10);
    }

    static void U(Object obj, long j10, float f10) {
        f19439e.r(obj, j10, f10);
    }

    static void V(Object obj, long j10, int i10) {
        f19439e.s(obj, j10, i10);
    }

    static void W(Object obj, long j10, long j11) {
        f19439e.t(obj, j10, j11);
    }

    static void X(Object obj, long j10, Object obj2) {
        f19439e.u(obj, j10, obj2);
    }

    private static boolean Y() {
        e eVar = f19439e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    private static boolean Z() {
        e eVar = f19439e;
        if (eVar == null) {
            return false;
        }
        return eVar.w();
    }

    static long k(ByteBuffer byteBuffer) {
        return f19439e.k(byteBuffer, f19455u);
    }

    static Object l(Class cls) {
        try {
            return f19435a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class cls) {
        if (f19441g) {
            return f19439e.a(cls);
        }
        return -1;
    }

    private static int n(Class cls) {
        if (f19441g) {
            return f19439e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field o() {
        java.lang.reflect.Field fieldR;
        if (com.explorestack.protobuf.d.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        java.lang.reflect.Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    static void p(long j10, byte[] bArr, long j11, long j12) {
        f19439e.c(j10, bArr, j11, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean q(Class cls) {
        if (!com.explorestack.protobuf.d.c()) {
            return false;
        }
        try {
            Class cls2 = f19436b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(java.lang.reflect.Field field) {
        e eVar;
        if (field == null || (eVar = f19439e) == null) {
            return -1L;
        }
        return eVar.n(field);
    }

    static boolean t(Object obj, long j10) {
        return f19439e.d(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j10) {
        return y(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    static byte w(long j10) {
        return f19439e.e(j10);
    }

    static byte x(byte[] bArr, long j10) {
        return f19439e.f(bArr, f19442h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }
}
