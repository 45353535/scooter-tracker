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
public abstract class fw implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f87632b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87633c = d.f87638f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87634a;

    public static final class a extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k8.a f87635d;

        public a(k8.a aVar) {
            super(null);
            this.f87635d = aVar;
        }

        public final k8.a c() {
            return this.f87635d;
        }
    }

    public static final class b extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k f87636d;

        public b(k kVar) {
            super(null);
            this.f87636d = kVar;
        }

        public final k c() {
            return this.f87636d;
        }
    }

    public static final class c extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f87637d;

        public c(u uVar) {
            super(null);
            this.f87637d = uVar;
        }

        public final u c() {
            return this.f87637d;
        }
    }

    static final class d extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f87638f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return fw.f87632b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fw a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((gw) BuiltInParserKt.getBuiltInParserComponent().h9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private e() {
        }
    }

    public static final class f extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o0 f87639d;

        public f(o0 o0Var) {
            super(null);
            this.f87639d = o0Var;
        }

        public final o0 c() {
            return this.f87639d;
        }
    }

    public static final class g extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final cy f87640d;

        public g(cy cyVar) {
            super(null);
            this.f87640d = cyVar;
        }

        public final cy c() {
            return this.f87640d;
        }
    }

    public static final class h extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ny f87641d;

        public h(ny nyVar) {
            super(null);
            this.f87641d = nyVar;
        }

        public final ny c() {
            return this.f87641d;
        }
    }

    public static final class i extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kz f87642d;

        public i(kz kzVar) {
            super(null);
            this.f87642d = kzVar;
        }

        public final kz c() {
            return this.f87642d;
        }
    }

    public static final class j extends fw {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final uz f87643d;

        public j(uz uzVar) {
            super(null);
            this.f87643d = uzVar;
        }

        public final uz c() {
            return this.f87643d;
        }
    }

    public /* synthetic */ fw(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(fw fwVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (fwVar == null) {
            return false;
        }
        if (this instanceof i) {
            kz kzVarC = ((i) this).c();
            Object objB = fwVar.b();
            return kzVarC.a(objB instanceof kz ? (kz) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            cy cyVarC = ((g) this).c();
            Object objB2 = fwVar.b();
            return cyVarC.a(objB2 instanceof cy ? (cy) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            ny nyVarC = ((h) this).c();
            Object objB3 = fwVar.b();
            return nyVarC.a(objB3 instanceof ny ? (ny) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            u uVarC = ((c) this).c();
            Object objB4 = fwVar.b();
            return uVarC.a(objB4 instanceof u ? (u) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            k kVarC = ((b) this).c();
            Object objB5 = fwVar.b();
            return kVarC.a(objB5 instanceof k ? (k) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            uz uzVarC = ((j) this).c();
            Object objB6 = fwVar.b();
            return uzVarC.a(objB6 instanceof uz ? (uz) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            o0 o0VarC = ((f) this).c();
            Object objB7 = fwVar.b();
            return o0VarC.a(objB7 instanceof o0 ? (o0) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new lf.m();
        }
        k8.a aVarC = ((a) this).c();
        Object objB8 = fwVar.b();
        return aVarC.a(objB8 instanceof k8.a ? (k8.a) objB8 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87634a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new lf.m();
            }
            iHash = ((a) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87634a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((gw) BuiltInParserKt.getBuiltInParserComponent().h9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private fw() {
    }
}
