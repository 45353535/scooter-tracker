package l0;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f93771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0.h f93772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0.d f93773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93774d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, k0.h hVar, k0.d dVar, boolean z10) {
        this.f93771a = aVar;
        this.f93772b = hVar;
        this.f93773c = dVar;
        this.f93774d = z10;
    }

    public a a() {
        return this.f93771a;
    }

    public k0.h b() {
        return this.f93772b;
    }

    public k0.d c() {
        return this.f93773c;
    }

    public boolean d() {
        return this.f93774d;
    }
}
