package com.google.firebase.sessions.dagger.internal;

import kf.a;

/* JADX INFO: loaded from: classes9.dex */
public final class Providers {
    public static <T> Provider<T> asDaggerProvider(final a aVar) {
        Preconditions.checkNotNull(aVar);
        return new Provider<T>() { // from class: com.google.firebase.sessions.dagger.internal.Providers.1
            @Override // com.google.firebase.sessions.dagger.internal.Provider, kf.a
            public T get() {
                return (T) aVar.get();
            }
        };
    }
}
