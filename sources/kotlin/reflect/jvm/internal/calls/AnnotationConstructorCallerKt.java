package kotlin.reflect.jvm.internal.calls;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import lf.i;
import org.jetbrains.annotations.NotNull;
import xf.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001aI\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"transformKotlinToJvm", "", "expectedType", "Ljava/lang/Class;", "throwIllegalArgumentType", "", FirebaseAnalytics.Param.INDEX, "", "name", "", "expectedJvmType", "createAnnotationInstance", "T", "annotationClass", "values", "", POBCoreNativeConstants.NATIVE_METHODS, "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnnotationConstructorCallerKt {
    @NotNull
    public static final <T> T createAnnotationInstance(@NotNull final Class<T> annotationClass, @NotNull final Map<String, ? extends Object> values, @NotNull final List<Method> methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        final Lazy lazyA = i.a(new Function0(values) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$0
            private final Map arg$0;

            {
                this.arg$0 = values;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Integer.valueOf(AnnotationConstructorCallerKt.createAnnotationInstance$lambda$3(this.arg$0));
            }
        });
        final Lazy lazyA2 = i.a(new Function0(annotationClass, values) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$1
            private final Class arg$0;
            private final Map arg$1;

            {
                this.arg$0 = annotationClass;
                this.arg$1 = values;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return AnnotationConstructorCallerKt.createAnnotationInstance$lambda$7(this.arg$0, this.arg$1);
            }
        });
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new InvocationHandler(annotationClass, values, lazyA2, lazyA, methods) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$2
            private final Class arg$0;
            private final Map arg$1;
            private final Lazy arg$2;
            private final Lazy arg$3;
            private final List arg$4;

            {
                this.arg$0 = annotationClass;
                this.arg$1 = values;
                this.arg$2 = lazyA2;
                this.arg$3 = lazyA;
                this.arg$4 = methods;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                return AnnotationConstructorCallerKt.createAnnotationInstance$lambda$9(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, obj, method, objArr);
            }
        });
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> boolean createAnnotationInstance$equals(java.lang.Class<T> r5, java.util.List<java.lang.reflect.Method> r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance$equals(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createAnnotationInstance$lambda$3(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    private static final int createAnnotationInstance$lambda$4(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createAnnotationInstance$lambda$7(Class cls, Map map) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        CollectionsKt___CollectionsKt.joinTo(map.entrySet(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (124 & 64) != 0 ? null : new Function1() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$3
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AnnotationConstructorCallerKt.createAnnotationInstance$lambda$7$lambda$6$lambda$5((Map.Entry) obj);
            }
        });
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createAnnotationInstance$lambda$7$lambda$6$lambda$5(Map.Entry entry) {
        String string;
        Intrinsics.checkNotNullParameter(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + D5.T + string;
    }

    private static final String createAnnotationInstance$lambda$8(Lazy lazy) {
        return (String) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAnnotationInstance$lambda$9(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(createAnnotationInstance$lambda$4(lazy2));
                }
            } else if (name.equals("toString")) {
                return createAnnotationInstance$lambda$8(lazy);
            }
        }
        if (Intrinsics.areEqual(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(createAnnotationInstance$equals(cls, list, map, ArraysKt.single(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(ArraysKt.toList(objArr));
        sb2.append(')');
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void throwIllegalArgumentType(int i10, String str, Class<?> cls) {
        String qualifiedName;
        KClass kClassB = Intrinsics.areEqual(cls, Class.class) ? v0.b(KClass.class) : (cls.isArray() && Intrinsics.areEqual(cls.getComponentType(), Class.class)) ? v0.b(KClass[].class) : a.e(cls);
        if (Intrinsics.areEqual(kClassB.getQualifiedName(), v0.b(Object[].class).getQualifiedName())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kClassB.getQualifiedName());
            sb2.append('<');
            Class<?> componentType = a.b(kClassB).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            sb2.append(a.e(componentType).getQualifiedName());
            sb2.append('>');
            qualifiedName = sb2.toString();
        } else {
            qualifiedName = kClassB.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + qualifiedName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = a.b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(a.b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
