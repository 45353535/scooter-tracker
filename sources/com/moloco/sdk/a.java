package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes10.dex */
abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f53923a;

    static {
        int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
        f53923a = iArr;
        try {
            iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f53923a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
