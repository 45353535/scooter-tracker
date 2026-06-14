package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "getJvmErasure", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class KTypesJvm {
    @NotNull
    public static final KClass<?> getJvmErasure(@NotNull KType kType) {
        KClass<?> jvmErasure;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier != null && (jvmErasure = getJvmErasure(classifier)) != null) {
            return jvmErasure;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }

    public static /* synthetic */ void getJvmErasure$annotations(KType kType) {
    }

    @NotNull
    public static final KClass<?> getJvmErasure(@NotNull KClassifier kClassifier) {
        Object obj;
        KClass<?> jvmErasure;
        Intrinsics.checkNotNullParameter(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            Intrinsics.checkNotNull(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = ((KTypeImpl) kType).getType().getConstructor().mo8663getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KType kType2 = (KType) obj;
        if (kType2 == null) {
            kType2 = (KType) CollectionsKt.firstOrNull((List) upperBounds);
        }
        return (kType2 == null || (jvmErasure = getJvmErasure(kType2)) == null) ? v0.b(Object.class) : jvmErasure;
    }
}
