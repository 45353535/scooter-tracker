package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Button;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d<MediaView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Button f101515a;

    public b(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z10, int i10, int i11) {
        super(context, cVar, z10, i10, i11, R.layout.bigo_ad_activity_interstitial_rich_video_multi_img_media_layout, R.id.inter_media_layout, R.id.inter_media, R.id.inter_media_main_background);
        this.f101515a = (Button) this.f101531j.findViewById(R.id.inter_btn_mute);
    }

    public final void a(final Bitmap bitmap) {
        ((MediaView) this.f101533l).post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(bitmap);
            }
        });
    }

    public final boolean b() {
        int i10;
        int i11 = this.f101530i;
        return i11 == 4 || i11 == 3 || (i10 = this.f101529h) == 4 || i10 == 3;
    }

    public final boolean c() {
        int i10;
        int i11 = this.f101530i;
        return i11 == 5 || i11 == 4 || (i10 = this.f101529h) == 5 || i10 == 4;
    }

    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d
    public final boolean a() {
        if (super.a()) {
            return true;
        }
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = this.f101528g;
        return cVar != null && cVar.f101470d == 3;
    }
}
