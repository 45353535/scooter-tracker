package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f78806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f78807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f78808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f78809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f78810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f78811f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f78812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f78813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SSLSocketFactory f78814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f78815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f78816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f78817f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.f78812a, this.f78813b, this.f78814c, this.f78815d, this.f78816e, this.f78817f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int i10) {
            this.f78812a = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean z10) {
            this.f78816e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int i10) {
            this.f78817f = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int i10) {
            this.f78813b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.f78814c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean z10) {
            this.f78815d = Boolean.valueOf(z10);
            return this;
        }
    }

    /* synthetic */ NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, int i10) {
        this(num, num2, sSLSocketFactory, bool, bool2, num3);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.f78806a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.f78810e;
    }

    public int getMaxResponseSize() {
        return this.f78811f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.f78807b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f78808c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.f78809d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f78806a + ", readTimeout=" + this.f78807b + ", sslSocketFactory=" + this.f78808c + ", useCaches=" + this.f78809d + ", instanceFollowRedirects=" + this.f78810e + ", maxResponseSize=" + this.f78811f + '}';
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f78806a = num;
        this.f78807b = num2;
        this.f78808c = sSLSocketFactory;
        this.f78809d = bool;
        this.f78810e = bool2;
        this.f78811f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }
}
