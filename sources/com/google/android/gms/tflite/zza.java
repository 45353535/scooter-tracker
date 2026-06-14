package com.google.android.gms.tflite;

import org.tensorflow.lite.a;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zza {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[a.values().length];
        zza = iArr;
        try {
            iArr[a.FLOAT32.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[a.INT32.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[a.INT16.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[a.INT8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[a.UINT8.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[a.INT64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zza[a.BOOL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zza[a.STRING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
