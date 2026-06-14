package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21546b;

    static {
        int[] iArr = new int[VideoClickOrigin.values().length];
        f21546b = iArr;
        try {
            iArr[VideoClickOrigin.STORE_PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21546b[VideoClickOrigin.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21546b[VideoClickOrigin.APP_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        f21545a = iArr2;
        try {
            iArr2[com.fyber.inneractive.sdk.player.enums.b.Start_in_progress.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Error.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Preparing.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f21545a[com.fyber.inneractive.sdk.player.enums.b.Seeking.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
