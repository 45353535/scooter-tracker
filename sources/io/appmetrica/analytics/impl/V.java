package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5581yn f76574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76576c;

    public V(C5581yn c5581yn, ArrayList arrayList, String str) {
        this.f76574a = c5581yn;
        this.f76575b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f76576c = str;
    }
}
