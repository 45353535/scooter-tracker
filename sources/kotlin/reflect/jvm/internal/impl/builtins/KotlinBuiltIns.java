package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.media3.extractor.ts.TsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KotlinBuiltIns {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");
    private final MemoizedFunctionToNotNull<Name, ClassDescriptor> builtInClassesByName;
    private final NotNullLazyValue<Collection<PackageViewDescriptor>> builtInPackagesImportedByDefault;
    private ModuleDescriptorImpl builtInsModule;
    private NotNullLazyValue<ModuleDescriptorImpl> postponedBuiltInsModule;
    private final NotNullLazyValue<Primitives> primitives;
    private final StorageManager storageManager;

    private static class Primitives {
        public final Map<SimpleType, SimpleType> kotlinArrayTypeToPrimitiveKotlinType;
        public final Map<KotlinType, SimpleType> primitiveKotlinTypeToKotlinArrayType;
        public final Map<PrimitiveType, SimpleType> primitiveTypeToArrayKotlinType;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private Primitives(@NotNull Map<PrimitiveType, SimpleType> map, @NotNull Map<KotlinType, SimpleType> map2, @NotNull Map<SimpleType, SimpleType> map3) {
            if (map == null) {
                $$$reportNull$$$0(0);
            }
            if (map2 == null) {
                $$$reportNull$$$0(1);
            }
            if (map3 == null) {
                $$$reportNull$$$0(2);
            }
            this.primitiveTypeToArrayKotlinType = map;
            this.primitiveKotlinTypeToKotlinArrayType = map2;
            this.kotlinArrayTypeToPrimitiveKotlinType = map3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r23) {
        /*
            Method dump skipped, instruction units count: 2232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.$$$reportNull$$$0(int):void");
    }

    protected KotlinBuiltIns(@NotNull StorageManager storageManager) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        this.storageManager = storageManager;
        this.builtInPackagesImportedByDefault = storageManager.createLazyValue(new Function0<Collection<PackageViewDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public Collection<PackageViewDescriptor> invoke() {
                return Arrays.asList(KotlinBuiltIns.this.getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.getBuiltInsModule().getPackage(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.getBuiltInsModule().getPackage(StandardNames.RANGES_PACKAGE_FQ_NAME), KotlinBuiltIns.this.getBuiltInsModule().getPackage(StandardNames.ANNOTATION_PACKAGE_FQ_NAME));
            }
        });
        this.primitives = storageManager.createLazyValue(new Function0<Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public Primitives invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    SimpleType builtInTypeByClassName = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getTypeName().asString());
                    SimpleType builtInTypeByClassName2 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getArrayTypeName().asString());
                    enumMap.put(primitiveType, builtInTypeByClassName2);
                    map.put(builtInTypeByClassName, builtInTypeByClassName2);
                    map2.put(builtInTypeByClassName2, builtInTypeByClassName);
                }
                return new Primitives(enumMap, map, map2);
            }
        });
        this.builtInClassesByName = storageManager.createMemoizedFunction(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(Name name) {
                ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = KotlinBuiltIns.this.getBuiltInsPackageScope().mo8665getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
                if (classifierDescriptorMo8665getContributedClassifier == null) {
                    throw new AssertionError("Built-in class " + StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name) + " is not found");
                }
                if (classifierDescriptorMo8665getContributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo8665getContributedClassifier);
            }
        });
    }

    private static boolean classFqNameEquals(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(103);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(104);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(DescriptorUtils.getFqName(classifierDescriptor));
    }

    @NotNull
    private ClassDescriptor getBuiltInClassByName(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(14);
        }
        ClassDescriptor classDescriptorInvoke = this.builtInClassesByName.invoke(Name.identifier(str));
        if (classDescriptorInvoke == null) {
            $$$reportNull$$$0(15);
        }
        return classDescriptorInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public SimpleType getBuiltInTypeByClassName(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(47);
        }
        SimpleType defaultType = getBuiltInClassByName(str).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(48);
        }
        return defaultType;
    }

    @Nullable
    private static KotlinType getElementTypeForUnsignedArray(@NotNull KotlinType kotlinType, @NotNull ModuleDescriptor moduleDescriptor) {
        ClassId classId;
        ClassId unsignedClassIdByArrayClassId;
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        if (kotlinType == null) {
            $$$reportNull$$$0(71);
        }
        if (moduleDescriptor == null) {
            $$$reportNull$$$0(72);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = kotlinType.getConstructor().mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor == null) {
            return null;
        }
        UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
        if (!unsignedTypes.isShortNameOfUnsignedArray(classifierDescriptorMo8663getDeclarationDescriptor.getName()) || (classId = DescriptorUtilsKt.getClassId(classifierDescriptorMo8663getDeclarationDescriptor)) == null || (unsignedClassIdByArrayClassId = unsignedTypes.getUnsignedClassIdByArrayClassId(classId)) == null || (classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, unsignedClassIdByArrayClassId)) == null) {
            return null;
        }
        return classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayElementType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(92);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = kotlinType.getConstructor().mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(classifierDescriptorMo8663getDeclarationDescriptor);
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(77);
        }
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    @NotNull
    private ClassDescriptor getPrimitiveClassDescriptor(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(16);
        }
        return getBuiltInClassByName(primitiveType.getTypeName().asString());
    }

    @Nullable
    public static PrimitiveType getPrimitiveType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(76);
        }
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static boolean isAny(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(108);
        }
        return classFqNameEquals(classDescriptor, StandardNames.FqNames.any);
    }

    public static boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
        }
        return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.any);
    }

    public static boolean isArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(88);
        }
        return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.array);
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(89);
        }
        return classFqNameEquals(classDescriptor, StandardNames.FqNames.array) || getPrimitiveArrayType(classDescriptor) != null;
    }

    public static boolean isBoolean(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(110);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames._boolean);
    }

    public static boolean isBuiltIn(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    private static boolean isConstructedFromGivenClass(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(97);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(98);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(134);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(135);
        }
        return isConstructedFromGivenClass(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
    }

    public static boolean isDefaultBound(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(141);
        }
        return isNullableAny(kotlinType);
    }

    public static boolean isDeprecated(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(161);
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (declarationDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
            boolean zIsVar = propertyDescriptor.isVar();
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (getter != null && isDeprecated(getter) && (!zIsVar || (setter != null && isDeprecated(setter)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(158);
        }
        return classFqNameEquals(classDescriptor, StandardNames.FqNames.kClass);
    }

    private static boolean isNotNullConstructedFromGivenClass(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(105);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(106);
        }
        return !kotlinType.isMarkedNullable() && isConstructedFromGivenClass(kotlinType, fqNameUnsafe);
    }

    public static boolean isNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(136);
        }
        return isNothingOrNullableNothing(kotlinType) && !TypeUtils.isNullableType(kotlinType);
    }

    public static boolean isNothingOrNullableNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(138);
        }
        return isConstructedFromGivenClass(kotlinType, StandardNames.FqNames.nothing);
    }

    public static boolean isNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(140);
        }
        return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
    }

    public static boolean isPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(91);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = kotlinType.getConstructor().mo8663getDeclarationDescriptor();
        return (classifierDescriptorMo8663getDeclarationDescriptor == null || getPrimitiveArrayType(classifierDescriptorMo8663getDeclarationDescriptor) == null) ? false : true;
    }

    public static boolean isPrimitiveClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(96);
        }
        return getPrimitiveType(classDescriptor) != null;
    }

    public static boolean isPrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(94);
        }
        return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(95);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = kotlinType.getConstructor().mo8663getDeclarationDescriptor();
        return (classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor) && isPrimitiveClass((ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor);
    }

    public static boolean isSpecialClassWithNoSupertypes(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(107);
        }
        return classFqNameEquals(classDescriptor, StandardNames.FqNames.any) || classFqNameEquals(classDescriptor, StandardNames.FqNames.nothing);
    }

    public static boolean isString(@Nullable KotlinType kotlinType) {
        return kotlinType != null && isNotNullConstructedFromGivenClass(kotlinType, StandardNames.FqNames.string);
    }

    public static boolean isTypeConstructorForGivenClass(@NotNull TypeConstructor typeConstructor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(101);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(102);
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = typeConstructor.mo8663getDeclarationDescriptor();
        return (classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor) && classFqNameEquals(classifierDescriptorMo8663getDeclarationDescriptor, fqNameUnsafe);
    }

    public static boolean isUByteArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(128);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uByteArrayFqName.toUnsafe());
    }

    public static boolean isUIntArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(130);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uIntArrayFqName.toUnsafe());
    }

    public static boolean isULongArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uLongArrayFqName.toUnsafe());
    }

    public static boolean isUShortArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(129);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, StandardNames.FqNames.uShortArrayFqName.toUnsafe());
    }

    public static boolean isUnderKotlinPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(142);
        }
        return isNotNullConstructedFromGivenClass(kotlinType, StandardNames.FqNames.unit);
    }

    public static boolean isUnsignedArrayType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        }
        return isUByteArray(kotlinType) || isUShortArray(kotlinType) || isUIntArray(kotlinType) || isULongArray(kotlinType);
    }

    protected void createBuiltInsModule(boolean z10) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z10));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.builtInsModule;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    @NotNull
    protected AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none == null) {
            $$$reportNull$$$0(3);
        }
        return none;
    }

    @NotNull
    public ClassDescriptor getAny() {
        return getBuiltInClassByName("Any");
    }

    @NotNull
    public SimpleType getAnyType() {
        SimpleType defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(51);
        }
        return defaultType;
    }

    @NotNull
    public ClassDescriptor getArray() {
        return getBuiltInClassByName("Array");
    }

    @NotNull
    public KotlinType getArrayElementType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(68);
        }
        KotlinType arrayElementTypeOrNull = getArrayElementTypeOrNull(kotlinType);
        if (arrayElementTypeOrNull != null) {
            return arrayElementTypeOrNull;
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    @Nullable
    public KotlinType getArrayElementTypeOrNull(@NotNull KotlinType kotlinType) {
        KotlinType elementTypeForUnsignedArray;
        if (kotlinType == null) {
            $$$reportNull$$$0(70);
        }
        if (isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                return null;
            }
            return kotlinType.getArguments().get(0).getType();
        }
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        SimpleType simpleType = this.primitives.invoke().kotlinArrayTypeToPrimitiveKotlinType.get(kotlinTypeMakeNotNullable);
        if (simpleType != null) {
            return simpleType;
        }
        ModuleDescriptor containingModuleOrNull = DescriptorUtils.getContainingModuleOrNull(kotlinTypeMakeNotNullable);
        if (containingModuleOrNull == null || (elementTypeForUnsignedArray = getElementTypeForUnsignedArray(kotlinTypeMakeNotNullable, containingModuleOrNull)) == null) {
            return null;
        }
        return elementTypeForUnsignedArray;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (variance == null) {
            $$$reportNull$$$0(78);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(79);
        }
        if (annotations == null) {
            $$$reportNull$$$0(80);
        }
        SimpleType simpleTypeSimpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeSimpleNotNullType == null) {
            $$$reportNull$$$0(81);
        }
        return simpleTypeSimpleNotNullType;
    }

    @NotNull
    public SimpleType getBooleanType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(64);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByFqName(@NotNull FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(12);
        }
        ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getBuiltInsModule(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName == null) {
            $$$reportNull$$$0(13);
        }
        return classDescriptorResolveClassByFqName;
    }

    @NotNull
    public ModuleDescriptorImpl getBuiltInsModule() {
        if (this.builtInsModule == null) {
            this.builtInsModule = this.postponedBuiltInsModule.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.builtInsModule;
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(7);
        }
        return moduleDescriptorImpl;
    }

    @NotNull
    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope = getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(11);
        }
        return memberScope;
    }

    @NotNull
    public SimpleType getByteType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(57);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public SimpleType getCharType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(63);
        }
        return primitiveKotlinType;
    }

    @NotNull
    protected Iterable<ClassDescriptorFactory> getClassDescriptorFactories() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.storageManager, getBuiltInsModule()));
        if (listSingletonList == null) {
            $$$reportNull$$$0(5);
        }
        return listSingletonList;
    }

    @NotNull
    public ClassDescriptor getCollection() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(35);
        }
        return builtInClassByFqName;
    }

    @NotNull
    public ClassDescriptor getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    @NotNull
    public SimpleType getDefaultBound() {
        SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(53);
        }
        return nullableAnyType;
    }

    @NotNull
    public SimpleType getDoubleType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(62);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public SimpleType getFloatType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(61);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public ClassDescriptor getFunction(int i10) {
        return getBuiltInClassByName(StandardNames.getFunctionName(i10));
    }

    @NotNull
    public SimpleType getIntType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(59);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public ClassDescriptor getKClass() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.kClass.toSafe());
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(21);
        }
        return builtInClassByFqName;
    }

    @NotNull
    public SimpleType getLongType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(60);
        }
        return primitiveKotlinType;
    }

    @NotNull
    public ClassDescriptor getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    @NotNull
    public SimpleType getNothingType() {
        SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(49);
        }
        return defaultType;
    }

    @NotNull
    public SimpleType getNullableAnyType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(52);
        }
        return simpleTypeMakeNullableAsSpecified;
    }

    @NotNull
    public SimpleType getNullableNothingType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(50);
        }
        return simpleTypeMakeNullableAsSpecified;
    }

    @NotNull
    public ClassDescriptor getNumber() {
        return getBuiltInClassByName("Number");
    }

    @NotNull
    public SimpleType getNumberType() {
        SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(56);
        }
        return defaultType;
    }

    @NotNull
    protected PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            $$$reportNull$$$0(4);
        }
        return noPlatformDependent;
    }

    @NotNull
    public SimpleType getPrimitiveArrayKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(73);
        }
        SimpleType simpleType = this.primitives.invoke().primitiveTypeToArrayKotlinType.get(primitiveType);
        if (simpleType == null) {
            $$$reportNull$$$0(74);
        }
        return simpleType;
    }

    @NotNull
    public SimpleType getPrimitiveKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(54);
        }
        SimpleType defaultType = getPrimitiveClassDescriptor(primitiveType).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(55);
        }
        return defaultType;
    }

    @NotNull
    public SimpleType getShortType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(58);
        }
        return primitiveKotlinType;
    }

    @NotNull
    protected StorageManager getStorageManager() {
        StorageManager storageManager = this.storageManager;
        if (storageManager == null) {
            $$$reportNull$$$0(6);
        }
        return storageManager;
    }

    @NotNull
    public ClassDescriptor getString() {
        return getBuiltInClassByName("String");
    }

    @NotNull
    public SimpleType getStringType() {
        SimpleType defaultType = getString().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(66);
        }
        return defaultType;
    }

    @NotNull
    public ClassDescriptor getSuspendFunction(int i10) {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(Name.identifier(StandardNames.getSuspendFunctionName(i10))));
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(18);
        }
        return builtInClassByFqName;
    }

    @NotNull
    public ClassDescriptor getUnit() {
        return getBuiltInClassByName("Unit");
    }

    @NotNull
    public SimpleType getUnitType() {
        SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(65);
        }
        return defaultType;
    }

    public void setBuiltInsModule(@NotNull final ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(1);
        }
        this.storageManager.compute(new Function0<Void>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.4
            @Override // kotlin.jvm.functions.Function0
            public Void invoke() {
                if (KotlinBuiltIns.this.builtInsModule == null) {
                    KotlinBuiltIns.this.builtInsModule = moduleDescriptorImpl;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + KotlinBuiltIns.this.builtInsModule + " (attempting to reset to " + moduleDescriptorImpl + ")");
            }
        });
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(90);
        }
        return isArray(kotlinType) || isPrimitiveArray(kotlinType);
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(82);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(83);
        }
        SimpleType arrayType = getArrayType(variance, kotlinType, Annotations.Companion.getEMPTY());
        if (arrayType == null) {
            $$$reportNull$$$0(84);
        }
        return arrayType;
    }
}
