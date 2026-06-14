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
public abstract class cb implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f86657b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f86658c = a.f86660f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f86659a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86660f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cb invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return cb.f86657b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cb a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((db) BuiltInParserKt.getBuiltInParserComponent().V2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends cb {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final uo f86661d;

        public c(uo uoVar) {
            super(null);
            this.f86661d = uoVar;
        }

        public final uo c() {
            return this.f86661d;
        }
    }

    public /* synthetic */ cb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(cb cbVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (cbVar == null) {
            return false;
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        uo uoVarC = ((c) this).c();
        Object objB = cbVar.b();
        return uoVarC.a(objB instanceof uo ? (uo) objB : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86659a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        int iHash = iHashCode + ((c) this).c().hash();
        this.f86659a = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((db) BuiltInParserKt.getBuiltInParserComponent().V2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private cb() {
    }
}
