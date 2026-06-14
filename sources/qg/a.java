package qg;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1176a f99122d = new C1176a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f99123e = new a(new byte[0], null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char[] f99124f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f99125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f99126c;

    /* JADX INFO: renamed from: qg.a$a, reason: collision with other inner class name */
    public static final class C1176a {
        public /* synthetic */ C1176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f99123e;
        }

        public final a b(byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new a(byteArray, defaultConstructorMarker, defaultConstructorMarker);
        }

        private C1176a() {
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f99124f = charArray;
    }

    public /* synthetic */ a(byte[] bArr, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, obj);
    }

    public static /* synthetic */ a h(a aVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = aVar.f();
        }
        return aVar.g(i10, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f99125b;
        byte[] bArr2 = other.f99125b;
        int iMin = Math.min(f(), other.f());
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Intrinsics.compare(r.c(bArr[i10]) & 255, r.c(bArr2[i10]) & 255);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Intrinsics.compare(f(), other.f());
    }

    public final byte d(int i10) {
        if (i10 >= 0 && i10 < f()) {
            return this.f99125b[i10];
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of byte string bounds: [0.." + f() + ')');
    }

    public final byte[] e() {
        return this.f99125b;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f99125b;
        int length = bArr.length;
        byte[] bArr2 = this.f99125b;
        if (length != bArr2.length) {
            return false;
        }
        int i11 = aVar.f99126c;
        if (i11 == 0 || (i10 = this.f99126c) == 0 || i11 == i10) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int f() {
        return this.f99125b.length;
    }

    public final a g(int i10, int i11) {
        return i10 == i11 ? f99123e : new a(this.f99125b, i10, i11);
    }

    public int hashCode() {
        int i10 = this.f99126c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f99125b);
        this.f99126c = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (c.c(this)) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(f());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22 + (f() * 2));
        sb2.append("ByteString(size=");
        sb2.append(strValueOf);
        sb2.append(" hex=");
        byte[] bArr = this.f99125b;
        int iF = f();
        for (int i10 = 0; i10 < iF; i10++) {
            byte b10 = bArr[i10];
            char[] cArr = f99124f;
            sb2.append(cArr[(b10 >>> 4) & 15]);
            sb2.append(cArr[b10 & Ascii.SI]);
        }
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private a(byte[] bArr, Object obj) {
        this.f99125b = bArr;
    }

    public /* synthetic */ a(byte[] bArr, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? bArr.length : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] data, int i10, int i11) {
        this(ArraysKt.copyOfRange(data, i10, i11), null);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
