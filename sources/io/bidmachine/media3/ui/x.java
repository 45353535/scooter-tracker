package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.media3.ui.m0;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.ui.AspectRatioFrameLayout;
import io.bidmachine.media3.ui.d;
import io.bidmachine.media3.ui.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n9.a;
import n9.a0;
import n9.e0;
import n9.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class x extends FrameLayout {
    private boolean A;
    private CharSequence B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f81801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AspectRatioFrameLayout f81802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f81803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f81804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f81805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f81806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f81807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f81808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SubtitleView f81809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f81810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TextView f81811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.bidmachine.media3.ui.d f81812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f81813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final FrameLayout f81814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f81815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f81816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Method f81817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f81818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n9.a0 f81819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f81820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d.m f81821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f81822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f81823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f81824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f81825z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements a0.d, View.OnClickListener, d.m, d.InterfaceC0984d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e0.b f81826b = new e0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f81827c;

        public c() {
        }

        @Override // n9.a0.d
        public /* synthetic */ void A(n9.k kVar) {
            n9.b0.e(this, kVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void D(n9.a0 a0Var, a0.c cVar) {
            n9.b0.g(this, a0Var, cVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void F(n9.y yVar) {
            n9.b0.s(this, yVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void M(n9.h0 h0Var) {
            n9.b0.C(this, h0Var);
        }

        @Override // n9.a0.d
        public void a(n0 n0Var) {
            if (n0Var.equals(n0.f95432e) || x.this.f81819t == null || x.this.f81819t.getPlaybackState() == 1) {
                return;
            }
            x.this.W();
        }

        @Override // n9.a0.d
        public /* synthetic */ void f(n9.v vVar) {
            n9.b0.m(this, vVar);
        }

        @Override // n9.a0.d
        public void h(p9.b bVar) {
            if (x.this.f81809j != null) {
                x.this.f81809j.setCues(bVar.f98114a);
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void j(n9.z zVar) {
            n9.b0.o(this, zVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void m(n9.t tVar) {
            n9.b0.l(this, tVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void n(a0.b bVar) {
            n9.b0.b(this, bVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            n9.b0.a(this, i10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x.this.V();
        }

        @Override // n9.a0.d
        public /* synthetic */ void onCues(List list) {
            n9.b0.c(this, list);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            n9.b0.f(this, i10, z10);
        }

        @Override // io.bidmachine.media3.ui.d.InterfaceC0984d
        public void onFullScreenModeChanged(boolean z10) {
            x.p(x.this);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            n9.b0.h(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            n9.b0.i(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            n9.b0.j(this, z10);
        }

        @Override // n9.a0.d
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            x.this.X();
            x.this.Z();
        }

        @Override // n9.a0.d
        public void onPlaybackStateChanged(int i10) {
            x.this.X();
            x.this.a0();
            x.this.Z();
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            n9.b0.q(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            n9.b0.t(this, z10, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            n9.b0.u(this, i10);
        }

        @Override // n9.a0.d
        public void onRenderedFirstFrame() {
            if (x.this.f81803d != null) {
                x.this.f81803d.setVisibility(4);
                if (x.this.C()) {
                    x.this.H();
                } else {
                    x.this.E();
                }
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            n9.b0.x(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            n9.b0.y(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            n9.b0.z(this, z10);
        }

        @Override // n9.a0.d
        public void onSurfaceSizeChanged(int i10, int i11) {
            if (o0.f98837a == 34 && (x.this.f81804e instanceof SurfaceView) && x.this.G) {
                f fVar = (f) q9.a.e(x.this.f81806g);
                Handler handler = x.this.f81815p;
                SurfaceView surfaceView = (SurfaceView) x.this.f81804e;
                final x xVar = x.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: yb.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        xVar.invalidate();
                    }
                });
            }
        }

        @Override // io.bidmachine.media3.ui.d.m
        public void onVisibilityChange(int i10) {
            x.this.Y();
            x.o(x.this);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onVolumeChanged(float f10) {
            n9.b0.F(this, f10);
        }

        @Override // n9.a0.d
        public void r(n9.i0 i0Var) {
            n9.a0 a0Var = (n9.a0) q9.a.e(x.this.f81819t);
            n9.e0 currentTimeline = a0Var.isCommandAvailable(17) ? a0Var.getCurrentTimeline() : n9.e0.f95245a;
            if (currentTimeline.q()) {
                this.f81827c = null;
            } else if (!a0Var.isCommandAvailable(30) || a0Var.getCurrentTracks().b()) {
                Object obj = this.f81827c;
                if (obj != null) {
                    int iB = currentTimeline.b(obj);
                    if (iB != -1) {
                        if (a0Var.getCurrentMediaItemIndex() == currentTimeline.f(iB, this.f81826b).f95256c) {
                            return;
                        }
                    }
                    this.f81827c = null;
                }
            } else {
                this.f81827c = currentTimeline.g(a0Var.getCurrentPeriodIndex(), this.f81826b, true).f95255b;
            }
            x.this.b0(false);
        }

        @Override // n9.a0.d
        public /* synthetic */ void t(n9.r rVar, int i10) {
            n9.b0.k(this, rVar, i10);
        }

        @Override // n9.a0.d
        public void u(a0.e eVar, a0.e eVar2, int i10) {
            if (x.this.K() && x.this.E) {
                x.this.G();
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void x(n9.e0 e0Var, int i10) {
            n9.b0.B(this, e0Var, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void y(n9.y yVar) {
            n9.b0.r(this, yVar);
        }
    }

    public interface d {
    }

    public interface e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f81829a;

        private f() {
        }

        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ void b(f fVar, SurfaceView surfaceView, Runnable runnable) {
            fVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = m0.a("exo-sync-b-334901521");
            fVar.f81829a = surfaceSyncGroupA;
            q9.a.g(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: io.bidmachine.media3.ui.z
                @Override // java.lang.Runnable
                public final void run() {
                    x.f.a();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(androidx.media3.ui.n0.a());
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f81829a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f81829a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: io.bidmachine.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    x.f.b(this.f81830b, surfaceView, runnable);
                }
            });
        }
    }

    public x(Context context) {
        this(context, null);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(o0.a0(context, resources, R$drawable.f81438a));
        imageView.setBackgroundColor(resources.getColor(R$color.f81433a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        n9.a0 a0Var = this.f81819t;
        return a0Var != null && this.f81818s != null && a0Var.isCommandAvailable(30) && a0Var.getCurrentTracks().c(4);
    }

    private boolean D() {
        n9.a0 a0Var = this.f81819t;
        return a0Var != null && a0Var.isCommandAvailable(30) && a0Var.getCurrentTracks().c(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f81807h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void F() {
        ImageView imageView = this.f81808i;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f81808i.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f81807h;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean I(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean J() {
        Drawable drawable;
        ImageView imageView = this.f81807h;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        n9.a0 a0Var = this.f81819t;
        return a0Var != null && a0Var.isCommandAvailable(16) && this.f81819t.isPlayingAd() && this.f81819t.getPlayWhenReady();
    }

    private void L(boolean z10) {
        if (!(K() && this.E) && e0()) {
            boolean z11 = this.f81812m.c0() && this.f81812m.getShowTimeoutMs() <= 0;
            boolean zR = R();
            if (z10 || z11 || zR) {
                T(zR);
            }
        }
    }

    private void N(final Bitmap bitmap) {
        this.f81815p.post(new Runnable() { // from class: yb.j
            @Override // java.lang.Runnable
            public final void run() {
                x.a(this.f118906b, bitmap);
            }
        });
    }

    private boolean O(n9.a0 a0Var) {
        byte[] bArr;
        if (a0Var == null || !a0Var.isCommandAvailable(18) || (bArr = a0Var.getMediaMetadata().f95615i) == null) {
            return false;
        }
        return P(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean P(Drawable drawable) {
        if (this.f81808i != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f81822w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                M(this.f81802c, width);
                this.f81808i.setScaleType(scaleType);
                this.f81808i.setImageDrawable(drawable);
                this.f81808i.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void Q(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean R() {
        n9.a0 a0Var = this.f81819t;
        if (a0Var == null) {
            return true;
        }
        int playbackState = a0Var.getPlaybackState();
        if (!this.D) {
            return false;
        }
        if (this.f81819t.isCommandAvailable(17) && this.f81819t.getCurrentTimeline().q()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((n9.a0) q9.a.e(this.f81819t)).getPlayWhenReady();
    }

    private void T(boolean z10) {
        if (e0()) {
            this.f81812m.setShowTimeoutMs(z10 ? 0 : this.C);
            this.f81812m.m0();
        }
    }

    private void U() {
        ImageView imageView = this.f81807h;
        if (imageView != null) {
            imageView.setVisibility(0);
            c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (!e0() || this.f81819t == null) {
            return;
        }
        if (!this.f81812m.c0()) {
            L(true);
        } else if (this.F) {
            this.f81812m.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        n9.a0 a0Var = this.f81819t;
        n0 videoSize = a0Var != null ? a0Var.getVideoSize() : n0.f95432e;
        int i10 = videoSize.f95436a;
        int i11 = videoSize.f95437b;
        M(this.f81802c, this.f81805f ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f95439d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void X() {
        /*
            r4 = this;
            android.view.View r0 = r4.f81810k
            if (r0 == 0) goto L2b
            n9.a0 r0 = r4.f81819t
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f81825z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            n9.a0 r0 = r4.f81819t
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f81810k
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.x.X():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        io.bidmachine.media3.ui.d dVar = this.f81812m;
        if (dVar == null || !this.f81820u) {
            setContentDescription(null);
        } else if (dVar.c0()) {
            setContentDescription(this.F ? getResources().getString(R$string.f81498e) : null);
        } else {
            setContentDescription(getResources().getString(R$string.f81505l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (K() && this.E) {
            G();
        } else {
            L(false);
        }
    }

    public static /* synthetic */ void a(x xVar, Bitmap bitmap) {
        xVar.getClass();
        xVar.setImage(new BitmapDrawable(xVar.getResources(), bitmap));
        if (xVar.D()) {
            return;
        }
        xVar.U();
        xVar.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        TextView textView = this.f81811l;
        if (textView != null) {
            CharSequence charSequence = this.B;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f81811l.setVisibility(0);
            } else {
                n9.a0 a0Var = this.f81819t;
                if (a0Var != null) {
                    a0Var.getPlayerError();
                }
                this.f81811l.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ Object b(x xVar, Object obj, Method method, Object[] objArr) {
        xVar.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        xVar.N((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z10) {
        n9.a0 a0Var = this.f81819t;
        boolean z11 = false;
        boolean z12 = (a0Var == null || !a0Var.isCommandAvailable(30) || a0Var.getCurrentTracks().b()) ? false : true;
        if (!this.A && (!z12 || z10)) {
            F();
            y();
            E();
        }
        if (z12) {
            boolean zD = D();
            boolean zC = C();
            if (!zD && !zC) {
                y();
                E();
            }
            View view = this.f81803d;
            if (view != null && view.getVisibility() == 4 && J()) {
                z11 = true;
            }
            if (zC && !zD && z11) {
                y();
                U();
            } else if (zD && !zC && z11) {
                E();
            }
            if (zD || zC || !d0() || !(O(a0Var) || P(this.f81824y))) {
                F();
            }
        }
    }

    private void c0() {
        Drawable drawable;
        ImageView imageView = this.f81807h;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f81823x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f81807h.getVisibility() == 0) {
            M(this.f81802c, width);
        }
        this.f81807h.setScaleType(scaleType);
    }

    private boolean d0() {
        if (this.f81822w == 0) {
            return false;
        }
        q9.a.i(this.f81808i);
        return true;
    }

    private boolean e0() {
        if (!this.f81820u) {
            return false;
        }
        q9.a.i(this.f81812m);
        return true;
    }

    static /* synthetic */ d o(x xVar) {
        xVar.getClass();
        return null;
    }

    static /* synthetic */ e p(x xVar) {
        xVar.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f81807h;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        c0();
    }

    private void setImageOutput(n9.a0 a0Var) {
        Class cls = this.f81816q;
        if (cls == null || !cls.isAssignableFrom(a0Var.getClass())) {
            return;
        }
        try {
            ((Method) q9.a.e(this.f81817r)).invoke(a0Var, q9.a.e(this.f81818s));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(n9.a0 a0Var) {
        Class cls = this.f81816q;
        if (cls == null || !cls.isAssignableFrom(a0Var.getClass())) {
            return;
        }
        try {
            ((Method) q9.a.e(this.f81817r)).invoke(a0Var, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f81803d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(o0.a0(context, resources, R$drawable.f81438a));
        imageView.setBackgroundColor(resources.getColor(R$color.f81433a));
    }

    public boolean B(KeyEvent keyEvent) {
        return e0() && this.f81812m.U(keyEvent);
    }

    public void G() {
        io.bidmachine.media3.ui.d dVar = this.f81812m;
        if (dVar != null) {
            dVar.Y();
        }
    }

    protected void M(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void S() {
        T(R());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (o0.f98837a == 34 && (fVar = this.f81806g) != null && this.G) {
            fVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n9.a0 a0Var = this.f81819t;
        if (a0Var != null && a0Var.isCommandAvailable(16) && this.f81819t.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zI = I(keyEvent.getKeyCode());
        if (zI && e0() && !this.f81812m.c0()) {
            L(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            L(true);
            return true;
        }
        if (zI && e0()) {
            L(true);
        }
        return false;
    }

    public List<n9.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f81814o;
        if (frameLayout != null) {
            arrayList.add(new a.C1093a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        io.bidmachine.media3.ui.d dVar = this.f81812m;
        if (dVar != null) {
            arrayList.add(new a.C1093a(dVar, 1).a());
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) q9.a.j(this.f81813n, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f81822w;
    }

    public boolean getControllerAutoShow() {
        return this.D;
    }

    public boolean getControllerHideOnTouch() {
        return this.F;
    }

    public int getControllerShowTimeoutMs() {
        return this.C;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f81824y;
    }

    public int getImageDisplayMode() {
        return this.f81823x;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f81814o;
    }

    @Nullable
    public n9.a0 getPlayer() {
        return this.f81819t;
    }

    public int getResizeMode() {
        q9.a.i(this.f81802c);
        return this.f81802c.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f81809j;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f81822w != 0;
    }

    public boolean getUseController() {
        return this.f81820u;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f81804e;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!e0() || this.f81819t == null) {
            return false;
        }
        L(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        V();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        q9.a.g(i10 == 0 || this.f81808i != null);
        if (this.f81822w != i10) {
            this.f81822w = i10;
            b0(false);
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.b bVar) {
        q9.a.i(this.f81802c);
        this.f81802c.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        q9.a.i(this.f81812m);
        this.F = z10;
        Y();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable d.InterfaceC0984d interfaceC0984d) {
        q9.a.i(this.f81812m);
        this.f81812m.setOnFullScreenModeChangedListener(interfaceC0984d);
    }

    public void setControllerShowTimeoutMs(int i10) {
        q9.a.i(this.f81812m);
        this.C = i10;
        if (this.f81812m.c0()) {
            S();
        }
    }

    public void setControllerVisibilityListener(@Nullable d dVar) {
        if (dVar != null) {
            setControllerVisibilityListener((d.m) null);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        q9.a.g(this.f81811l != null);
        this.B = charSequence;
        a0();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f81824y != drawable) {
            this.f81824y = drawable;
            b0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.G = z10;
    }

    public void setErrorMessageProvider(@Nullable n9.l lVar) {
        if (lVar != null) {
            a0();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable e eVar) {
        q9.a.i(this.f81812m);
        this.f81812m.setOnFullScreenModeChangedListener(this.f81801b);
    }

    public void setFullscreenButtonState(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.s0(z10);
    }

    public void setImageDisplayMode(int i10) {
        q9.a.g(this.f81807h != null);
        if (this.f81823x != i10) {
            this.f81823x = i10;
            c0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            b0(false);
        }
    }

    public void setPlayer(@Nullable n9.a0 a0Var) {
        q9.a.g(Looper.myLooper() == Looper.getMainLooper());
        q9.a.a(a0Var == null || a0Var.getApplicationLooper() == Looper.getMainLooper());
        n9.a0 a0Var2 = this.f81819t;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 != null) {
            a0Var2.d(this.f81801b);
            if (a0Var2.isCommandAvailable(27)) {
                View view = this.f81804e;
                if (view instanceof TextureView) {
                    a0Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    a0Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            x(a0Var2);
        }
        SubtitleView subtitleView = this.f81809j;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f81819t = a0Var;
        if (e0()) {
            this.f81812m.setPlayer(a0Var);
        }
        X();
        a0();
        b0(true);
        if (a0Var == null) {
            G();
            return;
        }
        if (a0Var.isCommandAvailable(27)) {
            View view2 = this.f81804e;
            if (view2 instanceof TextureView) {
                a0Var.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                a0Var.setVideoSurfaceView((SurfaceView) view2);
            }
            if (!a0Var.isCommandAvailable(30) || a0Var.getCurrentTracks().d(2)) {
                W();
            }
        }
        if (this.f81809j != null && a0Var.isCommandAvailable(28)) {
            this.f81809j.setCues(a0Var.getCurrentCues().f98114a);
        }
        a0Var.c(this.f81801b);
        setImageOutput(a0Var);
        L(false);
    }

    public void setRepeatToggleModes(int i10) {
        q9.a.i(this.f81812m);
        this.f81812m.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        q9.a.i(this.f81802c);
        this.f81802c.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f81825z != i10) {
            this.f81825z = i10;
            X();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        q9.a.i(this.f81812m);
        this.f81812m.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(@ColorInt int i10) {
        View view = this.f81803d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        q9.a.g((z10 && this.f81812m == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f81820u == z10) {
            return;
        }
        this.f81820u = z10;
        if (e0()) {
            this.f81812m.setPlayer(this.f81819t);
        } else {
            io.bidmachine.media3.ui.d dVar = this.f81812m;
            if (dVar != null) {
                dVar.Y();
                this.f81812m.setPlayer(null);
            }
        }
        Y();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f81804e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable d.m mVar) {
        q9.a.i(this.f81812m);
        d.m mVar2 = this.f81821v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f81812m.j0(mVar2);
        }
        this.f81821v = mVar;
        if (mVar != null) {
            this.f81812m.S(mVar);
            setControllerVisibilityListener((d) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        boolean z17;
        super(context, attributeSet, i10);
        c cVar = new c();
        this.f81801b = cVar;
        this.f81815p = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f81802c = null;
            this.f81803d = null;
            this.f81804e = null;
            this.f81805f = false;
            this.f81806g = null;
            this.f81807h = null;
            this.f81808i = null;
            this.f81809j = null;
            this.f81810k = null;
            this.f81811l = null;
            this.f81812m = null;
            this.f81813n = null;
            this.f81814o = null;
            this.f81816q = null;
            this.f81817r = null;
            this.f81818s = null;
            ImageView imageView = new ImageView(context);
            if (o0.f98837a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = R$layout.f81488c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f81524b0, i10, 0);
            try {
                int i22 = R$styleable.f81548n0;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i22);
                int color = typedArrayObtainStyledAttributes.getColor(i22, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f81540j0, i21);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81552p0, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81526c0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f81530e0, 0);
                int i24 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81536h0, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81554q0, true);
                int i25 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81550o0, 1);
                int i26 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81542k0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81546m0, 5000);
                z12 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81534g0, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81528d0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.f81544l0, 0);
                this.A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81538i0, this.A);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81532f0, true);
                typedArrayObtainStyledAttributes.recycle();
                i13 = i26;
                z10 = z19;
                z13 = z21;
                i16 = i25;
                i12 = resourceId;
                z14 = zHasValue;
                i19 = i23;
                i18 = i24;
                z11 = z20;
                i14 = integer;
                z15 = z18;
                i17 = color;
                i15 = resourceId2;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            i13 = 0;
            z11 = true;
            z12 = true;
            z13 = true;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            z14 = false;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R$id.f81466i);
        this.f81802c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            Q(aspectRatioFrameLayout, i13);
        }
        View viewFindViewById = findViewById(R$id.N);
        this.f81803d = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i17);
        }
        if (aspectRatioFrameLayout != null && i16 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f81804e = new TextureView(context);
            } else if (i16 == 3) {
                try {
                    int i27 = na.l.f95741n;
                    this.f81804e = (View) na.l.class.getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f81804e.setLayoutParams(layoutParams);
                    this.f81804e.setOnClickListener(cVar);
                    this.f81804e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f81804e, 0);
                    z16 = z17;
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i16 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (o0.f98837a >= 34) {
                    b.a(surfaceView);
                }
                this.f81804e = surfaceView;
            } else {
                try {
                    int i28 = ma.p.f94673c;
                    this.f81804e = (View) ma.p.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.f81804e.setLayoutParams(layoutParams);
            this.f81804e.setOnClickListener(cVar);
            this.f81804e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f81804e, 0);
            z16 = z17;
            aVar = null;
        } else {
            aVar = null;
            this.f81804e = null;
            z16 = false;
        }
        this.f81805f = z16;
        this.f81806g = o0.f98837a == 34 ? new f() : null;
        this.f81813n = (FrameLayout) findViewById(R$id.f81458a);
        this.f81814o = (FrameLayout) findViewById(R$id.B);
        this.f81807h = (ImageView) findViewById(R$id.f81478u);
        this.f81823x = i18;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f81091a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: yb.i
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return x.b(this.f118905a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f81816q = cls;
        this.f81817r = method;
        this.f81818s = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R$id.f81459b);
        this.f81808i = imageView2;
        this.f81822w = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i15 != 0) {
            this.f81824y = ContextCompat.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R$id.Q);
        this.f81809j = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(R$id.f81463f);
        this.f81810k = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f81825z = i14;
        TextView textView = (TextView) findViewById(R$id.f81471n);
        this.f81811l = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i29 = R$id.f81467j;
        io.bidmachine.media3.ui.d dVar = (io.bidmachine.media3.ui.d) findViewById(i29);
        View viewFindViewById3 = findViewById(R$id.f81468k);
        if (dVar != null) {
            this.f81812m = dVar;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            io.bidmachine.media3.ui.d dVar2 = new io.bidmachine.media3.ui.d(context, null, 0, attributeSet);
            this.f81812m = dVar2;
            dVar2.setId(i29);
            dVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(dVar2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f81812m = null;
        }
        io.bidmachine.media3.ui.d dVar3 = this.f81812m;
        this.C = dVar3 != null ? i11 : i20;
        this.F = z12;
        this.D = z11;
        this.E = z13;
        this.f81820u = (!z10 || dVar3 == null) ? i20 : 1;
        if (dVar3 != null) {
            dVar3.Z();
            this.f81812m.S(this.f81801b);
        }
        if (z10) {
            setClickable(true);
        }
        Y();
    }
}
