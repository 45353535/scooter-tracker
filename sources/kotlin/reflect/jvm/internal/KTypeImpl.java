package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf.i;
import lf.l;
import lf.m;
import lf.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001d\u0010#\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b!\u0010\"R!\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00063²\u0006\u0012\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050$8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/b0;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/reflect/KClassifier;", "convert", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lkotlin/reflect/KClassifier;", "", "nullable", "makeNullableAsSpecified$kotlin_reflection", "(Z)Lkotlin/reflect/jvm/internal/KTypeImpl;", "makeNullableAsSpecified", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier$delegate", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments$delegate", "getArguments", "()Ljava/util/List;", "arguments", "getJavaType", "()Ljava/lang/reflect/Type;", "javaType", "isMarkedNullable", "()Z", "", "getAnnotations", "annotations", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KTypeImpl implements b0 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(KTypeImpl.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), v0.j(new n0(KTypeImpl.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: arguments$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReflectProperties.LazySoftVal arguments;

    /* JADX INFO: renamed from: classifier$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReflectProperties.LazySoftVal classifier;

    @Nullable
    private final ReflectProperties.LazySoftVal<Type> computeJavaType;

    @NotNull
    private final KotlinType type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeImpl(@NotNull KotlinType type, @Nullable final Function0<? extends Type> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        ReflectProperties.LazySoftVal<Type> lazySoftValLazySoft = null;
        ReflectProperties.LazySoftVal<Type> lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        if (lazySoftVal != null) {
            lazySoftValLazySoft = lazySoftVal;
        } else if (function0 != null) {
            lazySoftValLazySoft = ReflectProperties.lazySoft(function0);
        }
        this.computeJavaType = lazySoftValLazySoft;
        this.classifier = ReflectProperties.lazySoft(new Function0(this) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$0
            private final KTypeImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KTypeImpl.classifier_delegate$lambda$0(this.arg$0);
            }
        });
        this.arguments = ReflectProperties.lazySoft(new Function0(this, function0) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$1
            private final KTypeImpl arg$0;
            private final Function0 arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KTypeImpl.arguments_delegate$lambda$5(this.arg$0, this.arg$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List arguments_delegate$lambda$5(final KTypeImpl kTypeImpl, Function0 function0) {
        KTypeProjection kTypeProjectionInvariant;
        List<TypeProjection> arguments = kTypeImpl.type.getArguments();
        if (arguments.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        final Lazy lazyB = i.b(l.f94210c, new Function0(kTypeImpl) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$2
            private final KTypeImpl arg$0;

            {
                this.arg$0 = kTypeImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KTypeImpl.arguments_delegate$lambda$5$lambda$1(this.arg$0);
            }
        });
        List<TypeProjection> list = arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        final int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                kTypeProjectionInvariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, function0 == null ? null : new Function0(kTypeImpl, i10, lazyB) { // from class: kotlin.reflect.jvm.internal.KTypeImpl$$Lambda$3
                    private final KTypeImpl arg$0;
                    private final int arg$1;
                    private final Lazy arg$2;

                    {
                        this.arg$0 = kTypeImpl;
                        this.arg$1 = i10;
                        this.arg$2 = lazyB;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return KTypeImpl.arguments_delegate$lambda$5$lambda$4$lambda$3(this.arg$0, this.arg$1, this.arg$2);
                    }
                });
                int i12 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i12 == 1) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.invariant(kTypeImpl2);
                } else if (i12 == 2) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl2);
                } else {
                    if (i12 != 3) {
                        throw new m();
                    }
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.covariant(kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjectionInvariant);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List arguments_delegate$lambda$5$lambda$1(KTypeImpl kTypeImpl) {
        Type javaType = kTypeImpl.getJavaType();
        Intrinsics.checkNotNull(javaType);
        return ReflectClassUtilKt.getParameterizedTypeArguments(javaType);
    }

    private static final List<Type> arguments_delegate$lambda$5$lambda$2(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type arguments_delegate$lambda$5$lambda$4$lambda$3(KTypeImpl kTypeImpl, int i10, Lazy lazy) {
        Type javaType = kTypeImpl.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.checkNotNull(componentType);
            return componentType;
        }
        if (javaType instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                Intrinsics.checkNotNull(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl);
        }
        if (!(javaType instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl);
        }
        Type type = arguments_delegate$lambda$5$lambda$2(lazy).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) ArraysKt.firstOrNull(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) ArraysKt.first(upperBounds);
        }
        Intrinsics.checkNotNull(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier classifier_delegate$lambda$0(KTypeImpl kTypeImpl) {
        return kTypeImpl.convert(kTypeImpl.type);
    }

    private final KClassifier convert(KotlinType type) {
        KotlinType type2;
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = type.getConstructor().mo8663getDeclarationDescriptor();
        if (!(classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor)) {
            if (classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorMo8663getDeclarationDescriptor);
            }
            if (!(classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                return null;
            }
            throw new n("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor);
        if (javaClass == null) {
            return null;
        }
        if (!javaClass.isArray()) {
            if (TypeUtils.isNullableType(type)) {
                return new KClassImpl(javaClass);
            }
            Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
            if (primitiveByWrapper != null) {
                javaClass = primitiveByWrapper;
            }
            return new KClassImpl(javaClass);
        }
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.singleOrNull((List) type.getArguments());
        if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
            return new KClassImpl(javaClass);
        }
        KClassifier kClassifierConvert = convert(type2);
        if (kClassifierConvert != null) {
            return new KClassImpl(UtilKt.createArrayType(xf.a.b(KTypesJvm.getJvmErasure(kClassifierConvert))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof KTypeImpl)) {
            return false;
        }
        KTypeImpl kTypeImpl = (KTypeImpl) other;
        return Intrinsics.areEqual(this.type, kTypeImpl.type) && Intrinsics.areEqual(getClassifier(), kTypeImpl.getClassifier()) && Intrinsics.areEqual(getArguments(), kTypeImpl.getArguments());
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return UtilKt.computeAnnotations(this.type);
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        T value = this.arguments.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (List) value;
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return (KClassifier) this.classifier.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.jvm.internal.b0
    @Nullable
    public Type getJavaType() {
        ReflectProperties.LazySoftVal<Type> lazySoftVal = this.computeJavaType;
        if (lazySoftVal != null) {
            return lazySoftVal.invoke();
        }
        return null;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        KClassifier classifier = getClassifier();
        return ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    @NotNull
    public final KTypeImpl makeNullableAsSpecified$kotlin_reflection(boolean nullable) {
        if (!FlexibleTypesKt.isFlexible(this.type) && isMarkedNullable() == nullable) {
            return this;
        }
        KotlinType kotlinTypeMakeNullableAsSpecified = TypeUtils.makeNullableAsSpecified(this.type, nullable);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableAsSpecified, "makeNullableAsSpecified(...)");
        return new KTypeImpl(kotlinTypeMakeNullableAsSpecified, this.computeJavaType);
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.type);
    }

    public /* synthetic */ KTypeImpl(KotlinType kotlinType, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i10 & 2) != 0 ? null : function0);
    }
}
