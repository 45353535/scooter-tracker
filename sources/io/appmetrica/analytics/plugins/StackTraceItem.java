package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f78909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f78911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f78912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f78913e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f78914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f78915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f78916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f78917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f78918e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f78914a, this.f78915b, this.f78916c, this.f78917d, this.f78918e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f78914a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f78917d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f78915b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f78916c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f78918e = str;
            return this;
        }
    }

    /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i10) {
        this(str, str2, num, num2, str3);
    }

    @Nullable
    public String getClassName() {
        return this.f78909a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f78912d;
    }

    @Nullable
    public String getFileName() {
        return this.f78910b;
    }

    @Nullable
    public Integer getLine() {
        return this.f78911c;
    }

    @Nullable
    public String getMethodName() {
        return this.f78913e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f78909a = str;
        this.f78910b = str2;
        this.f78911c = num;
        this.f78912d = num2;
        this.f78913e = str3;
    }
}
