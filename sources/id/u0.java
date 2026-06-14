package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum u0 implements pd.p {
    Portrait("portrait", 7),
    Landscape("landscape", 6);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f74633d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f74638c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    u0(String str, int i10) {
        this.f74637b = str;
        this.f74638c = i10;
    }

    public final int g() {
        return this.f74638c;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74637b;
    }
}
