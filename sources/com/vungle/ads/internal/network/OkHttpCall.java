package com.vungle.ads.internal.network;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.vungle.ads.internal.network.converters.Converter;
import com.vungle.ads.internal.util.Logger;
import hh.b0;
import hh.c0;
import hh.e;
import hh.f;
import hh.w;
import j$.util.Objects;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import vh.g;
import vh.o;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\"#$B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR$\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall;", "T", "Lcom/vungle/ads/internal/network/Call;", "Lhh/e;", "rawCall", "Lcom/vungle/ads/internal/network/converters/Converter;", "Lhh/c0;", "responseConverter", "<init>", "(Lhh/e;Lcom/vungle/ads/internal/network/converters/Converter;)V", "body", "buffer", "(Lhh/c0;)Lhh/c0;", "Lcom/vungle/ads/internal/network/Callback;", "callback", "", "enqueue", "(Lcom/vungle/ads/internal/network/Callback;)V", "Lcom/vungle/ads/internal/network/Response;", "execute", "()Lcom/vungle/ads/internal/network/Response;", "Lhh/b0;", "rawResp", "parseResponse", "(Lhh/b0;)Lcom/vungle/ads/internal/network/Response;", MenuActionType.CANCEL, "()V", "", "isCanceled", "()Z", "Lhh/e;", "Lcom/vungle/ads/internal/network/converters/Converter;", "canceled", "Z", y.f66058y, "ExceptionCatchingResponseBody", "NoContentResponseBody", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OkHttpCall<T> implements Call<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;

    @NotNull
    private final e rawCall;

    @NotNull
    private final Converter<c0, T> responseConverter;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$Companion;", "", "()V", "TAG", "", "throwIfFatal", "", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable t10) throws Throwable {
            if ((t10 instanceof VirtualMachineError) || (t10 instanceof ThreadDeath) || (t10 instanceof LinkageError)) {
                throw t10;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$ExceptionCatchingResponseBody;", "Lhh/c0;", "delegate", "<init>", "(Lhh/c0;)V", "Lhh/w;", "contentType", "()Lhh/w;", "", "contentLength", "()J", "Lvh/g;", "source", "()Lvh/g;", "", "close", "()V", "throwIfCaught", "Lhh/c0;", "delegateSource", "Lvh/g;", "Ljava/io/IOException;", "thrownException", "Ljava/io/IOException;", "getThrownException", "()Ljava/io/IOException;", "setThrownException", "(Ljava/io/IOException;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ExceptionCatchingResponseBody extends c0 {

        @NotNull
        private final c0 delegate;

        @NotNull
        private final g delegateSource;

        @Nullable
        private IOException thrownException;

        public ExceptionCatchingResponseBody(@NotNull c0 delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = x.d(new o(delegate.getDelegateSource()) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // vh.o, vh.l0
                public long read(@NotNull vh.e sink, long byteCount) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    try {
                        return super.read(sink, byteCount);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.setThrownException(e10);
                        throw e10;
                    }
                }
            });
        }

        @Override // hh.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // hh.c0
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // hh.c0
        @Nullable
        /* JADX INFO: renamed from: contentType */
        public w getContentType() {
            return this.delegate.getContentType();
        }

        @Nullable
        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(@Nullable IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // hh.c0
        @NotNull
        /* JADX INFO: renamed from: source, reason: from getter */
        public g getDelegateSource() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$NoContentResponseBody;", "Lhh/c0;", "Lhh/w;", "contentType", "", "contentLength", "<init>", "(Lhh/w;J)V", "()Lhh/w;", "()J", "Lvh/g;", "source", "()Lvh/g;", "Lhh/w;", "J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NoContentResponseBody extends c0 {
        private final long contentLength;

        @Nullable
        private final w contentType;

        public NoContentResponseBody(@Nullable w wVar, long j10) {
            this.contentType = wVar;
            this.contentLength = j10;
        }

        @Override // hh.c0
        /* JADX INFO: renamed from: contentLength, reason: from getter */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // hh.c0
        @Nullable
        /* JADX INFO: renamed from: contentType, reason: from getter */
        public w getContentType() {
            return this.contentType;
        }

        @Override // hh.c0
        @NotNull
        /* JADX INFO: renamed from: source */
        public g getDelegateSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(@NotNull e rawCall, @NotNull Converter<c0, T> responseConverter) {
        Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final c0 buffer(c0 body) throws IOException {
        vh.e eVar = new vh.e();
        body.getDelegateSource().T(eVar);
        return c0.Companion.f(eVar, body.getContentType(), body.getContentLength());
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        e eVar;
        this.canceled = true;
        synchronized (this) {
            eVar = this.rawCall;
            Unit unit = Unit.f93236a;
        }
        eVar.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(@NotNull final Callback<T> callback) {
        e eVar;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            eVar = this.rawCall;
            Unit unit = Unit.f93236a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        eVar.m(new f(this) { // from class: com.vungle.ads.internal.network.OkHttpCall.enqueue.2
            final /* synthetic */ OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            private final void callFailure(Throwable e10) throws Throwable {
                try {
                    callback.onFailure(this.this$0, e10);
                } catch (Throwable th2) {
                    OkHttpCall.INSTANCE.throwIfFatal(th2);
                    Logger.INSTANCE.e(OkHttpCall.TAG, "Cannot pass failure to callback", th2);
                }
            }

            @Override // hh.f
            public void onFailure(@NotNull e call, @NotNull IOException e10) throws Throwable {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                callFailure(e10);
            }

            @Override // hh.f
            public void onResponse(@NotNull e call, @NotNull b0 response) throws Throwable {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    try {
                        callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                    } catch (Throwable th2) {
                        OkHttpCall.INSTANCE.throwIfFatal(th2);
                        Logger.INSTANCE.e(OkHttpCall.TAG, "Cannot pass response to callback", th2);
                    }
                } catch (Throwable th3) {
                    OkHttpCall.INSTANCE.throwIfFatal(th3);
                    callFailure(th3);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    @Nullable
    public Response<T> execute() throws IOException {
        e eVar;
        synchronized (this) {
            eVar = this.rawCall;
            Unit unit = Unit.f93236a;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        return parseResponse(eVar.execute());
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }

    @Nullable
    public final Response<T> parseResponse(@NotNull b0 rawResp) throws IOException {
        Intrinsics.checkNotNullParameter(rawResp, "rawResp");
        c0 c0VarM = rawResp.m();
        if (c0VarM == null) {
            return null;
        }
        b0 b0VarC = rawResp.b0().b(new NoContentResponseBody(c0VarM.getContentType(), c0VarM.getContentLength())).c();
        int iQ = b0VarC.q();
        if (iQ >= 200 && iQ < 300) {
            if (iQ == 204 || iQ == 205) {
                c0VarM.close();
                return Response.INSTANCE.success(null, b0VarC);
            }
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(c0VarM);
            try {
                return Response.INSTANCE.success(this.responseConverter.convert(exceptionCatchingResponseBody), b0VarC);
            } catch (Throwable th2) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw th2;
            }
        }
        try {
            Response<T> responseError = Response.INSTANCE.error(buffer(c0VarM), b0VarC);
            c.a(c0VarM, null);
            return responseError;
        } finally {
        }
    }
}
