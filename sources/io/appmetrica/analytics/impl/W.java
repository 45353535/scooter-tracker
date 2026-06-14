package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class W implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5606zn f76607a;

    public W(@NonNull C5606zn c5606zn) {
        this.f76607a = c5606zn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull V v10) {
        Y5 y52 = new Y5();
        C5581yn c5581yn = v10.f76574a;
        if (c5581yn != null) {
            y52.f76691a = this.f76607a.fromModel(c5581yn);
        }
        y52.f76692b = new C5137h6[v10.f76575b.size()];
        Iterator it = v10.f76575b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            y52.f76692b[i10] = this.f76607a.fromModel((C5581yn) it.next());
            i10++;
        }
        String str = v10.f76576c;
        if (str != null) {
            y52.f76693c = str;
        }
        return y52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final V a(@NonNull Y5 y52) {
        throw new UnsupportedOperationException();
    }
}
