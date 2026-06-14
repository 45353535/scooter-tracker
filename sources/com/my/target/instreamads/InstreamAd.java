package com.my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.a4;
import com.my.target.c3;
import com.my.target.c4;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShoppableAdsItem;
import com.my.target.common.models.videomotion.Disclaimer;
import com.my.target.common.models.videomotion.Header;
import com.my.target.common.models.videomotion.VideoMotionData;
import com.my.target.common.models.videomotion.VideoMotionItem;
import com.my.target.d3;
import com.my.target.d4;
import com.my.target.da;
import com.my.target.gb;
import com.my.target.h3;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.instreamads.postview.models.CallToActionData;
import com.my.target.k0;
import com.my.target.k1;
import com.my.target.k3;
import com.my.target.l;
import com.my.target.m;
import com.my.target.o1;
import com.my.target.q1;
import com.my.target.t;
import com.my.target.tb;
import com.my.target.u8;
import com.my.target.w3;
import com.my.target.w5;
import com.my.target.z3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class InstreamAd extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f59880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MenuFactory f59881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3 f59882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c3 f59883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InstreamAdPlayer f59884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InstreamAdVideoMotionPlayer f59885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InstreamAdListener f59886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f59888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f59889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float[] f59890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f59891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f59892q;

    public static final class InstreamAdBanner {

        @Nullable
        public final ImageData adChoicesIcon;

        @NonNull
        public final String advertisingLabel;

        @NonNull
        public final String ageRestrictions;
        public final boolean allowClose;
        public final float allowCloseDelay;
        public final boolean allowPause;

        @Nullable
        public final String bundleId;

        @NotNull
        public final CallToActionData callToActionData;

        @NonNull
        public final List<InstreamAdCompanionBanner> companionBanners;

        @Nullable
        @Deprecated
        public final String ctaText;

        @NonNull
        public final String disclaimer;
        public final float duration;
        public final boolean hasAdChoices;
        public final boolean hasShoppable;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NonNull
        public final String f59893id;
        public final int postViewDuration;

        @Nullable
        public final List<ShoppableAdsItem> shoppableAdsItems;
        public final int videoHeight;
        public final int videoWidth;

        public InstreamAdBanner(String str, boolean z10, float f10, float f11, int i10, int i11, boolean z11, boolean z12, List list, boolean z13, String str2, CallToActionData callToActionData, int i12, ImageData imageData, List list2, String str3, String str4, String str5) {
            this.f59893id = str;
            this.allowClose = z10;
            this.allowCloseDelay = f10;
            this.duration = f11;
            this.videoHeight = i11;
            this.videoWidth = i10;
            this.ctaText = callToActionData.getButtonText();
            this.allowPause = z11;
            this.hasShoppable = z12;
            this.companionBanners = list;
            this.hasAdChoices = z13;
            this.advertisingLabel = str2;
            this.callToActionData = callToActionData;
            this.postViewDuration = i12;
            this.adChoicesIcon = imageData;
            this.shoppableAdsItems = list2;
            this.bundleId = str3;
            this.disclaimer = str4;
            this.ageRestrictions = str5;
        }

        public static InstreamAdBanner a(k0 k0Var) {
            boolean z10;
            ImageData imageDataC;
            boolean z11;
            int iB;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < k0Var.P().size(); i10++) {
                arrayList.add(InstreamAdCompanionBanner.a((k1) k0Var.P().get(i10)));
            }
            if (k0Var.a() != null) {
                imageDataC = k0Var.a().c();
                z10 = true;
            } else {
                z10 = false;
                imageDataC = null;
            }
            da daVarY = k0Var.Y();
            ArrayList arrayList2 = daVarY == null ? null : new ArrayList(daVarY.a());
            o1 o1VarQ = k0Var.Q();
            CallToActionData callToActionDataA = o1VarQ != null ? CallToActionData.a(o1VarQ.c(), o1VarQ.b(), o1VarQ.d(), o1VarQ.a(), o1VarQ.e()) : CallToActionData.a(k0Var.i(), null, null, null, null);
            u8 u8VarU = k0Var.U();
            if (u8VarU != null) {
                iB = (int) (u8VarU.b() * 1000.0d);
                z11 = false;
            } else {
                z11 = false;
                iB = 0;
            }
            boolean z12 = z11;
            return new InstreamAdBanner(k0Var.r(), k0Var.a0(), k0Var.M(), k0Var.o(), k0Var.G(), k0Var.p(), k0Var.b0(), k0Var.Z() == null ? z12 : true, arrayList, z10, k0Var.b(), callToActionDataA, iB, imageDataC, arrayList2, k0Var.e(), k0Var.l(), k0Var.c());
        }

        @NonNull
        public String toString() {
            return "InstreamAdBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", hasAdChoices=" + this.hasAdChoices + ", allowPause=" + this.allowPause + ", hasShoppable=" + this.hasShoppable + ", id='" + this.f59893id + "', advertisingLabel='" + this.advertisingLabel + "', companionBanners=" + this.companionBanners + ", callToActionData='" + this.callToActionData + "', postViewDuration='" + this.postViewDuration + "', bundleId='" + this.bundleId + "', disclaimer='" + this.disclaimer + "', ageRestrictions='" + this.ageRestrictions + "', adChoicesIcon=" + this.adChoicesIcon + ", shoppableAdsItems=" + this.shoppableAdsItems + '}';
        }
    }

    public static final class InstreamAdCompanionBanner {

        @Nullable
        public final String adSlotID;

        @Nullable
        public final String apiFramework;
        public final int assetHeight;
        public final int assetWidth;

        @Nullable
        public final String bundleId;
        public final int expandedHeight;
        public final int expandedWidth;
        public final int height;

        @Nullable
        public final String htmlResource;

        @Nullable
        public final String iframeResource;
        public final boolean isClickable;

        @Nullable
        public final String required;

        @Nullable
        public final String staticResource;
        public final int width;

        public InstreamAdCompanionBanner(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.width = i10;
            this.height = i11;
            this.assetWidth = i12;
            this.assetHeight = i13;
            this.expandedWidth = i14;
            this.expandedHeight = i15;
            this.isClickable = z10;
            this.staticResource = str;
            this.iframeResource = str2;
            this.htmlResource = str3;
            this.apiFramework = str4;
            this.adSlotID = str5;
            this.required = str6;
            this.bundleId = str7;
        }

        public static InstreamAdCompanionBanner a(k1 k1Var) {
            return new InstreamAdCompanionBanner(k1Var.G(), k1Var.p(), k1Var.O(), k1Var.N(), k1Var.Q(), k1Var.P(), !TextUtils.isEmpty(k1Var.B()), k1Var.U(), k1Var.S(), k1Var.R(), k1Var.M(), k1Var.L(), k1Var.T(), k1Var.e());
        }

        @NonNull
        public String toString() {
            return "InstreamAdCompanionBanner{width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", isClickable=" + this.isClickable + ", staticResource='" + this.staticResource + "', iframeResource='" + this.iframeResource + "', htmlResource='" + this.htmlResource + "', apiFramework='" + this.apiFramework + "', adSlotID='" + this.adSlotID + "', required='" + this.required + "', bundleId='" + this.bundleId + "'}";
        }
    }

    public interface InstreamAdListener {
        void onBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerPause(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerResume(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerShouldClose();

        void onBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerTimeLeftChange(float f10, float f11, @NonNull InstreamAd instreamAd);

        void onComplete(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onError(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onLoad(@NonNull InstreamAd instreamAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InstreamAd instreamAd);

        void onPostViewComplete();

        void onPostViewStart();

        void onVideoMotionBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerShouldClose(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);
    }

    public static final class InstreamAdVideoMotionBanner {

        @Nullable
        public final ImageData adChoicesIcon;
        public final boolean allowClose;
        public final float allowCloseDelay;

        @Nullable
        public final String bundleId;
        public final float duration;
        public final boolean hasAdChoices;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NonNull
        public final String f59894id;

        @NonNull
        public final VideoMotionData videoMotionData;

        public InstreamAdVideoMotionBanner(String str, boolean z10, float f10, float f11, boolean z11, ImageData imageData, VideoMotionData videoMotionData, String str2) {
            this.f59894id = str;
            this.allowClose = z10;
            this.allowCloseDelay = f10;
            this.duration = f11;
            this.hasAdChoices = z11;
            this.adChoicesIcon = imageData;
            this.videoMotionData = videoMotionData;
            this.bundleId = str2;
        }

        public static InstreamAdVideoMotionBanner a(tb tbVar) {
            boolean z10;
            ImageData imageDataC;
            if (tbVar.a() != null) {
                z10 = true;
                imageDataC = tbVar.a().c();
            } else {
                z10 = false;
                imageDataC = null;
            }
            boolean z11 = z10;
            c4 c4VarK0 = tbVar.k0();
            if (c4VarK0 == null) {
                gb.a("InstreamAdVideoMotionBanner: internalVideoMotionData is null");
                return null;
            }
            a4 a4Var = c4VarK0.f59367a;
            Header header = new Header(a4Var.f59103a, a4Var.f59104b, a4Var.f59105c, a4Var.f59106d, a4Var.f59107e);
            List<d4> list = c4VarK0.f59368b;
            ArrayList arrayList = new ArrayList();
            for (d4 d4Var : list) {
                arrayList.add(new VideoMotionItem(d4Var.f59483a, d4Var.f59489g, d4Var.f59490h, d4Var.f59484b, d4Var.f59485c, d4Var.f59486d, d4Var.f59487e));
            }
            z3 z3Var = c4VarK0.f59369c;
            return new InstreamAdVideoMotionBanner(tbVar.r(), tbVar.a0(), tbVar.M(), tbVar.o(), z11, imageDataC, new VideoMotionData(header, arrayList, z3Var != null ? new Disclaimer(z3Var.f61161a) : null), tbVar.e());
        }

        @NonNull
        public String toString() {
            return "InstreamAdVideoMotionBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", hasAdChoices=" + this.hasAdChoices + ", id='" + this.f59894id + "', videoMotionData=" + this.videoMotionData + ", adChoicesIcon=" + this.adChoicesIcon + ", bundleId='" + this.bundleId + "'}";
        }
    }

    public InstreamAd(int i10, @NonNull Context context) {
        super(i10, "instreamads");
        this.f59887l = 10;
        this.f59892q = 1.0f;
        this.f59880e = context;
        this.f59881f = new q1();
        gb.c("Instream ad created. Version - " + MyTargetVersion.VERSION);
    }

    public final void a(h3 h3Var, IAdLoadingError iAdLoadingError) {
        InstreamAdListener instreamAdListener = this.f59886k;
        if (instreamAdListener == null) {
            return;
        }
        if (h3Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            instreamAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        if (!h3Var.d()) {
            InstreamAdListener instreamAdListener2 = this.f59886k;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60113r;
            }
            instreamAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        this.f59882g = h3Var;
        c3 c3VarA = c3.a(this, h3Var, this.f59399a, this.f59400b, this.f59881f);
        this.f59883h = c3VarA;
        c3VarA.a(this.f59887l);
        this.f59883h.a(this.f59892q);
        InstreamAdPlayer instreamAdPlayer = this.f59884i;
        if (instreamAdPlayer != null) {
            this.f59883h.a(instreamAdPlayer);
        }
        InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.f59885j;
        if (instreamAdVideoMotionPlayer != null) {
            this.f59883h.a(instreamAdVideoMotionPlayer);
        }
        configureMidpoints(this.f59891p, this.f59890o);
        this.f59886k.onLoad(this);
    }

    public void configureMidpoints(float f10) {
        configureMidpoints(f10, null);
    }

    public void configureMidpointsPercents(float f10, @Nullable float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f10);
        } else {
            configureMidpoints(f10, w5.a(f10, fArr));
        }
    }

    public void destroy() {
        this.f59886k = null;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a();
        }
    }

    @Nullable
    public InstreamAdListener getListener() {
        return this.f59886k;
    }

    public int getLoadingTimeout() {
        return this.f59887l;
    }

    @NonNull
    public float[] getMidPoints() {
        float[] fArr = this.f59889n;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    @Nullable
    public InstreamAdPlayer getPlayer() {
        return this.f59884i;
    }

    @Nullable
    public View getShoppableView(Context context) {
        c3 c3Var = this.f59883h;
        if (c3Var == null) {
            return null;
        }
        return c3Var.a(context);
    }

    public int getVideoQuality() {
        return this.f59399a.j();
    }

    @NonNull
    public List<String> getVideoSectionNames() {
        if (this.f59882g == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListC = this.f59882g.c();
        if (arrayListC.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        int size = arrayListC.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListC.get(i10);
            i10++;
            w3 w3Var = (w3) obj;
            if (w3Var.a() > 0 || w3Var.i()) {
                arrayList.add(w3Var.h());
            }
        }
        return arrayList;
    }

    public float getVolume() {
        c3 c3Var = this.f59883h;
        return c3Var != null ? c3Var.e() : this.f59892q;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        c3 c3Var = this.f59883h;
        if (c3Var == null) {
            return;
        }
        c3Var.b(context);
    }

    public void handleClick() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.f();
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.c(instreamAdCompanionBanner);
        }
    }

    public boolean isFullscreen() {
        return this.f59888m;
    }

    public boolean isShoppablePresented() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            return c3Var.g();
        }
        return false;
    }

    public void load() {
        if (isLoadCalled()) {
            gb.a("InstreamAd: Doesn't support multiple load");
            a(null, m.f60115t);
        } else {
            d3.a(this.f59399a, this.f59400b, this.f59887l).a(new l.b() { // from class: n5.a
                @Override // com.my.target.l.b
                public final void a(t tVar, m mVar) {
                    this.f95110a.a((h3) tVar, mVar);
                }
            }).a(this.f59400b.a(), this.f59880e);
        }
    }

    public void pause() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.h();
        }
    }

    public void resume() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.j();
        }
    }

    public void setFullscreen(boolean z10) {
        this.f59888m = z10;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(z10);
        }
    }

    public void setListener(@Nullable InstreamAdListener instreamAdListener) {
        this.f59886k = instreamAdListener;
    }

    public void setLoadingTimeout(int i10) {
        if (i10 < 5) {
            gb.a("InstreamAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.f59887l = 5;
        } else {
            gb.a("InstreamAd: Ad loading timeout set to " + i10 + " seconds");
            this.f59887l = i10;
        }
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(this.f59887l);
        }
    }

    public void setPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.f59884i = instreamAdPlayer;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(instreamAdPlayer);
        }
    }

    public void setPostViewPlayer(InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        c3 c3Var = this.f59883h;
        if (c3Var == null) {
            return;
        }
        c3Var.a(instreamAdPostViewPlayer);
    }

    public void setShoppablePresented(boolean z10) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.b(z10);
        }
    }

    public void setVideoMotionPlayer(@Nullable InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        if (instreamAdVideoMotionPlayer == null) {
            return;
        }
        this.f59885j = instreamAdVideoMotionPlayer;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(instreamAdVideoMotionPlayer);
        }
    }

    public void setVideoQuality(int i10) {
        this.f59399a.d(i10);
    }

    public void setVolume(float f10) {
        if (Float.compare(f10, 0.0f) < 0 || Float.compare(f10, 1.0f) > 0) {
            gb.a("InstreamAd: Unable to set volume" + f10 + ", volume must be in range [0..1]");
            return;
        }
        this.f59892q = f10;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(f10);
        }
    }

    public void shoppableAdsItemClick(@NonNull String str) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(str);
        }
    }

    public void shoppableAdsItemShow(@NonNull String str) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.b(str);
        }
    }

    public void skip() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.k();
        }
    }

    public void skipBanner() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.l();
        }
    }

    public void startMidroll(float f10) {
        c3 c3Var = this.f59883h;
        if (c3Var == null) {
            gb.a("InstreamAd: Unable to start ad: not loaded yet");
        } else if (c3Var.d() == null) {
            gb.a("InstreamAd: Unable to start ad: player has not set");
        } else {
            this.f59883h.b(f10);
        }
    }

    public void startPauseroll() {
        a("pauseroll");
    }

    public void startPostroll() {
        a("postroll");
    }

    public void startPreroll() {
        a("preroll");
    }

    public void stop() {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.m();
        }
    }

    public void swapPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.f59884i = instreamAdPlayer;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.b(instreamAdPlayer);
        }
    }

    public void useDefaultPlayer() {
        useDefaultPlayer(true);
    }

    public void configureMidpoints(float f10, @Nullable float[] fArr) {
        w3 w3VarA;
        if (f10 <= 0.0f) {
            gb.a("InstreamAd: Midpoints are not configured, duration is not set or <= zero");
            return;
        }
        if (this.f59889n != null) {
            gb.a("InstreamAd: Midpoints already configured");
            return;
        }
        this.f59890o = fArr;
        this.f59891p = f10;
        h3 h3Var = this.f59882g;
        if (h3Var == null || (w3VarA = h3Var.a("midroll")) == null) {
            return;
        }
        float[] fArrA = w5.a(w3VarA, this.f59890o, f10);
        this.f59889n = fArrA;
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(fArrA);
        }
    }

    public void useDefaultPlayer(boolean z10) {
        k3 k3Var = new k3(this.f59880e);
        k3Var.setUseExoPlayer(z10);
        setPlayer(k3Var);
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner, @NonNull Context context) {
        c3 c3Var = this.f59883h;
        if (c3Var != null) {
            c3Var.a(instreamAdCompanionBanner, context);
        }
    }

    public InstreamAd(int i10, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(i10, "instreamads");
        this.f59887l = 10;
        this.f59892q = 1.0f;
        this.f59880e = context;
        this.f59881f = menuFactory;
        gb.c("Instream ad created. Version - " + MyTargetVersion.VERSION);
    }

    public final void a(String str) {
        c3 c3Var = this.f59883h;
        if (c3Var == null) {
            gb.a("InstreamAd: Unable to start ad - not loaded yet");
        } else if (c3Var.d() == null) {
            gb.a("InstreamAd: Unable to start ad - player has not set");
        } else {
            this.f59883h.c(str);
        }
    }
}
