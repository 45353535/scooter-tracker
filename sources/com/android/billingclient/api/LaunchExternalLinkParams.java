package com.android.billingclient.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
@zzo
public final class LaunchExternalLinkParams {
    private final Uri zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    @zzo
    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;
        private int zzd = 0;

        private Builder() {
        }

        @NonNull
        @zzo
        public LaunchExternalLinkParams build() {
            int i10 = this.zzc;
            if (i10 == 0) {
                throw new IllegalArgumentException("Link type is required.");
            }
            int i11 = this.zzb;
            if (i11 == 0) {
                throw new IllegalArgumentException("Launch mode is required.");
            }
            if (i11 != 1 && i10 == 2) {
                throw new IllegalArgumentException("App downloads must launch in an external browser or app.");
            }
            if (this.zzd == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            Uri uri = this.zza;
            if (uri == null) {
                throw new IllegalArgumentException("URI must be set.");
            }
            if (uri.getScheme() != null) {
                return new LaunchExternalLinkParams(this.zza, this.zzb, this.zzc, this.zzd, null);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        @NonNull
        @zzo
        public Builder setBillingProgram(int i10) {
            this.zzd = i10;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLaunchMode(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkType(int i10) {
            this.zzc = i10;
            return this;
        }

        @NonNull
        @zzo
        public Builder setLinkUri(@NonNull Uri uri) {
            this.zza = uri;
            return this;
        }

        /* synthetic */ Builder(zzdr zzdrVar) {
        }
    }

    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {

        @zzo
        public static final int CALLER_WILL_LAUNCH_LINK = 2;

        @zzo
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;

        @zzo
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    @zzo
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkType {

        @zzp
        public static final int LINK_TO_APP_DOWNLOAD = 2;

        @zzo
        public static final int LINK_TO_DIGITAL_CONTENT_OFFER = 1;

        @zzo
        public static final int LINK_TYPE_UNSPECIFIED = 0;
    }

    /* synthetic */ LaunchExternalLinkParams(Uri uri, int i10, int i11, int i12, zzdr zzdrVar) {
        this.zza = uri;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
    }

    @NonNull
    @zzo
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @zzo
    public int getBillingProgram() {
        return this.zzd;
    }

    @zzo
    public int getLaunchMode() {
        return this.zzb;
    }

    @zzo
    public int getLinkType() {
        return this.zzc;
    }

    @NonNull
    @zzo
    public Uri getLinkUri() {
        return this.zza;
    }
}
