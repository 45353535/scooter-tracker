package u6;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f105238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f105239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m6.c f105240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected t6.a f105241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f105242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f105243f;

    public a(Context context, m6.c cVar, t6.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f105239b = context;
        this.f105240c = cVar;
        this.f105241d = aVar;
        this.f105243f = dVar;
    }

    public void a(m6.b bVar) {
        AdRequest adRequestB = this.f105241d.b(this.f105240c.a());
        if (bVar != null) {
            this.f105242e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    protected abstract void b(AdRequest adRequest, m6.b bVar);

    public void c(Object obj) {
        this.f105238a = obj;
    }
}
