package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.nm;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mm implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f89019d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f89020e = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f89021f = a.f89025f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f89022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f89023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f89024c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89025f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mm invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return mm.f89019d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mm a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((nm.c) BuiltInParserKt.getBuiltInParserComponent().i6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public mm(Expression expression, Expression expression2) {
        this.f89022a = expression;
        this.f89023b = expression2;
    }

    public final boolean a(mm mmVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return mmVar != null && this.f89022a.evaluate(expressionResolver) == mmVar.f89022a.evaluate(expressionResolver2) && ((Number) this.f89023b.evaluate(expressionResolver)).longValue() == ((Number) mmVar.f89023b.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f89024c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(mm.class).hashCode() + this.f89022a.hashCode() + this.f89023b.hashCode();
        this.f89024c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((nm.c) BuiltInParserKt.getBuiltInParserComponent().i6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
