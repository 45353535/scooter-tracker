package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5622p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79041c;

    public C5622p(boolean z10, List list, long j10) {
        this.f79039a = z10;
        this.f79040b = list;
        this.f79041c = j10;
    }

    public final long a() {
        return this.f79041c;
    }

    public final boolean b() {
        return this.f79039a;
    }

    public final List c() {
        return this.f79040b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f79039a + ", mediaStoreColumnNames='" + this.f79040b + "', detectWindowSeconds=" + this.f79041c + ')';
    }

    public C5622p() {
        this(new O().f78969a, ArraysKt.toList(new O().f78971c), new O().f78970b);
    }
}
