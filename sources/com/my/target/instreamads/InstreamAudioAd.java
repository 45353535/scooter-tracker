package com.my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShareButtonData;
import com.my.target.gb;
import com.my.target.k1;
import com.my.target.l;
import com.my.target.l3;
import com.my.target.m;
import com.my.target.m3;
import com.my.target.p3;
import com.my.target.q1;
import com.my.target.s5;
import com.my.target.t;
import com.my.target.v5;
import com.my.target.w5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class InstreamAudioAd extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f59895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MenuFactory f59896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p3 f59897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l3 f59898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InstreamAudioAdPlayer f59899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InstreamAudioAdListener f59900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f59902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f59903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f59904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f59905o;

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

    public static final class InstreamAudioAdBanner {

        @Nullable
        public final ImageData adChoicesIcon;

        @Nullable
        public final String adText;

        @NonNull
        public final String advertisingLabel;
        public final boolean allowPause;
        public final boolean allowSeek;
        public final boolean allowSkip;
        public final boolean allowTrackChange;

        @Nullable
        public final String bundleId;

        @NonNull
        public final List<InstreamAdCompanionBanner> companionBanners;
        public final float duration;
        public final boolean hasAdChoices;

        @NonNull
        public final ArrayList<ShareButtonData> shareButtonDatas;

        public InstreamAudioAdBanner(boolean z10, boolean z11, boolean z12, float f10, String str, boolean z13, ArrayList arrayList, List list, boolean z14, String str2, ImageData imageData, String str3) {
            this.allowSeek = z10;
            this.allowSkip = z11;
            this.allowPause = z13;
            this.allowTrackChange = z12;
            this.duration = f10;
            this.adText = str;
            this.shareButtonDatas = arrayList;
            this.companionBanners = list;
            this.hasAdChoices = z14;
            this.advertisingLabel = str2;
            this.adChoicesIcon = imageData;
            this.bundleId = str3;
        }

        public static InstreamAudioAdBanner a(s5 s5Var) {
            ImageData imageDataC;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListP = s5Var.P();
            int size = arrayListP.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListP.get(i10);
                i10++;
                arrayList.add(InstreamAdCompanionBanner.a((k1) obj));
            }
            if (s5Var.a() != null) {
                imageDataC = s5Var.a().c();
                z10 = true;
            } else {
                imageDataC = null;
            }
            return new InstreamAudioAdBanner(s5Var.d0(), s5Var.e0(), s5Var.f0(), s5Var.o(), s5Var.L(), s5Var.b0(), s5Var.X(), arrayList, z10, s5Var.b(), imageDataC, s5Var.e());
        }

        @NonNull
        public String toString() {
            return "InstreamAudioAdBanner{duration=" + this.duration + ", allowSeek=" + this.allowSeek + ", allowPause=" + this.allowPause + ", allowSkip=" + this.allowSkip + ", allowTrackChange=" + this.allowTrackChange + ", hasAdChoices=" + this.hasAdChoices + ", adChoicesIcon=" + this.adChoicesIcon + ", adText='" + this.adText + "', bundleId='" + this.bundleId + "', shareButtonDatas=" + this.shareButtonDatas + ", companionBanners=" + this.companionBanners + ", advertisingLabel='" + this.advertisingLabel + "'}";
        }
    }

    public interface InstreamAudioAdListener {
        void onBannerComplete(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerShouldClose(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerStart(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerTimeLeftChange(float f10, float f11, @NonNull InstreamAudioAd instreamAudioAd);

        void onComplete(@NonNull String str, @NonNull InstreamAudioAd instreamAudioAd);

        void onError(@NonNull String str, @NonNull InstreamAudioAd instreamAudioAd);

        void onLoad(@NonNull InstreamAudioAd instreamAudioAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InstreamAudioAd instreamAudioAd);
    }

    public InstreamAudioAd(int i10, @NonNull Context context) {
        super(i10, "instreamaudioads");
        this.f59901k = 10;
        this.f59902l = 1.0f;
        this.f59895e = context;
        this.f59896f = new q1();
        gb.c("Instream audio ad created. Version - " + MyTargetVersion.VERSION);
    }

    public final void a(p3 p3Var, IAdLoadingError iAdLoadingError) {
        InstreamAudioAdListener instreamAudioAdListener = this.f59900j;
        if (instreamAudioAdListener == null) {
            return;
        }
        if (p3Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            instreamAudioAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        if (!p3Var.d()) {
            InstreamAudioAdListener instreamAudioAdListener2 = this.f59900j;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60113r;
            }
            instreamAudioAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        this.f59897g = p3Var;
        l3 l3VarA = l3.a(this, p3Var, this.f59399a, this.f59400b, this.f59896f);
        this.f59898h = l3VarA;
        l3VarA.a(this.f59901k);
        this.f59898h.a(this.f59902l);
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.f59899i;
        if (instreamAudioAdPlayer != null) {
            this.f59898h.a(instreamAudioAdPlayer);
        }
        configureMidpoints(this.f59905o, this.f59904n);
        this.f59900j.onLoad(this);
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
        this.f59900j = null;
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a();
        }
    }

    @Nullable
    public InstreamAudioAdBanner getCurrentBanner() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            return l3Var.b();
        }
        return null;
    }

    @Nullable
    public InstreamAudioAdListener getListener() {
        return this.f59900j;
    }

    public int getLoadingTimeout() {
        return this.f59901k;
    }

    @NonNull
    public float[] getMidPoints() {
        float[] fArr = this.f59903m;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    @Nullable
    public InstreamAudioAdPlayer getPlayer() {
        return this.f59899i;
    }

    public float getVolume() {
        l3 l3Var = this.f59898h;
        return l3Var != null ? l3Var.d() : this.f59902l;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        l3 l3Var = this.f59898h;
        if (l3Var == null) {
            return;
        }
        l3Var.a(context);
    }

    public void handleClick() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.e();
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.c(instreamAdCompanionBanner);
        }
    }

    public void load() {
        if (isLoadCalled()) {
            gb.a("InstreamAudioAd: Doesn't support multiple load");
            a(null, m.f60115t);
        } else {
            m3.a(this.f59399a, this.f59400b, this.f59901k).a(new l.b() { // from class: n5.b
                @Override // com.my.target.l.b
                public final void a(t tVar, m mVar) {
                    this.f95111a.a((p3) tVar, mVar);
                }
            }).a(this.f59400b.a(), this.f59895e);
        }
    }

    public void pause() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.f();
        }
    }

    public void resume() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.h();
        }
    }

    public void setListener(@Nullable InstreamAudioAdListener instreamAudioAdListener) {
        this.f59900j = instreamAudioAdListener;
    }

    public void setLoadingTimeout(int i10) {
        if (i10 < 5) {
            gb.a("InstreamAudioAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.f59901k = 5;
        } else {
            gb.a("InstreamAudioAd: Ad loading timeout set to " + i10 + " seconds");
            this.f59901k = i10;
        }
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a(this.f59901k);
        }
    }

    public void setPlayer(@Nullable InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.f59899i = instreamAudioAdPlayer;
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a(instreamAudioAdPlayer);
        }
    }

    public void setVolume(float f10) {
        if (Float.compare(f10, 0.0f) < 0 || Float.compare(f10, 1.0f) > 0) {
            gb.a("InstreamAudioAd: Unable to set volume" + f10 + ", volume must be in range [0..1]");
            return;
        }
        this.f59902l = f10;
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a(f10);
        }
    }

    public void skip() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.i();
        }
    }

    public void skipBanner() {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.j();
        }
    }

    public void startMidroll(float f10) {
        l3 l3Var = this.f59898h;
        if (l3Var == null) {
            gb.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (l3Var.c() == null) {
            gb.a("InstreamAudioAd: Unable to start ad – player has not set");
        } else {
            this.f59898h.b(f10);
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
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.k();
        }
    }

    public void configureMidpoints(float f10, @Nullable float[] fArr) {
        v5 v5VarA;
        if (f10 <= 0.0f) {
            gb.a("InstreamAudioAd: Midpoints are not configured, duration is not set or <= zero");
            return;
        }
        if (this.f59903m != null) {
            gb.a("InstreamAudioAd: Midpoints already configured");
            return;
        }
        this.f59904n = fArr;
        this.f59905o = f10;
        p3 p3Var = this.f59897g;
        if (p3Var == null || (v5VarA = p3Var.a("midroll")) == null) {
            return;
        }
        float[] fArrA = w5.a(v5VarA, this.f59904n, f10);
        this.f59903m = fArrA;
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a(fArrA);
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner, @NonNull Context context) {
        l3 l3Var = this.f59898h;
        if (l3Var != null) {
            l3Var.a(instreamAdCompanionBanner, context);
        }
    }

    public InstreamAudioAd(int i10, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(i10, "instreamaudioads");
        this.f59901k = 10;
        this.f59902l = 1.0f;
        this.f59895e = context;
        this.f59896f = menuFactory;
        gb.c("Instream audio ad created. Version - " + MyTargetVersion.VERSION);
    }

    private void a(String str) {
        l3 l3Var = this.f59898h;
        if (l3Var == null) {
            gb.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (l3Var.c() == null) {
            gb.a("InstreamAudioAd: Unable to start ad – player has not set");
        } else {
            this.f59898h.a(str);
        }
    }
}
