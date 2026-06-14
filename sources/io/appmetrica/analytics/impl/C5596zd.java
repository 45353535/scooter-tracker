package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5596zd {
    public static ArrayList a() {
        C5170id c5170id;
        List<String> listA = C5186j4.l().f77477m.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c5170id = new C5170id(str, false);
            } else {
                C5186j4.l().m().f77206b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
                c5170id = new C5170id(str, true);
            }
            arrayList.add(c5170id);
        }
        return arrayList;
    }
}
