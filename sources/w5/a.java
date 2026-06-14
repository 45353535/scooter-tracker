package w5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f107503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f107504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f107505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f107506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f107507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f107508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f107509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f107510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f107511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f107512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Integer f107513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Integer f107514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f107515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f107516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f107517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f107518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f107519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f107520r;

    public a(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z10, CharSequence contentDescription, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f107503a = num;
        this.f107504b = num2;
        this.f107505c = num3;
        this.f107506d = num4;
        this.f107507e = drawable;
        this.f107508f = drawable2;
        this.f107509g = drawable3;
        this.f107510h = drawable4;
        this.f107511i = z10;
        this.f107512j = contentDescription;
        this.f107513k = num5;
        this.f107514l = num6;
        this.f107515m = num7;
        this.f107516n = num8;
        this.f107517o = num9;
        this.f107518p = num10;
        this.f107519q = num11;
        this.f107520r = num12;
    }

    public final void A(boolean z10) {
        this.f107511i = z10;
    }

    public final Integer a() {
        return this.f107513k;
    }

    public final Integer b() {
        return this.f107516n;
    }

    public final CharSequence c() {
        return this.f107512j;
    }

    public final Drawable d() {
        return this.f107509g;
    }

    public final Integer e() {
        return this.f107505c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f107503a, aVar.f107503a) && Intrinsics.areEqual(this.f107504b, aVar.f107504b) && Intrinsics.areEqual(this.f107505c, aVar.f107505c) && Intrinsics.areEqual(this.f107506d, aVar.f107506d) && Intrinsics.areEqual(this.f107507e, aVar.f107507e) && Intrinsics.areEqual(this.f107508f, aVar.f107508f) && Intrinsics.areEqual(this.f107509g, aVar.f107509g) && Intrinsics.areEqual(this.f107510h, aVar.f107510h) && this.f107511i == aVar.f107511i && Intrinsics.areEqual(this.f107512j, aVar.f107512j) && Intrinsics.areEqual(this.f107513k, aVar.f107513k) && Intrinsics.areEqual(this.f107514l, aVar.f107514l) && Intrinsics.areEqual(this.f107515m, aVar.f107515m) && Intrinsics.areEqual(this.f107516n, aVar.f107516n) && Intrinsics.areEqual(this.f107517o, aVar.f107517o) && Intrinsics.areEqual(this.f107518p, aVar.f107518p) && Intrinsics.areEqual(this.f107519q, aVar.f107519q) && Intrinsics.areEqual(this.f107520r, aVar.f107520r);
    }

    public final Drawable f() {
        return this.f107508f;
    }

    public final Integer g() {
        return this.f107504b;
    }

    public final Drawable h() {
        return this.f107507e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v62 */
    public int hashCode() {
        Integer num = this.f107503a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f107504b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f107505c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f107506d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Drawable drawable = this.f107507e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f107508f;
        int iHashCode6 = (iHashCode5 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f107509g;
        int iHashCode7 = (iHashCode6 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.f107510h;
        int iHashCode8 = (iHashCode7 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31;
        boolean z10 = this.f107511i;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int iHashCode9 = (((iHashCode8 + r22) * 31) + this.f107512j.hashCode()) * 31;
        Integer num5 = this.f107513k;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f107514l;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f107515m;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f107516n;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f107517o;
        int iHashCode14 = (iHashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f107518p;
        int iHashCode15 = (iHashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f107519q;
        int iHashCode16 = (iHashCode15 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f107520r;
        return iHashCode16 + (num12 != null ? num12.hashCode() : 0);
    }

    public final Integer i() {
        return this.f107503a;
    }

    public final Drawable j() {
        return this.f107510h;
    }

    public final Integer k() {
        return this.f107506d;
    }

    public final Integer l() {
        return this.f107519q;
    }

    public final Integer m() {
        return this.f107515m;
    }

    public final Integer n() {
        return this.f107514l;
    }

    public final Integer o() {
        return this.f107520r;
    }

    public final Integer p() {
        return this.f107517o;
    }

    public final Integer q() {
        return this.f107518p;
    }

    public final boolean r() {
        return this.f107511i;
    }

    public final void s(Drawable drawable) {
        this.f107509g = drawable;
    }

    public final void t(Integer num) {
        this.f107505c = num;
    }

    public String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f107503a + ", drawableEndRes=" + this.f107504b + ", drawableBottomRes=" + this.f107505c + ", drawableTopRes=" + this.f107506d + ", drawableStart=" + this.f107507e + ", drawableEnd=" + this.f107508f + ", drawableBottom=" + this.f107509g + ", drawableTop=" + this.f107510h + ", isRtlLayout=" + this.f107511i + ", contentDescription=" + ((Object) this.f107512j) + ", compoundDrawablePadding=" + this.f107513k + ", iconWidth=" + this.f107514l + ", iconHeight=" + this.f107515m + ", compoundDrawablePaddingRes=" + this.f107516n + ", tintColor=" + this.f107517o + ", widthRes=" + this.f107518p + ", heightRes=" + this.f107519q + ", squareSizeRes=" + this.f107520r + ')';
    }

    public final void u(Drawable drawable) {
        this.f107508f = drawable;
    }

    public final void v(Integer num) {
        this.f107504b = num;
    }

    public final void w(Drawable drawable) {
        this.f107507e = drawable;
    }

    public final void x(Integer num) {
        this.f107503a = num;
    }

    public final void y(Drawable drawable) {
        this.f107510h = drawable;
    }

    public final void z(Integer num) {
        this.f107506d = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z10, CharSequence charSequence, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        Integer num13 = (i10 & 1) != 0 ? null : num;
        Integer num14 = (i10 & 2) != 0 ? null : num2;
        Integer num15 = (i10 & 4) != 0 ? null : num3;
        Integer num16 = (i10 & 8) != 0 ? null : num4;
        Drawable drawable5 = (i10 & 16) != 0 ? null : drawable;
        Drawable drawable6 = (i10 & 32) != 0 ? null : drawable2;
        Drawable drawable7 = (i10 & 64) != 0 ? null : drawable3;
        Drawable drawable8 = (i10 & 128) != 0 ? null : drawable4;
        boolean z11 = (i10 & 256) != 0 ? false : z10;
        if ((i10 & 512) != 0) {
            a1 a1Var = a1.f93282a;
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        this(num13, num14, num15, num16, drawable5, drawable6, drawable7, drawable8, z11, charSequence2, (i10 & 1024) != 0 ? null : num5, (i10 & 2048) != 0 ? null : num6, (i10 & 4096) != 0 ? null : num7, (i10 & 8192) != 0 ? null : num8, (i10 & 16384) != 0 ? null : num9, (i10 & 32768) != 0 ? null : num10, (i10 & 65536) != 0 ? null : num11, (i10 & 131072) != 0 ? null : num12);
    }
}
