package j$.sun.misc;

import j$.util.concurrent.k;
import j$.util.concurrent.p;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f84516b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f84517a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f84516b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    public a(Unsafe unsafe) {
        this.f84517a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int e(p pVar, long j10) {
        while (true) {
            int intVolatile = this.f84517a.getIntVolatile(pVar, j10);
            p pVar2 = pVar;
            long j11 = j10;
            if (this.f84517a.compareAndSwapInt(pVar2, j11, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            pVar = pVar2;
            j10 = j11;
        }
    }

    public final long i(Field field) {
        return this.f84517a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final int a() {
        return this.f84517a.arrayBaseOffset(k[].class);
    }

    public final int b() {
        return this.f84517a.arrayIndexScale(k[].class);
    }

    public final Object f(Object obj, long j10) {
        return this.f84517a.getObjectVolatile(obj, j10);
    }

    public final void j(Object obj, long j10, k kVar) {
        this.f84517a.putObjectVolatile(obj, j10, kVar);
    }

    public final boolean c(Object obj, long j10, int i10, int i11) {
        return this.f84517a.compareAndSwapInt(obj, j10, i10, i11);
    }

    public final boolean d(Object obj, long j10, long j11, long j12) {
        return this.f84517a.compareAndSwapLong(obj, j10, j11, j12);
    }
}
