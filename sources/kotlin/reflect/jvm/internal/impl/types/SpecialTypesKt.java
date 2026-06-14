package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpecialTypesKt {
    @Nullable
    public static final AbbreviatedType getAbbreviatedType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeUnwrap;
        }
        return null;
    }

    @Nullable
    public static final SimpleType getAbbreviation(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    @NotNull
    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(@NotNull UnwrappedType unwrappedType, boolean z10) {
        Intrinsics.checkNotNullParameter(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, unwrappedType, z10, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(unwrappedType);
        return simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull : unwrappedType.makeNullableAsSpecified(false);
    }

    public static /* synthetic */ UnwrappedType makeDefinitelyNotNullOrNotNull$default(UnwrappedType unwrappedType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return makeDefinitelyNotNullOrNotNull(unwrappedType, z10);
    }

    private static final SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull;
        TypeConstructor constructor = kotlinType.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor = constructor instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) constructor : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull.createType();
    }

    @NotNull
    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(@NotNull SimpleType simpleType, boolean z10) {
        Intrinsics.checkNotNullParameter(simpleType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType, z10, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(simpleType);
        return simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull == null ? simpleType.makeNullableAsSpecified(false) : simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull;
    }

    public static /* synthetic */ SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(SimpleType simpleType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, z10);
    }

    @NotNull
    public static final SimpleType withAbbreviation(@NotNull SimpleType simpleType, @NotNull SimpleType abbreviatedType) {
        Intrinsics.checkNotNullParameter(simpleType, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.isError(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }

    @NotNull
    public static final NewCapturedType withNotNullProjection(@NotNull NewCapturedType newCapturedType) {
        Intrinsics.checkNotNullParameter(newCapturedType, "<this>");
        return new NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }

    private static final IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionMo8664getSupertypes = intersectionTypeConstructor.mo8664getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo8664getSupertypes, 10));
        Iterator<T> it = collectionMo8664getSupertypes.iterator();
        boolean z10 = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeMakeDefinitelyNotNullOrNotNull$default = (KotlinType) it.next();
            if (TypeUtils.isNullableType(kotlinTypeMakeDefinitelyNotNullOrNotNull$default)) {
                kotlinTypeMakeDefinitelyNotNullOrNotNull$default = makeDefinitelyNotNullOrNotNull$default(kotlinTypeMakeDefinitelyNotNullOrNotNull$default.unwrap(), false, 1, null);
                z10 = true;
            }
            arrayList.add(kotlinTypeMakeDefinitelyNotNullOrNotNull$default);
        }
        if (!z10) {
            return null;
        }
        KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
        if (alternativeType != null) {
            if (TypeUtils.isNullableType(alternativeType)) {
                alternativeType = makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null);
            }
            kotlinType = alternativeType;
        }
        return new IntersectionTypeConstructor(arrayList).setAlternative(kotlinType);
    }
}
