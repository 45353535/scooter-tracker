package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class kw implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f88722b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f88723c = d.f88728f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f88724a;

    public static final class a extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k8.f f88725d;

        public a(k8.f fVar) {
            super(null);
            this.f88725d = fVar;
        }

        public final k8.f c() {
            return this.f88725d;
        }
    }

    public static final class b extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p f88726d;

        public b(p pVar) {
            super(null);
            this.f88726d = pVar;
        }

        public final p c() {
            return this.f88726d;
        }
    }

    public static final class c extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z f88727d;

        public c(z zVar) {
            super(null);
            this.f88727d = zVar;
        }

        public final z c() {
            return this.f88727d;
        }
    }

    static final class d extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f88728f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return kw.f88722b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kw a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((lw) BuiltInParserKt.getBuiltInParserComponent().k9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private e() {
        }
    }

    public static final class f extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t0 f88729d;

        public f(t0 t0Var) {
            super(null);
            this.f88729d = t0Var;
        }

        public final t0 c() {
            return this.f88729d;
        }
    }

    public static final class g extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final hy f88730d;

        public g(hy hyVar) {
            super(null);
            this.f88730d = hyVar;
        }

        public final hy c() {
            return this.f88730d;
        }
    }

    public static final class h extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sy f88731d;

        public h(sy syVar) {
            super(null);
            this.f88731d = syVar;
        }

        public final sy c() {
            return this.f88731d;
        }
    }

    public static final class i extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final cz f88732d;

        public i(cz czVar) {
            super(null);
            this.f88732d = czVar;
        }

        public final cz c() {
            return this.f88732d;
        }
    }

    public static final class j extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pz f88733d;

        public j(pz pzVar) {
            super(null);
            this.f88733d = pzVar;
        }

        public final pz c() {
            return this.f88733d;
        }
    }

    public static final class k extends kw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final zz f88734d;

        public k(zz zzVar) {
            super(null);
            this.f88734d = zzVar;
        }

        public final zz c() {
            return this.f88734d;
        }
    }

    public /* synthetic */ kw(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(kw kwVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (kwVar == null) {
            return false;
        }
        if (this instanceof j) {
            pz pzVarC = ((j) this).c();
            Object objB = kwVar.b();
            return pzVarC.a(objB instanceof pz ? (pz) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            sy syVarC = ((h) this).c();
            Object objB2 = kwVar.b();
            return syVarC.a(objB2 instanceof sy ? (sy) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            hy hyVarC = ((g) this).c();
            Object objB3 = kwVar.b();
            return hyVarC.a(objB3 instanceof hy ? (hy) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            p pVarC = ((b) this).c();
            Object objB4 = kwVar.b();
            return pVarC.a(objB4 instanceof p ? (p) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            z zVarC = ((c) this).c();
            Object objB5 = kwVar.b();
            return zVarC.a(objB5 instanceof z ? (z) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            zz zzVarC = ((k) this).c();
            Object objB6 = kwVar.b();
            return zzVarC.a(objB6 instanceof zz ? (zz) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            t0 t0VarC = ((f) this).c();
            Object objB7 = kwVar.b();
            return t0VarC.a(objB7 instanceof t0 ? (t0) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof a) {
            k8.f fVarC = ((a) this).c();
            Object objB8 = kwVar.b();
            return fVarC.a(objB8 instanceof k8.f ? (k8.f) objB8 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof i)) {
            throw new lf.m();
        }
        cz czVarC = ((i) this).c();
        Object objB9 = kwVar.b();
        return czVarC.a(objB9 instanceof cz ? (cz) objB9 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f88724a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof i)) {
                throw new lf.m();
            }
            iHash = ((i) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f88724a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((lw) BuiltInParserKt.getBuiltInParserComponent().k9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private kw() {
    }
}
