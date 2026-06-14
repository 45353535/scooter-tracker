package com.appodeal.ads.networking.binders;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Set;
import kotlin.collections.SetsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f14082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f14083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f14084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f14085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f14086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f14087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f14088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f14089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f14090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s f14091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ s[] f14092l;

    static {
        s sVar = new s("AdRequest", 0);
        f14084d = sVar;
        s sVar2 = new s("Services", 1);
        f14085e = sVar2;
        s sVar3 = new s("Adapters", 2);
        f14086f = sVar3;
        s sVar4 = new s("Advertising", 3);
        s sVar5 = new s("Connection", 4);
        s sVar6 = new s("Location", 5);
        s sVar7 = new s("User", 6);
        s sVar8 = new s("Segment", 7);
        s sVar9 = new s("ServicesData", 8);
        f14087g = sVar9;
        s sVar10 = new s(RtspHeaders.SESSION, 9);
        s sVar11 = new s("Sessions", 10);
        f14088h = sVar11;
        s sVar12 = new s("Get", 11);
        f14089i = sVar12;
        s sVar13 = new s("Base", 12);
        s sVar14 = new s("Revenue", 13);
        f14090j = sVar14;
        s sVar15 = new s("BidonConfig", 14);
        f14091k = sVar15;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, sVar15};
        f14092l = sVarArr;
        qf.a.a(sVarArr);
        f14082b = new r();
        f14083c = SetsKt.setOf((Object[]) new s[]{sVar13, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10});
    }

    public s(String str, int i10) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f14092l.clone();
    }
}
