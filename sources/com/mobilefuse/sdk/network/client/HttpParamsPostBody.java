package com.mobilefuse.sdk.network.client;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.encoding.HttpParamsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "params", "", "", "(Ljava/util/Map;)V", "content", "", "getContent", "()[B", "content$delegate", "Lkotlin/Lazy;", "contentType", "getContentType", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpParamsPostBody implements HttpPostBody {

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    @Nullable
    private final Lazy content;

    @NotNull
    private final String contentType;

    @NotNull
    private final Map<String, String> params;

    public HttpParamsPostBody(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.contentType = ShareTarget.ENCODING_TYPE_URL_ENCODED;
        this.content = i.a(new Function0<byte[]>() { // from class: com.mobilefuse.sdk.network.client.HttpParamsPostBody$content$2
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
                    byte[] bytes = HttpParamsKt.toUriParams(this.this$0.getParams()).getBytes(Charsets.UTF_8);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpParamsPostBody copy$default(HttpParamsPostBody httpParamsPostBody, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = httpParamsPostBody.params;
        }
        return httpParamsPostBody.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.params;
    }

    @NotNull
    public final HttpParamsPostBody copy(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new HttpParamsPostBody(params);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof HttpParamsPostBody) && Intrinsics.areEqual(this.params, ((HttpParamsPostBody) other).params);
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
    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        Map<String, String> map = this.params;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "HttpParamsPostBody(params=" + this.params + ")";
    }
}
