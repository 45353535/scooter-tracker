package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.properties.d;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationsTypeAttributeKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    @NotNull
    private static final d annotationsAttribute$delegate;

    static {
        d dVarGenerateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(v0.b(AnnotationsTypeAttribute.class));
        Intrinsics.checkNotNull(dVarGenerateNullableAccessor, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        annotationsAttribute$delegate = dVarGenerateNullableAccessor;
    }

    @NotNull
    public static final Annotations getAnnotations(@NotNull TypeAttributes typeAttributes) {
        Annotations annotations;
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    @Nullable
    public static final AnnotationsTypeAttribute getAnnotationsAttribute(@NotNull TypeAttributes typeAttributes) {
        Intrinsics.checkNotNullParameter(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) annotationsAttribute$delegate.getValue(typeAttributes, $$delegatedProperties[0]);
    }
}
