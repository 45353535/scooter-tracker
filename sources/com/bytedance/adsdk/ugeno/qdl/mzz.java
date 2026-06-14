package com.bytedance.adsdk.ugeno.qdl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes6.dex */
public enum mzz {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", TypedValues.Custom.S_FLOAT),
    TRANSLATE_Y("translateY", "translationY", TypedValues.Custom.S_FLOAT),
    ROTATE_X("rotateX", "rotationX", TypedValues.Custom.S_FLOAT),
    ROTATE_Y("rotateY", "rotationY", TypedValues.Custom.S_FLOAT),
    ROTATE_Z("rotateZ", Key.ROTATION, TypedValues.Custom.S_FLOAT),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", TypedValues.Custom.S_FLOAT),
    SCALE_Y("scaleY", "scaleY", TypedValues.Custom.S_FLOAT),
    ALPHA("opacity", "alpha", TypedValues.Custom.S_FLOAT),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", TypedValues.Custom.S_FLOAT),
    RIPPLE("ripple", "ripple", TypedValues.Custom.S_FLOAT),
    SHINE("shine", "shine", TypedValues.Custom.S_FLOAT);

    private final String bjy;
    private final String jtx;
    private final String yt;

    mzz(String str, String str2, String str3) {
        this.bjy = str;
        this.jtx = str2;
        this.yt = str3;
    }

    public String lnr() {
        return this.yt;
    }

    public String qdl() {
        return this.bjy;
    }

    public String ud() {
        return this.jtx;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static mzz qdl(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 0;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 2;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    b10 = 3;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 4;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 5;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 6;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 7;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b10 = 8;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 9;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 10;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
            case 0:
                return TRANSLATE_X;
            case 1:
                return TRANSLATE_Y;
            case 2:
                return ALPHA;
            case 3:
                return RIPPLE;
            case 4:
                return SCALE_X;
            case 5:
                return SCALE_Y;
            case 6:
                return SCALE;
            case 7:
                return TRANSLATE;
            case 8:
                return BACKGROUND_COLOR;
            case 9:
                return BORDER_RADIUS;
            case 10:
                return ROTATE_X;
            case 11:
                return ROTATE_Y;
            case 12:
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
