package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xa implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92329d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92330e = a.f92334f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92333c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92334f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xa invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xa.f92329d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xa a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ya) BuiltInParserKt.getBuiltInParserComponent().S2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public xa(List list, List list2) {
        this.f92331a = list;
        this.f92332b = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.xa r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r6.f92331a
            if (r1 == 0) goto L42
            java.util.List r2 = r7.f92331a
            if (r2 != 0) goto Ld
            return r0
        Ld:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L19
            goto L87
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
            goto L87
        L40:
            r3 = r5
            goto L20
        L42:
            java.util.List r1 = r7.f92331a
            if (r1 != 0) goto L87
        L46:
            java.util.List r1 = r6.f92332b
            java.util.List r7 = r7.f92332b
            if (r1 == 0) goto L83
            if (r7 != 0) goto L4f
            return r0
        L4f:
            int r2 = r1.size()
            int r3 = r7.size()
            if (r2 == r3) goto L5a
            goto L87
        L5a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L61:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L72
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L72:
            java.lang.Object r2 = r7.get(r2)
            k8.j1 r2 = (k8.j1) r2
            k8.j1 r3 = (k8.j1) r3
            boolean r2 = r3.a(r2, r8, r9)
            if (r2 != 0) goto L81
            goto L87
        L81:
            r2 = r4
            goto L61
        L83:
            if (r7 != 0) goto L87
        L85:
            r7 = 1
            return r7
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.xa.a(k8.xa, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92333c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xa.class).hashCode();
        List list = this.f92331a;
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
        List list2 = this.f92332b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f92333c = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ya) BuiltInParserKt.getBuiltInParserComponent().S2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
