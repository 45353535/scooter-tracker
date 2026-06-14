package id;

import id.j1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f74381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f74382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1 f74383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f74384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u0 f74385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f74386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f74387g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f74388a = new LinkedList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f74389b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u f74390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f74391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j1 f74392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private u0 f74393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k f74394g;

        public final a a(d adPhaseParams) {
            Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
            this.f74388a.add(adPhaseParams);
            return this;
        }

        public final c b() {
            k kVar = this.f74394g;
            u uVarD = this.f74390c;
            if (uVarD == null) {
                uVarD = ic.k.f74285a.d();
            }
            u uVar = uVarD;
            Queue queue = this.f74388a;
            j1 j1VarA = this.f74392e;
            if (j1VarA == null) {
                j1VarA = new j1.a().a();
            }
            return new c(uVar, queue, j1VarA, this.f74391d, this.f74393f, kVar, this.f74389b);
        }

        public final a c(k kVar) {
            this.f74394g = kVar;
            return this;
        }

        public final a d(u cacheType) {
            Intrinsics.checkNotNullParameter(cacheType, "cacheType");
            this.f74390c = cacheType;
            return this;
        }

        public final a e(Map map) {
            pd.g0.G(this.f74389b, map);
            return this;
        }

        public final a f(u0 u0Var) {
            this.f74393f = u0Var;
            return this;
        }

        public final a g(d dVar) {
            this.f74391d = dVar;
            return this;
        }

        public final a h(j1 j1Var) {
            this.f74392e = j1Var;
            return this;
        }
    }

    public c(u cacheType, Queue adPhaseParamsQueue, j1 visibilityParams, d dVar, u0 u0Var, k kVar, Map customParams) {
        Intrinsics.checkNotNullParameter(cacheType, "cacheType");
        Intrinsics.checkNotNullParameter(adPhaseParamsQueue, "adPhaseParamsQueue");
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.f74381a = cacheType;
        this.f74382b = adPhaseParamsQueue;
        this.f74383c = visibilityParams;
        this.f74384d = dVar;
        this.f74385e = u0Var;
        this.f74386f = kVar;
        this.f74387g = customParams;
    }

    public final Queue a() {
        return this.f74382b;
    }

    public final k b() {
        return this.f74386f;
    }

    public final u c() {
        return this.f74381a;
    }

    public final u0 d() {
        return this.f74385e;
    }

    public final d e() {
        return this.f74384d;
    }

    public final j1 f() {
        return this.f74383c;
    }
}
