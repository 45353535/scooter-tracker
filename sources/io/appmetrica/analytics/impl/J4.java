package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class J4 extends Kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I4 f75986a;

    public J4(E4 e42) {
        this.f75986a = new I4(e42);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC5037d9 a(int i10) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC5168ib.a(i10).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f75986a.f75917a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f75986a.f75918b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f75986a.f75919c);
        }
        return new C5011c9(arrayList);
    }
}
