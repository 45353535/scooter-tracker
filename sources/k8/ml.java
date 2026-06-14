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
public abstract class ml implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f89013b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f89014c = a.f89016f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f89015a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89016f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ml invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ml.f89013b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ml a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ql) BuiltInParserKt.getBuiltInParserComponent().T5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends ml {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final nl f89017d;

        public c(nl nlVar) {
            super(null);
            this.f89017d = nlVar;
        }

        public final nl c() {
            return this.f89017d;
        }
    }

    public static final class d extends ml {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final tl f89018d;

        public d(tl tlVar) {
            super(null);
            this.f89018d = tlVar;
        }

        public final tl c() {
            return this.f89018d;
        }
    }

    public /* synthetic */ ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(ml mlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (mlVar == null) {
            return false;
        }
        if (this instanceof c) {
            nl nlVarC = ((c) this).c();
            Object objB = mlVar.b();
            return nlVarC.a(objB instanceof nl ? (nl) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        tl tlVarC = ((d) this).c();
        Object objB2 = mlVar.b();
        return tlVarC.a(objB2 instanceof tl ? (tl) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f89015a;
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
        this.f89015a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ql) BuiltInParserKt.getBuiltInParserComponent().T5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ml() {
    }
}
