package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(JavaDeprecatedAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    @NotNull
    private final NotNullLazyValue allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(@Nullable JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext c10) {
        super(c10, javaAnnotation, StandardNames.FqNames.deprecated);
        Intrinsics.checkNotNullParameter(c10, "c");
        this.allValueArguments$delegate = c10.getStorageManager().createLazyValue(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$$Lambda$0
            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return JavaDeprecatedAnnotationDescriptor.allValueArguments_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0() {
        return MapsKt.mapOf(TuplesKt.to(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }
}
