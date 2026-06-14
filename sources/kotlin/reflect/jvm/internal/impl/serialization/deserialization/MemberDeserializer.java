package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MemberDeserializer {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final DeserializationContext f93384c;

    public MemberDeserializer(@NotNull DeserializationContext c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f93384c = c10;
        this.annotationDeserializer = new AnnotationDeserializer(c10.getComponents().getModuleDescriptor(), c10.getComponents().getNotFoundClasses());
    }

    private final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f93384c.getNameResolver(), this.f93384c.getTypeTable(), this.f93384c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i10, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i10).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f93384c.getStorageManager(), new Function0(this, messageLite, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$2
            private final MemberDeserializer arg$0;
            private final MessageLite arg$1;
            private final AnnotatedCallableKind arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = messageLite;
                this.arg$2 = annotatedCallableKind;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getAnnotations$lambda$11(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAnnotations$lambda$11(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f93384c.getContainingDeclaration());
        List list = protoContainerAsProtoContainer != null ? CollectionsKt.toList(memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind)) : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f93384c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z10) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f93384c.getStorageManager(), new Function0(this, z10, property) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$3
            private final MemberDeserializer arg$0;
            private final boolean arg$1;
            private final ProtoBuf.Property arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = z10;
                this.arg$2 = property;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getPropertyFieldAnnotations$lambda$13(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPropertyFieldAnnotations$lambda$13(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf.Property property) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f93384c.getContainingDeclaration());
        List list = protoContainerAsProtoContainer != null ? z10 ? CollectionsKt.toList(memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerAsProtoContainer, property)) : CollectionsKt.toList(memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerAsProtoContainer, property)) : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f93384c.getStorageManager(), new Function0(this, messageLite, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$4
            private final MemberDeserializer arg$0;
            private final MessageLite arg$1;
            private final AnnotatedCallableKind arg$2;

            {
                this.arg$0 = this;
                this.arg$1 = messageLite;
                this.arg$2 = annotatedCallableKind;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getReceiverParameterAnnotations$lambda$15(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReceiverParameterAnnotations$lambda$15(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f93384c.getContainingDeclaration());
        List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerAsProtoContainer != null ? memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind) : null;
        return listLoadExtensionReceiverParameterAnnotations == null ? CollectionsKt.emptyList() : listLoadExtensionReceiverParameterAnnotations;
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue loadProperty$lambda$3(final MemberDeserializer memberDeserializer, final ProtoBuf.Property property, final DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f93384c.getStorageManager().createNullableLazyValue(new Function0(memberDeserializer, property, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$6
            private final MemberDeserializer arg$0;
            private final ProtoBuf.Property arg$1;
            private final DeserializedPropertyDescriptor arg$2;

            {
                this.arg$0 = memberDeserializer;
                this.arg$1 = property;
                this.arg$2 = deserializedPropertyDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.loadProperty$lambda$3$lambda$2(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue loadProperty$lambda$3$lambda$2(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f93384c.getContainingDeclaration());
        Intrinsics.checkNotNull(protoContainerAsProtoContainer);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return annotationAndConstantLoader.loadPropertyConstant(protoContainerAsProtoContainer, property, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue loadProperty$lambda$5(final MemberDeserializer memberDeserializer, final ProtoBuf.Property property, final DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f93384c.getStorageManager().createNullableLazyValue(new Function0(memberDeserializer, property, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$7
            private final MemberDeserializer arg$0;
            private final ProtoBuf.Property arg$1;
            private final DeserializedPropertyDescriptor arg$2;

            {
                this.arg$0 = memberDeserializer;
                this.arg$1 = property;
                this.arg$2 = deserializedPropertyDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.loadProperty$lambda$5$lambda$4(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue loadProperty$lambda$5$lambda$4(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f93384c.getContainingDeclaration());
        Intrinsics.checkNotNull(protoContainerAsProtoContainer);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return annotationAndConstantLoader.loadAnnotationDefaultValue(protoContainerAsProtoContainer, property, returnType);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i10) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i10);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor containingDeclaration = this.f93384c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        final ProtoContainer protoContainerAsProtoContainer = asProtoContainer(containingDeclaration2);
        List<ProtoBuf.ValueParameter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        final int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerAsProtoContainer == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f93384c.getStorageManager(), new Function0(this, protoContainerAsProtoContainer, messageLite, annotatedCallableKind, i10, valueParameter) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$5
                private final MemberDeserializer arg$0;
                private final ProtoContainer arg$1;
                private final MessageLite arg$2;
                private final AnnotatedCallableKind arg$3;
                private final int arg$4;
                private final ProtoBuf.ValueParameter arg$5;

                {
                    this.arg$0 = this;
                    this.arg$1 = protoContainerAsProtoContainer;
                    this.arg$2 = messageLite;
                    this.arg$3 = annotatedCallableKind;
                    this.arg$4 = i10;
                    this.arg$5 = valueParameter;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.valueParameters$lambda$18$lambda$16(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
                }
            });
            Name name = NameResolverUtilKt.getName(this.f93384c.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType = this.f93384c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f93384c.getTypeTable()));
            Boolean bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            boolean zBooleanValue = bool.booleanValue();
            Boolean bool2 = Flags.IS_CROSSINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
            boolean zBooleanValue2 = bool2.booleanValue();
            Boolean bool3 = Flags.IS_NOINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
            boolean zBooleanValue3 = bool3.booleanValue();
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f93384c.getTypeTable());
            KotlinType kotlinTypeType2 = typeVarargElementType != null ? this.f93384c.getTypeDeserializer().type(typeVarargElementType) : null;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i10, empty, name, kotlinTypeType, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeType2, NO_SOURCE));
            callableDescriptor = callableDescriptor2;
            i10 = i11;
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List valueParameters$lambda$18$lambda$16(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f93384c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i10, valueParameter));
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeclarationDescriptor containingDeclaration = this.f93384c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f93384c.getNameResolver(), this.f93384c.getTypeTable(), this.f93384c.getVersionRequirementTable(), this.f93384c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f93384c, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function proto) {
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(proto) ? getReceiverParameterAnnotations(proto, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f93384c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f93384c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), proto, this.f93384c.getNameResolver(), this.f93384c.getTypeTable(), Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f93384c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f93384c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f93384c.getVersionRequirementTable(), this.f93384c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.f93384c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f93384c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, receiverParameterAnnotations);
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f93384c.getTypeTable());
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedSimpleFunctionDescriptor, i10);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i10 = i11;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listValueParameters = memberDeserializer.valueParameters(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f93384c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, arrayList, ownTypeParameters, listValueParameters, kotlinTypeType2, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), MapsKt.emptyMap());
        deserializedSimpleFunctionDescriptor.setOperator(Flags.IS_OPERATOR.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setInfix(Flags.IS_INFIX.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setExternal(Flags.IS_EXTERNAL_FUNCTION.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setInline(Flags.IS_INLINE.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setTailrec(Flags.IS_TAILREC.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setSuspend(Flags.IS_SUSPEND.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setExpect(Flags.IS_EXPECT_FUNCTION.get(flags).booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = this.f93384c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f93384c.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(pairDeserializeContractFromFunction.getFirst(), pairDeserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull final ProtoBuf.Property proto) {
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z10;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.f93384c.getContainingDeclaration();
        Annotations annotations = getAnnotations(proto, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(flags));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags));
        Boolean bool = Flags.IS_VAR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(this.f93384c.getNameResolver(), proto.getName());
        CallableMemberDescriptor.Kind kindMemberKind = ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags));
        Boolean bool2 = Flags.IS_LATEINIT.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        boolean zBooleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        boolean zBooleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        boolean zBooleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        int i10 = flags;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, descriptorVisibility, zBooleanValue, name, kindMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6.booleanValue(), proto, this.f93384c.getNameResolver(), this.f93384c.getTypeTable(), this.f93384c.getVersionRequirementTable(), this.f93384c.getContainerSource());
        DeserializationContext deserializationContext2 = this.f93384c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        boolean zBooleanValue6 = bool7.booleanValue();
        Annotations receiverParameterAnnotations = (zBooleanValue6 && ProtoTypeTableUtilKt.hasReceiver(proto)) ? getReceiverParameterAnnotations(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f93384c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f93384c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, receiverParameterAnnotations);
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f93384c.getTypeTable());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listContextReceiverTypes, 10));
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedPropertyDescriptor, i11));
            i11 = i12;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList);
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool8, "get(...)");
        boolean zBooleanValue7 = bool8.booleanValue();
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i10);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zBooleanValue7, visibility, flagField4.get(i10), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool9, "get(...)");
            boolean zBooleanValue8 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool10, "get(...)");
            boolean zBooleanValue9 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool11, "get(...)");
            boolean zBooleanValue10 = bool11.booleanValue();
            Annotations annotations2 = getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                flagField = flagField3;
                deserializationContext = deserializationContextChildContext$default;
                flagField2 = flagField4;
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = deserializationContextChildContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                Intrinsics.checkNotNull(propertyGetterDescriptorImplCreateDefaultGetter);
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = deserializationContextChildContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImplCreateDefaultGetter = null;
        }
        if (Flags.HAS_SETTER.get(i10).booleanValue()) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i13 = accessorFlags;
            Boolean bool12 = Flags.IS_NOT_DEFAULT.get(i13);
            Intrinsics.checkNotNullExpressionValue(bool12, "get(...)");
            boolean zBooleanValue11 = bool12.booleanValue();
            Boolean bool13 = Flags.IS_EXTERNAL_ACCESSOR.get(i13);
            Intrinsics.checkNotNullExpressionValue(bool13, "get(...)");
            boolean zBooleanValue12 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_INLINE_ACCESSOR.get(i13);
            Intrinsics.checkNotNullExpressionValue(bool14, "get(...)");
            boolean zBooleanValue13 = bool14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(proto, i13, annotatedCallableKind);
            if (zBooleanValue11) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField2.get(i13)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z10 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNull(propertySetterDescriptorImplCreateDefaultSetter);
                propertySetterDescriptorImpl = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
            z10 = true;
            propertySetterDescriptorImpl = null;
        }
        if (Flags.HAS_CONSTANT.get(i10).booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0(this, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$0
                private final MemberDeserializer arg$0;
                private final ProtoBuf.Property arg$1;
                private final DeserializedPropertyDescriptor arg$2;

                {
                    this.arg$0 = this;
                    this.arg$1 = proto;
                    this.arg$2 = deserializedPropertyDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.loadProperty$lambda$3(this.arg$0, this.arg$1, this.arg$2);
                }
            });
        }
        DeclarationDescriptor containingDeclaration2 = this.f93384c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0(this, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$1
                private final MemberDeserializer arg$0;
                private final ProtoBuf.Property arg$1;
                private final DeserializedPropertyDescriptor arg$2;

                {
                    this.arg$0 = this;
                    this.arg$1 = proto;
                    this.arg$2 = deserializedPropertyDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.loadProperty$lambda$5(this.arg$0, this.arg$1, this.arg$2);
                }
            });
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, z10), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        List<ProtoBuf.Annotation> list = annotationList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProtoBuf.Annotation annotation : list) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            Intrinsics.checkNotNull(annotation);
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f93384c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f93384c.getStorageManager(), this.f93384c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f93384c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f93384c.getNameResolver(), this.f93384c.getTypeTable(), this.f93384c.getVersionRequirementTable(), this.f93384c.getContainerSource());
        DeserializationContext deserializationContext = this.f93384c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f93384c.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f93384c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
