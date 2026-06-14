package se;

import ef.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ef.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f100026g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i f100027h = new i("Receive");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i f100028i = new i("Parse");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i f100029j = new i("Transform");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final i f100030k = new i("State");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final i f100031l = new i("After");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f100032f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return f.f100028i;
        }

        public final i b() {
            return f.f100027h;
        }

        public final i c() {
            return f.f100029j;
        }

        private a() {
        }
    }

    public /* synthetic */ f(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Override // ef.d
    public boolean g() {
        return this.f100032f;
    }

    public f(boolean z10) {
        super(f100027h, f100028i, f100029j, f100030k, f100031l);
        this.f100032f = z10;
    }
}
