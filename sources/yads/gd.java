package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
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
public final class gd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f111144d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql0 f111145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b92 f111146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f111147c;

    public /* synthetic */ gd(ql0 ql0Var, b92 b92Var) {
        this(ql0Var, b92Var, new b1());
    }

    public final void a(Activity activity, id idVar, pc pcVar) {
        yc ycVar = new yc(activity, false, 14);
        vc1 vc1Var = new vc1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(ycVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (sb.a(35)) {
                sc.a(viewGroup2);
            }
            viewGroup2.addView(idVar);
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
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.w6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gd.a(dialogInterface);
            }
        });
        ql0 ql0Var = this.f111145a;
        b92 b92Var = this.f111146b;
        Handler handler = new Handler(Looper.getMainLooper());
        vc vcVar = new vc(dialog, idVar, ql0Var, b92Var, handler);
        String str = pcVar.f114607b;
        String str2 = pcVar.f114608c;
        idVar.setAdtuneWebViewListener(new tc(vcVar));
        idVar.setOptOutUrl(str2);
        idVar.loadUrl(str);
        handler.postDelayed(new uc(vcVar), vc.f116954e);
        dialog.show();
    }

    public gd(ql0 ql0Var, b92 b92Var, b1 b1Var) {
        this.f111145a = ql0Var;
        this.f111146b = b92Var;
        this.f111147c = b1Var;
    }

    public static final void a(DialogInterface dialogInterface) {
        f111144d = false;
    }

    public final void a(View view, pc pcVar) {
        Activity activity;
        Activity activityB;
        if (f111144d) {
            return;
        }
        this.f111147c.getClass();
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (j1.f112214a) {
                k1 k1Var = j1.f112215b;
                activityB = k1Var != null ? k1Var.b() : null;
            }
            activity = activityB;
        }
        if (activity == null || !rb.a((Context) activity)) {
            return;
        }
        try {
            id idVar = new id(activity);
            f111144d = true;
            a(activity, idVar, pcVar);
        } catch (Throwable unused) {
            f111144d = false;
        }
    }
}
