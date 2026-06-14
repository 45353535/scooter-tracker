package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AbstractStrictEqualityTypeChecker {

    @NotNull
    public static final AbstractStrictEqualityTypeChecker INSTANCE = new AbstractStrictEqualityTypeChecker();

    private AbstractStrictEqualityTypeChecker() {
    }

    private final boolean strictEqualRigidTypes(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.argumentsCount(rigidTypeMarker) != typeSystemContext.argumentsCount(rigidTypeMarker2) || typeSystemContext.isMarkedNullable(rigidTypeMarker) != typeSystemContext.isMarkedNullable(rigidTypeMarker2) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) != typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || !typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.identicalArguments(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int iArgumentsCount = typeSystemContext.argumentsCount(rigidTypeMarker);
        for (int i10 = 0; i10 < iArgumentsCount; i10++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(rigidTypeMarker, i10);
            TypeArgumentMarker argument2 = typeSystemContext.getArgument(rigidTypeMarker2, i10);
            if (typeSystemContext.isStarProjection(argument) != typeSystemContext.isStarProjection(argument2)) {
                return false;
            }
            if (!typeSystemContext.isStarProjection(argument)) {
                if (typeSystemContext.getVariance(argument) != typeSystemContext.getVariance(argument2)) {
                    return false;
                }
                KotlinTypeMarker type = typeSystemContext.getType(argument);
                Intrinsics.checkNotNull(type);
                KotlinTypeMarker type2 = typeSystemContext.getType(argument2);
                Intrinsics.checkNotNull(type2);
                if (!strictEqualTypesInternal(typeSystemContext, type, type2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean strictEqualTypesInternal(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        RigidTypeMarker rigidTypeMarkerAsRigidType2 = typeSystemContext.asRigidType(kotlinTypeMarker2);
        if (rigidTypeMarkerAsRigidType != null && rigidTypeMarkerAsRigidType2 != null) {
            return strictEqualRigidTypes(typeSystemContext, rigidTypeMarkerAsRigidType, rigidTypeMarkerAsRigidType2);
        }
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        return flexibleTypeMarkerAsFlexibleType != null && flexibleTypeMarkerAsFlexibleType2 != null && strictEqualRigidTypes(typeSystemContext, typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType2)) && strictEqualRigidTypes(typeSystemContext, typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType2));
    }

    public final boolean strictEqualTypes(@NotNull TypeSystemContext context, @NotNull KotlinTypeMarker a10, @NotNull KotlinTypeMarker b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return strictEqualTypesInternal(context, a10, b10);
    }
}
