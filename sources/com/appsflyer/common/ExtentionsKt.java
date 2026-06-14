package com.appsflyer.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.api.PurchaseClientImplKt;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.models.InAppPurchaseValidationResult;
import com.appsflyer.internal.models.SubscriptionValidationResult;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0014\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\u00020\u0002*\u00020\u0011H\u0002\u001a\u001a\u0010\u0012\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0000\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\u001c\u001a\u00020\u0019*\u00020\u001aH\u0000\"*\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\" \u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"*\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u001d"}, d2 = {"inAppValidationResult", "", "", "Lcom/appsflyer/internal/models/InAppPurchaseValidationResult;", "Lcom/appsflyer/internal/components/network/http/ResponseNetwork;", "getInAppValidationResult", "(Lcom/appsflyer/internal/components/network/http/ResponseNetwork;)Ljava/util/Map;", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "getSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "subscriptionValidationResult", "Lcom/appsflyer/internal/models/SubscriptionValidationResult;", "getSubscriptionValidationResult", "base64", "", "join", "", "delimiter", "", "orEmpty", "", "printCause", "", "", "sha256AsBase64", "warnIfBillingLibraryWrongVersion", "purchase_prodRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtentionsKt {
    private static final String base64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    @NotNull
    public static final Map<String, InAppPurchaseValidationResult> getInAppValidationResult(@NotNull ResponseNetwork<String> responseNetwork) throws JSONException {
        Intrinsics.checkNotNullParameter(responseNetwork, "<this>");
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(responseNetwork.getBody());
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String it = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            InAppPurchaseValidationResult.Companion companion = InAppPurchaseValidationResult.INSTANCE;
            JSONObject jSONObject2 = jSONObject.getJSONObject(it);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(it)");
            map.put(it, companion.fromJson(jSONObject2));
        }
        return map;
    }

    public static final SharedPreferences getSharedPreferences(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getApplicationContext().getSharedPreferences(PurchaseClientImplKt.SP_NAME, 0);
    }

    @NotNull
    public static final Map<String, SubscriptionValidationResult> getSubscriptionValidationResult(@NotNull ResponseNetwork<String> responseNetwork) throws JSONException {
        Intrinsics.checkNotNullParameter(responseNetwork, "<this>");
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(responseNetwork.getBody());
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String it = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            SubscriptionValidationResult.Companion companion = SubscriptionValidationResult.INSTANCE;
            JSONObject jSONObject2 = jSONObject.getJSONObject(it);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(it)");
            map.put(it, companion.fromJson(jSONObject2));
        }
        return map;
    }

    @NotNull
    public static final String join(@NotNull List<String> list, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return CollectionsKt.joinToString$default(list, delimiter, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final Map<String, Object> orEmpty(@Nullable Map<String, ? extends Object> map) {
        return map == null ? MapsKt.emptyMap() : map;
    }

    public static final void printCause(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th2 instanceof InvocationTargetException) {
            AFLogger.afErrorLog("[PurchaseConnector]: unexpected InvocationTargetException ", th2.getCause(), true);
        }
    }

    @NotNull
    public static final String sha256AsBase64(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(\"SHA-256\")\n …   .digest(toByteArray())");
        String strBase64 = base64(bArrDigest);
        Intrinsics.checkNotNullExpressionValue(strBase64, "getInstance(\"SHA-256\")\n …rray())\n        .base64()");
        return strBase64;
    }

    public static final void warnIfBillingLibraryWrongVersion(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if ((th2 instanceof NoSuchMethodError) || (th2 instanceof NoClassDefFoundError)) {
            AFLogger.afWarnLog("[PurchaseConnector]: It seems your app uses different Play Billing library version than the SDK. Please use v.8.0.0");
        }
    }
}
