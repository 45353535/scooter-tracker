package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.nh;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class mh implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f88991f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f88992g = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f88993h = a.f88999f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f88997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f88998e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88999f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return mh.f88991f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mh a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((nh.b) BuiltInParserKt.getBuiltInParserComponent().D4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public mh(Expression expression, Expression expression2, Expression expression3, String str) {
        this.f88994a = expression;
        this.f88995b = expression2;
        this.f88996c = expression3;
        this.f88997d = str;
    }

    public final boolean a(mh mhVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return mhVar != null && ((Boolean) this.f88994a.evaluate(expressionResolver)).booleanValue() == ((Boolean) mhVar.f88994a.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.f88995b.evaluate(expressionResolver)).booleanValue() == ((Boolean) mhVar.f88995b.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f88996c.evaluate(expressionResolver), mhVar.f88996c.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f88997d, mhVar.f88997d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88998e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(mh.class).hashCode() + this.f88994a.hashCode() + this.f88995b.hashCode() + this.f88996c.hashCode() + this.f88997d.hashCode();
        this.f88998e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((nh.b) BuiltInParserKt.getBuiltInParserComponent().D4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
