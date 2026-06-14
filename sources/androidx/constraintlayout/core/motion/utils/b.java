package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    static {
        String str = TypedValues.Custom.NAME;
    }

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return 905;
            case "reference":
                return 906;
            case "string":
                return 903;
            case "boolean":
                return 904;
            case "color":
                return 902;
            case "float":
                return 901;
            case "integer":
                return 900;
            default:
                return -1;
        }
    }
}
