package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.facebook.AccessToken;
import com.facebook.internal.z;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u0000 42\u00020\u0001:\u0001#BQ\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b)\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u00065"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "", "id", "firstName", "middleName", "lastName", "name", "Landroid/net/Uri;", "linkUri", "pictureUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "Lorg/json/JSONObject;", "jsonObject", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "()Lorg/json/JSONObject;", "describeContents", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getFirstName", "getMiddleName", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getLastName", InneractiveMediationDefs.GENDER_FEMALE, "getName", "g", "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "h", "getPictureUri", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Profile implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String middleName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Uri linkUri;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Uri pictureUri;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f19577j = Profile.class.getSimpleName();

    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Profile(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i10) {
            return new Profile[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.Profile$b, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.Profile$b$a */
        public static final class a implements z.a {
            a() {
            }

            @Override // com.facebook.internal.z.a
            public void a(JSONObject jSONObject) {
                String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
                if (strOptString == null) {
                    Log.w(Profile.f19577j, "No user ID returned on Me request");
                    return;
                }
                String strOptString2 = jSONObject.optString(POBCoreNativeConstants.NATIVE_LINK);
                String strOptString3 = jSONObject.optString("profile_picture", null);
                Profile.INSTANCE.c(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.z.a
            public void b(i iVar) {
                Log.e(Profile.f19577j, "Got unexpected exception: " + iVar);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            AccessToken accessTokenE = companion.e();
            if (accessTokenE == null) {
                return;
            }
            if (companion.g()) {
                com.facebook.internal.z.E(accessTokenE.getToken(), new a());
            } else {
                c(null);
            }
        }

        public final Profile b() {
            return f0.f19802d.a().c();
        }

        public final void c(Profile profile) {
            f0.f19802d.a().f(profile);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("first_name", this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put("last_name", this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        String str5 = this.id;
        return ((str5 == null && ((Profile) other).id == null) || Intrinsics.areEqual(str5, ((Profile) other).id)) && (((str = this.firstName) == null && ((Profile) other).firstName == null) || Intrinsics.areEqual(str, ((Profile) other).firstName)) && ((((str2 = this.middleName) == null && ((Profile) other).middleName == null) || Intrinsics.areEqual(str2, ((Profile) other).middleName)) && ((((str3 = this.lastName) == null && ((Profile) other).lastName == null) || Intrinsics.areEqual(str3, ((Profile) other).lastName)) && ((((str4 = this.name) == null && ((Profile) other).name == null) || Intrinsics.areEqual(str4, ((Profile) other).name)) && ((((uri = this.linkUri) == null && ((Profile) other).linkUri == null) || Intrinsics.areEqual(uri, ((Profile) other).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) other).pictureUri == null) || Intrinsics.areEqual(uri2, ((Profile) other).pictureUri))))));
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        Uri uri = this.linkUri;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.a0.h(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public Profile(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.id = jsonObject.optString("id", null);
        this.firstName = jsonObject.optString("first_name", null);
        this.middleName = jsonObject.optString("middle_name", null);
        this.lastName = jsonObject.optString("last_name", null);
        this.name = jsonObject.optString("name", null);
        String strOptString = jsonObject.optString("link_uri", null);
        this.linkUri = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jsonObject.optString("picture_uri", null);
        this.pictureUri = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    private Profile(Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String string = parcel.readString();
        this.linkUri = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.pictureUri = string2 != null ? Uri.parse(string2) : null;
    }
}
