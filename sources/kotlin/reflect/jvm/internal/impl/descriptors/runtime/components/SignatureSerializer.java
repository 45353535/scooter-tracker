package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class SignatureSerializer {

    @NotNull
    public static final SignatureSerializer INSTANCE = new SignatureSerializer();

    private SignatureSerializer() {
    }

    @NotNull
    public final String constructorDesc(@NotNull Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = i.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String fieldDesc(@NotNull Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return ReflectClassUtilKt.getDesc(type);
    }

    @NotNull
    public final String methodDesc(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = i.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.checkNotNull(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
