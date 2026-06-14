package com.inmobi.media;

import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Pm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Pm[] f37554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f37555c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37556a;

    static {
        Pm[] pmArr = {new Pm("SHOW_VIDEO", 0, C4424m2.f43623v), new Pm("HIDE_VIDEO", 1, MenuActionType.HIDE), new Pm("PLAY_VIDEO", 2, "resume"), new Pm("PAUSE_VIDEO", 3, "pause"), new Pm("MUTE_VIDEO", 4, "mute"), new Pm("UNMUTE_VIDEO", 5, "unmute"), new Pm("SKIP_VIDEO", 6, "skip")};
        f37554b = pmArr;
        f37555c = qf.a.a(pmArr);
    }

    public Pm(String str, int i10, String str2) {
        this.f37556a = str2;
    }

    public static Pm valueOf(String str) {
        return (Pm) Enum.valueOf(Pm.class, str);
    }

    public static Pm[] values() {
        return (Pm[]) f37554b.clone();
    }
}
