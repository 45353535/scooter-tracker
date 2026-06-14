package sg.bigo.ads.core.adview;

import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.player.d;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends c implements MediaView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.f f103897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdImageView f103898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f103899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f103900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VideoController f103901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103903h;

    static class a implements VideoController {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final sg.bigo.ads.core.player.b.f f103904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private VideoController.VideoLifeCallback f103905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private VideoController.d f103906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private VideoController.c f103907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private VideoController.a f103908e;

        a(@NonNull sg.bigo.ads.core.player.b.f fVar) {
            this.f103904a = fVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.a getBackupLoadCallback() {
            return this.f103908e;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.c getLoadHTMLCallback() {
            return this.f103907d;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.d getProgressChangeListener() {
            return this.f103906c;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.VideoLifeCallback getVideoLifeCallback() {
            return this.f103905b;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isMuted() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            return this.f103904a.c();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPaused() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            return this.f103904a.getPlayStatus() == 3;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPlaying() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            return this.f103904a.t();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void mute(boolean z10) {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            this.f103904a.setMute(z10);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyBackupResourceReady() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            sg.bigo.ads.core.player.b.f fVar = this.f103904a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).l();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyPlayViewRegister() {
            d.a.f104695a.a(this.f103904a);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyResourceReady() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            sg.bigo.ads.core.player.b.f fVar = this.f103904a;
            if (fVar instanceof sg.bigo.ads.core.player.b.e) {
                ((sg.bigo.ads.core.player.b.e) fVar).m();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void pause() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            this.f103904a.u();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void play() {
            sg.bigo.ads.core.player.d unused = d.a.f104695a;
            this.f103904a.e(true);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setBackupLoadCallback(VideoController.a aVar) {
            this.f103908e = aVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setLoadHTMLCallback(VideoController.c cVar) {
            this.f103907d = cVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
            sg.bigo.ads.core.player.b.f fVar = this.f103904a;
            if (fVar != null) {
                fVar.setNeedPauseWhenVisiblePercentEqual(z10);
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setProgressChangeListener(VideoController.d dVar) {
            this.f103906c = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
            this.f103905b = videoLifeCallback;
        }
    }

    public f(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
        this.f103897b = null;
        this.f103898c = null;
        Boolean bool = Boolean.TRUE;
        this.f103899d = bool;
        this.f103900e = bool;
        this.f103903h = true;
        this.f103902g = true;
    }

    @Override // sg.bigo.ads.core.adview.c
    protected final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        u.a(view, this.f103878a, null, -1);
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void b() {
        sg.bigo.ads.core.player.b.f fVar = this.f103897b;
        if (fVar != null) {
            fVar.performClick();
        }
    }

    public final int c() {
        AdImageView adImageView = this.f103898c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f103898c.getDrawable().getIntrinsicHeight();
    }

    public final int d() {
        AdImageView adImageView = this.f103898c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.f103898c.getDrawable().getIntrinsicWidth();
    }

    private boolean b(int i10, int i11) {
        AdImageView adImageView = this.f103898c;
        if (adImageView != null) {
            return u.a(i10, i11, adImageView);
        }
        sg.bigo.ads.core.player.b.f fVar = this.f103897b;
        if (fVar != null) {
            return u.a(i10, i11, fVar);
        }
        return false;
    }

    public final void a(String str) {
        sg.bigo.ads.core.player.b.e eVar = new sg.bigo.ads.core.player.b.e(this.f103878a.getContext(), 0, 0, sg.bigo.ads.api.c.b.b(1), null);
        eVar.setClickable(this.f103903h);
        a(eVar);
        eVar.setPlayInfo$505cff1c(str);
        this.f103901f = new a(eVar);
        this.f103897b = eVar;
    }

    public final void a(@NonNull n nVar, @Nullable sg.bigo.ads.common.p.g gVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(nVar.x());
        if (this.f103898c == null) {
            this.f103898c = new AdImageView(this.f103878a.getContext());
        }
        int i10 = bVarB.f102146a;
        if (i10 == 1) {
            adImageView = this.f103898c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else if (i10 != 2) {
            if (i10 == 3) {
                adImageView2 = this.f103898c;
                layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            } else if (i10 == 4) {
                adImageView2 = this.f103898c;
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            }
            adImageView2.setLayoutParams(layoutParams);
            adImageView = this.f103898c;
            scaleType = ImageView.ScaleType.FIT_CENTER;
            adImageView.setScaleType(scaleType);
        } else {
            adImageView = this.f103898c;
            scaleType = ImageView.ScaleType.CENTER_CROP;
            adImageView.setScaleType(scaleType);
        }
        String strAT = nVar.aT();
        a(this.f103898c);
        this.f103898c.setBlurBorder(this.f103902g);
        this.f103898c.a(gVar);
        if (i.f102116a.n().a(9) && URLUtil.isHttpUrl(strAT) && gVar != null) {
            gVar.a(1305, "Invalid http url", "");
        } else {
            this.f103898c.a(strAT, nVar.al());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[PHI: r1
  0x0026: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v4 int) binds: [B:3:0x0010, B:5:0x0018, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@androidx.annotation.NonNull sg.bigo.ads.core.a.a r9, @androidx.annotation.NonNull sg.bigo.ads.core.f.a.p r10, sg.bigo.ads.core.g.c r11) {
        /*
            r8 = this;
            int r0 = r9.x()
            sg.bigo.ads.api.c.b r5 = sg.bigo.ads.api.c.b.b(r0)
            sg.bigo.ads.api.core.m r0 = r9.aV()
            int r1 = r10.f104273x
            int r10 = r10.f104272w
            if (r0 == 0) goto L26
            long r2 = r0.f102209c
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L26
            int r2 = r0.f102207a
            if (r2 <= 0) goto L1f
            r1 = r2
        L1f:
            int r0 = r0.f102208b
            if (r0 <= 0) goto L26
            r4 = r0
        L24:
            r3 = r1
            goto L28
        L26:
            r4 = r10
            goto L24
        L28:
            sg.bigo.ads.core.player.b.e r1 = new sg.bigo.ads.core.player.b.e
            sg.bigo.ads.api.a<?> r10 = r8.f103878a
            android.content.Context r2 = r10.getContext()
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r9 = r8.f103903h
            r1.setClickable(r9)
            r8.a(r1)
            sg.bigo.ads.api.a<?> r9 = r8.f103878a
            android.content.Context r9 = r9.getContext()
            java.lang.String r9 = r6.c(r9)
            r1.setPlayInfo$505cff1c(r9)
            r1.setOnEventListener(r11)
            sg.bigo.ads.core.adview.f$a r9 = new sg.bigo.ads.core.adview.f$a
            r9.<init>(r1)
            r8.f103901f = r9
            r8.f103897b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.adview.f.a(sg.bigo.ads.core.a.a, sg.bigo.ads.core.f.a.p, sg.bigo.ads.core.g.c):void");
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(sg.bigo.ads.core.player.b.b bVar) {
        sg.bigo.ads.core.player.b.f fVar = this.f103897b;
        if (fVar instanceof sg.bigo.ads.core.player.b.e) {
            ((sg.bigo.ads.core.player.b.e) fVar).setIVideoPlayerViewListener(bVar);
        }
    }

    public final void a(@NonNull sg.bigo.ads.core.player.b.d dVar) {
        dVar.setVPAIDClickable(this.f103903h);
        a((View) dVar);
        this.f103901f = new a(dVar);
        this.f103897b = dVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(boolean z10) {
        sg.bigo.ads.core.player.b.f fVar = this.f103897b;
        if (fVar != null) {
            fVar.setClickable(z10);
        } else {
            this.f103903h = z10;
        }
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final boolean a() {
        sg.bigo.ads.core.player.b.f fVar = this.f103897b;
        return fVar != null ? fVar.isClickable() : this.f103903h;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final boolean a(int i10, int i11) {
        int i12;
        boolean zB = b(i10, i11);
        if ((super.a(i10, i11) && (b(i10, i11) ^ true)) && this.f103899d.booleanValue()) {
            i12 = 9;
        } else {
            if (!zB || !this.f103900e.booleanValue()) {
                return false;
            }
            i12 = 5;
        }
        a(i12);
        return true;
    }
}
