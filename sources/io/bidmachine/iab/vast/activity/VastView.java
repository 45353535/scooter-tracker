package io.bidmachine.iab.vast.activity;

import a9.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import c9.d;
import com.ironsource.D5;
import g9.a;
import id.z0;
import io.bidmachine.iab.mraid.f;
import io.bidmachine.iab.vast.processor.VastAd;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import pd.i0;

/* JADX INFO: loaded from: classes12.dex */
public class VastView extends RelativeLayout implements b9.f {
    private c0 A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private final List P;
    private final List Q;
    private final Runnable R;
    private final Runnable S;
    private final a T;
    private final a U;
    private final LinkedList V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f80335a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80336b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final a f80337b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f9.c f80338c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f80339c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    FrameLayout f80340d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f80341d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Surface f80342e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f80343e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    FrameLayout f80344f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f80345f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g9.a f80346g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final MediaPlayer.OnVideoSizeChangedListener f80347g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    b9.g f80348h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private d.a f80349h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    b9.h f80350i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final View.OnTouchListener f80351i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b9.p f80352j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final WebChromeClient f80353j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b9.n f80354k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final WebViewClient f80355k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b9.m f80356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b9.o f80357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b9.i f80358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    MediaPlayer f80359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f80360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    e9.g f80361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    e9.g f80362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ImageView f80363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    io.bidmachine.iab.mraid.f f80364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c9.g f80365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    B f80366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c9.m f80367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c9.f f80368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a9.c f80369y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b f80370z;

    private interface a {
        void a(int i10, int i11, float f10);
    }

    class a0 extends c0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WeakReference f80385g;

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.x0();
                VastView.this.h0();
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.f80340d.setVisibility(8);
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.x0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f80385g = weakReference;
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.c0
        void d(Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f80385g.get();
            if (imageView != null) {
                if (bitmap == null) {
                    imageView.setOnClickListener(new a());
                    return;
                }
                imageView.setImageBitmap(bitmap);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                imageView.setOnClickListener(new c());
            }
        }
    }

    private final class b0 implements io.bidmachine.iab.mraid.g {
        private b0() {
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onClose(io.bidmachine.iab.mraid.f fVar) {
            VastView.this.l0();
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onExpired(io.bidmachine.iab.mraid.f fVar, y8.b bVar) {
            VastView.this.B(bVar);
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onLoadFailed(io.bidmachine.iab.mraid.f fVar, y8.b bVar) {
            VastView.this.Q(bVar);
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onLoaded(io.bidmachine.iab.mraid.f fVar) {
            VastView vastView = VastView.this;
            if (vastView.f80366v.f80380k) {
                vastView.setLoadingViewVisibility(false);
                fVar.x(VastView.this, false);
            }
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onOpenUrl(io.bidmachine.iab.mraid.f fVar, String str, b9.f fVar2) {
            fVar2.a();
            VastView vastView = VastView.this;
            vastView.F(vastView.f80362r, str);
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onPlayVideo(io.bidmachine.iab.mraid.f fVar, String str) {
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onShowFailed(io.bidmachine.iab.mraid.f fVar, y8.b bVar) {
            VastView.this.Q(bVar);
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onShown(io.bidmachine.iab.mraid.f fVar) {
        }

        /* synthetic */ b0(VastView vastView, n nVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onOpenPrivacySheet(io.bidmachine.iab.mraid.f fVar, z0 z0Var) {
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onCalendarEvent(io.bidmachine.iab.mraid.f fVar, String str, b9.f fVar2) {
        }

        @Override // io.bidmachine.iab.mraid.g
        public void onStorePicture(io.bidmachine.iab.mraid.f fVar, String str, b9.f fVar2) {
        }
    }

    private static class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final VastView f80391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f80392c;

        public c(VastView vastView, b bVar) {
            this.f80391b = vastView;
            this.f80392c = bVar;
        }

        @Override // a9.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(WebView webView) {
            this.f80392c.f(webView);
        }

        @Override // a9.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void w(WebView webView) {
            this.f80392c.w(webView);
        }

        @Override // a9.a
        public void e(ViewGroup viewGroup) {
            this.f80392c.e(this.f80391b);
        }

        @Override // a9.a
        public void onAdClicked() {
            this.f80392c.onAdClicked();
        }

        @Override // a9.a
        public void onAdShown() {
            this.f80392c.onAdShown();
        }

        @Override // a9.b
        public String prepareCreativeForMeasure(String str) {
            return this.f80392c.prepareCreativeForMeasure(str);
        }

        @Override // a9.a
        public void y(y8.b bVar) {
            this.f80392c.y(bVar);
        }
    }

    private static abstract class c0 extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f80393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f80394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f80395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f80396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f80397f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c0 c0Var = c0.this;
                c0Var.d(c0Var.f80396e);
            }
        }

        c0(Context context, Uri uri, String str) {
            this.f80393b = new WeakReference(context);
            this.f80394c = uri;
            this.f80395d = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                d(null);
            } else {
                start();
            }
        }

        void b() {
            this.f80397f = true;
        }

        abstract void d(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.f80393b.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f80394c;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f80395d;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f80396e = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e10) {
                    c9.e.b("MediaFrameRetriever", e10.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e11) {
                c9.e.b("MediaFrameRetriever", e11.getMessage(), new Object[0]);
            }
            if (this.f80397f) {
                return;
            }
            b9.u.B(new a());
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastView.this.C0()) {
                VastView.this.b0();
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VastView.this.C0() && VastView.this.f80359o.isPlaying()) {
                    int duration = VastView.this.f80359o.getDuration();
                    int currentPosition = VastView.this.f80359o.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f10 = (currentPosition * 100.0f) / duration;
                        VastView.this.T.a(duration, currentPosition, f10);
                        VastView.this.U.a(duration, currentPosition, f10);
                        VastView.this.f80337b0.a(duration, currentPosition, f10);
                        if (f10 > 105.0f) {
                            c9.e.b(VastView.this.f80336b, "Playback tracking: video hang detected", new Object[0]);
                            VastView.this.o0();
                        }
                    }
                }
            } catch (Exception e10) {
                c9.e.b(VastView.this.f80336b, "Playback tracking exception: %s", e10.getMessage());
            }
            VastView.this.postDelayed(this, 16L);
        }
    }

    class f implements a {
        f() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            b9.h hVar;
            VastView vastView = VastView.this;
            B b10 = vastView.f80366v;
            if (b10.f80379j || b10.f80372c == 0.0f || !vastView.D(vastView.f80365u)) {
                return;
            }
            VastView vastView2 = VastView.this;
            float f11 = vastView2.f80366v.f80372c * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            c9.e.a(vastView2.f80336b, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (hVar = VastView.this.f80350i) != null) {
                hVar.r(i12, (int) Math.ceil(((double) f13) / 1000.0d));
            }
            if (f13 <= 0.0f) {
                VastView vastView3 = VastView.this;
                B b11 = vastView3.f80366v;
                b11.f80372c = 0.0f;
                b11.f80379j = true;
                vastView3.setCloseControlsVisible(true);
            }
        }
    }

    class g implements a {
        g() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            VastView vastView = VastView.this;
            B b10 = vastView.f80366v;
            if (b10.f80378i && b10.f80373d == 3) {
                return;
            }
            if (vastView.f80365u.I() > 0 && i11 > VastView.this.f80365u.I() && VastView.this.f80365u.O() == c9.n.Rewarded) {
                VastView vastView2 = VastView.this;
                vastView2.f80366v.f80379j = true;
                vastView2.setCloseControlsVisible(true);
            }
            VastView vastView3 = VastView.this;
            int i12 = vastView3.f80366v.f80373d;
            if (f10 > i12 * 25.0f) {
                if (i12 == 3) {
                    c9.e.a(vastView3.f80336b, "Video at third quartile: (%s)", Float.valueOf(f10));
                    VastView.this.V(c9.a.thirdQuartile);
                    if (VastView.this.f80368x != null) {
                        VastView.this.f80368x.u0();
                    }
                } else if (i12 == 0) {
                    c9.e.a(vastView3.f80336b, "Video at start: (%s)", Float.valueOf(f10));
                    VastView.this.V(c9.a.start);
                    if (VastView.this.f80368x != null) {
                        VastView.this.f80368x.onVideoStarted(i10, VastView.this.f80366v.f80376g ? 0.0f : 1.0f);
                    }
                } else if (i12 == 1) {
                    c9.e.a(vastView3.f80336b, "Video at first quartile: (%s)", Float.valueOf(f10));
                    VastView.this.V(c9.a.firstQuartile);
                    if (VastView.this.f80368x != null) {
                        VastView.this.f80368x.r0();
                    }
                } else if (i12 == 2) {
                    c9.e.a(vastView3.f80336b, "Video at midpoint: (%s)", Float.valueOf(f10));
                    VastView.this.V(c9.a.midpoint);
                    if (VastView.this.f80368x != null) {
                        VastView.this.f80368x.t0();
                    }
                }
                VastView.this.f80366v.f80373d++;
            }
        }
    }

    class h implements a {
        h() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.a
        public void a(int i10, int i11, float f10) {
            if (VastView.this.V.size() == 2 && ((Integer) VastView.this.V.getFirst()).intValue() > ((Integer) VastView.this.V.getLast()).intValue()) {
                c9.e.b(VastView.this.f80336b, "Playing progressing error: seek", new Object[0]);
                VastView.this.V.removeFirst();
            }
            if (VastView.this.V.size() == 19) {
                Integer num = (Integer) VastView.this.V.getFirst();
                int iIntValue = num.intValue();
                Integer num2 = (Integer) VastView.this.V.getLast();
                int iIntValue2 = num2.intValue();
                c9.e.a(VastView.this.f80336b, "Playing progressing position: last=%d, first=%d)", num2, num);
                if (iIntValue2 > iIntValue) {
                    VastView.this.V.removeFirst();
                } else {
                    VastView.J0(VastView.this);
                    if (VastView.this.W >= 3) {
                        VastView.this.Y(y8.b.f("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                VastView.this.V.addLast(Integer.valueOf(i11));
                if (i10 == 0 || i11 <= 0) {
                    return;
                }
                VastView vastView = VastView.this;
                if (vastView.f80357m != null) {
                    c9.e.a(vastView.f80336b, "Playing progressing percent: %s", Float.valueOf(f10));
                    if (VastView.this.f80335a0 < f10) {
                        VastView.this.f80335a0 = f10;
                        int i12 = i10 / 1000;
                        VastView.this.f80357m.r(f10, Math.min(i12, (int) Math.ceil(i11 / 1000.0f)), i12);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    class i implements TextureView.SurfaceTextureListener {
        i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            c9.e.a(VastView.this.f80336b, "onSurfaceTextureAvailable", new Object[0]);
            VastView.this.f80342e = new Surface(surfaceTexture);
            VastView.this.H = true;
            if (VastView.this.I) {
                VastView.this.I = false;
                VastView.this.Z0("onSurfaceTextureAvailable");
            } else if (VastView.this.C0()) {
                VastView vastView = VastView.this;
                vastView.f80359o.setSurface(vastView.f80342e);
                VastView.this.V0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            c9.e.a(VastView.this.f80336b, "onSurfaceTextureDestroyed", new Object[0]);
            VastView vastView = VastView.this;
            vastView.f80342e = null;
            vastView.H = false;
            if (VastView.this.C0()) {
                VastView.this.f80359o.setSurface(null);
                VastView.this.K0();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            c9.e.a(VastView.this.f80336b, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class j implements MediaPlayer.OnCompletionListener {
        j() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            c9.e.a(VastView.this.f80336b, "MediaPlayer - onCompletion", new Object[0]);
            VastView.this.o0();
        }
    }

    class k implements MediaPlayer.OnErrorListener {
        k() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            VastView.this.Y(y8.b.f(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i10), Integer.valueOf(i11))));
            return true;
        }
    }

    class l implements MediaPlayer.OnPreparedListener {
        l() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            c9.e.a(VastView.this.f80336b, "MediaPlayer - onPrepared", new Object[0]);
            VastView vastView = VastView.this;
            if (vastView.f80366v.f80380k) {
                return;
            }
            vastView.V(c9.a.creativeView);
            VastView.this.V(c9.a.fullscreen);
            VastView.this.l1();
            VastView.this.setLoadingViewVisibility(false);
            VastView.this.K = true;
            if (!VastView.this.f80366v.f80377h) {
                mediaPlayer.start();
                VastView.this.d1();
            }
            VastView.this.j1();
            int i10 = VastView.this.f80366v.f80374e;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
                VastView.this.V(c9.a.resume);
                if (VastView.this.f80368x != null) {
                    VastView.this.f80368x.onVideoResumed();
                }
            }
            VastView vastView2 = VastView.this;
            if (!vastView2.f80366v.f80383n) {
                vastView2.K0();
            }
            VastView vastView3 = VastView.this;
            if (vastView3.f80366v.f80381l) {
                return;
            }
            vastView3.s0();
            if (VastView.this.f80365u.a0()) {
                VastView.this.C(false);
            }
        }
    }

    class m implements MediaPlayer.OnVideoSizeChangedListener {
        m() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            c9.e.a(VastView.this.f80336b, "onVideoSizeChanged", new Object[0]);
            VastView.this.D = i10;
            VastView.this.E = i11;
            VastView.this.b0();
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VastView.this.C0() || VastView.this.f80366v.f80380k) {
                VastView.this.b1();
            }
        }
    }

    class o implements d.a {
        o() {
        }

        @Override // c9.d.a
        public void a(boolean z10) {
            VastView.this.n1();
        }
    }

    class p implements View.OnTouchListener {
        p() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.P.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    class q extends WebChromeClient {
        q() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            c9.e.a("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            c9.e.a("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            c9.e.a("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    class s implements c9.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f80414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y8.a f80415b;

        s(boolean z10, y8.a aVar) {
            this.f80414a = z10;
            this.f80415b = aVar;
        }

        @Override // c9.l
        public void a(c9.g gVar, y8.b bVar) {
            VastView vastView = VastView.this;
            vastView.N(vastView.f80367w, gVar, y8.b.i(String.format("Error loading video after showing with %s - %s", this.f80415b, bVar)));
        }

        @Override // c9.l
        public void b(c9.g gVar, VastAd vastAd) {
            VastView.this.q(gVar, vastAd, this.f80414a);
        }
    }

    class t implements a.InterfaceC0886a {
        t() {
        }

        @Override // g9.a.InterfaceC0886a
        public void b() {
            VastView vastView = VastView.this;
            vastView.N(vastView.f80367w, VastView.this.f80365u, y8.b.i("Close button clicked"));
        }

        @Override // g9.a.InterfaceC0886a
        public void c() {
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.x0();
        }
    }

    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c9.g gVar = VastView.this.f80365u;
            if (gVar != null && gVar.R()) {
                VastView vastView = VastView.this;
                if (!vastView.f80366v.f80382m && vastView.x0()) {
                    return;
                }
            }
            if (VastView.this.J) {
                VastView.this.h0();
            } else {
                VastView.this.u0();
            }
        }
    }

    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.b();
        }
    }

    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.T0();
        }
    }

    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.x0();
        }
    }

    public VastView(Context context) {
        this(context, null);
    }

    private void A(Map map, c9.a aVar) {
        if (map == null || map.isEmpty()) {
            c9.e.a(this.f80336b, "Processing Event - fail: %s (tracking event map is null or empty)", aVar);
        } else {
            z((List) map.get(aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(y8.b bVar) {
        c9.e.b(this.f80336b, "handleCompanionExpired - %s", bVar);
        r(c9.j.f6612m);
        if (this.f80362r != null) {
            I0();
            C(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z10) {
        if (B0()) {
            n nVar = null;
            if (!z10) {
                e9.g gVarM = this.f80365u.M().m(getAvailableWidth(), getAvailableHeight());
                if (this.f80362r != gVarM) {
                    if (gVarM == null || !this.f80365u.b0()) {
                        this.C = this.B;
                    } else {
                        this.C = b9.u.D(gVarM.e0(), gVarM.a0());
                    }
                    this.f80362r = gVarM;
                    io.bidmachine.iab.mraid.f fVar = this.f80364t;
                    if (fVar != null) {
                        fVar.n();
                        this.f80364t = null;
                    }
                }
            }
            if (this.f80362r == null) {
                if (this.f80363s == null) {
                    this.f80363s = j(getContext());
                    return;
                }
                return;
            }
            if (this.f80364t == null) {
                R0();
                String strC0 = this.f80362r.c0();
                if (strC0 == null) {
                    Q(y8.b.a("Companion creative is null"));
                    return;
                }
                e9.e eVarI = this.f80365u.M().i();
                e9.o oVarI = eVarI != null ? eVarI.i() : null;
                f.a aVarK = io.bidmachine.iab.mraid.f.u().d(null).e(y8.a.FullLoad).g(this.f80365u.D()).b(this.f80365u.Q()).j(false).c(this.f80370z).k(new b0(this, nVar));
                if (oVarI != null) {
                    aVarK.f(oVarI.d());
                    aVarK.h(oVarI.v());
                    aVarK.l(oVarI.x());
                    aVarK.o(oVarI.m());
                    aVarK.i(oVarI.Y());
                    aVarK.n(oVarI.Z());
                    if (oVarI.a0()) {
                        aVarK.b(true);
                    }
                    aVarK.p(oVarI.r());
                    aVarK.q(oVarI.o());
                }
                try {
                    io.bidmachine.iab.mraid.f fVarA = aVarK.a(getContext());
                    this.f80364t = fVarA;
                    fVarA.t(strC0);
                } catch (Throwable th2) {
                    Q(y8.b.j("Exception during companion creation", th2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(c9.g gVar) {
        return gVar.O() != c9.n.Rewarded || gVar.I() <= 0;
    }

    private boolean E(c9.g gVar, Boolean bool, boolean z10) {
        a1();
        if (!z10) {
            this.f80366v = new B();
        }
        if (bool != null) {
            this.f80366v.f80375f = bool.booleanValue();
        }
        this.f80365u = gVar;
        if (gVar == null) {
            h0();
            c9.e.b(this.f80336b, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAdM = gVar.M();
        if (vastAdM == null) {
            h0();
            c9.e.b(this.f80336b, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        y8.a aVarC = gVar.C();
        if (aVarC == y8.a.PartialLoad && !E0()) {
            p(gVar, vastAdM, aVarC, z10);
            return true;
        }
        if (aVarC != y8.a.Stream || E0()) {
            q(gVar, vastAdM, z10);
            return true;
        }
        p(gVar, vastAdM, aVarC, z10);
        gVar.W(getContext().getApplicationContext(), null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(e9.g gVar, String str) {
        c9.g gVar2 = this.f80365u;
        ArrayList arrayList = null;
        VastAd vastAdM = gVar2 != null ? gVar2.M() : null;
        ArrayList arrayListS = vastAdM != null ? vastAdM.s() : null;
        List listZ = gVar != null ? gVar.Z() : null;
        if (arrayListS != null || listZ != null) {
            arrayList = new ArrayList();
            if (listZ != null) {
                arrayList.addAll(listZ);
            }
            if (arrayListS != null) {
                arrayList.addAll(arrayListS);
            }
        }
        return I(arrayList, str);
    }

    private void G0() {
        c9.e.a(this.f80336b, "finishVideoPlaying", new Object[0]);
        a1();
        c9.g gVar = this.f80365u;
        if (gVar == null || gVar.P() || !(this.f80365u.M().i() == null || this.f80365u.M().i().i().b0())) {
            h0();
            return;
        }
        if (D0()) {
            V(c9.a.close);
        }
        setLoadingViewVisibility(false);
        P0();
        X0();
    }

    private boolean I(List list, String str) {
        c9.e.a(this.f80336b, "processClickThroughEvent: %s", str);
        this.f80366v.f80382m = true;
        if (str == null) {
            return false;
        }
        z(list);
        a9.c cVar = this.f80369y;
        if (cVar != null) {
            cVar.onAdClicked();
        }
        if (this.f80367w != null && this.f80365u != null) {
            K0();
            setLoadingViewVisibility(true);
            this.f80367w.c(this, this.f80365u, this, str);
        }
        return true;
    }

    private void I0() {
        if (this.f80363s != null) {
            R0();
        } else {
            io.bidmachine.iab.mraid.f fVar = this.f80364t;
            if (fVar != null) {
                fVar.n();
                this.f80364t = null;
                this.f80362r = null;
            }
        }
        this.J = false;
    }

    static /* synthetic */ int J0(VastView vastView) {
        int i10 = vastView.W;
        vastView.W = i10 + 1;
        return i10;
    }

    private void K() {
        c0 c0Var = this.A;
        if (c0Var != null) {
            c0Var.b();
            this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        if (!C0() || this.f80366v.f80377h) {
            return;
        }
        c9.e.a(this.f80336b, "pausePlayback", new Object[0]);
        B b10 = this.f80366v;
        b10.f80377h = true;
        b10.f80374e = this.f80359o.getCurrentPosition();
        this.f80359o.pause();
        U();
        l();
        V(c9.a.pause);
        c9.f fVar = this.f80368x;
        if (fVar != null) {
            fVar.onVideoPaused();
        }
    }

    private void L(c9.a aVar) {
        c9.e.a(this.f80336b, "Track Companion Event: %s", aVar);
        e9.g gVar = this.f80362r;
        if (gVar != null) {
            A(gVar.d0(), aVar);
        }
    }

    private void M(c9.c cVar) {
        if (cVar != null && !cVar.v().J().booleanValue()) {
            b9.h hVar = this.f80350i;
            if (hVar != null) {
                hVar.l();
                return;
            }
            return;
        }
        if (this.f80350i == null) {
            b9.h hVar2 = new b9.h(null);
            this.f80350i = hVar2;
            this.Q.add(hVar2);
        }
        this.f80350i.g(getContext(), this.f80344f, k(cVar, cVar != null ? cVar.v() : null));
    }

    private void M0() {
        c9.e.b(this.f80336b, "performVideoCloseClick", new Object[0]);
        a1();
        if (this.L) {
            h0();
            return;
        }
        if (!this.f80366v.f80378i) {
            V(c9.a.skip);
            c9.f fVar = this.f80368x;
            if (fVar != null) {
                fVar.onVideoSkipped();
            }
        }
        c9.g gVar = this.f80365u;
        if (gVar != null && gVar.O() == c9.n.Rewarded) {
            c9.f fVar2 = this.f80368x;
            if (fVar2 != null) {
                fVar2.onVideoCompleted();
            }
            c9.m mVar = this.f80367w;
            if (mVar != null) {
                mVar.e(this, this.f80365u);
            }
        }
        G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(c9.m mVar, c9.g gVar, y8.b bVar) {
        s(mVar, gVar, bVar);
        if (mVar == null || gVar == null) {
            return;
        }
        mVar.a(this, gVar, false);
    }

    private void N0() {
        try {
            if (!B0() || this.f80366v.f80380k) {
                return;
            }
            if (this.f80359o == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f80359o = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.f80359o.setAudioStreamType(3);
                this.f80359o.setOnCompletionListener(this.f80341d0);
                this.f80359o.setOnErrorListener(this.f80343e0);
                this.f80359o.setOnPreparedListener(this.f80345f0);
                this.f80359o.setOnVideoSizeChangedListener(this.f80347g0);
            }
            this.f80359o.setSurface(this.f80342e);
            Uri uriE = E0() ? this.f80365u.E() : null;
            if (uriE == null) {
                setLoadingViewVisibility(true);
                this.f80359o.setDataSource(this.f80365u.M().q().O());
            } else {
                setLoadingViewVisibility(false);
                this.f80359o.setDataSource(getContext(), uriE);
            }
            this.f80359o.prepareAsync();
        } catch (Exception e10) {
            c9.e.c(this.f80336b, e10);
            Y(y8.b.j("Exception during preparing MediaPlayer", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        View view = this.f80360p;
        if (view != null) {
            b9.u.F(view);
            this.f80360p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(y8.b bVar) {
        c9.g gVar;
        c9.e.b(this.f80336b, "handleCompanionShowError - %s", bVar);
        r(c9.j.f6612m);
        s(this.f80367w, this.f80365u, bVar);
        if (this.f80362r != null) {
            I0();
            R(true);
            return;
        }
        c9.m mVar = this.f80367w;
        if (mVar == null || (gVar = this.f80365u) == null) {
            return;
        }
        mVar.a(this, gVar, z0());
    }

    private void R(boolean z10) {
        VastView vastView;
        c9.m mVar;
        if (!B0() || this.J) {
            return;
        }
        this.J = true;
        this.f80366v.f80380k = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.C;
        if (i10 != i11 && (mVar = this.f80367w) != null) {
            mVar.f(this, this.f80365u, i11);
        }
        b9.o oVar = this.f80357m;
        if (oVar != null) {
            oVar.l();
        }
        b9.n nVar = this.f80354k;
        if (nVar != null) {
            nVar.l();
        }
        b9.p pVar = this.f80352j;
        if (pVar != null) {
            pVar.l();
        }
        l();
        if (this.f80366v.f80384o) {
            if (this.f80363s == null) {
                this.f80363s = j(getContext());
            }
            this.f80363s.setImageBitmap(this.f80338c.getBitmap());
            addView(this.f80363s, new FrameLayout.LayoutParams(-1, -1));
            this.f80344f.bringToFront();
            return;
        }
        C(z10);
        if (this.f80362r == null) {
            setCloseControlsVisible(true);
            if (this.f80363s != null) {
                vastView = this;
                vastView.A = vastView.new a0(getContext(), this.f80365u.E(), this.f80365u.M().q().O(), new WeakReference(this.f80363s));
            } else {
                vastView = this;
            }
            addView(vastView.f80363s, new FrameLayout.LayoutParams(-1, -1));
        } else {
            vastView = this;
            setCloseControlsVisible(false);
            vastView.f80340d.setVisibility(8);
            P0();
            b9.i iVar = vastView.f80358n;
            if (iVar != null) {
                iVar.o(8);
            }
            io.bidmachine.iab.mraid.f fVar = vastView.f80364t;
            if (fVar == null) {
                setLoadingViewVisibility(false);
                Q(y8.b.f("CompanionInterstitial is null"));
            } else if (fVar.q()) {
                setLoadingViewVisibility(false);
                vastView.f80364t.x(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        a1();
        vastView.f80344f.bringToFront();
        L(c9.a.creativeView);
    }

    private void R0() {
        if (this.f80363s != null) {
            K();
            removeView(this.f80363s);
            this.f80363s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        if (B0()) {
            B b10 = this.f80366v;
            b10.f80380k = false;
            b10.f80374e = 0;
            I0();
            w0(this.f80365u.M().i());
            Z0("restartPlayback");
        }
    }

    private void U() {
        removeCallbacks(this.S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(c9.a aVar) {
        c9.e.a(this.f80336b, "Track Event: %s", aVar);
        c9.g gVar = this.f80365u;
        VastAd vastAdM = gVar != null ? gVar.M() : null;
        if (vastAdM != null) {
            A(vastAdM.r(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        B b10 = this.f80366v;
        if (!b10.f80383n) {
            if (C0()) {
                this.f80359o.start();
                this.f80359o.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f80366v.f80380k) {
                    return;
                }
                Z0("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (b10.f80377h && this.F) {
            c9.e.a(this.f80336b, "resumePlayback", new Object[0]);
            this.f80366v.f80377h = false;
            if (!C0()) {
                if (this.f80366v.f80380k) {
                    return;
                }
                Z0("resumePlayback");
                return;
            }
            this.f80359o.start();
            l1();
            d1();
            setLoadingViewVisibility(false);
            V(c9.a.resume);
            c9.f fVar = this.f80368x;
            if (fVar != null) {
                fVar.onVideoResumed();
            }
        }
    }

    private void W(c9.c cVar) {
        if (cVar == null || !cVar.j()) {
            return;
        }
        this.Q.clear();
    }

    private void X0() {
        R(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(y8.b bVar) {
        c9.e.b(this.f80336b, "handlePlaybackError - %s", bVar);
        this.L = true;
        r(c9.j.f6611l);
        s(this.f80367w, this.f80365u, bVar);
        G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        setMute(!this.f80366v.f80376g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int i10;
        int i11 = this.D;
        if (i11 == 0 || (i10 = this.E) == 0) {
            c9.e.a(this.f80336b, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f80338c.a(i11, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((b9.l) it.next()).q();
        }
    }

    private void c0(c9.c cVar) {
        if (cVar == null || cVar.x().J().booleanValue()) {
            if (this.f80356l == null) {
                this.f80356l = new b9.m(null);
            }
            this.f80356l.g(getContext(), this, k(cVar, cVar != null ? cVar.x() : null));
        } else {
            b9.m mVar = this.f80356l;
            if (mVar != null) {
                mVar.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1() {
        g1();
        U();
        this.S.run();
    }

    private void g1() {
        this.V.clear();
        this.W = 0;
        this.f80335a0 = 0.0f;
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        c9.g gVar;
        c9.e.b(this.f80336b, "handleClose", new Object[0]);
        V(c9.a.close);
        c9.m mVar = this.f80367w;
        if (mVar == null || (gVar = this.f80365u) == null) {
            return;
        }
        mVar.a(this, gVar, z0());
    }

    private void h1() {
        boolean z10;
        boolean z11;
        if (this.M) {
            z10 = true;
            if (D0() || this.J) {
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z11 = false;
            z10 = false;
        }
        b9.g gVar = this.f80348h;
        if (gVar != null) {
            gVar.o(z10 ? 0 : 8);
        }
        b9.h hVar = this.f80350i;
        if (hVar != null) {
            hVar.o(z11 ? 0 : 8);
        }
    }

    private View i(Context context, e9.g gVar) {
        boolean zW = b9.u.w(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b9.u.p(context, gVar.e0() > 0 ? gVar.e0() : zW ? 728.0f : 320.0f), b9.u.p(context, gVar.a0() > 0 ? gVar.a0() : zW ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(i0.e());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f80351i0);
        webView.setWebViewClient(this.f80355k0);
        webView.setWebChromeClient(this.f80353j0);
        String strB0 = gVar.b0();
        if (strB0 != null) {
            webView.loadDataWithBaseURL("", strB0, "text/html", D5.N, null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(i0.e());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void i0(c9.c cVar) {
        if (cVar != null && !cVar.n().J().booleanValue()) {
            b9.n nVar = this.f80354k;
            if (nVar != null) {
                nVar.l();
                return;
            }
            return;
        }
        if (this.f80354k == null) {
            b9.n nVar2 = new b9.n(new w());
            this.f80354k = nVar2;
            this.Q.add(nVar2);
        }
        this.f80354k.g(getContext(), this.f80344f, k(cVar, cVar != null ? cVar.n() : null));
    }

    private ImageView j(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1() {
        b9.n nVar;
        if (!C0() || (nVar = this.f80354k) == null) {
            return;
        }
        nVar.t(this.f80366v.f80376g);
        if (this.f80366v.f80376g) {
            this.f80359o.setVolume(0.0f, 0.0f);
            c9.f fVar = this.f80368x;
            if (fVar != null) {
                fVar.s0(0.0f);
                return;
            }
            return;
        }
        this.f80359o.setVolume(1.0f, 1.0f);
        c9.f fVar2 = this.f80368x;
        if (fVar2 != null) {
            fVar2.s0(1.0f);
        }
    }

    private b9.k k(c9.c cVar, b9.k kVar) {
        if (cVar == null) {
            return null;
        }
        if (kVar == null) {
            b9.k kVar2 = new b9.k();
            kVar2.a0(cVar.s());
            kVar2.N(cVar.g());
            return kVar2;
        }
        if (!kVar.H()) {
            kVar.a0(cVar.s());
        }
        if (!kVar.G()) {
            kVar.N(cVar.g());
        }
        return kVar;
    }

    private void l() {
        Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((b9.l) it.next()).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        c9.g gVar;
        c9.e.b(this.f80336b, "handleCompanionClose", new Object[0]);
        L(c9.a.close);
        c9.m mVar = this.f80367w;
        if (mVar == null || (gVar = this.f80365u) == null) {
            return;
        }
        mVar.a(this, gVar, z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l1() {
        if (B0()) {
            b1();
        }
    }

    private void m(c9.a aVar) {
        c9.e.a(this.f80336b, "Track Banner Event: %s", aVar);
        e9.g gVar = this.f80361q;
        if (gVar != null) {
            A(gVar.d0(), aVar);
        }
    }

    private void m0(c9.c cVar) {
        this.f80346g.setCountDownStyle(k(cVar, cVar != null ? cVar.v() : null));
        if (A0()) {
            this.f80346g.setCloseStyle(k(cVar, cVar != null ? cVar.d() : null));
            this.f80346g.setCloseClickListener(new t());
        }
        c0(cVar);
    }

    private void n(c9.c cVar) {
        if (cVar != null && !cVar.d().J().booleanValue()) {
            b9.g gVar = this.f80348h;
            if (gVar != null) {
                gVar.l();
                return;
            }
            return;
        }
        if (this.f80348h == null) {
            b9.g gVar2 = new b9.g(new v());
            this.f80348h = gVar2;
            this.Q.add(gVar2);
        }
        this.f80348h.g(getContext(), this.f80344f, k(cVar, cVar != null ? cVar.d() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        if (!this.F || !c9.d.e(getContext())) {
            K0();
            return;
        }
        if (this.G) {
            this.G = false;
            Z0("onWindowFocusChanged");
        } else if (this.f80366v.f80380k) {
            setLoadingViewVisibility(false);
        } else {
            V0();
        }
    }

    private void o(c9.c cVar, boolean z10) {
        if (z10 || !(cVar == null || cVar.t().J().booleanValue())) {
            b9.i iVar = this.f80358n;
            if (iVar != null) {
                iVar.l();
                return;
            }
            return;
        }
        if (this.f80358n == null) {
            b9.i iVar2 = new b9.i(new u());
            this.f80358n = iVar2;
            this.Q.add(iVar2);
        }
        this.f80358n.g(getContext(), this.f80344f, k(cVar, cVar != null ? cVar.t() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        c9.e.a(this.f80336b, "handleComplete", new Object[0]);
        B b10 = this.f80366v;
        b10.f80379j = true;
        if (!this.L && !b10.f80378i) {
            b10.f80378i = true;
            c9.f fVar = this.f80368x;
            if (fVar != null) {
                fVar.onVideoCompleted();
            }
            c9.m mVar = this.f80367w;
            if (mVar != null) {
                mVar.e(this, this.f80365u);
            }
            c9.g gVar = this.f80365u;
            if (gVar != null && gVar.S() && !this.f80366v.f80382m) {
                x0();
            }
            V(c9.a.complete);
        }
        if (this.f80366v.f80378i) {
            G0();
        }
    }

    private void p(c9.g gVar, VastAd vastAd, y8.a aVar, boolean z10) {
        gVar.Z(new s(z10, aVar));
        m0(vastAd.i());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    private void p0(c9.c cVar) {
        if (cVar != null && !cVar.m().J().booleanValue()) {
            b9.o oVar = this.f80357m;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        if (this.f80357m == null) {
            b9.o oVar2 = new b9.o(null);
            this.f80357m = oVar2;
            this.Q.add(oVar2);
        }
        this.f80357m.g(getContext(), this.f80344f, k(cVar, cVar != null ? cVar.m() : null));
        this.f80357m.r(0.0f, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(c9.g gVar, VastAd vastAd, boolean z10) {
        e9.e eVarI = vastAd.i();
        this.B = gVar.K();
        if (eVarI == null || !eVarI.t().J().booleanValue()) {
            this.f80361q = null;
        } else {
            this.f80361q = eVarI.X();
        }
        if (this.f80361q == null) {
            this.f80361q = vastAd.j(getContext());
        }
        w0(eVarI);
        o(eVarI, this.f80360p != null);
        n(eVarI);
        M(eVarI);
        i0(eVarI);
        t0(eVarI);
        p0(eVarI);
        c0(eVarI);
        W(eVarI);
        setLoadingViewVisibility(false);
        a9.c cVar = this.f80369y;
        if (cVar != null) {
            cVar.e(this);
            this.f80369y.w(this.f80338c);
        }
        c9.m mVar = this.f80367w;
        if (mVar != null) {
            mVar.f(this, gVar, this.f80366v.f80380k ? this.C : this.B);
        }
        if (!z10) {
            this.f80366v.f80371b = gVar.H();
            B b10 = this.f80366v;
            b10.f80383n = this.N;
            b10.f80384o = this.O;
            if (eVarI != null) {
                b10.f80376g = eVarI.Y();
            }
            this.f80366v.f80372c = gVar.G();
            a9.c cVar2 = this.f80369y;
            if (cVar2 != null) {
                cVar2.f(this.f80338c);
                this.f80369y.onAdShown();
            }
            c9.m mVar2 = this.f80367w;
            if (mVar2 != null) {
                mVar2.b(this, gVar);
            }
        }
        setCloseControlsVisible(D(gVar));
        Z0("load (restoring: " + z10 + ")");
    }

    private void r(c9.j jVar) {
        c9.g gVar = this.f80365u;
        if (gVar != null) {
            gVar.X(jVar);
        }
    }

    private void s(c9.m mVar, c9.g gVar, y8.b bVar) {
        if (mVar == null || gVar == null) {
            return;
        }
        mVar.d(this, gVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        c9.e.a(this.f80336b, "handleImpressions", new Object[0]);
        c9.g gVar = this.f80365u;
        if (gVar != null) {
            this.f80366v.f80381l = true;
            z(gVar.M().p());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        this.M = z10;
        h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        b9.m mVar = this.f80356l;
        if (mVar == null) {
            return;
        }
        if (!z10) {
            mVar.o(8);
        } else {
            mVar.o(0);
            this.f80356l.i();
        }
    }

    private void setMute(boolean z10) {
        this.f80366v.f80376g = z10;
        j1();
        V(this.f80366v.f80376g ? c9.a.mute : c9.a.unmute);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        g9.a aVar = this.f80346g;
        c9.g gVar = this.f80365u;
        aVar.n(z10, gVar != null ? gVar.J() : 3.0f);
    }

    private void t0(c9.c cVar) {
        if (cVar == null || !cVar.h().J().booleanValue()) {
            b9.p pVar = this.f80352j;
            if (pVar != null) {
                pVar.l();
                return;
            }
            return;
        }
        if (this.f80352j == null) {
            b9.p pVar2 = new b9.p(new x());
            this.f80352j = pVar2;
            this.Q.add(pVar2);
        }
        this.f80352j.g(getContext(), this.f80344f, k(cVar, cVar.h()));
    }

    private void w0(c9.c cVar) {
        b9.k kVarG;
        b9.k kVarG2 = cVar != null ? b9.a.f5853q.g(cVar.q()) : b9.a.f5853q;
        if (cVar == null || !cVar.j()) {
            this.f80340d.setOnClickListener(null);
            this.f80340d.setClickable(false);
        } else {
            this.f80340d.setOnClickListener(new y());
        }
        this.f80340d.setBackgroundColor(kVarG2.i().intValue());
        P0();
        if (this.f80361q == null || this.f80366v.f80380k) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f80340d.setLayoutParams(layoutParams);
            return;
        }
        this.f80360p = i(getContext(), this.f80361q);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f80360p.getLayoutParams());
        if ("inline".equals(kVarG2.D())) {
            kVarG = b9.a.f5848l;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (kVarG2.n().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f80360p.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f80360p.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (kVarG2.E().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f80360p.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f80360p.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            b9.k kVar = b9.a.f5847k;
            layoutParams2.addRule(13);
            kVarG = kVar;
        }
        if (cVar != null) {
            kVarG = kVarG.g(cVar.t());
        }
        kVarG.c(getContext(), this.f80360p);
        kVarG.b(getContext(), layoutParams3);
        kVarG.d(layoutParams3);
        this.f80360p.setBackgroundColor(kVarG.i().intValue());
        kVarG2.c(getContext(), this.f80340d);
        kVarG2.b(getContext(), layoutParams2);
        this.f80340d.setLayoutParams(layoutParams2);
        addView(this.f80360p, layoutParams3);
        m(c9.a.creativeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x0() {
        c9.e.b(this.f80336b, "handleInfoClicked", new Object[0]);
        c9.g gVar = this.f80365u;
        if (gVar != null) {
            return I(gVar.M().l(), this.f80365u.M().k());
        }
        return false;
    }

    private void z(List list) {
        if (B0()) {
            if (list == null || list.isEmpty()) {
                c9.e.a(this.f80336b, "\turl list is null", new Object[0]);
            } else {
                this.f80365u.B(list, null);
            }
        }
    }

    public boolean A0() {
        return this.f80366v.f80375f;
    }

    public boolean B0() {
        c9.g gVar = this.f80365u;
        return (gVar == null || gVar.M() == null) ? false : true;
    }

    public boolean C0() {
        return this.f80359o != null && this.K;
    }

    public boolean D0() {
        B b10 = this.f80366v;
        return b10.f80379j || b10.f80372c == 0.0f;
    }

    public boolean E0() {
        c9.g gVar = this.f80365u;
        return gVar != null && gVar.v();
    }

    public void Z0(String str) {
        c9.e.a(this.f80336b, "startPlayback: %s", str);
        if (B0()) {
            setPlaceholderViewVisible(false);
            if (this.f80366v.f80380k) {
                X0();
                return;
            }
            if (!this.F) {
                this.G = true;
                return;
            }
            if (this.H) {
                a1();
                I0();
                b0();
                N0();
                c9.d.d(this, this.f80349h0);
            } else {
                this.I = true;
            }
            if (this.f80340d.getVisibility() != 0) {
                this.f80340d.setVisibility(0);
            }
        }
    }

    @Override // b9.f
    public void a() {
        if (y0()) {
            setLoadingViewVisibility(false);
        } else if (this.F) {
            V0();
        } else {
            K0();
        }
    }

    public void a1() {
        this.f80366v.f80377h = false;
        if (this.f80359o != null) {
            c9.e.a(this.f80336b, "stopPlayback", new Object[0]);
            try {
                if (this.f80359o.isPlaying()) {
                    this.f80359o.stop();
                }
                this.f80359o.setSurface(null);
                this.f80359o.release();
            } catch (Exception e10) {
                c9.e.c(this.f80336b, e10);
            }
            this.f80359o = null;
            this.K = false;
            this.L = false;
            U();
            c9.d.f(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f80344f.bringToFront();
    }

    @Override // b9.f
    public void d() {
        if (y0()) {
            setLoadingViewVisibility(false);
        } else {
            V0();
        }
    }

    public void e0() {
        io.bidmachine.iab.mraid.f fVar = this.f80364t;
        if (fVar != null) {
            fVar.n();
            this.f80364t = null;
            this.f80362r = null;
        }
        this.f80367w = null;
        this.f80368x = null;
        this.f80369y = null;
        this.f80370z = null;
        c0 c0Var = this.A;
        if (c0Var != null) {
            c0Var.b();
            this.A = null;
        }
    }

    public boolean f0(c9.g gVar, Boolean bool) {
        return E(gVar, bool, false);
    }

    @Nullable
    public c9.m getListener() {
        return this.f80367w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F) {
            Z0("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (B0()) {
            w0(this.f80365u.M().i());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a1();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.getSuperState());
        B b10 = zVar.f80423b;
        if (b10 != null) {
            this.f80366v = b10;
        }
        c9.g gVarA = c9.i.a(this.f80366v.f80371b);
        if (gVarA != null) {
            E(gVarA, null, true);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (C0()) {
            this.f80366v.f80374e = this.f80359o.getCurrentPosition();
        }
        z zVar = new z(super.onSaveInstanceState());
        zVar.f80423b = this.f80366v;
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        removeCallbacks(this.R);
        post(this.R);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c9.e.a(this.f80336b, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.F = z10;
        n1();
    }

    public void setAdMeasurer(@Nullable a9.c cVar) {
        this.f80369y = cVar;
    }

    public void setCanAutoResume(boolean z10) {
        this.N = z10;
        this.f80366v.f80383n = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.O = z10;
        this.f80366v.f80384o = z10;
    }

    public void setListener(@Nullable c9.m mVar) {
        this.f80367w = mVar;
    }

    public void setPlaybackListener(@Nullable c9.f fVar) {
        this.f80368x = fVar;
    }

    public void setPostBannerAdMeasurer(@Nullable b bVar) {
        this.f80370z = bVar != null ? new c(this, bVar) : null;
    }

    public void u0() {
        if (this.f80346g.m() && this.f80346g.k()) {
            N(this.f80367w, this.f80365u, y8.b.i("OnBackPress event fired"));
            return;
        }
        if (D0()) {
            if (!y0()) {
                M0();
                return;
            }
            c9.g gVar = this.f80365u;
            if (gVar == null || gVar.O() != c9.n.NonRewarded) {
                return;
            }
            if (this.f80362r == null) {
                h0();
                return;
            }
            io.bidmachine.iab.mraid.f fVar = this.f80364t;
            if (fVar != null) {
                fVar.o();
            } else {
                l0();
            }
        }
    }

    public boolean y0() {
        return this.f80366v.f80380k;
    }

    public boolean z0() {
        c9.g gVar = this.f80365u;
        if (gVar == null) {
            return false;
        }
        if (gVar.D() == 0.0f && this.f80366v.f80378i) {
            return true;
        }
        return this.f80365u.D() > 0.0f && this.f80366v.f80380k;
    }

    static class z extends View.BaseSavedState {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        B f80423b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        z(Parcel parcel) {
            super(parcel);
            this.f80423b = (B) parcel.readParcelable(B.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f80423b, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    class r extends WebViewClient {
        r() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            VastView.this.P0();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                VastView.this.P.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!VastView.this.P.contains(webView)) {
                return true;
            }
            c9.e.a(VastView.this.f80336b, "banner clicked", new Object[0]);
            VastView vastView = VastView.this;
            vastView.F(vastView.f80361q, str);
            return true;
        }
    }

    public VastView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f80336b = "VastView-" + Integer.toHexString(hashCode());
        this.f80366v = new B();
        this.B = 0;
        this.C = 0;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = true;
        this.O = false;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new d();
        this.S = new e();
        this.T = new f();
        this.U = new g();
        this.V = new LinkedList();
        this.W = 0;
        this.f80335a0 = 0.0f;
        this.f80337b0 = new h();
        i iVar = new i();
        this.f80339c0 = iVar;
        this.f80341d0 = new j();
        this.f80343e0 = new k();
        this.f80345f0 = new l();
        this.f80347g0 = new m();
        this.f80349h0 = new o();
        this.f80351i0 = new p();
        this.f80353j0 = new q();
        this.f80355k0 = new r();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setOnClickListener(new n());
        f9.c cVar = new f9.c(context);
        this.f80338c = cVar;
        cVar.setSurfaceTextureListener(iVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f80340d = frameLayout;
        frameLayout.addView(this.f80338c, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f80340d, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f80344f = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f80344f, new ViewGroup.LayoutParams(-1, -1));
        g9.a aVar = new g9.a(getContext());
        this.f80346g = aVar;
        aVar.setBackgroundColor(0);
        addView(this.f80346g, new ViewGroup.LayoutParams(-1, -1));
    }

    static class B implements Parcelable {
        public static final Parcelable.Creator<B> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f80371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f80372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f80373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f80375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f80376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f80377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f80378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f80379j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f80380k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f80381l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f80382m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f80383n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f80384o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public B createFromParcel(Parcel parcel) {
                return new B(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public B[] newArray(int i10) {
                return new B[i10];
            }
        }

        B() {
            this.f80371b = null;
            this.f80372c = 5.0f;
            this.f80373d = 0;
            this.f80374e = 0;
            this.f80375f = true;
            this.f80376g = false;
            this.f80377h = false;
            this.f80378i = false;
            this.f80379j = false;
            this.f80380k = false;
            this.f80381l = false;
            this.f80382m = false;
            this.f80383n = true;
            this.f80384o = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f80371b);
            parcel.writeFloat(this.f80372c);
            parcel.writeInt(this.f80373d);
            parcel.writeInt(this.f80374e);
            parcel.writeByte(this.f80375f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80376g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80377h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80378i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80379j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80380k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80381l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80382m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80383n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f80384o ? (byte) 1 : (byte) 0);
        }

        B(Parcel parcel) {
            this.f80371b = null;
            this.f80372c = 5.0f;
            this.f80373d = 0;
            this.f80374e = 0;
            this.f80375f = true;
            this.f80376g = false;
            this.f80377h = false;
            this.f80378i = false;
            this.f80379j = false;
            this.f80380k = false;
            this.f80381l = false;
            this.f80382m = false;
            this.f80383n = true;
            this.f80384o = false;
            this.f80371b = parcel.readString();
            this.f80372c = parcel.readFloat();
            this.f80373d = parcel.readInt();
            this.f80374e = parcel.readInt();
            this.f80375f = parcel.readByte() != 0;
            this.f80376g = parcel.readByte() != 0;
            this.f80377h = parcel.readByte() != 0;
            this.f80378i = parcel.readByte() != 0;
            this.f80379j = parcel.readByte() != 0;
            this.f80380k = parcel.readByte() != 0;
            this.f80381l = parcel.readByte() != 0;
            this.f80382m = parcel.readByte() != 0;
            this.f80383n = parcel.readByte() != 0;
            this.f80384o = parcel.readByte() != 0;
        }
    }
}
