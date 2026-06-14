package com.iab.omid.library.pubnativenet;

import android.content.Context;
import com.iab.omid.library.pubnativenet.internal.i;
import com.iab.omid.library.pubnativenet.internal.j;
import com.iab.omid.library.pubnativenet.utils.e;
import com.iab.omid.library.pubnativenet.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35830a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.1-Pubnativenet";
    }

    void c() {
        g.a();
        com.iab.omid.library.pubnativenet.internal.a.a().d();
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.pubnativenet.internal.b.g().a(context);
        com.iab.omid.library.pubnativenet.utils.a.a(context);
        com.iab.omid.library.pubnativenet.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.pubnativenet.internal.g.b().a(context);
        com.iab.omid.library.pubnativenet.internal.a.a().a(context);
        j.b().a(context);
    }

    boolean b() {
        return this.f35830a;
    }

    void a(boolean z10) {
        this.f35830a = z10;
    }
}
