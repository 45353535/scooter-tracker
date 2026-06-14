package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5386r3 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lf f78109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D7 f78110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cf f78111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5250lg f78112d;

    public C5386r3() {
        this(new Lf(), new D7(), new Cf(), new C5250lg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(@NonNull C5411s3 c5411s3) {
        Ii iiA;
        C5216k8 c5216k8 = new C5216k8();
        Ii iiA2 = this.f78109a.fromModel(c5411s3.f78204a);
        c5216k8.f77592a = (C5441t8) iiA2.f75947a;
        c5216k8.f77594c = this.f78110b.fromModel(c5411s3.f78205b);
        Ii iiA3 = this.f78111c.fromModel(c5411s3.f78206c);
        c5216k8.f77595d = (C5416s8) iiA3.f75947a;
        Cg cg2 = c5411s3.f78207d;
        if (cg2 != null) {
            iiA = this.f78112d.fromModel(cg2);
            c5216k8.f77593b = (C5491v8) iiA.f75947a;
        } else {
            iiA = null;
        }
        return new Ii(c5216k8, new C5160i3(C5160i3.b(iiA2, iiA3, iiA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5386r3(Lf lf2, D7 d72, Cf cf2, C5250lg c5250lg) {
        this.f78109a = lf2;
        this.f78110b = d72;
        this.f78111c = cf2;
        this.f78112d = c5250lg;
    }

    @NonNull
    public final C5411s3 a(@NonNull Ii ii) {
        throw new UnsupportedOperationException();
    }
}
