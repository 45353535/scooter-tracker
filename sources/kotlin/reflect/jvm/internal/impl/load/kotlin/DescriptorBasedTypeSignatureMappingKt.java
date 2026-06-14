package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    @NotNull
    public static final String computeInternalName(@NotNull ClassDescriptor klass, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(klass);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = klass.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        String identifier = SpecialNames.safeIdentifier(klass.getName()).getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            return StringsKt.V(fqName.asString(), '.', IOUtils.DIR_SEPARATOR_UNIX, false, 4, null) + IOUtils.DIR_SEPARATOR_UNIX + identifier;
        }
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + klass);
        }
        String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor, typeMappingConfiguration);
        }
        return predefinedInternalNameForClass + '$' + identifier;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final boolean hasVoidReturnType(@NotNull CallableDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (!KotlinBuiltIns.isUnit(returnType)) {
            return false;
        }
        KotlinType returnType2 = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType2);
        return (TypeUtils.isNullableType(returnType2) || (descriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [T, java.lang.Object] */
    @NotNull
    public static final <T> T mapType(@NotNull KotlinType kotlinType, @NotNull JvmTypeFactory<T> factory, @NotNull TypeMappingMode mode, @NotNull TypeMappingConfiguration<? extends T> typeMappingConfiguration, @Nullable JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, @NotNull Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> writeGenericType) {
        T predefinedTypeForClass;
        KotlinType kotlinType2;
        Object objMapType;
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        KotlinType kotlinTypePreprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (kotlinTypePreprocessType != null) {
            return (T) mapType(kotlinTypePreprocessType, factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return (T) mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        Object objMapBuiltInType = TypeSignatureMappingKt.mapBuiltInType(simpleClassicTypeSystemContext, kotlinType, factory, mode);
        if (objMapBuiltInType != null) {
            ?? r82 = (Object) TypeSignatureMappingKt.boxTypeIfNeeded(factory, objMapBuiltInType, mode.getNeedPrimitiveBoxing());
            writeGenericType.invoke(kotlinType, r82, mode);
            return r82;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.mo8664getSupertypes());
            }
            return (T) mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(alternativeType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = constructor.mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (ErrorUtils.isError(classifierDescriptorMo8663getDeclarationDescriptor)) {
            T t10 = (T) factory.createObjectType("error/NonExistentClass");
            typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.writeClass(t10);
            }
            return t10;
        }
        boolean z10 = classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor;
        if (z10 && KotlinBuiltIns.isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            TypeProjection typeProjection = kotlinType.getArguments().get(0);
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                objMapType = factory.createObjectType("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                    jvmDescriptorTypeWriter.writeClass(objMapType);
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                }
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                objMapType = mapType(type, factory, mode.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            }
            return (T) factory.createFromString('[' + factory.toString(objMapType));
        }
        if (!z10) {
            if (!(classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                if ((classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeAliasDescriptor) && mode.getMapTypeAliases()) {
                    return (T) mapType(((TypeAliasDescriptor) classifierDescriptorMo8663getDeclarationDescriptor).getExpandedType(), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
            KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) classifierDescriptorMo8663getDeclarationDescriptor);
            if (kotlinType.isMarkedNullable()) {
                representativeUpperBound = TypeUtilsKt.makeNullable(representativeUpperBound);
            }
            T t11 = (T) mapType(representativeUpperBound, factory, mode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = classifierDescriptorMo8663getDeclarationDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                jvmDescriptorTypeWriter.writeTypeVariable(name, t11);
            }
            return t11;
        }
        if (InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo8663getDeclarationDescriptor) && !mode.getNeedInlineClassWrapping() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(simpleClassicTypeSystemContext, kotlinType)) != null) {
            return (T) mapType(kotlinType2, factory, mode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (mode.isForAnnotationParameter() && KotlinBuiltIns.isKClass((ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor)) {
            predefinedTypeForClass = (Object) factory.getJavaLangClassType();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor;
            ClassDescriptor original = classDescriptor.getOriginal();
            Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
            predefinedTypeForClass = typeMappingConfiguration.getPredefinedTypeForClass(original);
            if (predefinedTypeForClass == null) {
                if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                    DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                    Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    classDescriptor = (ClassDescriptor) containingDeclaration;
                }
                ClassDescriptor original2 = classDescriptor.getOriginal();
                Intrinsics.checkNotNullExpressionValue(original2, "getOriginal(...)");
                predefinedTypeForClass = (Object) factory.createObjectType(computeInternalName(original2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, predefinedTypeForClass, mode);
        return predefinedTypeForClass;
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function3 = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
