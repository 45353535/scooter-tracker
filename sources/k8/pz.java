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
public final class pz implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90497d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90498e = a.f90502f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90501c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90502f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pz invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return pz.f90497d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pz a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((qz) BuiltInParserKt.getBuiltInParserComponent().ga().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public pz(String str, Expression expression) {
        this.f90499a = str;
        this.f90500b = expression;
    }

    public final boolean a(pz pzVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return pzVar != null && Intrinsics.areEqual(this.f90499a, pzVar.f90499a) && Intrinsics.areEqual(this.f90500b.evaluate(expressionResolver), pzVar.f90500b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90501c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(pz.class).hashCode() + this.f90499a.hashCode() + this.f90500b.hashCode();
        this.f90501c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((qz) BuiltInParserKt.getBuiltInParserComponent().ga().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
