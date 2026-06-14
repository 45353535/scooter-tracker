package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.Bi;
import com.inmobi.media.H6;
import com.inmobi.media.Se;
import com.inmobi.media.T9;
import com.inmobi.media.Ue;
import com.taurusx.tax.f.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)¨\u00061"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig;", "Lcom/inmobi/media/core/config/models/Config;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "", "isValid", "()Z", "type", "", "getExpiryInMillisForType", "(Ljava/lang/String;)J", "", "getMaxRetries", "()I", "getRetryInterval", "isMonetizationDisabled", "", "getIPAddrTPSupport", "()Ljava/util/List;", "shouldTransmitRequest", "getUrlForType", "(Ljava/lang/String;)Ljava/lang/String;", "maxRetries", "", "setMaxRetries", "(I)V", "retryInterval", "setRetryInterval", "Lcom/inmobi/media/T9;", "includeIds", "setIncludeIdParams", "(Lcom/inmobi/media/T9;)V", "I", "Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "gdpr", "Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "Lcom/inmobi/media/core/config/models/RootConfig$ComponentConfig;", "components", "Ljava/util/List;", "monetizationDisabled", "Z", "ipAddrTPSupport", y.f66058y, "com/inmobi/media/Bi", "ComponentConfig", "GDPR", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootConfig extends Config {

    @NotNull
    public static final Bi Companion = new Bi();
    public static final long DEFAULT_EXPIRY_IN_SEC = 86400;

    @NotNull
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    private boolean monetizationDisabled;
    private int maxRetries = 3;
    private int retryInterval = 60;

    @Ue
    @Nullable
    private GDPR gdpr = new GDPR();

    @NotNull
    private final List<ComponentConfig> components = CollectionsKt.emptyList();

    @NotNull
    private final List<String> ipAddrTPSupport = CollectionsKt.emptyList();

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$ComponentConfig;", "", "<init>", "()V", "type", "", "expiry", "", "url", "getType", "getExpiry", "getUrl", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComponentConfig {

        @NotNull
        private String type = "";
        private long expiry = Long.MAX_VALUE;

        @NotNull
        private String url = "";

        public final long getExpiry() {
            return this.expiry;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return StringsKt.v1(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 86400 && !H6.a(this.url);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/inmobi/media/core/config/models/RootConfig$GDPR;", "", "<init>", "()V", "transmitRequest", "", "Ljava/lang/Boolean;", "getTransmitRequest", "()Ljava/lang/Boolean;", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GDPR {

        @Ue
        @Nullable
        private Boolean transmitRequest = Boolean.TRUE;

        @Nullable
        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    public final long getExpiryInMillisForType(@NotNull String type) {
        long expiry;
        long j10;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.components.iterator();
        while (true) {
            if (!it.hasNext()) {
                IntRange intRange = Se.f37724a;
                expiry = 1000;
                j10 = 86400;
                break;
            }
            ComponentConfig componentConfig = (ComponentConfig) it.next();
            if (Intrinsics.areEqual(type, componentConfig.getType())) {
                expiry = componentConfig.getExpiry();
                IntRange intRange2 = Se.f37724a;
                j10 = 1000;
                break;
            }
        }
        return expiry * j10;
    }

    @NotNull
    public final List<String> getIPAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @NotNull
    public String getType() {
        return "root";
    }

    @NotNull
    public final String getUrlForType(@NotNull String type) {
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.components.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ComponentConfig) next).getType(), type)) {
                break;
            }
        }
        ComponentConfig componentConfig = (ComponentConfig) next;
        String url = componentConfig != null ? componentConfig.getUrl() : null;
        return (url == null || url.length() == 0) ? DEFAULT_FALLBACK_URL : url;
    }

    /* JADX INFO: renamed from: isMonetizationDisabled, reason: from getter */
    public final boolean getMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (this.maxRetries >= 0 && this.retryInterval >= 0) {
            Iterator<T> it = this.components.iterator();
            while (it.hasNext()) {
                if (!((ComponentConfig) it.next()).isValid()) {
                    return false;
                }
            }
            GDPR gdpr = this.gdpr;
            if (gdpr != null && gdpr.isValid()) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setIncludeIdParams(@NotNull T9 includeIds) {
        Intrinsics.checkNotNullParameter(includeIds, "includeIds");
        setIncludeIds(includeIds);
    }

    @VisibleForTesting(otherwise = 2)
    public final void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setRetryInterval(int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr != null) {
            gdpr.getTransmitRequest();
        }
        GDPR gdpr2 = this.gdpr;
        if (gdpr2 == null || (transmitRequest = gdpr2.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }
}
