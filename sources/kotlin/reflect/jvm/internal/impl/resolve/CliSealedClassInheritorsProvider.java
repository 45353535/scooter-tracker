package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import mf.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {

    @NotNull
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    private static final void computeSealedSubclasses$collectSubclasses(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z10) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = memberScope.mo8665getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor2 = classifierDescriptorMo8665getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier : classifierDescriptorMo8665getContributedClassifier instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo8665getContributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z10) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
                        computeSealedSubclasses$collectSubclasses(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z10);
                    }
                }
            }
        }
    }

    @NotNull
    public Collection<ClassDescriptor> computeSealedSubclasses(@NotNull ClassDescriptor sealedClass, boolean z10) {
        Object next;
        DeclarationDescriptor containingDeclaration;
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.getModality() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = DescriptorUtilsKt.getParents(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((DeclarationDescriptor) next) instanceof PackageFragmentDescriptor) {
                    break;
                }
            }
            containingDeclaration = (DeclarationDescriptor) next;
        } else {
            containingDeclaration = sealedClass.getContainingDeclaration();
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), z10);
        }
        MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
        computeSealedSubclasses$collectSubclasses(sealedClass, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString());
            }
        });
    }
}
