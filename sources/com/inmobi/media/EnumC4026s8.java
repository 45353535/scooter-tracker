package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC4026s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4026s8 f39507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC4026s8 f39508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC4026s8 f39509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC4026s8 f39510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC4026s8 f39511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC4026s8 f39512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC4026s8 f39513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC4026s8 f39514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC4026s8 f39515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC4026s8[] f39516j;

    static {
        EnumC4026s8 enumC4026s8 = new EnumC4026s8("INIT", 0);
        f39507a = enumC4026s8;
        EnumC4026s8 enumC4026s82 = new EnumC4026s8("LOADING", 1);
        f39508b = enumC4026s82;
        EnumC4026s8 enumC4026s83 = new EnumC4026s8("LOADED", 2);
        f39509c = enumC4026s83;
        EnumC4026s8 enumC4026s84 = new EnumC4026s8("LOAD_FAILED", 3);
        f39510d = enumC4026s84;
        EnumC4026s8 enumC4026s85 = new EnumC4026s8("PLAYING", 4);
        f39511e = enumC4026s85;
        EnumC4026s8 enumC4026s86 = new EnumC4026s8("PAUSED", 5);
        f39512f = enumC4026s86;
        EnumC4026s8 enumC4026s87 = new EnumC4026s8("COMPLETED", 6);
        f39513g = enumC4026s87;
        EnumC4026s8 enumC4026s88 = new EnumC4026s8("ERROR", 7);
        f39514h = enumC4026s88;
        EnumC4026s8 enumC4026s89 = new EnumC4026s8("DESTROYED", 8);
        f39515i = enumC4026s89;
        EnumC4026s8[] enumC4026s8Arr = {enumC4026s8, enumC4026s82, enumC4026s83, enumC4026s84, enumC4026s85, enumC4026s86, enumC4026s87, enumC4026s88, enumC4026s89};
        f39516j = enumC4026s8Arr;
        qf.a.a(enumC4026s8Arr);
    }

    public EnumC4026s8(String str, int i10) {
    }

    public static EnumC4026s8 valueOf(String str) {
        return (EnumC4026s8) Enum.valueOf(EnumC4026s8.class, str);
    }

    public static EnumC4026s8[] values() {
        return (EnumC4026s8[]) f39516j.clone();
    }
}
