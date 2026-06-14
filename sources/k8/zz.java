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
public final class zz implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f93032d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f93033e = a.f93037f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f93035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f93036c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f93037f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zz invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return zz.f93032d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zz a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((a00) BuiltInParserKt.getBuiltInParserComponent().ma().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public zz(String str, Expression expression) {
        this.f93034a = str;
        this.f93035b = expression;
    }

    public final boolean a(zz zzVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return zzVar != null && Intrinsics.areEqual(this.f93034a, zzVar.f93034a) && Intrinsics.areEqual(this.f93035b.evaluate(expressionResolver), zzVar.f93035b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f93036c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(zz.class).hashCode() + this.f93034a.hashCode() + this.f93035b.hashCode();
        this.f93036c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a00) BuiltInParserKt.getBuiltInParserComponent().ma().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
