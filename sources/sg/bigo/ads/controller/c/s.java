package sg.bigo.ads.controller.c;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements n.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f103514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f103516c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f103518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f103519f;

    public s(@NonNull JSONObject jSONObject) {
        this.f103514a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f103515b = jSONObject.optInt("play_ad_threshold", 50);
        this.f103517d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f103518e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final long a() {
        return this.f103519f;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean b() {
        return this.f103514a;
    }

    @Override // sg.bigo.ads.api.core.n.d
    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public final int c() {
        if (!this.f103514a) {
            return 100;
        }
        long j10 = this.f103519f;
        if (j10 <= this.f103517d) {
            return 100;
        }
        long j11 = this.f103518e;
        return j10 <= j11 ? this.f103515b : j10 < (3 * j11) / 2 ? (int) ((((long) this.f103515b) * j11) / j10) : (this.f103515b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean d() {
        return this.f103516c;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(long j10) {
        this.f103519f = j10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(boolean z10) {
        this.f103516c = z10;
    }
}
