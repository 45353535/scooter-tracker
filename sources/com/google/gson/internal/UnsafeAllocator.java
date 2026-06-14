package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = c();

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strV = ConstructorConstructor.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    private static UnsafeAllocator c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.1
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            UnsafeAllocator.b(cls2);
                            return (T) method.invoke(obj, cls2);
                        }
                    };
                } catch (Exception unused) {
                    return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.4
                        @Override // com.google.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls2 + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                        }
                    };
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.2
                    @Override // com.google.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls2) throws Exception {
                        UnsafeAllocator.b(cls2);
                        return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(iIntValue));
                    }
                };
            }
        } catch (Exception unused3) {
            final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new UnsafeAllocator() { // from class: com.google.gson.internal.UnsafeAllocator.3
                @Override // com.google.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls2) throws Exception {
                    UnsafeAllocator.b(cls2);
                    return (T) declaredMethod3.invoke(null, cls2, Object.class);
                }
            };
        }
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
