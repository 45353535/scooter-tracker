package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5047dj implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5572ye f77021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5436t3 f77022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5593za f77023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5593za f77024d;

    public C5047dj() {
        this(new C5572ye(), new C5436t3(), new C5593za(100), new C5593za(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull C5150hj c5150hj) {
        Ii iiA;
        C5516w8 c5516w8 = new C5516w8();
        On onA = this.f77023c.a(c5150hj.f77313a);
        c5516w8.f78493a = StringUtils.getUTF8Bytes((String) onA.f76209a);
        List<String> list = c5150hj.f77314b;
        Ii iiA2 = null;
        if (list != null) {
            iiA = this.f77022b.fromModel(list);
            c5516w8.f78494b = (C5242l8) iiA.f75947a;
        } else {
            iiA = null;
        }
        On onA2 = this.f77024d.a(c5150hj.f77315c);
        c5516w8.f78495c = StringUtils.getUTF8Bytes((String) onA2.f76209a);
        Map<String, String> map = c5150hj.f77316d;
        if (map != null) {
            iiA2 = this.f77021a.fromModel(map);
            c5516w8.f78496d = (C5391r8) iiA2.f75947a;
        }
        return new Ii(c5516w8, new C5160i3(C5160i3.b(onA, iiA, onA2, iiA2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5047dj(C5572ye c5572ye, C5436t3 c5436t3, C5593za c5593za, C5593za c5593za2) {
        this.f77021a = c5572ye;
        this.f77022b = c5436t3;
        this.f77023c = c5593za;
        this.f77024d = c5593za2;
    }

    @NonNull
    public final C5150hj a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
