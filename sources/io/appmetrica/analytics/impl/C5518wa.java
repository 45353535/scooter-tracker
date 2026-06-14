package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5518wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f78497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78498b;

    public C5518wa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f78497a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f78497a.toString();
    }

    public C5518wa(boolean z10) {
        this.f78497a = new HashMap();
        this.f78498b = z10;
    }
}
