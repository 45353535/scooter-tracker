package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21488b;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.model.vast.i.values().length];
        f21488b = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.model.vast.i.Static.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21488b[com.fyber.inneractive.sdk.model.vast.i.Html.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21488b[com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21488b[com.fyber.inneractive.sdk.model.vast.i.Iframe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[UnitDisplayType.values().length];
        f21487a = iArr2;
        try {
            iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21487a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
