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
public abstract class ih implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f88247b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f88248c = a.f88250f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f88249a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88250f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ih invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ih.f88247b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ih a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ph) BuiltInParserKt.getBuiltInParserComponent().G4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends ih {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final mh f88251d;

        public c(mh mhVar) {
            super(null);
            this.f88251d = mhVar;
        }

        public final mh c() {
            return this.f88251d;
        }
    }

    public static final class d extends ih {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sh f88252d;

        public d(sh shVar) {
            super(null);
            this.f88252d = shVar;
        }

        public final sh c() {
            return this.f88252d;
        }
    }

    public /* synthetic */ ih(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(ih ihVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (ihVar == null) {
            return false;
        }
        if (this instanceof d) {
            sh shVarC = ((d) this).c();
            Object objB = ihVar.b();
            return shVarC.a(objB instanceof sh ? (sh) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        mh mhVarC = ((c) this).c();
        Object objB2 = ihVar.b();
        return mhVarC.a(objB2 instanceof mh ? (mh) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f88249a;
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
        this.f88249a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ph) BuiltInParserKt.getBuiltInParserComponent().G4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ih() {
    }
}
