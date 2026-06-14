package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.taurusx.tax.ui.CircularProgressBar;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.player.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends FrameLayout implements sg.bigo.ads.api.c.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private ImageView f104662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected sg.bigo.ads.core.g.c f104663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected Context f104664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    protected final sg.bigo.ads.api.c.b f104665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    protected final sg.bigo.ads.core.a.a f104666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f104667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f104668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f104669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f104670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f104671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f104672k;

    public f(@NonNull Context context, @NonNull sg.bigo.ads.api.c.b bVar, @Nullable sg.bigo.ads.core.a.a aVar) {
        super(context);
        this.f104667f = true;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == f.this.f104662a) {
                    f.this.o();
                    return;
                }
                f fVar = f.this;
                if (view == fVar) {
                    fVar.p();
                }
            }
        };
        this.f104670i = onClickListener;
        this.f104671j = new Runnable() { // from class: sg.bigo.ads.core.player.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.setPlayOrPauseViewHidden(true);
            }
        };
        this.f104668g = false;
        this.f104672k = true;
        this.f104664c = context;
        this.f104665d = bVar;
        this.f104666e = aVar;
        if (!bVar.f102148c) {
            int iB = sg.bigo.ads.common.utils.a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f104664c);
            this.f104662a = imageView;
            imageView.setOnClickListener(onClickListener);
            this.f104662a.setPadding(iB, iB, iB, iB);
            int iB2 = sg.bigo.ads.common.utils.a.b(this.f104664c, R.dimen.bigo_ad_volume_size) + (iB * 2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f104662a.setVisibility(0);
            u.a(this.f104662a, this, layoutParams, -1);
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f104664c, R.dimen.bigo_ad_replay_size);
        if (aVar != null && aVar.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f104664c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f104664c);
        this.f104669h = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, R.drawable.bigo_ad_ic_media_play));
        u.a(this.f104669h, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        setOnClickListener(onClickListener);
    }

    protected final void b(int i10) {
        sg.bigo.ads.core.a.a aVar = this.f104666e;
        if (aVar != null) {
            sg.bigo.ads.core.d.b.a(aVar, i10, aVar.aK(), this.f104666e.aM());
        }
    }

    protected final void c(boolean z10) {
        ImageView imageView = this.f104669h;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, z10 ? R.drawable.bigo_ad_ic_media_play : R.drawable.bigo_ad_ic_media_pause));
        }
    }

    protected final void d(boolean z10) {
        if (z10) {
            d.a.f104695a.a(this);
        } else {
            d.a.f104695a.b(this);
        }
    }

    public final void e(boolean z10) {
        if (this.f104668g) {
            b(9);
        }
        a(z10);
    }

    protected boolean n() {
        return this.f104672k;
    }

    protected final void o() {
        setMute(!c());
    }

    protected final void p() {
        v();
    }

    protected final boolean q() {
        return this.f104668g;
    }

    protected final void r() {
        this.f104668g = false;
    }

    public final void s() {
        if (t()) {
            a();
        }
    }

    public void setNeedPauseWhenVisiblePercentEqual(boolean z10) {
        this.f104667f = z10;
    }

    public void setOnEventListener(sg.bigo.ads.core.g.c cVar) {
        this.f104663b = cVar;
    }

    protected void setPlayOrPauseViewHidden(boolean z10) {
        ImageView imageView = this.f104669h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 8 : 0);
        }
    }

    protected void setStatPrepareEventOnce(boolean z10) {
        this.f104672k = z10;
    }

    protected void setVolumeViewHidden(boolean z10) {
        ImageView imageView = this.f104662a;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 4 : 0);
        }
    }

    public final boolean t() {
        return getPlayStatus() == 2;
    }

    public final void u() {
        this.f104668g = true;
        a();
        b(8);
    }

    public final void v() {
        if (e()) {
            if (t()) {
                removeCallbacks(this.f104671j);
                u();
                setPlayOrPauseViewHidden(false);
                c(true);
                return;
            }
            removeCallbacks(this.f104671j);
            e(false);
            this.f104669h.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            c(false);
            postDelayed(this.f104671j, CircularProgressBar.E);
        }
    }

    public final void a(String str, Object obj, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f104663b;
        if (cVar != null) {
            cVar.a(str, obj, iArr);
        }
    }

    protected final void b(boolean z10) {
        ImageView imageView = this.f104662a;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f104664c, z10 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
    }

    protected boolean e() {
        return false;
    }

    public final void a(String str, @Nullable int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f104663b;
        if (cVar != null) {
            cVar.a(str, iArr);
        }
    }

    @CallSuper
    protected void a(boolean z10) {
        this.f104668g = false;
    }
}
