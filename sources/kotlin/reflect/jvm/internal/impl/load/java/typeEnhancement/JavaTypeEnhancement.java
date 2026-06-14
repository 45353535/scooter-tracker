package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaTypeEnhancement {

    @NotNull
    private final JavaResolverSettings javaResolverSettings;

    private static final class Result {
        private final int subtreeSize;

        @Nullable
        private final KotlinType type;

        public Result(@Nullable KotlinType kotlinType, int i10) {
            this.type = kotlinType;
            this.subtreeSize = i10;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        @Nullable
        public final KotlinType getType() {
            return this.type;
        }
    }

    private static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;

        @Nullable
        private final SimpleType type;

        public SimpleResult(@Nullable SimpleType simpleType, int i10, boolean z10) {
            this.type = simpleType;
            this.subtreeSize = i10;
            this.forWarnings = z10;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        @Nullable
        public final SimpleType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        TypeConstructor constructor;
        Boolean bool;
        Result result;
        TypeProjection typeProjectionMakeStarProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z12 = (z11 && z10) ? false : true;
        KotlinType kotlinType = null;
        if (!zShouldEnhance && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = simpleType.getConstructor().mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor == null) {
            return new SimpleResult(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function12.invoke(Integer.valueOf(i10));
        ClassifierDescriptor classifierDescriptorEnhanceMutability = TypeEnhancementKt.enhanceMutability(classifierDescriptorMo8663getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean enhancedNullability = TypeEnhancementKt.getEnhancedNullability(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorEnhanceMutability == null || (constructor = classifierDescriptorEnhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        int subtreeSize = i10 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arguments, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z12) {
                bool = enhancedNullability;
                if (!typeProjection.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function12, subtreeSize, z11);
                } else if (function12.invoke(Integer.valueOf(subtreeSize)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
            } else {
                bool = enhancedNullability;
                result = new Result(kotlinType, 0);
            }
            subtreeSize += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type = result.getType();
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorEnhanceMutability == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorEnhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type2 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            function12 = function1;
            enhancedNullability = bool;
            kotlinType = null;
        }
        Boolean bool2 = enhancedNullability;
        int i11 = subtreeSize - i10;
        if (classifierDescriptorEnhanceMutability == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((TypeProjection) it3.next()) == null) {
                    }
                }
            }
            return new SimpleResult(null, i11, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        EnhancedTypeAnnotations enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (classifierDescriptorEnhanceMutability == null) {
            enhancedTypeAnnotations = null;
        }
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, enhancedTypeAnnotations, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null})));
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (javaTypeQualifiersInvoke.getDefinitelyNotNull()) {
            simpleTypeSimpleType$default = notNullTypeParameter(simpleTypeSimpleType$default);
        }
        return new SimpleResult(simpleTypeSimpleType$default, i11, bool2 != null && javaTypeQualifiersInvoke.isNullabilityQualifierForWarning());
    }

    static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i10, typeComponentPosition, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.jvm.functions.Function1, int, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result");
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        return this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z10) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z10).getType();
    }
}
