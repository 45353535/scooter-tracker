package l1;

import n1.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements r1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f93862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f93863b;

    public a(t1.a aVar, p1.a aVar2) {
        t1.b.f104802b.f104803a = aVar;
        p1.b.f98040b.f98041a = aVar2;
    }

    public void authenticate() {
        w1.c.f106930a.execute(new b(this));
    }

    public void destroy() {
        this.f93863b = null;
        this.f93862a.destroy();
    }

    public String getOdt() {
        c cVar = this.f93863b;
        return cVar != null ? cVar.f93865a : "";
    }

    public boolean isAuthenticated() {
        return this.f93862a.h();
    }

    public boolean isConnected() {
        return this.f93862a.a();
    }

    @Override // r1.b
    public void onCredentialsRequestFailed(String str) {
        this.f93862a.onCredentialsRequestFailed(str);
    }

    @Override // r1.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f93862a.onCredentialsRequestSuccess(str, str2);
    }
}
