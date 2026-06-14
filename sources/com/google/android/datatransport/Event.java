package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes7.dex */
@AutoValue
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i10, T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i10, T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i10, T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.HIGHEST, productData, eventContext);
    }

    @Nullable
    public abstract Integer getCode();

    @Nullable
    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    @Nullable
    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(int i10, T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i10, T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i10, T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(int i10, T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i10, T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i10, T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(int i10, T t10) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i10, T t10) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(int i10, T t10) {
        return new AutoValue_Event(Integer.valueOf(i10), t10, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofData(T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t10, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t10, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t10, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t10, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t10, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t10, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t10, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(T t10) {
        return new AutoValue_Event(null, t10, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t10) {
        return new AutoValue_Event(null, t10, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(T t10) {
        return new AutoValue_Event(null, t10, Priority.HIGHEST, null, null);
    }
}
