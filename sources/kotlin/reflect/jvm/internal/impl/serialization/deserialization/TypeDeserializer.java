package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final DeserializationContext f93385c;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> classifierDescriptors;

    @NotNull
    private final String containerPresentableName;

    @NotNull
    private final String debugName;

    @Nullable
    private final TypeDeserializer parent;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;

    @NotNull
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(@NotNull DeserializationContext c10, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f93385c = c10;
        this.parent = typeDeserializer;
        this.debugName = debugName;
        this.containerPresentableName = containerPresentableName;
        this.classifierDescriptors = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$0
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return this.arg$0.computeClassifierDescriptor(((Number) obj).intValue());
            }
        });
        this.typeAliasDescriptors = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$1
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return this.arg$0.computeTypeAliasDescriptor(((Number) obj).intValue());
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f93385c, typeParameter, i10));
                i10++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeClassifierDescriptor(int i10) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f93385c.getNameResolver(), i10);
        return classId.isLocal() ? this.f93385c.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.f93385c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i10) {
        if (NameResolverUtilKt.getClassId(this.f93385c.getNameResolver(), i10).isLocal()) {
            return this.f93385c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeTypeAliasDescriptor(int i10) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f93385c.getNameResolver(), i10);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f93385c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        List listDropLast = CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType createSuspendFunctionType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z10) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeCreateSuspendFunctionTypeForBasicCase;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeCreateSuspendFunctionTypeForBasicCase = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                list2 = list;
                simpleTypeCreateSuspendFunctionTypeForBasicCase = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor2, list2, z10, (KotlinTypeRefiner) null, 16, (Object) null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            simpleTypeCreateSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(typeAttributes, typeConstructor, list2, z10);
        }
        return simpleTypeCreateSuspendFunctionTypeForBasicCase == null ? ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]) : simpleTypeCreateSuspendFunctionTypeForBasicCase;
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z10) {
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z10, (KotlinTypeRefiner) null, 16, (Object) null);
        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default)) {
            return transformRuntimeFunctionTypeToSuspendFunction(simpleTypeSimpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor loadTypeParameter(int i10) {
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i10));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.loadTypeParameter(i10);
        }
        return null;
    }

    private static final List<ProtoBuf.Type.Argument> simpleType$collectAllArguments(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        List<ProtoBuf.Type.Argument> list = argumentList;
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f93385c.getTypeTable());
        List<ProtoBuf.Type.Argument> listSimpleType$collectAllArguments = typeOuterType != null ? simpleType$collectAllArguments(typeOuterType, typeDeserializer) : null;
        if (listSimpleType$collectAllArguments == null) {
            listSimpleType$collectAllArguments = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) list, (Iterable) listSimpleType$collectAllArguments);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return typeDeserializer.simpleType(type, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List simpleType$lambda$3(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f93385c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(type, typeDeserializer.f93385c.getNameResolver());
    }

    private final TypeAttributes toAttributes(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List<? extends TypeAttributeTranslator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt.flatten(arrayList));
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        KotlinType type;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = type.getConstructor().mo8663getDeclarationDescriptor();
        FqName fqNameSafe = classifierDescriptorMo8663getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo8663getDeclarationDescriptor) : null;
        if (type.getArguments().size() != 1 || (!Intrinsics.areEqual(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) && !Intrinsics.areEqual(fqNameSafe, TypeDeserializerKt.EXPERIMENTAL_CONTINUATION_FQ_NAME))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        DeclarationDescriptor containingDeclaration = this.f93385c.getContainingDeclaration();
        CallableDescriptor callableDescriptor = containingDeclaration instanceof CallableDescriptor ? (CallableDescriptor) containingDeclaration : null;
        return Intrinsics.areEqual(callableDescriptor != null ? DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? createSimpleSuspendFunctionType(kotlinType, type2) : createSimpleSuspendFunctionType(kotlinType, type2);
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            return typeParameterDescriptor == null ? new StarProjectionForAbsentTypeParameter(this.f93385c.getComponents().getModuleDescriptor().getBuiltIns()) : new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
        Variance variance = protoEnumFlags.variance(projection);
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f93385c.getTypeTable());
        return type == null ? new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString())) : new TypeProjectionImpl(variance, type(type));
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.classifierDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = typeConstructor$notFoundClass(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = loadTypeParameter(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.containerPresentableName);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f93385c.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((TypeParameterDescriptor) next).getName().asString(), string)) {
                    break;
                }
            }
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f93385c.getContainingDeclaration().toString());
            }
        } else {
            if (!type.hasTypeAliasName()) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            classifierDescriptorInvoke = this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = typeConstructor$notFoundClass(this, type, type.getTypeAliasName());
            }
        }
        TypeConstructor typeConstructor = classifierDescriptorInvoke.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private static final ClassDescriptor typeConstructor$notFoundClass(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i10) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f93385c.getNameResolver(), i10);
        List<Integer> listD0 = k.d0(k.Q(k.q(type, new Function1(typeDeserializer) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$3
            private final TypeDeserializer arg$0;

            {
                this.arg$0 = typeDeserializer;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return TypeDeserializer.typeConstructor$notFoundClass$lambda$8(this.arg$0, (ProtoBuf.Type) obj);
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(TypeDeserializer.typeConstructor$notFoundClass$lambda$9((ProtoBuf.Type) obj));
            }
        }));
        int iC = k.C(k.q(classId, new n0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }));
        while (listD0.size() < iC) {
            listD0.add(0);
        }
        return typeDeserializer.f93385c.getComponents().getNotFoundClasses().getClass(classId, listD0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoBuf.Type typeConstructor$notFoundClass$lambda$8(TypeDeserializer typeDeserializer, ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ProtoTypeTableUtilKt.outerType(it, typeDeserializer.f93385c.getTypeTable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int typeConstructor$notFoundClass$lambda$9(ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getArgumentCount();
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    @NotNull
    public final SimpleType simpleType(@NotNull final ProtoBuf.Type proto, boolean z10) {
        SimpleType simpleTypeMakeDefinitelyNotNull$default;
        SimpleType simpleTypeWithAbbreviation;
        Intrinsics.checkNotNullParameter(proto, "proto");
        SimpleType simpleTypeComputeLocalClassifierReplacementType = proto.hasClassName() ? computeLocalClassifierReplacementType(proto.getClassName()) : proto.hasTypeAliasName() ? computeLocalClassifierReplacementType(proto.getTypeAliasName()) : null;
        if (simpleTypeComputeLocalClassifierReplacementType != null) {
            return simpleTypeComputeLocalClassifierReplacementType;
        }
        TypeConstructor typeConstructor = typeConstructor(proto);
        if (ErrorUtils.isError(typeConstructor.mo8663getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor, typeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f93385c.getStorageManager(), new Function0(this, proto) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$2
            private final TypeDeserializer arg$0;
            private final ProtoBuf.Type arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = proto;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return TypeDeserializer.simpleType$lambda$3(this.arg$0, this.arg$1);
            }
        });
        TypeAttributes attributes = toAttributes(this.f93385c.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructor, this.f93385c.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> listSimpleType$collectAllArguments = simpleType$collectAllArguments(proto, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSimpleType$collectAllArguments, 10));
        int i10 = 0;
        for (Object obj : listSimpleType$collectAllArguments) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i10), (ProtoBuf.Type.Argument) obj));
            i10 = i11;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = typeConstructor.mo8663getDeclarationDescriptor();
        if (z10 && (classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo8663getDeclarationDescriptor, list);
            simpleTypeMakeDefinitelyNotNull$default = simpleTypeComputeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) || proto.getNullable()).replaceAttributes(toAttributes(this.f93385c.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeComputeExpandedType.getAnnotations())), typeConstructor, this.f93385c.getContainingDeclaration()));
        } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
            simpleTypeMakeDefinitelyNotNull$default = createSuspendFunctionType(attributes, typeConstructor, list, proto.getNullable());
        } else {
            SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                simpleTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                if (simpleTypeMakeDefinitelyNotNull$default == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                }
            } else {
                simpleTypeMakeDefinitelyNotNull$default = simpleTypeSimpleType$default;
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, this.f93385c.getTypeTable());
        return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeMakeDefinitelyNotNull$default, simpleType(typeAbbreviatedType, false))) == null) ? simpleTypeMakeDefinitelyNotNull$default : simpleTypeWithAbbreviation;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        String string = this.f93385c.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.f93385c.getTypeTable());
        Intrinsics.checkNotNull(typeFlexibleUpperBound);
        return this.f93385c.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }
}
