package com.explorestack.iab.mraid;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public enum m {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f18145k = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18146b;

    m(int i10) {
        this.f18146b = i10;
    }

    public static m g(String str) {
        return h(str, TopRight);
    }

    public static m h(String str, m mVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!f18145k && str == null) {
                throw new AssertionError();
            }
            str.getClass();
            switch (str) {
                case "center":
                    return Center;
                case "top-right":
                    return TopRight;
                case "top-left":
                    return TopLeft;
                case "bottom-left":
                    return BottomLeft;
                case "bottom-right":
                    return BottomRight;
                case "bottom-center":
                    return BottomCenter;
                case "top-center":
                    return TopCenter;
            }
        }
        return mVar;
    }

    public int i() {
        return this.f18146b;
    }
}
