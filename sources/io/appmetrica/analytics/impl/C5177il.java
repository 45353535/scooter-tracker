package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5177il implements InterfaceC5139h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lf f77437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5250lg f77438b;

    public C5177il() {
        this(new Lf(), new C5250lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(@NonNull C5152hl c5152hl) {
        Ii iiFromModel;
        A8 a82 = new A8();
        a82.f75510a = 3;
        a82.f75513d = new C5566y8();
        Ii iiFromModel2 = this.f77437a.fromModel(c5152hl.f77324a);
        a82.f75513d.f78577a = (C5441t8) iiFromModel2.f75947a;
        Cg cg2 = c5152hl.f77325b;
        if (cg2 != null) {
            iiFromModel = this.f77438b.fromModel(cg2);
            a82.f75513d.f78578b = (C5491v8) iiFromModel.f75947a;
        } else {
            iiFromModel = null;
        }
        return Collections.singletonList(new Ii(a82, new C5160i3(C5160i3.b(iiFromModel2, iiFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5177il(Lf lf2, C5250lg c5250lg) {
        this.f77437a = lf2;
        this.f77438b = c5250lg;
    }

    @NonNull
    public final C5152hl a(@NonNull List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
