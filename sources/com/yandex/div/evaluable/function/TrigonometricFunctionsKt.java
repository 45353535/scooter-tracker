package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import kotlin.Metadata;
import lf.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"evaluateMathResult", "", "result", "", "name", "", "args", "isValidTrigonometricResult", "", "value", "threshold", "throwIncorrectMathValueException", "", "toMathFunctionDisplayName", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TrigonometricFunctionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object evaluateMathResult(double d10, String str, double d11) {
        if (!isValidTrigonometricResult$default(d10, 0.0d, 2, null)) {
            throwIncorrectMathValueException(str, d11);
        }
        return Double.valueOf(d10);
    }

    private static final boolean isValidTrigonometricResult(double d10, double d11) {
        return !Double.isNaN(d10) && Math.abs(d10) <= d11;
    }

    static /* synthetic */ boolean isValidTrigonometricResult$default(double d10, double d11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d11 = 1.0E10d;
        }
        return isValidTrigonometricResult(d10, d11);
    }

    private static final void throwIncorrectMathValueException(String str, double d10) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(str + '(' + d10 + ')', toMathFunctionDisplayName(str) + " is undefined for the given value.", null, 4, null);
        throw new g();
    }

    private static final String toMathFunctionDisplayName(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 98696) {
            if (iHashCode != 2988422) {
                if (iHashCode == 3003607 && str.equals("asin")) {
                    return "Arcsine";
                }
            } else if (str.equals("acos")) {
                return "Arccosine";
            }
        } else if (str.equals("cot")) {
            return "Cotangent";
        }
        return str;
    }
}
