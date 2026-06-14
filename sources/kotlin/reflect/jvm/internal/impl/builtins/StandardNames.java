package kotlin.reflect.jvm.internal.impl.builtins;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class StandardNames {

    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name BACKING_FIELD;

    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @NotNull
    public static final Name CHAR_CODE;

    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @NotNull
    public static final Name DATA_CLASS_COPY;

    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;

    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;

    @NotNull
    public static final Name ENUM_ENTRIES;

    @NotNull
    public static final Name ENUM_VALUES;

    @NotNull
    public static final Name ENUM_VALUE_OF;

    @NotNull
    public static final Name EQUALS_NAME;

    @NotNull
    public static final Name HASHCODE_NAME;

    @NotNull
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @NotNull
    public static final Name MAIN;

    @NotNull
    public static final Name NAME;

    @NotNull
    public static final Name NEXT_CHAR;

    @NotNull
    private static final FqName NON_EXISTENT_CLASS;

    @NotNull
    public static final List<String> PREFIXES;

    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name TO_STRING_NAME;

    public static final class FqNames {

        @NotNull
        public static final FqNames INSTANCE;

        @NotNull
        public static final FqNameUnsafe _boolean;

        @NotNull
        public static final FqNameUnsafe _byte;

        @NotNull
        public static final FqNameUnsafe _char;

        @NotNull
        public static final FqNameUnsafe _double;

        @NotNull
        public static final FqNameUnsafe _enum;

        @NotNull
        public static final FqNameUnsafe _float;

        @NotNull
        public static final FqNameUnsafe _int;

        @NotNull
        public static final FqNameUnsafe _long;

        @NotNull
        public static final FqNameUnsafe _short;

        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;

        @NotNull
        public static final FqName annotation;

        @NotNull
        public static final FqName annotationRetention;

        @NotNull
        public static final FqName annotationTarget;

        @NotNull
        public static final FqNameUnsafe any;

        @NotNull
        public static final FqNameUnsafe array;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @NotNull
        public static final FqNameUnsafe charSequence;

        @NotNull
        public static final FqNameUnsafe cloneable;

        @NotNull
        public static final FqName collection;

        @NotNull
        public static final FqName comparable;

        @NotNull
        public static final FqName contextFunctionTypeParams;

        @NotNull
        public static final FqName deprecated;

        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @NotNull
        public static final FqName deprecationLevel;

        @NotNull
        public static final FqName extensionFunctionType;

        @NotNull
        public static final FqNameUnsafe findAssociatedObject;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @NotNull
        public static final FqNameUnsafe functionSupertype;

        @NotNull
        public static final FqNameUnsafe intRange;

        @NotNull
        public static final FqName iterable;

        @NotNull
        public static final FqName iterator;

        @NotNull
        public static final FqNameUnsafe kCallable;

        @NotNull
        public static final FqNameUnsafe kClass;

        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @NotNull
        public static final ClassId kProperty;

        @NotNull
        public static final FqNameUnsafe kProperty0;

        @NotNull
        public static final FqNameUnsafe kProperty1;

        @NotNull
        public static final FqNameUnsafe kProperty2;

        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @NotNull
        public static final FqNameUnsafe kType;

        @NotNull
        public static final FqName list;

        @NotNull
        public static final FqName listIterator;

        @NotNull
        public static final FqNameUnsafe longRange;

        @NotNull
        public static final FqName map;

        @NotNull
        public static final FqName mapEntry;

        @NotNull
        public static final FqName mustBeDocumented;

        @NotNull
        public static final FqName mutableCollection;

        @NotNull
        public static final FqName mutableIterable;

        @NotNull
        public static final FqName mutableIterator;

        @NotNull
        public static final FqName mutableList;

        @NotNull
        public static final FqName mutableListIterator;

        @NotNull
        public static final FqName mutableMap;

        @NotNull
        public static final FqName mutableMapEntry;

        @NotNull
        public static final FqName mutableSet;

        @NotNull
        public static final FqNameUnsafe nothing;

        @NotNull
        public static final FqNameUnsafe number;

        @NotNull
        public static final FqName parameterName;

        @NotNull
        public static final ClassId parameterNameClassId;

        @NotNull
        public static final FqName platformDependent;

        @NotNull
        public static final ClassId platformDependentClassId;

        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @NotNull
        public static final FqName publishedApi;

        @NotNull
        public static final FqName repeatable;

        @NotNull
        public static final ClassId repeatableClassId;

        @NotNull
        public static final FqName replaceWith;

        @NotNull
        public static final FqName retention;

        @NotNull
        public static final ClassId retentionClassId;

        @NotNull
        public static final FqName set;

        @NotNull
        public static final FqNameUnsafe string;

        @NotNull
        public static final FqName suppress;

        @NotNull
        public static final FqName target;

        @NotNull
        public static final ClassId targetClassId;

        @NotNull
        public static final FqName throwable;

        @NotNull
        public static final ClassId uByte;

        @NotNull
        public static final FqName uByteArrayFqName;

        @NotNull
        public static final FqName uByteFqName;

        @NotNull
        public static final ClassId uInt;

        @NotNull
        public static final FqName uIntArrayFqName;

        @NotNull
        public static final FqName uIntFqName;

        @NotNull
        public static final ClassId uLong;

        @NotNull
        public static final FqName uLongArrayFqName;

        @NotNull
        public static final FqName uLongFqName;

        @NotNull
        public static final ClassId uShort;

        @NotNull
        public static final FqName uShortArrayFqName;

        @NotNull
        public static final FqName uShortFqName;

        @NotNull
        public static final FqNameUnsafe unit;

        @NotNull
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.fqName("ContextFunctionTypeParams");
            FqName fqName = fqNames.fqName("ParameterName");
            parameterName = fqName;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqName);
            annotation = fqNames.fqName("Annotation");
            FqName fqNameAnnotationName = fqNames.annotationName("Target");
            target = fqNameAnnotationName;
            targetClassId = companion.topLevel(fqNameAnnotationName);
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            FqName fqNameAnnotationName2 = fqNames.annotationName("Retention");
            retention = fqNameAnnotationName2;
            retentionClassId = companion.topLevel(fqNameAnnotationName2);
            FqName fqNameAnnotationName3 = fqNames.annotationName("Repeatable");
            repeatable = fqNameAnnotationName3;
            repeatableClassId = companion.topLevel(fqNameAnnotationName3);
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.internalName("AccessibleLateinitPropertyLiteral");
            FqName fqName2 = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName2;
            platformDependentClassId = companion.topLevel(fqName2);
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName(LogConstants.EVENT_SET);
            FqName fqNameCollectionsFqName = fqNames.collectionsFqName("Map");
            map = fqNameCollectionsFqName;
            Name nameIdentifier = Name.identifier("Entry");
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            mapEntry = fqNameCollectionsFqName.child(nameIdentifier);
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            mutableListIterator = fqNames.collectionsFqName("MutableListIterator");
            mutableSet = fqNames.collectionsFqName("MutableSet");
            FqName fqNameCollectionsFqName2 = fqNames.collectionsFqName("MutableMap");
            mutableMap = fqNameCollectionsFqName2;
            Name nameIdentifier2 = Name.identifier("MutableEntry");
            Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
            mutableMapEntry = fqNameCollectionsFqName2.child(nameIdentifier2);
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = companion.topLevel(fqNameUnsafeReflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqName3 = fqNames.fqName("UByte");
            uByteFqName = fqName3;
            FqName fqName4 = fqNames.fqName("UShort");
            uShortFqName = fqName4;
            FqName fqName5 = fqNames.fqName("UInt");
            uIntFqName = fqName5;
            FqName fqName6 = fqNames.fqName("ULong");
            uLongFqName = fqName6;
            uByte = companion.topLevel(fqName3);
            uShort = companion.topLevel(fqName4);
            uInt = companion.topLevel(fqName5);
            uLong = companion.topLevel(fqName6);
            uByteArrayFqName = fqNames.fqName("UByteArray");
            uShortArrayFqName = fqNames.fqName("UShortArray");
            uIntArrayFqName = fqNames.fqName("UIntArray");
            uLongArrayFqName = fqNames.fqName("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                mapNewHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                mapNewHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName annotationName(String str) {
            FqName fqName = StandardNames.ANNOTATION_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        private final FqName collectionsFqName(String str) {
            FqName fqName = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        private final FqName fqName(String str) {
            FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            return fqName(str).toUnsafe();
        }

        private final FqName internalName(String str) {
            FqName fqName = StandardNames.KOTLIN_INTERNAL_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier).toUnsafe();
        }

        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
            Name nameIdentifier = Name.identifier(simpleName);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier).toUnsafe();
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier(MenuActionType.COPY);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        TO_STRING_NAME = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        EQUALS_NAME = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        CHAR_CODE = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("name");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        NAME = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier(C4240b4.i.Z);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        MAIN = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        NEXT_CHAR = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("it");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        IMPLICIT_LAMBDA_PARAMETER_NAME = nameIdentifier14;
        Name nameIdentifier15 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier15;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        Name nameIdentifier16 = Name.identifier("Continuation");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        CONTINUATION_INTERFACE_FQ_NAME = fqName.child(nameIdentifier16);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name nameIdentifier17 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        BUILT_INS_PACKAGE_NAME = nameIdentifier17;
        FqName fqName3 = FqName.Companion.topLevel(nameIdentifier17);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        Name nameIdentifier18 = Name.identifier("annotation");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        FqName fqNameChild = fqName3.child(nameIdentifier18);
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild;
        Name nameIdentifier19 = Name.identifier("collections");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        FqName fqNameChild2 = fqName3.child(nameIdentifier19);
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild2;
        Name nameIdentifier20 = Name.identifier("ranges");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        FqName fqNameChild3 = fqName3.child(nameIdentifier20);
        RANGES_PACKAGE_FQ_NAME = fqNameChild3;
        Name nameIdentifier21 = Name.identifier("text");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier21, "identifier(...)");
        TEXT_PACKAGE_FQ_NAME = fqName3.child(nameIdentifier21);
        Name nameIdentifier22 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier22, "identifier(...)");
        FqName fqNameChild4 = fqName3.child(nameIdentifier22);
        KOTLIN_INTERNAL_FQ_NAME = fqNameChild4;
        NON_EXISTENT_CLASS = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = SetsKt.setOf((Object[]) new FqName[]{fqName3, fqNameChild2, fqNameChild3, fqNameChild, fqName2, fqNameChild4, fqName});
    }

    private StandardNames() {
    }

    @NotNull
    public static final ClassId getFunctionClassId(int i10) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier(getFunctionName(i10));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(fqName, nameIdentifier);
    }

    @NotNull
    public static final String getFunctionName(int i10) {
        return "Function" + i10;
    }

    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    @NotNull
    public static final String getSuspendFunctionName(int i10) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i10;
    }

    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}
