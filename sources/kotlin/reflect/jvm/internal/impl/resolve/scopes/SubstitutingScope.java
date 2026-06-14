package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubstitutingScope implements MemberScope {

    @NotNull
    private final Lazy _allDescriptors$delegate;

    @NotNull
    private final TypeSubstitutor capturingSubstitutor;

    @Nullable
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;

    @NotNull
    private final Lazy substitutor$delegate;

    @NotNull
    private final MemberScope workerScope;

    public SubstitutingScope(@NotNull MemberScope workerScope, @NotNull final TypeSubstitutor givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.workerScope = workerScope;
        this.substitutor$delegate = i.a(new Function0(givenSubstitutor) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$0
            private final TypeSubstitutor arg$0;

            {
                this.arg$0 = givenSubstitutor;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return SubstitutingScope.substitutor_delegate$lambda$0(this.arg$0);
            }
        });
        TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        Intrinsics.checkNotNullExpressionValue(substitution, "getSubstitution(...)");
        this.capturingSubstitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this._allDescriptors$delegate = i.a(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$1
            private final SubstitutingScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return SubstitutingScope._allDescriptors_delegate$lambda$1(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection _allDescriptors_delegate$lambda$1(SubstitutingScope substitutingScope) {
        return substitutingScope.substitute(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.workerScope, null, null, 3, null));
    }

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        return (Collection) this._allDescriptors$delegate.getValue();
    }

    private final <D extends DeclarationDescriptor> D substitute(D d10) {
        if (this.capturingSubstitutor.isEmpty()) {
            return d10;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.substitutedDescriptors;
        Intrinsics.checkNotNull(map);
        DeclarationDescriptor declarationDescriptorSubstitute = map.get(d10);
        if (declarationDescriptorSubstitute == null) {
            if (!(d10 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            declarationDescriptorSubstitute = ((Substitutable) d10).substitute(this.capturingSubstitutor);
            if (declarationDescriptorSubstitute == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, declarationDescriptorSubstitute);
        }
        D d11 = (D) declarationDescriptorSubstitute;
        Intrinsics.checkNotNull(d11, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeSubstitutor substitutor_delegate$lambda$0(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.getSubstitution().buildSubstitutor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo8665getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        ClassifierDescriptor classifierDescriptorMo8665getContributedClassifier = this.workerScope.mo8665getContributedClassifier(name, location);
        if (classifierDescriptorMo8665getContributedClassifier != null) {
            return (ClassifierDescriptor) substitute(classifierDescriptorMo8665getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return get_allDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return substitute(this.workerScope.getContributedFunctions(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return substitute(this.workerScope.getContributedVariables(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo8669recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(substitute((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }
}
