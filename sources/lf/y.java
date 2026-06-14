package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f94238c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f94239b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ y(short s10) {
        this.f94239b = s10;
    }

    public static final /* synthetic */ y a(short s10) {
        return new y(s10);
    }

    public static boolean d(short s10, Object obj) {
        return (obj instanceof y) && s10 == ((y) obj).g();
    }

    public static String f(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(g() & 65535, ((y) obj).g() & 65535);
    }

    public boolean equals(Object obj) {
        return d(this.f94239b, obj);
    }

    public final /* synthetic */ short g() {
        return this.f94239b;
    }

    public int hashCode() {
        return e(this.f94239b);
    }

    public String toString() {
        return f(this.f94239b);
    }

    public static short c(short s10) {
        return s10;
    }

    public static int e(short s10) {
        return s10;
    }
}
