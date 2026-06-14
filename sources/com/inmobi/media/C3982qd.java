package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3982qd extends AbstractC4167y implements InterfaceC3636cj, InterfaceC4010rh, InterfaceC3693f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f39380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f39381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3669e1 f39382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Nc f39383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ec f39384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Jc f39385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4 f39386h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3982qd(MediaView mediaView, View view, AbstractC3669e1 adSessionManager, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent, Jc stateMachine) {
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C4142x c4142x = nativeAdUnitComponent.f36789a;
        super(c4142x);
        this.f39380b = mediaView;
        this.f39381c = view;
        this.f39382d = adSessionManager;
        this.f39383e = nativeBeaconProcessor;
        this.f39384f = nativeAdUnitComponent;
        this.f39385g = stateMachine;
        G g10 = c4142x.f39883b;
        this.f39386h = new D4(g10.f36905h, g10.f36898a.f39233a.f37141a);
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void a() throws JSONException {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadedState", "Initialize Called");
        }
        Dc dc2 = (Dc) this.f39384f.f36794f.getValue();
        Map mapA = AbstractC3789ik.a(dc2.f36723a);
        long j10 = dc2.f36724b.f38308a;
        CoroutineScope coroutineScope = AbstractC3790il.f38771a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Wj wj = Wj.f37959a;
        Wj.b("AdLoadSuccessful", mapA, EnumC3585ak.f38215a);
        this.f39383e.f37444b.f37278b.a(Te.f37766a);
        JsonAssetObject assetsObject = this.f39384f.f36790b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C3605be pubData = new C3605be((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.f39380b, this.f39381c);
        Ac ac2 = this.f39384f.f36791c;
        ac2.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        InterfaceC3636cj interfaceC3636cj = ac2.f36566c;
        Cd cd2 = interfaceC3636cj instanceof Cd ? (Cd) interfaceC3636cj : null;
        if (cd2 != null) {
            cd2.a(pubData);
        }
    }

    @Override // com.inmobi.media.InterfaceC3636cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        G g10 = this.f39960a.f39883b;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        long timeToLive = g10.f36898a.f39234b.getCacheConfig("native").getTimeToLive();
        long millis = g10.f36908k;
        if (millis == -1) {
            millis = g10.f36907j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (millis - System.currentTimeMillis() < 0) {
            InterfaceC3878m9 interfaceC3878m9L2 = l();
            if (interfaceC3878m9L2 != null) {
                ((C3903n9) interfaceC3878m9L2).a("NativeLoadedState", "Ad-Expired");
            }
            Map mapA = AbstractC3789ik.a(((Dc) this.f39384f.f36794f.getValue()).f36723a);
            Wj wj = Wj.f37959a;
            Wj.b("AdExpired", mapA, EnumC3585ak.f38215a);
        }
        this.f39386h.a();
        C3617c0 c3617c0 = this.f39960a.f39882a.f39146d;
        c3617c0.getClass();
        c3617c0.f38311d = SystemClock.elapsedRealtime();
        this.f39383e.f37444b.f37280d.a(Te.f37766a);
        Map mapA2 = AbstractC3789ik.a(((Dc) this.f39384f.f36794f.getValue()).f36723a);
        Wj wj2 = Wj.f37959a;
        Wj.b("StartTracking", mapA2, EnumC3585ak.f38215a);
        this.f39385g.a(new C4057te(new C4082ue(new C4036si(), new Sg(inMobiNativeViewData, this.f39380b, this.f39381c), this.f39386h, this.f39382d, this.f39383e, this.f39384f), this.f39385g), this);
    }

    @Override // com.inmobi.media.InterfaceC3693f
    public final Object a(Continuation continuation) {
        InterfaceC3878m9 interfaceC3878m9L = l();
        if (interfaceC3878m9L != null) {
            ((C3903n9) interfaceC3878m9L).a("NativeLoadedState", "onDestroy");
        }
        Object objA = this.f39385g.a(new Vc(), this, (kotlin.coroutines.jvm.internal.d) continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
