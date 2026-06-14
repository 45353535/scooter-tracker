package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeEnhancementUtilsKt {
    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> superQualifiers, boolean z10, boolean z11, boolean z12) {
        NullabilityQualifier nullabilityQualifierSelect;
        boolean z13;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityForErrors = getNullabilityForErrors((JavaTypeQualifiers) it.next());
            if (nullabilityForErrors != null) {
                arrayList.add(nullabilityForErrors);
            }
        }
        NullabilityQualifier nullabilityQualifierSelect2 = select(CollectionsKt.toSet(arrayList), getNullabilityForErrors(javaTypeQualifiers), z10);
        if (nullabilityQualifierSelect2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            nullabilityQualifierSelect = select(CollectionsKt.toSet(arrayList2), javaTypeQualifiers.getNullability(), z10);
        } else {
            nullabilityQualifierSelect = nullabilityQualifierSelect2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) select(CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z10);
        NullabilityQualifier nullabilityQualifier = null;
        if (nullabilityQualifierSelect != null && !z12 && (!z11 || nullabilityQualifierSelect != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier = nullabilityQualifierSelect;
        }
        boolean z14 = false;
        if (nullabilityQualifier == NullabilityQualifier.NOT_NULL) {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        if (((JavaTypeQualifiers) it4.next()).getDefinitelyNotNull()) {
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
            break;
        }
        z13 = false;
        if (nullabilityQualifier != null && nullabilityQualifierSelect2 != nullabilityQualifierSelect) {
            z14 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z13, z14);
    }

    private static final NullabilityQualifier getNullabilityForErrors(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return javaTypeQualifiers.getNullability();
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final <T> T select(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set<? extends T> set2;
        if (!z10) {
            if (t12 != null && (set2 = CollectionsKt.toSet(SetsKt.plus(set, t12))) != null) {
                set = set2;
            }
            return (T) CollectionsKt.singleOrNull(set);
        }
        T t13 = set.contains(t10) ? t10 : set.contains(t11) ? t11 : null;
        if (Intrinsics.areEqual(t13, t10) && Intrinsics.areEqual(t12, t11)) {
            return null;
        }
        return t12 == null ? t13 : t12;
    }

    private static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z10) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z10);
    }
}
