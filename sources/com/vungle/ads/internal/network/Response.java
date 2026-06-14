package com.vungle.ads.internal.network;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.f.y;
import hh.b0;
import hh.c0;
import hh.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0015J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/network/Response;", "T", "", "Lhh/b0;", "rawResponse", "body", "Lhh/c0;", "errorBody", "<init>", "(Lhh/b0;Ljava/lang/Object;Lhh/c0;)V", "raw", "()Lhh/b0;", "", "code", "()I", "", PglCryptUtils.KEY_MESSAGE, "()Ljava/lang/String;", "Lhh/t;", "headers", "()Lhh/t;", "()Ljava/lang/Object;", "()Lhh/c0;", "toString", "Lhh/b0;", "Ljava/lang/Object;", "Lhh/c0;", "", "isSuccessful", "()Z", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Response<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final T body;

    @Nullable
    private final c0 errorBody;

    @NotNull
    private final b0 rawResponse;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/network/Response$Companion;", "", "<init>", "()V", "T", "body", "Lhh/b0;", "rawResponse", "Lcom/vungle/ads/internal/network/Response;", "success", "(Ljava/lang/Object;Lhh/b0;)Lcom/vungle/ads/internal/network/Response;", "Lhh/c0;", "error", "(Lhh/c0;Lhh/b0;)Lcom/vungle/ads/internal/network/Response;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Response<T> error(@Nullable c0 body, @NotNull b0 rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Response<>(rawResponse, defaultConstructorMarker, body, defaultConstructorMarker);
        }

        @NotNull
        public final <T> Response<T> success(@Nullable T body, @NotNull b0 rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new Response<>(rawResponse, body, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Response(b0 b0Var, Object obj, c0 c0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(b0Var, obj, c0Var);
    }

    @Nullable
    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.q();
    }

    @Nullable
    /* JADX INFO: renamed from: errorBody, reason: from getter */
    public final c0 getErrorBody() {
        return this.errorBody;
    }

    @NotNull
    public final t headers() {
        return this.rawResponse.R();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @NotNull
    public final String message() {
        return this.rawResponse.V();
    }

    @NotNull
    /* JADX INFO: renamed from: raw, reason: from getter */
    public final b0 getRawResponse() {
        return this.rawResponse;
    }

    @NotNull
    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(b0 b0Var, T t10, c0 c0Var) {
        this.rawResponse = b0Var;
        this.body = t10;
        this.errorBody = c0Var;
    }
}
