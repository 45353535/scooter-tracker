package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z10, z13, z12, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$1(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$3(boolean z10, final CallableDescriptor callableDescriptor, final CallableDescriptor callableDescriptor2, TypeConstructor c12, TypeConstructor c22) {
        Intrinsics.checkNotNullParameter(c12, "c1");
        Intrinsics.checkNotNullParameter(c22, "c2");
        if (Intrinsics.areEqual(c12, c22)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = c12.mo8663getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor2 = c22.mo8663getDeclarationDescriptor();
        if ((classifierDescriptorMo8663getDeclarationDescriptor instanceof TypeParameterDescriptor) && (classifierDescriptorMo8663getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo8663getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo8663getDeclarationDescriptor2, z10, new Function2(callableDescriptor, callableDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$3
                private final CallableDescriptor arg$0;
                private final CallableDescriptor arg$1;

                {
                    this.arg$0 = callableDescriptor;
                    this.arg$1 = callableDescriptor2;
                }

                @Override // kotlin.jvm.functions.Function2
                public Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$3$lambda$2(this.arg$0, this.arg$1, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
                }
            });
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$3$lambda$2(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return Intrinsics.areEqual(declarationDescriptor, callableDescriptor) && Intrinsics.areEqual(declarationDescriptor2, callableDescriptor2);
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.areEqual(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = new Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
                @Override // kotlin.jvm.functions.Function2
                public Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(DescriptorEquivalenceForOverrides.areTypeParametersEquivalent$lambda$0((DeclarationDescriptor) obj2, (DeclarationDescriptor) obj3));
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areTypeParametersEquivalent$lambda$0(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z10) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        return ((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? function2.invoke(containingDeclaration, containingDeclaration2).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z10, false, 8, null);
    }

    private final SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull final CallableDescriptor a10, @NotNull final CallableDescriptor b10, final boolean z10, boolean z11, boolean z12, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        if (!Intrinsics.areEqual(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof MemberDescriptor) && (b10 instanceof MemberDescriptor) && ((MemberDescriptor) a10).isExpect() != ((MemberDescriptor) b10).isExpect()) {
            return false;
        }
        if ((Intrinsics.areEqual(a10.getContainingDeclaration(), b10.getContainingDeclaration()) && (!z10 || !Intrinsics.areEqual(singleSource(a10), singleSource(b10)))) || DescriptorUtils.isLocal(a10) || DescriptorUtils.isLocal(b10) || !ownersEquivalent(a10, b10, new Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$1
            @Override // kotlin.jvm.functions.Function2
            public Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$1((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
            }
        }, z10)) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new KotlinTypeChecker.TypeConstructorEquality(z10, a10, b10) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$2
            private final boolean arg$0;
            private final CallableDescriptor arg$1;
            private final CallableDescriptor arg$2;

            {
                this.arg$0 = z10;
                this.arg$1 = a10;
                this.arg$2 = b10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                return DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$3(this.arg$0, this.arg$1, this.arg$2, typeConstructor, typeConstructor2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(overridingUtilCreate, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a10, b10, null, !z12).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b10, a10, null, z12 ^ true).getResult() == result2;
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z10, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z10, z11, false, KotlinTypeRefiner.Default.INSTANCE, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a10, @NotNull TypeParameterDescriptor b10, boolean z10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return areTypeParametersEquivalent$default(this, a10, b10, z10, null, 8, null);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a10, @NotNull TypeParameterDescriptor b10, boolean z10, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        return !Intrinsics.areEqual(a10.getContainingDeclaration(), b10.getContainingDeclaration()) && ownersEquivalent(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
