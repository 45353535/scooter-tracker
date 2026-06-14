package com.inmobi.media;

import com.appodeal.ads.modules.common.internal.LogConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC3585ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3585ak f38215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3585ak f38216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC3585ak[] f38217c;

    static {
        EnumC3585ak enumC3585ak = new EnumC3585ak(LogConstants.KEY_SDK, 0);
        f38215a = enumC3585ak;
        EnumC3585ak enumC3585ak2 = new EnumC3585ak("TEMPLATE", 1);
        f38216b = enumC3585ak2;
        EnumC3585ak[] enumC3585akArr = {enumC3585ak, enumC3585ak2};
        f38217c = enumC3585akArr;
        qf.a.a(enumC3585akArr);
    }

    public EnumC3585ak(String str, int i10) {
    }

    public static EnumC3585ak valueOf(String str) {
        return (EnumC3585ak) Enum.valueOf(EnumC3585ak.class, str);
    }

    public static EnumC3585ak[] values() {
        return (EnumC3585ak[]) f38217c.clone();
    }
}
