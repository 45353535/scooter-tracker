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
public abstract class gf implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87803b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87804c = a.f87806f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87805a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87806f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return gf.f87803b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gf a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((hf) BuiltInParserKt.getBuiltInParserComponent().a4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends gf {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final la f87807d;

        public c(la laVar) {
            super(null);
            this.f87807d = laVar;
        }

        public final la c() {
            return this.f87807d;
        }
    }

    public static final class d extends gf {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final wq f87808d;

        public d(wq wqVar) {
            super(null);
            this.f87808d = wqVar;
        }

        public final wq c() {
            return this.f87808d;
        }
    }

    public /* synthetic */ gf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(gf gfVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (gfVar == null) {
            return false;
        }
        if (this instanceof c) {
            la laVarC = ((c) this).c();
            Object objB = gfVar.b();
            return laVarC.a(objB instanceof la ? (la) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        wq wqVarC = ((d) this).c();
        Object objB2 = gfVar.b();
        return wqVarC.a(objB2 instanceof wq ? (wq) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87805a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87805a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hf) BuiltInParserKt.getBuiltInParserComponent().a4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private gf() {
    }
}
