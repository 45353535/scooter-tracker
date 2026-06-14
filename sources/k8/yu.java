package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.bv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yu implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f92808h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92809i = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f92810j = a.f92818f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f92814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f92815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f92816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f92817g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92818f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yu invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return yu.f92808h.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yu a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((bv.b) BuiltInParserKt.getBuiltInParserComponent().M8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public yu(Expression expression, List list, String str, List list2, Expression expression2, String str2) {
        this.f92811a = expression;
        this.f92812b = list;
        this.f92813c = str;
        this.f92814d = list2;
        this.f92815e = expression2;
        this.f92816f = str2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f92817g;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(yu.class).hashCode() + this.f92811a.hashCode();
        List list = this.f92812b;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f92813c.hashCode();
        List list2 = this.f92814d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i10 = iHashCode2 + iHash2;
        Expression expression = this.f92815e;
        int iHashCode3 = i10 + (expression != null ? expression.hashCode() : 0);
        String str = this.f92816f;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.f92817g = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bv.b) BuiltInParserKt.getBuiltInParserComponent().M8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
