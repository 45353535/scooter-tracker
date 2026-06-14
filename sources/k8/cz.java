package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.dz;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cz implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f86861g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f86862h = "new_value";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Function2 f86863i = a.f86870f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f86867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f86868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f86869f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86870f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cz invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return cz.f86861g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cz a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((dz.c) BuiltInParserKt.getBuiltInParserComponent().X9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public cz(Expression expression, String str, String str2, List list, Expression expression2) {
        this.f86864a = expression;
        this.f86865b = str;
        this.f86866c = str2;
        this.f86867d = list;
        this.f86868e = expression2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.cz r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.yandex.div.json.expressions.Expression r1 = r6.f86864a
            java.lang.Object r1 = r1.evaluate(r8)
            com.yandex.div.json.expressions.Expression r2 = r7.f86864a
            java.lang.Object r2 = r2.evaluate(r9)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L7b
            java.lang.String r1 = r6.f86865b
            java.lang.String r2 = r7.f86865b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L7b
            java.lang.String r1 = r6.f86866c
            java.lang.String r2 = r7.f86866c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L7b
            java.util.List r1 = r6.f86867d
            if (r1 == 0) goto L67
            java.util.List r2 = r7.f86867d
            if (r2 != 0) goto L33
            return r0
        L33:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L3e
            goto L7b
        L3e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L56
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L56:
            java.lang.Object r3 = r2.get(r3)
            k8.j1 r3 = (k8.j1) r3
            k8.j1 r4 = (k8.j1) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L65
            goto L7b
        L65:
            r3 = r5
            goto L45
        L67:
            java.util.List r1 = r7.f86867d
            if (r1 != 0) goto L7b
        L6b:
            com.yandex.div.json.expressions.Expression r1 = r6.f86868e
            java.lang.Object r8 = r1.evaluate(r8)
            com.yandex.div.json.expressions.Expression r7 = r7.f86868e
            java.lang.Object r7 = r7.evaluate(r9)
            if (r8 != r7) goto L7b
            r7 = 1
            return r7
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.cz.a(k8.cz, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86869f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(cz.class).hashCode() + this.f86864a.hashCode() + this.f86865b.hashCode() + this.f86866c.hashCode();
        List list = this.f86867d;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        }
        int iHashCode2 = iHashCode + iHash + this.f86868e.hashCode();
        this.f86869f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dz.c) BuiltInParserKt.getBuiltInParserComponent().X9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
