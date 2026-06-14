package com.appodeal.ads.network;

import com.appodeal.ads.network.httpclients.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/network/HttpClient;", "Lcom/appodeal/ads/network/Networking;", "File", "ZipBase64", "Proto", "Method", "Lcom/appodeal/ads/network/HttpClient$File;", "Lcom/appodeal/ads/network/HttpClient$Proto;", "Lcom/appodeal/ads/network/HttpClient$ZipBase64;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface HttpClient extends Networking {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002Jh\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096A¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/network/HttpClient$File;", "Lcom/appodeal/ads/network/HttpClient;", "Lcom/appodeal/ads/network/Networking;", "Lcom/appodeal/ads/network/NetworkResponse;", "Response", "Lcom/appodeal/ads/network/HttpClient$Method;", "method", "", "path", "", "body", "", "connectTimeout", "readTimeout", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "responseHandler", "", "useUniqueRequestId", "overrideUrl", "Lkotlin/Result;", "enqueue-tZkwj4A", "(Lcom/appodeal/ads/network/HttpClient$Method;Ljava/lang/String;[BJJLcom/appodeal/ads/network/NetworkResponseHandler;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueue", "getHost", "()Ljava/lang/String;", "host", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class File implements HttpClient, Networking {
        public static final File INSTANCE = new File();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.network.httpclients.b f13901a = (com.appodeal.ads.network.httpclients.b) f.f13970a.getValue();

        @Override // com.appodeal.ads.network.Networking
        /* JADX INFO: renamed from: enqueue-tZkwj4A, reason: not valid java name */
        public <Response extends NetworkResponse> Object mo4433enqueuetZkwj4A(Method method, String str, byte[] bArr, long j10, long j11, NetworkResponseHandler<Response> networkResponseHandler, boolean z10, String str2, Continuation continuation) {
            Object objMo4433enqueuetZkwj4A = this.f13901a.mo4433enqueuetZkwj4A(method, str, bArr, j10, j11, networkResponseHandler, z10, str2, continuation);
            pf.b.g();
            return objMo4433enqueuetZkwj4A;
        }

        @Override // com.appodeal.ads.network.Networking
        public String getHost() {
            return this.f13901a.f13967d.getActiveEndpoint();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/network/HttpClient$Method;", "", "GET", "POST", "PUT", "DELETE", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Method {
        public static final Method DELETE;
        public static final Method GET;
        public static final Method POST;
        public static final Method PUT;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Method[] f13902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13903b;

        static {
            Method method = new Method("GET", 0);
            GET = method;
            Method method2 = new Method("POST", 1);
            POST = method2;
            Method method3 = new Method("PUT", 2);
            PUT = method3;
            Method method4 = new Method("DELETE", 3);
            DELETE = method4;
            Method[] methodArr = {method, method2, method3, method4};
            f13902a = methodArr;
            f13903b = qf.a.a(methodArr);
        }

        public Method(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return f13903b;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) f13902a.clone();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002Jh\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096A¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/network/HttpClient$Proto;", "Lcom/appodeal/ads/network/HttpClient;", "Lcom/appodeal/ads/network/Networking;", "Lcom/appodeal/ads/network/NetworkResponse;", "Response", "Lcom/appodeal/ads/network/HttpClient$Method;", "method", "", "path", "", "body", "", "connectTimeout", "readTimeout", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "responseHandler", "", "useUniqueRequestId", "overrideUrl", "Lkotlin/Result;", "enqueue-tZkwj4A", "(Lcom/appodeal/ads/network/HttpClient$Method;Ljava/lang/String;[BJJLcom/appodeal/ads/network/NetworkResponseHandler;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueue", "getHost", "()Ljava/lang/String;", "host", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Proto implements HttpClient, Networking {
        public static final Proto INSTANCE = new Proto();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.network.httpclients.b f13904a = (com.appodeal.ads.network.httpclients.b) f.f13972c.getValue();

        @Override // com.appodeal.ads.network.Networking
        /* JADX INFO: renamed from: enqueue-tZkwj4A */
        public <Response extends NetworkResponse> Object mo4433enqueuetZkwj4A(Method method, String str, byte[] bArr, long j10, long j11, NetworkResponseHandler<Response> networkResponseHandler, boolean z10, String str2, Continuation continuation) {
            Object objMo4433enqueuetZkwj4A = this.f13904a.mo4433enqueuetZkwj4A(method, str, bArr, j10, j11, networkResponseHandler, z10, str2, continuation);
            pf.b.g();
            return objMo4433enqueuetZkwj4A;
        }

        @Override // com.appodeal.ads.network.Networking
        public String getHost() {
            return this.f13904a.f13967d.getActiveEndpoint();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002Jh\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096A¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/appodeal/ads/network/HttpClient$ZipBase64;", "Lcom/appodeal/ads/network/HttpClient;", "Lcom/appodeal/ads/network/Networking;", "Lcom/appodeal/ads/network/NetworkResponse;", "Response", "Lcom/appodeal/ads/network/HttpClient$Method;", "method", "", "path", "", "body", "", "connectTimeout", "readTimeout", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "responseHandler", "", "useUniqueRequestId", "overrideUrl", "Lkotlin/Result;", "enqueue-tZkwj4A", "(Lcom/appodeal/ads/network/HttpClient$Method;Ljava/lang/String;[BJJLcom/appodeal/ads/network/NetworkResponseHandler;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueue", "getHost", "()Ljava/lang/String;", "host", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZipBase64 implements HttpClient, Networking {
        public static final ZipBase64 INSTANCE = new ZipBase64();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.appodeal.ads.network.httpclients.b f13905a = (com.appodeal.ads.network.httpclients.b) f.f13971b.getValue();

        @Override // com.appodeal.ads.network.Networking
        /* JADX INFO: renamed from: enqueue-tZkwj4A */
        public <Response extends NetworkResponse> Object mo4433enqueuetZkwj4A(Method method, String str, byte[] bArr, long j10, long j11, NetworkResponseHandler<Response> networkResponseHandler, boolean z10, String str2, Continuation continuation) {
            Object objMo4433enqueuetZkwj4A = this.f13905a.mo4433enqueuetZkwj4A(method, str, bArr, j10, j11, networkResponseHandler, z10, str2, continuation);
            pf.b.g();
            return objMo4433enqueuetZkwj4A;
        }

        @Override // com.appodeal.ads.network.Networking
        public String getHost() {
            return this.f13905a.f13967d.getActiveEndpoint();
        }
    }
}
