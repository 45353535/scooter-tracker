package com.appodeal.ads.network;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponse;", "", "JsonResult", "FileResult", "Lcom/appodeal/ads/network/NetworkResponse$FileResult;", "Lcom/appodeal/ads/network/NetworkResponse$JsonResult;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkResponse {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponse$FileResult;", "Lcom/appodeal/ads/network/NetworkResponse;", "", "", "", "headers", "outputFilePath", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "a", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "getOutputFilePath", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FileResult implements NetworkResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Map headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String outputFilePath;

        public FileResult(Map<String, ? extends List<String>> headers, String outputFilePath) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            this.headers = headers;
            this.outputFilePath = outputFilePath;
        }

        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final String getOutputFilePath() {
            return this.outputFilePath;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponse$JsonResult;", "Lcom/appodeal/ads/network/NetworkResponse;", "", "", "", "headers", "Lorg/json/JSONObject;", "json", "<init>", "(Ljava/util/Map;Lorg/json/JSONObject;)V", "a", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "b", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JsonResult implements NetworkResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Map headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final JSONObject json;

        public JsonResult(Map<String, ? extends List<String>> headers, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
            this.json = jSONObject;
        }

        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final JSONObject getJson() {
            return this.json;
        }
    }
}
