package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5362q3 implements InterfaceC5139h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5386r3 f78025a;

    public C5362q3() {
        this(new C5386r3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(@NonNull C5337p3 c5337p3) {
        A8 a82 = new A8();
        a82.f75514e = new C5190j8();
        Ii iiFromModel = this.f78025a.fromModel(c5337p3.f77959b);
        a82.f75514e.f77506a = (C5216k8) iiFromModel.f75947a;
        a82.f75510a = c5337p3.f77958a;
        return Collections.singletonList(new Ii(a82, new C5160i3(C5160i3.b(iiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5362q3(C5386r3 c5386r3) {
        this.f78025a = c5386r3;
    }

    @NonNull
    public final C5337p3 a(@NonNull List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
