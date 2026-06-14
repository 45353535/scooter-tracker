package com.google.protobuf;

/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
