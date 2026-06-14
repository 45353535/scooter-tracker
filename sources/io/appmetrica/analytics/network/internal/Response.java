package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f78826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f78827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f78828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f78829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f78830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f78831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f78832g;

    public Response(@Nullable Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public int getCode() {
        return this.f78827b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f78829d;
    }

    @Nullable
    public Throwable getException() {
        return this.f78831f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f78830e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f78828c;
    }

    @Nullable
    public String getUrl() {
        return this.f78832g;
    }

    public boolean isCompleted() {
        return this.f78826a;
    }

    public String toString() {
        return "Response{completed=" + this.f78826a + ", code=" + this.f78827b + ", responseDataLength=" + this.f78828c.length + ", errorDataLength=" + this.f78829d.length + ", headers=" + this.f78830e + ", exception=" + this.f78831f + ", url=" + this.f78832g + '}';
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2) {
        this(z10, i10, bArr, bArr2, map, th2, null);
    }

    public Response(boolean z10, int i10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th2, @Nullable String str) {
        Map mapA;
        this.f78826a = z10;
        this.f78827b = i10;
        this.f78828c = bArr;
        this.f78829d = bArr2;
        if (map == null) {
            mapA = Collections.EMPTY_MAP;
        } else {
            mapA = e.a(map);
        }
        this.f78830e = mapA;
        this.f78831f = th2;
        this.f78832g = str;
    }
}
