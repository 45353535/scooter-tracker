package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.POBVastErrorHandler;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.R$id;
import com.pubmatic.sdk.video.player.POBVastHTMLView;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;
import com.pubmatic.sdk.video.vastmodels.POBCompanion;
import com.pubmatic.sdk.video.vastmodels.POBIcon;
import com.pubmatic.sdk.video.vastmodels.POBLinear;
import com.pubmatic.sdk.video.vastmodels.POBMediaFile;
import com.pubmatic.sdk.video.vastmodels.POBTracking;
import com.pubmatic.sdk.video.vastmodels.POBVast;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.vastparser.POBVastParser;
import com.pubmatic.sdk.video.vastparser.POBVastParserListener;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.ui.POBCustomProductPageView;
import com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener;
import com.taurusx.tax.n.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastPlayer extends FrameLayout implements POBVideoPlayerView.POBVideoPlayerListener, POBProgressiveEventListener {
    public static final int MEDIA_CONTROL_VISIBILITY_DELAY = 200;
    private POBVastErrorHandler A;
    private POBDeviceInfo B;
    private POBProgressiveEventHandler C;
    private POBCompanion D;
    private Queue E;
    private POBIconView F;
    private POBOnSkipOptionUpdateListener G;
    private POBEndCardRendering H;
    private String I;
    private boolean J;
    private final POBVastPlayerConfig K;
    private Linearity L;
    private final MutableContextWrapper M;
    private boolean N;
    private boolean O;
    private String P;
    private boolean Q;
    private POBVastParserListener R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f63083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBNetworkHandler f63084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBTrackerHandler f63085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBVastPlayerListener f63086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBAdSize f63088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBVideoPlayer f63089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f63090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImageButton f63091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ImageButton f63092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private POBVastAd f63093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImageView f63094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f63095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBCTAOverlayData f63096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private POBCTAOverlayHandler f63097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f63098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private POBVastError f63100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private POBMediaFile f63102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View.OnClickListener f63103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f63104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f63105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f63106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TextView f63107z;

    public enum Linearity {
        LINEAR,
        NON_LINEAR,
        ANY
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.P != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.a(pOBVastPlayer.P);
                POBVastPlayer.this.l();
            }
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.f63086e != null) {
                POBVastPlayer.this.f63086e.onClose();
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f63111a;

        c(int i10) {
            this.f63111a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastPlayer.this.f63091j != null && POBVastPlayer.this.f63090i != null && POBVastPlayer.this.J) {
                int i10 = this.f63111a / 1000;
                if (!POBVastPlayer.this.f63099r) {
                    if (POBVastPlayer.this.f63104w > i10) {
                        POBVastPlayer.this.f63090i.setText(String.valueOf(((int) POBVastPlayer.this.f63104w) - i10));
                    } else if (POBVastPlayer.this.f63104w != POBVastPlayer.this.f63105x) {
                        POBVastPlayer.this.f63091j.setVisibility(0);
                        POBVastPlayer.this.f63099r = true;
                        POBVastPlayer.this.f63090i.setVisibility(8);
                        if (!POBVastPlayer.this.f63098q) {
                            POBVastPlayer.this.a(true);
                        }
                    }
                }
            }
            if (POBVastPlayer.this.C != null) {
                POBVastPlayer.this.C.onProgress(this.f63111a / 1000);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == R$id.pob_learn_more_btn) {
                POBVastPlayer.this.h();
                return;
            }
            if (id2 == com.pubmatic.sdk.common.R$id.pob_close_btn) {
                if (POBVastPlayer.this.f63089h != null) {
                    if (POBVastPlayer.this.f63089h.getPlayerState() != POBVideoPlayer.VideoPlayerState.ERROR) {
                        if (POBVastPlayer.this.f63086e != null) {
                            POBVastPlayer.this.f63086e.onSkip();
                            return;
                        }
                        return;
                    } else {
                        if (POBVastPlayer.this.f63086e != null) {
                            POBVastPlayer.this.f63086e.onClose();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (id2 != com.pubmatic.sdk.common.R$id.pob_forward_btn) {
                if (id2 != com.pubmatic.sdk.common.R$id.pob_custom_product_close_btn || POBVastPlayer.this.f63086e == null) {
                    return;
                }
                POBVastPlayer.this.f63086e.onClose();
                return;
            }
            POBVastPlayer.this.n();
            POBVastPlayer.this.p();
            POBVastPlayer.this.m();
            if (POBVastPlayer.this.f63089h != null) {
                POBVastPlayer.this.f63089h.stop();
                POBVastPlayer.this.b();
                if (POBVastPlayer.this.f63096o != null) {
                    POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                    pOBVastPlayer.b(pOBVastPlayer.f63096o.getEndcardDelay());
                }
            }
        }
    }

    class e implements POBVastParserListener {
        e() {
        }

        @Override // com.pubmatic.sdk.video.vastparser.POBVastParserListener
        public void onFailure(POBVast pOBVast, POBVastError pOBVastError) {
            if (pOBVast == null || pOBVast.getAds() == null || pOBVast.getAds().isEmpty()) {
                POBVastPlayer.this.a((POBVastAd) null, pOBVastError);
            } else {
                POBVastPlayer.this.a(pOBVast.getAds().get(0), pOBVastError);
            }
        }

        @Override // com.pubmatic.sdk.video.vastparser.POBVastParserListener
        public void onSuccess(POBVast pOBVast) {
            if (pOBVast.getAds() == null || pOBVast.getAds().isEmpty()) {
                return;
            }
            POBVastPlayer.this.c(pOBVast.getAds().get(0));
        }
    }

    class f implements POBCTAOverlayHandler.POBCTAOverlayListener {
        f() {
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onClick() {
            POBLog.debug("POBVastPlayer", "CTAOverlay clicked.", new Object[0]);
            POBVastPlayer.this.h();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onDismiss() {
            POBLog.debug("POBVastPlayer", "CTAOverlay dismissed.", new Object[0]);
            POBVastPlayer.this.i();
        }

        @Override // com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayHandler.POBCTAOverlayListener
        public void onShow() {
            POBLog.debug("POBVastPlayer", "CTAOverlay presented successfully.", new Object[0]);
            POBUIUtil.bringViewsToFront(POBVastPlayer.this.f63094m);
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVastPlayer.this.f63086e != null) {
                POBVastPlayer.this.f63086e.onDsaInfoIconClick();
            }
        }
    }

    class h implements POBOnSkipOptionUpdateListener {
        h() {
        }

        @Override // com.pubmatic.sdk.webrendering.ui.POBOnSkipOptionUpdateListener
        public void onSkipOptionUpdate(boolean z10) {
            POBVastPlayer.this.a(z10);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBIconView f63121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBIcon f63122b;

        k(POBIconView pOBIconView, POBIcon pOBIcon) {
            this.f63121a = pOBIconView;
            this.f63122b = pOBIcon;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastPlayer.this.F != null) {
                POBVastPlayer.this.c(this.f63121a, this.f63122b);
                POBUIUtil.bringViewsToFront(POBVastPlayer.this.f63094m);
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBIconView f63124a;

        l(POBIconView pOBIconView) {
            this.f63124a = pOBIconView;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBLog.debug("POBVastPlayer", "Removing Icon from UI.", new Object[0]);
            POBVastPlayer.this.removeView(this.f63124a);
        }
    }

    protected POBVastPlayer(@NonNull MutableContextWrapper mutableContextWrapper, @NonNull POBVastPlayerConfig pOBVastPlayerConfig) {
        super(mutableContextWrapper);
        this.f63082a = 0;
        this.f63087f = 3;
        this.f63098q = false;
        this.f63099r = false;
        this.f63101t = true;
        this.f63103v = new d();
        this.E = new LinkedList();
        this.J = true;
        this.L = Linearity.ANY;
        this.N = false;
        this.Q = false;
        this.R = new e();
        this.M = mutableContextWrapper;
        POBNetworkHandler networkHandlerWithBackgroundThreadDelivery = POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery(mutableContextWrapper);
        this.f63084c = networkHandlerWithBackgroundThreadDelivery;
        POBTrackerHandler trackerHandler = POBInstanceProvider.getTrackerHandler(networkHandlerWithBackgroundThreadDelivery);
        this.f63085d = trackerHandler;
        this.A = new POBVastErrorHandler(trackerHandler);
        this.K = pOBVastPlayerConfig;
        this.f63106y = new ArrayList();
        this.f63083b = DesugarCollections.synchronizedMap(new HashMap(4));
    }

    private int a(int i10) {
        return i10 == -1 ? 402 : 405;
    }

    @NonNull
    public static POBVastPlayer createInstance(@NonNull Context context, @NonNull POBVastPlayerConfig pOBVastPlayerConfig) {
        return new POBVastPlayer(new MutableContextWrapper(context.getApplicationContext()), pOBVastPlayerConfig);
    }

    @NonNull
    private Queue<POBCompanion> getCompanions() {
        LinkedList linkedList = new LinkedList();
        POBVastAd pOBVastAd = this.f63093l;
        if (pOBVastAd != null) {
            List<POBCompanion> companions = pOBVastAd.getCompanions();
            if (this.N && companions != null && 2 == companions.size()) {
                linkedList.addAll(companions);
                return linkedList;
            }
            POBCompanion pOBCompanionA = a(this.f63093l);
            if (pOBCompanionA != null) {
                linkedList.add(pOBCompanionA);
            }
        }
        return linkedList;
    }

    @NonNull
    private Map<Object, Object> getVASTMacros() {
        this.f63083b.put("[ADCOUNT]", String.valueOf(this.f63082a));
        this.f63083b.put(z.f66396c, Integer.valueOf(POBUtils.getRandomNumber(10000000, 99999999)));
        return this.f63083b;
    }

    public void destroy() {
        POBLog.debug("POBVastPlayer", "Vast player destroy called!", new Object[0]);
        if (!this.f63106y.contains(POBVastAd.POBVastAdParameter.IMPRESSIONS.name()) && this.f63106y.contains(POBVastCreative.POBEventTypes.LOADED.name())) {
            a(POBVastCreative.POBEventTypes.NOT_USED);
        } else if (this.J) {
            j();
        }
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.destroy();
        }
        o();
        POBEndCardRendering pOBEndCardRendering = this.H;
        if (pOBEndCardRendering != null) {
            pOBEndCardRendering.setListener(null);
        }
        POBIconView pOBIconView = this.F;
        if (pOBIconView != null) {
            pOBIconView.destroy();
            this.F = null;
        }
        removeAllViews();
        this.f63082a = 0;
        this.H = null;
        this.f63086e = null;
        this.R = null;
        this.D = null;
        this.f63100s = null;
    }

    public boolean getSkipabilityEnabled() {
        return this.J;
    }

    @NonNull
    public POBVastPlayerConfig getVastPlayerConfig() {
        return this.K;
    }

    public void load(@NonNull String str) {
        Trace.beginSection("POB Vast Parsing");
        POBVastParser pOBVastParser = new POBVastParser(this.f63084c, this.f63087f, this.R);
        pOBVastParser.setWrapperTimeout(this.K.getWrapperUriTimeout());
        pOBVastParser.parse(str);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onBufferUpdate(int i10) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onClick() {
        h();
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onCompletion() {
        setOnClickListener(null);
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.COMPLETE;
        a(pOBEventTypes);
        b(pOBEventTypes);
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onPlaybackCompleted(this.f63105x);
        }
        TextView textView = this.f63090i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        n();
        p();
        b();
        POBCTAOverlayData pOBCTAOverlayData = this.f63096o;
        if (pOBCTAOverlayData != null) {
            b(pOBCTAOverlayData.getEndcardDelay());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onFailure(int i10, @NonNull String str) {
        a(this.f63093l, new POBVastError(a(i10), str));
        ImageButton imageButton = this.f63091j;
        if (imageButton != null) {
            if (imageButton.getId() == com.pubmatic.sdk.common.R$id.pob_forward_btn || !this.f63091j.isShown()) {
                TextView textView = this.f63090i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                POBUIUtil.updateSkipButtonToCloseButton(this.f63091j);
                this.f63091j.setVisibility(0);
                this.f63099r = true;
                a(true);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onMute(boolean z10) {
        if (z10) {
            POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.MUTE;
            a(pOBEventTypes);
            b(pOBEventTypes);
        } else {
            POBVastCreative.POBEventTypes pOBEventTypes2 = POBVastCreative.POBEventTypes.UNMUTE;
            a(pOBEventTypes2);
            b(pOBEventTypes2);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onPause() {
        POBLog.debug("POBVastPlayer", "Playback paused.", new Object[0]);
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.PAUSE;
        a(pOBEventTypes);
        b(pOBEventTypes);
    }

    @Override // com.pubmatic.sdk.video.player.POBProgressiveEventListener
    public void onProgressReached(@NonNull Map<POBVastCreative.POBEventTypes, List<String>> map) {
        for (Map.Entry<POBVastCreative.POBEventTypes, List<String>> entry : map.entrySet()) {
            POBVastCreative.POBEventTypes key = entry.getKey();
            POBLog.debug("POBVastPlayer", "Event occurred: %s", key.name());
            List<String> value = entry.getValue();
            b(key);
            if (value != null && this.f63093l != null) {
                a(value);
                this.f63106y.add(key.name());
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onProgressUpdate(int i10) {
        post(new c(i10));
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView) {
        this.f63082a++;
        long mediaDuration = pOBVideoPlayerView.getMediaDuration() / 1000;
        this.f63105x = mediaDuration;
        if (this.J) {
            this.f63104w = POBVastPlayerUtil.getSkipOffset(this.f63104w, this.K, mediaDuration);
            POBLog.debug("POBVastPlayer", "Video skipOffset: " + this.f63104w, new Object[0]);
        }
        POBLog.debug("POBVastPlayer", "Video duration: %s seconds, skip option will be available after %s seconds.", Long.valueOf(this.f63105x), Double.valueOf(this.f63104w));
        Trace.endSection();
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onReadyToPlay(this.f63093l, (float) this.f63104w);
        }
        a(POBVastCreative.POBEventTypes.LOADED);
        a(this.f63105x);
        Queue<POBCompanion> companions = getCompanions();
        this.E = companions;
        if (companions.size() <= 1) {
            this.P = POBVastPlayerUtil.getCustomProductPageClickUrl(this.f63093l, this.f63095n);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onResume() {
        POBLog.debug("POBVastPlayer", "Playback started.", new Object[0]);
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.RESUME;
        a(pOBEventTypes);
        b(pOBEventTypes);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onStart() {
        POBCTAOverlayData pOBCTAOverlayData;
        POBLog.debug("POBVastPlayer", "Playback started.", new Object[0]);
        b(true);
        POBVastAd.POBVastAdParameter pOBVastAdParameter = POBVastAd.POBVastAdParameter.IMPRESSIONS;
        if (this.f63093l != null) {
            POBLog.debug("POBVastPlayer", "Event occurred: %s", pOBVastAdParameter.name());
            a(this.f63093l.getCombinedList(pOBVastAdParameter));
            this.f63106y.add(pOBVastAdParameter.name());
            a(POBVastCreative.POBEventTypes.START);
            if (this.f63086e != null && (this.f63093l.getCreative() instanceof POBLinear)) {
                this.f63086e.onVideoStarted(this.f63105x, this.K.isPlayOnMute() ? 0.0f : 1.0f);
            }
            s();
            POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
            if (pOBCTAOverlayHandler == null || (pOBCTAOverlayData = this.f63096o) == null) {
                return;
            }
            pOBCTAOverlayHandler.showWithDelay(pOBCTAOverlayData.getDelay());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (30 == Build.VERSION.SDK_INT && i10 == 0) {
            bringToFront();
        }
    }

    public void pause() {
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer == null || pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.PLAYING || this.f63089h.getPlayerState() == POBVideoPlayer.VideoPlayerState.STOPPED) {
            return;
        }
        this.f63089h.pause();
    }

    public void play() {
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer != null) {
            if ((pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.PAUSED && this.f63089h.getPlayerState() != POBVideoPlayer.VideoPlayerState.LOADED) || this.f63089h.getPlayerState() == POBVideoPlayer.VideoPlayerState.STOPPED || this.f63089h.getPlayerState() == POBVideoPlayer.VideoPlayerState.COMPLETE) {
                return;
            }
            this.f63089h.play();
        }
    }

    public void setAutoPlayOnForeground(boolean z10) {
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.setAutoPlayOnForeground(z10);
        }
    }

    public void setBaseContext(@NonNull Context context) {
        this.M.setBaseContext(context);
    }

    public void setBidBundleId(@Nullable String str) {
        this.f63095n = str;
    }

    public void setCTAOverlayData(@NonNull POBCTAOverlayData pOBCTAOverlayData) {
        this.f63096o = pOBCTAOverlayData;
    }

    public void setDeviceInfo(@NonNull POBDeviceInfo pOBDeviceInfo) {
        this.B = pOBDeviceInfo;
    }

    public void setEnableLearnMoreButton(boolean z10) {
        this.f63101t = z10;
    }

    public void setEndCardSize(@Nullable POBAdSize pOBAdSize) {
        this.f63088g = pOBAdSize;
    }

    public void setFSCEnabled(boolean z10) {
        this.O = z10;
    }

    public void setLinearity(Linearity linearity) {
        this.L = linearity;
    }

    public void setMaxWrapperThreshold(int i10) {
        this.f63087f = i10;
    }

    public void setOnSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.G = pOBOnSkipOptionUpdateListener;
    }

    public void setPlacementType(@NonNull String str) {
        this.I = str;
        this.N = "interstitial".equals(str);
    }

    public void setShowEndCardOnSkip(boolean z10) {
        this.f63098q = z10;
    }

    public void setSkipabilityEnabled(boolean z10) {
        this.J = z10;
    }

    public void setVastPlayerListener(@Nullable POBVastPlayerListener pOBVastPlayerListener) {
        this.f63086e = pOBVastPlayerListener;
    }

    public void setWatermark(@Nullable String str) {
        if (str != null) {
            this.f63094m = POBUIUtil.createWatermarkView(this.M, str);
        }
    }

    private void d() {
        TextView textViewCreateSkipDurationTextView = POBUIUtil.createSkipDurationTextView(getContext(), com.pubmatic.sdk.webrendering.R$id.pob_skip_duration_timer);
        this.f63090i = textViewCreateSkipDurationTextView;
        addView(textViewCreateSkipDurationTextView, POBUIUtil.getLayoutParamsForTopRightPosition(getContext()));
    }

    private void e() {
        if (this.J) {
            d();
            c();
        }
    }

    private void f() {
        ImageView imageView = this.f63094m;
        if (imageView != null) {
            addView(imageView);
        }
    }

    private void g() {
        POBVastAd pOBVastAd;
        if (this.f63096o != null && (pOBVastAd = this.f63093l) != null && pOBVastAd.getClosestClickThroughURL() != null) {
            POBCTAOverlayData pOBCTAOverlayDataCopyClickUrl = POBCTAOverlayData.copyClickUrl(this.f63096o, this.f63093l.getClosestClickThroughURL());
            this.f63096o = pOBCTAOverlayDataCopyClickUrl;
            if (POBCTAOverlayHandler.isCTAOverlayValid(pOBCTAOverlayDataCopyClickUrl)) {
                POBCTAOverlayHandler pOBCTAOverlayHandler = new POBCTAOverlayHandler(this, this.f63096o, true ^ this.N);
                this.f63097p = pOBCTAOverlayHandler;
                pOBCTAOverlayHandler.setCTAOverlayListener(new f());
                return;
            }
        }
        POBLog.debug("POBVastPlayer", "CTAOverlay failed to present with error: %s", "CTA overlay data invalid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        b(this.f63093l);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            if (this.Q) {
                o();
            } else {
                pOBCTAOverlayHandler.hide();
            }
        }
    }

    private void j() {
        POBVideoPlayer pOBVideoPlayer;
        List list = this.f63106y;
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.CLOSE_LINEAR;
        if (list.contains(pOBEventTypes.name())) {
            return;
        }
        List list2 = this.f63106y;
        POBVastCreative.POBEventTypes pOBEventTypes2 = POBVastCreative.POBEventTypes.CLOSE;
        if (list2.contains(pOBEventTypes2.name()) || this.f63093l == null || (pOBVideoPlayer = this.f63089h) == null) {
            return;
        }
        if (!this.f63098q && pOBVideoPlayer.getPlayerState() != POBVideoPlayer.VideoPlayerState.COMPLETE) {
            m();
        }
        if (this.f63093l.getCombinedTrackingEventList(pOBEventTypes).isEmpty()) {
            a(pOBEventTypes2);
        } else {
            a(pOBEventTypes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onEndCardWillLeaveApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f63093l != null) {
            POBVastAd.POBVastAdParameter pOBVastAdParameter = POBVastAd.POBVastAdParameter.CLICKTRACKING;
            POBLog.debug("POBVastPlayer", "Event occurred: %s", pOBVastAdParameter.name());
            List<String> combinedList = this.f63093l.getCombinedList(pOBVastAdParameter);
            if (combinedList.isEmpty()) {
                POBLog.debug("POBVastPlayer", "Empty click tracker URL list found at click event. Skipping tracker execution.", new Object[0]);
            } else {
                a(combinedList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        POBVastCreative.POBEventTypes pOBEventTypes = POBVastCreative.POBEventTypes.SKIP;
        b(pOBEventTypes);
        a(pOBEventTypes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.hide();
        }
    }

    private void o() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.cleanUp();
            this.f63097p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.invalidateTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            return pOBCTAOverlayHandler.isShowWithDelayInitiated();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.shouldForwardClickEvent();
        }
    }

    private void s() {
        POBVastAd pOBVastAd = this.f63093l;
        if (pOBVastAd != null) {
            a(pOBVastAd.getClosestIcon());
        }
    }

    private boolean t() {
        return this.E.size() > 1 || !POBUtils.isNullOrEmpty(this.P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        POBCustomProductPageView pOBCustomProductPageView = new POBCustomProductPageView(this.M.getBaseContext());
        pOBCustomProductPageView.setInstallButtonClickListener(new a());
        pOBCustomProductPageView.setCloseBtnClickListener(new b());
        addView(pOBCustomProductPageView);
    }

    private void v() {
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer != null) {
            pOBVideoPlayer.setPrepareTimeout(this.K.getMediaUriTimeout());
            this.f63089h.playOnMute(this.K.isPlayOnMute());
        }
    }

    class i implements com.pubmatic.sdk.video.player.a {
        i() {
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void a() {
            POBVastPlayer.this.Q = true;
            if (POBVastPlayer.this.D != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.a(pOBVastPlayer.D.getTrackingEventUrls(POBVastCreative.POBEventTypes.CREATIVE_VIEW));
            }
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void b() {
            POBVastPlayer.this.h();
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void c() {
            if (POBVastPlayer.this.D == null) {
                POBVastPlayer.this.h();
                return;
            }
            if (POBUtils.isNullOrEmpty(POBVastPlayer.this.D.getClickThroughURL())) {
                POBLog.debug("POBVastPlayer", "Click through URL is not available in matching companion.", new Object[0]);
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.b(pOBVastPlayer.f63093l);
            } else {
                POBVastPlayer pOBVastPlayer2 = POBVastPlayer.this;
                pOBVastPlayer2.a(pOBVastPlayer2.D.getClickThroughURL());
            }
            List<String> clickTrackers = POBVastPlayer.this.D.getClickTrackers();
            if (clickTrackers != null && !clickTrackers.isEmpty()) {
                POBVastPlayer.this.a(clickTrackers);
            } else {
                POBLog.debug("POBVastPlayer", "Click trackers are not available in matching companion.", new Object[0]);
                POBVastPlayer.this.l();
            }
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void d() {
            if (!POBVastPlayer.this.q()) {
                POBVastPlayer.this.n();
                POBVastPlayer.this.p();
            }
            if (POBVastPlayer.this.H == null || POBVastPlayer.this.E.isEmpty()) {
                POBVastPlayer.this.u();
                POBUIUtil.bringViewsToFront(POBVastPlayer.this.f63092k, POBVastPlayer.this.f63094m);
            } else {
                POBVastPlayer.this.b();
            }
            if (POBVastPlayer.this.f63097p == null || POBVastPlayer.this.q()) {
                return;
            }
            POBVastPlayer.this.f63097p.show();
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void onClose() {
            if (POBVastPlayer.this.f63086e != null) {
                POBVastPlayer.this.f63086e.onClose();
            }
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void onEndCardWillLeaveApp() {
            POBVastPlayer.this.k();
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void a(String str, boolean z10) {
            List<String> clickTrackers;
            if (POBVastPlayer.this.D != null && (clickTrackers = POBVastPlayer.this.D.getClickTrackers()) != null) {
                POBVastPlayer.this.a(clickTrackers);
            }
            if (z10) {
                POBVastPlayer.this.r();
            } else {
                POBVastPlayer.this.a(str);
            }
        }

        @Override // com.pubmatic.sdk.video.player.a
        public void a(POBVastError pOBVastError) {
            POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
            pOBVastPlayer.a(pOBVastPlayer.f63093l, pOBVastError);
        }
    }

    class j implements POBVastHTMLView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBIcon f63119a;

        j(POBIcon pOBIcon) {
            this.f63119a = pOBIcon;
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void a() {
            POBLog.debug("POBVastPlayer", "Icon loaded.", new Object[0]);
            if (POBVastPlayer.this.F != null) {
                POBVastPlayer pOBVastPlayer = POBVastPlayer.this;
                pOBVastPlayer.b(pOBVastPlayer.F, this.f63119a);
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void a(String str) {
            POBLog.debug("POBVastPlayer", "Icon clicked.", new Object[0]);
            List<String> clickTrackers = this.f63119a.getClickTrackers();
            if (clickTrackers != null) {
                POBVastPlayer.this.a(clickTrackers);
            }
            POBLog.debug("POBVastPlayer", "Opening landing page of icon with url: %s", str);
            if (POBVastPlayer.this.f63086e != null) {
                POBVastPlayer.this.f63086e.onIndustryIconClick(str);
            }
        }

        @Override // com.pubmatic.sdk.video.player.POBVastHTMLView.b
        public void a(POBVastError pOBVastError) {
            POBLog.debug("POBVastPlayer", "Unable to render Icon due to invalid details.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBVastAd pOBVastAd) {
        POBVastError pOBVastError;
        Linearity linearity;
        POBLog.debug("POBVastPlayer", "Vast player started rendering.", new Object[0]);
        this.f63093l = pOBVastAd;
        this.f63083b.put("[ADSERVINGID]", pOBVastAd.getAdServingId());
        this.f63083b.put("[PODSEQUENCE]", String.valueOf(this.f63093l.getAdSequence()));
        this.f63106y = new ArrayList();
        POBVastCreative creative = pOBVastAd.getCreative();
        if (creative != null) {
            if (creative.getVastCreativeType() == POBVastCreative.CreativeType.LINEAR && ((linearity = this.L) == Linearity.LINEAR || linearity == Linearity.ANY)) {
                a((POBLinear) creative);
                pOBVastError = null;
            } else {
                pOBVastError = new POBVastError(201, "Expected linearity not found.");
            }
        } else {
            pOBVastError = new POBVastError(400, "No ad creative found.");
        }
        if (pOBVastError != null) {
            a(this.f63093l, pOBVastError);
        }
    }

    private void b(POBVastCreative.POBEventTypes pOBEventTypes) {
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onVideoEventOccurred(pOBEventTypes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        POBCTAOverlayHandler pOBCTAOverlayHandler = this.f63097p;
        if (pOBCTAOverlayHandler != null) {
            pOBCTAOverlayHandler.showWithDelay(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBVastError pOBVastError;
        POBLog.debug("POBVastPlayer", "Rendering end-card.", new Object[0]);
        if ("interstitial".equals(this.I)) {
            POBMraidEndCardView pOBMraidEndCardView = new POBMraidEndCardView(this.M.getBaseContext(), t());
            this.H = pOBMraidEndCardView;
            pOBMraidEndCardView.setFSCEnabled(this.O);
            this.H.setSkipAfter(this.K.getEndCardSkipAfter());
            this.H.setOnSkipOptionUpdateListener(new h());
        } else {
            POBEndCardView pOBEndCardView = new POBEndCardView(getContext());
            this.H = pOBEndCardView;
            pOBEndCardView.setFSCEnabled(this.O);
        }
        this.H.setLearnMoreTitle(POBUIUtil.getLocalizedStringForKey(getContext(), "openwrap_learn_more_title", "Learn More"));
        this.H.setListener(new i());
        if (this.f63093l != null) {
            if (this.E.isEmpty() && (pOBVastError = this.f63100s) != null) {
                a(this.f63093l, pOBVastError);
            }
            POBCompanion pOBCompanion = (POBCompanion) this.E.poll();
            this.D = pOBCompanion;
            if (pOBCompanion != null) {
                POBLog.debug("POBVastPlayer", "Rendering Companion End Card: %s", pOBCompanion);
            }
            this.H.render(this.D);
            addView(this.H.getView());
            b(false);
            ImageButton imageButton = this.f63091j;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            ImageButton imageButton2 = this.f63092k;
            if (imageButton2 != null) {
                a(imageButton2);
            }
            POBIconView pOBIconView = this.F;
            if (pOBIconView != null) {
                a(pOBIconView);
            }
            POBUIUtil.bringViewsToFront(this.f63092k, this.F, this.f63094m);
        }
    }

    private void a(POBVastCreative.POBEventTypes pOBEventTypes) {
        if (this.f63093l != null) {
            POBLog.debug("POBVastPlayer", "Event occurred: %s", pOBEventTypes.name());
            a(this.f63093l.getCombinedTrackingEventList(pOBEventTypes));
            this.f63106y.add(pOBEventTypes.name());
            return;
        }
        POBLog.debug("POBVastPlayer", "Selected Vast Ad is null", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        this.f63085d.sendTrackers(POBTrackerHandler.sanitizeURLScheme((List<String>) list, POBInstanceProvider.getSdkConfig().isRequestSecureCreative()), getVASTMacros());
    }

    private void c() {
        if (this.f63098q) {
            this.f63091j = POBUIUtil.createSkipButton(getContext(), com.pubmatic.sdk.common.R$id.pob_forward_btn, R$drawable.pob_ic_forward_24);
        } else {
            this.f63091j = POBUIUtil.createSkipButton(getContext(), com.pubmatic.sdk.common.R$id.pob_close_btn, com.pubmatic.sdk.common.R$drawable.pob_ic_close_black_24dp);
        }
        this.f63091j.setVisibility(8);
        this.f63099r = false;
        this.f63091j.setOnClickListener(this.f63103v);
        addView(this.f63091j);
    }

    private void a(POBLinear pOBLinear) {
        POBVastError pOBVastError;
        List<POBMediaFile> mediaFiles = pOBLinear.getMediaFiles();
        if (mediaFiles != null && !mediaFiles.isEmpty()) {
            this.f63104w = pOBLinear.getSkipOffset();
            boolean zIsWiFiConnected = POBInstanceProvider.getNetworkMonitor(getContext().getApplicationContext()).isWiFiConnected();
            int scaleFactor = POBVastPlayerUtil.getScaleFactor(getContext().getApplicationContext());
            int bitRate = POBVastPlayerUtil.getBitRate(scaleFactor == 1, zIsWiFiConnected);
            POBLog.info("POBVastPlayer", "Expected bitrate for %s resolution & %s network is %d", scaleFactor == 1 ? Constants.LOW : Constants.HIGH, zIsWiFiConnected ? X3.f42018b : "non-wifi", Integer.valueOf(bitRate));
            POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr = POBVideoPlayer.SUPPORTED_MEDIA_TYPE;
            POBDeviceInfo pOBDeviceInfo = this.B;
            POBMediaFile pOBMediaFileFilterMediaFiles = POBVastPlayerUtil.filterMediaFiles(mediaFiles, supportedMediaTypeArr, bitRate, pOBDeviceInfo.screenWidth, pOBDeviceInfo.screenHeight);
            this.f63102u = pOBMediaFileFilterMediaFiles;
            if (pOBMediaFileFilterMediaFiles != null) {
                POBLog.info("POBVastPlayer", "Selected media file: %s from media files: %s, for bitrate: %d & size: %s & supported mimes: %s", pOBMediaFileFilterMediaFiles.toString(), mediaFiles.toString(), Integer.valueOf(bitRate), this.f63102u.getWidth() + "x" + this.f63102u.getHeight(), Arrays.toString(supportedMediaTypeArr));
                String mediaFileURL = this.f63102u.getMediaFileURL();
                POBLog.debug("POBVastPlayer", "Selected media file: %s", mediaFileURL);
                this.f63089h = a(getContext());
                v();
                e();
                a();
                g();
                f();
                if (mediaFileURL != null) {
                    Trace.endSection();
                    Trace.beginSection("POB Rendering");
                    this.f63089h.load(mediaFileURL);
                    pOBVastError = null;
                } else {
                    pOBVastError = new POBVastError(403, "No supported media file found for linear ad.");
                }
                b(false);
            } else {
                pOBVastError = new POBVastError(403, "No supported media file found for linear ad.");
            }
        } else {
            pOBVastError = new POBVastError(401, "Media file not found for linear ad.");
        }
        if (pOBVastError != null) {
            a(this.f63093l, pOBVastError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBIconView pOBIconView, POBIcon pOBIcon) {
        long duration = ((long) pOBIcon.getDuration()) * 1000;
        if (duration > 0) {
            new Handler().postDelayed(new l(pOBIconView), duration);
        }
        a(pOBIconView, pOBIcon);
        List<String> viewTrackers = pOBIcon.getViewTrackers();
        if (viewTrackers != null) {
            a(viewTrackers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBVastAd pOBVastAd) {
        if (pOBVastAd != null) {
            a(pOBVastAd.getClosestClickThroughURL());
        }
    }

    private void b(boolean z10) {
        POBVideoPlayer pOBVideoPlayer = this.f63089h;
        if (pOBVideoPlayer != null) {
            POBPlayerController controllerView = pOBVideoPlayer.getControllerView();
            if (controllerView != null) {
                if (z10) {
                    com.pubmatic.sdk.video.player.b.b(controllerView, 200);
                } else {
                    com.pubmatic.sdk.video.player.b.a(controllerView, 200);
                }
            }
            TextView textView = this.f63107z;
            if (textView != null) {
                if (z10) {
                    com.pubmatic.sdk.video.player.b.b(textView, 200);
                } else {
                    com.pubmatic.sdk.video.player.b.a(textView, 200);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBIconView pOBIconView, POBIcon pOBIcon) {
        new Handler().postDelayed(new k(pOBIconView, pOBIcon), ((long) pOBIcon.getOffset()) * 1000);
    }

    private void a() {
        ImageButton imageButtonCreateAdInfoIconButton = POBUIUtil.createAdInfoIconButton(this.M, com.pubmatic.sdk.common.R$id.pob_ad_info_icon_btn, com.pubmatic.sdk.common.R$drawable.pob_ad_info_icon, this.N, false);
        this.f63092k = imageButtonCreateAdInfoIconButton;
        imageButtonCreateAdInfoIconButton.setOnClickListener(new g());
        addView(this.f63092k);
    }

    private POBVideoPlayerView a(Context context) {
        POBVideoPlayerView pOBVideoPlayerView = new POBVideoPlayerView(context);
        pOBVideoPlayerView.setListener(this);
        pOBVideoPlayerView.setFSCEnabled(this.O);
        POBPlayerController pOBVideoPlayerController = new POBVideoPlayerController(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        pOBVideoPlayerView.setControllerView(pOBVideoPlayerController, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(pOBVideoPlayerView, layoutParams2);
        a(pOBVideoPlayerView);
        return pOBVideoPlayerView;
    }

    private void a(POBVideoPlayerView pOBVideoPlayerView) {
        if (this.f63101t) {
            TextView textViewA = com.pubmatic.sdk.video.player.b.a(getContext(), R$id.pob_learn_more_btn, POBUIUtil.getLocalizedStringForKey(getContext(), "openwrap_learn_more_title", "Learn More"), getResources().getColor(R$color.pob_controls_background_color));
            this.f63107z = textViewA;
            textViewA.setOnClickListener(this.f63103v);
            pOBVideoPlayerView.addView(this.f63107z);
        }
    }

    private void a(long j10) {
        this.C = new POBProgressiveEventHandler(this);
        a(((int) (25 * j10)) / 100, POBVastCreative.POBEventTypes.FIRST_QUARTILE);
        a(((int) (50 * j10)) / 100, POBVastCreative.POBEventTypes.MID_POINT);
        a(((int) (75 * j10)) / 100, POBVastCreative.POBEventTypes.THIRD_QUARTILE);
        POBVastAd pOBVastAd = this.f63093l;
        if (pOBVastAd != null) {
            for (POBXMLNodeListener pOBXMLNodeListener : pOBVastAd.getCombinedObjectList(POBVastAd.POBVastAdParameter.PROGRESS_TRACKING_EVENT)) {
                if (pOBXMLNodeListener instanceof POBTracking) {
                    POBTracking pOBTracking = (POBTracking) pOBXMLNodeListener;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pOBTracking.getUrl());
                    this.C.addProgressUrls(Integer.valueOf((int) POBUtils.convertToSeconds(String.valueOf(j10), pOBTracking.getOffset())), POBVastCreative.POBEventTypes.PROGRESS, arrayList);
                }
            }
        }
    }

    private void a(int i10, POBVastCreative.POBEventTypes pOBEventTypes) {
        POBVastAd pOBVastAd = this.f63093l;
        if (pOBVastAd == null || this.C == null) {
            return;
        }
        this.C.addProgressUrls(Integer.valueOf(i10), pOBEventTypes, pOBVastAd.getCombinedTrackingEventList(pOBEventTypes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBVastAd pOBVastAd, POBVastError pOBVastError) {
        if (pOBVastAd != null) {
            this.A.executeVastErrorsWithMacros(pOBVastAd.getCombinedList(POBVastAd.POBVastAdParameter.ERRORS), getVASTMacros(), pOBVastError, POBVastPlayerUtil.generateErrorQueryParams(getContext(), this.B, this.f63102u));
        } else {
            this.A.executeVastErrors(null, pOBVastError);
        }
        Trace.endSection();
        POBError pOBErrorConvertToPOBError = POBVastErrorHandler.convertToPOBError(pOBVastError);
        if (pOBErrorConvertToPOBError != null) {
            a(pOBErrorConvertToPOBError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.G;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z10);
        }
    }

    private void a(POBError pOBError) {
        POBLog.error("POBVastPlayer", pOBError.toString(), new Object[0]);
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onFailedToPlay(pOBError);
        }
    }

    private void a(View view) {
        if (!this.N || view.getLayoutParams() == null) {
            return;
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 80;
    }

    private POBCompanion a(POBVastAd pOBVastAd) {
        List<POBCompanion> combinedCompanions = pOBVastAd.getCombinedCompanions();
        if (combinedCompanions != null && !combinedCompanions.isEmpty()) {
            float width = getWidth();
            float height = getHeight();
            POBAdSize pOBAdSize = this.f63088g;
            if (pOBAdSize != null) {
                width = POBUtils.convertDpToPixelWithFloatPrecession(pOBAdSize.getAdWidth());
                height = POBUtils.convertDpToPixelWithFloatPrecession(this.f63088g.getAdHeight());
            }
            POBCompanion suitableEndCardCompanion = POBVastPlayerUtil.getSuitableEndCardCompanion(combinedCompanions, width, height);
            if (suitableEndCardCompanion == null) {
                this.f63100s = new POBVastError(601, "Couldn't find suitable end-card.");
                return suitableEndCardCompanion;
            }
            POBLog.debug("POBVastPlayer", "Selected end card - " + suitableEndCardCompanion, new Object[0]);
            return suitableEndCardCompanion;
        }
        this.f63100s = new POBVastError(603, "No companion found as an end-card.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        POBVastPlayerListener pOBVastPlayerListener = this.f63086e;
        if (pOBVastPlayerListener != null) {
            pOBVastPlayerListener.onOpenLandingPage(str);
        }
    }

    private void a(POBIcon pOBIcon) {
        if (pOBIcon != null && pOBIcon.getResource() != null && pOBIcon.getOffset() <= this.f63105x && !POBUtils.isNullOrEmpty(pOBIcon.getResource().getResource())) {
            POBLog.debug("POBVastPlayer", "Rendering icon for program %s after offset %s for duration %s", pOBIcon.getProgram(), Integer.valueOf(pOBIcon.getOffset()), Integer.valueOf(pOBIcon.getDuration()));
            POBIconView pOBIconView = new POBIconView(getContext());
            this.F = pOBIconView;
            pOBIconView.setId(R$id.pob_industry_icon_one);
            this.F.setListener(new j(pOBIcon));
            this.F.a(pOBIcon);
            return;
        }
        POBLog.debug("POBVastPlayer", "Icon resource is unavailable.", new Object[0]);
    }

    private void a(POBIconView pOBIconView, POBIcon pOBIcon) {
        addView(pOBIconView, com.pubmatic.sdk.video.player.b.a(getContext(), pOBIcon.getContentWidth(), pOBIcon.getContentHeight(), this.f63092k, this.N));
    }
}
