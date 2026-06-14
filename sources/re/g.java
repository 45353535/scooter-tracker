package re;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ef.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f99440g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ef.i f99441h = new ef.i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ef.i f99442i = new ef.i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ef.i f99443j = new ef.i("Transform");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ef.i f99444k = new ef.i("Render");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ef.i f99445l = new ef.i("Send");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f99446f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ef.i a() {
            return g.f99441h;
        }

        public final ef.i b() {
            return g.f99444k;
        }

        public final ef.i c() {
            return g.f99445l;
        }

        public final ef.i d() {
            return g.f99442i;
        }

        private a() {
        }
    }

    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ef.d
    public boolean g() {
        return this.f99446f;
    }

    public g(boolean z10) {
        super(f99441h, f99442i, f99443j, f99444k, f99445l);
        this.f99446f = z10;
    }
}
