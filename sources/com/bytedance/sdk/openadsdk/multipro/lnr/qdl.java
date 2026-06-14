package com.bytedance.sdk.openadsdk.multipro.lnr;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml;
import j$.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements com.bytedance.sdk.openadsdk.multipro.qdl {
    public static String lnr() {
        if (yt.qdl() == null) {
            return null;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return moVarMml.qdl(Uri.parse(mzz() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static mo mml() {
        try {
            if (yt.qdl() != null) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(yt.qdl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String mzz() {
        return mml.f17770ud + "/t_frequent/";
    }

    public static boolean ud() {
        if (yt.qdl() == null) {
            return false;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return "true".equals(moVarMml.qdl(Uri.parse(mzz() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean qdl(String str) {
        if (yt.qdl() == null) {
            return false;
        }
        try {
            mo moVarMml = mml();
            if (moVarMml != null) {
                return "true".equals(moVarMml.qdl(Uri.parse(mzz() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    @NonNull
    public String qdl() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().qdl(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().ud() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jpc.qdl.qdl().lnr();
        }
        return null;
    }
}
