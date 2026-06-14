package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    protected final boolean areFqNamesEqual(@NotNull ClassifierDescriptor first, @NotNull ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.areEqual(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = mo8663getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor2 = typeConstructor.mo8663getDeclarationDescriptor();
        if (classifierDescriptorMo8663getDeclarationDescriptor2 != null && hasMeaningfulFqName(classifierDescriptorMo8663getDeclarationDescriptor) && hasMeaningfulFqName(classifierDescriptorMo8663getDeclarationDescriptor2)) {
            return isSameClassifier(classifierDescriptorMo8663getDeclarationDescriptor2);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo8663getDeclarationDescriptor();

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = mo8663getDeclarationDescriptor();
        int iHashCode = hasMeaningfulFqName(classifierDescriptorMo8663getDeclarationDescriptor) ? DescriptorUtils.getFqName(classifierDescriptorMo8663getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    protected abstract boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor);
}
