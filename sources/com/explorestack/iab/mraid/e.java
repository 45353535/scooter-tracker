package com.explorestack.iab.mraid;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18065b;

    public e(boolean z10, int i10) {
        this.f18064a = z10;
        this.f18065b = i10;
    }

    public static int a(String str) {
        int iIndexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public String b() {
        int i10 = this.f18065b;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public int c(Context context) {
        int i10 = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i11 = this.f18065b;
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        if (this.f18064a) {
            return -1;
        }
        return i10;
    }

    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.f18064a + ", forceOrientation=" + b() + '}';
    }
}
