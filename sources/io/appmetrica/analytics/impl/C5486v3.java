package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5486v3 implements Cdo {
    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5586z3> invoke(@NotNull List<C5586z3> list, @NotNull C5586z3 c5586z3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Y7 y72 = ((C5586z3) it.next()).f78604b;
                Y7 y73 = c5586z3.f78604b;
                if (y72 == y73) {
                    if (y73 != Y7.f76695c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C5586z3) obj).f78604b != Y7.f76695c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.plus((Collection<? extends C5586z3>) arrayList, c5586z3);
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends C5586z3>) list, c5586z3);
    }
}
