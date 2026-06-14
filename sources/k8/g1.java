package k8;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f87684i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f87685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f87686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final d f87687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Function2 f87688m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f87692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f87693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f87694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f87695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f87696h;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87697f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return g1.f87684i.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((h1.c) BuiltInParserKt.getBuiltInParserComponent().H().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE(POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1039c f87698c = new C1039c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f87699d = b.f87707f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f87700e = a.f87706f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87705b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87706f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f87698c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f87707f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f87698c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.g1$c$c, reason: collision with other inner class name */
        public static final class C1039c {
            public /* synthetic */ C1039c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.DEFAULT;
                if (Intrinsics.areEqual(str, cVar.f87705b)) {
                    return cVar;
                }
                c cVar2 = c.MERGE;
                if (Intrinsics.areEqual(str, cVar2.f87705b)) {
                    return cVar2;
                }
                c cVar3 = c.EXCLUDE;
                if (Intrinsics.areEqual(str, cVar3.f87705b)) {
                    return cVar3;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f87705b;
            }

            private C1039c() {
            }
        }

        c(String str) {
            this.f87705b = str;
        }
    }

    public enum d {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER(POBCTAOverlayData.KEY_CTA_HEADER),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f87708c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f87709d = b.f87726f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f87710e = a.f87725f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87724b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87725f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f87708c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f87726f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f87708c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.NONE;
                if (Intrinsics.areEqual(str, dVar.f87724b)) {
                    return dVar;
                }
                d dVar2 = d.BUTTON;
                if (Intrinsics.areEqual(str, dVar2.f87724b)) {
                    return dVar2;
                }
                d dVar3 = d.IMAGE;
                if (Intrinsics.areEqual(str, dVar3.f87724b)) {
                    return dVar3;
                }
                d dVar4 = d.TEXT;
                if (Intrinsics.areEqual(str, dVar4.f87724b)) {
                    return dVar4;
                }
                d dVar5 = d.EDIT_TEXT;
                if (Intrinsics.areEqual(str, dVar5.f87724b)) {
                    return dVar5;
                }
                d dVar6 = d.HEADER;
                if (Intrinsics.areEqual(str, dVar6.f87724b)) {
                    return dVar6;
                }
                d dVar7 = d.TAB_BAR;
                if (Intrinsics.areEqual(str, dVar7.f87724b)) {
                    return dVar7;
                }
                d dVar8 = d.LIST;
                if (Intrinsics.areEqual(str, dVar8.f87724b)) {
                    return dVar8;
                }
                d dVar9 = d.SELECT;
                if (Intrinsics.areEqual(str, dVar9.f87724b)) {
                    return dVar9;
                }
                d dVar10 = d.CHECKBOX;
                if (Intrinsics.areEqual(str, dVar10.f87724b)) {
                    return dVar10;
                }
                d dVar11 = d.RADIO;
                if (Intrinsics.areEqual(str, dVar11.f87724b)) {
                    return dVar11;
                }
                d dVar12 = d.AUTO;
                if (Intrinsics.areEqual(str, dVar12.f87724b)) {
                    return dVar12;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f87724b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f87724b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87685j = Expression.Companion.constant$default(companion, c.DEFAULT, null, 2, null);
        f87686k = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f87687l = d.AUTO;
        f87688m = a.f87697f;
    }

    public g1(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, d dVar) {
        this.f87689a = expression;
        this.f87690b = expression2;
        this.f87691c = expression3;
        this.f87692d = expression4;
        this.f87693e = expression5;
        this.f87694f = expression6;
        this.f87695g = dVar;
    }

    public final boolean a(g1 g1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (g1Var == null) {
            return false;
        }
        Expression expression = this.f87689a;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = g1Var.f87689a;
        if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
            Expression expression3 = this.f87690b;
            String str2 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
            Expression expression4 = g1Var.f87690b;
            if (Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(expressionResolver2) : null)) {
                Expression expression5 = this.f87691c;
                Boolean bool = expression5 != null ? (Boolean) expression5.evaluate(expressionResolver) : null;
                Expression expression6 = g1Var.f87691c;
                if (Intrinsics.areEqual(bool, expression6 != null ? (Boolean) expression6.evaluate(expressionResolver2) : null) && this.f87692d.evaluate(expressionResolver) == g1Var.f87692d.evaluate(expressionResolver2) && ((Boolean) this.f87693e.evaluate(expressionResolver)).booleanValue() == ((Boolean) g1Var.f87693e.evaluate(expressionResolver2)).booleanValue()) {
                    Expression expression7 = this.f87694f;
                    String str3 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
                    Expression expression8 = g1Var.f87694f;
                    if (Intrinsics.areEqual(str3, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) && this.f87695g == g1Var.f87695g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87696h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(g1.class).hashCode();
        Expression expression = this.f87689a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f87690b;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f87691c;
        int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.f87692d.hashCode() + this.f87693e.hashCode();
        Expression expression4 = this.f87694f;
        int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f87695g.hashCode();
        this.f87696h = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((h1.c) BuiltInParserKt.getBuiltInParserComponent().H().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
