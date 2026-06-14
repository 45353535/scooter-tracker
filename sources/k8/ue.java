package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.we;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ue implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f91651i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f91652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f91653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f91654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f91655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f91656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Function2 f91657o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f91660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f91661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f91662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f91663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f91664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f91665h;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91666f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ue invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ue.f91651i.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ue a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((we.e) BuiltInParserKt.getBuiltInParserComponent().U3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f91652j = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f91653k = Expression.Companion.constant$default(companion, y5.CENTER, null, 2, null);
        f91654l = Expression.Companion.constant$default(companion, z5.CENTER, null, 2, null);
        f91655m = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f91656n = Expression.Companion.constant$default(companion, df.FILL, null, 2, null);
        f91657o = a.f91666f;
    }

    public ue(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, Expression expression5, Expression expression6) {
        this.f91658a = expression;
        this.f91659b = expression2;
        this.f91660c = expression3;
        this.f91661d = list;
        this.f91662e = expression4;
        this.f91663f = expression5;
        this.f91664g = expression6;
    }

    public final boolean a(ue ueVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (ueVar != null && ((Number) this.f91658a.evaluate(expressionResolver)).doubleValue() == ((Number) ueVar.f91658a.evaluate(expressionResolver2)).doubleValue() && this.f91659b.evaluate(expressionResolver) == ueVar.f91659b.evaluate(expressionResolver2) && this.f91660c.evaluate(expressionResolver) == ueVar.f91660c.evaluate(expressionResolver2)) {
            List list = this.f91661d;
            if (list != null) {
                List list2 = ueVar.f91661d;
                if (list2 != null && list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((cc) obj).a((cc) list2.get(i10), expressionResolver, expressionResolver2)) {
                            break;
                        }
                        i10 = i11;
                    }
                    if (Intrinsics.areEqual(this.f91662e.evaluate(expressionResolver), ueVar.f91662e.evaluate(expressionResolver2)) || ((Boolean) this.f91663f.evaluate(expressionResolver)).booleanValue() != ((Boolean) ueVar.f91663f.evaluate(expressionResolver2)).booleanValue() || this.f91664g.evaluate(expressionResolver) != ueVar.f91664g.evaluate(expressionResolver2)) {
                        break;
                    }
                    return true;
                }
            } else if (ueVar.f91661d == null) {
                if (Intrinsics.areEqual(this.f91662e.evaluate(expressionResolver), ueVar.f91662e.evaluate(expressionResolver2))) {
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91665h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ue.class).hashCode() + this.f91658a.hashCode() + this.f91659b.hashCode() + this.f91660c.hashCode();
        List list = this.f91661d;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((cc) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f91662e.hashCode() + this.f91663f.hashCode() + this.f91664g.hashCode();
        this.f91665h = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((we.e) BuiltInParserKt.getBuiltInParserComponent().U3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
