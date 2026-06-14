package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Tn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hn f76524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f76525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5315o6 f76526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fl f76527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Me f76528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ne f76529f;

    public Tn() {
        this(new Hn(), new W(new C5606zn()), new C5315o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5008c6 fromModel(@NonNull Sn sn) {
        C5008c6 c5008c6 = new C5008c6();
        In in = sn.f76465a;
        if (in != null) {
            c5008c6.f76949a = this.f76524a.fromModel(in);
        }
        V v10 = sn.f76466b;
        if (v10 != null) {
            c5008c6.f76950b = this.f76525b.fromModel(v10);
        }
        List<Hl> list = sn.f76467c;
        if (list != null) {
            c5008c6.f76953e = this.f76527d.fromModel(list);
        }
        String str = sn.f76471g;
        if (str != null) {
            c5008c6.f76951c = str;
        }
        c5008c6.f76952d = this.f76526c.a(sn.f76472h);
        if (!TextUtils.isEmpty(sn.f76468d)) {
            c5008c6.f76956h = this.f76528e.fromModel(sn.f76468d);
        }
        if (!TextUtils.isEmpty(sn.f76469e)) {
            c5008c6.f76957i = sn.f76469e.getBytes();
        }
        if (!no.a(sn.f76470f)) {
            c5008c6.f76958j = this.f76529f.fromModel(sn.f76470f);
        }
        return c5008c6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Tn(Hn hn, W w10, C5315o6 c5315o6, Fl fl, Me me2, Ne ne2) {
        this.f76525b = w10;
        this.f76524a = hn;
        this.f76526c = c5315o6;
        this.f76527d = fl;
        this.f76528e = me2;
        this.f76529f = ne2;
    }

    @NonNull
    public final Sn a(@NonNull C5008c6 c5008c6) {
        throw new UnsupportedOperationException();
    }
}
