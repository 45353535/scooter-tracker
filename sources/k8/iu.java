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
public abstract class iu implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f88282b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f88283c = a.f88285f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f88284a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88285f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final iu invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return iu.f88282b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final iu a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((mu) BuiltInParserKt.getBuiltInParserComponent().D8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends iu {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pu f88286d;

        public c(pu puVar) {
            super(null);
            this.f88286d = puVar;
        }

        public final pu c() {
            return this.f88286d;
        }
    }

    public static final class d extends iu {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final tu f88287d;

        public d(tu tuVar) {
            super(null);
            this.f88287d = tuVar;
        }

        public final tu c() {
            return this.f88287d;
        }
    }

    public /* synthetic */ iu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(iu iuVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (iuVar == null) {
            return false;
        }
        if (this instanceof c) {
            pu puVarC = ((c) this).c();
            Object objB = iuVar.b();
            return puVarC.a(objB instanceof pu ? (pu) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        tu tuVarC = ((d) this).c();
        Object objB2 = iuVar.b();
        return tuVarC.a(objB2 instanceof tu ? (tu) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f88284a;
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
        this.f88284a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mu) BuiltInParserKt.getBuiltInParserComponent().D8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private iu() {
    }
}
