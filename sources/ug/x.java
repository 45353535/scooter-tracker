package ug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import yg.c1;
import yg.c2;
import yg.d2;
import yg.e1;
import yg.q0;
import yg.q2;
import yg.s0;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class x {
    private static final KSerializer b(KClass kClass, List list, Function0 function0) {
        if (Intrinsics.areEqual(kClass, v0.b(Collection.class)) || Intrinsics.areEqual(kClass, v0.b(List.class)) || Intrinsics.areEqual(kClass, v0.b(List.class)) || Intrinsics.areEqual(kClass, v0.b(ArrayList.class))) {
            return new yg.f((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, v0.b(HashSet.class))) {
            return new s0((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, v0.b(Set.class)) || Intrinsics.areEqual(kClass, v0.b(Set.class)) || Intrinsics.areEqual(kClass, v0.b(LinkedHashSet.class))) {
            return new e1((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, v0.b(HashMap.class))) {
            return new q0((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, v0.b(Map.class)) || Intrinsics.areEqual(kClass, v0.b(Map.class)) || Intrinsics.areEqual(kClass, v0.b(LinkedHashMap.class))) {
            return new c1((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, v0.b(Map.Entry.class))) {
            return vg.a.j((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, v0.b(Pair.class))) {
            return vg.a.m((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, v0.b(Triple.class))) {
            return vg.a.o((KSerializer) list.get(0), (KSerializer) list.get(1), (KSerializer) list.get(2));
        }
        if (!c2.o(kClass)) {
            return null;
        }
        Object objInvoke = function0.invoke();
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return vg.a.a((KClass) objInvoke, (KSerializer) list.get(0));
    }

    private static final KSerializer c(KClass kClass, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return c2.d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer d(KSerializer kSerializer, boolean z10) {
        if (z10) {
            return vg.a.t(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer e(KClass kClass, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer kSerializerB = b(kClass, serializers, elementClassifierIfArray);
        return kSerializerB == null ? c(kClass, serializers) : kSerializerB;
    }

    public static final KSerializer f(ah.b bVar, KType type) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer kSerializerG = g(bVar, type, true);
        if (kSerializerG != null) {
            return kSerializerG;
        }
        c2.p(d2.c(type));
        throw new lf.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlinx.serialization.KSerializer g(ah.b r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = yg.d2.c(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            kotlin.reflect.KType r3 = yg.d2.g(r3)
            r2.add(r3)
            goto L1d
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4c
            boolean r7 = yg.c2.l(r0)
            if (r7 == 0) goto L47
            kotlinx.serialization.KSerializer r7 = ah.b.c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L47
        L45:
            r7 = r4
            goto L60
        L47:
            kotlinx.serialization.KSerializer r7 = ug.u.m(r0, r1)
            goto L60
        L4c:
            boolean r7 = r6.d()
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.Object r7 = ug.u.n(r0, r2, r1)
            boolean r5 = kotlin.Result.i(r7)
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            kotlinx.serialization.KSerializer r7 = ug.v.d(r0)
            if (r7 != 0) goto La9
            kotlinx.serialization.KSerializer r7 = ah.b.c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La9
            boolean r6 = yg.c2.l(r0)
            if (r6 == 0) goto L82
            ug.h r6 = new ug.h
            r6.<init>(r0)
        L80:
            r7 = r6
            goto La9
        L82:
            r7 = r4
            goto La9
        L84:
            java.util.List r7 = ug.v.e(r6, r2, r8)
            if (r7 != 0) goto L8b
            return r4
        L8b:
            ug.w r8 = new ug.w
            r8.<init>()
            kotlinx.serialization.KSerializer r8 = ug.v.a(r0, r7, r8)
            if (r8 != 0) goto La8
            kotlinx.serialization.KSerializer r7 = r6.b(r0, r7)
            if (r7 != 0) goto La9
            boolean r6 = yg.c2.l(r0)
            if (r6 == 0) goto L82
            ug.h r6 = new ug.h
            r6.<init>(r0)
            goto L80
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Lb0
            kotlinx.serialization.KSerializer r6 = d(r7, r1)
            return r6
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.x.g(ah.b, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer i(ah.b bVar, KType type) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return g(bVar, type, false);
    }

    public static final KSerializer j(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer kSerializerB = c2.b(kClass);
        return kSerializerB == null ? q2.b(kClass) : kSerializerB;
    }

    public static final List k(ah.b bVar, List typeArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(v.b(bVar, (KType) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer kSerializerC = v.c(bVar, (KType) it2.next());
            if (kSerializerC == null) {
                return null;
            }
            arrayList2.add(kSerializerC);
        }
        return arrayList2;
    }
}
