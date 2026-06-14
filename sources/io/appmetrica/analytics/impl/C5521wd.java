package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5521wd implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ck f78504a = C5468ua.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5530wm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C5530wm c5530wm;
        Map<String, C5092fd> mapC = this.f78504a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C5092fd c5092fd = mapC.get(key);
            if (c5092fd == null || value == null) {
                c5530wm = null;
            } else {
                c5530wm = new C5530wm();
                c5530wm.f78536a = key;
                c5530wm.f78537b = (byte[]) c5092fd.f77162c.fromModel(value);
            }
            if (c5530wm != null) {
                arrayList.add(c5530wm);
            }
        }
        Object[] array = arrayList.toArray(new C5530wm[0]);
        if (array != null) {
            return (C5530wm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C5530wm[] c5530wmArr) {
        Map<String, C5092fd> mapC = this.f78504a.c();
        ArrayList arrayList = new ArrayList();
        for (C5530wm c5530wm : c5530wmArr) {
            C5092fd c5092fd = mapC.get(c5530wm.f78536a);
            Pair pair = c5092fd != null ? TuplesKt.to(c5530wm.f78536a, c5092fd.f77162c.toModel(c5530wm.f78537b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
