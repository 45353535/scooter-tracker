package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import f2.g;
import f2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VastAd f18305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f18306c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18304a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18307d = true;

    List a() {
        return this.f18304a;
    }

    void b(VastAd vastAd) {
        this.f18305b = vastAd;
    }

    void c(g gVar) {
        this.f18306c = gVar;
    }

    void d(h2.a aVar, g gVar) {
        c(gVar);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", gVar.a());
        List listF0 = aVar.f0();
        if (listF0 == null || listF0.isEmpty()) {
            return;
        }
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            String strA = h.a((String) it.next(), bundle);
            if (!TextUtils.isEmpty(strA)) {
                this.f18304a.add(strA);
            }
        }
    }

    void e(boolean z10) {
        this.f18307d = z10;
    }

    public VastAd f() {
        return this.f18305b;
    }

    public g g() {
        return this.f18306c;
    }

    public boolean h() {
        return this.f18305b != null;
    }

    boolean i() {
        return this.f18307d;
    }
}
