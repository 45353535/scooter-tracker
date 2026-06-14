package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5250lg implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5047dj f77705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5593za f77706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5593za f77707c;

    public C5250lg() {
        this(new C5047dj(), new C5593za(100), new C5593za(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull Cg cg2) {
        Ii iiFromModel;
        C5491v8 c5491v8 = new C5491v8();
        On onA = this.f77706b.a(cg2.f75620a);
        c5491v8.f78439a = StringUtils.getUTF8Bytes((String) onA.f76209a);
        On onA2 = this.f77707c.a(cg2.f75621b);
        c5491v8.f78440b = StringUtils.getUTF8Bytes((String) onA2.f76209a);
        C5150hj c5150hj = cg2.f75622c;
        if (c5150hj != null) {
            iiFromModel = this.f77705a.fromModel(c5150hj);
            c5491v8.f78441c = (C5516w8) iiFromModel.f75947a;
        } else {
            iiFromModel = null;
        }
        return new Ii(c5491v8, new C5160i3(C5160i3.b(onA, onA2, iiFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5250lg(C5047dj c5047dj, C5593za c5593za, C5593za c5593za2) {
        this.f77705a = c5047dj;
        this.f77706b = c5593za;
        this.f77707c = c5593za2;
    }

    @NonNull
    public final Cg a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
