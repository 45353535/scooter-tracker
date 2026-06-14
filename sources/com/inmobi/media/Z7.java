package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z7[] f38101a;

    static {
        Z7[] z7Arr = {new Z7("START", 0, "q0"), new Z7("FIRST_QUARTILE", 1, "q1"), new Z7("MIDPOINT", 2, "q2"), new Z7("THIRD_QUARTILE", 3, "q3"), new Z7("FOURTH_QUARTILE", 4, "q4")};
        f38101a = z7Arr;
        qf.a.a(z7Arr);
    }

    public Z7(String str, int i10, String str2) {
    }

    public static Z7 valueOf(String str) {
        return (Z7) Enum.valueOf(Z7.class, str);
    }

    public static Z7[] values() {
        return (Z7[]) f38101a.clone();
    }
}
