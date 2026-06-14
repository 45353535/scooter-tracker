package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = packageViewDescriptor.getMemberScope().mo8665getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo8665getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo8665getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo8665getContributedClassifier).getUnsubstitutedInnerClassesScope().mo8665getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo8665getContributedClassifier = classifierDescriptorMo8665getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier2 : null;
                if (classifierDescriptorMo8665getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo8665getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo8665getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo8665getContributedClassifier3 == null) {
            classifierDescriptorMo8665getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo8665getContributedClassifier3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo8665getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo8665getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo8665getContributedClassifier3 = classifierDescriptorMo8665getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier4 : null;
                if (classifierDescriptorMo8665getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo8665getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo8665getContributedClassifier3 != null) {
            return classifierDescriptorMo8665getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier5 = packageViewDescriptor3.getMemberScope().mo8665getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo8665getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo8665getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier6 = ((ClassDescriptor) classifierDescriptorMo8665getContributedClassifier5).getUnsubstitutedInnerClassesScope().mo8665getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo8665getContributedClassifier5 = classifierDescriptorMo8665getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8665getContributedClassifier6 : null;
            if (classifierDescriptorMo8665getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo8665getContributedClassifier5;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, k.c0(k.Q(k.q(classId, new n0() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(FindClassInModuleKt.findNonGenericClassAcrossDependencies$lambda$1((ClassId) obj));
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findNonGenericClassAcrossDependencies$lambda$1(ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
