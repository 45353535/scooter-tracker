package com.iab.omid.library.fyber.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f35027d = new b();

    private b() {
    }

    public static b g() {
        return f35027d;
    }

    @Override // com.iab.omid.library.fyber.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().a(z10);
        }
    }

    @Override // com.iab.omid.library.fyber.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewE = it.next().e();
            if (viewE != null && viewE.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
