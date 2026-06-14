package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Gg implements Ul, Na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4 f75827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y4 f75828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Em f75829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Wa f75830e;

    public Gg(@NotNull Context context, @NotNull X4 x42, @NotNull C5512w4 c5512w4, @NotNull InterfaceC5084f5 interfaceC5084f5, @NotNull Y4 y42, @NotNull Ll ll) {
        this.f75826a = context;
        this.f75827b = x42;
        this.f75828c = y42;
        Em emA = ll.a(context, x42, c5512w4.f78480a);
        this.f75829d = emA;
        this.f75830e = interfaceC5084f5.a(context, x42, c5512w4.f78481b, emA);
        ll.a(x42, this);
    }

    @VisibleForTesting
    @NotNull
    public final X4 a() {
        return this.f75827b;
    }

    @VisibleForTesting
    @NotNull
    public final Context b() {
        return this.f75826a;
    }

    public final void a(@NotNull InterfaceC5263m4 interfaceC5263m4) {
        this.f75828c.f76689a.add(interfaceC5263m4);
    }

    public final void b(@NotNull InterfaceC5263m4 interfaceC5263m4) {
        this.f75828c.f76689a.remove(interfaceC5263m4);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(@NotNull C5204jm c5204jm) {
        ((C5058e5) this.f75830e).a(c5204jm);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(@NotNull Nl nl, @Nullable C5204jm c5204jm) {
        ((C5058e5) this.f75830e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(@NotNull C5512w4 c5512w4) {
        this.f75829d.a(c5512w4.f78480a);
        this.f75830e.a(c5512w4.f78481b);
    }

    public Gg(@NotNull Context context, @NotNull X4 x42, @NotNull C5512w4 c5512w4, @NotNull InterfaceC5084f5 interfaceC5084f5) {
        this(context, x42, c5512w4, interfaceC5084f5, new Y4(), Ll.a());
    }

    public final void a(@NotNull W5 w52, @NotNull C5512w4 c5512w4) {
        if (!D9.f75659c.contains(EnumC5168ib.a(w52.f76617d))) {
            this.f75830e.a(c5512w4.f78481b);
        }
        ((C5058e5) this.f75830e).a(w52);
    }
}
