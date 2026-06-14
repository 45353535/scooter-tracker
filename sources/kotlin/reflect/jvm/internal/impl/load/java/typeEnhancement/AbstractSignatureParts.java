package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class TypeAndDefaultQualifiers {

        @Nullable
        private final JavaTypeQualifiersByElementType defaultQualifiers;

        @Nullable
        private final KotlinTypeMarker type;

        @Nullable
        private final TypeParameterMarker typeParameterForArgument;

        public TypeAndDefaultQualifiers(@Nullable KotlinTypeMarker kotlinTypeMarker, @Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @Nullable TypeParameterMarker typeParameterMarker) {
            this.type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }

        @Nullable
        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.defaultQualifiers;
        }

        @Nullable
        public final KotlinTypeMarker getType() {
            return this.type;
        }

        @Nullable
        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.typeParameterForArgument;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiers computeIndexedQualifiers$lambda$18(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i10) {
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        return (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i10] : javaTypeQualifiers;
    }

    private final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers extractQualifiers(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            nullabilityQualifier = enhancedForWarnings != null ? getNullabilityQualifier(enhancedForWarnings) : null;
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) || isNotNullTypeParameterCompat(kotlinTypeMarker), nullabilityQualifier != nullabilityQualifier2);
    }

    private final JavaTypeQualifiers extractQualifiersFromAnnotations(final TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        List listEmptyList;
        NullabilityQualifierWithMigrationStatus boundsNullability;
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        if (typeAndDefaultQualifiers.getType() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker typeParameterForArgument = typeAndDefaultQualifiers.getTypeParameterForArgument();
            if ((typeParameterForArgument != null ? typeSystem.getVariance(typeParameterForArgument) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z10 = false;
        boolean z11 = typeAndDefaultQualifiers.getTypeParameterForArgument() == null;
        KotlinTypeMarker type2 = typeAndDefaultQualifiers.getType();
        if (type2 == null || (listEmptyList = getAnnotations(type2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker type3 = typeAndDefaultQualifiers.getType();
        TypeParameterMarker typeParameterClassifier = (type3 == null || (typeConstructorMarkerTypeConstructor = typeSystem2.typeConstructor(type3)) == null) ? null : typeSystem2.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        boolean z12 = getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !getEnableImprovementsInStrictMode() || (type = typeAndDefaultQualifiers.getType()) == null || !isArrayOrPrimitiveArray(type)) {
                listEmptyList = CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) listEmptyList);
            } else {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listEmptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList);
            }
        }
        MutabilityQualifier mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(listEmptyList);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability((Iterable) listEmptyList, (Function1) new Function1(this, typeAndDefaultQualifiers) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$0
            private final AbstractSignatureParts arg$0;
            private final AbstractSignatureParts.TypeAndDefaultQualifiers arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = typeAndDefaultQualifiers;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(AbstractSignatureParts.extractQualifiersFromAnnotations$lambda$6(this.arg$0, this.arg$1, obj));
            }
        });
        if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
            NullabilityQualifier qualifier = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
            if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterClassifier != null) {
                z10 = true;
            }
            return new JavaTypeQualifiers(qualifier, mutabilityQualifierExtractMutability, z10, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
        }
        AnnotationQualifierApplicabilityType containerApplicabilityType = (z11 || z12) ? getContainerApplicabilityType() : AnnotationQualifierApplicabilityType.TYPE_USE;
        JavaTypeQualifiersByElementType defaultQualifiers = typeAndDefaultQualifiers.getDefaultQualifiers();
        JavaDefaultQualifiers javaDefaultQualifiers = defaultQualifiers != null ? defaultQualifiers.get(containerApplicabilityType) : null;
        NullabilityQualifierWithMigrationStatus boundsNullability2 = typeParameterClassifier != null ? getBoundsNullability(typeParameterClassifier) : null;
        NullabilityQualifierWithMigrationStatus defaultNullability = getDefaultNullability(boundsNullability2, javaDefaultQualifiers);
        boolean z13 = (boundsNullability2 != null ? boundsNullability2.getQualifier() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull());
        TypeParameterMarker typeParameterForArgument2 = typeAndDefaultQualifiers.getTypeParameterForArgument();
        if (typeParameterForArgument2 == null || (boundsNullability = getBoundsNullability(typeParameterForArgument2)) == null) {
            boundsNullability = null;
        } else if (boundsNullability.getQualifier() == NullabilityQualifier.NULLABLE) {
            boundsNullability = NullabilityQualifierWithMigrationStatus.copy$default(boundsNullability, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusMostSpecific = mostSpecific(boundsNullability, defaultNullability);
        NullabilityQualifier qualifier2 = nullabilityQualifierWithMigrationStatusMostSpecific != null ? nullabilityQualifierWithMigrationStatusMostSpecific.getQualifier() : null;
        if (nullabilityQualifierWithMigrationStatusMostSpecific != null && nullabilityQualifierWithMigrationStatusMostSpecific.isForWarningOnly()) {
            z10 = true;
        }
        return new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extractQualifiersFromAnnotations$lambda$6(AbstractSignatureParts abstractSignatureParts, TypeAndDefaultQualifiers typeAndDefaultQualifiers, Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return abstractSignatureParts.forceWarning(extractNullability, typeAndDefaultQualifiers.getType());
    }

    private final <T> void flattenTree(T t10, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t10);
        Iterable<? extends T> iterableInvoke = function1.invoke(t10);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, function1);
            }
        }
    }

    private final NullabilityQualifierWithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> arrayList;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list = upperBounds;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!typeSystem.isError((KotlinTypeMarker) it.next())) {
                    if (!z10 || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (getNullabilityQualifier((KotlinTypeMarker) it2.next()) != null) {
                                arrayList = upperBounds;
                                break;
                            }
                        }
                    }
                    if (!z10 || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it3.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it4.next());
                                    if (enhancedForWarnings != null) {
                                        arrayList.add(enhancedForWarnings);
                                    }
                                }
                                List<KotlinTypeMarker> list2 = arrayList;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                } else {
                                    Iterator<T> it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it5.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, arrayList != upperBounds);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        return nullabilityQualifierWithMigrationStatus == null ? nullabilityQualifierWithMigrationStatus2 : (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) || ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) && (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0 || nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    private final List<TypeAndDefaultQualifiers> toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        final TypeSystemContext typeSystem = getTypeSystem();
        return flattenTree(new TypeAndDefaultQualifiers(kotlinTypeMarker, extractAndMergeDefaultQualifiers(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new Function1(this, typeSystem) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2
            private final AbstractSignatureParts arg$0;
            private final TypeSystemContext arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = typeSystem;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractSignatureParts.toIndexed$lambda$23$lambda$22(this.arg$0, this.arg$1, (AbstractSignatureParts.TypeAndDefaultQualifiers) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable toIndexed$lambda$23$lambda$22(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, TypeAndDefaultQualifiers it) {
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        KotlinTypeMarker type2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((abstractSignatureParts.getSkipRawTypeArguments() && (type2 = it.getType()) != null && typeSystemContext.isRawType(type2)) || (type = it.getType()) == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(type)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = parameters;
        List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(it.getType());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list, 10), CollectionsKt.collectionSizeOrDefault(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
            KotlinTypeMarker type3 = typeSystemContext.getType((TypeArgumentMarker) it3.next());
            arrayList.add(type3 == null ? new TypeAndDefaultQualifiers(null, it.getDefaultQualifiers(), typeParameterMarker) : new TypeAndDefaultQualifiers(type3, abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, it.getDefaultQualifiers()), typeParameterMarker));
        }
        return arrayList;
    }

    @NotNull
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> overrides, @Nullable final TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
        int size;
        KotlinTypeMarker type;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List<TypeAndDefaultQualifiers> indexed = toIndexed(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexed(it.next()));
        }
        if (getForceOnlyHeadTypeConstructor()) {
            size = 1;
            break;
        }
        if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!isEqual(kotlinTypeMarker, it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = indexed.size();
        final JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i10 = 0;
        while (i10 < size) {
            JavaTypeQualifiers javaTypeQualifiersExtractQualifiersFromAnnotations = extractQualifiersFromAnnotations(indexed.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) CollectionsKt.getOrNull((List) it3.next(), i10);
                JavaTypeQualifiers javaTypeQualifiersExtractQualifiers = (typeAndDefaultQualifiers == null || (type = typeAndDefaultQualifiers.getType()) == null) ? null : extractQualifiers(type);
                if (javaTypeQualifiersExtractQualifiers != null) {
                    arrayList2.add(javaTypeQualifiersExtractQualifiers);
                }
            }
            javaTypeQualifiersArr[i10] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiersExtractQualifiersFromAnnotations, arrayList2, i10 == 0 && isCovariant(), i10 == 0 && getContainerIsVarargParameter(), z10);
            i10++;
        }
        return new Function1(typeEnhancementInfo, javaTypeQualifiersArr) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$1
            private final TypeEnhancementInfo arg$0;
            private final JavaTypeQualifiers[] arg$1;

            {
                this.arg$0 = typeEnhancementInfo;
                this.arg$1 = javaTypeQualifiersArr;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractSignatureParts.computeIndexedQualifiers$lambda$18(this.arg$0, this.arg$1, ((Number) obj).intValue());
            }
        };
    }

    public abstract boolean forceWarning(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable<TAnnotation> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract Iterable<TAnnotation> getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    @Nullable
    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    @Nullable
    protected abstract NullabilityQualifierWithMigrationStatus getDefaultNullability(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers);

    public abstract boolean getEnableImprovementsInStrictMode();

    @Nullable
    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    @Nullable
    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }

    private final <T> List<T> flattenTree(T t10, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t10, arrayList, function1);
        return arrayList;
    }
}
