package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class kc extends u3 {
    public final String P;
    public final zb Q;
    public final da R;
    public final ag S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(Context context, String location, a6 mtype, String adUnitParameters, m fileCache, wf wfVar, t6 uiPoster, w1 w1Var, b1.e eVar, String str, d4 openMeasurementImpressionCallback, u7 adUnitRendererCallback, zb impressionInterface, r1 webViewTimeoutInterface, da nativeBridgeCommand, ag eventTracker) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, wfVar, w1Var, eVar, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.P = str;
        this.Q = impressionInterface;
        this.R = nativeBridgeCommand;
        this.S = eventTracker;
    }

    @Override // f1.u3
    public v4 G(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.R.g(this.Q);
        String str = this.P;
        if (str == null || StringsKt.y0(str)) {
            eg.j("templateHtml must not be null or blank", null, 2, null);
            return null;
        }
        try {
            return new m7(context, this.P, Q(), this.Q, O(), this.R, this.S, null, 128, null);
        } catch (Exception e10) {
            I("Can't instantiate MraidWebViewBase: " + e10);
            return null;
        }
    }

    @Override // f1.u3, f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo4436e(event);
    }

    @Override // f1.u3
    public void d0() {
    }
}
