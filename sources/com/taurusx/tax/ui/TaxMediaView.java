package com.taurusx.tax.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.taurusx.tax.R;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastAbsoluteProgressTracker;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastFractionalProgressTracker;
import com.taurusx.tax.w.c.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class TaxMediaView extends RelativeLayout implements TextureView.SurfaceTextureListener {
    public static final String O = "TaxMediaView";
    public static final int P = 10;
    public boolean A;
    public MediaPlayer B;
    public SurfaceTexture C;
    public TextureView D;
    public Surface E;
    public MediaEvents F;
    public AdSession G;
    public boolean H;
    public ViewGroup I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public com.taurusx.tax.w.s.s N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f66800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f66804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f66806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f66807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f66808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f66809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f66810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f66811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f66812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f66813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f66814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f66815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f66816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f66817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f66818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f66819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f66820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<VastAbsoluteProgressTracker> f66821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f66822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<VastFractionalProgressTracker> f66823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public VastConfig f66824z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (TaxMediaView.this.f66810l) {
                if (!TaxMediaView.this.f66809k && TaxMediaView.this.B != null && TaxMediaView.this.B.isPlaying() && TaxMediaView.this.f66816r != null) {
                    TaxMediaView.this.f66816r.sendEmptyMessage(TaxMediaView.this.B.getCurrentPosition());
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class c implements MediaPlayer.OnCompletionListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (TaxMediaView.this.f66809k) {
                return;
            }
            TaxMediaView.this.u();
            TaxMediaView.this.f66809k = true;
            TaxMediaView taxMediaView = TaxMediaView.this;
            taxMediaView.f66807i = taxMediaView.f66820v;
            TaxMediaView.this.B.seekTo(TaxMediaView.this.f66807i);
            LogUtil.v(TaxMediaView.O, "TaxMediaView onCompletion");
            if (TaxMediaView.this.f66822x != null) {
                TaxMediaView.this.f66822x.onPlayEnd();
            }
        }
    }

    public interface g {
        void onPlayEnd();

        void onPlayFailed();

        void onPlayProgress(int i10);

        void onPlayStart();

        void onProgress(int i10, int i11);

        void w();

        void y();

        void z();
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TaxMediaView.this.D.isHardwareAccelerated() || TaxMediaView.this.f66822x == null) {
                return;
            }
            TaxMediaView.this.f66822x.onPlayFailed();
        }
    }

    public class o implements MediaPlayer.OnErrorListener {
        public o() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            if (TaxMediaView.this.f66822x == null) {
                return true;
            }
            TaxMediaView.this.f66822x.onPlayFailed();
            return true;
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TaxMediaView.this.f66809k) {
                return;
            }
            TaxMediaView.this.f66808j = !r4.f66808j;
            if (TaxMediaView.this.f66808j) {
                TaxMediaView.this.f66806h.setBackgroundResource(R.drawable.taurusx_inner_video_mute);
                if (TaxMediaView.this.B != null) {
                    TaxMediaView.this.B.setVolume(0.0f, 0.0f);
                    com.taurusx.tax.s.z.z(TaxMediaView.this.F, TaxMediaView.this.G, 0.0f, TaxMediaView.this.N);
                    if (TaxMediaView.this.f66822x != null) {
                        TaxMediaView.this.f66822x.y();
                        return;
                    }
                    return;
                }
                return;
            }
            TaxMediaView.this.f66806h.setBackgroundResource(R.drawable.taurusx_inner_video_no_mute);
            if (TaxMediaView.this.B != null) {
                TaxMediaView.this.B.setVolume(1.0f, 1.0f);
                com.taurusx.tax.s.z.z(TaxMediaView.this.F, TaxMediaView.this.G, 1.0f, TaxMediaView.this.N);
                if (TaxMediaView.this.f66822x != null) {
                    TaxMediaView.this.f66822x.w();
                }
            }
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iW;
            int iZ;
            if (TaxMediaView.this.I != null) {
                iW = TaxMediaView.this.I.getWidth();
            } else {
                TaxMediaView taxMediaView = TaxMediaView.this;
                iW = taxMediaView.w(taxMediaView.getContext());
            }
            if (TaxMediaView.this.I != null) {
                iZ = TaxMediaView.this.I.getHeight();
            } else {
                TaxMediaView taxMediaView2 = TaxMediaView.this;
                iZ = taxMediaView2.z(taxMediaView2.getContext());
            }
            int i10 = TaxMediaView.this.f66815q;
            if (TaxMediaView.this.A) {
                i10 = iW > iZ ? 1 : 0;
            }
            if (i10 != 0 ? iW < iZ : iW > iZ) {
                int i11 = iZ;
                iZ = iW;
                iW = i11;
            }
            float fMin = Math.min(iW / TaxMediaView.this.f66813o, iZ / TaxMediaView.this.f66817s);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (TaxMediaView.this.f66813o * fMin), (int) (TaxMediaView.this.f66817s * fMin));
            layoutParams.addRule(13);
            LogUtil.v(TaxMediaView.O, "TaxMediaView setVastConfig reset width:" + layoutParams.width + " height:" + layoutParams.height);
            TaxMediaView.this.D.setLayoutParams(layoutParams);
        }
    }

    public class w implements MediaPlayer.OnPreparedListener {
        public w() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            LogUtil.v(TaxMediaView.O, "TaxMediaView MediaPlayer onPrepared()...");
            if (mediaPlayer.getVideoWidth() > 0 && mediaPlayer.getVideoHeight() > 0) {
                TaxMediaView.this.f66813o = mediaPlayer.getVideoWidth();
                TaxMediaView.this.f66817s = mediaPlayer.getVideoHeight();
            }
            TaxMediaView.this.L = true;
            TaxMediaView.this.l();
            TaxMediaView.this.f66819u = true;
            TaxMediaView taxMediaView = TaxMediaView.this;
            taxMediaView.f66820v = taxMediaView.B.getDuration();
            TaxMediaView.this.f66799a = Math.round(r3.f66820v * 0.25f);
            TaxMediaView.this.f66812n = Math.round(r3.f66820v * 0.5f);
            TaxMediaView.this.f66818t = Math.round(r3.f66820v * 0.75f);
            if (TaxMediaView.this.f66807i > 0) {
                TaxMediaView.this.B.seekTo(TaxMediaView.this.f66807i);
            } else {
                TaxMediaView.this.e();
            }
            if (TaxMediaView.this.J) {
                return;
            }
            TaxMediaView.this.B.pause();
        }
    }

    public class y implements MediaPlayer.OnSeekCompleteListener {
        public y() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (TaxMediaView.this.f66809k && TaxMediaView.this.f66807i == TaxMediaView.this.f66820v) {
                return;
            }
            TaxMediaView.this.e();
        }
    }

    public class z extends Handler {
        public z(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TaxMediaView.this.f66807i = message.what;
            if (TaxMediaView.this.f66807i <= 0) {
                return;
            }
            if (!TaxMediaView.this.f66803e && !TaxMediaView.this.f66809k) {
                TaxMediaView.this.f66803e = true;
                com.taurusx.tax.s.z.z(TaxMediaView.this.F, TaxMediaView.this.G, TaxMediaView.this.B.getDuration(), !TaxMediaView.this.f66808j ? 1 : 0, TaxMediaView.this.N);
                if (TaxMediaView.this.f66822x != null) {
                    TaxMediaView.this.f66822x.onPlayStart();
                }
            }
            if (TaxMediaView.this.f66822x != null) {
                TaxMediaView.this.f66822x.onProgress(TaxMediaView.this.f66807i, TaxMediaView.this.f66820v);
            }
            if (TaxMediaView.this.f66821w != null && TaxMediaView.this.f66821w.size() > 0) {
                ArrayList<VastAbsoluteProgressTracker> arrayList = new ArrayList();
                arrayList.addAll(TaxMediaView.this.f66821w);
                for (VastAbsoluteProgressTracker vastAbsoluteProgressTracker : arrayList) {
                    if (TaxMediaView.this.f66807i >= vastAbsoluteProgressTracker.getF66939s()) {
                        com.taurusx.tax.n.y.z().z(vastAbsoluteProgressTracker.getContent(), TaxMediaView.this.f66824z);
                        TaxMediaView.this.f66821w.remove(vastAbsoluteProgressTracker);
                    }
                }
            }
            if (TaxMediaView.this.f66823y != null && TaxMediaView.this.f66823y.size() > 0) {
                ArrayList<VastFractionalProgressTracker> arrayList2 = new ArrayList();
                arrayList2.addAll(TaxMediaView.this.f66823y);
                for (VastFractionalProgressTracker vastFractionalProgressTracker : arrayList2) {
                    if (TaxMediaView.this.f66807i >= Math.round(TaxMediaView.this.f66820v * vastFractionalProgressTracker.getF66985s())) {
                        com.taurusx.tax.n.y.z().z(vastFractionalProgressTracker.getContent(), TaxMediaView.this.f66824z);
                        TaxMediaView.this.f66823y.remove(vastFractionalProgressTracker);
                    }
                }
            }
            if (!TaxMediaView.this.f66805g && TaxMediaView.this.f66807i >= TaxMediaView.this.f66799a) {
                TaxMediaView.this.f66805g = true;
                com.taurusx.tax.s.z.y(TaxMediaView.this.F, TaxMediaView.this.G, TaxMediaView.this.N);
                if (TaxMediaView.this.f66822x != null) {
                    TaxMediaView.this.f66822x.onPlayProgress(25);
                    return;
                }
                return;
            }
            if (!TaxMediaView.this.f66804f && TaxMediaView.this.f66807i >= TaxMediaView.this.f66812n) {
                TaxMediaView.this.f66804f = true;
                com.taurusx.tax.s.z.c(TaxMediaView.this.F, TaxMediaView.this.G, TaxMediaView.this.N);
                if (TaxMediaView.this.f66822x != null) {
                    TaxMediaView.this.f66822x.onPlayProgress(50);
                    return;
                }
                return;
            }
            if (!TaxMediaView.this.f66811m && TaxMediaView.this.f66807i >= TaxMediaView.this.f66818t) {
                TaxMediaView.this.f66811m = true;
                com.taurusx.tax.s.z.a(TaxMediaView.this.F, TaxMediaView.this.G, TaxMediaView.this.N);
                if (TaxMediaView.this.f66822x != null) {
                    TaxMediaView.this.f66822x.onPlayProgress(75);
                    return;
                }
                return;
            }
            if (TaxMediaView.this.f66814p || Math.ceil(TaxMediaView.this.f66807i / 1000.0f) != Math.floor(TaxMediaView.this.f66820v / 1000.0f)) {
                return;
            }
            TaxMediaView.this.f66814p = true;
            if (TaxMediaView.this.f66822x != null) {
                TaxMediaView.this.f66822x.z();
            }
        }
    }

    public TaxMediaView(Context context) {
        super(context);
        this.f66807i = -1;
        this.f66810l = false;
        this.f66803e = false;
        this.f66809k = false;
        this.f66819u = false;
        this.A = false;
        this.J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        y();
    }

    public int getCurrentProgress() {
        int i10 = this.f66807i;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public int getDuration() {
        return this.f66820v;
    }

    public int getVideoLength() {
        return this.f66820v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f66813o;
        if (i13 > 0 && (i12 = this.f66817s) > 0) {
            float f10 = size;
            float f11 = size2;
            float f12 = i13 / i12;
            if (f12 > f10 / f11) {
                size2 = (int) (f10 / f12);
            } else {
                size = (int) (f11 * f12);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            i10 = iMakeMeasureSpec;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        LogUtil.v(O, "TaxMediaView onSurfaceTextureAvailable()...");
        this.M = true;
        this.C = surfaceTexture;
        l();
        f();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.v(O, "TaxMediaView onSurfaceTextureDestroyed()...");
        p();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setAdContainerView(ViewGroup viewGroup) {
        this.I = viewGroup;
    }

    public void setIsAutoPlay(boolean z10) {
        this.J = z10;
    }

    public void setIsMute(boolean z10) {
        LogUtil.d(O, "TaxMediaView setIsMute " + z10);
        this.f66808j = z10;
    }

    public void setIsSkip(boolean z10) {
        this.f66802d = z10;
    }

    public void setMute(boolean z10) {
        if (z10) {
            MediaPlayer mediaPlayer = this.B;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(0.0f, 0.0f);
                com.taurusx.tax.s.z.z(this.F, this.G, 0.0f, this.N);
                g gVar = this.f66822x;
                if (gVar != null) {
                    gVar.y();
                    return;
                }
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer2 = this.B;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(1.0f, 1.0f);
            com.taurusx.tax.s.z.z(this.F, this.G, 1.0f, this.N);
            g gVar2 = this.f66822x;
            if (gVar2 != null) {
                gVar2.w();
            }
        }
    }

    public void setOnPlayerListener(g gVar) {
        this.f66822x = gVar;
    }

    public void setOrientation(int i10) {
        this.f66815q = i10;
    }

    public void setTaxCustomEvent(com.taurusx.tax.w.s.s sVar) {
        this.N = sVar;
    }

    public void setmEnableAutoOrientation(boolean z10) {
        this.A = z10;
    }

    @SuppressLint({"SuspiciousIndentation"})
    private void f() {
        if (TextUtils.isEmpty(this.f66801c)) {
            return;
        }
        try {
            if (this.B == null) {
                c();
            }
            this.B.reset();
            this.B.setDataSource(getContext(), Uri.parse(this.f66801c));
            if (this.E == null) {
                this.E = new Surface(this.C);
            }
            this.B.setSurface(this.E);
            this.B.prepareAsync();
        } catch (Throwable th2) {
            th2.printStackTrace();
            g gVar = this.f66822x;
            if (gVar != null) {
                gVar.onPlayFailed();
            }
        }
    }

    private void k() {
        if (this.f66800b != null) {
            return;
        }
        this.f66810l = true;
        Thread thread = new Thread(new a());
        this.f66800b = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!this.K && this.L && this.M && this.f66813o > 0 && this.f66817s > 0) {
            this.K = true;
            this.D.post(new t());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f66810l = false;
        this.f66800b = null;
    }

    public void e() {
        LogUtil.v(O, "TaxMediaView start");
        if (this.f66824z == null || this.f66801c == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.B;
        if (mediaPlayer != null && this.f66819u) {
            mediaPlayer.start();
        }
        com.taurusx.tax.s.z.s(this.F, this.G, this.N);
        w();
        k();
    }

    public boolean g() {
        return this.f66802d;
    }

    public void i() {
        LogUtil.d("taurusx", "seekToEnd()");
        MediaPlayer mediaPlayer = this.B;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(mediaPlayer.getDuration());
        }
    }

    public void m() {
        LogUtil.d("taurusx", "pause()");
        u();
        if (t()) {
            this.B.pause();
            com.taurusx.tax.s.z.o(this.F, this.G, this.N);
        }
    }

    public synchronized void p() {
        try {
            if (this.f66819u) {
                LogUtil.v(O, "TaxMediaView release");
                u();
                this.C = null;
                this.E = null;
                MediaPlayer mediaPlayer = this.B;
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        this.B.stop();
                    }
                    this.B.reset();
                    this.B.release();
                    this.B = null;
                }
                Handler handler = this.f66816r;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                this.f66819u = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void v() {
        this.G = null;
        this.F = null;
    }

    public boolean n() {
        return this.f66809k;
    }

    public boolean t() {
        MediaPlayer mediaPlayer = this.B;
        if (mediaPlayer == null || !this.f66819u) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    private void a() {
        s();
        c();
        o();
    }

    private void c() {
        if (this.B == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.B = mediaPlayer;
            boolean z10 = this.f66808j;
            mediaPlayer.setVolume(z10 ? 0.0f : 1.0f, z10 ? 0.0f : 1.0f);
            this.B.setAudioStreamType(3);
            this.B.setOnPreparedListener(new w());
            this.B.setOnSeekCompleteListener(new y());
            if (!this.f66809k) {
                this.B.setOnCompletionListener(new c());
            }
            this.B.setOnErrorListener(new o());
        }
    }

    private void o() {
        this.f66806h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(j0.z(getContext(), 10), j0.z(getContext(), 10));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        this.f66806h.setVisibility(4);
        addView(this.f66806h, layoutParams);
        if (this.f66808j) {
            this.f66806h.setBackgroundResource(R.drawable.taurusx_inner_video_mute);
        } else {
            this.f66806h.setBackgroundResource(R.drawable.taurusx_inner_video_no_mute);
        }
        this.f66806h.setOnClickListener(new s());
    }

    private void s() {
        if (this.D == null) {
            TextureView textureView = new TextureView(getContext());
            this.D = textureView;
            textureView.setSurfaceTextureListener(this);
            this.D.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.D, layoutParams);
        }
    }

    private void w() {
        if (this.H) {
            return;
        }
        this.H = true;
        m.w(new n(), 500L);
    }

    private void y() {
        setSaveEnabled(true);
        this.f66816r = new z(Looper.getMainLooper());
        a();
    }

    public void z(y.z zVar, VastConfig vastConfig) {
        this.f66824z = vastConfig;
        if (zVar != null && vastConfig != null) {
            this.f66821w = vastConfig.getOffsetAbsoluteProgressTrackers();
            this.f66823y = this.f66824z.getOffsetPercentProgressTrackers();
            this.f66801c = vastConfig.getDiskMediaFileUrl();
            this.f66817s = vastConfig.getVideoHeight();
            this.f66813o = vastConfig.getVideoWidth();
            LogUtil.v(O, "TaxMediaView setVastConfig config DiskMediaFileUrl:" + vastConfig.getDiskMediaFileUrl() + " width:" + this.f66813o + " height:" + this.f66817s);
            return;
        }
        LogUtil.v(O, "TaxMediaView setVastConfig config is null");
    }

    public int w(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            return point.x;
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public TaxMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66807i = -1;
        this.f66810l = false;
        this.f66803e = false;
        this.f66809k = false;
        this.f66819u = false;
        this.A = false;
        this.J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        y();
    }

    public int z(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            return point.y;
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public void z(AdSession adSession, MediaEvents mediaEvents) {
        if (this.G == null) {
            this.G = adSession;
        }
        if (this.F == null) {
            this.F = mediaEvents;
        }
    }

    public void z() {
        com.taurusx.tax.s.z.z(this.F, this.G, this.N);
    }
}
