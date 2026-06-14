package com.my.target.instreamads.postview.models;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class CallToActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f59908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageData f59910e;

    public CallToActionData(String str, Integer num, Integer num2, String str2, ImageData imageData) {
        this.f59906a = str;
        this.f59907b = num;
        this.f59908c = num2;
        this.f59909d = str2;
        this.f59910e = imageData;
    }

    public static CallToActionData a(String str, Integer num, Integer num2, String str2, ImageData imageData) {
        return new CallToActionData(str, num, num2, str2, imageData);
    }

    @Nullable
    public String getAdditionalText() {
        return this.f59909d;
    }

    @ColorInt
    @Nullable
    public Integer getButtonColor() {
        return this.f59907b;
    }

    @NotNull
    public String getButtonText() {
        return this.f59906a;
    }

    @Nullable
    public ImageData getIcon() {
        return this.f59910e;
    }

    @ColorInt
    @Nullable
    public Integer getTextColor() {
        return this.f59908c;
    }

    @NonNull
    public String toString() {
        return "CallToActionData{buttonText=" + this.f59906a + ", buttonColor=" + this.f59907b + ", textColor=" + this.f59908c + ", additionalText=" + this.f59909d + '}';
    }
}
