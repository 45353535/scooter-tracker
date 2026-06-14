package id;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum r implements pd.p {
    ColorHistogram("color_histogram"),
    BrightnessVariance("brightness_variance"),
    EdgeDetection("edge_detection");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f74606c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74611b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(String str) {
            return (r) pd.g0.l(r.values(), str);
        }

        private a() {
        }
    }

    r(String str) {
        this.f74611b = str;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74611b;
    }
}
