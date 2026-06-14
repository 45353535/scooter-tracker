package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.views.MediaAdView;

/* JADX INFO: loaded from: classes11.dex */
public class qb extends ViewGroup {
    public static final int A = kb.c();
    public static final int B = kb.c();
    public static final int C = kb.c();
    public static final int D = kb.c();
    public static final int E = kb.c();
    public static final int F = kb.c();
    public static final int G = kb.c();
    public static final int H = kb.c();
    public static final int I = kb.c();
    public static final int J = kb.c();
    public static final int K = kb.c();
    public static final int L = kb.c();
    public static final int M = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StarsRatingView f60668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f60669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f60670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f60671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f60672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f60673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f60674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaAdView f60675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f60676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vb f60677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y2 f60678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f60679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h2 f60680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h2 f60681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h2 f60682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f60683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f60684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View.OnClickListener f60685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bitmap f60686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap f60687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f60688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f60689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f60690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f60691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f60692z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qb.this.f60690x != null) {
                int id2 = view.getId();
                if (id2 == qb.B) {
                    qb.this.f60690x.a(view);
                    return;
                }
                if (id2 == qb.C) {
                    qb.this.f60690x.m();
                    return;
                }
                if (id2 == qb.E) {
                    qb.this.f60690x.g();
                    return;
                }
                if (id2 == qb.D) {
                    qb.this.f60690x.h();
                } else if (id2 == qb.A) {
                    qb.this.f60690x.a();
                } else if (id2 == qb.J) {
                    qb.this.f60690x.j();
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qb qbVar = qb.this;
            if (qbVar.f60691y == 2) {
                qbVar.a();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qb qbVar = qb.this;
            qbVar.removeCallbacks(qbVar.f60683q);
            qb qbVar2 = qb.this;
            int i10 = qbVar2.f60691y;
            if (i10 == 2) {
                qbVar2.a();
                return;
            }
            if (i10 == 0) {
                qbVar2.c();
            }
            qb qbVar3 = qb.this;
            qbVar3.postDelayed(qbVar3.f60683q, 4000L);
        }
    }

    public interface d {
        void a();

        void a(View view);

        void g();

        void h();

        void j();

        void m();
    }

    public qb(Context context) {
        super(context);
        Button button = new Button(context);
        this.f60670d = button;
        TextView textView = new TextView(context);
        this.f60667a = textView;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60668b = starsRatingView;
        Button button2 = new Button(context);
        this.f60669c = button2;
        TextView textView2 = new TextView(context);
        this.f60673g = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60674h = frameLayout;
        h2 h2Var = new h2(context);
        this.f60680n = h2Var;
        h2 h2Var2 = new h2(context);
        this.f60681o = h2Var2;
        h2 h2Var3 = new h2(context);
        this.f60682p = h2Var3;
        TextView textView3 = new TextView(context);
        this.f60676j = textView3;
        MediaAdView mediaAdView = new MediaAdView(context);
        this.f60675i = mediaAdView;
        vb vbVar = new vb(context);
        this.f60677k = vbVar;
        y2 y2Var = new y2(context);
        this.f60678l = y2Var;
        this.f60672f = new LinearLayout(context);
        kb kbVarE = kb.e(context);
        this.f60671e = kbVarE;
        this.f60683q = new b();
        this.f60684r = new c();
        this.f60685s = new a();
        this.f60679m = new z(context);
        this.f60686t = l7.c(kbVarE.b(28));
        this.f60687u = l7.b(kbVarE.b(28));
        kb.b(button, "dismiss_button");
        kb.b(textView, "title_text");
        kb.b(starsRatingView, "stars_view");
        kb.b(button2, "cta_button");
        kb.b(textView2, "replay_text");
        kb.b(frameLayout, "shadow");
        kb.b(h2Var, "pause_button");
        kb.b(h2Var2, "play_button");
        kb.b(h2Var3, "replay_button");
        kb.b(textView3, "domain_text");
        kb.b(mediaAdView, "media_view");
        kb.b(vbVar, "video_progress_wheel");
        kb.b(y2Var, "sound_button");
        this.f60689w = kbVarE.b(28);
        this.f60688v = kbVarE.b(16);
        b();
    }

    public void a(b7 b7Var, VideoData videoData) {
        s5 s5VarP = b7Var.P();
        if (s5VarP == null) {
            return;
        }
        this.f60677k.setMax(b7Var.o());
        this.f60692z = s5VarP.c0();
        this.f60669c.setText(b7Var.i());
        this.f60667a.setText(b7Var.A());
        if ("store".equals(b7Var.t())) {
            this.f60676j.setVisibility(8);
            if (b7Var.F() == 0 || b7Var.w() <= 0.0f) {
                this.f60668b.setVisibility(8);
            } else {
                this.f60668b.setVisibility(0);
                this.f60668b.setRating(b7Var.w());
            }
        } else {
            this.f60668b.setVisibility(8);
            this.f60676j.setVisibility(0);
            this.f60676j.setText(b7Var.n());
        }
        this.f60670d.setText(s5VarP.N());
        this.f60673g.setText(s5VarP.W());
        Bitmap bitmapC = l7.c();
        if (bitmapC != null) {
            this.f60682p.setImageBitmap(bitmapC);
        }
        this.f60675i.setPlaceHolderDimension(videoData.getWidth(), videoData.getHeight());
        ImageData imageDataS = b7Var.s();
        if (imageDataS != null) {
            this.f60675i.getImageView().setImageBitmap(imageDataS.getBitmap());
        }
    }

    public final void b() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i10 = this.f60688v;
        this.f60678l.setId(J);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f60675i.setId(M);
        this.f60675i.setLayoutParams(layoutParams);
        this.f60675i.setId(I);
        this.f60675i.setOnClickListener(this.f60684r);
        this.f60675i.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60674h.setBackgroundColor(-1728053248);
        this.f60674h.setVisibility(8);
        this.f60670d.setId(A);
        this.f60670d.setTextSize(2, 16.0f);
        this.f60670d.setTransformationMethod(null);
        Button button = this.f60670d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.f60670d.setMaxLines(2);
        this.f60670d.setPadding(i10, i10, i10, i10);
        this.f60670d.setTextColor(-1);
        kb.a(this.f60670d, -2013265920, -1, -1, this.f60671e.b(1), this.f60671e.b(4));
        this.f60667a.setId(G);
        this.f60667a.setMaxLines(2);
        this.f60667a.setEllipsize(truncateAt);
        this.f60667a.setTextSize(2, 18.0f);
        this.f60667a.setTextColor(-1);
        kb.a(this.f60669c, -2013265920, -1, -1, this.f60671e.b(1), this.f60671e.b(4));
        this.f60669c.setId(B);
        this.f60669c.setTextColor(-1);
        this.f60669c.setTransformationMethod(null);
        this.f60669c.setGravity(1);
        this.f60669c.setTextSize(2, 16.0f);
        this.f60669c.setLines(1);
        this.f60669c.setEllipsize(truncateAt);
        this.f60669c.setMinimumWidth(this.f60671e.b(100));
        this.f60669c.setPadding(i10, i10, i10, i10);
        this.f60667a.setShadowLayer(this.f60671e.b(1), this.f60671e.b(1), this.f60671e.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f60676j.setId(H);
        this.f60676j.setTextColor(-3355444);
        this.f60676j.setMaxEms(10);
        this.f60676j.setShadowLayer(this.f60671e.b(1), this.f60671e.b(1), this.f60671e.b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f60672f.setId(C);
        this.f60672f.setOnClickListener(this.f60685s);
        this.f60672f.setGravity(17);
        this.f60672f.setVisibility(8);
        this.f60672f.setPadding(this.f60671e.b(8), 0, this.f60671e.b(8), 0);
        this.f60673g.setSingleLine();
        this.f60673g.setEllipsize(truncateAt);
        TextView textView = this.f60673g;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f60673g.setTextColor(-1);
        this.f60673g.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = this.f60671e.b(4);
        this.f60682p.setPadding(this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16));
        this.f60680n.setId(E);
        this.f60680n.setOnClickListener(this.f60685s);
        this.f60680n.setVisibility(8);
        this.f60680n.setPadding(this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16));
        this.f60681o.setId(D);
        this.f60681o.setOnClickListener(this.f60685s);
        this.f60681o.setVisibility(8);
        this.f60681o.setPadding(this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16), this.f60671e.b(16));
        this.f60674h.setId(K);
        Bitmap bitmapB = l7.b();
        if (bitmapB != null) {
            this.f60681o.setImageBitmap(bitmapB);
        }
        Bitmap bitmapA = l7.a();
        if (bitmapA != null) {
            this.f60680n.setImageBitmap(bitmapA);
        }
        kb.a(this.f60680n, -2013265920, -1, -1, this.f60671e.b(1), this.f60671e.b(4));
        kb.a(this.f60681o, -2013265920, -1, -1, this.f60671e.b(1), this.f60671e.b(4));
        kb.a(this.f60682p, -2013265920, -1, -1, this.f60671e.b(1), this.f60671e.b(4));
        this.f60668b.setId(L);
        this.f60668b.setStarSize(this.f60671e.b(12));
        this.f60677k.setId(F);
        this.f60677k.setVisibility(8);
        this.f60675i.addView(this.f60679m, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f60675i);
        addView(this.f60674h);
        addView(this.f60678l);
        addView(this.f60670d);
        addView(this.f60677k);
        addView(this.f60672f);
        addView(this.f60680n);
        addView(this.f60681o);
        addView(this.f60668b);
        addView(this.f60676j);
        addView(this.f60669c);
        addView(this.f60667a);
        this.f60672f.addView(this.f60682p);
        this.f60672f.addView(this.f60673g, layoutParams2);
        this.f60669c.setOnClickListener(this.f60685s);
        this.f60670d.setOnClickListener(this.f60685s);
        this.f60678l.setOnClickListener(this.f60685s);
    }

    public final void c() {
        if (this.f60691y != 2) {
            this.f60691y = 2;
            this.f60675i.getImageView().setVisibility(8);
            this.f60675i.getProgressBarView().setVisibility(8);
            this.f60672f.setVisibility(8);
            this.f60681o.setVisibility(8);
            this.f60680n.setVisibility(0);
            this.f60674h.setVisibility(8);
        }
    }

    public void d() {
        if (this.f60691y != 3) {
            this.f60691y = 3;
            this.f60675i.getProgressBarView().setVisibility(0);
            this.f60672f.setVisibility(8);
            this.f60681o.setVisibility(8);
            this.f60680n.setVisibility(8);
            this.f60674h.setVisibility(8);
        }
    }

    public void e() {
        if (this.f60691y != 1) {
            this.f60691y = 1;
            this.f60675i.getImageView().setVisibility(0);
            this.f60675i.getProgressBarView().setVisibility(8);
            this.f60672f.setVisibility(8);
            this.f60681o.setVisibility(0);
            this.f60680n.setVisibility(8);
            this.f60674h.setVisibility(0);
        }
    }

    public void f() {
        int i10 = this.f60691y;
        if (i10 == 0 || i10 == 2) {
            return;
        }
        this.f60691y = 0;
        this.f60675i.getImageView().setVisibility(8);
        this.f60675i.getProgressBarView().setVisibility(8);
        this.f60672f.setVisibility(8);
        this.f60681o.setVisibility(8);
        if (this.f60691y != 2) {
            this.f60680n.setVisibility(8);
        }
    }

    public void g() {
        this.f60675i.getImageView().setVisibility(0);
    }

    @NonNull
    public z getAdVideoView() {
        return this.f60679m;
    }

    @NonNull
    public MediaAdView getMediaAdView() {
        return this.f60675i;
    }

    public void h() {
        if (this.f60691y != 4) {
            this.f60691y = 4;
            this.f60675i.getImageView().setVisibility(0);
            this.f60675i.getProgressBarView().setVisibility(8);
            if (this.f60692z) {
                this.f60672f.setVisibility(0);
                this.f60674h.setVisibility(0);
            }
            this.f60681o.setVisibility(8);
            this.f60680n.setVisibility(8);
            this.f60677k.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = this.f60675i.getMeasuredWidth();
        int measuredHeight = this.f60675i.getMeasuredHeight();
        int i16 = (i14 - measuredWidth) >> 1;
        int i17 = (i15 - measuredHeight) >> 1;
        this.f60675i.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
        this.f60674h.layout(this.f60675i.getLeft(), this.f60675i.getTop(), this.f60675i.getRight(), this.f60675i.getBottom());
        int measuredWidth2 = this.f60681o.getMeasuredWidth();
        int i18 = i12 >> 1;
        int i19 = measuredWidth2 >> 1;
        int i20 = i13 >> 1;
        int measuredHeight2 = this.f60681o.getMeasuredHeight() >> 1;
        this.f60681o.layout(i18 - i19, i20 - measuredHeight2, i19 + i18, measuredHeight2 + i20);
        int measuredWidth3 = this.f60680n.getMeasuredWidth();
        int i21 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f60680n.getMeasuredHeight() >> 1;
        this.f60680n.layout(i18 - i21, i20 - measuredHeight3, i21 + i18, measuredHeight3 + i20);
        int measuredWidth4 = this.f60672f.getMeasuredWidth();
        int i22 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f60672f.getMeasuredHeight() >> 1;
        this.f60672f.layout(i18 - i22, i20 - measuredHeight4, i18 + i22, i20 + measuredHeight4);
        Button button = this.f60670d;
        int i23 = this.f60688v;
        button.layout(i23, i23, button.getMeasuredWidth() + i23, this.f60688v + this.f60670d.getMeasuredHeight());
        if (i14 <= i15) {
            this.f60678l.layout(((this.f60675i.getRight() - this.f60688v) - this.f60678l.getMeasuredWidth()) + this.f60678l.getPadding(), ((this.f60675i.getBottom() - this.f60688v) - this.f60678l.getMeasuredHeight()) + this.f60678l.getPadding(), (this.f60675i.getRight() - this.f60688v) + this.f60678l.getPadding(), (this.f60675i.getBottom() - this.f60688v) + this.f60678l.getPadding());
            TextView textView = this.f60667a;
            int i24 = i14 >> 1;
            textView.layout(i24 - (textView.getMeasuredWidth() >> 1), this.f60675i.getBottom() + this.f60688v, (this.f60667a.getMeasuredWidth() >> 1) + i24, this.f60675i.getBottom() + this.f60688v + this.f60667a.getMeasuredHeight());
            StarsRatingView starsRatingView = this.f60668b;
            starsRatingView.layout(i24 - (starsRatingView.getMeasuredWidth() >> 1), this.f60667a.getBottom() + this.f60688v, (this.f60668b.getMeasuredWidth() >> 1) + i24, this.f60667a.getBottom() + this.f60688v + this.f60668b.getMeasuredHeight());
            TextView textView2 = this.f60676j;
            textView2.layout(i24 - (textView2.getMeasuredWidth() >> 1), this.f60667a.getBottom() + this.f60688v, (this.f60676j.getMeasuredWidth() >> 1) + i24, this.f60667a.getBottom() + this.f60688v + this.f60676j.getMeasuredHeight());
            Button button2 = this.f60669c;
            button2.layout(i24 - (button2.getMeasuredWidth() >> 1), this.f60668b.getBottom() + this.f60688v, i24 + (this.f60669c.getMeasuredWidth() >> 1), this.f60668b.getBottom() + this.f60688v + this.f60669c.getMeasuredHeight());
            this.f60677k.layout(this.f60688v, (this.f60675i.getBottom() - this.f60688v) - this.f60677k.getMeasuredHeight(), this.f60688v + this.f60677k.getMeasuredWidth(), this.f60675i.getBottom() - this.f60688v);
            return;
        }
        int iMax = Math.max(this.f60669c.getMeasuredHeight(), Math.max(this.f60667a.getMeasuredHeight(), this.f60668b.getMeasuredHeight()));
        Button button3 = this.f60669c;
        int measuredWidth5 = (i14 - this.f60688v) - button3.getMeasuredWidth();
        int measuredHeight5 = ((i15 - this.f60688v) - this.f60669c.getMeasuredHeight()) - ((iMax - this.f60669c.getMeasuredHeight()) >> 1);
        int i25 = this.f60688v;
        button3.layout(measuredWidth5, measuredHeight5, i14 - i25, (i15 - i25) - ((iMax - this.f60669c.getMeasuredHeight()) >> 1));
        this.f60678l.layout((this.f60669c.getRight() - this.f60678l.getMeasuredWidth()) + this.f60678l.getPadding(), (((this.f60675i.getBottom() - (this.f60688v << 1)) - this.f60678l.getMeasuredHeight()) - iMax) + this.f60678l.getPadding(), this.f60669c.getRight() + this.f60678l.getPadding(), ((this.f60675i.getBottom() - (this.f60688v << 1)) - iMax) + this.f60678l.getPadding());
        StarsRatingView starsRatingView2 = this.f60668b;
        int left = (this.f60669c.getLeft() - this.f60688v) - this.f60668b.getMeasuredWidth();
        int measuredHeight6 = ((i15 - this.f60688v) - this.f60668b.getMeasuredHeight()) - ((iMax - this.f60668b.getMeasuredHeight()) >> 1);
        int left2 = this.f60669c.getLeft();
        int i26 = this.f60688v;
        starsRatingView2.layout(left, measuredHeight6, left2 - i26, (i15 - i26) - ((iMax - this.f60668b.getMeasuredHeight()) >> 1));
        TextView textView3 = this.f60676j;
        int left3 = (this.f60669c.getLeft() - this.f60688v) - this.f60676j.getMeasuredWidth();
        int measuredHeight7 = ((i15 - this.f60688v) - this.f60676j.getMeasuredHeight()) - ((iMax - this.f60676j.getMeasuredHeight()) >> 1);
        int left4 = this.f60669c.getLeft();
        int i27 = this.f60688v;
        textView3.layout(left3, measuredHeight7, left4 - i27, (i15 - i27) - ((iMax - this.f60676j.getMeasuredHeight()) >> 1));
        int iMin = Math.min(this.f60668b.getLeft(), this.f60676j.getLeft());
        TextView textView4 = this.f60667a;
        int measuredWidth6 = (iMin - this.f60688v) - textView4.getMeasuredWidth();
        int measuredHeight8 = ((i15 - this.f60688v) - this.f60667a.getMeasuredHeight()) - ((iMax - this.f60667a.getMeasuredHeight()) >> 1);
        int i28 = this.f60688v;
        textView4.layout(measuredWidth6, measuredHeight8, iMin - i28, (i15 - i28) - ((iMax - this.f60667a.getMeasuredHeight()) >> 1));
        vb vbVar = this.f60677k;
        int i29 = this.f60688v;
        vbVar.layout(i29, ((i15 - i29) - vbVar.getMeasuredHeight()) - ((iMax - this.f60677k.getMeasuredHeight()) >> 1), this.f60688v + this.f60677k.getMeasuredWidth(), (i15 - this.f60688v) - ((iMax - this.f60677k.getMeasuredHeight()) >> 1));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f60678l.measure(View.MeasureSpec.makeMeasureSpec(this.f60689w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60689w, 1073741824));
        this.f60677k.measure(View.MeasureSpec.makeMeasureSpec(this.f60689w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60689w, 1073741824));
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f60675i.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i12 = this.f60688v << 1;
        int i13 = size - i12;
        int i14 = size2 - i12;
        this.f60670d.measure(View.MeasureSpec.makeMeasureSpec(i13 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60680n.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60681o.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60672f.measure(View.MeasureSpec.makeMeasureSpec(i13 - (this.f60688v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60668b.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60674h.measure(View.MeasureSpec.makeMeasureSpec(this.f60675i.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f60675i.getMeasuredHeight(), 1073741824));
        this.f60669c.measure(View.MeasureSpec.makeMeasureSpec(i13 - (this.f60688v * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60667a.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60676j.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f60669c.getMeasuredWidth();
            int measuredWidth2 = this.f60667a.getMeasuredWidth();
            if (this.f60677k.getMeasuredWidth() + measuredWidth2 + Math.max(this.f60668b.getMeasuredWidth(), this.f60676j.getMeasuredWidth()) + measuredWidth + (this.f60688v * 3) > i13) {
                int measuredWidth3 = (i13 - this.f60677k.getMeasuredWidth()) - (this.f60688v * 3);
                int i15 = measuredWidth3 / 3;
                this.f60669c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60668b.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60676j.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                this.f60667a.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f60669c.getMeasuredWidth()) - this.f60676j.getMeasuredWidth()) - this.f60668b.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(@Nullable d dVar) {
        this.f60690x = dVar;
    }

    public void a(float f10, float f11) {
        if (this.f60677k.getVisibility() != 0) {
            this.f60677k.setVisibility(0);
        }
        this.f60677k.setProgress(f10 / f11);
        this.f60677k.setDigit((int) Math.ceil(f11 - f10));
    }

    public void a(boolean z10) {
        if (z10) {
            this.f60678l.a(this.f60687u, false);
            this.f60678l.setContentDescription("sound off");
        } else {
            this.f60678l.a(this.f60686t, false);
            this.f60678l.setContentDescription("sound on");
        }
    }

    public final void a() {
        if (this.f60691y != 0) {
            this.f60691y = 0;
            this.f60675i.getImageView().setVisibility(8);
            this.f60675i.getProgressBarView().setVisibility(8);
            this.f60672f.setVisibility(8);
            this.f60681o.setVisibility(8);
            this.f60680n.setVisibility(8);
            this.f60674h.setVisibility(8);
        }
    }
}
