package f1;

import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import f1.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m9 implements ca, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg f70475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bf f70477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u7 f70478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pc f70479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i6 f70480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x5 f70481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d4 f70482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ag f70483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70484k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70485a;

        static {
            int[] iArr = new int[wd.values().length];
            try {
                iArr[wd.f71450e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wd.f71449d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70485a = iArr;
        }
    }

    public m9(dg adUnit, String location, bf adType, u7 adUnitRendererImpressionCallback, pc impressionIntermediateCallback, i6 appRequest, x5 downloader, d4 openMeasurementImpressionCallback, ag eventTracker) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70475b = adUnit;
        this.f70476c = location;
        this.f70477d = adType;
        this.f70478e = adUnitRendererImpressionCallback;
        this.f70479f = impressionIntermediateCallback;
        this.f70480g = appRequest;
        this.f70481h = downloader;
        this.f70482i = openMeasurementImpressionCallback;
        this.f70483j = eventTracker;
        this.f70484k = true;
    }

    public final void a() {
        eg.j("Dismissing impression", null, 2, null);
        this.f70479f.d(wd.f71452g);
        b();
    }

    public final void b() {
        eg.j("Removing impression", null, 2, null);
        this.f70479f.d(wd.f71453h);
        this.f70479f.n();
        this.f70481h.g();
    }

    @Override // f1.ca
    public void c() {
        this.f70478e.a(this.f70475b.r());
    }

    @Override // f1.ca
    public void d(wd state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f70484k = true;
        this.f70482i.b(PlayerState.NORMAL);
        int i10 = a.f70485a[state.ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            b();
            e((y0) new w3(z2.i.f71758n, "onClose with state Loaded", this.f70477d.b(), this.f70476c, null, null, 48, null));
        }
        this.f70478e.j(this.f70480g);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70483j.e(y0Var);
    }

    @Override // f1.ca
    public void i(boolean z10) {
        this.f70484k = z10;
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70483j.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70483j.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70483j.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70483j.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70483j.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70483j.mo4436e(event);
    }
}
