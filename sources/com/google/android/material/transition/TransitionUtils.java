package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RectF f28432a = new RectF();

    interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    static float b(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    static ShapeAppearanceModel c(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
            }
        });
    }

    static Shader d(int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i10, i10, Shader.TileMode.CLAMP);
    }

    static Object e(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    static View f(View view, int i10) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    static View g(View view, int i10) {
        View viewFindViewById = view.findViewById(i10);
        return viewFindViewById != null ? viewFindViewById : f(view, i10);
    }

    static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean j(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    static float k(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    static float l(float f10, float f11, float f12, float f13, float f14) {
        return m(f10, f11, f12, f13, f14, false);
    }

    static float m(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        return (!z10 || (f14 >= 0.0f && f14 <= 1.0f)) ? f14 < f12 ? f10 : f14 > f13 ? f11 : k(f10, f11, (f14 - f12) / (f13 - f12)) : k(f10, f11, f14);
    }

    static int n(int i10, int i11, float f10, float f11, float f12) {
        return f12 < f10 ? i10 : f12 > f11 ? i11 : (int) k(i10, i11, (f12 - f10) / (f11 - f10));
    }

    static ShapeAppearanceModel o(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, final RectF rectF, final RectF rectF2, final float f10, final float f11, final float f12) {
        return f12 < f10 ? shapeAppearanceModel : f12 > f11 ? shapeAppearanceModel2 : v(shapeAppearanceModel, shapeAppearanceModel2, rectF, new CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1
            @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
                return new AbsoluteCornerSize(TransitionUtils.l(cornerSize.getCornerSize(rectF), cornerSize2.getCornerSize(rectF2), f10, f11, f12));
            }
        });
    }

    static boolean p(Transition transition, Context context, int i10) {
        int iResolveThemeDuration;
        if (i10 == 0 || transition.getDuration() != -1 || (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i10, -1)) == -1) {
            return false;
        }
        transition.setDuration(iResolveThemeDuration);
        return true;
    }

    static boolean q(Transition transition, Context context, int i10, TimeInterpolator timeInterpolator) {
        if (i10 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i10, timeInterpolator));
        return true;
    }

    static boolean r(Transition transition, Context context, int i10) {
        PathMotion pathMotionS;
        if (i10 == 0 || (pathMotionS = s(context, i10)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionS);
        return true;
    }

    static PathMotion s(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.type;
        if (i11 != 16) {
            if (i11 == 3) {
                return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i12 = typedValue.data;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 1) {
            return new MaterialArcMotion();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i12);
    }

    private static int t(Canvas canvas, Rect rect, int i10) {
        RectF rectF = f28432a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i10);
    }

    static void u(Canvas canvas, Rect rect, float f10, float f11, float f12, int i10, CanvasCompat.CanvasOperation canvasOperation) {
        if (i10 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        if (i10 < 255) {
            t(canvas, rect, i10);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(iSave);
    }

    static ShapeAppearanceModel v(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
        return (j(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeBinaryOperator.apply(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
