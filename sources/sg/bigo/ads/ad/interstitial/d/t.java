package sg.bigo.ads.ad.interstitial.d;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.ironsource.C4240b4;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes4.dex */
public class t extends u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f101061x;

    public t(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    private int[] C() {
        int i10;
        int i11;
        if (x() == 1) {
            i10 = ViewCompat.MEASURED_SIZE_MASK;
            i11 = -1;
        } else {
            i10 = 2105636;
            i11 = ViewCompat.MEASURED_STATE_MASK;
        }
        return new int[]{i10, i11};
    }

    @Override // sg.bigo.ads.ad.interstitial.d.u
    protected final int A() {
        return this.f101061x;
    }

    protected boolean B() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.u
    protected final void a(@NonNull ViewGroup viewGroup, sg.bigo.ads.common.p pVar) {
        View viewFindViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        int height = pVar.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.height = height + 5;
        marginLayoutParams.topMargin = height;
        viewFindViewById.setLayoutParams(marginLayoutParams);
        ((GradientDrawable) viewFindViewById.getBackground()).setColors(C());
        int i10 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
        View viewFindViewById2 = viewGroup.findViewById(R.id.bigo_ad_mask_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        int i11 = i10 / 3;
        marginLayoutParams2.width = i11;
        marginLayoutParams2.height = pVar.f102605c;
        marginLayoutParams2.leftMargin = i11;
        viewFindViewById2.setLayoutParams(marginLayoutParams2);
        ((GradientDrawable) viewFindViewById2.getBackground()).setColors(z());
        if (B()) {
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
            View viewFindViewById3 = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
            if (imageView == null || viewFindViewById3 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewFindViewById3.getLayoutParams();
            marginLayoutParams3.leftMargin = i11;
            marginLayoutParams4.leftMargin = i11;
            imageView.setLayoutParams(marginLayoutParams3);
            viewFindViewById3.setLayoutParams(marginLayoutParams4);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.u
    protected final void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f101734c);
        this.f101061x = Math.round(viewGroup.getContext().getResources().getDisplayMetrics().widthPixels * 0.666f);
        sg.bigo.ads.common.p pVarB = sg.bigo.ads.common.p.b(pVarA.getWidth(), pVarA.getHeight(), this.f101061x);
        ViewGroup.LayoutParams layoutParams = ((u) this).f101063y.getLayoutParams();
        layoutParams.width = pVarB.f102604b;
        layoutParams.height = pVarB.f102605c;
        ((u) this).f101063y.setLayoutParams(layoutParams);
        int height = pVarB.getHeight() / 2;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.topMargin = height + sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
        linearLayout.setLayoutParams(layoutParams2);
        a(viewGroup, pVarB);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_star);
        float fA = (sg.bigo.ads.ad.b.e.a(C4240b4.i.W, 4) * 0.5f) + 4.5f;
        Bitmap bitmapA = sg.bigo.ads.common.utils.d.a(viewGroup.getContext(), fA, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal_white, R.drawable.bigo_ad_ic_star_half_white);
        if (x() == 1) {
            bitmapA = sg.bigo.ads.common.utils.d.a(viewGroup.getContext(), fA, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
        }
        imageView.setImageBitmap(bitmapA);
        int i10 = this.f101061x;
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = i10;
            textView.setLayoutParams(layoutParams3);
        }
    }

    protected int[] z() {
        int i10;
        int i11;
        if (x() == 1) {
            i10 = -1;
            i11 = ViewCompat.MEASURED_SIZE_MASK;
        } else {
            i10 = ViewCompat.MEASURED_STATE_MASK;
            i11 = 2105636;
        }
        return new int[]{i10, i11};
    }
}
