package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.w7;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91566d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f91567e = a.f91571f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f91568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f91569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f91570c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91571f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return u7.f91566d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((w7.b) BuiltInParserKt.getBuiltInParserComponent().R1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public u7(List list) {
        this.f91568a = list;
    }

    public final boolean a(u7 u7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (u7Var == null) {
            return false;
        }
        List list = this.f91568a;
        List list2 = u7Var.f91568a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((y7) obj).a((y7) list2.get(i10), expressionResolver, expressionResolver2)) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public int b() {
        Integer num = this.f91569b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(u7.class).hashCode();
        this.f91569b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91570c;
        if (num != null) {
            return num.intValue();
        }
        int iB = b();
        Iterator it = this.f91568a.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((y7) it.next()).hash();
        }
        int i10 = iB + iHash;
        this.f91570c = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((w7.b) BuiltInParserKt.getBuiltInParserComponent().R1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
