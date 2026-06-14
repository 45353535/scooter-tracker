package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C5171ie;
import io.appmetrica.analytics.impl.Gn;
import java.util.Currency;

/* JADX INFO: loaded from: classes12.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;
    public final long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Gn f74923g = new Gn(new C5171ie("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f74924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Currency f74925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Integer f74926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f74927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f74928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Receipt f74929f;

        /* synthetic */ Builder(long j10, Currency currency, int i10) {
            this(j10, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f74928e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f74927d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f74926c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f74929f = receipt;
            return this;
        }

        private Builder(long j10, Currency currency) {
            f74923g.a(currency);
            this.f74924a = j10;
            this.f74925b = currency;
        }
    }

    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f74930a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f74931b;

            /* synthetic */ Builder(int i10) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f74930a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f74931b = str;
                return this;
            }

            private Builder() {
            }
        }

        /* synthetic */ Receipt(Builder builder, int i10) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f74930a;
            this.signature = builder.f74931b;
        }
    }

    /* synthetic */ Revenue(Builder builder, int i10) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(j10, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f74924a;
        this.currency = builder.f74925b;
        this.quantity = builder.f74926c;
        this.productID = builder.f74927d;
        this.payload = builder.f74928e;
        this.receipt = builder.f74929f;
    }
}
