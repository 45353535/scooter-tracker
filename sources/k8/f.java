package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f87402d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f87403e = a.f87407f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f87406c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87407f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return f.f87402d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((g) BuiltInParserKt.getBuiltInParserComponent().d().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public f(String str, Expression expression) {
        this.f87404a = str;
        this.f87405b = expression;
    }

    public final boolean a(f fVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return fVar != null && Intrinsics.areEqual(this.f87404a, fVar.f87404a) && Intrinsics.areEqual(this.f87405b.evaluate(expressionResolver), fVar.f87405b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87406c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(f.class).hashCode() + this.f87404a.hashCode() + this.f87405b.hashCode();
        this.f87406c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((g) BuiltInParserKt.getBuiltInParserComponent().d().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
