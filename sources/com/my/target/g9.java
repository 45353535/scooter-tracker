package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.y;
import com.my.target.z;

/* JADX INFO: loaded from: classes11.dex */
public class g9 extends ViewGroup implements z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f59747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb f59748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f59749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f59750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f59751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f59752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f59753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f59754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f59756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y f59757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VideoData f59758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f59759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f59760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f59761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59762p;

    public interface a extends AudioManager.OnAudioFocusChangeListener, y.a {
        void c();

        void i();

        void k();

        void o();
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g9 g9Var = g9.this;
            if (g9Var.f59756j == null) {
                return;
            }
            if (!g9Var.e() && !g9.this.d()) {
                g9.this.f59756j.o();
            } else if (g9.this.d()) {
                g9.this.f59756j.i();
            } else {
                g9.this.f59756j.c();
            }
        }
    }

    public g9(Context context, kb kbVar, boolean z10, boolean z11) {
        super(context);
        this.f59762p = true;
        this.f59748b = kbVar;
        this.f59754h = z10;
        this.f59755i = z11;
        this.f59747a = new ma(context);
        this.f59749c = new y2(context);
        this.f59753g = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.f59752f = new FrameLayout(context);
        z zVar = new z(context);
        this.f59751e = zVar;
        zVar.setAdVideoViewListener(this);
        this.f59750d = new b();
    }

    public void a() {
        y yVar = this.f59757k;
        if (yVar != null) {
            yVar.destroy();
        }
        this.f59757k = null;
    }

    public void b(o4 o4Var) {
        a();
        a(o4Var);
    }

    public void c() {
        kb.b(this.f59749c, "play_button");
        kb.b(this.f59747a, "media_image");
        kb.b(this.f59751e, "video_texture");
        kb.b(this.f59752f, "clickable_layout");
        this.f59747a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f59747a.setAdjustViewBounds(true);
        addView(this.f59751e);
        this.f59753g.setVisibility(8);
        addView(this.f59747a);
        addView(this.f59753g);
        addView(this.f59752f);
        addView(this.f59749c);
    }

    public boolean d() {
        y yVar = this.f59757k;
        return yVar != null && yVar.b();
    }

    public boolean e() {
        y yVar = this.f59757k;
        return yVar != null && yVar.isPlaying();
    }

    public void f() {
        y yVar = this.f59757k;
        if (yVar == null) {
            return;
        }
        yVar.pause();
        this.f59747a.setVisibility(0);
        Bitmap screenShot = this.f59751e.getScreenShot();
        if (screenShot != null && this.f59757k.e()) {
            this.f59747a.setImageBitmap(screenShot);
        }
        if (this.f59762p) {
            this.f59749c.setVisibility(0);
        }
    }

    public void g() {
        this.f59749c.setVisibility(8);
        y yVar = this.f59757k;
        if (yVar == null || this.f59758l == null) {
            return;
        }
        yVar.resume();
        this.f59747a.setVisibility(8);
    }

    @NonNull
    public FrameLayout getClickableLayout() {
        return this.f59752f;
    }

    @NonNull
    public ma getImageView() {
        return this.f59747a;
    }

    @Nullable
    public y getVideoPlayer() {
        return this.f59757k;
    }

    public void h() {
        this.f59749c.setOnClickListener(this.f59750d);
    }

    public void i() {
        this.f59747a.setVisibility(8);
        this.f59753g.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((i12 - i10) - measuredWidth) / 2;
                int i16 = ((i13 - i11) - measuredHeight) / 2;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f59760n;
        if (i13 == 0 || (i12 = this.f59761o) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i13;
            size = i12;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((size / i12) * i13);
        }
        if (size == 0 || mode == 0) {
            size = (int) ((size2 / i13) * i12);
        }
        float f10 = i12 / i13;
        float f11 = size / f10;
        float f12 = size2;
        if (f11 > f12) {
            size = (int) (f10 * f12);
        } else {
            size2 = (int) f11;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int i15 = (childAt == this.f59747a || childAt == this.f59752f || childAt == this.f59751e) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i15), View.MeasureSpec.makeMeasureSpec(size2, i15));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.z.a
    public void q() {
        a aVar;
        if (!(this.f59757k instanceof b2)) {
            a aVar2 = this.f59756j;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        this.f59751e.setViewMode(1);
        VideoData videoData = this.f59758l;
        if (videoData != null) {
            this.f59751e.a(videoData.getWidth(), this.f59758l.getHeight());
        }
        this.f59757k.a(this.f59751e);
        if (!this.f59757k.isPlaying() || (aVar = this.f59756j) == null) {
            return;
        }
        aVar.k();
    }

    public void setInterstitialPromoViewListener(@Nullable a aVar) {
        this.f59756j = aVar;
        y yVar = this.f59757k;
        if (yVar != null) {
            yVar.a(aVar);
        }
    }

    public void b() {
        getClickableLayout().setOnClickListener(this.f59750d);
    }

    public void a(int i10) {
        y yVar = this.f59757k;
        if (yVar != null) {
            if (i10 == 0) {
                yVar.d();
            } else if (i10 != 1) {
                yVar.h();
            } else {
                yVar.c();
            }
        }
    }

    public void b(o4 o4Var, int i10) {
        if (o4Var.V() != null) {
            a(o4Var, i10);
        } else {
            a(o4Var);
        }
    }

    public void b(boolean z10) {
        y yVar = this.f59757k;
        if (yVar != null) {
            yVar.stop();
        }
        this.f59753g.setVisibility(8);
        this.f59747a.setVisibility(0);
        this.f59747a.setImageBitmap(this.f59759m);
        this.f59762p = z10;
        if (z10) {
            this.f59749c.setVisibility(0);
            return;
        }
        this.f59747a.setOnClickListener(null);
        this.f59749c.setOnClickListener(null);
        setOnClickListener(null);
    }

    public void a(boolean z10) {
        y yVar;
        this.f59749c.setVisibility(8);
        this.f59753g.setVisibility(0);
        if (this.f59758l == null || (yVar = this.f59757k) == null) {
            return;
        }
        yVar.a(this.f59756j);
        this.f59757k.a(this.f59751e);
        this.f59751e.a(this.f59758l.getWidth(), this.f59758l.getHeight());
        String str = (String) this.f59758l.a();
        if (z10 && str != null) {
            this.f59757k.a(Uri.parse(str), this.f59751e.getContext());
        } else {
            this.f59757k.a(Uri.parse(this.f59758l.getUrl()), this.f59751e.getContext());
        }
    }

    public final void a(o4 o4Var, int i10) {
        int iB;
        s5 s5VarV = o4Var.V();
        if (s5VarV == null) {
            return;
        }
        VideoData videoData = (VideoData) s5VarV.k0();
        this.f59758l = videoData;
        if (videoData == null) {
            return;
        }
        y yVarA = w5.a(this.f59755i, getContext());
        this.f59757k = yVarA;
        yVarA.a(this.f59756j);
        if (s5VarV.g0()) {
            this.f59757k.setVolume(0.0f);
        }
        this.f59761o = this.f59758l.getWidth();
        this.f59760n = this.f59758l.getHeight();
        ImageData imageDataV = s5VarV.V();
        if (imageDataV != null) {
            this.f59759m = imageDataV.getData();
            if (this.f59761o <= 0 || this.f59760n <= 0) {
                this.f59761o = imageDataV.getWidth();
                this.f59760n = imageDataV.getHeight();
            }
            this.f59747a.setImageBitmap(this.f59759m);
        } else {
            ImageData imageDataS = o4Var.s();
            if (imageDataS != null) {
                if (this.f59761o <= 0 || this.f59760n <= 0) {
                    this.f59761o = imageDataS.getWidth();
                    this.f59760n = imageDataS.getHeight();
                }
                Bitmap data = imageDataS.getData();
                this.f59759m = data;
                this.f59747a.setImageBitmap(data);
            }
        }
        if (i10 != 1) {
            if (this.f59754h) {
                iB = this.f59748b.b(140);
            } else {
                iB = this.f59748b.b(96);
            }
            this.f59749c.a(q4.a(iB), false);
        }
    }

    public final void a(o4 o4Var) {
        this.f59752f.setVisibility(8);
        this.f59749c.setVisibility(8);
        this.f59753g.setVisibility(8);
        this.f59751e.setVisibility(8);
        this.f59747a.setVisibility(0);
        ImageData imageDataS = o4Var.s();
        if (imageDataS == null || imageDataS.getData() == null) {
            return;
        }
        this.f59761o = imageDataS.getWidth();
        int height = imageDataS.getHeight();
        this.f59760n = height;
        if (this.f59761o == 0 || height == 0) {
            this.f59761o = imageDataS.getData().getWidth();
            this.f59760n = imageDataS.getData().getHeight();
        }
        this.f59747a.setImageBitmap(imageDataS.getData());
        this.f59747a.setClickable(false);
    }
}
