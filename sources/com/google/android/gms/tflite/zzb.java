package com.google.android.gms.tflite;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import org.tensorflow.lite.a;

/* JADX INFO: loaded from: classes8.dex */
final class zzb {
    static String zza(a aVar) {
        switch (zza.zza[aVar.ordinal()]) {
            case 1:
                return TypedValues.Custom.S_FLOAT;
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return Constants.LONG;
            case 7:
                return "bool";
            case 8:
                return TypedValues.Custom.S_STRING;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + String.valueOf(aVar) + " is not supported yet");
        }
    }
}
