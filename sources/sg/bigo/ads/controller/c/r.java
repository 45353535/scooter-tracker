package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONObject;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103513c;

    public r(@NonNull JSONObject jSONObject) {
        this.f103511a = jSONObject.optInt(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        this.f103512b = jSONObject.optInt("h");
        this.f103513c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int a() {
        return this.f103511a;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final int b() {
        return this.f103512b;
    }

    @Override // sg.bigo.ads.api.core.n.c
    public final String c() {
        return this.f103513c;
    }
}
