package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f78818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f78820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f78821d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f78822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f78823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f78824c = new byte[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f78825d = new HashMap();

        public Builder(@NonNull String str) {
            this.f78822a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f78825d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f78822a, this.f78823b, this.f78824c, this.f78825d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f78824c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f78823b = str;
            return this;
        }
    }

    /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i10) {
        this(str, str2, bArr, map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f78820c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f78821d;
    }

    @NonNull
    public String getMethod() {
        return this.f78819b;
    }

    @NonNull
    public String getUrl() {
        return this.f78818a;
    }

    public String toString() {
        return "Request{url=" + this.f78818a + ", method='" + this.f78819b + "', bodyLength=" + this.f78820c.length + ", headers=" + this.f78821d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f78818a = str;
        this.f78819b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f78820c = bArr;
        this.f78821d = e.a(map);
    }
}
