package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class U8 implements ProtobufConverter {
    public static B9 a(T8 t82) {
        B9 b92 = new B9();
        b92.f75582d = new int[t82.f76491b.size()];
        Iterator it = t82.f76491b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b92.f75582d[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        b92.f75581c = t82.f76493d;
        b92.f75580b = t82.f76492c;
        b92.f75579a = t82.f76490a;
        return b92;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((T8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        B9 b92 = (B9) obj;
        return new T8(b92.f75579a, b92.f75580b, b92.f75581c, CollectionUtils.hashSetFromIntArray(b92.f75582d));
    }
}
