package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class ke {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70267c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f70268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.a f70269b;

    public static final class a {
        public a() {
        }

        public final ke a(g1.a aVar) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new ke(defaultConstructorMarker, aVar, defaultConstructorMarker);
        }

        public final ke b(Object obj) {
            return new ke(obj, null, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ke(Object obj, g1.a aVar) {
        this.f70268a = obj;
        this.f70269b = aVar;
    }

    public static final ke a(g1.a aVar) {
        return f70267c.a(aVar);
    }

    public /* synthetic */ ke(Object obj, g1.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, aVar);
    }
}
