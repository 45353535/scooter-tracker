package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Cf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f75618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Df f75619b;

    public Cf() {
        this(new Y(), new Df(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull Ef ef2) {
        int bytesTruncated;
        C5416s8 c5416s8 = new C5416s8();
        Ii iiFromModel = this.f75618a.fromModel(ef2.f75736a);
        c5416s8.f78220a = (C5165i8) iiFromModel.f75947a;
        On onA = this.f75619b.a(ef2.f75737b);
        if (no.a((Collection) onA.f76209a)) {
            bytesTruncated = 0;
        } else {
            c5416s8.f78221b = new C5165i8[((List) onA.f76209a).size()];
            bytesTruncated = 0;
            for (int i10 = 0; i10 < ((List) onA.f76209a).size(); i10++) {
                Ii iiFromModel2 = this.f75618a.fromModel((Z) ((List) onA.f76209a).get(i10));
                c5416s8.f78221b[i10] = (C5165i8) iiFromModel2.f75947a;
                bytesTruncated += iiFromModel2.f75948b.getBytesTruncated();
            }
        }
        return new Ii(c5416s8, new C5160i3(C5160i3.b(iiFromModel, onA, new C5160i3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cf(Y y10, Df df2) {
        this.f75618a = y10;
        this.f75619b = df2;
    }

    @NonNull
    public final Ef a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
