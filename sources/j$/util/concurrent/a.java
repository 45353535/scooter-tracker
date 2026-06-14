package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f84851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f84852j;

    public a(k[] kVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i10, 0, i11);
        this.f84851i = concurrentHashMap;
        a();
    }

    public final boolean hasNext() {
        return this.f84872b != null;
    }

    public final boolean hasMoreElements() {
        return this.f84872b != null;
    }

    public final void remove() {
        k kVar = this.f84852j;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        this.f84852j = null;
        this.f84851i.g(kVar.f84864b, null, null);
    }
}
