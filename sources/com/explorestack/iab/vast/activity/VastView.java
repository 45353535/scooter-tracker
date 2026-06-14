package com.explorestack.iab.vast.activity;

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
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.explorestack.iab.mraid.b;
import com.explorestack.iab.vast.processor.VastAd;
import com.ironsource.D5;
import f2.l;
import j2.a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class VastView extends RelativeLayout implements e2.c {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final List N;
    private final List O;
    private final Runnable P;
    private final Runnable Q;
    private final b R;
    private final b S;
    private final LinkedList T;
    private int U;
    private float V;
    private final b W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f18198a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18199b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f18200b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i2.e f18201c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f18202c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    FrameLayout f18203d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f18204d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Surface f18205e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final MediaPlayer.OnVideoSizeChangedListener f18206e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    FrameLayout f18207f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private l.b f18208f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    j2.a f18209g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final View.OnTouchListener f18210g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e2.j f18211h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final WebChromeClient f18212h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    e2.k f18213i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final WebViewClient f18214i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    e2.q f18215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e2.o f18216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    e2.n f18217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    e2.p f18218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e2.l f18219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    MediaPlayer f18220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f18221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    h2.g f18222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    h2.g f18223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ImageView f18224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    com.explorestack.iab.mraid.b f18225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    f2.e f18226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    b0 f18227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private f2.i f18228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private d2.b f18229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c0 f18230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f18231z;

    private static class a implements d2.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final VastView f18232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d2.b f18233c;

        public a(VastView vastView, d2.b bVar) {
            this.f18232b = vastView;
            this.f18233c = bVar;
        }

        @Override // d2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(WebView webView) {
            this.f18233c.f(webView);
        }

        @Override // d2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void w(WebView webView) {
            this.f18233c.w(webView);
        }

        @Override // d2.a
        public void e(ViewGroup viewGroup) {
            this.f18233c.e(this.f18232b);
        }

        @Override // d2.a
        public void onAdClicked() {
            this.f18233c.onAdClicked();
        }

        @Override // d2.a
        public void onAdShown() {
            this.f18233c.onAdShown();
        }

        @Override // d2.a
        public void p(b2.b bVar) {
            this.f18233c.p(bVar);
        }

        @Override // d2.b
        public String prepareCreativeForMeasure(String str) {
            return this.f18233c.prepareCreativeForMeasure(str);
        }
    }

    private final class a0 implements com.explorestack.iab.mraid.c {
        private a0() {
        }

        @Override // com.explorestack.iab.mraid.c
        public void a(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
            VastView.this.L(bVar2);
        }

        @Override // com.explorestack.iab.mraid.c
        public void c(com.explorestack.iab.mraid.b bVar) {
            VastView vastView = VastView.this;
            if (vastView.f18227v.f18244k) {
                vastView.setLoadingViewVisibility(false);
                bVar.t(VastView.this, false);
            }
        }

        @Override // com.explorestack.iab.mraid.c
        public void d(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
            VastView.this.L(bVar2);
        }

        @Override // com.explorestack.iab.mraid.c
        public void g(com.explorestack.iab.mraid.b bVar, String str, e2.c cVar) {
            cVar.a();
            VastView vastView = VastView.this;
            vastView.H(vastView.f18223r, str);
        }

        @Override // com.explorestack.iab.mraid.c
        public void i(com.explorestack.iab.mraid.b bVar, String str) {
        }

        @Override // com.explorestack.iab.mraid.c
        public void k(com.explorestack.iab.mraid.b bVar, b2.b bVar2) {
            VastView.this.m(bVar2);
        }

        @Override // com.explorestack.iab.mraid.c
        public void l(com.explorestack.iab.mraid.b bVar) {
        }

        @Override // com.explorestack.iab.mraid.c
        public void o(com.explorestack.iab.mraid.b bVar) {
            VastView.this.l0();
        }

        /* synthetic */ a0(VastView vastView, m mVar) {
            this();
        }
    }

    private interface b {
        void a(int i10, int i11, float f10);
    }

    @VisibleForTesting
    static class b0 implements Parcelable {
        public static final Parcelable.Creator<b0> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f18235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f18236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f18239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f18240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f18241h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f18242i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f18243j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f18244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f18245l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f18246m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f18247n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f18248o;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b0 createFromParcel(Parcel parcel) {
                return new b0(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b0[] newArray(int i10) {
                return new b0[i10];
            }
        }

        b0() {
            this.f18235b = null;
            this.f18236c = 5.0f;
            this.f18237d = 0;
            this.f18238e = 0;
            this.f18239f = true;
            this.f18240g = false;
            this.f18241h = false;
            this.f18242i = false;
            this.f18243j = false;
            this.f18244k = false;
            this.f18245l = false;
            this.f18246m = false;
            this.f18247n = true;
            this.f18248o = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f18235b);
            parcel.writeFloat(this.f18236c);
            parcel.writeInt(this.f18237d);
            parcel.writeInt(this.f18238e);
            parcel.writeByte(this.f18239f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18240g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18241h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18242i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18243j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18244k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18245l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18246m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18247n ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18248o ? (byte) 1 : (byte) 0);
        }

        b0(Parcel parcel) {
            this.f18235b = null;
            this.f18236c = 5.0f;
            this.f18237d = 0;
            this.f18238e = 0;
            this.f18239f = true;
            this.f18240g = false;
            this.f18241h = false;
            this.f18242i = false;
            this.f18243j = false;
            this.f18244k = false;
            this.f18245l = false;
            this.f18246m = false;
            this.f18247n = true;
            this.f18248o = false;
            this.f18235b = parcel.readString();
            this.f18236c = parcel.readFloat();
            this.f18237d = parcel.readInt();
            this.f18238e = parcel.readInt();
            this.f18239f = parcel.readByte() != 0;
            this.f18240g = parcel.readByte() != 0;
            this.f18241h = parcel.readByte() != 0;
            this.f18242i = parcel.readByte() != 0;
            this.f18243j = parcel.readByte() != 0;
            this.f18244k = parcel.readByte() != 0;
            this.f18245l = parcel.readByte() != 0;
            this.f18246m = parcel.readByte() != 0;
            this.f18247n = parcel.readByte() != 0;
            this.f18248o = parcel.readByte() != 0;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastView.this.C0()) {
                VastView.this.b0();
            }
        }
    }

    private static abstract class c0 extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference f18250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f18251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f18252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f18253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18254f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c0 c0Var = c0.this;
                c0Var.d(c0Var.f18253e);
            }
        }

        c0(Context context, Uri uri, String str) {
            this.f18250b = new WeakReference(context);
            this.f18251c = uri;
            this.f18252d = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                d(null);
            } else {
                start();
            }
        }

        void b() {
            this.f18254f = true;
        }

        abstract void d(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.f18250b.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f18251c;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f18252d;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f18253e = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e10) {
                    f2.c.c("MediaFrameRetriever", e10.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e11) {
                f2.c.c("MediaFrameRetriever", e11.getMessage(), new Object[0]);
            }
            if (this.f18254f) {
                return;
            }
            e2.g.z(new a());
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VastView.this.C0() && VastView.this.f18220o.isPlaying()) {
                    int duration = VastView.this.f18220o.getDuration();
                    int currentPosition = VastView.this.f18220o.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f10 = (currentPosition * 100.0f) / duration;
                        VastView.this.R.a(duration, currentPosition, f10);
                        VastView.this.S.a(duration, currentPosition, f10);
                        VastView.this.W.a(duration, currentPosition, f10);
                        if (f10 > 105.0f) {
                            f2.c.c(VastView.this.f18199b, "Playback tracking: video hang detected", new Object[0]);
                            VastView.this.o0();
                        }
                    }
                }
            } catch (Exception e10) {
                f2.c.c(VastView.this.f18199b, "Playback tracking exception: %s", e10.getMessage());
            }
            VastView.this.postDelayed(this, 16L);
        }
    }

    class e implements b {
        e() {
        }

        @Override // com.explorestack.iab.vast.activity.VastView.b
        public void a(int i10, int i11, float f10) {
            e2.k kVar;
            VastView vastView = VastView.this;
            b0 b0Var = vastView.f18227v;
            if (b0Var.f18243j || b0Var.f18236c == 0.0f || !vastView.F(vastView.f18226u)) {
                return;
            }
            VastView vastView2 = VastView.this;
            float f11 = vastView2.f18227v.f18236c * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            f2.c.a(vastView2.f18199b, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (kVar = VastView.this.f18213i) != null) {
                kVar.r(i12, (int) Math.ceil(((double) f13) / 1000.0d));
            }
            if (f13 <= 0.0f) {
                VastView vastView3 = VastView.this;
                b0 b0Var2 = vastView3.f18227v;
                b0Var2.f18236c = 0.0f;
                b0Var2.f18243j = true;
                vastView3.setCloseControlsVisible(true);
            }
        }
    }

    class f implements b {
        f() {
        }

        @Override // com.explorestack.iab.vast.activity.VastView.b
        public void a(int i10, int i11, float f10) {
            VastView vastView;
            f2.a aVar;
            VastView vastView2 = VastView.this;
            b0 b0Var = vastView2.f18227v;
            if (b0Var.f18242i && b0Var.f18237d == 3) {
                return;
            }
            if (vastView2.f18226u.I() > 0 && i11 > VastView.this.f18226u.I() && VastView.this.f18226u.O() == f2.j.Rewarded) {
                VastView vastView3 = VastView.this;
                vastView3.f18227v.f18243j = true;
                vastView3.setCloseControlsVisible(true);
            }
            VastView vastView4 = VastView.this;
            int i12 = vastView4.f18227v.f18237d;
            if (f10 > i12 * 25.0f) {
                if (i12 == 3) {
                    f2.c.a(vastView4.f18199b, "Video at third quartile: (%s)", Float.valueOf(f10));
                    vastView = VastView.this;
                    aVar = f2.a.thirdQuartile;
                } else if (i12 == 0) {
                    f2.c.a(vastView4.f18199b, "Video at start: (%s)", Float.valueOf(f10));
                    vastView = VastView.this;
                    aVar = f2.a.start;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            f2.c.a(vastView4.f18199b, "Video at midpoint: (%s)", Float.valueOf(f10));
                            vastView = VastView.this;
                            aVar = f2.a.midpoint;
                        }
                        VastView.this.f18227v.f18237d++;
                    }
                    f2.c.a(vastView4.f18199b, "Video at first quartile: (%s)", Float.valueOf(f10));
                    vastView = VastView.this;
                    aVar = f2.a.firstQuartile;
                }
                vastView.X(aVar);
                VastView.r0(VastView.this);
                VastView.this.f18227v.f18237d++;
            }
        }
    }

    class g implements b {
        g() {
        }

        @Override // com.explorestack.iab.vast.activity.VastView.b
        public void a(int i10, int i11, float f10) {
            if (VastView.this.T.size() == 2 && ((Integer) VastView.this.T.getFirst()).intValue() > ((Integer) VastView.this.T.getLast()).intValue()) {
                f2.c.c(VastView.this.f18199b, "Playing progressing error: seek", new Object[0]);
                VastView.this.T.removeFirst();
            }
            if (VastView.this.T.size() == 19) {
                Integer num = (Integer) VastView.this.T.getFirst();
                int iIntValue = num.intValue();
                Integer num2 = (Integer) VastView.this.T.getLast();
                int iIntValue2 = num2.intValue();
                f2.c.a(VastView.this.f18199b, "Playing progressing position: last=%d, first=%d)", num2, num);
                VastView vastView = VastView.this;
                if (iIntValue2 > iIntValue) {
                    vastView.T.removeFirst();
                } else {
                    VastView.J0(vastView);
                    if (VastView.this.U >= 3) {
                        VastView.this.V(b2.b.f("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                VastView.this.T.addLast(Integer.valueOf(i11));
                if (i10 == 0 || i11 <= 0) {
                    return;
                }
                VastView vastView2 = VastView.this;
                if (vastView2.f18218m != null) {
                    f2.c.a(vastView2.f18199b, "Playing progressing percent: %s", Float.valueOf(f10));
                    if (VastView.this.V < f10) {
                        VastView.this.V = f10;
                        int i12 = i10 / 1000;
                        VastView.this.f18218m.r(f10, Math.min(i12, (int) Math.ceil(i11 / 1000.0f)), i12);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    class h implements TextureView.SurfaceTextureListener {
        h() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            f2.c.a(VastView.this.f18199b, "onSurfaceTextureAvailable", new Object[0]);
            VastView.this.f18205e = new Surface(surfaceTexture);
            VastView.this.F = true;
            if (VastView.this.G) {
                VastView.this.G = false;
                VastView.this.Z0("onSurfaceTextureAvailable");
            } else if (VastView.this.C0()) {
                VastView vastView = VastView.this;
                vastView.f18220o.setSurface(vastView.f18205e);
                VastView.this.V0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            f2.c.a(VastView.this.f18199b, "onSurfaceTextureDestroyed", new Object[0]);
            VastView vastView = VastView.this;
            vastView.f18205e = null;
            vastView.F = false;
            if (VastView.this.C0()) {
                VastView.this.f18220o.setSurface(null);
                VastView.this.K0();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            f2.c.a(VastView.this.f18199b, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class i implements MediaPlayer.OnCompletionListener {
        i() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            f2.c.a(VastView.this.f18199b, "MediaPlayer - onCompletion", new Object[0]);
            VastView.this.o0();
        }
    }

    class j implements MediaPlayer.OnErrorListener {
        j() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            VastView.this.V(b2.b.f(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i10), Integer.valueOf(i11))));
            return true;
        }
    }

    class k implements MediaPlayer.OnPreparedListener {
        k() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f2.c.a(VastView.this.f18199b, "MediaPlayer - onPrepared", new Object[0]);
            VastView vastView = VastView.this;
            if (vastView.f18227v.f18244k) {
                return;
            }
            vastView.X(f2.a.creativeView);
            VastView.this.X(f2.a.fullscreen);
            VastView.this.l1();
            VastView.this.setLoadingViewVisibility(false);
            VastView.this.I = true;
            if (!VastView.this.f18227v.f18241h) {
                mediaPlayer.start();
                VastView.this.d1();
            }
            VastView.this.j1();
            int i10 = VastView.this.f18227v.f18238e;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
                VastView.this.X(f2.a.resume);
                VastView.r0(VastView.this);
            }
            VastView vastView2 = VastView.this;
            if (!vastView2.f18227v.f18247n) {
                vastView2.K0();
            }
            VastView vastView3 = VastView.this;
            if (vastView3.f18227v.f18245l) {
                return;
            }
            vastView3.s0();
            if (VastView.this.f18226u.Z()) {
                VastView.this.C(false);
            }
        }
    }

    class l implements MediaPlayer.OnVideoSizeChangedListener {
        l() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            f2.c.a(VastView.this.f18199b, "onVideoSizeChanged", new Object[0]);
            VastView.this.B = i10;
            VastView.this.C = i11;
            VastView.this.b0();
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VastView.this.C0() || VastView.this.f18227v.f18244k) {
                VastView.this.b1();
            }
        }
    }

    class n implements l.b {
        n() {
        }

        @Override // f2.l.b
        public void a(boolean z10) {
            VastView.this.n1();
        }
    }

    class o implements View.OnTouchListener {
        o() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.N.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    class p extends WebChromeClient {
        p() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            f2.c.a("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            f2.c.a("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            f2.c.a("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    class q extends WebViewClient {
        q() {
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
                VastView.this.N.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!VastView.this.N.contains(webView)) {
                return true;
            }
            f2.c.a(VastView.this.f18199b, "banner clicked", new Object[0]);
            VastView vastView = VastView.this;
            vastView.H(vastView.f18222q, str);
            return true;
        }
    }

    class r implements f2.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b2.a f18271b;

        r(boolean z10, b2.a aVar) {
            this.f18270a = z10;
            this.f18271b = aVar;
        }

        @Override // f2.n
        public void a(f2.e eVar, VastAd vastAd) {
            VastView.this.v(eVar, vastAd, this.f18270a);
        }

        @Override // f2.n
        public void b(f2.e eVar, b2.b bVar) {
            VastView vastView = VastView.this;
            vastView.P(vastView.f18228w, eVar, b2.b.i(String.format("Error loading video after showing with %s - %s", this.f18271b, bVar)));
        }
    }

    class s implements a.d {
        s() {
        }

        @Override // j2.a.d
        public void b() {
            VastView vastView = VastView.this;
            vastView.P(vastView.f18228w, VastView.this.f18226u, b2.b.i("Close button clicked"));
        }

        @Override // j2.a.d
        public void c() {
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.x0();
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f2.e eVar = VastView.this.f18226u;
            if (eVar != null && eVar.R()) {
                VastView vastView = VastView.this;
                if (!vastView.f18227v.f18246m && vastView.x0()) {
                    return;
                }
            }
            if (VastView.this.H) {
                VastView.this.h0();
            } else {
                VastView.this.u0();
            }
        }
    }

    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.b();
        }
    }

    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.T0();
        }
    }

    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.x0();
        }
    }

    class y extends c0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WeakReference f18279g;

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
                VastView.this.f18203d.setVisibility(8);
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
        y(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f18279g = weakReference;
        }

        @Override // com.explorestack.iab.vast.activity.VastView.c0
        void d(Bitmap bitmap) {
            View.OnClickListener cVar;
            ImageView imageView = (ImageView) this.f18279g.get();
            if (imageView != null) {
                if (bitmap == null) {
                    cVar = new a();
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                    cVar = new c();
                }
                imageView.setOnClickListener(cVar);
            }
        }
    }

    static class z extends View.BaseSavedState {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b0 f18284b;

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
            this.f18284b = (b0) parcel.readParcelable(b0.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f18284b, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VastView(Context context) {
        this(context, null);
    }

    private void A(List list) {
        if (B0()) {
            if (list == null || list.size() == 0) {
                f2.c.a(this.f18199b, "\turl list is null", new Object[0]);
            } else {
                this.f18226u.B(list, null);
            }
        }
    }

    private void B(Map map, f2.a aVar) {
        if (map == null || map.size() <= 0) {
            f2.c.a(this.f18199b, "Processing Event - fail: %s (tracking event map is null or empty)", aVar);
        } else {
            A((List) map.get(aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z10) {
        if (B0()) {
            m mVar = null;
            if (!z10) {
                h2.g gVarL = this.f18226u.M().l(getAvailableWidth(), getAvailableHeight());
                if (this.f18223r != gVarL) {
                    this.A = (gVarL == null || !this.f18226u.a0()) ? this.f18231z : e2.g.B(gVarL.f0(), gVarL.b0());
                    this.f18223r = gVarL;
                    com.explorestack.iab.mraid.b bVar = this.f18225t;
                    if (bVar != null) {
                        bVar.m();
                        this.f18225t = null;
                    }
                }
            }
            if (this.f18223r == null) {
                if (this.f18224s == null) {
                    this.f18224s = j(getContext());
                    return;
                }
                return;
            }
            if (this.f18225t == null) {
                R0();
                String strD0 = this.f18223r.d0();
                if (strD0 == null) {
                    L(b2.b.a("Companion creative is null"));
                    return;
                }
                h2.e eVarH = this.f18226u.M().h();
                h2.o oVarI = eVarH != null ? eVarH.i() : null;
                b.a aVarK = com.explorestack.iab.mraid.b.s().d(null).e(b2.a.FullLoad).g(this.f18226u.D()).b(this.f18226u.Q()).j(false).c(this.f18229x).k(new a0(this, mVar));
                if (oVarI != null) {
                    aVarK.f(oVarI.d());
                    aVarK.h(oVarI.v());
                    aVarK.l(oVarI.x());
                    aVarK.o(oVarI.m());
                    aVarK.i(oVarI.Z());
                    aVarK.n(oVarI.a0());
                    if (oVarI.b0()) {
                        aVarK.b(true);
                    }
                    aVarK.p(oVarI.r());
                    aVarK.q(oVarI.o());
                }
                try {
                    com.explorestack.iab.mraid.b bVarA = aVarK.a(getContext());
                    this.f18225t = bVarA;
                    bVarA.r(strD0);
                } catch (Throwable th2) {
                    L(b2.b.j("Exception during companion creation", th2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(f2.e eVar) {
        return eVar.O() != f2.j.Rewarded || eVar.I() <= 0;
    }

    private boolean G(f2.e eVar, Boolean bool, boolean z10) {
        a1();
        if (!z10) {
            this.f18227v = new b0();
        }
        if (bool != null) {
            this.f18227v.f18239f = bool.booleanValue();
        }
        this.f18226u = eVar;
        if (eVar == null) {
            h0();
            f2.c.c(this.f18199b, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAdM = eVar.M();
        if (vastAdM == null) {
            h0();
            f2.c.c(this.f18199b, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        b2.a aVarC = eVar.C();
        if (aVarC == b2.a.PartialLoad && !E0()) {
            u(eVar, vastAdM, aVarC, z10);
            return true;
        }
        if (aVarC != b2.a.Stream || E0()) {
            v(eVar, vastAdM, z10);
            return true;
        }
        u(eVar, vastAdM, aVarC, z10);
        eVar.W(getContext().getApplicationContext(), null);
        return true;
    }

    private void G0() {
        f2.c.a(this.f18199b, "finishVideoPlaying", new Object[0]);
        a1();
        f2.e eVar = this.f18226u;
        if (eVar == null || eVar.P() || !(this.f18226u.M().h() == null || this.f18226u.M().h().i().c0())) {
            h0();
            return;
        }
        if (D0()) {
            X(f2.a.close);
        }
        setLoadingViewVisibility(false);
        P0();
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(h2.g gVar, String str) {
        f2.e eVar = this.f18226u;
        ArrayList arrayList = null;
        VastAd vastAdM = eVar != null ? eVar.M() : null;
        ArrayList arrayListR = vastAdM != null ? vastAdM.r() : null;
        List listA0 = gVar != null ? gVar.a0() : null;
        if (arrayListR != null || listA0 != null) {
            arrayList = new ArrayList();
            if (listA0 != null) {
                arrayList.addAll(listA0);
            }
            if (arrayListR != null) {
                arrayList.addAll(arrayListR);
            }
        }
        return I(arrayList, str);
    }

    private boolean I(List list, String str) {
        f2.c.a(this.f18199b, "processClickThroughEvent: %s", str);
        this.f18227v.f18246m = true;
        if (str == null) {
            return false;
        }
        A(list);
        if (this.f18228w != null && this.f18226u != null) {
            K0();
            setLoadingViewVisibility(true);
            this.f18228w.d(this, this.f18226u, this, str);
        }
        return true;
    }

    private void I0() {
        if (this.f18224s != null) {
            R0();
        } else {
            com.explorestack.iab.mraid.b bVar = this.f18225t;
            if (bVar != null) {
                bVar.m();
                this.f18225t = null;
                this.f18223r = null;
            }
        }
        this.H = false;
    }

    static /* synthetic */ int J0(VastView vastView) {
        int i10 = vastView.U;
        vastView.U = i10 + 1;
        return i10;
    }

    private void K() {
        c0 c0Var = this.f18230y;
        if (c0Var != null) {
            c0Var.b();
            this.f18230y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        if (!C0() || this.f18227v.f18241h) {
            return;
        }
        f2.c.a(this.f18199b, "pausePlayback", new Object[0]);
        b0 b0Var = this.f18227v;
        b0Var.f18241h = true;
        b0Var.f18238e = this.f18220o.getCurrentPosition();
        this.f18220o.pause();
        U();
        l();
        X(f2.a.pause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(b2.b bVar) {
        f2.e eVar;
        f2.c.c(this.f18199b, "handleCompanionShowError - %s", bVar);
        w(f2.g.f71916m);
        x(this.f18228w, this.f18226u, bVar);
        if (this.f18223r != null) {
            I0();
            R(true);
            return;
        }
        f2.i iVar = this.f18228w;
        if (iVar == null || (eVar = this.f18226u) == null) {
            return;
        }
        iVar.c(this, eVar, z0());
    }

    private void M0() {
        f2.i iVar;
        f2.c.c(this.f18199b, "performVideoCloseClick", new Object[0]);
        a1();
        if (this.J) {
            h0();
            return;
        }
        if (!this.f18227v.f18242i) {
            X(f2.a.skip);
        }
        f2.e eVar = this.f18226u;
        if (eVar != null && eVar.O() == f2.j.Rewarded && (iVar = this.f18228w) != null) {
            iVar.a(this, this.f18226u);
        }
        G0();
    }

    private void N0() {
        try {
            if (!B0() || this.f18227v.f18244k) {
                return;
            }
            if (this.f18220o == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f18220o = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.f18220o.setAudioStreamType(3);
                this.f18220o.setOnCompletionListener(this.f18200b0);
                this.f18220o.setOnErrorListener(this.f18202c0);
                this.f18220o.setOnPreparedListener(this.f18204d0);
                this.f18220o.setOnVideoSizeChangedListener(this.f18206e0);
            }
            this.f18220o.setSurface(this.f18205e);
            Uri uriE = E0() ? this.f18226u.E() : null;
            if (uriE == null) {
                setLoadingViewVisibility(true);
                this.f18220o.setDataSource(this.f18226u.M().p().P());
            } else {
                setLoadingViewVisibility(false);
                this.f18220o.setDataSource(getContext(), uriE);
            }
            this.f18220o.prepareAsync();
        } catch (Exception e10) {
            f2.c.b(this.f18199b, e10);
            V(b2.b.j("Exception during preparing MediaPlayer", e10));
        }
    }

    private void O(f2.a aVar) {
        f2.c.a(this.f18199b, "Track Companion Event: %s", aVar);
        h2.g gVar = this.f18223r;
        if (gVar != null) {
            B(gVar.e0(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(f2.i iVar, f2.e eVar, b2.b bVar) {
        x(iVar, eVar, bVar);
        if (iVar == null || eVar == null) {
            return;
        }
        iVar.c(this, eVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        View view = this.f18221p;
        if (view != null) {
            e2.g.F(view);
            this.f18221p = null;
        }
    }

    private void Q(f2.k kVar) {
        if (kVar != null && !kVar.v().J().booleanValue()) {
            e2.k kVar2 = this.f18213i;
            if (kVar2 != null) {
                kVar2.m();
                return;
            }
            return;
        }
        if (this.f18213i == null) {
            e2.k kVar3 = new e2.k(null);
            this.f18213i = kVar3;
            this.O.add(kVar3);
        }
        this.f18213i.f(getContext(), this.f18207f, k(kVar, kVar != null ? kVar.v() : null));
    }

    private void R(boolean z10) {
        VastView vastView;
        f2.i iVar;
        if (!B0() || this.H) {
            return;
        }
        this.H = true;
        this.f18227v.f18244k = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.A;
        if (i10 != i11 && (iVar = this.f18228w) != null) {
            iVar.b(this, this.f18226u, i11);
        }
        e2.p pVar = this.f18218m;
        if (pVar != null) {
            pVar.m();
        }
        e2.o oVar = this.f18216k;
        if (oVar != null) {
            oVar.m();
        }
        e2.q qVar = this.f18215j;
        if (qVar != null) {
            qVar.m();
        }
        l();
        if (this.f18227v.f18248o) {
            if (this.f18224s == null) {
                this.f18224s = j(getContext());
            }
            this.f18224s.setImageBitmap(this.f18201c.getBitmap());
            addView(this.f18224s, new FrameLayout.LayoutParams(-1, -1));
            this.f18207f.bringToFront();
            return;
        }
        C(z10);
        if (this.f18223r == null) {
            setCloseControlsVisible(true);
            if (this.f18224s != null) {
                vastView = this;
                vastView.f18230y = vastView.new y(getContext(), this.f18226u.E(), this.f18226u.M().p().P(), new WeakReference(this.f18224s));
            } else {
                vastView = this;
            }
            addView(vastView.f18224s, new FrameLayout.LayoutParams(-1, -1));
        } else {
            vastView = this;
            setCloseControlsVisible(false);
            vastView.f18203d.setVisibility(8);
            P0();
            e2.l lVar = vastView.f18219n;
            if (lVar != null) {
                lVar.d(8);
            }
            com.explorestack.iab.mraid.b bVar = vastView.f18225t;
            if (bVar == null) {
                setLoadingViewVisibility(false);
                L(b2.b.f("CompanionInterstitial is null"));
            } else if (bVar.p()) {
                setLoadingViewVisibility(false);
                vastView.f18225t.t(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        a1();
        vastView.f18207f.bringToFront();
        O(f2.a.creativeView);
    }

    private void R0() {
        if (this.f18224s != null) {
            K();
            removeView(this.f18224s);
            this.f18224s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        if (B0()) {
            b0 b0Var = this.f18227v;
            b0Var.f18244k = false;
            b0Var.f18238e = 0;
            I0();
            w0(this.f18226u.M().h());
            Z0("restartPlayback");
        }
    }

    private void U() {
        removeCallbacks(this.Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(b2.b bVar) {
        f2.c.c(this.f18199b, "handlePlaybackError - %s", bVar);
        this.J = true;
        w(f2.g.f71915l);
        x(this.f18228w, this.f18226u, bVar);
        G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0() {
        b0 b0Var = this.f18227v;
        if (!b0Var.f18247n) {
            if (C0()) {
                this.f18220o.start();
                this.f18220o.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f18227v.f18244k) {
                    return;
                }
                Z0("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (b0Var.f18241h && this.D) {
            f2.c.a(this.f18199b, "resumePlayback", new Object[0]);
            this.f18227v.f18241h = false;
            if (!C0()) {
                if (this.f18227v.f18244k) {
                    return;
                }
                Z0("resumePlayback");
            } else {
                this.f18220o.start();
                l1();
                d1();
                setLoadingViewVisibility(false);
                X(f2.a.resume);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(f2.a aVar) {
        f2.c.a(this.f18199b, "Track Event: %s", aVar);
        f2.e eVar = this.f18226u;
        VastAd vastAdM = eVar != null ? eVar.M() : null;
        if (vastAdM != null) {
            B(vastAdM.q(), aVar);
        }
    }

    private void X0() {
        R(false);
    }

    private void Y(f2.k kVar) {
        if (kVar == null || !kVar.j()) {
            return;
        }
        this.O.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        setMute(!this.f18227v.f18240g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        int i10;
        int i11 = this.B;
        if (i11 == 0 || (i10 = this.C) == 0) {
            f2.c.a(this.f18199b, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f18201c.a(i11, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((e2.m) it.next()).q();
        }
    }

    private void d0(f2.k kVar) {
        if (kVar == null || kVar.x().J().booleanValue()) {
            if (this.f18217l == null) {
                this.f18217l = new e2.n(null);
            }
            this.f18217l.f(getContext(), this, k(kVar, kVar != null ? kVar.x() : null));
        } else {
            e2.n nVar = this.f18217l;
            if (nVar != null) {
                nVar.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1() {
        g1();
        U();
        this.Q.run();
    }

    private void g1() {
        this.T.clear();
        this.U = 0;
        this.V = 0.0f;
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        f2.e eVar;
        f2.c.c(this.f18199b, "handleClose", new Object[0]);
        X(f2.a.close);
        f2.i iVar = this.f18228w;
        if (iVar == null || (eVar = this.f18226u) == null) {
            return;
        }
        iVar.c(this, eVar, z0());
    }

    private void h1() {
        boolean z10;
        boolean z11;
        if (this.K) {
            z10 = true;
            if (D0() || this.H) {
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z11 = false;
            z10 = false;
        }
        e2.j jVar = this.f18211h;
        if (jVar != null) {
            jVar.d(z10 ? 0 : 8);
        }
        e2.k kVar = this.f18213i;
        if (kVar != null) {
            kVar.d(z11 ? 0 : 8);
        }
    }

    private View i(Context context, h2.g gVar) {
        boolean zU = e2.g.u(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(e2.g.k(context, gVar.f0() > 0 ? gVar.f0() : zU ? 728.0f : 320.0f), e2.g.k(context, gVar.b0() > 0 ? gVar.b0() : zU ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(e2.g.m());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f18210g0);
        webView.setWebViewClient(this.f18214i0);
        webView.setWebChromeClient(this.f18212h0);
        String strC0 = gVar.c0();
        if (strC0 != null) {
            webView.loadDataWithBaseURL("", strC0, "text/html", D5.N, null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(e2.g.m());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void i0(f2.k kVar) {
        if (kVar != null && !kVar.n().J().booleanValue()) {
            e2.o oVar = this.f18216k;
            if (oVar != null) {
                oVar.m();
                return;
            }
            return;
        }
        if (this.f18216k == null) {
            e2.o oVar2 = new e2.o(new v());
            this.f18216k = oVar2;
            this.O.add(oVar2);
        }
        this.f18216k.f(getContext(), this.f18207f, k(kVar, kVar != null ? kVar.n() : null));
    }

    private ImageView j(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1() {
        e2.o oVar;
        MediaPlayer mediaPlayer;
        float f10;
        if (!C0() || (oVar = this.f18216k) == null) {
            return;
        }
        oVar.s(this.f18227v.f18240g);
        if (this.f18227v.f18240g) {
            mediaPlayer = this.f18220o;
            f10 = 0.0f;
        } else {
            mediaPlayer = this.f18220o;
            f10 = 1.0f;
        }
        mediaPlayer.setVolume(f10, f10);
    }

    private e2.e k(f2.k kVar, e2.e eVar) {
        if (kVar == null) {
            return null;
        }
        if (eVar == null) {
            eVar = new e2.e();
            eVar.a0(kVar.s());
        } else {
            if (!eVar.H()) {
                eVar.a0(kVar.s());
            }
            if (eVar.G()) {
                return eVar;
            }
        }
        eVar.N(kVar.g());
        return eVar;
    }

    private void l() {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            ((e2.m) it.next()).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        f2.e eVar;
        f2.c.c(this.f18199b, "handleCompanionClose", new Object[0]);
        O(f2.a.close);
        f2.i iVar = this.f18228w;
        if (iVar == null || (eVar = this.f18226u) == null) {
            return;
        }
        iVar.c(this, eVar, z0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l1() {
        if (B0()) {
            b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(b2.b bVar) {
        f2.c.c(this.f18199b, "handleCompanionExpired - %s", bVar);
        w(f2.g.f71916m);
        if (this.f18223r != null) {
            I0();
            C(true);
        }
    }

    private void n0(f2.k kVar) {
        this.f18209g.setCountDownStyle(k(kVar, kVar != null ? kVar.v() : null));
        if (A0()) {
            this.f18209g.setCloseStyle(k(kVar, kVar != null ? kVar.d() : null));
            this.f18209g.setCloseClickListener(new s());
        }
        d0(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        if (!this.D || !f2.l.f(getContext())) {
            K0();
            return;
        }
        if (this.E) {
            this.E = false;
            Z0("onWindowFocusChanged");
        } else if (this.f18227v.f18244k) {
            setLoadingViewVisibility(false);
        } else {
            V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        f2.c.a(this.f18199b, "handleComplete", new Object[0]);
        b0 b0Var = this.f18227v;
        b0Var.f18243j = true;
        if (!this.J && !b0Var.f18242i) {
            b0Var.f18242i = true;
            f2.i iVar = this.f18228w;
            if (iVar != null) {
                iVar.a(this, this.f18226u);
            }
            f2.e eVar = this.f18226u;
            if (eVar != null && eVar.S() && !this.f18227v.f18246m) {
                x0();
            }
            X(f2.a.complete);
        }
        if (this.f18227v.f18242i) {
            G0();
        }
    }

    private void q0(f2.k kVar) {
        if (kVar != null && !kVar.m().J().booleanValue()) {
            e2.p pVar = this.f18218m;
            if (pVar != null) {
                pVar.m();
                return;
            }
            return;
        }
        if (this.f18218m == null) {
            e2.p pVar2 = new e2.p(null);
            this.f18218m = pVar2;
            this.O.add(pVar2);
        }
        this.f18218m.f(getContext(), this.f18207f, k(kVar, kVar != null ? kVar.m() : null));
        this.f18218m.r(0.0f, 0, 0);
    }

    static /* synthetic */ f2.d r0(VastView vastView) {
        vastView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        f2.c.a(this.f18199b, "handleImpressions", new Object[0]);
        f2.e eVar = this.f18226u;
        if (eVar != null) {
            this.f18227v.f18245l = true;
            A(eVar.M().o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        this.K = z10;
        h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        e2.n nVar = this.f18217l;
        if (nVar == null) {
            return;
        }
        if (!z10) {
            nVar.d(8);
        } else {
            nVar.d(0);
            this.f18217l.c();
        }
    }

    private void setMute(boolean z10) {
        this.f18227v.f18240g = z10;
        j1();
        X(this.f18227v.f18240g ? f2.a.mute : f2.a.unmute);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        j2.a aVar = this.f18209g;
        f2.e eVar = this.f18226u;
        aVar.n(z10, eVar != null ? eVar.J() : 3.0f);
    }

    private void t(f2.a aVar) {
        f2.c.a(this.f18199b, "Track Banner Event: %s", aVar);
        h2.g gVar = this.f18222q;
        if (gVar != null) {
            B(gVar.e0(), aVar);
        }
    }

    private void t0(f2.k kVar) {
        if (kVar == null || !kVar.h().J().booleanValue()) {
            e2.q qVar = this.f18215j;
            if (qVar != null) {
                qVar.m();
                return;
            }
            return;
        }
        if (this.f18215j == null) {
            e2.q qVar2 = new e2.q(new w());
            this.f18215j = qVar2;
            this.O.add(qVar2);
        }
        this.f18215j.f(getContext(), this.f18207f, k(kVar, kVar.h()));
    }

    private void u(f2.e eVar, VastAd vastAd, b2.a aVar, boolean z10) {
        eVar.Y(new r(z10, aVar));
        n0(vastAd.h());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(f2.e eVar, VastAd vastAd, boolean z10) {
        h2.e eVarH = vastAd.h();
        this.f18231z = eVar.K();
        this.f18222q = (eVarH == null || !eVarH.t().J().booleanValue()) ? null : eVarH.Y();
        if (this.f18222q == null) {
            this.f18222q = vastAd.i(getContext());
        }
        w0(eVarH);
        z(eVarH, this.f18221p != null);
        y(eVarH);
        Q(eVarH);
        i0(eVarH);
        t0(eVarH);
        q0(eVarH);
        d0(eVarH);
        Y(eVarH);
        setLoadingViewVisibility(false);
        f2.i iVar = this.f18228w;
        if (iVar != null) {
            iVar.b(this, eVar, this.f18227v.f18244k ? this.A : this.f18231z);
        }
        if (!z10) {
            this.f18227v.f18235b = eVar.H();
            b0 b0Var = this.f18227v;
            b0Var.f18247n = this.L;
            b0Var.f18248o = this.M;
            if (eVarH != null) {
                b0Var.f18240g = eVarH.Z();
            }
            this.f18227v.f18236c = eVar.G();
            f2.i iVar2 = this.f18228w;
            if (iVar2 != null) {
                iVar2.e(this, eVar);
            }
        }
        setCloseControlsVisible(F(eVar));
        Z0("load (restoring: " + z10 + ")");
    }

    private void w(f2.g gVar) {
        f2.e eVar = this.f18226u;
        if (eVar != null) {
            eVar.X(gVar);
        }
    }

    private void w0(f2.k kVar) {
        e2.e eVarG;
        e2.e eVarG2 = e2.a.f68804q;
        if (kVar != null) {
            eVarG2 = eVarG2.g(kVar.q());
        }
        if (kVar == null || !kVar.j()) {
            this.f18203d.setOnClickListener(null);
            this.f18203d.setClickable(false);
        } else {
            this.f18203d.setOnClickListener(new x());
        }
        this.f18203d.setBackgroundColor(eVarG2.i().intValue());
        P0();
        if (this.f18222q == null || this.f18227v.f18244k) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f18203d.setLayoutParams(layoutParams);
            return;
        }
        this.f18221p = i(getContext(), this.f18222q);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f18221p.getLayoutParams());
        if ("inline".equals(eVarG2.D())) {
            eVarG = e2.a.f68799l;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (eVarG2.n().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f18221p.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f18221p.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (eVarG2.E().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f18221p.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f18221p.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            e2.e eVar = e2.a.f68798k;
            layoutParams2.addRule(13);
            eVarG = eVar;
        }
        if (kVar != null) {
            eVarG = eVarG.g(kVar.t());
        }
        eVarG.c(getContext(), this.f18221p);
        eVarG.b(getContext(), layoutParams3);
        eVarG.d(layoutParams3);
        this.f18221p.setBackgroundColor(eVarG.i().intValue());
        eVarG2.c(getContext(), this.f18203d);
        eVarG2.b(getContext(), layoutParams2);
        this.f18203d.setLayoutParams(layoutParams2);
        addView(this.f18221p, layoutParams3);
        t(f2.a.creativeView);
    }

    private void x(f2.i iVar, f2.e eVar, b2.b bVar) {
        if (iVar == null || eVar == null) {
            return;
        }
        iVar.f(this, eVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x0() {
        f2.c.c(this.f18199b, "handleInfoClicked", new Object[0]);
        f2.e eVar = this.f18226u;
        if (eVar != null) {
            return I(eVar.M().k(), this.f18226u.M().j());
        }
        return false;
    }

    private void y(f2.k kVar) {
        if (kVar != null && !kVar.d().J().booleanValue()) {
            e2.j jVar = this.f18211h;
            if (jVar != null) {
                jVar.m();
                return;
            }
            return;
        }
        if (this.f18211h == null) {
            e2.j jVar2 = new e2.j(new u());
            this.f18211h = jVar2;
            this.O.add(jVar2);
        }
        this.f18211h.f(getContext(), this.f18207f, k(kVar, kVar != null ? kVar.d() : null));
    }

    private void z(f2.k kVar, boolean z10) {
        if (z10 || !(kVar == null || kVar.t().J().booleanValue())) {
            e2.l lVar = this.f18219n;
            if (lVar != null) {
                lVar.m();
                return;
            }
            return;
        }
        if (this.f18219n == null) {
            e2.l lVar2 = new e2.l(new t());
            this.f18219n = lVar2;
            this.O.add(lVar2);
        }
        this.f18219n.f(getContext(), this.f18207f, k(kVar, kVar != null ? kVar.t() : null));
    }

    public boolean A0() {
        return this.f18227v.f18239f;
    }

    public boolean B0() {
        f2.e eVar = this.f18226u;
        return (eVar == null || eVar.M() == null) ? false : true;
    }

    public boolean C0() {
        return this.f18220o != null && this.I;
    }

    public boolean D0() {
        b0 b0Var = this.f18227v;
        return b0Var.f18243j || b0Var.f18236c == 0.0f;
    }

    public boolean E0() {
        f2.e eVar = this.f18226u;
        return eVar != null && eVar.u();
    }

    public void Z0(String str) {
        f2.c.a(this.f18199b, "startPlayback: %s", str);
        if (B0()) {
            setPlaceholderViewVisible(false);
            if (this.f18227v.f18244k) {
                X0();
                return;
            }
            if (!this.D) {
                this.E = true;
                return;
            }
            if (this.F) {
                a1();
                I0();
                b0();
                N0();
                f2.l.c(this, this.f18208f0);
            } else {
                this.G = true;
            }
            if (this.f18203d.getVisibility() != 0) {
                this.f18203d.setVisibility(0);
            }
        }
    }

    @Override // e2.c
    public void a() {
        if (y0()) {
            setLoadingViewVisibility(false);
        } else if (this.D) {
            V0();
        } else {
            K0();
        }
    }

    public void a1() {
        this.f18227v.f18241h = false;
        if (this.f18220o != null) {
            f2.c.a(this.f18199b, "stopPlayback", new Object[0]);
            try {
                if (this.f18220o.isPlaying()) {
                    this.f18220o.stop();
                }
                this.f18220o.setSurface(null);
                this.f18220o.release();
            } catch (Exception e10) {
                f2.c.b(this.f18199b, e10);
            }
            this.f18220o = null;
            this.I = false;
            this.J = false;
            U();
            f2.l.b(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f18207f.bringToFront();
    }

    @Override // e2.c
    public void d() {
        if (C0()) {
            V0();
        } else if (y0()) {
            l0();
        } else {
            X0();
        }
    }

    public void e0() {
        com.explorestack.iab.mraid.b bVar = this.f18225t;
        if (bVar != null) {
            bVar.m();
            this.f18225t = null;
            this.f18223r = null;
        }
        this.f18228w = null;
        this.f18229x = null;
        c0 c0Var = this.f18230y;
        if (c0Var != null) {
            c0Var.b();
            this.f18230y = null;
        }
    }

    public boolean f0(f2.e eVar, Boolean bool) {
        return G(eVar, bool, false);
    }

    @Nullable
    public f2.i getListener() {
        return this.f18228w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D) {
            Z0("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (B0()) {
            w0(this.f18226u.M().h());
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
        b0 b0Var = zVar.f18284b;
        if (b0Var != null) {
            this.f18227v = b0Var;
        }
        f2.e eVarA = f2.m.a(this.f18227v.f18235b);
        if (eVarA != null) {
            G(eVarA, null, true);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (C0()) {
            this.f18227v.f18238e = this.f18220o.getCurrentPosition();
        }
        z zVar = new z(super.onSaveInstanceState());
        zVar.f18284b = this.f18227v;
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        removeCallbacks(this.P);
        post(this.P);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        f2.c.a(this.f18199b, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.D = z10;
        n1();
    }

    public void setCanAutoResume(boolean z10) {
        this.L = z10;
        this.f18227v.f18247n = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.M = z10;
        this.f18227v.f18248o = z10;
    }

    public void setListener(@Nullable f2.i iVar) {
        this.f18228w = iVar;
    }

    public void setPostBannerAdMeasurer(@Nullable d2.b bVar) {
        this.f18229x = bVar != null ? new a(this, bVar) : null;
    }

    public void u0() {
        if (this.f18209g.m() && this.f18209g.k()) {
            P(this.f18228w, this.f18226u, b2.b.i("OnBackPress event fired"));
            return;
        }
        if (D0()) {
            if (!y0()) {
                M0();
                return;
            }
            f2.e eVar = this.f18226u;
            if (eVar == null || eVar.O() != f2.j.NonRewarded) {
                return;
            }
            if (this.f18223r == null) {
                h0();
                return;
            }
            com.explorestack.iab.mraid.b bVar = this.f18225t;
            if (bVar != null) {
                bVar.n();
            } else {
                l0();
            }
        }
    }

    public boolean y0() {
        return this.f18227v.f18244k;
    }

    public boolean z0() {
        f2.e eVar = this.f18226u;
        if (eVar == null) {
            return false;
        }
        if (eVar.D() == 0.0f && this.f18227v.f18242i) {
            return true;
        }
        return this.f18226u.D() > 0.0f && this.f18227v.f18244k;
    }

    public VastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VastView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18199b = "VastView-" + Integer.toHexString(hashCode());
        this.f18227v = new b0();
        this.f18231z = 0;
        this.A = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = false;
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new c();
        this.Q = new d();
        this.R = new e();
        this.S = new f();
        this.T = new LinkedList();
        this.U = 0;
        this.V = 0.0f;
        this.W = new g();
        h hVar = new h();
        this.f18198a0 = hVar;
        this.f18200b0 = new i();
        this.f18202c0 = new j();
        this.f18204d0 = new k();
        this.f18206e0 = new l();
        this.f18208f0 = new n();
        this.f18210g0 = new o();
        this.f18212h0 = new p();
        this.f18214i0 = new q();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setOnClickListener(new m());
        i2.e eVar = new i2.e(context);
        this.f18201c = eVar;
        eVar.setSurfaceTextureListener(hVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18203d = frameLayout;
        frameLayout.addView(this.f18201c, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f18203d, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18207f = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f18207f, new ViewGroup.LayoutParams(-1, -1));
        j2.a aVar = new j2.a(getContext());
        this.f18209g = aVar;
        aVar.setBackgroundColor(0);
        addView(this.f18209g, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setAdMeasurer(@Nullable d2.c cVar) {
    }

    public void setPlaybackListener(@Nullable f2.d dVar) {
    }
}
