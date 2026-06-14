package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5389r6 implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f78122a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(@Nullable Throwable th2, @NotNull V v10) {
        Iterator it = this.f78122a.iterator();
        while (it.hasNext()) {
            ((Ma) it.next()).a(th2, v10);
        }
    }

    public final void a(@NotNull Ma... maArr) {
        CollectionsKt.addAll(this.f78122a, maArr);
    }

    public final void a(@NotNull List<? extends Ma> list) {
        this.f78122a.addAll(list);
    }

    public final void a() {
        this.f78122a.clear();
    }
}
