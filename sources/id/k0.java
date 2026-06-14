package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum k0 implements pd.p {
    Left("left", 3),
    Center("center", 1),
    Right("right", 5);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f74574d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f74580c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0 a(String str) {
            return (k0) pd.g0.l(k0.values(), str);
        }

        private a() {
        }
    }

    k0(String str, int i10) {
        this.f74579b = str;
        this.f74580c = i10;
    }

    public final int g() {
        return this.f74580c;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74579b;
    }
}
