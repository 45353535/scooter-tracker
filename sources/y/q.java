package y;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f108328b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f108329c = new q(MapsKt.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f108330a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(Map map) {
            return new q(c0.c.b(map), null);
        }

        private a() {
        }
    }

    public /* synthetic */ q(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map a() {
        return this.f108330a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f108330a, ((q) obj).f108330a);
    }

    public int hashCode() {
        return this.f108330a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f108330a + ')';
    }

    private q(Map map) {
        this.f108330a = map;
    }
}
