package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13818b;

    static {
        int[] iArr = new int[com.appodeal.ads.networking.binders.s.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar2 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar3 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar4 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar5 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[5] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar6 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar7 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[7] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar8 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[8] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar9 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[9] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar10 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[10] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar11 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[11] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar12 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[13] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar13 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[12] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            com.appodeal.ads.networking.binders.r rVar14 = com.appodeal.ads.networking.binders.s.f14082b;
            iArr[14] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f13817a = iArr;
        int[] iArr2 = new int[AdType.values().length];
        try {
            iArr2[AdType.Banner.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[AdType.Mrec.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[AdType.Interstitial.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[AdType.Rewarded.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[AdType.Native.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        f13818b = iArr2;
    }
}
