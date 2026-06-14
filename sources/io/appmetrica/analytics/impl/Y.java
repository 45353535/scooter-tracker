package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class Y implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D7 f76682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5593za f76683b;

    public Y() {
        this(new D7(), new C5593za(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull Z z10) {
        C5165i8 c5165i8 = new C5165i8();
        c5165i8.f77386b = this.f76682a.fromModel(z10.f76725a);
        On onA = this.f76683b.a(z10.f76726b);
        c5165i8.f77385a = StringUtils.getUTF8Bytes((String) onA.f76209a);
        return new Ii(c5165i8, new C5160i3(C5160i3.b(onA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(D7 d72, C5593za c5593za) {
        this.f76682a = d72;
        this.f76683b = c5593za;
    }

    @NonNull
    public final Z a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
