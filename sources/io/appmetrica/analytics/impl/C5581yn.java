package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5581yn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f78592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f78593f;

    public C5581yn(String str, int i10, long j10, String str2, Integer num, List list) {
        this.f78588a = str;
        this.f78589b = i10;
        this.f78590c = j10;
        this.f78591d = str2;
        this.f78592e = num;
        this.f78593f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
