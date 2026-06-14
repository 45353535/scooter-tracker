package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.dx;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xw implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f92537f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f92538g = a.f92544f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f92541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f92542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92543e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92544f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xw.f92537f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xw a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((yw) BuiltInParserKt.getBuiltInParserComponent().q9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f92545d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f92546e = a.f92550f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f92547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f92548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f92549c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92550f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f92545d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((dx.b) BuiltInParserKt.getBuiltInParserComponent().t9().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression expression2) {
            this.f92547a = expression;
            this.f92548b = expression2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return cVar != null && ((Number) this.f92547a.evaluate(expressionResolver)).longValue() == ((Number) cVar.f92547a.evaluate(expressionResolver2)).longValue() && ((Number) this.f92548b.evaluate(expressionResolver)).longValue() == ((Number) cVar.f92548b.evaluate(expressionResolver2)).longValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f92549c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f92547a.hashCode() + this.f92548b.hashCode();
            this.f92549c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((dx.b) BuiltInParserKt.getBuiltInParserComponent().t9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public xw(Expression expression, Expression expression2, c cVar, Expression expression3) {
        this.f92539a = expression;
        this.f92540b = expression2;
        this.f92541c = cVar;
        this.f92542d = expression3;
    }

    public final boolean a(xw xwVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (xwVar == null) {
            return false;
        }
        Expression expression = this.f92539a;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = xwVar.f92539a;
        if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(this.f92540b.evaluate(expressionResolver), xwVar.f92540b.evaluate(expressionResolver2))) {
            c cVar = this.f92541c;
            if ((cVar != null ? cVar.a(xwVar.f92541c, expressionResolver, expressionResolver2) : xwVar.f92541c == null) && Intrinsics.areEqual(this.f92542d.evaluate(expressionResolver), xwVar.f92542d.evaluate(expressionResolver2))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92543e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xw.class).hashCode();
        Expression expression = this.f92539a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f92540b.hashCode();
        c cVar = this.f92541c;
        int iHash = iHashCode2 + (cVar != null ? cVar.hash() : 0) + this.f92542d.hashCode();
        this.f92543e = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((yw) BuiltInParserKt.getBuiltInParserComponent().q9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
