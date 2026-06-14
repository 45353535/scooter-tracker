package l0;

/* JADX INFO: loaded from: classes5.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f93781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93782c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a g(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f93780a = str;
        this.f93781b = aVar;
        this.f93782c = z10;
    }

    @Override // l0.c
    public f0.c a(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar) {
        if (oVar.g0(d0.u.MergePathsApi19)) {
            return new f0.l(this);
        }
        q0.g.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f93781b;
    }

    public String c() {
        return this.f93780a;
    }

    public boolean d() {
        return this.f93782c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f93781b + '}';
    }
}
