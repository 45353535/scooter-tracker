package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum u implements pd.p {
    FullLoad("full_load"),
    PartialLoad("partial_load"),
    StreamLoad("stream_load");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74627c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74632b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    u(String str) {
        this.f74632b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74632b;
    }
}
