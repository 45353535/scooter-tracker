package com.bytedance.sdk.openadsdk.lnr;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static volatile ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final oth<com.bytedance.sdk.openadsdk.mml.qdl> f17632ud = yt.lnr();

    private ud() {
    }

    public static ud qdl() {
        if (qdl == null) {
            synchronized (ud.class) {
                try {
                    if (qdl == null) {
                        qdl = new ud();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public void qdl(@NonNull String str, List<FilterWord> list, String str2) {
        qdl(str, list, null, null, str2);
    }

    public void qdl(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.f17632ud.qdl(str, list, jSONObject, str2, str3);
    }
}
