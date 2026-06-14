package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6 f69545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f69546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f69547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f69548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1.e f69549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf f69550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4 f69551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ag f69552i;

    public cg(Context context, t6 uiPoster, m fileCache, w1 templateProxy, q1 videoRepository, b1.e eVar, wf networkService, d4 openMeasurementImpressionCallback, ag eventTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f69544a = context;
        this.f69545b = uiPoster;
        this.f69546c = fileCache;
        this.f69547d = templateProxy;
        this.f69548e = videoRepository;
        this.f69549f = eVar;
        this.f69550g = networkService;
        this.f69551h = openMeasurementImpressionCallback;
        this.f69552i = eventTracker;
    }

    public final u3 a(String location, dg adUnit, String adTypeTraitsName, String html, u7 adUnitRendererImpressionCallback, zb impressionInterface, r1 webViewTimeoutInterface, da nativeBridgeCommand) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        return adUnit.c().length() > 0 ? new j0(this.f69544a, location, adUnit.v(), adTypeTraitsName, this.f69545b, this.f69546c, this.f69547d, this.f69548e, adUnit.b(), this.f69549f, rd.f70996b.a().l(), this.f69550g, html, this.f69551h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f69552i, null, 524288, null) : adUnit.z() == w0.f71425e ? new o8(this.f69544a, location, adUnit.v(), adTypeTraitsName, this.f69546c, this.f69550g, this.f69545b, this.f69547d, this.f69549f, adUnit.j(), adUnit.o(), adUnit.s(), this.f69551h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, adUnit.C(), this.f69552i, null, null, 786432, null) : new kc(this.f69544a, location, adUnit.v(), adTypeTraitsName, this.f69546c, this.f69550g, this.f69545b, this.f69547d, this.f69549f, html, this.f69551h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f69552i);
    }
}
