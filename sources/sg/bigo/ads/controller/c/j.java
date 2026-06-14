package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f103452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f103454d;

    public j(@NonNull JSONObject jSONObject) {
        this.f103451a = jSONObject.optInt("video_impression_area_rate", 0);
        this.f103452b = jSONObject.optLong("video_impression_time", 0L);
        this.f103453c = jSONObject.optInt("image_impression_area_rate", 0);
        this.f103454d = jSONObject.optLong("image_impression_time", 0L);
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int a() {
        return this.f103451a;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long b() {
        return this.f103452b;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final int c() {
        return this.f103453c;
    }

    @Override // sg.bigo.ads.api.core.n.b
    public final long d() {
        return this.f103454d;
    }
}
