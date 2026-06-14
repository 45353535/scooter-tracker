package n1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f95028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f95029c;

    public c(e eVar, d dVar) {
        this.f95029c = eVar;
        this.f95028b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVarA;
        e eVar = this.f95029c;
        if (eVar.a()) {
            try {
                aVarA = u1.a.a(new JSONObject(eVar.f95042k.version()));
            } catch (Exception e10) {
                p1.b.a(p1.d.ONE_DT_GENERAL_ERROR, e10);
                t1.b.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e10.toString());
                aVarA = new o1.a(false, "");
            }
        } else {
            aVarA = new o1.a(false, "");
        }
        eVar.f95041j = aVarA;
        w1.c.f106931b.post(this.f95028b);
    }
}
