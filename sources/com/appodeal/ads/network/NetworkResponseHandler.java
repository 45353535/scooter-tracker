package com.appodeal.ads.network;

import com.appodeal.ads.network.NetworkResponse;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\f\rJ1\u0010\u0004\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponseHandler;", "Response", "Lcom/appodeal/ads/network/NetworkResponse;", "", "handleResponse", "headers", "", "", "", "responseBytes", "", "(Ljava/util/Map;[B)Lcom/appodeal/ads/network/NetworkResponse;", "SaveToFile", "ParseToJson", "Lcom/appodeal/ads/network/NetworkResponseHandler$ParseToJson;", "Lcom/appodeal/ads/network/NetworkResponseHandler$SaveToFile;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkResponseHandler<Response extends NetworkResponse> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J3\u0010\t\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponseHandler$ParseToJson;", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "Lcom/appodeal/ads/network/NetworkResponse$JsonResult;", "", "", "", "headers", "", "responseBytes", "handleResponse", "(Ljava/util/Map;[B)Lcom/appodeal/ads/network/NetworkResponse$JsonResult;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParseToJson implements NetworkResponseHandler<NetworkResponse.JsonResult> {
        public static final ParseToJson INSTANCE = new ParseToJson();

        @Override // com.appodeal.ads.network.NetworkResponseHandler
        public /* bridge */ /* synthetic */ NetworkResponse handleResponse(Map map, byte[] bArr) {
            return handleResponse((Map<String, ? extends List<String>>) map, bArr);
        }

        @Override // com.appodeal.ads.network.NetworkResponseHandler
        public NetworkResponse.JsonResult handleResponse(Map<String, ? extends List<String>> headers, byte[] responseBytes) {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(headers, "headers");
            if (responseBytes != null) {
                try {
                    jSONObject = new JSONObject(new String(responseBytes, Charsets.UTF_8));
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            return new NetworkResponse.JsonResult(headers, jSONObject);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/appodeal/ads/network/NetworkResponseHandler$SaveToFile;", "Lcom/appodeal/ads/network/NetworkResponseHandler;", "Lcom/appodeal/ads/network/NetworkResponse$FileResult;", "", "outputFilePath", "<init>", "(Ljava/lang/String;)V", "", "", "headers", "", "responseBytes", "handleResponse", "(Ljava/util/Map;[B)Lcom/appodeal/ads/network/NetworkResponse$FileResult;", "component1", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/String;)Lcom/appodeal/ads/network/NetworkResponseHandler$SaveToFile;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOutputFilePath", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToFile implements NetworkResponseHandler<NetworkResponse.FileResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String outputFilePath;

        public SaveToFile(String outputFilePath) {
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            this.outputFilePath = outputFilePath;
        }

        public static /* synthetic */ SaveToFile copy$default(SaveToFile saveToFile, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = saveToFile.outputFilePath;
            }
            return saveToFile.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOutputFilePath() {
            return this.outputFilePath;
        }

        public final SaveToFile copy(String outputFilePath) {
            Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
            return new SaveToFile(outputFilePath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveToFile) && Intrinsics.areEqual(this.outputFilePath, ((SaveToFile) other).outputFilePath);
        }

        public final String getOutputFilePath() {
            return this.outputFilePath;
        }

        @Override // com.appodeal.ads.network.NetworkResponseHandler
        public /* bridge */ /* synthetic */ NetworkResponse handleResponse(Map map, byte[] bArr) {
            return handleResponse((Map<String, ? extends List<String>>) map, bArr);
        }

        public int hashCode() {
            return this.outputFilePath.hashCode();
        }

        public String toString() {
            return "SaveToFile(outputFilePath=" + this.outputFilePath + ")";
        }

        @Override // com.appodeal.ads.network.NetworkResponseHandler
        public NetworkResponse.FileResult handleResponse(Map<String, ? extends List<String>> headers, byte[] responseBytes) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new NetworkResponse.FileResult(headers, this.outputFilePath);
        }
    }

    Response handleResponse(Map<String, ? extends List<String>> headers, byte[] responseBytes);
}
