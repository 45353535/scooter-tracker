package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final class v3 extends w3 {
    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f23615a.getClass();
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
            x3.a(th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[PHI: r7
  0x003d: PHI (r7v9 java.lang.reflect.Field) = (r7v5 java.lang.reflect.Field), (r7v12 java.lang.reflect.Field) binds: [B:22:0x0050, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r12 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            java.lang.String r3 = "copyMemory"
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class r5 = java.lang.Long.TYPE
            java.lang.String r6 = "getLong"
            sun.misc.Unsafe r7 = r12.f23615a
            r8 = 0
            if (r7 != 0) goto L12
            goto Lbf
        L12:
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = "objectFieldOffset"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<java.lang.reflect.Field> r11 = java.lang.reflect.Field.class
            r10[r8] = r11     // Catch: java.lang.Throwable -> L3f
            r7.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L3f
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3f
            r9[r8] = r4     // Catch: java.lang.Throwable -> L3f
            r9[r2] = r5     // Catch: java.lang.Throwable -> L3f
            r7.getMethod(r6, r9)     // Catch: java.lang.Throwable -> L3f
            boolean r7 = com.fyber.inneractive.sdk.protobuf.d.a()     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<java.nio.Buffer> r9 = java.nio.Buffer.class
            r10 = 0
            if (r7 == 0) goto L42
            java.lang.String r7 = "effectiveDirectAddress"
            java.lang.reflect.Field r7 = r9.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L3a
            goto L3b
        L3a:
            r7 = r10
        L3b:
            if (r7 == 0) goto L42
        L3d:
            r10 = r7
            goto L53
        L3f:
            r0 = move-exception
            goto Lbc
        L42:
            java.lang.String r7 = "address"
            java.lang.reflect.Field r7 = r9.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L49
            goto L4a
        L49:
            r7 = r10
        L4a:
            if (r7 == 0) goto L53
            java.lang.Class r9 = r7.getType()     // Catch: java.lang.Throwable -> L3f
            if (r9 != r5) goto L53
            goto L3d
        L53:
            if (r10 != 0) goto L56
            goto Lbf
        L56:
            sun.misc.Unsafe r7 = r12.f23615a     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "getByte"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb7
            r10[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "putByte"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Lb7
            r10[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class r11 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> Lb7
            r10[r2] = r11     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "getInt"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb7
            r10[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "putInt"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Lb7
            r10[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb7
            r10[r2] = r11     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb7
            r9[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r6, r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "putLong"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> Lb7
            r9[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            r9[r2] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r6, r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lb7
            r6[r8] = r5     // Catch: java.lang.Throwable -> Lb7
            r6[r2] = r5     // Catch: java.lang.Throwable -> Lb7
            r6[r1] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r3, r6)     // Catch: java.lang.Throwable -> Lb7
            r6 = 5
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> Lb7
            r6[r8] = r4     // Catch: java.lang.Throwable -> Lb7
            r6[r2] = r5     // Catch: java.lang.Throwable -> Lb7
            r6[r1] = r4     // Catch: java.lang.Throwable -> Lb7
            r6[r0] = r5     // Catch: java.lang.Throwable -> Lb7
            r0 = 4
            r6[r0] = r5     // Catch: java.lang.Throwable -> Lb7
            r7.getMethod(r3, r6)     // Catch: java.lang.Throwable -> Lb7
            return r2
        Lb7:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
            return r8
        Lbc:
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
        Lbf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v3.b():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return this.f23615a.getDouble(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return this.f23615a.getFloat(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        this.f23615a.putByte(obj, j10, b10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return this.f23615a.getBoolean(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        this.f23615a.putBoolean(obj, j10, z10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f23615a.putFloat(obj, j10, f10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f23615a.putDouble(obj, j10, d10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        return this.f23615a.getByte(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        this.f23615a.copyMemory((Object) null, j10, bArr, x3.f23632f, j11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return this.f23615a.getByte(obj, j10);
    }
}
