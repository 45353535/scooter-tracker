package com.appsflyer.internal;

import android.util.Base64;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.appsflyer.internal.AFc1cSDK, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "AFAdRevenueData", "()Lorg/json/JSONObject;", "getMediationNetwork", "()Ljava/lang/String;", "toString", "getCurrencyIso4217Code", "I", "getMonetizationNetwork", "getRevenue", "Ljava/lang/String;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExceptionInfo {

    /* JADX INFO: renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata and from toString */
    @NotNull
    public String stackTrace;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata and from toString */
    int counter;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata and from toString */
    @NotNull
    public String label;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata and from toString */
    @NotNull
    final String hashName;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1cSDK$AFa1vSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "AFAdRevenueData", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1cSDK;", "getCurrencyIso4217Code", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1cSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static boolean AFAdRevenueData(Integer p02, String... p12) {
            boolean z10 = p02 == null;
            int length = p12.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = p12[i10];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        @Nullable
        public static ExceptionInfo getCurrencyIso4217Code(@NotNull String p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            List<String> listSplit$default = StringsKt.split$default(p02, new String[]{IOUtils.LINE_SEPARATOR_UNIX}, false, 0, 6, null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String currencyIso4217Code = null;
            String currencyIso4217Code2 = null;
            String currencyIso4217Code3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (StringsKt.a0(str, "label=", false, 2, null)) {
                    currencyIso4217Code = getCurrencyIso4217Code(str, "label=");
                } else if (StringsKt.a0(str, "hashName=", false, 2, null)) {
                    currencyIso4217Code2 = getCurrencyIso4217Code(str, "hashName=");
                } else if (!StringsKt.a0(str, "stackTrace=", false, 2, null)) {
                    if (!StringsKt.a0(str, "c=", false, 2, null)) {
                        break;
                    }
                    String strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.v1(strSubstring).toString()));
                } else {
                    currencyIso4217Code3 = getCurrencyIso4217Code(str, "stackTrace=");
                }
            }
            if (AFAdRevenueData(numValueOf, currencyIso4217Code, currencyIso4217Code2, currencyIso4217Code3)) {
                return null;
            }
            Intrinsics.checkNotNull(currencyIso4217Code);
            Intrinsics.checkNotNull(currencyIso4217Code2);
            Intrinsics.checkNotNull(currencyIso4217Code3);
            Intrinsics.checkNotNull(numValueOf);
            return new ExceptionInfo(currencyIso4217Code, currencyIso4217Code2, currencyIso4217Code3, numValueOf.intValue());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String getCurrencyIso4217Code(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.v1(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }
    }

    public ExceptionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.hashName = str2;
        this.stackTrace = str3;
        this.counter = i10;
    }

    @NotNull
    public final JSONObject AFAdRevenueData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.label);
        jSONObject.put("hash_name", this.hashName);
        jSONObject.put("st", this.stackTrace);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, String.valueOf(this.counter));
        return jSONObject;
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) p02;
        return Intrinsics.areEqual(this.label, exceptionInfo.label) && Intrinsics.areEqual(this.hashName, exceptionInfo.hashName) && Intrinsics.areEqual(this.stackTrace, exceptionInfo.stackTrace) && this.counter == exceptionInfo.counter;
    }

    @NotNull
    public final String getMediationNetwork() {
        String str = this.label;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.hashName;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.stackTrace;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.counter;
    }

    public final int hashCode() {
        return (((((this.label.hashCode() * 31) + this.hashName.hashCode()) * 31) + this.stackTrace.hashCode()) * 31) + this.counter;
    }

    @NotNull
    public final String toString() {
        return "ExceptionInfo(label=" + this.label + ", hashName=" + this.hashName + ", stackTrace=" + this.stackTrace + ", counter=" + this.counter + ")";
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }
}
