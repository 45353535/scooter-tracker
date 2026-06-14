package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements pd.p {
    Mraid("mraid"),
    Video("video"),
    Image("image"),
    Label("label"),
    Countdown("countdown"),
    Progress("progress");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74369c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74377b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    b(String str) {
        this.f74377b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74377b;
    }
}
