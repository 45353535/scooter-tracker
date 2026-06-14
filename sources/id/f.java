package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum f implements pd.p {
    Appear("appear"),
    Disappear("disappear");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74481c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74485b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            return (f) pd.g0.l(f.values(), str);
        }

        private a() {
        }
    }

    f(String str) {
        this.f74485b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74485b;
    }
}
