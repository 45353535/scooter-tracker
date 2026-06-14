package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum g implements pd.p {
    Linear("linear"),
    EaseIn("ease_in"),
    EaseOut("ease_out"),
    EaseInOut("ease_in_out");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74501c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74507b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(String str) {
            return (g) pd.g0.l(g.values(), str);
        }

        private a() {
        }
    }

    g(String str) {
        this.f74507b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74507b;
    }
}
