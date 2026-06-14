package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5436t3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5568ya f78256a;

    public C5436t3() {
        this(new C5568ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull List<String> list) {
        On onA = this.f78256a.a((List<Object>) list);
        C5242l8 c5242l8 = new C5242l8();
        c5242l8.f77666a = StringUtils.getUTF8Bytes((List<String>) onA.f76209a);
        InterfaceC5185j3 interfaceC5185j3 = onA.f76210b;
        int i10 = ((C5462u4) interfaceC5185j3).f77367a;
        return new Ii(c5242l8, interfaceC5185j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C5436t3(@NonNull C5568ya c5568ya) {
        this.f78256a = c5568ya;
    }

    @NonNull
    public final List<String> a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
