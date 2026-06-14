package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.hi;
import k8.li;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class fi implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f87511e = new c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f87512f = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f87513g = b.f87524f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f87515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExpressionList f87516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f87517d;

    public static final class a implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f87518d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f87519e = C1037a.f87523f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f87520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f87521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f87522c;

        /* JADX INFO: renamed from: k8.fi$a$a, reason: collision with other inner class name */
        static final class C1037a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1037a f87523f = new C1037a();

            C1037a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return a.f87518d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((hi.b) BuiltInParserKt.getBuiltInParserComponent().S4().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public a(Expression expression, Expression expression2) {
            this.f87520a = expression;
            this.f87521b = expression2;
        }

        public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return aVar != null && ((Number) this.f87520a.evaluate(expressionResolver)).intValue() == ((Number) aVar.f87520a.evaluate(expressionResolver2)).intValue() && ((Number) this.f87521b.evaluate(expressionResolver)).doubleValue() == ((Number) aVar.f87521b.evaluate(expressionResolver2)).doubleValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f87522c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(a.class).hashCode() + this.f87520a.hashCode() + this.f87521b.hashCode();
            this.f87522c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((hi.b) BuiltInParserKt.getBuiltInParserComponent().S4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87524f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fi invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return fi.f87511e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fi a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((li.b) BuiltInParserKt.getBuiltInParserComponent().V4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public fi(Expression expression, List list, ExpressionList expressionList) {
        this.f87514a = expression;
        this.f87515b = list;
        this.f87516c = expressionList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.fi r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.yandex.div.json.expressions.Expression r1 = r6.f87514a
            java.lang.Object r1 = r1.evaluate(r8)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            com.yandex.div.json.expressions.Expression r3 = r7.f87514a
            java.lang.Object r3 = r3.evaluate(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lb5
            java.util.List r1 = r6.f87515b
            if (r1 == 0) goto L5e
            java.util.List r2 = r7.f87515b
            if (r2 != 0) goto L29
            return r0
        L29:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L35
            goto Lb5
        L35:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L3c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L4d
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L4d:
            java.lang.Object r3 = r2.get(r3)
            k8.fi$a r3 = (k8.fi.a) r3
            k8.fi$a r4 = (k8.fi.a) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L5c
            goto Lb5
        L5c:
            r3 = r5
            goto L3c
        L5e:
            java.util.List r1 = r7.f87515b
            if (r1 != 0) goto Lb5
        L62:
            com.yandex.div.json.expressions.ExpressionList r1 = r6.f87516c
            if (r1 == 0) goto Laf
            java.util.List r8 = r1.evaluate(r8)
            if (r8 == 0) goto Laf
            com.yandex.div.json.expressions.ExpressionList r7 = r7.f87516c
            if (r7 == 0) goto Lae
            java.util.List r7 = r7.evaluate(r9)
            if (r7 != 0) goto L77
            goto Lae
        L77:
            int r9 = r8.size()
            int r1 = r7.size()
            if (r9 == r1) goto L82
            goto Lb5
        L82:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L89:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r8.next()
            int r2 = r9 + 1
            if (r9 >= 0) goto L9a
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L9a:
            java.lang.Object r9 = r7.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r9) goto Lb5
            r9 = r2
            goto L89
        Lae:
            return r0
        Laf:
            com.yandex.div.json.expressions.ExpressionList r7 = r7.f87516c
            if (r7 != 0) goto Lb5
        Lb3:
            r7 = 1
            return r7
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.fi.a(k8.fi, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87517d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(fi.class).hashCode() + this.f87514a.hashCode();
        List list = this.f87515b;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((a) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        ExpressionList expressionList = this.f87516c;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0);
        this.f87517d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((li.b) BuiltInParserKt.getBuiltInParserComponent().V4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
