package com.startapp.sdk.internal;

import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f65342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f65343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65344c = "";

    public ub(d9 d9Var) {
        this.f65342a = d9Var;
    }

    public final void a(List3DActivity list3DActivity) {
        d9 d9Var = this.f65342a;
        d9Var.f64414f = list3DActivity;
        d9Var.f64413e.clear();
        d9Var.f64415g = 0;
        d9Var.f64416h.clear();
        HashMap map = d9Var.f64411c;
        if (map != null) {
            for (ag agVar : map.values()) {
                if (agVar != null) {
                    agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
            d9Var.f64411c.clear();
        }
    }
}
