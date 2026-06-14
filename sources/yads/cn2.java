package yads;

import com.yandex.mobile.ads.common.AdTheme;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class cn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109489a;

    static {
        int[] iArr = new int[AdTheme.values().length];
        try {
            iArr[AdTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f109489a = iArr;
    }
}
