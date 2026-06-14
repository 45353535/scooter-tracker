package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5079f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f77139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f77140b = Looper.getMainLooper().getThread();

    public C5079f0(InterfaceC5105g0 interfaceC5105g0, Map map) {
        this.f77139a = map;
    }
}
