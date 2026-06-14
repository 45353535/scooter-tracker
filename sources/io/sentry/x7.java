package io.sentry;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Double f84441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f84442b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.r f84453m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f84443c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f84444d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f84445e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f84446f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f84447g = a.MEDIUM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84448h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f84449i = 30000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f84450j = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f84451k = 3600000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f84452l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f84454n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v4 f84455o = v4.PIXEL_COPY;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public x7(boolean z10, io.sentry.protocol.r rVar) {
        if (z10) {
            return;
        }
        v(true);
        u(true);
        this.f84443c.add("android.webkit.WebView");
        this.f84443c.add("android.widget.VideoView");
        this.f84443c.add("androidx.media3.ui.PlayerView");
        this.f84443c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f84443c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f84453m = rVar;
    }

    public void a(String str) {
        this.f84443c.add(str);
    }

    public void b(String str) {
        this.f84444d.add(str);
    }

    public long c() {
        return this.f84449i;
    }

    public int d() {
        return this.f84448h;
    }

    public Set e() {
        return this.f84443c;
    }

    public String f() {
        return this.f84445e;
    }

    public Double g() {
        return this.f84442b;
    }

    public a h() {
        return this.f84447g;
    }

    public v4 i() {
        return this.f84455o;
    }

    public io.sentry.protocol.r j() {
        return this.f84453m;
    }

    public long k() {
        return this.f84451k;
    }

    public Double l() {
        return this.f84441a;
    }

    public long m() {
        return this.f84450j;
    }

    public Set n() {
        return this.f84444d;
    }

    public String o() {
        return this.f84446f;
    }

    public boolean p() {
        return this.f84454n;
    }

    public boolean q() {
        return l() != null && l().doubleValue() > 0.0d;
    }

    public boolean r() {
        return g() != null && g().doubleValue() > 0.0d;
    }

    public boolean s() {
        return this.f84452l;
    }

    public void t(boolean z10) {
        this.f84454n = z10;
    }

    public void u(boolean z10) {
        if (z10) {
            a("android.widget.ImageView");
            this.f84444d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.f84443c.remove("android.widget.ImageView");
        }
    }

    public void v(boolean z10) {
        if (z10) {
            a(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            this.f84444d.remove(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        } else {
            b(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            this.f84443c.remove(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        }
    }

    public void w(Double d10) {
        if (io.sentry.util.a0.f(d10)) {
            this.f84442b = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void x(v4 v4Var) {
        this.f84455o = v4Var;
    }

    public void y(io.sentry.protocol.r rVar) {
        this.f84453m = rVar;
    }

    public void z(Double d10) {
        if (io.sentry.util.a0.f(d10)) {
            this.f84441a = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
