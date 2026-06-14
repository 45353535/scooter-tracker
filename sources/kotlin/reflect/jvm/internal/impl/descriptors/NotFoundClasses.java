package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NotFoundClasses {

    @NotNull
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes;

    @NotNull
    private final ModuleDescriptor module;

    @NotNull
    private final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments;

    @NotNull
    private final StorageManager storageManager;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ClassRequest {

        @NotNull
        private final ClassId classId;

        @NotNull
        private final List<Integer> typeParametersCount;

        public ClassRequest(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.classId = classId;
            this.typeParametersCount = typeParametersCount;
        }

        @NotNull
        public final ClassId component1() {
            return this.classId;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.areEqual(this.classId, classRequest.classId) && Intrinsics.areEqual(this.typeParametersCount, classRequest.typeParametersCount);
        }

        public int hashCode() {
            return (this.classId.hashCode() * 31) + this.typeParametersCount.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ')';
        }
    }

    public static final class MockClassDescriptor extends ClassDescriptorBase {

        @NotNull
        private final List<TypeParameterDescriptor> declaredTypeParameters;
        private final boolean isInner;

        @NotNull
        private final ClassTypeConstructorImpl typeConstructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor container, @NotNull Name name, boolean z10, int i10) {
            super(storageManager, container, name, SourceElement.NO_SOURCE, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.isInner = z10;
            IntRange intRangeV = g.v(0, i10);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, Name.identifier(sb2.toString()), iNextInt, storageManager));
            }
            this.declaredTypeParameters = arrayList;
            this.typeConstructor = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), SetsKt.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: getCompanionObjectDescriptor */
        public ClassDescriptor mo8656getCompanionObjectDescriptor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        @NotNull
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.declaredTypeParameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        @NotNull
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection<ClassDescriptor> getSealedSubclasses() {
            return CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
        public ClassConstructorDescriptor mo8657getUnsubstitutedPrimaryConstructor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
        @NotNull
        public DescriptorVisibility getVisibility() {
            DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isActual() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isCompanionObject() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isData() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExpect() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isFun() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public boolean isInner() {
            return this.isInner;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        @NotNull
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        @NotNull
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        @NotNull
        public MemberScope.Empty getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }
    }

    public NotFoundClasses(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
        this.module = module;
        this.packageFragments = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            private final NotFoundClasses arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return NotFoundClasses.packageFragments$lambda$0(this.arg$0, (FqName) obj);
            }
        });
        this.classes = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$1
            private final NotFoundClasses arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return NotFoundClasses.classes$lambda$2(this.arg$0, (NotFoundClasses.ClassRequest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor classes$lambda$2(NotFoundClasses notFoundClasses, ClassRequest classRequest) {
        PackageFragmentDescriptor packageFragmentDescriptorInvoke;
        Intrinsics.checkNotNullParameter(classRequest, "<destruct>");
        ClassId classIdComponent1 = classRequest.component1();
        List<Integer> listComponent2 = classRequest.component2();
        if (classIdComponent1.isLocal()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classIdComponent1);
        }
        ClassId outerClassId = classIdComponent1.getOuterClassId();
        if (outerClassId == null || (packageFragmentDescriptorInvoke = notFoundClasses.getClass(outerClassId, CollectionsKt.drop(listComponent2, 1))) == null) {
            packageFragmentDescriptorInvoke = notFoundClasses.packageFragments.invoke(classIdComponent1.getPackageFqName());
        }
        DeclarationDescriptor declarationDescriptor = packageFragmentDescriptorInvoke;
        boolean zIsNestedClass = classIdComponent1.isNestedClass();
        StorageManager storageManager = notFoundClasses.storageManager;
        Name shortClassName = classIdComponent1.getShortClassName();
        Integer num = (Integer) CollectionsKt.firstOrNull((List) listComponent2);
        return new MockClassDescriptor(storageManager, declarationDescriptor, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor packageFragments$lambda$0(NotFoundClasses notFoundClasses, FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return new EmptyPackageFragmentDescriptor(notFoundClasses.module, fqName);
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId, @NotNull List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return this.classes.invoke(new ClassRequest(classId, typeParametersCount));
    }
}
