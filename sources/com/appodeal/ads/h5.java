package com.appodeal.ads;

import com.appodeal.ads.adnetworks.MediationAdNetwork;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13386a;

    static {
        int[] iArr = new int[MediationAdNetwork.values().length];
        try {
            iArr[MediationAdNetwork.ApplovinMax.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediationAdNetwork.LevelPlay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f13386a = iArr;
    }
}
