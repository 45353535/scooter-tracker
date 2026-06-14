package bd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6258a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f6259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f6260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f6261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f6262d;

        public a(Integer num, float f10, float f11, float f12) {
            this.f6259a = num;
            this.f6260b = f10;
            this.f6261c = f11;
            this.f6262d = f12;
        }

        public final float a() {
            return this.f6260b;
        }

        public final Integer b() {
            return this.f6259a;
        }

        public final float c() {
            return this.f6262d;
        }

        public final float d() {
            return this.f6261c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f6259a, aVar.f6259a) && Float.compare(this.f6260b, aVar.f6260b) == 0 && Float.compare(this.f6261c, aVar.f6261c) == 0 && Float.compare(this.f6262d, aVar.f6262d) == 0;
        }

        public int hashCode() {
            Integer num = this.f6259a;
            return ((((((num == null ? 0 : num.hashCode()) * 31) + Float.floatToIntBits(this.f6260b)) * 31) + Float.floatToIntBits(this.f6261c)) * 31) + Float.floatToIntBits(this.f6262d);
        }

        public String toString() {
            return "Config(backgroundColor=" + this.f6259a + ", alphaThreshold=" + this.f6260b + ", tolerance=" + this.f6261c + ", brightnessThreshold=" + this.f6262d + ')';
        }
    }

    public c(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6258a = config;
    }

    public final boolean a(int i10, boolean z10) {
        return (z10 && this.f6258a.b() == null) ? pd.e.f98220a.b(i10) > this.f6258a.a() : this.f6258a.b() != null ? pd.e.f98220a.i(i10, this.f6258a.b().intValue()) > this.f6258a.d() : pd.e.f98220a.h(i10) >= this.f6258a.c();
    }
}
