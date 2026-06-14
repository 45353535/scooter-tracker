package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.core.b;
import io.bidmachine.protobuf.Waterfall;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes12.dex */
public class WaterfallNetworkRequest extends io.bidmachine.core.b {
    private final int timeOut;

    @NonNull
    private final String url;

    public interface Callback extends b.InterfaceC0975b, b.c {
        /* synthetic */ void onCanceled();

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* synthetic */ void onFail(@Nullable Object obj);

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* synthetic */ void onSuccess(@Nullable Object obj);
    }

    private static class RequestBinder extends b.g {
        private RequestBinder() {
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        public Waterfall.Configuration createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return Waterfall.parseFrom(bArr).getResponse();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        @Nullable
        public byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable Waterfall.Result result) throws Exception {
            return Waterfall.newBuilder().setRequest(result).build().toByteArray();
        }
    }

    public WaterfallNetworkRequest(@NonNull String str, @NonNull Waterfall.Result result, int i10) {
        super(b.e.Post, null, result);
        this.url = str;
        this.timeOut = i10;
        setDataBinder(new RequestBinder());
    }

    @Override // io.bidmachine.core.b
    protected String getBaseUrl() throws Exception {
        return this.url;
    }

    @Override // io.bidmachine.core.b
    protected void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.core.b
    @NonNull
    public ae.a obtainError(@Nullable URLConnection uRLConnection, int i10) {
        ae.a aVarI;
        if (i10 >= 200 && i10 < 300) {
            return ae.a.f4249s;
        }
        if (i10 >= 400 && i10 < 500) {
            aVarI = ae.a.f4237g;
        } else if (i10 >= 500 && i10 < 600) {
            aVarI = ae.a.f4238h;
        } else {
            aVarI = ae.a.i("Unknown server error");
        }
        return new ae.a(aVarI, i10, "Server returned " + i10 + " code");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.core.b
    @NonNull
    public ae.a obtainError(@Nullable URLConnection uRLConnection, @Nullable Throwable th2) {
        if (th2 instanceof UnknownHostException) {
            return ae.a.f4235e;
        }
        if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectTimeoutException)) {
            return ae.a.l("Unknown api request error", th2);
        }
        return ae.a.f4236f;
    }
}
