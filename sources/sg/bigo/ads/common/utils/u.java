package sg.bigo.ads.common.utils;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    public interface a {
        void a(@NonNull Rect rect);
    }

    @NonNull
    public static Point a(View view, View view2) {
        if (view == null || view2 == null) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = -iArr[0];
        int i11 = -iArr[1];
        view2.getLocationOnScreen(iArr);
        return new Point(i10 + iArr[0], i11 + iArr[1]);
    }

    @SuppressLint({"ViewRemove"})
    public static void b(@Nullable View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
            return;
        }
        sg.bigo.ads.common.t.a.a(0, "Views", "parent is not a view group, parent:" + view.getParent());
    }

    public static void c(View view, int i10, int i11) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i10, i11);
        } else {
            layoutParams.width = i10;
            layoutParams.height = i11;
        }
        view.setLayoutParams(layoutParams);
    }

    public static boolean d(@NonNull View view) {
        Object parent;
        if (sg.bigo.ads.common.aa.b.b() || view.getWindowVisibility() != 0) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 0.9f && (parent = view.getParent()) != null) {
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    private static Point e(View view) {
        if (view == null || view.getVisibility() == 8) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Rect a(View view, int i10) {
        if (view == null || view.getVisibility() == 8) {
            return new Rect();
        }
        Point pointE = e(view);
        int i11 = pointE.x;
        return new Rect(i11 - i10, pointE.y - i10, i11 + view.getMeasuredWidth() + i10, pointE.y + view.getMeasuredHeight() + i10);
    }

    public static boolean b(@Nullable View view, int i10, int i11) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains(i10 - (iArr[0] - iArr2[0]), i11 - (iArr[1] - iArr2[1]));
    }

    public static boolean c(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @Nullable
    public static View a(@Nullable Context context, @Nullable View view) {
        View viewFindViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        if (view == null) {
            return null;
        }
        if (!c(view)) {
            sg.bigo.ads.common.t.a.b("Views", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View viewFindViewById2 = rootView.findViewById(R.id.content);
        return viewFindViewById2 != null ? viewFindViewById2 : rootView;
    }

    public static void a(View view, final View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (view == null || onAttachStateChangeListener == null) {
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.utils.u.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewAttachedToWindow(view2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewDetachedFromWindow(view2);
                }
            }
        });
    }

    public static void a(@Nullable View view, @Nullable ViewGroup viewGroup, @Nullable ViewGroup.LayoutParams layoutParams, int i10) {
        if (view == null || viewGroup == null) {
            return;
        }
        if (view.getParent() == null) {
            if (layoutParams == null) {
                viewGroup.addView(view, i10);
                return;
            } else {
                viewGroup.addView(view, i10, layoutParams);
                return;
            }
        }
        if (view.getParent() != viewGroup) {
            b(view);
            if (layoutParams == null) {
                viewGroup.addView(view, i10);
            } else {
                viewGroup.addView(view, i10, layoutParams);
            }
        }
    }

    public static void a(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.common.utils.u.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
                onGlobalLayoutListener.onGlobalLayout();
            }
        });
    }

    public static void a(final View view, final a aVar) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: sg.bigo.ads.common.utils.u.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f102841c = false;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                a aVar2 = aVar;
                if (aVar2 != null && !this.f102841c) {
                    this.f102841c = true;
                    Rect rect = new Rect(i10, i11, i12, i13);
                    new Rect(i14, i15, i16, i17);
                    aVar2.a(rect);
                }
                view.post(new Runnable() { // from class: sg.bigo.ads.common.utils.u.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.removeOnLayoutChangeListener(this);
                    }
                });
            }
        });
    }

    public static void a(ViewGroup viewGroup, sg.bigo.ads.common.d<View> dVar) {
        if (viewGroup == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
            for (int i10 = 0; i10 < viewGroup2.getChildCount(); i10++) {
                View childAt = viewGroup2.getChildAt(i10);
                dVar.a(childAt);
                if (childAt instanceof ViewGroup) {
                    linkedList.add((ViewGroup) childAt);
                }
            }
        }
    }

    public static boolean a(int i10, int i11, @NonNull View view) {
        return i10 >= view.getLeft() && i10 <= view.getRight() && i11 >= view.getTop() && i11 <= view.getBottom();
    }

    private static boolean a(Context context) {
        if (context instanceof Activity) {
            return sg.bigo.ads.common.r.a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return sg.bigo.ads.common.r.a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
            }
        }
        return false;
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (a(view.getContext())) {
            return true;
        }
        while (true) {
            if ((view == null ? false : sg.bigo.ads.common.r.a.a(view.getClass(), "io.flutter.plugin.platform.PlatformViewWrapper", "io.flutter.embedding.android.FlutterView")) || a(view.getContext())) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
    }

    public static boolean a(View view, int i10, int i11) {
        return i10 >= 0 && i10 <= view.getWidth() && i11 >= 0 && i11 <= view.getHeight();
    }
}
