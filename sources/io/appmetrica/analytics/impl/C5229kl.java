package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5229kl implements InterfaceC5139h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5047dj f77622a;

    public C5229kl() {
        this(new C5047dj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(@NonNull C5203jl c5203jl) {
        A8 a82 = new A8();
        a82.f75510a = 1;
        a82.f75511b = new C5591z8();
        Ii iiFromModel = this.f77622a.fromModel(c5203jl.f77538a);
        a82.f75511b.f78610a = (C5516w8) iiFromModel.f75947a;
        C5160i3 c5160i3 = new C5160i3(C5160i3.b(iiFromModel));
        iiFromModel.f75948b.getBytesTruncated();
        return Collections.singletonList(new Ii(a82, c5160i3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5229kl(C5047dj c5047dj) {
        this.f77622a = c5047dj;
    }

    @NonNull
    public final C5203jl a(@NonNull List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
