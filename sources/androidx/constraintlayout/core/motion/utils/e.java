package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    static {
        String str = TypedValues.MotionType.NAME;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -2033446275:
                b10 = !str.equals(TypedValues.MotionType.S_ANIMATE_CIRCLEANGLE_TO) ? (byte) -1 : (byte) 0;
                break;
            case -1532277420:
                b10 = !str.equals(TypedValues.MotionType.S_QUANTIZE_MOTION_PHASE) ? (byte) -1 : (byte) 1;
                break;
            case -1529145600:
                b10 = !str.equals(TypedValues.MotionType.S_QUANTIZE_MOTIONSTEPS) ? (byte) -1 : (byte) 2;
                break;
            case -1498310144:
                b10 = !str.equals(TypedValues.MotionType.S_PATH_ROTATE) ? (byte) -1 : (byte) 3;
                break;
            case -1030753096:
                b10 = !str.equals(TypedValues.MotionType.S_QUANTIZE_INTERPOLATOR) ? (byte) -1 : (byte) 4;
                break;
            case -762370135:
                b10 = !str.equals(TypedValues.MotionType.S_DRAW_PATH) ? (byte) -1 : (byte) 5;
                break;
            case -232872051:
                b10 = !str.equals(TypedValues.MotionType.S_STAGGER) ? (byte) -1 : (byte) 6;
                break;
            case 1138491429:
                b10 = !str.equals(TypedValues.MotionType.S_POLAR_RELATIVETO) ? (byte) -1 : (byte) 7;
                break;
            case 1539234834:
                b10 = !str.equals(TypedValues.MotionType.S_QUANTIZE_INTERPOLATOR_TYPE) ? (byte) -1 : (byte) 8;
                break;
            case 1583722451:
                b10 = !str.equals(TypedValues.MotionType.S_QUANTIZE_INTERPOLATOR_ID) ? (byte) -1 : (byte) 9;
                break;
            case 1639368448:
                b10 = !str.equals(TypedValues.MotionType.S_EASING) ? (byte) -1 : (byte) 10;
                break;
            case 1900899336:
                b10 = !str.equals(TypedValues.MotionType.S_ANIMATE_RELATIVE_TO) ? (byte) -1 : Ascii.VT;
                break;
            case 2109694967:
                b10 = !str.equals(TypedValues.MotionType.S_PATHMOTION_ARC) ? (byte) -1 : Ascii.FF;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 606;
            case 1:
                return 602;
            case 2:
                return 610;
            case 3:
                return 601;
            case 4:
                return 604;
            case 5:
                return 608;
            case 6:
                return 600;
            case 7:
                return 609;
            case 8:
                return 611;
            case 9:
                return 612;
            case 10:
                return 603;
            case 11:
                return 605;
            case 12:
                return 607;
            default:
                return -1;
        }
    }
}
