package com.ironsource;

import com.ironsource.C4475p0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<H> f41140b = new CopyOnWriteArrayList();

    public J(int i10) {
        this.f41139a = i10;
    }

    private final boolean b() {
        return this.f41139a == 0;
    }

    private final boolean c() {
        return this.f41139a != -1;
    }

    public final void a(@Nullable H h10) {
        if (b()) {
            return;
        }
        if (a()) {
            CollectionsKt.removeFirstOrNull(this.f41140b);
        }
        if (h10 == null) {
            h10 = new H(C4475p0.a.NotPartOfWaterfall);
        }
        this.f41140b.add(h10);
    }

    @NotNull
    public final String d() {
        List<H> list = this.f41140b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((H) it.next()).b().ordinal()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.f41140b.size() >= this.f41139a;
    }
}
