package bd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import pd.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f6313b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC0139a f6318e;

        /* JADX INFO: renamed from: bd.i$a$a, reason: collision with other inner class name */
        public interface InterfaceC0139a {

            /* JADX INFO: renamed from: bd.i$a$a$a, reason: collision with other inner class name */
            public static final class C0140a implements InterfaceC0139a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0140a f6319a = new C0140a();

                private C0140a() {
                }

                @Override // bd.i.a.InterfaceC0139a
                public int a(int i10, int i11, int i12, int i13, int i14) {
                    return zf.a.d(q.a(i13, i14, (i10 * i11) / (i12 * i12)));
                }
            }

            int a(int i10, int i11, int i12, int i13, int i14);
        }

        public a(int i10, int i11, int i12, int i13, InterfaceC0139a samplingStrategy) {
            Intrinsics.checkNotNullParameter(samplingStrategy, "samplingStrategy");
            this.f6314a = i10;
            this.f6315b = i11;
            this.f6316c = i12;
            this.f6317d = i13;
            this.f6318e = samplingStrategy;
        }

        public final int a() {
            return this.f6314a;
        }

        public final int b(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.f6318e.a(rect.width(), rect.height(), this.f6315b, this.f6316c, this.f6317d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6314a == aVar.f6314a && this.f6315b == aVar.f6315b && this.f6316c == aVar.f6316c && this.f6317d == aVar.f6317d && Intrinsics.areEqual(this.f6318e, aVar.f6318e);
        }

        public int hashCode() {
            return (((((((this.f6314a * 31) + this.f6315b) * 31) + this.f6316c) * 31) + this.f6317d) * 31) + this.f6318e.hashCode();
        }

        public String toString() {
            return "Config(defaultColor=" + this.f6314a + ", maxDimensionPx=" + this.f6315b + ", minSampleStepPx=" + this.f6316c + ", maxSampleStepPx=" + this.f6317d + ", samplingStrategy=" + this.f6318e + ')';
        }
    }

    public i(a config, m pixelsExtractor) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pixelsExtractor, "pixelsExtractor");
        this.f6312a = config;
        this.f6313b = pixelsExtractor;
    }

    public final int a(Bitmap bitmap, Rect rect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Rect rectA = pd.a.f98215a.a(bitmap, rect);
        if (rectA == null) {
            return this.f6312a.a();
        }
        return pd.e.f98220a.d(this.f6313b.a(bitmap, rectA), bitmap.hasAlpha(), this.f6312a.b(rectA));
    }
}
