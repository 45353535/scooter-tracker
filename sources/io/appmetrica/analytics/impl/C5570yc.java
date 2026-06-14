package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import j$.util.Objects;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5570yc extends C5187j5 {
    public C5570yc(@NonNull Context context, @NonNull X4 x42, @NonNull C5487v4 c5487v4, @NonNull AbstractC5007c5 abstractC5007c5, @NonNull C5204jm c5204jm, @NonNull InterfaceC5276mh interfaceC5276mh, @NonNull ICommonExecutor iCommonExecutor, int i10, @NonNull C5329ok c5329ok, @NonNull Mb mb2, @NonNull InterfaceC5592z9 interfaceC5592z9) {
        super(context, x42, c5487v4, abstractC5007c5, c5204jm, interfaceC5276mh, iCommonExecutor, i10, mb2, interfaceC5592z9);
    }

    @NonNull
    public final C5474ug a(@NonNull C5520wc c5520wc) {
        C5397re c5397re = new C5397re(c5520wc);
        Objects.requireNonNull(c5520wc);
        return new C5474ug(c5397re, new C5495vc(c5520wc), c5520wc);
    }

    @Override // io.appmetrica.analytics.impl.C5187j5
    @NonNull
    public final InterfaceC5542x9 a(@NonNull C9 c92, @NonNull S6 s62, @NonNull Vg vg2, @NonNull C5487v4 c5487v4, @NonNull X4 x42, @NonNull C4991bf c4991bf) {
        return this.f77496l.a(c92, s62, vg2, c5487v4, x42, c4991bf).a();
    }
}
