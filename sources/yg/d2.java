package yg;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SerialDescriptor[] f118947a = new SerialDescriptor[0];

    public static final Set a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof n) {
            return ((n) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(serialDescriptor.f(i10));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f118947a : serialDescriptorArr;
    }

    public static final KClass c(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String d(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return d(simpleName);
    }

    public static final Void f(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new ug.m(e(kClass));
    }

    public static final KType g(KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
    }
}
