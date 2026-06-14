package dg;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0856a f68665d = new C0856a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f68666e = new a(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f68667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f68668c;

    /* JADX INFO: renamed from: dg.a$a, reason: collision with other inner class name */
    public static final class C0856a {
        public /* synthetic */ C0856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new a(j10, j11, null);
        }

        public final a b() {
            return a.f68666e;
        }

        public final a c(String uuidString) {
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return b.c(uuidString);
            }
            if (length == 36) {
                return b.d(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.h(uuidString, 64) + "\" of length " + uuidString.length());
        }

        private C0856a() {
        }
    }

    public /* synthetic */ a(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private final Object writeReplace() {
        return b.b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f68667b == aVar.f68667b && this.f68668c == aVar.f68668c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long j10 = this.f68667b;
        return j10 != other.f68667b ? Long.compare(v.c(j10) ^ Long.MIN_VALUE, v.c(other.f68667b) ^ Long.MIN_VALUE) : Long.compare(v.c(this.f68668c) ^ Long.MIN_VALUE, v.c(other.f68668c) ^ Long.MIN_VALUE);
    }

    public final long h() {
        return this.f68668c;
    }

    public int hashCode() {
        return androidx.collection.b.a(this.f68667b ^ this.f68668c);
    }

    public final long i() {
        return this.f68667b;
    }

    public final String j() {
        byte[] bArr = new byte[36];
        b.a(this.f68667b, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.f68667b, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.f68667b, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.f68668c, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.f68668c, bArr, 24, 2, 8);
        return StringsKt.F(bArr);
    }

    public String toString() {
        return j();
    }

    private a(long j10, long j11) {
        this.f68667b = j10;
        this.f68668c = j11;
    }
}
