package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC4034sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC4034sg f39532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC4034sg f39533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC4034sg f39534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC4034sg f39535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC4034sg f39536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC4034sg f39537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC4034sg f39538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC4034sg f39539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC4034sg[] f39540i;

    static {
        EnumC4034sg enumC4034sg = new EnumC4034sg("STATE_INITIALIZED", 0);
        f39532a = enumC4034sg;
        EnumC4034sg enumC4034sg2 = new EnumC4034sg("STATE_PREPARING", 1);
        f39533b = enumC4034sg2;
        EnumC4034sg enumC4034sg3 = new EnumC4034sg("STATE_PREPARED", 2);
        f39534c = enumC4034sg3;
        EnumC4034sg enumC4034sg4 = new EnumC4034sg("STATE_PLAYING", 3);
        f39535d = enumC4034sg4;
        EnumC4034sg enumC4034sg5 = new EnumC4034sg("STATE_PAUSED", 4);
        f39536e = enumC4034sg5;
        EnumC4034sg enumC4034sg6 = new EnumC4034sg("STATE_PLAYBACK_COMPLETED", 5);
        f39537f = enumC4034sg6;
        EnumC4034sg enumC4034sg7 = new EnumC4034sg("STATE_ERROR", 6);
        f39538g = enumC4034sg7;
        EnumC4034sg enumC4034sg8 = new EnumC4034sg("STATE_DESTROYED", 7);
        f39539h = enumC4034sg8;
        EnumC4034sg[] enumC4034sgArr = {enumC4034sg, enumC4034sg2, enumC4034sg3, enumC4034sg4, enumC4034sg5, enumC4034sg6, enumC4034sg7, enumC4034sg8};
        f39540i = enumC4034sgArr;
        qf.a.a(enumC4034sgArr);
    }

    public EnumC4034sg(String str, int i10) {
    }

    public static EnumC4034sg valueOf(String str) {
        return (EnumC4034sg) Enum.valueOf(EnumC4034sg.class, str);
    }

    public static EnumC4034sg[] values() {
        return (EnumC4034sg[]) f39540i.clone();
    }
}
