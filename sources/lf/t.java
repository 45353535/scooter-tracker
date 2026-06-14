package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f94227c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94228b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ t(int i10) {
        this.f94228b = i10;
    }

    public static final /* synthetic */ t a(int i10) {
        return new t(i10);
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof t) && i10 == ((t) obj).g();
    }

    public static String f(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return c0.b(g(), ((t) obj).g());
    }

    public boolean equals(Object obj) {
        return d(this.f94228b, obj);
    }

    public final /* synthetic */ int g() {
        return this.f94228b;
    }

    public int hashCode() {
        return e(this.f94228b);
    }

    public String toString() {
        return f(this.f94228b);
    }

    public static int c(int i10) {
        return i10;
    }

    public static int e(int i10) {
        return i10;
    }
}
