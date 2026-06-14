package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum f1 implements pd.p {
    Left("left"),
    Top("top"),
    Right("right"),
    Bottom("bottom");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74494c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74500b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    f1(String str) {
        this.f74500b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74500b;
    }
}
