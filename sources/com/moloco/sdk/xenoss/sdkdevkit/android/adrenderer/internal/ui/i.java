package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.R$drawable;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f57033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageButton f57035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function1 f57036e;

    public /* synthetic */ i(t0 t0Var, Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0Var, context, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }

    public static final void a(i iVar, View view) {
        iVar.f57033b.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
    }

    public static final void b(i iVar, String str, View view) {
        iVar.f57033b.a(str);
    }

    @VisibleForTesting
    @NotNull
    public final ImageButton getAdButton() {
        return this.f57035d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            float f10 = getResources().getDisplayMetrics().density;
            this.f57035d.getLocationOnScreen(new int[2]);
            a.AbstractC0780a.c cVar = new a.AbstractC0780a.c(a.AbstractC0780a.c.EnumC0782a.f58918j, new a.AbstractC0780a.f(r6[0] / f10, r6[1] / f10), new a.AbstractC0780a.g(this.f57035d.getWidth() / f10, this.f57035d.getHeight() / f10));
            Function1 function1 = this.f57036e;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    public final void setOnButtonRenderedListener(@NotNull Function1<? super a.AbstractC0780a.c, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f57036e = listener;
    }

    public final void setPrivacyUrl(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f57035d.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.b(this.f57020b, url, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t0 externalLinkHandler, Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57033b = externalLinkHandler;
        this.f57034c = 12;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(j.a(12, context), j.a(12, context)));
        imageButton.setImageResource(R$drawable.f53878e);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.a(this.f57023b, view);
            }
        });
        this.f57035d = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }
}
