package com.inmobi.unification.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.C3653da;
import com.taurusx.tax.f.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/inmobi/unification/sdk/InitializationStatus;", "", "<init>", "()V", y.f66058y, "com/inmobi/media/da", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public @interface InitializationStatus {

    @NotNull
    public static final C3653da Companion = C3653da.f38436a;

    @NotNull
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";

    @NotNull
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";

    @NotNull
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";

    @NotNull
    public static final String SUCCESS = "Success";

    @NotNull
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
