package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    static {
        String str = TypedValues.TriggerType.NAME;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1594793529:
                b10 = !str.equals("positiveCross") ? (byte) -1 : (byte) 0;
                break;
            case -966421266:
                b10 = !str.equals("viewTransitionOnPositiveCross") ? (byte) -1 : (byte) 1;
                break;
            case -786670827:
                b10 = !str.equals("triggerCollisionId") ? (byte) -1 : (byte) 2;
                break;
            case -648752941:
                b10 = !str.equals("triggerID") ? (byte) -1 : (byte) 3;
                break;
            case -638126837:
                b10 = !str.equals("negativeCross") ? (byte) -1 : (byte) 4;
                break;
            case -76025313:
                b10 = !str.equals("triggerCollisionView") ? (byte) -1 : (byte) 5;
                break;
            case -9754574:
                b10 = !str.equals("viewTransitionOnNegativeCross") ? (byte) -1 : (byte) 6;
                break;
            case 64397344:
                b10 = !str.equals("CROSS") ? (byte) -1 : (byte) 7;
                break;
            case 364489912:
                b10 = !str.equals("triggerSlack") ? (byte) -1 : (byte) 8;
                break;
            case 1301930599:
                b10 = !str.equals("viewTransitionOnCross") ? (byte) -1 : (byte) 9;
                break;
            case 1401391082:
                b10 = !str.equals("postLayout") ? (byte) -1 : (byte) 10;
                break;
            case 1535404999:
                b10 = !str.equals("triggerReceiver") ? (byte) -1 : Ascii.VT;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 312;
            case 8:
                return 305;
            case 9:
                return 301;
            case 10:
                return 304;
            case 11:
                return 311;
            default:
                return -1;
        }
    }
}
