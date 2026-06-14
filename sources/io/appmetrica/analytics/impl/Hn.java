package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Hn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fl f75883a;

    public Hn() {
        this(new Fl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5163i6 fromModel(@NonNull In in) {
        C5163i6 c5163i6 = new C5163i6();
        c5163i6.f77377a = (String) WrapUtils.getOrDefault(in.f75964a, "");
        c5163i6.f77378b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(in.f75965b, ""));
        List<Hl> list = in.f75966c;
        if (list != null) {
            c5163i6.f77379c = this.f75883a.fromModel(list);
        }
        In in2 = in.f75967d;
        if (in2 != null) {
            c5163i6.f77380d = fromModel(in2);
        }
        List list2 = in.f75968e;
        int i10 = 0;
        if (list2 == null) {
            c5163i6.f77381e = new C5163i6[0];
            return c5163i6;
        }
        c5163i6.f77381e = new C5163i6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c5163i6.f77381e[i10] = fromModel((In) it.next());
            i10++;
        }
        return c5163i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hn(Fl fl) {
        this.f75883a = fl;
    }

    @NonNull
    public final In a(@NonNull C5163i6 c5163i6) {
        throw new UnsupportedOperationException();
    }
}
