package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.core.adview.f;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes4.dex */
public class MediaView extends sg.bigo.ads.api.a<f> {

    public interface a {
        void a(sg.bigo.ads.core.player.b.b bVar);

        void a(boolean z10);

        boolean a();

        void b();
    }

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new f(this);
    }

    public final float b(int i10, int i11) {
        f viewImpl = getViewImpl();
        if (viewImpl.f103898c == null) {
            return 0.0f;
        }
        return viewImpl.c() > viewImpl.d() ? (((i11 * viewImpl.c()) / viewImpl.d()) * 1.0f) / i10 : (((i10 * viewImpl.d()) / viewImpl.c()) * 1.0f) / i11;
    }

    public final void c() {
        f viewImpl = getViewImpl();
        AdImageView adImageView = viewImpl.f103898c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            viewImpl.f103898c.a();
            viewImpl.f103898c = null;
        }
        sg.bigo.ads.core.player.b.f fVar = viewImpl.f103897b;
        if (fVar != null) {
            fVar.d();
            viewImpl.f103897b = null;
        }
    }

    public View getImage() {
        return getViewImpl().f103898c;
    }

    @Nullable
    public VideoController getVideoController() {
        return getViewImpl().f103901f;
    }

    public void setImageBlurBorder(boolean z10) {
        getViewImpl().f103902g = z10;
    }

    public void setMediaAreaClickable(boolean z10) {
        getViewImpl().f103900e = Boolean.valueOf(z10);
    }

    public void setOtherClickAreaClick(boolean z10) {
        getViewImpl().f103899d = Boolean.valueOf(z10);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Bitmap bitmap) {
        getViewImpl().f103902g = false;
        f viewImpl = getViewImpl();
        if (bitmap != null) {
            int iA = e.a(viewImpl.f103878a.getContext(), 10);
            int iA2 = e.a(viewImpl.f103878a.getContext(), 4);
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewImpl.f103878a.getContext());
            roundedFrameLayout.setCornerRadius(iA2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z10 = (width == height && viewImpl.f103878a.getWidth() <= viewImpl.f103878a.getHeight()) || width > height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z10 ? -1 : -2, z10 ? -2 : -1, 17);
            layoutParams.setMargins(iA, iA, iA, iA);
            roundedFrameLayout.setLayoutParams(layoutParams);
            AdImageView adImageView = new AdImageView(viewImpl.f103878a.getContext());
            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            u.a(adImageView, roundedFrameLayout, null, -1);
            u.a(roundedFrameLayout, viewImpl.f103878a, null, -1);
            adImageView.setBlurBorder(viewImpl.f103902g);
            adImageView.setImageBitmap(bitmap);
        }
    }

    @NonNull
    public final a b() {
        return getViewImpl();
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public final void a(@NonNull String str) {
        getViewImpl().a(str);
    }

    public final void a(@NonNull n nVar, @Nullable g gVar) {
        getViewImpl().a(nVar, gVar);
    }

    public final void a(@NonNull sg.bigo.ads.core.a.a aVar, @NonNull p pVar, sg.bigo.ads.core.g.c cVar) {
        getViewImpl().a(aVar, pVar, cVar);
    }

    public final void a(@NonNull sg.bigo.ads.core.player.b.d dVar) {
        getViewImpl().a(dVar);
    }
}
