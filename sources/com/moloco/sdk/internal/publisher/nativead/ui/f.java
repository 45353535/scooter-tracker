package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55042b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ f(Context context, Uri uri, g0 g0Var, Function0 function0, t0 t0Var, r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uri, g0Var, function0, (i10 & 16) != 0 ? b.h.f55827a.f() : t0Var, (i10 & 32) != 0 ? t.a() : rVar);
    }

    public static final Unit a(r rVar, a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        rVar.m(button);
        return Unit.f93236a;
    }

    public static final void b(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Uri imageUri, g0 watermark, final Function0 function0, t0 externalLinkHandler, final r buttonTracker) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(imageUri);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.b(function0, view);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i(externalLinkHandler, context, null, 0, 12, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        iVar.setPadding(16, 0, 0, 16);
        iVar.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.a(buttonTracker, (a.AbstractC0780a.c) obj);
            }
        });
        iVar.setLayoutParams(layoutParams);
        watermark.a(imageView);
        addView(imageView);
        addView(iVar);
    }
}
