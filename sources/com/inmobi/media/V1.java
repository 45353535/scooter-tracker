package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class V1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U1 f37869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f37870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V1 f37871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V1 f37872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ V1[] f37873f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37874a;

    static {
        V1 v12 = new V1(0, 0, "UNKNOWN");
        f37871d = v12;
        V1 v13 = new V1(1, 1, "PLAYING");
        f37872e = v13;
        V1[] v1Arr = {v12, v13, new V1(2, 2, "PAUSED"), new V1(3, 3, "COMPLETED")};
        f37873f = v1Arr;
        qf.a.a(v1Arr);
        f37869b = new U1();
        f37870c = new SparseArray();
        for (V1 v14 : values()) {
            f37870c.put(v14.f37874a, v14);
        }
    }

    public V1(int i10, int i11, String str) {
        this.f37874a = i11;
    }

    public static V1 valueOf(String str) {
        return (V1) Enum.valueOf(V1.class, str);
    }

    public static V1[] values() {
        return (V1[]) f37873f.clone();
    }
}
