package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58349a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57578b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57579c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58349a = iArr;
        }
    }

    public static final void a(d0 d0Var, a0 vastResource) {
        String strA;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        if (vastResource instanceof a0.c) {
            a0.c cVar = (a0.c) vastResource;
            int i10 = a.f58349a[cVar.a().a().ordinal()];
            if (i10 == 1) {
                strA = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + cVar.a().b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            } else {
                if (i10 != 2) {
                    throw new lf.m();
                }
                strA = "<script src=\"" + cVar.a().b() + "\"></script>";
            }
        } else if (vastResource instanceof a0.a) {
            strA = ((a0.a) vastResource).a().a();
        } else {
            if (!(vastResource instanceof a0.b)) {
                throw new lf.m();
            }
            strA = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((a0.b) vastResource).a().a() + "\"></iframe>";
        }
        try {
            e0.a(d0Var, d0Var.getHtmlCssFixer().a(strA));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e10.toString(), e10, false, 8, null);
        }
    }
}
