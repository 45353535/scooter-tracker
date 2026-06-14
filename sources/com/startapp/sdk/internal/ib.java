package com.startapp.sdk.internal;

import android.util.JsonToken;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64688a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f64688a = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64688a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f64688a[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f64688a[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f64688a[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f64688a[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
