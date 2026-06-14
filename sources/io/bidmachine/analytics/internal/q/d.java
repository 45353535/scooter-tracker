package io.bidmachine.analytics.internal.q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;

/* JADX INFO: loaded from: classes12.dex */
public interface d extends IInterface {

    public static final class a implements d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0964d f79824d = new C0964d(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Lazy f79825e = i.a(c.f79852a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final b f79826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final b f79827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f79828h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f79829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final b f79830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final b f79831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final b f79832l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final b f79833m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f79834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final b f79835o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final b f79836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final b f79837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final b f79838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final b f79839s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBinder f79840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f79841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function0 f79842c;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.d$a$a, reason: collision with other inner class name */
        static final class C0963a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0963a f79843a = new C0963a();

            C0963a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Parcel invoke() {
                return Parcel.obtain();
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f79844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f79845b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f79846c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f79847d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f79848e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final int f79849f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f79850g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f79851h;

            public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f79844a = i10;
                this.f79845b = i11;
                this.f79846c = i12;
                this.f79847d = i13;
                this.f79848e = i14;
                this.f79849f = i15;
                this.f79850g = i16;
                this.f79851h = i17;
            }

            public final b a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                return new b(i10, i11, i12, i13, i14, i15, i16, i17);
            }

            public final int b() {
                return this.f79851h;
            }

            public final int c() {
                return this.f79849f;
            }

            public final int d() {
                return this.f79845b;
            }

            public final int e() {
                return this.f79846c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f79844a == bVar.f79844a && this.f79845b == bVar.f79845b && this.f79846c == bVar.f79846c && this.f79847d == bVar.f79847d && this.f79848e == bVar.f79848e && this.f79849f == bVar.f79849f && this.f79850g == bVar.f79850g && this.f79851h == bVar.f79851h;
            }

            public final int f() {
                return this.f79850g;
            }

            public final int g() {
                return this.f79848e;
            }

            public final int h() {
                return this.f79844a;
            }

            public int hashCode() {
                return (((((((((((((this.f79844a * 31) + this.f79845b) * 31) + this.f79846c) * 31) + this.f79847d) * 31) + this.f79848e) * 31) + this.f79849f) * 31) + this.f79850g) * 31) + this.f79851h;
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ b a(b bVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
                if ((i18 & 1) != 0) {
                    i10 = bVar.f79844a;
                }
                if ((i18 & 2) != 0) {
                    i11 = bVar.f79845b;
                }
                if ((i18 & 4) != 0) {
                    i12 = bVar.f79846c;
                }
                if ((i18 & 8) != 0) {
                    i13 = bVar.f79847d;
                }
                if ((i18 & 16) != 0) {
                    i14 = bVar.f79848e;
                }
                if ((i18 & 32) != 0) {
                    i15 = bVar.f79849f;
                }
                if ((i18 & 64) != 0) {
                    i16 = bVar.f79850g;
                }
                if ((i18 & 128) != 0) {
                    i17 = bVar.f79851h;
                }
                int i19 = i16;
                int i20 = i17;
                int i21 = i14;
                int i22 = i15;
                return bVar.a(i10, i11, i12, i13, i21, i22, i19, i20);
            }

            public final int a() {
                return this.f79847d;
            }
        }

        static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f79852a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return io.bidmachine.analytics.internal.a.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLklJbkFwcEJpbGxpbmdTZXJ2aWNl");
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.d$a$d, reason: collision with other inner class name */
        public static final class C0964d {
            public /* synthetic */ C0964d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return (String) a.f79825e.getValue();
            }

            public final b b() {
                return a.f79827g;
            }

            public final b c() {
                return a.f79828h;
            }

            public final b d() {
                return a.f79829i;
            }

            public final b e() {
                return a.f79830j;
            }

            public final b f() {
                return a.f79831k;
            }

            public final b g() {
                return a.f79832l;
            }

            public final b h() {
                return a.f79833m;
            }

            public final b i() {
                return a.f79834n;
            }

            public final b j() {
                return a.f79835o;
            }

            public final b k() {
                return a.f79836p;
            }

            public final b l() {
                return a.f79837q;
            }

            public final b m() {
                return a.f79838r;
            }

            public final b n() {
                return a.f79839s;
            }

            public final b o() {
                return a.f79826f;
            }

            private C0964d() {
            }

            public final b a(io.bidmachine.analytics.internal.a.f fVar) {
                return fVar.compareTo(new io.bidmachine.analytics.internal.a.f(5, 1, 0)) < 0 ? b() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(5, 2, 0)) < 0 ? c() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(5, 2, 1)) < 0 ? d() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(6, 0, 0)) < 0 ? e() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(6, 0, 1)) < 0 ? f() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(6, 1, 0)) < 0 ? g() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(6, 2, 0)) < 0 ? h() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(6, 2, 1)) < 0 ? i() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(7, 0, 0)) < 0 ? j() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(7, 1, 0)) < 0 ? k() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(7, 1, 1)) < 0 ? l() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(7, 2, 0)) < 0 ? m() : fVar.compareTo(new io.bidmachine.analytics.internal.a.f(8, 0, 1)) < 0 ? n() : o();
            }
        }

        static {
            b bVar = new b(1, 25, 11, 24, 9, 6, 901, 20);
            f79826f = bVar;
            b bVarA = b.a(bVar, 0, 17, 0, 9, 0, 0, 0, 17, 117, null);
            f79827g = bVarA;
            f79828h = bVarA;
            b bVarA2 = b.a(bVarA, 0, 19, 0, 19, 0, 0, 0, 0, 245, null);
            f79829i = bVarA2;
            f79830j = bVarA2;
            b bVarA3 = b.a(bVarA2, 0, 20, 0, 0, 0, 0, 0, 20, 125, null);
            f79831k = bVarA3;
            f79832l = bVarA3;
            b bVarA4 = b.a(bVarA3, 0, 21, 0, 0, 0, 0, 0, 0, 253, null);
            f79833m = bVarA4;
            b bVarA5 = b.a(bVarA4, 0, 22, 0, 0, 0, 0, 0, 0, 253, null);
            f79834n = bVarA5;
            f79835o = bVarA5;
            f79836p = bVarA5;
            b bVarA6 = b.a(bVarA5, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f79837q = bVarA6;
            b bVarA7 = b.a(bVarA6, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f79838r = bVarA7;
            f79839s = b.a(bVarA7, 0, 25, 0, 24, 0, 0, 0, 0, 245, null);
        }

        public a(IBinder iBinder, b bVar, Function0 function0) {
            this.f79840a = iBinder;
            this.f79841b = bVar;
            this.f79842c = function0;
        }

        private final Parcel p() {
            Parcel parcel = (Parcel) this.f79842c.invoke();
            parcel.writeInterfaceToken(f79824d.a());
            return parcel;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f79840a;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public int a(String str, String str2) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f79841b.d());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            Parcel parcelA = a(this.f79841b.h(), parcelP);
            int i10 = parcelA.readInt();
            parcelA.recycle();
            return i10;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle b(String str, String str2, Bundle bundle) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f79841b.c());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            parcelP.writeString(null);
            a(parcelP, bundle);
            Parcel parcelA = a(this.f79841b.g(), parcelP);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        public /* synthetic */ a(IBinder iBinder, b bVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(iBinder, bVar, (i10 & 4) != 0 ? C0963a.f79843a : function0);
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle a(String str, String str2, Bundle bundle) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f79841b.a());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            parcelP.writeString(null);
            a(parcelP, bundle);
            Parcel parcelA = a(this.f79841b.e(), parcelP);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle a(String str, String str2, Bundle bundle, Bundle bundle2) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f79841b.b());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            a(parcelP, bundle);
            a(parcelP, bundle2);
            Parcel parcelA = a(this.f79841b.f(), parcelP);
            Bundle bundle3 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle3;
        }

        private final void a(Parcel parcel, Parcelable parcelable) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }

        public final Parcel a(int i10, Parcel parcel) {
            Parcel parcel2 = (Parcel) this.f79842c.invoke();
            try {
                try {
                    this.f79840a.transact(i10, parcel, parcel2, 0);
                    parcel2.readException();
                    return parcel2;
                } catch (RuntimeException e10) {
                    parcel2.recycle();
                    throw e10;
                }
            } finally {
                parcel.recycle();
            }
        }

        private final Parcelable a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() == 0) {
                return null;
            }
            Object objCreateFromParcel = creator.createFromParcel(parcel);
            Intrinsics.checkNotNull(objCreateFromParcel, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) objCreateFromParcel;
        }
    }

    int a(String str, String str2);

    Bundle a(String str, String str2, Bundle bundle);

    Bundle a(String str, String str2, Bundle bundle, Bundle bundle2);

    Bundle b(String str, String str2, Bundle bundle);
}
