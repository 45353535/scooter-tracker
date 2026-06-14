package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Lf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5572ye f76075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cf f76076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5436t3 f76077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nf f76078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5593za f76079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5593za f76080f;

    public Lf() {
        this(new C5572ye(), new Cf(), new C5436t3(), new Nf(), new C5593za(100), new C5593za(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull Mf mf2) {
        Ii iiFromModel;
        Ii iiFromModel2;
        Ii iiA;
        Ii iiA2;
        C5441t8 c5441t8 = new C5441t8();
        On onA = this.f76079e.a(mf2.f76128a);
        c5441t8.f78277a = StringUtils.getUTF8Bytes((String) onA.f76209a);
        On onA2 = this.f76080f.a(mf2.f76129b);
        c5441t8.f78278b = StringUtils.getUTF8Bytes((String) onA2.f76209a);
        List<String> list = mf2.f76130c;
        Ii iiFromModel3 = null;
        if (list != null) {
            iiFromModel = this.f76077c.fromModel(list);
            c5441t8.f78279c = (C5242l8) iiFromModel.f75947a;
        } else {
            iiFromModel = null;
        }
        Map<String, String> map = mf2.f76131d;
        if (map != null) {
            iiFromModel2 = this.f76075a.fromModel(map);
            c5441t8.f78280d = (C5391r8) iiFromModel2.f75947a;
        } else {
            iiFromModel2 = null;
        }
        Ef ef2 = mf2.f76132e;
        if (ef2 != null) {
            iiA = this.f76076b.fromModel(ef2);
            c5441t8.f78281e = (C5416s8) iiA.f75947a;
        } else {
            iiA = null;
        }
        Ef ef3 = mf2.f76133f;
        if (ef3 != null) {
            iiA2 = this.f76076b.fromModel(ef3);
            c5441t8.f78282f = (C5416s8) iiA2.f75947a;
        } else {
            iiA2 = null;
        }
        List<String> list2 = mf2.f76134g;
        if (list2 != null) {
            iiFromModel3 = this.f76078d.fromModel(list2);
            c5441t8.f78283g = (C5466u8[]) iiFromModel3.f75947a;
        }
        return new Ii(c5441t8, new C5160i3(C5160i3.b(onA, onA2, iiFromModel, iiFromModel2, iiA, iiA2, iiFromModel3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(C5572ye c5572ye, Cf cf2, C5436t3 c5436t3, Nf nf2, C5593za c5593za, C5593za c5593za2) {
        this.f76075a = c5572ye;
        this.f76076b = cf2;
        this.f76077c = c5436t3;
        this.f76078d = nf2;
        this.f76079e = c5593za;
        this.f76080f = c5593za2;
    }

    @NonNull
    public final Mf a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
