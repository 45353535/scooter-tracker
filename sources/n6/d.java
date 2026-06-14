package n6;

/* JADX INFO: loaded from: classes11.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f95112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f95113b;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // n6.a
    public void a(String str, String str2, Object obj) {
        this.f95113b.a(str, str2);
        this.f95112a.b();
    }

    @Override // n6.a
    public void onFailure(String str) {
        this.f95113b.d(str);
        this.f95112a.b();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g gVar, f fVar) {
        this.f95112a = aVar;
        this.f95113b = fVar;
    }
}
