package p9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f98077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f98078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f98079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f98080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f98081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f98082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f98084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f98085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f98086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f98087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f98088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f98089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f98090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f98091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f98092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f98093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f98068r = new b().o("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f98069s = o0.C0(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f98070t = o0.C0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f98071u = o0.C0(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f98072v = o0.C0(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f98073w = o0.C0(3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f98074x = o0.C0(18);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f98075y = o0.C0(4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f98076z = o0.C0(5);
    private static final String A = o0.C0(6);
    private static final String B = o0.C0(7);
    private static final String C = o0.C0(8);
    private static final String D = o0.C0(9);
    private static final String E = o0.C0(10);
    private static final String F = o0.C0(11);
    private static final String G = o0.C0(12);
    private static final String H = o0.C0(13);
    private static final String I = o0.C0(14);
    private static final String J = o0.C0(15);
    private static final String K = o0.C0(16);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f98094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f98095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f98096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f98097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f98098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f98099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f98100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f98101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f98102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f98103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f98104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f98105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f98106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f98107n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f98108o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f98109p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f98110q;

        public a a() {
            return new a(this.f98094a, this.f98096c, this.f98097d, this.f98095b, this.f98098e, this.f98099f, this.f98100g, this.f98101h, this.f98102i, this.f98103j, this.f98104k, this.f98105l, this.f98106m, this.f98107n, this.f98108o, this.f98109p, this.f98110q);
        }

        public b b() {
            this.f98107n = false;
            return this;
        }

        public int c() {
            return this.f98100g;
        }

        public int d() {
            return this.f98102i;
        }

        public CharSequence e() {
            return this.f98094a;
        }

        public b f(Bitmap bitmap) {
            this.f98095b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f98106m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f98098e = f10;
            this.f98099f = i10;
            return this;
        }

        public b i(int i10) {
            this.f98100g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f98097d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f98101h = f10;
            return this;
        }

        public b l(int i10) {
            this.f98102i = i10;
            return this;
        }

        public b m(float f10) {
            this.f98110q = f10;
            return this;
        }

        public b n(float f10) {
            this.f98105l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f98094a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f98096c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f98104k = f10;
            this.f98103j = i10;
            return this;
        }

        public b r(int i10) {
            this.f98109p = i10;
            return this;
        }

        public b s(int i10) {
            this.f98108o = i10;
            this.f98107n = true;
            return this;
        }

        public b() {
            this.f98094a = null;
            this.f98095b = null;
            this.f98096c = null;
            this.f98097d = null;
            this.f98098e = -3.4028235E38f;
            this.f98099f = Integer.MIN_VALUE;
            this.f98100g = Integer.MIN_VALUE;
            this.f98101h = -3.4028235E38f;
            this.f98102i = Integer.MIN_VALUE;
            this.f98103j = Integer.MIN_VALUE;
            this.f98104k = -3.4028235E38f;
            this.f98105l = -3.4028235E38f;
            this.f98106m = -3.4028235E38f;
            this.f98107n = false;
            this.f98108o = ViewCompat.MEASURED_STATE_MASK;
            this.f98109p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f98094a = aVar.f98077a;
            this.f98095b = aVar.f98080d;
            this.f98096c = aVar.f98078b;
            this.f98097d = aVar.f98079c;
            this.f98098e = aVar.f98081e;
            this.f98099f = aVar.f98082f;
            this.f98100g = aVar.f98083g;
            this.f98101h = aVar.f98084h;
            this.f98102i = aVar.f98085i;
            this.f98103j = aVar.f98090n;
            this.f98104k = aVar.f98091o;
            this.f98105l = aVar.f98086j;
            this.f98106m = aVar.f98087k;
            this.f98107n = aVar.f98088l;
            this.f98108o = aVar.f98089m;
            this.f98109p = aVar.f98092p;
            this.f98110q = aVar.f98093q;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f98069s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f98070t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f98071u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f98072v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f98073w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f98074x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f98075y;
        if (bundle.containsKey(str)) {
            String str2 = f98076z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(I, false)) {
            bVar.b();
        }
        String str11 = J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f98077a;
        if (charSequence != null) {
            bundle.putCharSequence(f98069s, charSequence);
            CharSequence charSequence2 = this.f98077a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f98070t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f98071u, this.f98078b);
        bundle.putSerializable(f98072v, this.f98079c);
        bundle.putFloat(f98075y, this.f98081e);
        bundle.putInt(f98076z, this.f98082f);
        bundle.putInt(A, this.f98083g);
        bundle.putFloat(B, this.f98084h);
        bundle.putInt(C, this.f98085i);
        bundle.putInt(D, this.f98090n);
        bundle.putFloat(E, this.f98091o);
        bundle.putFloat(F, this.f98086j);
        bundle.putFloat(G, this.f98087k);
        bundle.putBoolean(I, this.f98088l);
        bundle.putInt(H, this.f98089m);
        bundle.putInt(J, this.f98092p);
        bundle.putFloat(K, this.f98093q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f98080d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            q9.a.g(this.f98080d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f98074x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f98077a, aVar.f98077a) && this.f98078b == aVar.f98078b && this.f98079c == aVar.f98079c && ((bitmap = this.f98080d) != null ? !((bitmap2 = aVar.f98080d) == null || !bitmap.sameAs(bitmap2)) : aVar.f98080d == null) && this.f98081e == aVar.f98081e && this.f98082f == aVar.f98082f && this.f98083g == aVar.f98083g && this.f98084h == aVar.f98084h && this.f98085i == aVar.f98085i && this.f98086j == aVar.f98086j && this.f98087k == aVar.f98087k && this.f98088l == aVar.f98088l && this.f98089m == aVar.f98089m && this.f98090n == aVar.f98090n && this.f98091o == aVar.f98091o && this.f98092p == aVar.f98092p && this.f98093q == aVar.f98093q) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f98077a, this.f98078b, this.f98079c, this.f98080d, Float.valueOf(this.f98081e), Integer.valueOf(this.f98082f), Integer.valueOf(this.f98083g), Float.valueOf(this.f98084h), Integer.valueOf(this.f98085i), Float.valueOf(this.f98086j), Float.valueOf(this.f98087k), Boolean.valueOf(this.f98088l), Integer.valueOf(this.f98089m), Integer.valueOf(this.f98090n), Float.valueOf(this.f98091o), Integer.valueOf(this.f98092p), Float.valueOf(this.f98093q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            q9.a.e(bitmap);
        } else {
            q9.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f98077a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f98077a = charSequence.toString();
        } else {
            this.f98077a = null;
        }
        this.f98078b = alignment;
        this.f98079c = alignment2;
        this.f98080d = bitmap;
        this.f98081e = f10;
        this.f98082f = i10;
        this.f98083g = i11;
        this.f98084h = f11;
        this.f98085i = i12;
        this.f98086j = f13;
        this.f98087k = f14;
        this.f98088l = z10;
        this.f98089m = i14;
        this.f98090n = i13;
        this.f98091o = f12;
        this.f98092p = i15;
        this.f98093q = f15;
    }
}
