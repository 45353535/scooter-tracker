package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4404l implements hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f43495a;

    public C4404l(Activity activity) {
        this.f43495a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.hg
    public void a() {
        Activity activity = this.f43495a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
