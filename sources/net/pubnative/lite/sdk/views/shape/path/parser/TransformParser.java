package net.pubnative.lite.sdk.views.shape.path.parser;

import android.graphics.Matrix;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class TransformParser {
    private static final String TAG = SvgToPath.class.getSimpleName();

    TransformParser() {
    }

    static Matrix parseTransform(String str) {
        int i10;
        Matrix matrix = new Matrix();
        while (true) {
            parseTransformItem(str, matrix);
            int iIndexOf = str.indexOf(")");
            if (iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) {
                break;
            }
            str = str.substring(i10).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    private static void parseTransformItem(String str, Matrix matrix) {
        float f10;
        if (str.startsWith("matrix(")) {
            NumberParse numbers = NumberParse.parseNumbers(str.substring(7));
            if (numbers.numbers.size() == 6) {
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{numbers.numbers.get(0).floatValue(), numbers.numbers.get(2).floatValue(), numbers.numbers.get(4).floatValue(), numbers.numbers.get(1).floatValue(), numbers.numbers.get(3).floatValue(), numbers.numbers.get(5).floatValue(), 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
                return;
            }
            return;
        }
        if (str.startsWith("translate(")) {
            NumberParse numbers2 = NumberParse.parseNumbers(str.substring(10));
            if (numbers2.numbers.size() > 0) {
                matrix.preTranslate(numbers2.numbers.get(0).floatValue(), numbers2.numbers.size() > 1 ? numbers2.numbers.get(1).floatValue() : 0.0f);
                return;
            }
            return;
        }
        if (str.startsWith("scale(")) {
            NumberParse numbers3 = NumberParse.parseNumbers(str.substring(6));
            if (numbers3.numbers.size() > 0) {
                float fFloatValue = numbers3.numbers.get(0).floatValue();
                matrix.preScale(fFloatValue, numbers3.numbers.size() > 1 ? numbers3.numbers.get(1).floatValue() : fFloatValue);
                return;
            }
            return;
        }
        if (str.startsWith("skewX(")) {
            if (NumberParse.parseNumbers(str.substring(6)).numbers.size() > 0) {
                matrix.preSkew((float) Math.tan(r0.numbers.get(0).floatValue()), 0.0f);
                return;
            }
            return;
        }
        if (str.startsWith("skewY(")) {
            if (NumberParse.parseNumbers(str.substring(6)).numbers.size() > 0) {
                matrix.preSkew(0.0f, (float) Math.tan(r0.numbers.get(0).floatValue()));
                return;
            }
            return;
        }
        if (!str.startsWith("rotate(")) {
            Log.w(TAG, "Invalid transform (" + str + ")");
            return;
        }
        NumberParse numbers4 = NumberParse.parseNumbers(str.substring(7));
        if (numbers4.numbers.size() > 0) {
            float fFloatValue2 = numbers4.numbers.get(0).floatValue();
            if (numbers4.numbers.size() > 2) {
                float fFloatValue3 = numbers4.numbers.get(1).floatValue();
                fFloatValue = numbers4.numbers.get(2).floatValue();
                f10 = fFloatValue3;
            } else {
                f10 = 0.0f;
            }
            matrix.preTranslate(f10, fFloatValue);
            matrix.preRotate(fFloatValue2);
            matrix.preTranslate(-f10, -fFloatValue);
        }
    }
}
