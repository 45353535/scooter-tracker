package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;
import com.ironsource.C4329g8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a*\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u0005\u001a*\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\u0005\u001a<\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u001e\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a,\u0010\u001d\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010#\u001a\u00020\"*\u00020\u00002\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$\u001a(\u0010'\u001a\u00020\u0002*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b'\u0010\u0005\u001a4\u0010'\u001a\u00020\u0002\"\n\b\u0000\u0010(\u0018\u0001*\u00020%*\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0087\b¢\u0006\u0004\b)\u0010\u0005\"*\u0010,\u001a\u00020**\u00020\u00002\u0006\u0010+\u001a\u00020*8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\"*\u00100\u001a\u00020**\u00020\u00002\u0006\u0010+\u001a\u00020*8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/\"*\u00102\u001a\u00020**\u00020\u00002\u0006\u0010+\u001a\u00020*8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/\"\u0016\u00106\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0016\u00108\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b7\u00105\"\u0016\u0010:\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00105\"\u0016\u0010<\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00105\"\u0016\u0010>\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00105\"\u0016\u0010@\u001a\u00020\f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00105\"\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010D\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00000A*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010D¨\u0006H"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "", "action", "doOnNextLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", "left", "right", "updatePadding", "size", "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "block", "updateLayoutParams", "T", "updateLayoutParamsTyped", "", "value", C4329g8.f43166k, "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "getMarginLeft", "(Landroid/view/View;)I", "marginLeft", "getMarginTop", "marginTop", "getMarginRight", "marginRight", "getMarginBottom", "marginBottom", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "getAllViews", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {
    public static final void doOnAttach(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnAttach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnDetach.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        } else {
            function1.invoke(view);
        }
    }

    public static final void doOnLayout(@NotNull View view, @NotNull final Function1<? super View, Unit> function1) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    function1.invoke(view2);
                }
            });
        } else {
            function1.invoke(view);
        }
    }

    public static final void doOnNextLayout(@NotNull View view, @NotNull final Function1<? super View, Unit> function1) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt.doOnNextLayout.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view2.removeOnLayoutChangeListener(this);
                function1.invoke(view2);
            }
        });
    }

    @NotNull
    public static final OneShotPreDrawListener doOnPreDraw(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt.doOnPreDraw.1
            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(view);
            }
        });
    }

    @NotNull
    public static final Bitmap drawToBitmap(@NotNull View view, @NotNull Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    @NotNull
    public static final Sequence<View> getAllViews(@NotNull View view) {
        return kotlin.sequences.k.b(new ViewKt$allViews$1(view, null));
    }

    @NotNull
    public static final Sequence<ViewParent> getAncestors(@NotNull View view) {
        return kotlin.sequences.k.q(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(@NotNull View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@NotNull View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable postDelayed(@NotNull View view, long j10, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postDelayed(runnable, j10);
        return runnable;
    }

    @NotNull
    public static final Runnable postOnAnimationDelayed(@NotNull View view, long j10, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.k0
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j10);
        return runnable;
    }

    public static final void setGone(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void setInvisible(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void setPadding(@NotNull View view, @Px int i10) {
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void setVisible(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final void updateLayoutParams(@NotNull View view, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1<? super T, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, "T");
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(@NotNull View view, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPadding(i10, i11, i12, i13);
    }

    public static final void updatePaddingRelative(@NotNull View view, @Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i10, i11, i12, i13);
    }
}
