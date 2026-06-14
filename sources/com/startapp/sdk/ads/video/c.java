package com.startapp.sdk.ads.video;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.InteractionType;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.adsession.media.Position;
import com.iab.omid.library.startio.adsession.media.VastProperties;
import com.ironsource.C4240b4;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.bk;
import com.startapp.sdk.internal.ck;
import com.startapp.sdk.internal.fb;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.jj;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.lj;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.oa;
import com.startapp.sdk.internal.oj;
import com.startapp.sdk.internal.qe;
import com.startapp.sdk.internal.qj;
import com.startapp.sdk.internal.re;
import com.startapp.sdk.internal.rj;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.sj;
import com.startapp.sdk.internal.tj;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.vj;
import com.startapp.sdk.internal.wj;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.xj;
import com.startapp.sdk.internal.yj;
import com.startapp.sdk.internal.za;
import com.startapp.sdk.internal.zb;
import com.startapp.sdk.internal.zj;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.startappsdk.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends za {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f63865t0 = R.id.io_start_video_view;
    public sd N;
    public VideoView O;
    public RelativeLayout P;
    public RelativeLayout Q;
    public ProgressBar R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean X;
    public boolean Y;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f63866a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f63867b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f63868c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f63870e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f63871f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f63872g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f63873h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f63874i0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f63883r0;
    public int W = 1;
    public int Z = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f63869d0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f63875j0 = null;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Handler f63876k0 = new Handler();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final HashMap f63877l0 = new HashMap();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final HashMap f63878m0 = new HashMap();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final HashMap f63879n0 = new HashMap();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final HashMap f63880o0 = new HashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Handler f63881p0 = new Handler();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final uj f63882q0 = new uj(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final vj f63884s0 = new vj(this);

    public final void A() {
        FractionTrackingLink[] fractionTrackingLinkArrC = x().getVideoTrackingDetails().c();
        if (fractionTrackingLinkArrC != null) {
            for (FractionTrackingLink fractionTrackingLink : fractionTrackingLinkArrC) {
                List arrayList = (List) this.f63879n0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f63879n0.put(Integer.valueOf(fractionTrackingLink.g()), arrayList);
                }
                arrayList.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] absoluteTrackingLinkArrA = x().getVideoTrackingDetails().a();
        if (absoluteTrackingLinkArrA != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : absoluteTrackingLinkArrA) {
                List arrayList2 = (List) this.f63880o0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f63880o0.put(Integer.valueOf(absoluteTrackingLink.g()), arrayList2);
                }
                arrayList2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean B() {
        return !this.f63866a0 ? C() && this.T : this.Z >= AdsCommonMetaData.k().F().j() && C() && this.T;
    }

    public final boolean C() {
        sd sdVar = this.N;
        return (sdVar == null || sdVar.f65254g == null) ? false : true;
    }

    public final boolean D() {
        sd sdVar;
        boolean zIsSkippable = x().isSkippable();
        Long unskipLess = x().getUnskipLess();
        if (unskipLess == null || (sdVar = this.N) == null || sdVar.f65254g == null) {
            return zIsSkippable;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return zIsSkippable && timeUnit.toSeconds((long) sdVar.f65255h.getDuration()) > timeUnit.toSeconds(unskipLess.longValue());
    }

    public final boolean E() {
        return this.C > 0 || D() || this.X;
    }

    public final void F() {
        sd sdVar = this.N;
        if (sdVar != null) {
            try {
                boolean z10 = this.S;
                MediaPlayer mediaPlayer = sdVar.f65254g;
                if (mediaPlayer != null) {
                    if (z10) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        vi.a(this.f65681v, true, "videoApi.setSound", this.S ? "OFF" : "ON");
    }

    public final void G() {
        if (this.N == null) {
            return;
        }
        boolean zQ = AdsCommonMetaData.k().F().q();
        String localVideoPath = x().getLocalVideoPath();
        if (localVideoPath != null) {
            sd sdVar = this.N;
            if (sdVar != null) {
                sdVar.a(localVideoPath);
            }
            if (zQ && localVideoPath.endsWith(".temp")) {
                this.f63866a0 = true;
                this.f63868c0 = true;
                this.Z = AdsCommonMetaData.k().F().j();
            }
        } else if (zQ) {
            String videoUrl = x().getVideoUrl();
            re reVar = qe.f65159a;
            if (videoUrl != null && videoUrl.equals(reVar.f65218c)) {
                reVar.f65216a = false;
            }
            sd sdVar2 = this.N;
            if (sdVar2 != null) {
                sdVar2.a(videoUrl);
            }
            this.f63866a0 = true;
            ProgressBar progressBar = this.R;
            if (progressBar == null || !progressBar.isShown()) {
                this.f63876k0.postDelayed(new qj(this), AdsCommonMetaData.k().F().h());
            }
        } else {
            a(VideoMode$VideoFinishedReason.SKIPPED);
        }
        if (this.f63875j0 == null) {
            this.f63875j0 = this.f63866a0 ? "2" : "1";
        }
    }

    public final void H() {
        VideoView videoView;
        vd vdVar;
        this.f63867b0 = true;
        if (this.f63872g0) {
            sd sdVar = this.N;
            if (sdVar != null) {
                sdVar.f65255h.pause();
                return;
            }
            return;
        }
        boolean z10 = u() == 0;
        if (z10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            vi.a(this.f65681v, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            vi.a(this.f65681v, true, "videoApi.setVideoRemainingTimer", 0);
            vi.a(this.f65681v, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(w())));
            vi.a(this.f65681v, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.N != null) {
            if (z10) {
                a((ImageButton) null);
            }
            sd sdVar2 = this.N;
            if (sdVar2 != null) {
                sdVar2.f65255h.start();
                this.f65681v.setBackgroundColor(33554431);
            }
            int iV = v();
            if (z10 && iV > 0 && (vdVar = this.F) != null) {
                float f10 = iV;
                float f11 = this.S ? 0.0f : 1.0f;
                MediaEvents mediaEvents = vdVar.f65399c;
                if (mediaEvents != null) {
                    mediaEvents.start(f10, f11);
                }
            }
            I();
            if (this.f63867b0 && (videoView = this.O) != null) {
                a(videoView);
            }
        }
        this.f65430b.f63976b.setVisibility(0);
        F();
    }

    public final void I() {
        ProgressBar progressBar;
        this.f63876k0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.R;
        if (progressBar2 == null || !progressBar2.isShown() || (progressBar = this.R) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            int i10 = AdsCommonMetaData.k().F().i();
            if (i10 > 0) {
                this.f63870e0 = 100 / i10;
            } else {
                this.f63870e0 = 0;
            }
            y();
            A();
            this.S = x().isVideoMuted() || AdsCommonMetaData.k().F().m().equals("muted");
        } catch (Throwable th2) {
            g9.a(th2);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            zb.a(this.f65429a).a(intent);
            this.V = true;
            b();
        }
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void b() {
        String localVideoPath;
        super.b();
        if (this.f63868c0 && (localVideoPath = x().getLocalVideoPath()) != null && localVideoPath.endsWith(".temp")) {
            new File(localVideoPath).delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r9 = this;
            boolean r0 = r9.f63872g0
            r1 = 0
            if (r0 == 0) goto L9
            r9.i()
            return r1
        L9:
            com.startapp.sdk.internal.sd r0 = r9.N
            if (r0 != 0) goto Le
            return r1
        Le:
            int r0 = r9.u()
            boolean r2 = r9.X
            r3 = 0
            if (r2 == 0) goto L19
            goto L32
        L19:
            int r2 = r9.C
            if (r2 <= 0) goto L1e
            goto L32
        L1e:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r9.w()
            long r5 = r2.toSeconds(r5)
            long r7 = (long) r0
            long r7 = r2.toSeconds(r7)
            long r5 = r5 - r7
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L33
        L32:
            r5 = r3
        L33:
            boolean r0 = r9.E()
            r2 = 1
            if (r0 == 0) goto L75
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L75
            android.widget.ProgressBar r0 = r9.R
            if (r0 == 0) goto L4b
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L4b
            r9.I()
        L4b:
            com.startapp.sdk.ads.video.VideoMode$VideoFinishedReason r0 = com.startapp.sdk.ads.video.VideoMode$VideoFinishedReason.SKIPPED
            r9.a(r0)
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r9.x()
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r0 = r0.getVideoTrackingDetails()
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r0 = r0.p()
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r1 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams
            java.lang.String r3 = r9.f65443o
            int r4 = r9.f63873h0
            int r4 = r9.a(r4)
            int r5 = r9.C
            java.lang.String r6 = r9.f63875j0
            r1.<init>(r4, r5, r3, r6)
            int r3 = r9.f63873h0
            java.lang.String r4 = "skipped"
            r9.a(r3, r1, r4, r0)
            return r2
        L75:
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r9.x()
            boolean r0 = r0.isCloseable()
            if (r0 != 0) goto L85
            boolean r0 = r9.Y
            if (r0 == 0) goto L84
            goto L85
        L84:
            return r2
        L85:
            r9.i()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.c.c():boolean");
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void f() {
        MediaEvents mediaEvents;
        if (!this.f63872g0 && !this.f65429a.isFinishing() && !this.Y && !this.X) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            sd sdVar = this.N;
            if (sdVar != null) {
                sdVar.f65255h.pause();
                vd vdVar = this.F;
                if (vdVar != null && (mediaEvents = vdVar.f65399c) != null) {
                    mediaEvents.pause();
                }
            }
            a(this.f63873h0, new VideoPausedTrackingParams(this.f65443o, a(this.f63873h0), this.C, this.W, pauseOrigin, this.f63875j0), C4240b4.i.f42623e0, x().getVideoTrackingDetails().j());
        }
        sd sdVar2 = this.N;
        if (sdVar2 != null) {
            MediaPlayer mediaPlayer = sdVar2.f65254g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                sdVar2.f65254g = null;
            }
            qe.f65159a.f65217b = null;
            this.N = null;
        }
        I();
        if (this.f63883r0) {
            this.f65429a.unregisterReceiver(this.f63884s0);
            this.f63883r0 = false;
        }
        this.f63881p0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.za, com.startapp.sdk.internal.w7
    public final void g() {
        super.g();
        if (this.f65429a.isFinishing()) {
            return;
        }
        this.f65429a.registerReceiver(this.f63884s0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f63883r0 = true;
        if (this.O == null) {
            Context contextA = x0.a(this.f65429a);
            if (contextA == null) {
                contextA = this.f65429a;
            }
            this.Q = (RelativeLayout) this.f65429a.findViewById(i0.f64668h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(contextA);
            this.O = videoView;
            videoView.setId(f63865t0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(contextA, null, android.R.attr.progressBarStyleInverse);
            this.R = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(contextA);
            this.P = relativeLayout;
            relativeLayout.setId(i0.f64671k);
            this.f65429a.setContentView(this.P);
            this.P.addView(this.O, layoutParams2);
            this.P.addView(this.Q, layoutParams);
            this.P.addView(this.R, layoutParams3);
            if (i0.f64667g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.P;
                TextView textView = new TextView(contextA);
                textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + x().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f65430b.f63976b.setVisibility(4);
        }
        if (this.N == null) {
            this.N = new sd(this.O);
        }
        this.U = false;
        RelativeLayout relativeLayout3 = this.P;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        G();
        if (this.f63872g0) {
            this.f65430b.f63976b.setVisibility(0);
            this.O.setVisibility(4);
        }
        sd sdVar = this.N;
        sdVar.f64332e = new wj(this);
        sdVar.f64329b = new xj(this);
        sdVar.f64331d = new b(this);
        yj yjVar = new yj(this);
        sdVar.f64330c = new zj(this);
        sdVar.f64333f = yjVar;
        this.O.addOnLayoutChangeListener(new oj(this));
        this.f63881p0.post(this.f63882q0);
    }

    @Override // com.startapp.sdk.internal.w7
    public final void h() {
        if (this.V) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.za
    public final void i() {
        if (this.V) {
            return;
        }
        if (this.f63872g0 || this.O == null) {
            a(this.f63873h0, new VideoTrackingParams(a(this.f63873h0), this.C, this.f65443o, this.f63875j0), "postrollClosed", x().getVideoTrackingDetails().l());
            super.i();
        } else {
            sd sdVar = this.N;
            int currentPosition = sdVar != null ? sdVar.f65255h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.C, this.f65443o, this.f63875j0), "closed", x().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.sdk.internal.za
    public final fb l() {
        OverlayActivity overlayActivity = this.f65429a;
        oa oaVar = this.K;
        tj tjVar = new tj(this);
        a aVar = new a(this);
        sj sjVar = new sj(this);
        TrackingParams trackingParams = new TrackingParams(this.f65443o);
        boolean[] zArr = this.f65434f;
        return new mj(overlayActivity, oaVar, oaVar, tjVar, aVar, sjVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.za
    public final long m() {
        Long l10 = this.f65444p;
        return l10 != null ? TimeUnit.SECONDS.toMillis(l10.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().A());
    }

    @Override // com.startapp.sdk.internal.za
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.C, this.f65443o, this.f63875j0);
    }

    @Override // com.startapp.sdk.internal.za
    public final boolean o() {
        return this.f65439k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.za, android.view.View.OnClickListener
    public final void onClick(View view) {
        oa oaVar = this.K;
        oaVar.f65013a.i();
        oaVar.f65013a.b();
    }

    @Override // com.startapp.sdk.internal.za
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.za
    public final void q() {
        this.T = true;
        if (this.f63872g0) {
            a((View) this.f65681v);
            z();
            return;
        }
        vi.a(this.f65681v, true, "videoApi.setClickableVideo", Boolean.valueOf(x().isClickable()));
        vi.a(this.f65681v, true, "videoApi.setMode", "PLAYER");
        vi.a(this.f65681v, true, "videoApi.setCloseable", Boolean.valueOf(x().isCloseable() || this.Y));
        vi.a(this.f65681v, true, "videoApi.setSkippable", Boolean.valueOf(E()));
        if (B()) {
            H();
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final void r() {
        int iL = AdsCommonMetaData.k().F().l();
        ActionTrackingLink[] actionTrackingLinkArrO = x().getVideoTrackingDetails().o();
        a((v() * iL) / 100, new VideoTrackingParams(iL, this.C, this.f65443o, this.f63875j0), "rewarded", actionTrackingLinkArrO);
    }

    public final int u() {
        sd sdVar = this.N;
        if (sdVar == null) {
            return this.f63873h0;
        }
        int currentPosition = sdVar.f65255h.getCurrentPosition();
        if (currentPosition > this.f63873h0) {
            this.f63873h0 = currentPosition;
        }
        return this.f63873h0;
    }

    public final int v() {
        sd sdVar = this.N;
        if (sdVar != null) {
            return sdVar.f65255h.getDuration();
        }
        return -1;
    }

    public final long w() {
        long skippableAfter = x().getSkippableAfter();
        sd sdVar = this.N;
        return (sdVar == null || sdVar.f65254g == null) ? skippableAfter : Math.min(skippableAfter, sdVar.f65255h.getDuration());
    }

    public final VideoAdDetails x() {
        return ((jj) this.f65439k).f64799r;
    }

    public final void y() {
        if (this.f65435g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.X = true;
                this.Y = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.X = true;
                this.Y = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.X = false;
                this.Y = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.X = false;
                this.Y = false;
            } else {
                this.X = false;
                this.Y = false;
            }
        }
    }

    public final void z() {
        String postRollHtml = x().getPostRollHtml();
        if (postRollHtml != null) {
            this.f65681v.setWebViewClient(new bk(this));
            vi.a(this.f65681v, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            return;
        }
        vi.a(this.f65681v, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.N != null));
        vi.a(this.f65681v, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + x().getPostRollType());
        this.f63881p0.postDelayed(new rj(this), AdsCommonMetaData.k().F().b() * 1000);
    }

    public final void b(int i10) {
        List list;
        MediaEvents mediaEvents;
        if (!this.f63871f0 && this.C <= 0 && i10 != 0) {
            this.f63871f0 = true;
            ag agVar = this.f65685z;
            if (agVar != null) {
                agVar.c();
            }
            a(0, new VideoTrackingParams(0, this.C, this.f65443o, this.f63875j0), "impression", x().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(0, this.C, this.f65443o, this.f63875j0), "creativeView", x().getVideoTrackingDetails().b());
            vd vdVar = this.F;
            if (vdVar != null) {
                vdVar.a();
            }
        }
        for (Integer num : this.f63879n0.keySet()) {
            int iIntValue = num.intValue();
            if (i10 > 0 && i10 >= (v() * iIntValue) / 100 && this.f63877l0.get(num) == null) {
                if (this.f63879n0.containsKey(num)) {
                    List list2 = (List) this.f63879n0.get(num);
                    if (list2 != null) {
                        a((v() * iIntValue) / 100, new VideoProgressTrackingParams(iIntValue, this.C, this.f65443o, this.f63875j0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    vd vdVar2 = this.F;
                    if (vdVar2 != null) {
                        if (iIntValue == 25) {
                            MediaEvents mediaEvents2 = vdVar2.f65399c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.firstQuartile();
                            }
                        } else if (iIntValue == 50) {
                            MediaEvents mediaEvents3 = vdVar2.f65399c;
                            if (mediaEvents3 != null) {
                                mediaEvents3.midpoint();
                            }
                        } else if (iIntValue == 75 && (mediaEvents = vdVar2.f65399c) != null) {
                            mediaEvents.thirdQuartile();
                        }
                    }
                }
                this.f63877l0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.f63880o0.keySet()) {
            int iIntValue2 = num2.intValue();
            if (i10 > 0 && i10 >= iIntValue2 && this.f63878m0.get(num2) == null) {
                if (this.f63880o0.containsKey(num2) && (list = (List) this.f63880o0.get(num2)) != null) {
                    a(iIntValue2, new VideoProgressTrackingParams(iIntValue2, this.C, this.f65443o, this.f63875j0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.f63878m0.put(num2, Boolean.TRUE);
            }
        }
        if (i10 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
            s();
        }
        if (this.f63866a0) {
            if (i10 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
                s();
            }
        }
    }

    @Override // com.startapp.sdk.internal.za
    public final void a(WebView webView) {
        super.a(webView);
        webView.setLayerType(1, null);
    }

    @Override // com.startapp.sdk.internal.za
    public final void a(ImageButton imageButton) {
        VideoAdDetails videoAdDetailsX;
        List<VerificationDetails> adVerifications;
        VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia;
        if (!MetaData.E().j0() || (videoAdDetailsX = x()) == null || (adVerifications = videoAdDetailsX.getAdVerifications()) == null) {
            return;
        }
        vd vdVar = new vd(this.f65681v.getContext(), adVerifications, true);
        this.F = vdVar;
        AdSession adSession = vdVar.f65397a;
        if (adSession != null) {
            try {
                AdInformationView adInformationView = this.f65430b.f63976b;
                if (adInformationView != null) {
                    adSession.addFriendlyObstruction(adInformationView, FriendlyObstructionPurpose.OTHER, null);
                }
                if (imageButton != null) {
                    vd vdVar2 = this.F;
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.CLOSE_AD;
                    AdSession adSession2 = vdVar2.f65397a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(imageButton, friendlyObstructionPurpose, null);
                    }
                }
                vd vdVar3 = this.F;
                WebView webView = this.f65681v;
                FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
                AdSession adSession3 = vdVar3.f65397a;
                if (adSession3 != null) {
                    adSession3.addFriendlyObstruction(webView, friendlyObstructionPurpose2, null);
                }
                vd vdVar4 = this.F;
                RelativeLayout relativeLayout = this.Q;
                FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.OTHER;
                AdSession adSession4 = vdVar4.f65397a;
                if (adSession4 != null) {
                    adSession4.addFriendlyObstruction(relativeLayout, friendlyObstructionPurpose3, null);
                }
            } catch (RuntimeException unused) {
            }
            vd vdVar5 = this.F;
            VideoView videoView = this.O;
            AdSession adSession5 = vdVar5.f65397a;
            if (adSession5 != null) {
                adSession5.registerAdView(videoView);
            }
            AdSession adSession6 = this.F.f65397a;
            if (adSession6 != null) {
                adSession6.start();
            }
            vd vdVar6 = this.F;
            boolean zE = E();
            long jW = D() ? w() : 0L;
            if (vdVar6.f65398b == null || !vdVar6.f65401e.compareAndSet(false, true)) {
                return;
            }
            if (zE) {
                vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(jW, true, Position.STANDALONE);
            } else {
                vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
            }
            vdVar6.f65398b.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
        }
    }

    public final void a(View view) {
        vi.a(this.f65681v, true, "videoApi.setVideoFrame", Integer.valueOf(li.b(this.f65429a, view.getLeft())), Integer.valueOf(li.b(this.f65429a, view.getTop())), Integer.valueOf(li.b(this.f65429a, view.getWidth())), Integer.valueOf(li.b(this.f65429a, view.getHeight())));
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        MediaEvents mediaEvents;
        vd vdVar;
        MediaEvents mediaEvents2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (vdVar = this.F) != null && (mediaEvents2 = vdVar.f65399c) != null) {
            mediaEvents2.skipped();
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int iV = v();
            this.f63873h0 = iV;
            b(iV);
            s();
            vd vdVar2 = this.F;
            if (vdVar2 != null && (mediaEvents = vdVar2.f65399c) != null) {
                mediaEvents.complete();
            }
        } else {
            sd sdVar = this.N;
            if (sdVar != null) {
                sdVar.f65255h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            if (x().hasPostRoll()) {
                z();
                this.f65430b.f63976b.setVisibility(0);
            } else {
                b();
            }
            this.f63872g0 = true;
            if (x().hasPostRoll()) {
                a(this.f63873h0, new VideoTrackingParams(a(this.f63873h0), this.C, this.f65443o, this.f63875j0), "postrollImression", x().getVideoTrackingDetails().m());
            }
        }
    }

    public final void a(ck ckVar) {
        VASTErrorCodes vASTErrorCodes;
        g9 g9Var = new g9(h9.f64610e);
        g9Var.f64553d = "Video player error: " + ckVar.f64384a;
        g9Var.f64554e = ckVar.f64385b;
        g9Var.f64556g = a();
        g9Var.a();
        int iOrdinal = ckVar.f64384a.ordinal();
        if (iOrdinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (iOrdinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (iOrdinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        lj ljVar = new lj(this.f63873h0, new VideoTrackingParams(a(this.f63873h0), this.C, this.f65443o, this.f63875j0), x().getVideoUrl(), x().getVideoTrackingDetails().e());
        ljVar.f64892e = vASTErrorCodes;
        gk.a(this.f65429a, ljVar.a());
        if (u() == 0) {
            h0.a(this.f65436h, this.f65443o, this.C, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f63866a0) {
                vf vfVar = (vf) com.startapp.sdk.components.a.a(this.f65429a).G.a();
                int i10 = vfVar.getInt("videoErrorsCount", 0);
                uf ufVarEdit = vfVar.edit();
                int i11 = i10 + 1;
                ufVarEdit.a("videoErrorsCount", Integer.valueOf(i11));
                ufVarEdit.f65346a.putInt("videoErrorsCount", i11);
                ufVarEdit.apply();
            } else if (!ckVar.f64384a.equals(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                vf vfVar2 = (vf) com.startapp.sdk.components.a.a(this.f65429a).G.a();
                int i12 = vfVar2.getInt("videoErrorsCount", 0);
                uf ufVarEdit2 = vfVar2.edit();
                int i13 = i12 + 1;
                ufVarEdit2.a("videoErrorsCount", Integer.valueOf(i13));
                ufVarEdit2.f65346a.putInt("videoErrorsCount", i13);
                ufVarEdit2.apply();
            }
        }
        if ((o() && !this.B) || !x().hasPostRoll()) {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            zb.a(this.f65429a).a(intent);
            this.V = true;
            b();
            return;
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public final int a(int i10) {
        int iV = v();
        if (iV > 0) {
            return (i10 * 100) / iV;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.za
    public final boolean a(String str, boolean z10) {
        String clickUrl;
        ActionTrackingLink[] actionTrackingLinkArrH;
        if (this.f63872g0) {
            clickUrl = x().getPostRollClickThroughUrl();
        } else {
            clickUrl = x().getClickUrl();
        }
        if (!TextUtils.isEmpty(clickUrl)) {
            z10 = true;
            str = clickUrl;
        }
        if (!this.f63872g0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z11 = this.f63872g0;
        if (z11) {
            actionTrackingLinkArrH = x().getVideoTrackingDetails().k();
        } else {
            actionTrackingLinkArrH = x().getVideoTrackingDetails().h();
        }
        a(this.f63873h0, new VideoClickedTrackingParams(this.f65443o, a(this.f63873h0), this.C, z11, this.f63875j0), Reporting.EventType.VIDEO_AD_CLICKED, actionTrackingLinkArrH);
        vd vdVar = this.F;
        if (vdVar != null) {
            InteractionType interactionType = InteractionType.CLICK;
            MediaEvents mediaEvents = vdVar.f65399c;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(interactionType);
            }
        }
        return super.a(str, z10);
    }

    public final void a(boolean z10) {
        ActionTrackingLink[] actionTrackingLinkArrG;
        if (this.N == null) {
            return;
        }
        if (z10) {
            actionTrackingLinkArrG = x().getVideoTrackingDetails().f();
        } else {
            actionTrackingLinkArrG = x().getVideoTrackingDetails().g();
        }
        a(this.N.f65255h.getCurrentPosition(), new VideoTrackingParams(a(this.N.f65255h.getCurrentPosition()), this.C, this.f65443o, this.f63875j0), "sound", actionTrackingLinkArrG);
        vd vdVar = this.F;
        if (vdVar != null) {
            float f10 = z10 ? 0.0f : 1.0f;
            MediaEvents mediaEvents = vdVar.f65399c;
            if (mediaEvents != null) {
                mediaEvents.volumeChange(f10);
            }
        }
    }

    public final void a(int i10, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        gk.a(this.f65429a, new lj(i10, videoTrackingParams, x().getVideoUrl(), videoTrackingLinkArr).a());
    }
}
