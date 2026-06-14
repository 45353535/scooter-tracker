package vh;

import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f106840e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f106841f = new h(new byte[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f106842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f106843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient String f106844d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = b.c();
            }
            return aVar.f(bArr, i10, i11);
        }

        public final h a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrA = vh.a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((wh.b.e(str.charAt(i11)) << 4) + wh.b.e(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            h hVar = new h(p0.a(str));
            hVar.I(str);
            return hVar;
        }

        public final h e(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new h(bArrCopyOf);
        }

        public final h f(byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iE = b.e(bArr, i11);
            b.b(bArr.length, i10, iE);
            return new h(ArraysKt.copyOfRange(bArr, i10, iE + i10));
        }

        public final h h(InputStream inputStream, int i10) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new h(bArr);
        }

        private a() {
        }
    }

    public h(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f106842b = data;
    }

    public static /* synthetic */ int C(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = b.c();
        }
        return hVar.A(hVar2, i10);
    }

    public static final h E(byte... bArr) {
        return f106840e.e(bArr);
    }

    public static /* synthetic */ h O(h hVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b.c();
        }
        return hVar.N(i10, i11);
    }

    public static final h h(String str) {
        return f106840e.b(str);
    }

    public static final h j(String str) {
        return f106840e.d(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        h hVarH = f106840e.h(objectInputStream, objectInputStream.readInt());
        Field declaredField = h.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, hVarH.f106842b);
    }

    public static /* synthetic */ int u(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return hVar.s(hVar2, i10);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f106842b.length);
        objectOutputStream.write(this.f106842b);
    }

    public final int A(h other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return B(other.v(), i10);
    }

    public int B(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(b.d(this, i10), m().length - other.length); -1 < iMin; iMin--) {
            if (b.a(m(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final h D() {
        return i("MD5");
    }

    public boolean F(int i10, h other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.G(i11, m(), i10, i12);
    }

    public boolean G(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= m().length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(m(), i10, other, i11, i12);
    }

    public final void H(int i10) {
        this.f106843c = i10;
    }

    public final void I(String str) {
        this.f106844d = str;
    }

    public final h J() {
        return i("SHA-256");
    }

    public final int K() {
        return o();
    }

    public final boolean L(h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return F(0, prefix, 0, prefix.K());
    }

    public String M(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f106842b, charset);
    }

    public h N(int i10, int i11) {
        int iD = b.d(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iD <= m().length) {
            if (iD - i10 >= 0) {
                return (i10 == 0 && iD == m().length) ? this : new h(ArraysKt.copyOfRange(m(), i10, iD));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + m().length + ')').toString());
    }

    public h P() {
        for (int i10 = 0; i10 < m().length; i10++) {
            byte b10 = m()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrM = m();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM, bArrM.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] Q() {
        byte[] bArrM = m();
        byte[] bArrCopyOf = Arrays.copyOf(bArrM, bArrM.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String S() {
        String strQ = q();
        if (strQ != null) {
            return strQ;
        }
        String strC = p0.c(v());
        I(strC);
        return strC;
    }

    public void T(e buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        wh.b.d(this, buffer, i10, i11);
    }

    public String d() {
        return vh.a.c(m(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.K() == m().length && hVar.G(0, m(), 0, m().length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iK = K();
        int iK2 = other.K();
        int iMin = Math.min(iK, iK2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iL = l(i10) & 255;
            int iL2 = other.l(i10) & 255;
            if (iL != iL2) {
                return iL < iL2 ? -1 : 1;
            }
        }
        if (iK == iK2) {
            return 0;
        }
        return iK < iK2 ? -1 : 1;
    }

    public int hashCode() {
        int iN = n();
        if (iN != 0) {
            return iN;
        }
        int iHashCode = Arrays.hashCode(m());
        H(iHashCode);
        return iHashCode;
    }

    public h i(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f106842b, 0, K());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new h(bArrDigest);
    }

    public final boolean k(h suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return F(K() - suffix.K(), suffix, 0, suffix.K());
    }

    public final byte l(int i10) {
        return x(i10);
    }

    public final byte[] m() {
        return this.f106842b;
    }

    public final int n() {
        return this.f106843c;
    }

    public int o() {
        return m().length;
    }

    public final String q() {
        return this.f106844d;
    }

    public String r() {
        char[] cArr = new char[m().length * 2];
        int i10 = 0;
        for (byte b10 : m()) {
            int i11 = i10 + 1;
            cArr[i10] = wh.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = wh.b.f()[b10 & Ascii.SI];
        }
        return StringsKt.B(cArr);
    }

    public final int s(h other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t(other.v(), i10);
    }

    public int t(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = m().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(m(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public String toString() {
        if (m().length == 0) {
            return "[size=0]";
        }
        int iC = wh.b.c(m(), 64);
        if (iC != -1) {
            String strS = S();
            String strSubstring = strS.substring(0, iC);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strW = StringsKt.W(StringsKt.W(StringsKt.W(strSubstring, "\\", "\\\\", false, 4, null), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strS.length()) {
                return "[text=" + strW + ']';
            }
            return "[size=" + m().length + " text=" + strW + "…]";
        }
        if (m().length <= 64) {
            return "[hex=" + r() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(m().length);
        sb2.append(" hex=");
        int iD = b.d(this, 64);
        if (iD <= m().length) {
            if (iD < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iD == m().length ? this : new h(ArraysKt.copyOfRange(m(), 0, iD))).r());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + m().length + ')').toString());
    }

    public byte[] v() {
        return m();
    }

    public byte x(int i10) {
        return m()[i10];
    }
}
