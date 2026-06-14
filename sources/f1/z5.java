package f1;

import f1.bf;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z5 implements f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg f71775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bf f71776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eb f71777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u7 f71778e;

    public static final class a implements wb {
        @Override // f1.wb
        public void a(String str) {
            eg.j("onCompleteRequestFailure " + str, null, 2, null);
        }

        @Override // f1.wb
        public void a(JSONObject jSONObject) {
            eg.j("onCompleteRequestSuccess " + jSONObject, null, 2, null);
        }
    }

    public z5(dg adUnit, bf adType, eb completeRequest, u7 adUnitRendererImpressionCallback) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        this.f71775b = adUnit;
        this.f71776c = adType;
        this.f71777d = completeRequest;
        this.f71778e = adUnitRendererImpressionCallback;
    }

    @Override // f1.f5
    public void a() {
        bf bfVar = this.f71776c;
        if (bfVar == bf.b.f69484g) {
            eg.j("didCompleteInterstitial delegate used to be sent here", null, 2, null);
        } else if (bfVar == bf.c.f69485g) {
            this.f71778e.a(this.f71775b.r(), this.f71775b.A());
        }
    }

    @Override // f1.f5
    public void b(String location, Float f10, Float f11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71777d.d(new a(), new na(location, this.f71775b.f(), this.f71775b.l(), this.f71775b.A(), this.f71775b.B(), f10, f11));
    }
}
