package xe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements CharSequence, Appendable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf.e f108183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f108184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private char[] f108185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f108186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f108187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f108189h;

    private final class a implements CharSequence {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f108190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f108191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f108192d;

        public a(int i10, int i11) {
            this.f108190b = i10;
            this.f108191c = i11;
        }

        public char a(int i10) {
            int i11 = this.f108190b + i10;
            if (i10 < 0) {
                throw new IllegalArgumentException(("index is negative: " + i10).toString());
            }
            if (i11 < this.f108191c) {
                return d.this.j(i11);
            }
            throw new IllegalArgumentException(("index (" + i10 + ") should be less than length (" + length() + ')').toString());
        }

        public int b() {
            return this.f108191c - this.f108190b;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            return a(i10);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return d.this.n(this.f108190b, charSequence, 0, length());
        }

        public int hashCode() {
            String str = this.f108192d;
            return str != null ? str.hashCode() : d.this.l(this.f108190b, this.f108191c);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return b();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException(("start is negative: " + i10).toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
            }
            int i12 = this.f108191c;
            int i13 = this.f108190b;
            if (i11 <= i12 - i13) {
                return i10 == i11 ? "" : d.this.new a(i10 + i13, i13 + i11);
            }
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }

        @Override // java.lang.CharSequence
        public String toString() {
            String str = this.f108192d;
            if (str != null) {
                return str;
            }
            String string = d.this.g(this.f108190b, this.f108191c).toString();
            this.f108192d = string;
            return string;
        }
    }

    public d(jf.e pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f108183b = pool;
    }

    private final char[] e() {
        char[] cArr = (char[]) this.f108183b.h0();
        char[] cArr2 = this.f108185d;
        this.f108185d = cArr;
        this.f108188g = cArr.length;
        this.f108187f = false;
        if (cArr2 != null) {
            List list = this.f108184c;
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f108184c = arrayList;
                arrayList.add(cArr2);
                list2 = arrayList;
            }
            list2.add(cArr);
        }
        return cArr;
    }

    private final char[] f(int i10) {
        List list = this.f108184c;
        if (list != null) {
            char[] cArr = this.f108185d;
            Intrinsics.checkNotNull(cArr);
            return (char[]) list.get(i10 / cArr.length);
        }
        if (i10 >= 2048) {
            p(i10);
            throw new lf.g();
        }
        char[] cArr2 = this.f108185d;
        if (cArr2 != null) {
            return cArr2;
        }
        p(i10);
        throw new lf.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence g(int i10, int i11) {
        if (i10 == i11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i11 - i10);
        for (int i12 = i10 - (i10 % 2048); i12 < i11; i12 += 2048) {
            char[] cArrF = f(i12);
            int iMin = Math.min(i11 - i12, 2048);
            for (int iMax = Math.max(0, i10 - i12); iMax < iMin; iMax++) {
                sb2.append(cArrF[iMax]);
            }
        }
        return sb2;
    }

    private final int h() {
        char[] cArr = this.f108185d;
        Intrinsics.checkNotNull(cArr);
        return cArr.length - this.f108188g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final char j(int i10) {
        char[] cArrF = f(i10);
        char[] cArr = this.f108185d;
        Intrinsics.checkNotNull(cArr);
        return cArrF[i10 % cArr.length];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(int i10, int i11) {
        int iJ = 0;
        while (i10 < i11) {
            iJ = (iJ * 31) + j(i10);
            i10++;
        }
        return iJ;
    }

    private final char[] m() {
        if (this.f108188g == 0) {
            return e();
        }
        char[] cArr = this.f108185d;
        Intrinsics.checkNotNull(cArr);
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(int i10, CharSequence charSequence, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (j(i10 + i13) != charSequence.charAt(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    private final Void p(int i10) {
        if (this.f108187f) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i10 + " is not in range [0; " + h() + ')');
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) {
        char[] cArrM = m();
        char[] cArr = this.f108185d;
        Intrinsics.checkNotNull(cArr);
        int length = cArr.length;
        int i10 = this.f108188g;
        cArrM[length - i10] = c10;
        this.f108186e = null;
        this.f108188g = i10 - 1;
        this.f108189h = length() + 1;
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return i(i10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return n(0, charSequence, 0, length());
    }

    public int hashCode() {
        String str = this.f108186e;
        return str != null ? str.hashCode() : l(0, length());
    }

    public char i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("index is negative: " + i10).toString());
        }
        if (i10 < length()) {
            return j(i10);
        }
        throw new IllegalArgumentException(("index " + i10 + " is not in range [0, " + length() + ')').toString());
    }

    public int k() {
        return this.f108189h;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return k();
    }

    public final void o() {
        List list = this.f108184c;
        if (list != null) {
            this.f108185d = null;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f108183b.O(list.get(i10));
            }
        } else {
            char[] cArr = this.f108185d;
            if (cArr != null) {
                this.f108183b.O(cArr);
            }
            this.f108185d = null;
        }
        this.f108187f = true;
        this.f108184c = null;
        this.f108186e = null;
        this.f108189h = 0;
        this.f108188g = 0;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("startIndex (" + i10 + ") should be less or equal to endIndex (" + i11 + ')').toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex is negative: " + i10).toString());
        }
        if (i11 <= length()) {
            return new a(i10, i11);
        }
        throw new IllegalArgumentException(("endIndex (" + i11 + ") is greater than length (" + length() + ')').toString());
    }

    @Override // java.lang.CharSequence
    public String toString() {
        String str = this.f108186e;
        if (str != null) {
            return str;
        }
        String string = g(0, length()).toString();
        this.f108186e = string;
        return string;
    }

    public /* synthetic */ d(jf.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f.a() : eVar);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return this;
        }
        int i12 = i10;
        while (i12 < i11) {
            char[] cArrM = m();
            int length = cArrM.length;
            int i13 = this.f108188g;
            int i14 = length - i13;
            int iMin = Math.min(i11 - i12, i13);
            for (int i15 = 0; i15 < iMin; i15++) {
                cArrM[i14 + i15] = charSequence.charAt(i12 + i15);
            }
            i12 += iMin;
            this.f108188g -= iMin;
        }
        this.f108186e = null;
        this.f108189h = length() + (i11 - i10);
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }
}
