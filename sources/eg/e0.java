package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f69143c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69144b;

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e0(String str) {
        super(f69143c);
        this.f69144b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.areEqual(this.f69144b, ((e0) obj).f69144b);
    }

    public int hashCode() {
        return this.f69144b.hashCode();
    }

    public final String m() {
        return this.f69144b;
    }

    public String toString() {
        return "CoroutineName(" + this.f69144b + ')';
    }
}
