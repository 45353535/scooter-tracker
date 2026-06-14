package kotlin.ranges;

import kotlin.collections.CharIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Iterable, yf.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C1068a f93353e = new C1068a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f93354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f93355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f93356d;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C1068a {
        public /* synthetic */ C1068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1068a() {
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f93354b = c10;
        this.f93355c = (char) rf.c.c(c10, c11, i10);
        this.f93356d = i10;
    }

    public final char e() {
        return this.f93354b;
    }

    public final char f() {
        return this.f93355c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new bg.a(this.f93354b, this.f93355c, this.f93356d);
    }
}
