package com.amazon.device.ads;

/* JADX INFO: loaded from: classes5.dex */
enum MraidStateType {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    /* JADX INFO: renamed from: com.amazon.device.ads.MraidStateType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$MraidStateType[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "" : "expanded" : "resized" : "default" : "hidden" : "loading";
    }
}
