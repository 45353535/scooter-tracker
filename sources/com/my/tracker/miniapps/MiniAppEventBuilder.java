package com.my.tracker.miniapps;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MiniAppEventBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f61236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f61237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f61238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f61239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f61240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f61241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Map f61242g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f61241f = str3;
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder withCustomUserId(@Nullable String str) {
            this.f61240e = str;
            return this;
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder withEventParams(@Nullable Map<String, String> map) {
            this.f61242g = map;
            return this;
        }
    }

    public static final class EventBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f61243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f61244b;

        EventBuilder(String str, String str2) {
            this.f61243a = str;
            this.f61244b = str2;
        }

        @NonNull
        @AnyThread
        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f61243a, this.f61244b);
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder customEvent(@NonNull String str) {
            return new CustomEventBuilder(this.f61243a, this.f61244b, str);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f61243a, this.f61244b);
        }

        @NonNull
        @AnyThread
        public OpenEventBuilder openEvent(@NonNull String str) {
            return new OpenEventBuilder(this.f61243a, this.f61244b, str);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f61243a, this.f61244b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f61239d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i10, String str, String str2) {
            super(i10, str, str2);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder withCustomUserId(@Nullable String str) {
            this.f61240e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i10, String str, String str2) {
        this.f61236a = i10;
        this.f61237b = str;
        this.f61238c = str2;
    }

    @NonNull
    @AnyThread
    public static EventBuilder newEventBuilder(@NonNull String str, @NonNull String str2) {
        return new EventBuilder(str, str2);
    }

    @NonNull
    @AnyThread
    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f61236a, this.f61237b, this.f61238c, this.f61239d, this.f61240e, this.f61241f, this.f61242g == null ? null : new TreeMap(this.f61242g));
    }
}
