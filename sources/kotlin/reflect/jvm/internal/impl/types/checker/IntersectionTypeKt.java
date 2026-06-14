package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IntersectionTypeKt {
    @NotNull
    public static final UnwrappedType intersectTypes(@NotNull Collection<? extends UnwrappedType> types) {
        SimpleType lowerBound;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.single(types);
        }
        Collection<? extends UnwrappedType> collection = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (UnwrappedType unwrappedType : collection) {
            z10 = z10 || KotlinTypeKt.isError(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                lowerBound = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    throw new m();
                }
                if (DynamicTypesKt.isDynamic(unwrappedType)) {
                    return unwrappedType;
                }
                lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                z11 = true;
            }
            arrayList.add(lowerBound);
        }
        if (z10) {
            return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z11) {
            return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.upperIfFlexible((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
        return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
    }
}
