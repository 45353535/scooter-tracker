package re;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ef.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f99454g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ef.i f99455h = new ef.i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ef.i f99456i = new ef.i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ef.i f99457j = new ef.i("Monitoring");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ef.i f99458k = new ef.i("Engine");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ef.i f99459l = new ef.i("Receive");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f99460f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ef.i a() {
            return i.f99458k;
        }

        public final ef.i b() {
            return i.f99459l;
        }

        private a() {
        }
    }

    public /* synthetic */ i(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ef.d
    public boolean g() {
        return this.f99460f;
    }

    public i(boolean z10) {
        super(f99455h, f99456i, f99457j, f99458k, f99459l);
        this.f99460f = z10;
    }
}
