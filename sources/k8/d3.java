package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d3 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f86887e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f86888f = a.f86893f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f86891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f86892d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86893f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return d3.f86887e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d3 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((e3) BuiltInParserKt.getBuiltInParserComponent().l0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public d3(List list, List list2, Expression expression) {
        this.f86889a = list;
        this.f86890b = list2;
        this.f86891c = expression;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.d3 r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r6.f86889a
            if (r1 == 0) goto L42
            java.util.List r2 = r7.f86889a
            if (r2 != 0) goto Ld
            return r0
        Ld:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L19
            goto L9b
        L19:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L20:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L31
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L31:
            java.lang.Object r3 = r2.get(r3)
            k8.j1 r3 = (k8.j1) r3
            k8.j1 r4 = (k8.j1) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L40
            goto L9b
        L40:
            r3 = r5
            goto L20
        L42:
            java.util.List r1 = r7.f86889a
            if (r1 != 0) goto L9b
        L46:
            java.util.List r1 = r6.f86890b
            if (r1 == 0) goto L83
            java.util.List r2 = r7.f86890b
            if (r2 != 0) goto L4f
            return r0
        L4f:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L5a
            goto L9b
        L5a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L61:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L72
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L72:
            java.lang.Object r3 = r2.get(r3)
            k8.j1 r3 = (k8.j1) r3
            k8.j1 r4 = (k8.j1) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L81
            goto L9b
        L81:
            r3 = r5
            goto L61
        L83:
            java.util.List r1 = r7.f86890b
            if (r1 != 0) goto L9b
        L87:
            com.yandex.div.json.expressions.Expression r1 = r6.f86891c
            java.lang.Object r8 = r1.evaluate(r8)
            com.yandex.div.json.expressions.Expression r7 = r7.f86891c
            java.lang.Object r7 = r7.evaluate(r9)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r7)
            if (r7 == 0) goto L9b
            r7 = 1
            return r7
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.d3.a(k8.d3, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f86892d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(d3.class).hashCode();
        List list = this.f86889a;
        int iHash2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        List list2 = this.f86890b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        }
        int iHashCode2 = i10 + iHash2 + this.f86891c.hashCode();
        this.f86892d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((e3) BuiltInParserKt.getBuiltInParserComponent().l0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
