package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected n6.c f67947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map f67948b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m6.a f67949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d f67950d;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f67951b;

        a(Activity activity) {
            this.f67951b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f67949c.show(this.f67951b);
        }
    }

    public k(d dVar) {
        this.f67950d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, List list, n6.b bVar) {
        this.f67947a.a(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, boolean z10, n6.b bVar) {
        this.f67947a.b(context, z10, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Context context, String str, m6.d dVar, n6.b bVar) {
        this.f67947a.c(context, str, dVar, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void e(Activity activity, String str, String str2) {
        m6.a aVar = (m6.a) this.f67948b.get(str2);
        if (aVar != null) {
            this.f67949c = aVar;
            l.a(new a(activity));
            return;
        }
        this.f67950d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
