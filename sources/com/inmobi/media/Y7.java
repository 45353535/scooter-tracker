package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Y7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y7 f38026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y7 f38027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Y7 f38028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Y7 f38029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Y7 f38030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Y7 f38031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Y7[] f38032h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f38033a;

    static {
        Y7 y72 = new Y7("UNDEFINED_ERROR", 0, (short) 10001);
        f38026b = y72;
        Y7 y73 = new Y7("INVALID_STATE", 1, (short) 10002);
        f38027c = y73;
        Y7 y74 = new Y7("MALFORMED_URL", 2, (short) 10003);
        f38028d = y74;
        Y7 y75 = new Y7("TIMEOUT", 3, (short) 10004);
        f38029e = y75;
        Y7 y76 = new Y7("NETWORK", 4, (short) 10005);
        f38030f = y76;
        Y7 y77 = new Y7("NO_URL_FOUND", 5, (short) 10006);
        f38031g = y77;
        Y7[] y7Arr = {y72, y73, y74, y75, y76, y77};
        f38032h = y7Arr;
        qf.a.a(y7Arr);
    }

    public Y7(String str, int i10, short s10) {
        this.f38033a = s10;
    }

    public static Y7 valueOf(String str) {
        return (Y7) Enum.valueOf(Y7.class, str);
    }

    public static Y7[] values() {
        return (Y7[]) f38032h.clone();
    }
}
