package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class E5 implements K8, X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S6 f75721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f75722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f75723c;

    public E5(@NotNull S6 s62) {
        this.f75721a = s62;
        Set of2 = SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(EnumC5168ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC5168ib.EVENT_TYPE_SEND_REVENUE_EVENT.a())});
        this.f75722b = of2;
        this.f75723c = new AtomicLong(s62.a(of2));
        s62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a() {
        this.f75723c.set(this.f75721a.a(this.f75722b));
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        return this.f75723c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void b(@NotNull List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f75722b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f75723c.addAndGet(-i10);
    }

    @Override // io.appmetrica.analytics.impl.X8
    public final void a(@NotNull List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f75722b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.f75723c.addAndGet(i10);
    }
}
