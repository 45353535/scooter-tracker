package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5310o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f77877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77878c;

    public RunnableC5310o1(C5409s1 c5409s1, String str, List list) {
        this.f77878c = c5409s1;
        this.f77876a = str;
        this.f77877b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77878c).reportEvent(this.f77876a, CollectionUtils.getMapFromList(this.f77877b));
    }
}
