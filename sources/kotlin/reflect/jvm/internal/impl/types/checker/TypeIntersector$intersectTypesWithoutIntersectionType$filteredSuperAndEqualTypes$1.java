package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes3.dex */
/* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends y implements Function2<KotlinType, KotlinType, Boolean> {
    TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(Object obj) {
        super(2, obj, NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(KotlinType p02, KotlinType p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(p02, p12));
    }
}
