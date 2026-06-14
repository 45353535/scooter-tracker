package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class Y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f76689a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC5263m4 interfaceC5263m4) {
        this.f76689a.add(interfaceC5263m4);
    }

    public final void b(@NonNull InterfaceC5263m4 interfaceC5263m4) {
        this.f76689a.remove(interfaceC5263m4);
    }

    public final List<InterfaceC5263m4> a() {
        return this.f76689a;
    }
}
