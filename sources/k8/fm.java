package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class fm implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87548b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87549c = a.f87551f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87550a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87551f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fm invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return fm.f87548b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fm a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((gm) BuiltInParserKt.getBuiltInParserComponent().c6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends fm {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final mm f87552d;

        public c(mm mmVar) {
            super(null);
            this.f87552d = mmVar;
        }

        public final mm c() {
            return this.f87552d;
        }
    }

    public static final class d extends fm {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xm f87553d;

        public d(xm xmVar) {
            super(null);
            this.f87553d = xmVar;
        }

        public final xm c() {
            return this.f87553d;
        }
    }

    public /* synthetic */ fm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(fm fmVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (fmVar == null) {
            return false;
        }
        if (this instanceof c) {
            mm mmVarC = ((c) this).c();
            Object objB = fmVar.b();
            return mmVarC.a(objB instanceof mm ? (mm) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        xm xmVarC = ((d) this).c();
        Object objB2 = fmVar.b();
        return xmVarC.a(objB2 instanceof xm ? (xm) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87550a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87550a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((gm) BuiltInParserKt.getBuiltInParserComponent().c6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private fm() {
    }
}
