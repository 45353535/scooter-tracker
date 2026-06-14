package n9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f95415e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f95416f = o0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f95417g = o0.C0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f95418h = o0.C0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f95419i = o0.C0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95423d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f95424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f95425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f95426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f95427d;

        public b(int i10) {
            this.f95424a = i10;
        }

        public k e() {
            q9.a.a(this.f95425b <= this.f95426c);
            return new k(this);
        }

        public b f(int i10) {
            this.f95426c = i10;
            return this;
        }

        public b g(int i10) {
            this.f95425b = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f95420a == kVar.f95420a && this.f95421b == kVar.f95421b && this.f95422c == kVar.f95422c && Objects.equals(this.f95423d, kVar.f95423d);
    }

    public int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f95420a) * 31) + this.f95421b) * 31) + this.f95422c) * 31;
        String str = this.f95423d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private k(b bVar) {
        this.f95420a = bVar.f95424a;
        this.f95421b = bVar.f95425b;
        this.f95422c = bVar.f95426c;
        this.f95423d = bVar.f95427d;
    }
}
