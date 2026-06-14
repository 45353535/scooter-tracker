package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class Lh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f76082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f76083c;

    public Lh(C5252li c5252li, String str, List list) {
        this.f76083c = c5252li;
        this.f76081a = str;
        this.f76082b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76083c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportEvent(this.f76081a, CollectionUtils.getMapFromList(this.f76082b));
    }
}
