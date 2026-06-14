package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5028d0 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f76995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5315o6 f76996b;

    public C5028d0() {
        this(new W(new C5606zn()), new C5315o6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(@NonNull C5002c0 c5002c0) {
        Z5 z52 = new Z5();
        z52.f76737a = this.f76995a.fromModel(c5002c0.f76934a);
        String str = c5002c0.f76935b;
        if (str != null) {
            z52.f76738b = str;
        }
        z52.f76739c = this.f76996b.a(c5002c0.f76936c);
        return z52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5028d0(W w10, C5315o6 c5315o6) {
        this.f76995a = w10;
        this.f76996b = c5315o6;
    }

    @NonNull
    public final C5002c0 a(@NonNull Z5 z52) {
        throw new UnsupportedOperationException();
    }
}
