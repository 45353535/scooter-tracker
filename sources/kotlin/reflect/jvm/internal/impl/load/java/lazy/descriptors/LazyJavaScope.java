package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), v0.j(new n0(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), v0.j(new n0(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    @NotNull
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f93378c;

    @NotNull
    private final NotNullLazyValue classNamesLazy$delegate;

    @NotNull
    private final MemoizedFunctionToNullable<Name, PropertyDescriptor> declaredField;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> declaredFunctions;

    @NotNull
    private final NotNullLazyValue<DeclaredMemberIndex> declaredMemberIndex;

    @NotNull
    private final NotNullLazyValue functionNamesLazy$delegate;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;

    @Nullable
    private final LazyJavaScope mainScope;

    @NotNull
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> properties;

    @NotNull
    private final NotNullLazyValue propertyNamesLazy$delegate;

    protected static final class MethodSignatureData {

        @NotNull
        private final List<String> errors;
        private final boolean hasStableParameterNames;

        @Nullable
        private final KotlinType receiverType;

        @NotNull
        private final KotlinType returnType;

        @NotNull
        private final List<TypeParameterDescriptor> typeParameters;

        @NotNull
        private final List<ValueParameterDescriptor> valueParameters;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType returnType, @Nullable KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> valueParameters, @NotNull List<? extends TypeParameterDescriptor> typeParameters, boolean z10, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.returnType = returnType;
            this.receiverType = kotlinType;
            this.valueParameters = valueParameters;
            this.typeParameters = typeParameters;
            this.hasStableParameterNames = z10;
            this.errors = errors;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.areEqual(this.returnType, methodSignatureData.returnType) && Intrinsics.areEqual(this.receiverType, methodSignatureData.receiverType) && Intrinsics.areEqual(this.valueParameters, methodSignatureData.valueParameters) && Intrinsics.areEqual(this.typeParameters, methodSignatureData.typeParameters) && this.hasStableParameterNames == methodSignatureData.hasStableParameterNames && Intrinsics.areEqual(this.errors, methodSignatureData.errors);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.errors;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        @Nullable
        public final KotlinType getReceiverType() {
            return this.receiverType;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.returnType;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        public int hashCode() {
            int iHashCode = this.returnType.hashCode() * 31;
            KotlinType kotlinType = this.receiverType;
            return ((((((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.valueParameters.hashCode()) * 31) + this.typeParameters.hashCode()) * 31) + c.a(this.hasStableParameterNames)) * 31) + this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "MethodSignatureData(returnType=" + this.returnType + ", receiverType=" + this.receiverType + ", valueParameters=" + this.valueParameters + ", typeParameters=" + this.typeParameters + ", hasStableParameterNames=" + this.hasStableParameterNames + ", errors=" + this.errors + ')';
        }
    }

    protected static final class ResolvedValueParameters {

        @NotNull
        private final List<ValueParameterDescriptor> descriptors;
        private final boolean hasSynthesizedNames;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> descriptors, boolean z10) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.descriptors = descriptors;
            this.hasSynthesizedNames = z10;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection allDescriptors$lambda$0(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classNamesLazy_delegate$lambda$12(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
    }

    private final PropertyDescriptorImpl createPropertyDescriptor(JavaField javaField) {
        JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f93378c, javaField), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f93378c.getComponents().getSourceElementFactory().source(javaField), isFinalStatic(javaField));
        Intrinsics.checkNotNullExpressionValue(javaPropertyDescriptorCreate, "create(...)");
        return javaPropertyDescriptorCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor declaredField$lambda$3(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.mainScope;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.declaredField.invoke(name);
        }
        JavaField javaFieldFindFieldByName = lazyJavaScope.declaredMemberIndex.invoke().findFieldByName(name);
        if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
            return null;
        }
        return lazyJavaScope.resolveProperty(javaFieldFindFieldByName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection declaredFunctions$lambda$2(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.mainScope;
        if (lazyJavaScope2 != null) {
            return lazyJavaScope2.declaredFunctions.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : lazyJavaScope.declaredMemberIndex.invoke().findMethodsByName(name)) {
            JavaMethodDescriptor javaMethodDescriptorResolveMethodToFunctionDescriptor = lazyJavaScope.resolveMethodToFunctionDescriptor(javaMethod);
            if (lazyJavaScope.isVisibleAsFunction(javaMethodDescriptorResolveMethodToFunctionDescriptor)) {
                lazyJavaScope.f93378c.getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorResolveMethodToFunctionDescriptor);
                arrayList.add(javaMethodDescriptorResolveMethodToFunctionDescriptor);
            }
        }
        lazyJavaScope.computeImplicitlyDeclaredFunctions(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set functionNamesLazy_delegate$lambda$10(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection functions$lambda$4(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(lazyJavaScope.declaredFunctions.invoke(name));
        lazyJavaScope.retainMostSpecificMethods(linkedHashSet);
        lazyJavaScope.computeNonDeclaredFunctions(linkedHashSet, name);
        return CollectionsKt.toList(lazyJavaScope.f93378c.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.f93378c, linkedHashSet));
    }

    private final Set<Name> getClassNamesLazy() {
        return (Set) StorageKt.getValue(this.classNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    private final Set<Name> getPropertyNamesLazy() {
        return (Set) StorageKt.getValue(this.propertyNamesLazy$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    private final KotlinType getPropertyType(JavaField javaField) {
        KotlinType kotlinTypeTransformJavaType = this.f93378c.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) && !KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) || !isFinalStatic(javaField) || !javaField.getHasConstantNotNullInitializer()) {
            return kotlinTypeTransformJavaType;
        }
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        return kotlinTypeMakeNotNullable;
    }

    private final boolean isFinalStatic(JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List properties$lambda$13(LazyJavaScope lazyJavaScope, Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, lazyJavaScope.declaredField.invoke(name));
        lazyJavaScope.computeNonDeclaredProperties(name, arrayList);
        return DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor()) ? CollectionsKt.toList(arrayList) : CollectionsKt.toList(lazyJavaScope.f93378c.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.f93378c, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set propertyNamesLazy_delegate$lambda$11(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computePropertyNames(DescriptorKindFilter.VARIABLES, null);
    }

    private final PropertyDescriptor resolveProperty(final JavaField javaField) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        PropertyDescriptorImpl propertyDescriptorImplCreatePropertyDescriptor = createPropertyDescriptor(javaField);
        ref$ObjectRef.f93280b = propertyDescriptorImplCreatePropertyDescriptor;
        propertyDescriptorImplCreatePropertyDescriptor.initialize(null, null, null, null);
        ((PropertyDescriptorImpl) ref$ObjectRef.f93280b).setType(getPropertyType(javaField), CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt.emptyList());
        DeclarationDescriptor ownerDescriptor = getOwnerDescriptor();
        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
        if (classDescriptor != null) {
            ref$ObjectRef.f93280b = this.f93378c.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.f93280b, this.f93378c);
        }
        Object obj = ref$ObjectRef.f93280b;
        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj, ((PropertyDescriptorImpl) obj).getType())) {
            ((PropertyDescriptorImpl) ref$ObjectRef.f93280b).setCompileTimeInitializerFactory(new Function0(this, javaField, ref$ObjectRef) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$10
                private final LazyJavaScope arg$0;
                private final JavaField arg$1;
                private final Ref$ObjectRef arg$2;

                {
                    this.arg$0 = this;
                    this.arg$1 = javaField;
                    this.arg$2 = ref$ObjectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return LazyJavaScope.resolveProperty$lambda$16(this.arg$0, this.arg$1, this.arg$2);
                }
            });
        }
        this.f93378c.getComponents().getJavaResolverCache().recordField(javaField, (PropertyDescriptor) ref$ObjectRef.f93280b);
        return (PropertyDescriptor) ref$ObjectRef.f93280b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue resolveProperty$lambda$16(final LazyJavaScope lazyJavaScope, final JavaField javaField, final Ref$ObjectRef ref$ObjectRef) {
        return lazyJavaScope.f93378c.getStorageManager().createNullableLazyValue(new Function0(lazyJavaScope, javaField, ref$ObjectRef) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$11
            private final LazyJavaScope arg$0;
            private final JavaField arg$1;
            private final Ref$ObjectRef arg$2;

            {
                this.arg$0 = lazyJavaScope;
                this.arg$1 = javaField;
                this.arg$2 = ref$ObjectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaScope.resolveProperty$lambda$16$lambda$15(this.arg$0, this.arg$1, this.arg$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue resolveProperty$lambda$16$lambda$15(LazyJavaScope lazyJavaScope, JavaField javaField, Ref$ObjectRef ref$ObjectRef) {
        return lazyJavaScope.f93378c.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(javaField, (PropertyDescriptor) ref$ObjectRef.f93280b);
    }

    private final void retainMostSpecificMethods(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$9
                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj2) {
                        return LazyJavaScope.retainMostSpecificMethods$lambda$6((SimpleFunctionDescriptor) obj2);
                    }
                });
                set.removeAll(list2);
                set.addAll(collectionSelectMostSpecificInEachOverridableGroup);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor retainMostSpecificMethods$lambda$6(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @NotNull
    protected abstract Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    protected final List<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(linkedHashSet, mo8665getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    protected abstract Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    protected void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract DeclaredMemberIndex computeMemberIndex();

    @NotNull
    protected final KotlinType computeMethodReturnType(@NotNull JavaMethod method, @NotNull LazyJavaResolverContext c10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c10, "c");
        return c10.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    protected abstract void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    protected abstract void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    protected abstract Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    protected final NotNullLazyValue<Collection<DeclarationDescriptor>> getAllDescriptors() {
        return this.allDescriptors;
    }

    @NotNull
    protected final LazyJavaResolverContext getC() {
        return this.f93378c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return getClassNamesLazy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.allDescriptors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getFunctionNames().contains(name) ? CollectionsKt.emptyList() : this.functions.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getVariableNames().contains(name) ? CollectionsKt.emptyList() : this.properties.invoke(name);
    }

    @NotNull
    protected final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    @Nullable
    protected abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    @Nullable
    protected final LazyJavaScope getMainScope() {
        return this.mainScope;
    }

    @NotNull
    protected abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return getPropertyNamesLazy();
    }

    protected boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        return true;
    }

    @NotNull
    protected abstract MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    protected final JavaMethodDescriptor resolveMethodToFunctionDescriptor(@NotNull JavaMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f93378c, method), method.getName(), this.f93378c.getComponents().getSourceElementFactory().source(method), this.declaredMemberIndex.invoke().findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.f93378c, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            Intrinsics.checkNotNull(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        MethodSignatureData methodSignatureDataResolveMethodSignature = resolveMethodSignature(method, arrayList, computeMethodReturnType(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersResolveValueParameters.getDescriptors());
        KotlinType receiverType = methodSignatureDataResolveMethodSignature.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), CollectionsKt.emptyList(), methodSignatureDataResolveMethodSignature.getTypeParameters(), methodSignatureDataResolveMethodSignature.getValueParameters(), methodSignatureDataResolveMethodSignature.getReturnType(), Modality.Companion.convertFromFlags(false, method.isAbstract(), !method.isFinal()), UtilsKt.toDescriptorVisibility(method.getVisibility()), methodSignatureDataResolveMethodSignature.getReceiverType() != null ? MapsKt.mapOf(TuplesKt.to(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, CollectionsKt.first((List) resolvedValueParametersResolveValueParameters.getDescriptors()))) : MapsKt.emptyMap());
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataResolveMethodSignature.getHasStableParameterNames(), resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        if (!methodSignatureDataResolveMethodSignature.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataResolveMethodSignature.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    @NotNull
    protected final ResolvedValueParameters resolveValueParameters(@NotNull LazyJavaResolverContext c10, @NotNull FunctionDescriptor functionDescriptor, @NotNull List<? extends JavaValueParameter> jValueParameters) {
        Pair pair;
        Name name;
        Intrinsics.checkNotNullParameter(c10, "c");
        FunctionDescriptor function = functionDescriptor;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(jValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        boolean z10 = false;
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.component2();
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c10, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeTransformArrayType = c10.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = TuplesKt.to(kotlinTypeTransformArrayType, c10.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pair = TuplesKt.to(c10.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            if (Intrinsics.areEqual(function.getName().asString(), "equals") && jValueParameters.size() == 1 && Intrinsics.areEqual(c10.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = Name.identifier(sb2.toString());
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            Intrinsics.checkNotNull(name);
            arrayList.add(new ValueParameterDescriptorImpl(function, null, index, annotationsResolveAnnotations, name, kotlinType, false, false, false, kotlinType2, c10.getComponents().getSourceElementFactory().source(javaValueParameter)));
            function = functionDescriptor;
            z10 = z11;
        }
        return new ResolvedValueParameters(CollectionsKt.toList(arrayList), z10);
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext c10, @Nullable LazyJavaScope lazyJavaScope) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f93378c = c10;
        this.mainScope = lazyJavaScope;
        this.allDescriptors = c10.getStorageManager().createRecursionTolerantLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$0
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaScope.allDescriptors$lambda$0(this.arg$0);
            }
        }, CollectionsKt.emptyList());
        this.declaredMemberIndex = c10.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$1
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.arg$0.computeMemberIndex();
            }
        });
        this.declaredFunctions = c10.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$2
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaScope.declaredFunctions$lambda$2(this.arg$0, (Name) obj);
            }
        });
        this.declaredField = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$3
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaScope.declaredField$lambda$3(this.arg$0, (Name) obj);
            }
        });
        this.functions = c10.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$4
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaScope.functions$lambda$4(this.arg$0, (Name) obj);
            }
        });
        this.functionNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$5
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaScope.functionNamesLazy_delegate$lambda$10(this.arg$0);
            }
        });
        this.propertyNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$6
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaScope.propertyNamesLazy_delegate$lambda$11(this.arg$0);
            }
        });
        this.classNamesLazy$delegate = c10.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$7
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaScope.classNamesLazy_delegate$lambda$12(this.arg$0);
            }
        });
        this.properties = c10.getStorageManager().createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$$Lambda$8
            private final LazyJavaScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaScope.properties$lambda$13(this.arg$0, (Name) obj);
            }
        });
    }
}
