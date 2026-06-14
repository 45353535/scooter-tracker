package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.y;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorUtilsKt {

    @NotNull
    private static final Name RETENTION_PARAMETER_NAME;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends y implements Function1<ValueParameterDescriptor, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ValueParameterDescriptor p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(p02.declaresDefaultValue());
        }
    }

    static {
        Name nameIdentifier = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        RETENTION_PARAMETER_NAME = nameIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclarationDescriptor _get_parentsWithSelf_$lambda$8(DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContainingDeclaration();
    }

    public static final boolean declaresOrInheritsDefaultValue(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.checkNotNullParameter(valueParameterDescriptor, "<this>");
        Boolean boolIfAny = DFS.ifAny(CollectionsKt.listOf(valueParameterDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return DescriptorUtilsKt.declaresOrInheritsDefaultValue$lambda$5((ValueParameterDescriptor) obj);
            }
        }, AnonymousClass2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable declaresOrInheritsDefaultValue$lambda$5(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }

    @Nullable
    public static final CallableMemberDescriptor firstOverridden(@NotNull CallableMemberDescriptor callableMemberDescriptor, final boolean z10, @NotNull final Function1<? super CallableMemberDescriptor, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return (CallableMemberDescriptor) DFS.dfs(CollectionsKt.listOf(callableMemberDescriptor), new DFS.Neighbors(z10) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$2
            private final boolean arg$0;

            {
                this.arg$0 = z10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return DescriptorUtilsKt.firstOverridden$lambda$10(this.arg$0, (CallableMemberDescriptor) obj);
            }
        }, new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(CallableMemberDescriptor current) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (ref$ObjectRef.f93280b == null && predicate.invoke(current).booleanValue()) {
                    ref$ObjectRef.f93280b = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(CallableMemberDescriptor current) {
                Intrinsics.checkNotNullParameter(current, "current");
                return ref$ObjectRef.f93280b == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public CallableMemberDescriptor result() {
                return (CallableMemberDescriptor) ref$ObjectRef.f93280b;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return firstOverridden(callableMemberDescriptor, z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable firstOverridden$lambda$10(boolean z10, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        if (z10) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        return (callableMemberDescriptor == null || (overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors()) == null) ? CollectionsKt.emptyList() : overriddenDescriptors;
    }

    @Nullable
    public static final FqName fqNameOrNull(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    @Nullable
    public static final ClassDescriptor getAnnotationClass(@NotNull AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor;
        }
        return null;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    @Nullable
    public static final ClassId getClassId(@Nullable ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor != null && (containingDeclaration = classifierDescriptor.getContainingDeclaration()) != null) {
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
                Name name = classifierDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return new ClassId(fqName, name);
            }
            if ((containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) && (classId = getClassId((ClassifierDescriptor) containingDeclaration)) != null) {
                Name name2 = classifierDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                return classId.createNestedClassId(name2);
            }
        }
        return null;
    }

    @NotNull
    public static final FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(fqNameSafe, "getFqNameSafe(...)");
        return fqNameSafe;
    }

    @NotNull
    public static final FqNameUnsafe getFqNameUnsafe(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(fqName, "getFqName(...)");
        return fqName;
    }

    @Nullable
    public static final InlineClassRepresentation<SimpleType> getInlineClassRepresentation(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    @NotNull
    public static final KotlinTypeRefiner getKotlinTypeRefiner(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : KotlinTypeRefiner.Default.INSTANCE;
    }

    @NotNull
    public static final ModuleDescriptor getModule(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        Intrinsics.checkNotNullExpressionValue(containingModule, "getContainingModule(...)");
        return containingModule;
    }

    @Nullable
    public static final MultiFieldValueClassRepresentation<SimpleType> getMultiFieldValueClassRepresentation(@Nullable ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParents(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return k.D(getParentsWithSelf(declarationDescriptor), 1);
    }

    @NotNull
    public static final Sequence<DeclarationDescriptor> getParentsWithSelf(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return k.q(declarationDescriptor, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorUtilsKt._get_parentsWithSelf_$lambda$8((DeclarationDescriptor) obj);
            }
        });
    }

    @NotNull
    public static final CallableMemberDescriptor getPropertyIfAccessor(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
        return correspondingProperty;
    }

    @Nullable
    public static final ClassDescriptor getSuperClassNotAny(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().mo8664getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = kotlinType.getConstructor().mo8663getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(classifierDescriptorMo8663getDeclarationDescriptor)) {
                    Intrinsics.checkNotNull(classifierDescriptorMo8663getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(@NotNull ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    @NotNull
    public static final Sequence<CallableMemberDescriptor> overriddenTreeAsSequence(@NotNull CallableMemberDescriptor callableMemberDescriptor, final boolean z10) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        if (z10) {
            callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        }
        Sequence sequenceU = k.u(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        return k.W(sequenceU, k.J(CollectionsKt.asSequence(overriddenDescriptors), new Function1(z10) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$3
            private final boolean arg$0;

            {
                this.arg$0 = z10;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorUtilsKt.overriddenTreeAsSequence$lambda$12$lambda$11(this.arg$0, (CallableMemberDescriptor) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence overriddenTreeAsSequence$lambda$12$lambda$11(boolean z10, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNull(callableMemberDescriptor);
        return overriddenTreeAsSequence(callableMemberDescriptor, z10);
    }

    @Nullable
    public static final ClassDescriptor resolveTopLevelClass(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName topLevelClassFqName, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(location, "location");
        topLevelClassFqName.isRoot();
        ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = moduleDescriptor.getPackage(topLevelClassFqName.parent()).getMemberScope().mo8665getContributedClassifier(topLevelClassFqName.shortName(), location);
        if (classifierDescriptorMo8665getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier;
        }
        return null;
    }
}
