package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.core.h;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103446c;

    public h(@NonNull JSONObject jSONObject) {
        this.f103444a = jSONObject.optInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f103445b = jSONObject.optInt("h");
        this.f103446c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int a() {
        return this.f103444a;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final int b() {
        return this.f103445b;
    }

    @Override // sg.bigo.ads.api.core.h.b
    public final String c() {
        return this.f103446c;
    }
}
