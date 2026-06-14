package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC3573a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3573a8[] f38173a;

    static {
        EnumC3573a8[] enumC3573a8Arr = {new EnumC3573a8("CREATE_VIDEO_PLAYER", 0, "createVideoPlayer"), new EnumC3573a8("EXECUTE_VIDEO_PLAYER_ACTION", 1, "executeVideoPlayerActions"), new EnumC3573a8("UPDATE_VIDEO_PLAYER_POSITION", 2, "updateVideoPlayerPosition"), new EnumC3573a8("GET_VIDEO_PLAYER_STATE", 3, "getVideoPlayerState"), new EnumC3573a8("UNKNOWN", 4, "unknown")};
        f38173a = enumC3573a8Arr;
        qf.a.a(enumC3573a8Arr);
    }

    public EnumC3573a8(String str, int i10, String str2) {
    }

    public static EnumC3573a8 valueOf(String str) {
        return (EnumC3573a8) Enum.valueOf(EnumC3573a8.class, str);
    }

    public static EnumC3573a8[] values() {
        return (EnumC3573a8[]) f38173a.clone();
    }
}
