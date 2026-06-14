package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5417s9 extends Kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5400rh f78222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5450th f78223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5096fh f78224c;

    public C5417s9(C5058e5 c5058e5) {
        this.f78222a = new C5400rh(c5058e5);
        this.f78223b = new C5450th(c5058e5);
        this.f78224c = new C5096fh(c5058e5);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC5037d9 a(int i10) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC5168ib.a(i10).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f78222a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f78224c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f78223b);
            linkedList.add(this.f78222a);
        }
        return new C5011c9(linkedList);
    }
}
