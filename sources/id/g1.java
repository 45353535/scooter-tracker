package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum g1 implements pd.p {
    ValidCreative("valid_creative"),
    BrokenCreative("broken_creative"),
    AnyCreative("any_creative"),
    Never("never");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74511c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74517b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g1 a(String str) {
            return (g1) pd.g0.l(g1.values(), str);
        }

        private a() {
        }
    }

    g1(String str) {
        this.f74517b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74517b;
    }
}
