package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.taurusx.tax.f.y;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "(Ljava/lang/Object;)V", "getClassName", "", "getOriginalJson", "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", ProductDetailsBridge.TO_STRING_METHOD, y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {

    @NotNull
    private static final String TO_STRING_METHOD = "toString";

    @NotNull
    private final Object internalRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(@NotNull Object internalRef) {
        super(MapsKt.hashMapOf(TuplesKt.to(TO_STRING_METHOD, new Class[0])));
        Intrinsics.checkNotNullParameter(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    private final String parseOriginalJson(String productDetailsString) {
        try {
            int iV0 = StringsKt.v0(productDetailsString, "jsonString='", 0, false, 6, null) + 12;
            int iV02 = StringsKt.v0(productDetailsString, "', parsedJson=", 0, false, 6, null);
            if (1 <= iV0 && iV0 < iV02) {
                String strSubstring = productDetailsString.substring(iV0, iV02);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringsKt.W(strSubstring, "\\/", "/", false, 4, null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    @NotNull
    public JSONObject getOriginalJson() {
        try {
            String originalJson = parseOriginalJson(toString());
            return originalJson != null ? new JSONObject(originalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @NotNull
    public String toString() {
        Object objCallNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        Intrinsics.checkNotNull(objCallNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) objCallNonVoidMethod;
    }
}
