package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5606zn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fl f78663a;

    public C5606zn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5137h6 fromModel(@NonNull C5581yn c5581yn) {
        C5137h6 c5137h6 = new C5137h6();
        Integer num = c5581yn.f78592e;
        c5137h6.f77296e = num == null ? -1 : num.intValue();
        c5137h6.f77295d = c5581yn.f78591d;
        c5137h6.f77293b = c5581yn.f78589b;
        c5137h6.f77292a = c5581yn.f78588a;
        c5137h6.f77294c = c5581yn.f78590c;
        Fl fl = this.f78663a;
        List list = c5581yn.f78593f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Hl((StackTraceElement) it.next()));
        }
        c5137h6.f77297f = fl.fromModel(arrayList);
        return c5137h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5606zn(Fl fl) {
        this.f78663a = fl;
    }

    @NonNull
    public final C5581yn a(@NonNull C5137h6 c5137h6) {
        throw new UnsupportedOperationException();
    }
}
