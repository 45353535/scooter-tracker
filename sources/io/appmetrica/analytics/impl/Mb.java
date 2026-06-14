package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class Mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W2 f76122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5336p2 f76123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f76124c;

    public Mb(W2 w22, C5336p2 c5336p2) {
        ArrayList arrayList = new ArrayList();
        this.f76124c = arrayList;
        this.f76122a = w22;
        arrayList.add(w22);
        this.f76123b = c5336p2;
        arrayList.add(c5336p2);
    }

    public final synchronized void a() {
        Iterator it = this.f76124c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5354pk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C5443ta c5443ta) {
        this.f76124c.add(c5443ta);
    }
}
