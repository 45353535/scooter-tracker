package bd;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6248a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f6251c;

        public a(int i10, int i11, d samplingStrategy) {
            Intrinsics.checkNotNullParameter(samplingStrategy, "samplingStrategy");
            this.f6249a = i10;
            this.f6250b = i11;
            this.f6251c = samplingStrategy;
        }

        public final int a(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.f6251c.a(rect.width(), rect.height(), this.f6249a);
        }

        public final int b(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.f6251c.a(rect.width(), rect.height(), this.f6250b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6249a == aVar.f6249a && this.f6250b == aVar.f6250b && Intrinsics.areEqual(this.f6251c, aVar.f6251c);
        }

        public int hashCode() {
            return (((this.f6249a * 31) + this.f6250b) * 31) + this.f6251c.hashCode();
        }

        public String toString() {
            return "Config(maxOffsetPx=" + this.f6249a + ", maxSampleSizePx=" + this.f6250b + ", samplingStrategy=" + this.f6251c + ')';
        }
    }

    /* JADX INFO: renamed from: bd.b$b, reason: collision with other inner class name */
    public enum EnumC0137b {
        TopLeft,
        TopRight,
        BottomLeft,
        BottomRight
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6257a;

        static {
            int[] iArr = new int[EnumC0137b.values().length];
            try {
                iArr[EnumC0137b.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0137b.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0137b.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0137b.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6257a = iArr;
        }
    }

    public b(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6248a = config;
    }

    private final Rect a(EnumC0137b enumC0137b, Rect rect, int i10, int i11) {
        int i12 = c.f6257a[enumC0137b.ordinal()];
        if (i12 == 1) {
            int i13 = rect.left + i10;
            int i14 = rect.top + i10;
            return new Rect(i13, i14, i13 + i11, i11 + i14);
        }
        if (i12 == 2) {
            int i15 = rect.right - i10;
            int i16 = rect.top + i10;
            return new Rect(i15 - i11, i16, i15, i11 + i16);
        }
        if (i12 == 3) {
            int i17 = rect.left + i10;
            int i18 = rect.bottom - i10;
            return new Rect(i17, i18 - i11, i11 + i17, i18);
        }
        if (i12 != 4) {
            throw new lf.m();
        }
        int i19 = rect.right - i10;
        int i20 = rect.bottom - i10;
        return new Rect(i19 - i11, i20 - i11, i19, i20);
    }

    public final List b(Rect contentBounds) {
        Intrinsics.checkNotNullParameter(contentBounds, "contentBounds");
        if (contentBounds.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        EnumC0137b[] enumC0137bArrValues = EnumC0137b.values();
        ArrayList arrayList = new ArrayList(enumC0137bArrValues.length);
        for (EnumC0137b enumC0137b : enumC0137bArrValues) {
            arrayList.add(a(enumC0137b, contentBounds, this.f6248a.a(contentBounds), this.f6248a.b(contentBounds)));
        }
        return arrayList;
    }
}
