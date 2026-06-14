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
public abstract class dr implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87066b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87067c = a.f87069f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87068a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87069f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dr invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return dr.f87066b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dr a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((jr) BuiltInParserKt.getBuiltInParserComponent().I7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends dr {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final er f87070d;

        public c(er erVar) {
            super(null);
            this.f87070d = erVar;
        }

        public final er c() {
            return this.f87070d;
        }
    }

    public static final class d extends dr {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final mr f87071d;

        public d(mr mrVar) {
            super(null);
            this.f87071d = mrVar;
        }

        public final mr c() {
            return this.f87071d;
        }
    }

    public /* synthetic */ dr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(dr drVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (drVar == null) {
            return false;
        }
        if (this instanceof d) {
            mr mrVarC = ((d) this).c();
            Object objB = drVar.b();
            return mrVarC.a(objB instanceof mr ? (mr) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        er erVarC = ((c) this).c();
        Object objB2 = drVar.b();
        return erVarC.a(objB2 instanceof er ? (er) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87068a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new lf.m();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87068a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((jr) BuiltInParserKt.getBuiltInParserComponent().I7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private dr() {
    }
}
