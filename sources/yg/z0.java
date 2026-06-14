package yg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
final class z0 implements KType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KType f119108b;

    public z0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f119108b = origin;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.f119108b;
        z0 z0Var = obj instanceof z0 ? (z0) obj : null;
        if (!Intrinsics.areEqual(kType, z0Var != null ? z0Var.f119108b : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(xf.a.b((KClass) classifier), xf.a.b((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return this.f119108b.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public List getArguments() {
        return this.f119108b.getArguments();
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f119108b.getClassifier();
    }

    public int hashCode() {
        return this.f119108b.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f119108b.isMarkedNullable();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f119108b;
    }
}
