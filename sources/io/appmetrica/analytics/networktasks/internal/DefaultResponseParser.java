package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class DefaultResponseParser {

    public static class Response {

        @NonNull
        public final String mStatus;

        public Response(@NonNull String str) {
            this.mStatus = str;
        }

        public String toString() {
            return "Response{mStatus='" + this.mStatus + "'}";
        }
    }

    @Nullable
    public Response parse(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
