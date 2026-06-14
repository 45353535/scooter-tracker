package ug;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import yg.b2;
import yg.c2;
import yg.u2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u2 f105663a = yg.o.a(new Function1() { // from class: ug.o
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u.k((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u2 f105664b = yg.o.a(new Function1() { // from class: ug.p
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return u.l((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b2 f105665c = yg.o.b(new Function2() { // from class: ug.q
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u.g((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b2 f105666d = yg.o.b(new Function2() { // from class: ug.r
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return u.i((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer g(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List listE = v.e(ah.c.a(), types, true);
        Intrinsics.checkNotNull(listE);
        return v.a(clazz, listE, new Function0() { // from class: ug.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.h(types);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer i(KClass clazz, final List types) {
        KSerializer kSerializerT;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List listE = v.e(ah.c.a(), types, true);
        Intrinsics.checkNotNull(listE);
        KSerializer kSerializerA = v.a(clazz, listE, new Function0() { // from class: ug.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.j(types);
            }
        });
        if (kSerializerA == null || (kSerializerT = vg.a.t(kSerializerA)) == null) {
            return null;
        }
        return kSerializerT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier j(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer k(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer kSerializerD = v.d(it);
        if (kSerializerD != null) {
            return kSerializerD;
        }
        if (c2.l(it)) {
            return new h(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer l(KClass it) {
        KSerializer kSerializerT;
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer kSerializerD = v.d(it);
        if (kSerializerD == null) {
            kSerializerD = c2.l(it) ? new h(it) : null;
        }
        if (kSerializerD == null || (kSerializerT = vg.a.t(kSerializerD)) == null) {
            return null;
        }
        return kSerializerT;
    }

    public static final KSerializer m(KClass clazz, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z10) {
            return f105664b.a(clazz);
        }
        KSerializer kSerializerA = f105663a.a(clazz);
        if (kSerializerA != null) {
            return kSerializerA;
        }
        return null;
    }

    public static final Object n(KClass clazz, List types, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z10 ? f105665c.a(clazz, types) : f105666d.a(clazz, types);
    }
}
