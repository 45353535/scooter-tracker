package com.mobilefuse.sdk.network.client;

import com.ironsource.D5;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lf.i;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpJsonPostBody;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "json", "", "(Ljava/lang/String;)V", "content", "", "getContent", "()[B", "content$delegate", "Lkotlin/Lazy;", "contentType", "getContentType", "()Ljava/lang/String;", "getJson", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpJsonPostBody implements HttpPostBody {

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    @Nullable
    private final Lazy content;

    @NotNull
    private final String contentType;

    @NotNull
    private final String json;

    public HttpJsonPostBody(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
        this.contentType = D5.L;
        this.content = i.a(new Function0<byte[]>() { // from class: com.mobilefuse.sdk.network.client.HttpJsonPostBody$content$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final byte[] invoke() {
                Either errorResult;
                Object value;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    byte[] bytes = this.this$0.getJson().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    errorResult = new SuccessResult(bytes);
                } catch (Throwable th2) {
                    if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    }
                    errorResult = new ErrorResult(th2);
                }
                if (errorResult instanceof ErrorResult) {
                    value = null;
                } else {
                    if (!(errorResult instanceof SuccessResult)) {
                        throw new m();
                    }
                    value = ((SuccessResult) errorResult).getValue();
                }
                return (byte[]) value;
            }
        });
    }

    public static /* synthetic */ HttpJsonPostBody copy$default(HttpJsonPostBody httpJsonPostBody, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = httpJsonPostBody.json;
        }
        return httpJsonPostBody.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final HttpJsonPostBody copy(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new HttpJsonPostBody(json);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof HttpJsonPostBody) && Intrinsics.areEqual(this.json, ((HttpJsonPostBody) other).json);
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @Nullable
    public byte[] getContent() {
        return (byte[]) this.content.getValue();
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public Map<String, String> getHeaders() {
        return HttpPostBody.DefaultImpls.getHeaders(this);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        String str = this.json;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "HttpJsonPostBody(json=" + this.json + ")";
    }
}
