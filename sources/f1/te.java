package f1;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f71182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f71184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f71185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f71187f;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            byte[] bArrA = te.this.a();
            if (bArrA == null) {
                return null;
            }
            String strB = te.this.b();
            if (strB == null) {
                strB = Charsets.UTF_8.name();
            }
            try {
                Intrinsics.checkNotNull(strB);
                Charset charsetForName = Charset.forName(strB);
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                return new String(bArrA, charsetForName);
            } catch (Exception unused) {
                return new String(bArrA, Charsets.UTF_8);
            }
        }
    }

    public te(boolean z10, int i10, byte[] bArr, Throwable th2, String str) {
        this.f71182a = z10;
        this.f71183b = i10;
        this.f71184c = bArr;
        this.f71185d = th2;
        this.f71186e = str;
        this.f71187f = lf.i.a(new a());
    }

    public final byte[] a() {
        return this.f71184c;
    }

    public final String b() {
        return this.f71186e;
    }

    public final Throwable c() {
        return this.f71185d;
    }

    public final int d() {
        return this.f71183b;
    }

    public final boolean e() {
        return this.f71182a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return this.f71182a == teVar.f71182a && this.f71183b == teVar.f71183b && Intrinsics.areEqual(this.f71184c, teVar.f71184c) && Intrinsics.areEqual(this.f71185d, teVar.f71185d) && Intrinsics.areEqual(this.f71186e, teVar.f71186e);
    }

    public int hashCode() {
        int iA = ((androidx.compose.foundation.c.a(this.f71182a) * 31) + this.f71183b) * 31;
        byte[] bArr = this.f71184c;
        int iHashCode = (iA + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th2 = this.f71185d;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str = this.f71186e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(isSuccessful=" + this.f71182a + ", statusCode=" + this.f71183b + ", bytes=" + Arrays.toString(this.f71184c) + ", error=" + this.f71185d + ", charset=" + this.f71186e + ")";
    }

    public /* synthetic */ te(boolean z10, int i10, byte[] bArr, Throwable th2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, (i11 & 4) != 0 ? null : bArr, (i11 & 8) != 0 ? null : th2, (i11 & 16) != 0 ? null : str);
    }
}
