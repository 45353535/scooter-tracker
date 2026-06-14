package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Fl implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gl f75783a = new Gl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5111g6[] fromModel(@NonNull List<Hl> list) {
        C5111g6[] c5111g6Arr = new C5111g6[list.size()];
        Iterator<Hl> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c5111g6Arr[i10] = this.f75783a.fromModel(it.next());
            i10++;
        }
        return c5111g6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Hl> a(C5111g6[] c5111g6Arr) {
        throw new UnsupportedOperationException();
    }
}
