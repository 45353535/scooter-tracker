package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PackagePartScopeCache {

    @NotNull
    private final ConcurrentHashMap<ClassId, MemberScope> cache;

    @NotNull
    private final ReflectKotlinClassFinder kotlinClassFinder;

    @NotNull
    private final DeserializedDescriptorResolver resolver;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver resolver, @NotNull ReflectKotlinClassFinder kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.resolver = resolver;
        this.kotlinClassFinder = kotlinClassFinder;
        this.cache = new ConcurrentHashMap<>();
    }

    @NotNull
    public final MemberScope getPackagePartScope(@NotNull ReflectKotlinClass fileClass) {
        Collection collectionListOf;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.cache;
        ClassId classId = fileClass.getClassId();
        MemberScope memberScope = concurrentHashMap.get(classId);
        if (memberScope == null) {
            FqName packageFqName = fileClass.getClassId().getPackageFqName();
            if (fileClass.getClassHeader().getKind() == KotlinClassHeader.Kind.MULTIFILE_CLASS) {
                List<String> multifilePartNames = fileClass.getClassHeader().getMultifilePartNames();
                collectionListOf = new ArrayList();
                for (String str : multifilePartNames) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    Intrinsics.checkNotNullExpressionValue(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.resolver.getComponents().getConfiguration()));
                    if (kotlinJvmBinaryClassFindKotlinClass != null) {
                        collectionListOf.add(kotlinJvmBinaryClassFindKotlinClass);
                    }
                }
            } else {
                collectionListOf = CollectionsKt.listOf(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.resolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionListOf.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeCreateKotlinPackagePartScope = this.resolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            List list = CollectionsKt.toList(arrayList);
            MemberScope memberScopeCreate = ChainedMemberScope.Companion.create("package " + packageFqName + " (" + fileClass + ')', list);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScopeCreate);
            memberScope = memberScopePutIfAbsent == null ? memberScopeCreate : memberScopePutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(memberScope, "getOrPut(...)");
        return memberScope;
    }
}
