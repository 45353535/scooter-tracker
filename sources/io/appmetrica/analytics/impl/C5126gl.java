package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5126gl implements InterfaceC5139h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5047dj f77273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lf f77274b;

    public C5126gl() {
        this(new C5047dj(), new Lf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(@NonNull C5100fl c5100fl) {
        A8 a82 = new A8();
        a82.f75510a = 2;
        a82.f75512c = new C5541x8();
        Ii iiFromModel = this.f77273a.fromModel(c5100fl.f77171b);
        a82.f75512c.f78554b = (C5516w8) iiFromModel.f75947a;
        Ii iiFromModel2 = this.f77274b.fromModel(c5100fl.f77170a);
        a82.f75512c.f78553a = (C5441t8) iiFromModel2.f75947a;
        return Collections.singletonList(new Ii(a82, new C5160i3(C5160i3.b(iiFromModel, iiFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5126gl(C5047dj c5047dj, Lf lf2) {
        this.f77273a = c5047dj;
        this.f77274b = lf2;
    }

    @NonNull
    public final C5100fl a(@NonNull List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
