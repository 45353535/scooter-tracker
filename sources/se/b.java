package se;

import ef.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ef.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f100014g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i f100015h = new i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i f100016i = new i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i f100017j = new i("After");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f100018f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return b.f100017j;
        }

        public final i b() {
            return b.f100015h;
        }

        private a() {
        }
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ef.d
    public boolean g() {
        return this.f100018f;
    }

    public b(boolean z10) {
        super(f100015h, f100016i, f100017j);
        this.f100018f = z10;
    }
}
