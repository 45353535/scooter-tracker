package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5011c9 extends AbstractC5037d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76959a;

    public C5011c9(List<Object> list) {
        this.f76959a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f76959a;
    }
}
