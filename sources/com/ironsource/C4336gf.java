package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4336gf extends H4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4336gf(@NotNull AbstractC4576v0 adUnitData, @NotNull pg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int b(AbstractC4643z abstractC4643z) {
        return abstractC4643z.h().l();
    }

    @Override // com.ironsource.F
    protected boolean a(@NotNull AbstractC4643z instance, @NotNull pg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(pg pgVar) {
        Integer num;
        List<AbstractC4643z> listB = pgVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((AbstractC4643z) obj).w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(b((AbstractC4643z) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(b((AbstractC4643z) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
