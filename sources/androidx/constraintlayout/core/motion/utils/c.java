package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    static {
        String str = TypedValues.CycleType.NAME;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1310311125:
                b10 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                break;
            case -1249320806:
                b10 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                break;
            case -1249320805:
                b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                break;
            case -1249320804:
                b10 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                break;
            case -1225497657:
                b10 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                break;
            case -1225497656:
                b10 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                break;
            case -1225497655:
                b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                break;
            case -1001078227:
                b10 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                break;
            case -987906986:
                b10 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                break;
            case -987906985:
                b10 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : Ascii.VT;
                break;
            case 92909918:
                b10 = !str.equals("alpha") ? (byte) -1 : Ascii.FF;
                break;
            case 579057826:
                b10 = !str.equals("curveFit") ? (byte) -1 : (byte) 13;
                break;
            case 803192288:
                b10 = !str.equals("pathRotate") ? (byte) -1 : Ascii.SO;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : Ascii.SI;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return TypedValues.CycleType.TYPE_EASING;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case 8:
                return 313;
            case 9:
                return 314;
            case 10:
                return 311;
            case 11:
                return 312;
            case 12:
                return 403;
            case 13:
                return 401;
            case 14:
                return 416;
            case 15:
                return 402;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 100) {
            return 2;
        }
        if (i10 == 101) {
            return 8;
        }
        if (i10 == 416) {
            return 4;
        }
        if (i10 == 420 || i10 == 421) {
            return 8;
        }
        switch (i10) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i10) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i10) {
                            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
