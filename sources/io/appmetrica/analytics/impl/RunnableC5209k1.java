package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5209k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f77583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77584b;

    public RunnableC5209k1(C5409s1 c5409s1, List list) {
        this.f77584b = c5409s1;
        this.f77583a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77584b).reportAnr(CollectionUtils.getMapFromList(this.f77583a));
    }
}
