package com.iab.omid.library.pubnativenet.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f35849d = new b();

    private b() {
    }

    public static b g() {
        return f35849d;
    }

    @Override // com.iab.omid.library.pubnativenet.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.pubnativenet.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewC = it.next().c();
            if (viewC != null && viewC.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
