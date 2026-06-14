package yads;

import android.media.AudioManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fi {
    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object a(AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager;
        }
        throw new IllegalStateException();
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
