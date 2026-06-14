package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 O2\u00020\u0001:\u0003P+,B\u0083\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019¢\u0006\u0004\b\u0016\u0010\u001bB\u0011\b\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0016\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010A\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\b.\u0010 R(\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010B\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b2\u0010ER\u0017\u0010K\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010N\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u0010 ¨\u0006Q"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "requestStatusCode", "errorCode", "subErrorCode", "", "errorType", "errorMessageField", "errorUserTitle", "errorUserMessage", "Lorg/json/JSONObject;", "requestResultBody", "requestResult", "", "batchRequestResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/i;", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/i;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "toString", "()Ljava/lang/String;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "b", "I", "h", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", InneractiveMediationDefs.GENDER_FEMALE, "getErrorUserTitle", "g", "getErrorUserMessage", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "getRequestResult", "j", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", CampaignEx.JSON_KEY_AD_K, "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", CmcdData.Factory.STREAM_TYPE_LIVE, "errorMessage", "<set-?>", "m", "Lcom/facebook/i;", "()Lcom/facebook/i;", "Lcom/facebook/FacebookRequestError$a;", "n", "Lcom/facebook/FacebookRequestError$a;", "getCategory", "()Lcom/facebook/FacebookRequestError$a;", "category", "o", "getErrorRecoveryMessage", "errorRecoveryMessage", "p", "a", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int requestStatusCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int subErrorCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String errorType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String errorUserTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String errorUserMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final JSONObject requestResultBody;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final JSONObject requestResult;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object batchRequestResult;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final HttpURLConnection connection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private i exception;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a category;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String errorRecoveryMessage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f19526q = new d(200, 299);

    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new b();

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FacebookRequestError a(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            String str;
            String strOptString;
            int iOptInt;
            String str2;
            Object obj2;
            boolean z10;
            String str3;
            String strOptString2;
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i10 = singleResult.getInt("code");
                    Object objM = com.facebook.internal.z.M(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objM == null || !(objM instanceof JSONObject)) {
                        str = "body";
                    } else {
                        boolean z11 = true;
                        if (((JSONObject) objM).has("error")) {
                            JSONObject jSONObject = (JSONObject) com.facebook.internal.z.M((JSONObject) objM, "error", null);
                            String strOptString3 = jSONObject != null ? jSONObject.optString("type", null) : null;
                            strOptString = jSONObject != null ? jSONObject.optString(PglCryptUtils.KEY_MESSAGE, null) : null;
                            int iOptInt2 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject != null ? jSONObject.optString("error_user_msg", null) : null;
                            String strOptString4 = jSONObject != null ? jSONObject.optString("error_user_title", null) : null;
                            boolean zOptBoolean = jSONObject != null ? jSONObject.optBoolean("is_transient", false) : false;
                            str = "body";
                            iOptInt = iOptInt;
                            iOptInt = iOptInt2;
                            str2 = strOptString3;
                            obj2 = objM;
                            str3 = strOptString4;
                            z10 = zOptBoolean;
                        } else if (((JSONObject) objM).has("error_code") || ((JSONObject) objM).has("error_msg") || ((JSONObject) objM).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objM).optString("error_reason", null);
                            strOptString = ((JSONObject) objM).optString("error_msg", null);
                            iOptInt = ((JSONObject) objM).optInt("error_code", -1);
                            str = "body";
                            iOptInt = ((JSONObject) objM).optInt("error_subcode", -1);
                            str2 = strOptString5;
                            obj2 = objM;
                            z10 = false;
                            str3 = null;
                            strOptString2 = null;
                        } else {
                            str = "body";
                            obj2 = objM;
                            z11 = false;
                            z10 = false;
                            iOptInt = -1;
                            str2 = null;
                            str3 = null;
                            strOptString = null;
                            strOptString2 = null;
                        }
                        if (z11) {
                            return new FacebookRequestError(i10, iOptInt, iOptInt, str2, strOptString, str3, strOptString2, (JSONObject) obj2, singleResult, obj, httpURLConnection, null, z10, null);
                        }
                    }
                    if (!c().a(i10)) {
                        return new FacebookRequestError(i10, -1, -1, null, null, null, null, singleResult.has(str) ? (JSONObject) com.facebook.internal.z.M(singleResult, str, "FACEBOOK_NON_JSON_RESULT") : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final synchronized com.facebook.internal.c b() {
            com.facebook.internal.i iVarF = com.facebook.internal.m.f(s.n());
            if (iVarF == null) {
                return com.facebook.internal.c.f19855g.b();
            }
            return iVarF.g();
        }

        public final d c() {
            return FacebookRequestError.f19526q;
        }

        private Companion() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19546b;

        public d(int i10, int i11) {
            this.f19545a = i10;
            this.f19546b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f19546b && this.f19545a <= i10;
        }
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, i iVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, iVar, z10);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        i iVar = this.exception;
        if (iVar != null) {
            return iVar.getLocalizedMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + e() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(e());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, i iVar, boolean z10) {
        a aVarC;
        this.requestStatusCode = i10;
        this.errorCode = i11;
        this.subErrorCode = i12;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (iVar != null) {
            this.exception = iVar;
            aVarC = a.OTHER;
        } else {
            this.exception = new u(this, e());
            aVarC = INSTANCE.b().c(i11, i12, z10);
        }
        this.category = aVarC;
        this.errorRecoveryMessage = INSTANCE.b().d(aVarC);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof i ? (i) exc : new i(exc), false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
