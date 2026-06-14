package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements sg.bigo.ads.api.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f102200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f102201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f102202d;

    public j(@NonNull JSONObject jSONObject) {
        this.f102199a = jSONObject.optInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f102200b = jSONObject.optInt("h");
        this.f102201c = jSONObject.optString("url");
        this.f102202d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.a.f
    public final int a() {
        return this.f102199a;
    }

    @Override // sg.bigo.ads.api.a.f
    public final int b() {
        return this.f102200b;
    }

    @Override // sg.bigo.ads.api.a.f
    public final String c() {
        return this.f102201c;
    }
}
