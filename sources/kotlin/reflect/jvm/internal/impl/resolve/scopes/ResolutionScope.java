package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ResolutionScope {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection getContributedDescriptors$default(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.ALL;
            }
            if ((i10 & 2) != 0) {
                function1 = MemberScope.Companion.getALL_NAME_FILTER();
            }
            return resolutionScope.getContributedDescriptors(descriptorKindFilter, function1);
        }

        public static void recordLookup(@NotNull ResolutionScope resolutionScope, @NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            resolutionScope.getContributedFunctions(name, location);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    ClassifierDescriptor mo8665getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    Collection<? extends FunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    /* JADX INFO: renamed from: recordLookup */
    void mo8669recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation);
}
