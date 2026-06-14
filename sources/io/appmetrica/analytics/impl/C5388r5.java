package io.appmetrica.analytics.impl;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5388r5 implements InterfaceC5542x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C9 f78118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f78119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f78121d;

    public C5388r5(@NotNull C9 c92, @NotNull List<? extends K8> list, @NotNull List<? extends K8> list2, @NotNull X4 x42) {
        this.f78118a = c92;
        this.f78119b = list;
        this.f78120c = list2;
        Objects.toString(x42);
        this.f78121d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f78120c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((K8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f78119b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((K8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f78121d.set(false);
    }

    public final void c() {
        this.f78121d.set(true);
    }

    public final void d() {
        if (this.f78121d.get()) {
            List list = this.f78120c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((K8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C5332on) this.f78118a).c();
        }
    }

    public final void e() {
        if (this.f78121d.get() && a()) {
            ((C5332on) this.f78118a).c();
        }
    }

    public final void f() {
        if (this.f78121d.get() && a()) {
            ((C5332on) this.f78118a).b();
        }
    }
}
