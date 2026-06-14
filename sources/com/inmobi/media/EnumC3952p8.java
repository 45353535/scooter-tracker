package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC3952p8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3952p8 f39251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3952p8 f39252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3952p8 f39253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3952p8 f39254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3952p8 f39255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3952p8 f39256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3952p8 f39257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC3952p8 f39258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC3952p8 f39259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC3952p8 f39260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC3952p8 f39261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC3952p8 f39262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC3952p8 f39263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC3952p8 f39264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC3952p8[] f39265p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39266a;

    static {
        EnumC3952p8 enumC3952p8 = new EnumC3952p8("VIDEO_READY", 0, "VideoReady");
        f39251b = enumC3952p8;
        EnumC3952p8 enumC3952p82 = new EnumC3952p8("VIDEO_COMPLETE", 1, "VideoComplete");
        f39252c = enumC3952p82;
        EnumC3952p8 enumC3952p83 = new EnumC3952p8("VIDEO_PLAYBACK_ERROR", 2, "VideoPlaybackError");
        f39253d = enumC3952p83;
        EnumC3952p8 enumC3952p84 = new EnumC3952p8("VIDEO_COMMAND_ERROR", 3, "VideoCommandError");
        f39254e = enumC3952p84;
        EnumC3952p8 enumC3952p85 = new EnumC3952p8("VIDEO_PLAYBACK_STATE", 4, "VideoPlaybackState");
        f39255f = enumC3952p85;
        EnumC3952p8 enumC3952p86 = new EnumC3952p8("VIDEO_PLAYBACK_UPDATE", 5, "VideoPlaybackUpdate");
        f39256g = enumC3952p86;
        EnumC3952p8 enumC3952p87 = new EnumC3952p8("VIDEO_QUARTILES_EVENT", 6, "VideoQuartilesEvent");
        f39257h = enumC3952p87;
        EnumC3952p8 enumC3952p88 = new EnumC3952p8("VIDEO_PLAYER_CREATED", 7, "VideoPlayerCreated");
        f39258i = enumC3952p88;
        EnumC3952p8 enumC3952p89 = new EnumC3952p8("VIDEO_PLAYER_POSITION_UPDATED", 8, "VideoPlayerPositionUpdated");
        f39259j = enumC3952p89;
        EnumC3952p8 enumC3952p810 = new EnumC3952p8("VIDEO_PLAYER_DESTROYED", 9, "VideoPlayerDestroyed");
        f39260k = enumC3952p810;
        EnumC3952p8 enumC3952p811 = new EnumC3952p8("VIDEO_PLAYER_ACTION_EXECUTED", 10, "VideoPlayerActionExecuted");
        f39261l = enumC3952p811;
        EnumC3952p8 enumC3952p812 = new EnumC3952p8("VIDEO_PLAYER_POSITION", 11, "VideoPlayerPosition");
        f39262m = enumC3952p812;
        EnumC3952p8 enumC3952p813 = new EnumC3952p8("VIDEO_CAN_PLAY_THROUGH", 12, "VideoCanPlayThrough");
        f39263n = enumC3952p813;
        EnumC3952p8 enumC3952p814 = new EnumC3952p8("VIDEO_LOADED_METADATA", 13, "VideoLoadedMetadata");
        f39264o = enumC3952p814;
        EnumC3952p8[] enumC3952p8Arr = {enumC3952p8, enumC3952p82, enumC3952p83, enumC3952p84, enumC3952p85, enumC3952p86, enumC3952p87, enumC3952p88, enumC3952p89, enumC3952p810, enumC3952p811, enumC3952p812, enumC3952p813, enumC3952p814};
        f39265p = enumC3952p8Arr;
        qf.a.a(enumC3952p8Arr);
    }

    public EnumC3952p8(String str, int i10, String str2) {
        this.f39266a = str2;
    }

    public static EnumC3952p8 valueOf(String str) {
        return (EnumC3952p8) Enum.valueOf(EnumC3952p8.class, str);
    }

    public static EnumC3952p8[] values() {
        return (EnumC3952p8[]) f39265p.clone();
    }
}
