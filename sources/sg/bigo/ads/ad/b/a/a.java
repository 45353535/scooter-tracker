package sg.bigo.ads.ad.b.a;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends sg.bigo.ads.ad.b.b {
    public a(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i10, viewArr);
        u.a(this.f100336c, ((sg.bigo.ads.ad.b.b) this).B);
    }

    @Override // sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.c
    public final void h() {
        if (((sg.bigo.ads.ad.b.b) this).f100197z > 0) {
            a("attach_render_cost", Long.valueOf(SystemClock.elapsedRealtime() - ((sg.bigo.ads.ad.b.b) this).f100197z));
        }
        super.h();
    }

    @Override // sg.bigo.ads.ad.c
    public final String j() {
        View view = this.f100336c;
        return view == null ? "" : view.getWidth() > this.f100336c.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.ad.b.b
    public final void a(@Nullable MediaView mediaView) {
        super.a(mediaView);
    }

    @Override // sg.bigo.ads.ad.b.b
    public final boolean a(@NonNull ViewGroup viewGroup, View view, int i10) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view == null || aVar == null) {
            return false;
        }
        view.setTag(1);
        sg.bigo.ads.ad.b.b.a(viewGroup, view);
        sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, this, this.H);
        return true;
    }
}
