package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.b;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes12.dex */
public class ApiRequest<RequestDataType, ResponseType> extends io.bidmachine.core.b {

    @VisibleForTesting
    static int REQUEST_TIMEOUT = 10000;

    @VisibleForTesting
    String requiredUrl;

    @VisibleForTesting
    int timeOut;

    public static class ApiAuctionDataBinder extends ApiResponseAuctionDataBinder {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder, io.bidmachine.core.b.g
        @Nullable
        public byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable Request request) throws Exception {
            Openrtb.Builder builderNewBuilder = Openrtb.newBuilder();
            builderNewBuilder.setRequest(request);
            builderNewBuilder.setVer("3.0");
            builderNewBuilder.setDomainspec("adcom");
            builderNewBuilder.setDomainver(NastAdapter.ADAPTER_SDK_VERSION_NAME);
            d5.e("Auction Request", builderNewBuilder);
            return builderNewBuilder.build().toByteArray();
        }
    }

    public static abstract class ApiDataBinder<RequestDataType, ResponseDataType> extends b.g {
    }

    public static class ApiEventDataBinder extends ApiDataBinder<SDKEvent, Void> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        public Void createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        @Nullable
        public byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable SDKEvent sDKEvent) throws Exception {
            if (sDKEvent != null) {
                return sDKEvent.toByteArray();
            }
            return null;
        }
    }

    public static class ApiInitDataBinder extends ApiDataBinder<InitRequest, InitResponse> {
        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        public InitResponse createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            InitResponse from = InitResponse.parseFrom(bArr);
            d5.e("Init Response", from);
            return from;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        @Nullable
        public byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable InitRequest initRequest) throws Exception {
            d5.e("Init Request", initRequest);
            if (initRequest != null) {
                return initRequest.toByteArray();
            }
            return null;
        }
    }

    public static class ApiResponseAuctionDataBinder extends ApiDataBinder<Request, Response> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        @Nullable
        public byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable Request request) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        public Response createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Openrtb from = Openrtb.parseFrom(bArr);
            if (from == null) {
                return null;
            }
            d5.e("Auction Response", from);
            return from.getResponse();
        }
    }

    public static class ApiTrackerDataBinder extends ApiDataBinder<Object, String> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        public String createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        @Nullable
        protected byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, @Nullable Object obj) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b bVar, URLConnection uRLConnection) {
            String userAgent = UserAgentManager.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                return;
            }
            uRLConnection.setRequestProperty("User-Agent", userAgent);
        }
    }

    public static class Builder<RequestDataType, ResponseDataType> {
        private b.InterfaceC0975b callback;
        private b.c cancelCallback;
        private ApiDataBinder<RequestDataType, ResponseDataType> dataBinder;
        private RequestDataType requestData;
        private String url;
        private int timeOut = ApiRequest.REQUEST_TIMEOUT;
        private b.e method = b.e.Post;

        public ApiRequest<RequestDataType, ResponseDataType> build() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequest = new ApiRequest<>(this.method, null, this.requestData);
            apiRequest.setCallback(this.callback);
            apiRequest.setCancelCallback(this.cancelCallback);
            apiRequest.setDataBinder(this.dataBinder);
            apiRequest.requiredUrl = this.url;
            apiRequest.timeOut = this.timeOut;
            return apiRequest;
        }

        public String getUrl() {
            return this.url;
        }

        public ApiRequest<RequestDataType, ResponseDataType> request() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequestBuild = build();
            apiRequestBuild.request();
            return apiRequestBuild;
        }

        public Builder<RequestDataType, ResponseDataType> setCallback(b.InterfaceC0975b interfaceC0975b) {
            this.callback = interfaceC0975b;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCancelCallback(b.c cVar) {
            this.cancelCallback = cVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setDataBinder(ApiDataBinder<RequestDataType, ResponseDataType> apiDataBinder) {
            this.dataBinder = apiDataBinder;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setLoadingTimeOut(int i10) {
            if (i10 <= 0) {
                i10 = ApiRequest.REQUEST_TIMEOUT;
            }
            this.timeOut = i10;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setMethod(@NonNull b.e eVar) {
            this.method = eVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setRequestData(RequestDataType requestdatatype) {
            this.requestData = requestdatatype;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> url(String str) {
            this.url = str;
            return this;
        }
    }

    public static /* synthetic */ String c(Throwable th2, URLConnection uRLConnection) {
        return "obtainError: " + th2 + "(" + uRLConnection + ")";
    }

    @Override // io.bidmachine.core.b
    protected String getBaseUrl() {
        return this.requiredUrl;
    }

    @Override // io.bidmachine.core.b
    protected void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    private ApiRequest(@NonNull b.e eVar, @Nullable String str, @Nullable RequestDataType requestdatatype) {
        super(eVar, str, requestdatatype);
        addContentEncoder(new b.d());
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
    public ae.a obtainError(@Nullable final URLConnection uRLConnection, @Nullable final Throwable th2) {
        io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.y0
            @Override // ce.b
            public final Object get() {
                return ApiRequest.c(th2, uRLConnection);
            }
        });
        if (th2 instanceof UnknownHostException) {
            return ae.a.f4235e;
        }
        if (!(th2 instanceof SocketTimeoutException) && !(th2 instanceof ConnectTimeoutException)) {
            return ae.a.l("Unknown api request error", th2);
        }
        return ae.a.f4236f;
    }
}
