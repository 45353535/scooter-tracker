package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f64409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64410b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List3DActivity f64414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64415g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hashtable f64412d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f64413e = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f64416h = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f64411c = new HashMap();

    public d9(lb lbVar, lb lbVar2) {
        this.f64409a = lbVar;
        this.f64410b = lbVar2;
    }

    public final Bitmap a(String str, int i10, String str2) {
        Bitmap bitmap = (Bitmap) this.f64412d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f64413e.contains(str)) {
            return null;
        }
        this.f64413e.add(str);
        int i11 = this.f64415g;
        if (i11 >= 15) {
            this.f64416h.add(new c9(this, i10, str, str2));
            return null;
        }
        this.f64415g = i11 + 1;
        ((Executor) this.f64409a.a()).execute(new c9(this, i10, str, str2));
        return null;
    }
}
