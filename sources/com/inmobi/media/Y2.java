package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y2 {
    public static final ContentValues a(S2 s22) {
        String string;
        Intrinsics.checkNotNullParameter(s22, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(s22.f37684a));
        contentValues.put("url", s22.f37685b);
        contentValues.put("pending_attempts", Integer.valueOf(s22.f37689f));
        contentValues.put("ts", Long.valueOf(s22.f37690g));
        contentValues.put("created_ts", Long.valueOf(s22.f37691h));
        contentValues.put("follow_redirect", Boolean.valueOf(s22.f37687d));
        contentValues.put("ping_in_webview", Boolean.valueOf(s22.f37688e));
        Map map = s22.f37686c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = s22.f37686c;
                Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            Intrinsics.checkNotNull(string);
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
