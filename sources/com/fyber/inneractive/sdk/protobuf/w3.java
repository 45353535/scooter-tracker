package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f23615a;

    public w3(Unsafe unsafe) {
        this.f23615a = unsafe;
    }

    public abstract byte a(long j10);

    public abstract void a(long j10, byte[] bArr, long j11);

    public abstract void a(Object obj, long j10, byte b10);

    public abstract void a(Object obj, long j10, double d10);

    public abstract void a(Object obj, long j10, float f10);

    public abstract void a(Object obj, long j10, boolean z10);

    public boolean a() {
        Unsafe unsafe = this.f23615a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
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
            x3.a(th2);
            return false;
        }
    }

    public abstract boolean a(Object obj, long j10);

    public abstract byte b(Object obj, long j10);

    public abstract boolean b();

    public abstract double c(Object obj, long j10);

    public abstract float d(Object obj, long j10);
}
