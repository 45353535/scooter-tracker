package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public abstract class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f23627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f23628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f23629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f23630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f23631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f23632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f23633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f23634h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[PHI: r4
  0x00a2: PHI (r4v20 java.lang.reflect.Field) = (r4v18 java.lang.reflect.Field), (r4v23 java.lang.reflect.Field) binds: [B:39:0x00b2, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    static {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.x3.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f23631e) {
            return f23629c.f23615a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f23631e) {
            f23629c.f23615a.arrayIndexScale(cls);
        }
    }

    public static int c(Object obj, long j10) {
        return f23629c.f23615a.getInt(obj, j10);
    }

    public static long d(Object obj, long j10) {
        return f23629c.f23615a.getLong(obj, j10);
    }

    public static Object e(Object obj, long j10) {
        return f23629c.f23615a.getObject(obj, j10);
    }

    public static void a(Object obj, long j10, int i10) {
        f23629c.f23615a.putInt(obj, j10, i10);
    }

    public static byte b(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f23628b;
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

    public static void b(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (c(obj, j11) & (~(255 << i10))));
    }

    public static void a(Object obj, long j10, long j11) {
        f23629c.f23615a.putLong(obj, j10, j11);
    }

    public static void a(long j10, Object obj, Object obj2) {
        f23629c.f23615a.putObject(obj, j10, obj2);
    }

    public static byte a(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static void a(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = c(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }
}
