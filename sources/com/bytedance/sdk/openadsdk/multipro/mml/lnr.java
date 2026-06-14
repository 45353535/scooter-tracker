package com.bytedance.sdk.openadsdk.multipro.mml;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements com.bytedance.sdk.openadsdk.multipro.qdl {
    private Context qdl;

    private Context ud() {
        Context context = this.qdl;
        return context == null ? yt.qdl() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    @NonNull
    public String qdl() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Cursor qdl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> mapLnr;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapLnr = ud.lnr(ud(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapLnr.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapLnr.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = TypedValues.Custom.S_BOOLEAN;
            } else if (obj instanceof String) {
                objArr[1] = TypedValues.Custom.S_STRING;
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = Constants.LONG;
            } else if (obj instanceof Float) {
                objArr[1] = TypedValues.Custom.S_FLOAT;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public String qdl(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(ud.qdl(yt.qdl(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return ud.qdl(ud(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public Uri qdl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            ud.qdl(ud(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            ud.ud(ud(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (ud.qdl(ud(), uri.getQueryParameter("sp_file_name"), str2)) {
            ud.ud(ud(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.qdl
    public int qdl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        qdl(uri, contentValues);
        return 0;
    }
}
