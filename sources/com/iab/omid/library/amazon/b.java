package com.iab.omid.library.amazon;

import android.content.Context;
import com.iab.omid.library.amazon.internal.i;
import com.iab.omid.library.amazon.utils.e;
import com.iab.omid.library.amazon.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f34103a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.10-Amazon";
    }

    void c() {
        g.a();
        com.iab.omid.library.amazon.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.amazon.internal.b.g().a(context);
        com.iab.omid.library.amazon.utils.a.a(context);
        com.iab.omid.library.amazon.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.amazon.internal.g.b().a(context);
        com.iab.omid.library.amazon.internal.a.a().a(context);
    }

    boolean b() {
        return this.f34103a;
    }

    void a(boolean z10) {
        this.f34103a = z10;
    }
}
