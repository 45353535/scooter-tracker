package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import com.google.gson.internal.TroubleshootingGuide;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes9.dex */
public class ReflectionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RecordHelper f33711a;

    private static abstract class RecordHelper {
        private RecordHelper() {
        }

        abstract String[] a(Class cls);

        abstract boolean b(Class cls);

        public abstract Method getAccessor(Class<?> cls, Field field);

        abstract Constructor getCanonicalRecordConstructor(Class cls);
    }

    private static class RecordNotSupportedHelper extends RecordHelper {
        private RecordNotSupportedHelper() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] a(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean b(Class cls) {
            return false;
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        Constructor getCanonicalRecordConstructor(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }

    private static class RecordSupportedHelper extends RecordHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f33712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f33713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f33714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f33715d;

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        String[] a(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f33713b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f33714c.invoke(objArr[i10], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw ReflectionHelper.c(e10);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean b(Class cls) {
            try {
                return ((Boolean) this.f33712a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw ReflectionHelper.c(e10);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e10) {
                throw ReflectionHelper.c(e10);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f33713b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f33715d.invoke(objArr[i10], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw ReflectionHelper.c(e10);
            }
        }

        private RecordSupportedHelper() throws ClassNotFoundException {
            super();
            this.f33712a = Class.class.getMethod("isRecord", null);
            this.f33713b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f33714c = cls.getMethod("getName", null);
            this.f33715d = cls.getMethod("getType", null);
        }
    }

    static {
        RecordHelper recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (ReflectiveOperationException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        f33711a = recordNotSupportedHelper;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException c(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    private static String d(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + TroubleshootingGuide.createUrl((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z10 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return f33711a.getAccessor(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return f33711a.getCanonicalRecordConstructor(cls);
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return f33711a.a(cls);
    }

    public static boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        if (isStatic(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public static boolean isRecord(Class<?> cls) {
        return f33711a.b(cls);
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new JsonIOException("Failed making " + getAccessibleObjectDescription(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + d(e10), e10);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + d(e10);
        }
    }
}
