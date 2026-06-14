package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv1 f112386a = new uv1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv1 f112387b = new mv1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kv1 f112388c = new kv1();

    public final ys2 a(t9 t9Var, es2 es2Var, CustomizableMediaView customizableMediaView, hg2 hg2Var, List list, mm1 mm1Var, zv2 zv2Var) {
        hv1 hv1Var;
        Long l10;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        nv1 nv1Var = new nv1(context, t9Var, es2Var);
        vv1 vv1Var = new vv1(viewPager2);
        long jLongValue = (zv2Var == null || (l10 = zv2Var.f118848b) == null) ? 0L : l10.longValue();
        if (jLongValue > 0) {
            hv1Var = new hv1(viewPager2, vv1Var, nv1Var, new eg1());
            viewPager2.addOnAttachStateChangeListener(new rv1(hv1Var, jLongValue));
        } else {
            hv1Var = null;
        }
        viewPager2.registerOnPageChangeCallback(new t92(nv1Var, hv1Var));
        mv1 mv1Var = this.f112387b;
        mv1Var.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        zp2 zp2Var = mv1Var.f113616a;
        int i10 = R$layout.monetization_ads_internal_multibanner_controls;
        zp2Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) zp2.a(context, MultiBannerControlsContainer.class, i10, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(viewPager2);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new hz(vv1Var, nv1Var, hv1Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new iz(vv1Var, nv1Var, hv1Var));
        }
        kv1 kv1Var = this.f112388c;
        kv1Var.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        kv1Var.f112873a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new ki2((float) sv1.a(list), new vh1()));
        this.f112386a.getClass();
        if (!aq0.a(customizableMediaView.getContext(), zp0.f118752e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        return new ys2(customizableMediaView, mm1Var, new oh3(new wv1(viewPager2, hg2Var, ((pr3) es2Var).a(), t9Var)));
    }
}
