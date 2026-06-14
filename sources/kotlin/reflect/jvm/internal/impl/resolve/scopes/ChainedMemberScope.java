package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ChainedMemberScope implements MemberScope {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String debugName;

    @NotNull
    private final MemberScope[] scopes;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberScope create(@NotNull String debugName, @NotNull Iterable<? extends MemberScope> scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.addAll(smartList, ((ChainedMemberScope) memberScope).scopes);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(debugName, smartList);
        }

        @NotNull
        public final MemberScope createOrSingle$descriptors(@NotNull String debugName, @NotNull List<? extends MemberScope> scopes) {
            Intrinsics.checkNotNullParameter(debugName, "debugName");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0) : MemberScope.Empty.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt.asIterable(this.scopes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo8665getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.scopes) {
            ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = memberScope.mo8665getContributedClassifier(name, location);
            if (classifierDescriptorMo8665getContributedClassifier != null) {
                if (!(classifierDescriptorMo8665getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo8665getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo8665getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo8665getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(kindFilter, nameFilter);
        }
        Collection<DeclarationDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return collectionConcat == null ? SetsKt.emptySet() : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, location);
        }
        Collection<SimpleFunctionDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedFunctions(name, location));
        }
        return collectionConcat == null ? SetsKt.emptySet() : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, location);
        }
        Collection<PropertyDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedVariables(name, location));
        }
        return collectionConcat == null ? SetsKt.emptySet() : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArr = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArr = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, memberScope.getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo8669recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        for (MemberScope memberScope : this.scopes) {
            memberScope.mo8669recordLookup(name, location);
        }
    }

    @NotNull
    public String toString() {
        return this.debugName;
    }

    private ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.debugName = str;
        this.scopes = memberScopeArr;
    }
}
