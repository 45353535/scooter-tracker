package com.inmobi.media;

import com.ironsource.C4240b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC3802j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3802j8[] f38802a;

    static {
        EnumC3802j8[] enumC3802j8Arr = {new EnumC3802j8("LOADING", 0, "loading"), new EnumC3802j8("PLAYING", 1, C4240b4.i.f42625f0), new EnumC3802j8("PAUSED", 2, C4240b4.i.f42623e0), new EnumC3802j8("STOPPED", 3, C4240b4.i.f42629h0), new EnumC3802j8("FAILED", 4, C4240b4.i.f42652t), new EnumC3802j8("READY", 5, C4240b4.i.f42650s)};
        f38802a = enumC3802j8Arr;
        qf.a.a(enumC3802j8Arr);
    }

    public EnumC3802j8(String str, int i10, String str2) {
    }

    public static EnumC3802j8 valueOf(String str) {
        return (EnumC3802j8) Enum.valueOf(EnumC3802j8.class, str);
    }

    public static EnumC3802j8[] values() {
        return (EnumC3802j8[]) f38802a.clone();
    }
}
