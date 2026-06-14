package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewSpline extends SplineSet {
    private static final String TAG = "ViewSpline";

    static class AlphaSet extends ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setAlpha(get(f10));
        }
    }

    public static class CustomSet extends ViewSpline {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(StringUtils.COMMA)[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            this.mCurveFit.getPos(f10, this.mTempValues);
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i10) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i12 = 0;
                while (true) {
                    if (i12 < this.mTempValues.length) {
                        dArr2[i11][i12] = r6[i12];
                        i12++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i10, constraintAttribute);
        }
    }

    static class ElevationSet extends ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setElevation(get(f10));
        }
    }

    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f10, double d10, double d11) {
            view.setRotation(get(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
        }
    }

    static class PivotXset extends ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setPivotX(get(f10));
        }
    }

    static class PivotYset extends ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setPivotY(get(f10));
        }
    }

    static class ProgressSet extends ViewSpline {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f10));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e11);
                }
            }
        }
    }

    static class RotationSet extends ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setRotation(get(f10));
        }
    }

    static class RotationXset extends ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setRotationX(get(f10));
        }
    }

    static class RotationYset extends ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setRotationY(get(f10));
        }
    }

    static class ScaleXset extends ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setScaleX(get(f10));
        }
    }

    static class ScaleYset extends ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setScaleY(get(f10));
        }
    }

    static class TranslationXset extends ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setTranslationX(get(f10));
        }
    }

    static class TranslationYset extends ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setTranslationY(get(f10));
        }
    }

    static class TranslationZset extends ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f10) {
            view.setTranslationZ(get(f10));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ViewSpline makeSpline(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    b10 = 8;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    b10 = Ascii.VT;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = Ascii.FF;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = Ascii.SO;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = Ascii.SI;
                }
                break;
        }
        switch (b10) {
        }
        return new AlphaSet();
    }

    public abstract void setProperty(View view, float f10);
}
