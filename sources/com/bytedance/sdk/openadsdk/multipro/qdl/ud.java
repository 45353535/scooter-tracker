package com.bytedance.sdk.openadsdk.multipro.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.mzz;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements com.bytedance.sdk.openadsdk.multipro.qdl {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final Object f17773ud = new Object();
    private Context qdl;

    private boolean ud(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    @NonNull
    public String qdl() {
        return "t_db";
    }

    private Context ud() {
        Context context = this.qdl;
        return context == null ? yt.qdl() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (f17773ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(@NonNull Uri uri) {
        synchronized (f17773ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                mzz.qdl(ud()).qdl().qdl(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            mzz.qdl(ud()).qdl().ud();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            mzz.qdl(ud()).qdl().lnr();
                        } else if ("transactionEnd".equals(str2)) {
                            mzz.qdl(ud()).qdl().mml();
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (f17773ud) {
            try {
                if (ud(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        mzz.qdl(ud()).qdl().qdl(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (f17773ud) {
            try {
                if (ud(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str3, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (f17773ud) {
            try {
                if (ud(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return mzz.qdl(ud()).qdl().qdl(str3, contentValues, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }
}
