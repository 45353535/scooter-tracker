package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Uj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f76570b;

    public Uj(String str, Map map) {
        this.f76569a = str;
        this.f76570b = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportEvent(this.f76569a, this.f76570b);
    }
}
