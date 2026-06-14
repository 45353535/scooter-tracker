package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    @NotNull
    private static final Function1<KotlinTypeRefiner, SimpleType> EMPTY_REFINED_TYPE_FACTORY = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "<unused var>");
            return null;
        }
    };

    private static final class ExpandedTypeOrRefinedConstructor {

        @Nullable
        private final SimpleType expandedType;

        @Nullable
        private final TypeConstructor refinedConstructor;

        public ExpandedTypeOrRefinedConstructor(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.expandedType = simpleType;
            this.refinedConstructor = typeConstructor;
        }

        @Nullable
        public final SimpleType getExpandedType() {
            return this.expandedType;
        }

        @Nullable
        public final TypeConstructor getRefinedConstructor() {
            return this.refinedConstructor;
        }
    }

    private KotlinTypeFactory() {
    }

    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), TypeAttributes.Companion.getEmpty());
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = typeConstructor.mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo8663getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo8663getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            return ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, ((TypeAliasDescriptor) classifierDescriptorMo8663getDeclarationDescriptor).getName().toString());
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo8663getDeclarationDescriptor + " for constructor: " + typeConstructor);
    }

    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes attributes, @NotNull IntegerLiteralTypeConstructor constructor, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, CollectionsKt.emptyList(), z10, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final ExpandedTypeOrRefinedConstructor refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = typeConstructor.mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo8663getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            return new ExpandedTypeOrRefinedConstructor(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null);
        }
        TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeConstructorRefine, "refine(...)");
        return new ExpandedTypeOrRefinedConstructor(null, typeConstructorRefine);
    }

    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes attributes, @NotNull ClassDescriptor descriptor, @NotNull List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return simpleType$default(attributes, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return simpleType$default(attributes, constructor, arguments, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z10, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType simpleType$lambda$1(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, KotlinTypeRefiner refiner) {
        Intrinsics.checkNotNullParameter(refiner, "refiner");
        ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = INSTANCE.refineConstructor(typeConstructor, refiner, list);
        if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
            return null;
        }
        SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
        if (expandedType != null) {
            return expandedType;
        }
        TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
        Intrinsics.checkNotNull(refinedConstructor);
        return simpleType(typeAttributes, refinedConstructor, (List<? extends TypeProjection>) list, z10, refiner);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull final TypeAttributes attributes, @NotNull final TypeConstructor constructor, @NotNull final List<? extends TypeProjection> arguments, final boolean z10, @NotNull final MemberScope memberScope) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z10, memberScope, new Function1(constructor, arguments, attributes, z10, memberScope) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$1
            private final TypeConstructor arg$0;
            private final List arg$1;
            private final TypeAttributes arg$2;
            private final boolean arg$3;
            private final MemberScope arg$4;

            {
                this.arg$0 = constructor;
                this.arg$1 = arguments;
                this.arg$2 = attributes;
                this.arg$3 = z10;
                this.arg$4 = memberScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope$lambda$4(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, (KotlinTypeRefiner) obj);
            }
        });
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType simpleTypeWithNonTrivialMemberScope$lambda$4(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, MemberScope memberScope, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = INSTANCE.refineConstructor(typeConstructor, kotlinTypeRefiner, list);
        if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
            return null;
        }
        SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
        if (expandedType != null) {
            return expandedType;
        }
        TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
        Intrinsics.checkNotNull(refinedConstructor);
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, refinedConstructor, list, z10, memberScope);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull final TypeAttributes attributes, @NotNull final TypeConstructor constructor, @NotNull final List<? extends TypeProjection> arguments, final boolean z10, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.mo8663getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(attributes, constructor, arguments, z10, INSTANCE.computeMemberScope(constructor, arguments, kotlinTypeRefiner), new Function1(constructor, arguments, attributes, z10) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$0
                private final TypeConstructor arg$0;
                private final List arg$1;
                private final TypeAttributes arg$2;
                private final boolean arg$3;

                {
                    this.arg$0 = constructor;
                    this.arg$1 = arguments;
                    this.arg$2 = attributes;
                    this.arg$3 = z10;
                }

                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return KotlinTypeFactory.simpleType$lambda$1(this.arg$0, this.arg$1, this.arg$2, this.arg$3, (KotlinTypeRefiner) obj);
                }
            });
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = constructor.mo8663getDeclarationDescriptor();
        Intrinsics.checkNotNull(classifierDescriptorMo8663getDeclarationDescriptor);
        SimpleType defaultType = classifierDescriptorMo8663getDeclarationDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i10 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i10 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i10 & 16) != 0) {
            z10 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z10);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType baseType, @NotNull TypeAttributes annotations, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }
}
