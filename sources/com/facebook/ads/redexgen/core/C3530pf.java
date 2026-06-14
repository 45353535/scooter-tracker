package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3530pf {
    public final InterfaceC3535pk A00;
    public final String A01;
    public final Collection<C3544pu> A02;
    public final Collection<C3544pu> A03;
    public final List<Rect> A04;

    public C3530pf(String str, InterfaceC3535pk interfaceC3535pk, List<Rect> rects, Collection<C3544pu> collection, Collection<C3544pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3535pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
