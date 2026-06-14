package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f94222c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f94223b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ r(byte b10) {
        this.f94223b = b10;
    }

    public static final /* synthetic */ r a(byte b10) {
        return new r(b10);
    }

    public static boolean d(byte b10, Object obj) {
        return (obj instanceof r) && b10 == ((r) obj).g();
    }

    public static String f(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(g() & 255, ((r) obj).g() & 255);
    }

    public boolean equals(Object obj) {
        return d(this.f94223b, obj);
    }

    public final /* synthetic */ byte g() {
        return this.f94223b;
    }

    public int hashCode() {
        return e(this.f94223b);
    }

    public String toString() {
        return f(this.f94223b);
    }

    public static byte c(byte b10) {
        return b10;
    }

    public static int e(byte b10) {
        return b10;
    }
}
