package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Nj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f76176a;

    public Nj(Map map) {
        this.f76176a = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportAnr(this.f76176a);
    }
}
