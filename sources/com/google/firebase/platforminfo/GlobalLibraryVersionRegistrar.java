package com.google.firebase.platforminfo;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class GlobalLibraryVersionRegistrar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile GlobalLibraryVersionRegistrar f32943b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f32944a = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = f32943b;
        if (globalLibraryVersionRegistrar2 != null) {
            return globalLibraryVersionRegistrar2;
        }
        synchronized (GlobalLibraryVersionRegistrar.class) {
            try {
                globalLibraryVersionRegistrar = f32943b;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    f32943b = globalLibraryVersionRegistrar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return globalLibraryVersionRegistrar;
    }

    Set a() {
        Set setUnmodifiableSet;
        synchronized (this.f32944a) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f32944a);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f32944a) {
            this.f32944a.add(LibraryVersion.a(str, str2));
        }
    }
}
