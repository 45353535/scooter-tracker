package m8;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f94476b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f94477c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f94478a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.f94477c;
        }

        public final b b(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value, null);
        }

        private a() {
        }
    }

    public /* synthetic */ b(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public final Object b() {
        Object obj = this.f94478a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f94478a != null;
    }

    public final Object d() {
        return this.f94478a;
    }

    private b(Object obj) {
        this.f94478a = obj;
    }
}
