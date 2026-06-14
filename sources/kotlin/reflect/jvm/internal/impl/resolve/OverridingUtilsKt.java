package kotlin.reflect.jvm.internal.impl.resolve;

import a.a;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt.first((List<? extends Object>) linkedList);
            final SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection<a> collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objFirst, linkedList, descriptorByHandle, new Function1(smartSetCreate2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$$Lambda$1
                private final SmartSet arg$0;

                {
                    this.arg$0 = smartSetCreate2;
                }

                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup$lambda$2(this.arg$0, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objSingle = CollectionsKt.single(collectionExtractMembersOverridableInBothWays);
                Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
                smartSetCreate.add(objSingle);
            } else {
                a aVar = (Object) OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(aVar);
                for (a aVar2 : collectionExtractMembersOverridableInBothWays) {
                    Intrinsics.checkNotNull(aVar2);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptorInvoke, descriptorByHandle.invoke(aVar2))) {
                        smartSetCreate2.add(aVar2);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(aVar);
            }
        }
        return smartSetCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectMostSpecificInEachOverridableGroup$lambda$2(SmartSet smartSet, Object obj) {
        Intrinsics.checkNotNull(obj);
        smartSet.add(obj);
        return Unit.f93236a;
    }
}
