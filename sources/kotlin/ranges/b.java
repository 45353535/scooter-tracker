package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlin.ranges.a implements bg.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f93357f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f93358g = new b(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return e() == bVar.e() && f() == bVar.f();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // bg.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(f());
    }

    @Override // bg.c
    public boolean isEmpty() {
        return Intrinsics.compare((int) e(), (int) f()) > 0;
    }

    @Override // bg.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(e());
    }

    public String toString() {
        return e() + ".." + f();
    }
}
