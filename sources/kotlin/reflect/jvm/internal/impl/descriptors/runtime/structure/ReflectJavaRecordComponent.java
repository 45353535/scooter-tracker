package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    @NotNull
    private final Object recordComponent;

    public ReflectJavaRecordComponent(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.recordComponent = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Member getMember() throws IllegalAccessException, InvocationTargetException {
        Method methodLoadGetAccessor = Java16RecordComponentsLoader.INSTANCE.loadGetAccessor(this.recordComponent);
        if (methodLoadGetAccessor != null) {
            return methodLoadGetAccessor;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    @NotNull
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsLoadGetType = Java16RecordComponentsLoader.INSTANCE.loadGetType(this.recordComponent);
        if (clsLoadGetType != null) {
            return new ReflectJavaClassifierType(clsLoadGetType);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}
