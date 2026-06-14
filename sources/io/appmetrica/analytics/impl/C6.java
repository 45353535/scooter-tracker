package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class C6 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f75607a;

    public C6() {
        this(new Jg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5059e6 fromModel(@NonNull B6 b62) {
        C5059e6 c5059e6FromModel = this.f75607a.fromModel(b62.f75575a);
        c5059e6FromModel.f77095g = 1;
        C5034d6 c5034d6 = new C5034d6();
        c5059e6FromModel.f77096h = c5034d6;
        c5034d6.f77005a = StringUtils.correctIllFormedString(b62.f75576b);
        return c5059e6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C6(Jg jg2) {
        this.f75607a = jg2;
    }

    @NonNull
    public final B6 a(@NonNull C5059e6 c5059e6) {
        throw new UnsupportedOperationException();
    }
}
