package a1;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3375c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f3376d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f3377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f3378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f3379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f3380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f3381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f3382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f3383k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f3384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f3385b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f3377e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f3378f = new e(aVar2, bVar);
        f3379g = new e(a.xMaxYMax, bVar);
        f3380h = new e(a.xMidYMin, bVar);
        f3381i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f3382j = new e(aVar, bVar2);
        f3383k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f3384a = aVar;
        this.f3385b = bVar;
    }

    public a a() {
        return this.f3384a;
    }

    public b b() {
        return this.f3385b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3384a == eVar.f3384a && this.f3385b == eVar.f3385b;
    }

    public String toString() {
        return this.f3384a + " " + this.f3385b;
    }
}
