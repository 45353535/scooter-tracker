package q6;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f98720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f98721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m6.c f98722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected p6.a f98723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f98724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f98725f;

    public a(Context context, m6.c cVar, p6.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f98721b = context;
        this.f98722c = cVar;
        this.f98723d = aVar;
        this.f98725f = dVar;
    }

    public void a(m6.b bVar) {
        AdRequest adRequestB = this.f98723d.b(this.f98722c.a());
        if (bVar != null) {
            this.f98724e.a(bVar);
        }
        b(adRequestB, bVar);
    }

    protected abstract void b(AdRequest adRequest, m6.b bVar);

    public void c(Object obj) {
        this.f98720a = obj;
    }
}
