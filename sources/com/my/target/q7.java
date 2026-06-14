package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.k;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.qb;
import com.my.target.y;
import com.my.target.z;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class q7 implements y.a, k.a, qb.d, z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8 f60632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5 f60633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VideoData f60634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f60635d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7 f60636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cc f60637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q8 f60638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f60639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference f60640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f60641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y f60642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f60644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f60645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f60646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f60647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f60648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Uri f60649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m8 f60650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public WeakReference f60651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f60652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f60653v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f60654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f60655x;

    public final class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            if (i10 == -3) {
                q7.this.t();
                return;
            }
            if (i10 == -2 || i10 == -1) {
                q7.this.x();
                gb.a("NativeAdVideoController$AfChangeListener: Audiofocus loss, pausing");
            } else if ((i10 == 1 || i10 == 2 || i10 == 4) && q7.this.f60645n) {
                gb.a("NativeAdVideoController$AfChangeListener: Audiofocus gain, unmuting");
                q7.this.d(false);
            }
        }
    }

    public interface b {
        void a();

        void c();

        void d();

        void e();
    }

    public q7(b7 b7Var, s5 s5Var, VideoData videoData, e8 e8Var) {
        this.f60633b = s5Var;
        this.f60636e = b7Var;
        this.f60632a = e8Var;
        this.f60634c = videoData;
        this.f60644m = s5Var.h0();
        this.f60647p = s5Var.g0();
        this.f60637f = cc.a(s5Var.x());
        this.f60638g = e8Var.a(s5Var);
        String str = (String) videoData.a();
        if (str != null) {
            this.f60649r = Uri.parse(str);
        } else {
            this.f60649r = Uri.parse(videoData.getUrl());
        }
    }

    public void a(MediaAdView mediaAdView, Context context) {
        z zVar;
        WeakReference weakReference;
        gb.a("NativeAdVideoController: Register video ad with view " + mediaAdView);
        if (this.f60645n) {
            return;
        }
        WeakReference weakReference2 = this.f60639h;
        if (weakReference2 != null && weakReference2.get() == mediaAdView && (weakReference = this.f60651t) != null && weakReference.get() == context && (mediaAdView.getChildAt(1) instanceof z)) {
            zVar = (z) mediaAdView.getChildAt(1);
        } else {
            z();
            this.f60638g.a(context);
            this.f60639h = new WeakReference(mediaAdView);
            this.f60651t = new WeakReference(context);
            z zVar2 = new z(mediaAdView.getContext().getApplicationContext());
            mediaAdView.addView(zVar2, 1);
            zVar = zVar2;
        }
        zVar.setAdVideoViewListener(this);
        this.f60637f.a(zVar);
        if (this.f60644m) {
            e();
        } else {
            l();
        }
    }

    @Override // com.my.target.y.a
    public void b() {
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU != null) {
            mediaAdViewU.getProgressBarView().setVisibility(8);
            if (!this.f60654w) {
                mediaAdViewU.getPlayButtonView().setVisibility(0);
            }
        }
        this.f60653v = 0L;
    }

    public void c(boolean z10) {
        this.f60654w = z10;
    }

    @Override // com.my.target.y.a
    public void d() {
        Context context;
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU != null) {
            context = mediaAdViewU.getContext();
            if (!this.f60654w) {
                mediaAdViewU.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewU.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        x();
        if (mediaAdViewU != null) {
            a(context);
        }
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // com.my.target.y.a
    public void e() {
        WeakReference weakReference;
        qb qbVar;
        this.f60648q = 4;
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU != null) {
            if (!this.f60654w) {
                mediaAdViewU.getProgressBarView().setVisibility(0);
            }
            mediaAdViewU.getPlayButtonView().setVisibility(8);
        }
        if (!this.f60645n || (weakReference = this.f60641j) == null || (qbVar = (qb) weakReference.get()) == null) {
            return;
        }
        qbVar.d();
    }

    @Override // com.my.target.y.a
    public void f() {
    }

    @Override // com.my.target.qb.d
    public void g() {
        if (this.f60648q != 1) {
            return;
        }
        x();
        this.f60648q = 2;
        WeakReference weakReference = this.f60640i;
        if (weakReference == null || ((k) weakReference.get()) == null) {
            return;
        }
        this.f60638g.f();
    }

    @Override // com.my.target.qb.d
    public void h() {
        WeakReference weakReference = this.f60640i;
        if (weakReference != null && ((k) weakReference.get()) != null) {
            y();
            this.f60638g.i();
        }
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.my.target.qb.d
    public void j() {
        y yVar = this.f60642k;
        if (yVar == null) {
            this.f60647p = !this.f60647p;
            return;
        }
        if (yVar.g()) {
            this.f60642k.h();
            this.f60638g.b(true);
            this.f60647p = false;
        } else {
            this.f60642k.d();
            this.f60638g.b(false);
            this.f60647p = true;
        }
    }

    @Override // com.my.target.y.a
    public void l() {
        Context context;
        WeakReference weakReference;
        qb qbVar;
        this.f60646o = false;
        this.f60653v = 0L;
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU != null) {
            ImageView imageView = mediaAdViewU.getImageView();
            ImageData imageDataS = this.f60633b.s();
            if (imageDataS != null) {
                imageView.setImageBitmap(imageDataS.getBitmap());
            }
            imageView.setVisibility(0);
            if (!this.f60654w) {
                mediaAdViewU.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewU.getProgressBarView().setVisibility(8);
            context = mediaAdViewU.getContext();
        } else {
            context = null;
        }
        if (this.f60645n && (weakReference = this.f60641j) != null && (qbVar = (qb) weakReference.get()) != null) {
            qbVar.h();
            context = qbVar.getContext();
        }
        if (context != null) {
            a(context);
        }
    }

    @Override // com.my.target.qb.d
    public void m() {
        qb qbVar;
        y();
        WeakReference weakReference = this.f60641j;
        if (weakReference != null && (qbVar = (qb) weakReference.get()) != null) {
            qbVar.g();
        }
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.my.target.y.a
    public void n() {
        this.f60638g.h();
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.my.target.y.a
    public void p() {
        WeakReference weakReference;
        qb qbVar;
        if (this.f60648q == 1) {
            return;
        }
        this.f60648q = 1;
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU != null) {
            mediaAdViewU.getProgressBarView().setVisibility(8);
            mediaAdViewU.getPlayButtonView().setVisibility(8);
        }
        if (!this.f60645n || (weakReference = this.f60641j) == null || (qbVar = (qb) weakReference.get()) == null) {
            return;
        }
        if (this.f60642k != null) {
            z adVideoView = qbVar.getAdVideoView();
            adVideoView.a(this.f60634c.getWidth(), this.f60634c.getHeight());
            this.f60642k.a(adVideoView);
        }
        qbVar.f();
    }

    @Override // com.my.target.z.a
    public void q() {
        gb.a("NativeAdVideoController: Native Ad Views without hardware acceleration is not currently supported");
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.my.target.k.a
    public void r() {
        gb.a("NativeAdVideoController: Dismiss dialog");
        this.f60640i = null;
        this.f60645n = false;
        d(true);
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU == null) {
            return;
        }
        a(mediaAdViewU.getContext());
        int i10 = this.f60648q;
        if (i10 == 1) {
            this.f60648q = 4;
            p();
            if (this.f60633b.h0()) {
                this.f60644m = true;
            }
            View childAt = mediaAdViewU.getChildAt(1);
            if (childAt instanceof z) {
                a((z) childAt, true);
            }
        } else if (i10 == 2 || i10 == 3) {
            this.f60644m = false;
            l();
        } else if (i10 != 4) {
            this.f60644m = false;
        } else {
            this.f60644m = true;
            e();
            View childAt2 = mediaAdViewU.getChildAt(1);
            if (childAt2 instanceof z) {
                a((z) childAt2, true);
            }
        }
        this.f60638g.a(false);
        this.f60641j = null;
    }

    public final void s() {
        y yVar = this.f60642k;
        if (yVar == null) {
            return;
        }
        yVar.a((y.a) null);
        this.f60642k.destroy();
        this.f60642k = null;
    }

    public void t() {
        y yVar = this.f60642k;
        if (yVar == null || this.f60647p) {
            return;
        }
        yVar.c();
    }

    public final MediaAdView u() {
        WeakReference weakReference = this.f60639h;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    public void v() {
        y yVar;
        if (!this.f60643l || this.f60645n) {
            return;
        }
        this.f60643l = false;
        if (this.f60648q == 1 && (yVar = this.f60642k) != null) {
            yVar.pause();
            this.f60648q = 2;
        }
        y yVar2 = this.f60642k;
        if (yVar2 != null) {
            yVar2.a((y.a) null);
            this.f60642k.a((z) null);
        }
    }

    public void w() {
        MediaAdView mediaAdViewU = u();
        if (mediaAdViewU == null) {
            gb.a("NativeAdVideoController: Trying to play video in unregistered view");
            s();
            return;
        }
        if (mediaAdViewU.getWindowVisibility() != 0) {
            if (this.f60648q != 1) {
                s();
                return;
            }
            y yVar = this.f60642k;
            if (yVar != null) {
                this.f60653v = yVar.i();
            }
            s();
            this.f60648q = 4;
            this.f60643l = false;
            e();
            return;
        }
        if (this.f60643l) {
            return;
        }
        WeakReference weakReference = this.f60651t;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context != null) {
            a(mediaAdViewU, context);
        }
        this.f60643l = true;
        z zVar = mediaAdViewU.getChildAt(1) instanceof z ? (z) mediaAdViewU.getChildAt(1) : null;
        if (zVar == null) {
            s();
            return;
        }
        y yVar2 = this.f60642k;
        if (yVar2 != null && !this.f60649r.equals(yVar2.getUri())) {
            s();
        }
        if (!this.f60644m) {
            if (!this.f60654w) {
                mediaAdViewU.getPlayButtonView().setVisibility(0);
            }
            mediaAdViewU.getProgressBarView().setVisibility(8);
        }
        if (!this.f60644m || this.f60645n) {
            return;
        }
        y yVar3 = this.f60642k;
        if (yVar3 == null || !yVar3.b()) {
            a(zVar, true);
        } else {
            this.f60642k.a(zVar);
            zVar.a(this.f60634c.getWidth(), this.f60634c.getHeight());
            this.f60642k.a(this);
            this.f60642k.resume();
        }
        d(true);
    }

    public void x() {
        WeakReference weakReference;
        if (!this.f60645n || (weakReference = this.f60641j) == null) {
            return;
        }
        this.f60648q = 2;
        qb qbVar = (qb) weakReference.get();
        if (qbVar == null) {
            return;
        }
        y yVar = this.f60642k;
        if (yVar != null) {
            yVar.pause();
        }
        qbVar.e();
    }

    public final void y() {
        WeakReference weakReference;
        WeakReference weakReference2;
        y yVar = this.f60642k;
        if (yVar != null && yVar.b()) {
            MediaAdView mediaAdViewU = u();
            if (mediaAdViewU == null) {
                gb.a("NativeAdVideoController: Trying to play video in unregistered view");
                s();
                return;
            }
            z adVideoView = (!this.f60645n || (weakReference2 = this.f60641j) == null) ? mediaAdViewU.getChildAt(1) instanceof z ? (z) mediaAdViewU.getChildAt(1) : null : ((qb) weakReference2.get()).getAdVideoView();
            if (adVideoView == null) {
                s();
                return;
            } else {
                adVideoView.a(this.f60634c.getWidth(), this.f60634c.getHeight());
                this.f60642k.a(adVideoView);
                this.f60642k.resume();
            }
        } else if (this.f60645n && (weakReference = this.f60641j) != null) {
            a(((qb) weakReference.get()).getAdVideoView(), this.f60647p);
        }
        e();
    }

    public void z() {
        MediaAdView mediaAdView;
        v();
        this.f60637f.a((View) null);
        this.f60638g.a((Context) null);
        s();
        WeakReference weakReference = this.f60639h;
        if (weakReference == null || (mediaAdView = (MediaAdView) weakReference.get()) == null || !(mediaAdView.getChildAt(1) instanceof z)) {
            return;
        }
        mediaAdView.removeViewAt(1);
    }

    @Override // com.my.target.k.a
    public void b(boolean z10) {
        y yVar = this.f60642k;
        if (yVar == null || z10) {
            return;
        }
        this.f60653v = yVar.i();
        s();
        d();
    }

    public void b(View view) {
        WeakReference weakReference = this.f60651t;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            context = view.getContext();
        }
        b(context);
        if (this.f60654w) {
            return;
        }
        if (this.f60648q == 1) {
            this.f60648q = 4;
        }
        try {
            k.a(this, context).show();
            this.f60645n = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            gb.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            r();
        }
    }

    public void d(boolean z10) {
        y yVar = this.f60642k;
        if (yVar == null) {
            return;
        }
        if (z10) {
            yVar.d();
        } else {
            yVar.h();
        }
    }

    @Override // com.my.target.y.a
    public void a(float f10) {
        qb qbVar;
        WeakReference weakReference = this.f60641j;
        if (weakReference == null || (qbVar = (qb) weakReference.get()) == null) {
            return;
        }
        qbVar.a(f10 <= 0.0f);
    }

    @Override // com.my.target.y.a
    public void a(float f10, float f11) {
        qb qbVar;
        p();
        this.f60637f.a(f10, f11);
        this.f60638g.a(f10, f11);
        if (!this.f60646o) {
            b bVar = this.f60652u;
            if (bVar != null) {
                bVar.e();
            }
            this.f60646o = true;
        }
        float fO = this.f60633b.o();
        WeakReference weakReference = this.f60641j;
        if (weakReference != null && (qbVar = (qb) weakReference.get()) != null) {
            qbVar.a(f10, fO);
        }
        int iA = e2.a(f10, fO);
        if (iA == 1) {
            a(fO, fO);
            return;
        }
        if (this.f60642k == null) {
            return;
        }
        if (e2.a(f10, 0.0f) == 1) {
            this.f60653v = this.f60642k.i();
        }
        if (iA == -1) {
            return;
        }
        if (this.f60655x) {
            this.f60642k.f();
            return;
        }
        l();
        this.f60648q = 3;
        this.f60642k.stop();
        this.f60644m = false;
        if (this.f60652u != null) {
            this.f60638g.e();
            this.f60652u.c();
        }
        this.f60638g.c();
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.f60635d, 3, 2);
        }
    }

    @Override // com.my.target.y.a
    public void a(String str) {
        this.f60638g.g();
        VideoData videoData = (VideoData) this.f60633b.k0();
        if (videoData != null && this.f60649r.toString().equals(videoData.a())) {
            gb.a("NativeAdVideoController: Try to play video stream from URL");
            this.f60649r = Uri.parse(videoData.getUrl());
            WeakReference weakReference = this.f60651t;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            y yVar = this.f60642k;
            if (yVar == null || context == null) {
                return;
            }
            yVar.a(this.f60649r, context);
            return;
        }
        b bVar = this.f60652u;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        a(kVar, frameLayout, new qb(frameLayout.getContext()));
    }

    @Override // com.my.target.qb.d
    public void a(View view) {
        if (this.f60648q == 1) {
            y yVar = this.f60642k;
            if (yVar != null) {
                yVar.pause();
            }
            d();
        }
        m8 m8Var = this.f60650s;
        if (m8Var != null) {
            m8Var.a(view, 2);
        }
    }

    @Override // com.my.target.qb.d
    public void a() {
        WeakReference weakReference = this.f60640i;
        k kVar = weakReference == null ? null : (k) weakReference.get();
        if (kVar == null || !kVar.isShowing()) {
            return;
        }
        kVar.dismiss();
    }

    public void a(m8 m8Var) {
        this.f60650s = m8Var;
    }

    public void a(b bVar) {
        this.f60652u = bVar;
    }

    public void a(boolean z10) {
        this.f60655x = z10;
    }

    public void a(k kVar, FrameLayout frameLayout, qb qbVar) {
        this.f60648q = 4;
        this.f60640i = new WeakReference(kVar);
        qbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(qbVar);
        this.f60641j = new WeakReference(qbVar);
        qbVar.a(this.f60636e, this.f60634c);
        qbVar.setVideoDialogViewListener(this);
        qbVar.a(this.f60647p);
        this.f60638g.a(true);
        a(qbVar.getAdVideoView(), this.f60647p);
    }

    public final void a(z zVar, boolean z10) {
        if (this.f60642k == null) {
            y yVarA = this.f60632a.a();
            this.f60642k = yVarA;
            yVarA.a(this);
        }
        d(z10);
        this.f60642k.a(zVar);
        zVar.a(this.f60634c.getWidth(), this.f60634c.getHeight());
        if (!this.f60642k.isPlaying()) {
            this.f60642k.a(this.f60649r, zVar.getContext());
            long j10 = this.f60653v;
            if (j10 > 0) {
                this.f60642k.seekTo(j10);
                return;
            }
            return;
        }
        p();
    }

    public final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f60635d);
        }
    }
}
