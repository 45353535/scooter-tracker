package f1;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f69565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f69566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f69567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f69568f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f69571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f69572d = new b("TOP_LEFT", 0, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f69573e = new b("TOP_RIGHT", 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f69574f = new b("BOTTOM_LEFT", 2, 2);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f69575g = new b("BOTTOM_RIGHT", 3, 3);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ b[] f69576h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69577i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69578b;

        public static final class a {
            public a() {
            }

            public final b a(int i10) {
                Object next;
                Iterator<E> it = b.g().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((b) next).h() == i10) {
                        break;
                    }
                }
                b bVar = (b) next;
                return bVar == null ? b.f69572d : bVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            b[] bVarArrD = d();
            f69576h = bVarArrD;
            f69577i = qf.a.a(bVarArrD);
            f69571c = new a(null);
        }

        public b(String str, int i10, int i11) {
            this.f69578b = i11;
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f69572d, f69573e, f69574f, f69575g};
        }

        public static EnumEntries g() {
            return f69577i;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f69576h.clone();
        }

        public final int h() {
            return this.f69578b;
        }
    }

    public d2(String imageUrl, String clickthroughUrl, b position, a margin, a padding, a size) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f69563a = imageUrl;
        this.f69564b = clickthroughUrl;
        this.f69565c = position;
        this.f69566d = margin;
        this.f69567e = padding;
        this.f69568f = size;
    }

    public final String a() {
        return this.f69564b;
    }

    public final String b() {
        return this.f69563a;
    }

    public final a c() {
        return this.f69566d;
    }

    public final b d() {
        return this.f69565c;
    }

    public final a e() {
        return this.f69568f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.areEqual(this.f69563a, d2Var.f69563a) && Intrinsics.areEqual(this.f69564b, d2Var.f69564b) && this.f69565c == d2Var.f69565c && Intrinsics.areEqual(this.f69566d, d2Var.f69566d) && Intrinsics.areEqual(this.f69567e, d2Var.f69567e) && Intrinsics.areEqual(this.f69568f, d2Var.f69568f);
    }

    public int hashCode() {
        return (((((((((this.f69563a.hashCode() * 31) + this.f69564b.hashCode()) * 31) + this.f69565c.hashCode()) * 31) + this.f69566d.hashCode()) * 31) + this.f69567e.hashCode()) * 31) + this.f69568f.hashCode();
    }

    public String toString() {
        return "InfoIcon(imageUrl=" + this.f69563a + ", clickthroughUrl=" + this.f69564b + ", position=" + this.f69565c + ", margin=" + this.f69566d + ", padding=" + this.f69567e + ", size=" + this.f69568f + ")";
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f69569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f69570b;

        public a(double d10, double d11) {
            this.f69569a = d10;
            this.f69570b = d11;
        }

        public final double a() {
            return this.f69570b;
        }

        public final double b() {
            return this.f69569a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f69569a, aVar.f69569a) == 0 && Double.compare(this.f69570b, aVar.f69570b) == 0;
        }

        public int hashCode() {
            return (androidx.collection.a.a(this.f69569a) * 31) + androidx.collection.a.a(this.f69570b);
        }

        public String toString() {
            return "DoubleSize(width=" + this.f69569a + ", height=" + this.f69570b + ")";
        }

        public /* synthetic */ a(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public /* synthetic */ d2(String str, String str2, b bVar, a aVar, a aVar2, a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? b.f69572d : bVar, (i10 & 8) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar, (i10 & 16) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar2, (i10 & 32) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar3);
    }
}
