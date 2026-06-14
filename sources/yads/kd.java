package yads;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md f112677b;

    public kd(md mdVar) {
        this.f112677b = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        md mdVar = this.f112677b;
        bd bdVar = mdVar.f113427a;
        String str = mdVar.f113430d;
        bdVar.getClass();
        if (str != null) {
            cd cdVar = new cd(bdVar.f108972a);
            Context context = bdVar.f108972a;
            yc ycVar = new yc(context, true, 12);
            vc1 vc1Var = new vc1();
            Dialog dialog = new Dialog(context, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) viewInflate;
            ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
            if (extendedViewContainer != null) {
                extendedViewContainer.setMeasureSpecProvider(ycVar);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
            if (viewGroup2 != null) {
                viewGroup2.addView(cdVar);
            }
            View viewFindViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
            if (viewFindViewById != null) {
                viewFindViewById.setOnTouchListener(new xc(viewGroup, dialog, vc1Var));
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new wc(dialog, vc1Var));
            }
            dialog.setContentView(viewGroup);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            cdVar.setAdtuneWebViewListener(new zc(new ad(dialog, cdVar)));
            cdVar.loadUrl(str);
            dialog.show();
        }
    }
}
