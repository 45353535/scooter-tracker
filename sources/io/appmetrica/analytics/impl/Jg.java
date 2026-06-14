package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Jg implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hn f75998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f75999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5315o6 f76000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fl f76001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Me f76002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ne f76003f;

    public Jg() {
        this(new Hn(), new W(new C5606zn()), new C5315o6(), new Fl(), new Me(), new Ne());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5059e6 fromModel(@NonNull Ig ig2) {
        C5059e6 c5059e6 = new C5059e6();
        c5059e6.f77094f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(ig2.f75943a, c5059e6.f77094f));
        Sn sn = ig2.f75944b;
        if (sn != null) {
            In in = sn.f76465a;
            if (in != null) {
                c5059e6.f77089a = this.f75998a.fromModel(in);
            }
            V v10 = sn.f76466b;
            if (v10 != null) {
                c5059e6.f77090b = this.f75999b.fromModel(v10);
            }
            List<Hl> list = sn.f76467c;
            if (list != null) {
                c5059e6.f77093e = this.f76001d.fromModel(list);
            }
            c5059e6.f77091c = (String) WrapUtils.getOrDefault(sn.f76471g, c5059e6.f77091c);
            c5059e6.f77092d = this.f76000c.a(sn.f76472h);
            if (!TextUtils.isEmpty(sn.f76468d)) {
                c5059e6.f77097i = this.f76002e.fromModel(sn.f76468d);
            }
            if (!TextUtils.isEmpty(sn.f76469e)) {
                c5059e6.f77098j = sn.f76469e.getBytes();
            }
            if (!no.a(sn.f76470f)) {
                c5059e6.f77099k = this.f76003f.fromModel(sn.f76470f);
            }
        }
        return c5059e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jg(Hn hn, W w10, C5315o6 c5315o6, Fl fl, Me me2, Ne ne2) {
        this.f75998a = hn;
        this.f75999b = w10;
        this.f76000c = c5315o6;
        this.f76001d = fl;
        this.f76002e = me2;
        this.f76003f = ne2;
    }

    @NonNull
    public final Ig a(@NonNull C5059e6 c5059e6) {
        throw new UnsupportedOperationException();
    }
}
