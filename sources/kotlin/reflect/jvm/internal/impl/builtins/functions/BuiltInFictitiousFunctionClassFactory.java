package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final StorageManager storageManager;

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
        this.module = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        FqName packageFqName;
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String strAsString = classId.getRelativeClassName().asString();
        if (!StringsKt.g0(strAsString, "Function", false, 2, null) || (functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), strAsString)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindComponent1 = functionalClassKindWithArity.component1();
        int iComponent2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.module.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) CollectionsKt.firstOrNull((List) arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, packageFragmentDescriptor, functionTypeKindComponent1, iComponent2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String strAsString = name.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return (StringsKt.a0(strAsString, "Function", false, 2, null) || StringsKt.a0(strAsString, "KFunction", false, 2, null) || StringsKt.a0(strAsString, "SuspendFunction", false, 2, null) || StringsKt.a0(strAsString, "KSuspendFunction", false, 2, null)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(packageFqName, strAsString) != null;
    }
}
