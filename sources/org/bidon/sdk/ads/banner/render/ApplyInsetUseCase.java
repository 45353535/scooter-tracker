package org.bidon.sdk.ads.banner.render;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/ApplyInsetUseCase;", "", "<init>", "()V", "applyWindowInsets", "Lorg/bidon/sdk/ads/banner/render/RootAdContainer;", "requestApplyInsetsWhenAttached", "", "Landroid/view/View;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplyInsetUseCase {

    @NotNull
    public static final ApplyInsetUseCase INSTANCE = new ApplyInsetUseCase();

    private ApplyInsetUseCase() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applyWindowInsets$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        if (view != null && windowInsetsCompat != null) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).setMargins(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
        }
        return windowInsetsCompat;
    }

    private final void requestApplyInsetsWhenAttached(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: org.bidon.sdk.ads.banner.render.ApplyInsetUseCase.requestApplyInsetsWhenAttached.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnAttachStateChangeListener(this);
                    view2.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                }
            });
        }
    }

    @NotNull
    public final RootAdContainer applyWindowInsets(@NotNull RootAdContainer rootAdContainer) {
        Intrinsics.checkNotNullParameter(rootAdContainer, "<this>");
        ViewCompat.setOnApplyWindowInsetsListener(rootAdContainer, new OnApplyWindowInsetsListener() { // from class: org.bidon.sdk.ads.banner.render.h
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ApplyInsetUseCase.applyWindowInsets$lambda$0(view, windowInsetsCompat);
            }
        });
        requestApplyInsetsWhenAttached(rootAdContainer);
        return rootAdContainer;
    }
}
