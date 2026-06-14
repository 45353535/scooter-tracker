package ce;

/* JADX INFO: loaded from: classes3.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile Object f6793b;

    public a(b bVar) {
        this.f6792a = bVar;
    }

    @Override // ce.b
    public Object get() {
        Object obj = this.f6793b;
        if (obj != null) {
            return obj;
        }
        Object obj2 = this.f6792a.get();
        this.f6793b = obj2;
        return obj2;
    }
}
