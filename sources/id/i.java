package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum i implements pd.p {
    Fade("fade"),
    Slide("slide");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74526c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74530b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    i(String str) {
        this.f74530b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74530b;
    }
}
