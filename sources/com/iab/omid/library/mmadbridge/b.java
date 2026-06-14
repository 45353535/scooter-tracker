package com.iab.omid.library.mmadbridge;

import android.content.Context;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.utils.e;
import com.iab.omid.library.mmadbridge.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35419a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.13-Mmadbridge";
    }

    void c() {
        g.a();
        com.iab.omid.library.mmadbridge.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.mmadbridge.internal.b.g().a(context);
        com.iab.omid.library.mmadbridge.utils.a.a(context);
        com.iab.omid.library.mmadbridge.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.mmadbridge.internal.g.b().a(context);
        com.iab.omid.library.mmadbridge.internal.a.a().a(context);
        j.b().a(context);
    }

    boolean b() {
        return this.f35419a;
    }

    void a(boolean z10) {
        this.f35419a = z10;
    }
}
