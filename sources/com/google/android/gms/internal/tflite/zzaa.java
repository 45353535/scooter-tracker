package com.google.android.gms.internal.tflite;

/* JADX INFO: loaded from: classes8.dex */
public enum zzaa {
    CUSTOMER_UNKNOWN(0),
    CUSTOMER_3P_JAVA_API(1),
    CUSTOMER_3P_TASKS_JAVA_API(2),
    CUSTOMER_BLUESKY(3),
    CUSTOMER_HULK(4),
    CUSTOMER_LEIBNIZ(5),
    CUSTOMER_BARHOPPER(6),
    CUSTOMER_MLKIT_CUSTOM_ICA(7),
    CUSTOMER_MLKIT_NLCLASSIFIER(8),
    CUSTOMER_MLKIT_OCR(15),
    CUSTOMER_MLKIT_SMARTREPLY(14),
    CUSTOMER_MLKIT_IMAGE_CAPTION(16),
    CUSTOMER_MLKIT_DOCUMENT_DETECTION(18),
    CUSTOMER_MLKIT_DOCUMENT_STAIN_REMOVER(22),
    CUSTOMER_USERPROFILE(9),
    CUSTOMER_TEST(10),
    CUSTOMER_TASKS_AUDIO(11),
    CUSTOMER_TASKS_TEXT(12),
    CUSTOMER_TASKS_VISION(13),
    CUSTOMER_MLBENCHMARK(17),
    CUSTOMER_TFLITE_DELEGATE_DYNAMITE(19),
    CUSTOMER_ACCELERATION_SERVICE(20),
    CUSTOMER_3P_NATIVE_API(21),
    CUSTOMER_PHOTOS(23),
    CUSTOMER_MAPS(24);

    private final int zzA;

    zzaa(int i10) {
        this.zzA = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzA);
    }

    public final int zza() {
        return this.zzA;
    }
}
