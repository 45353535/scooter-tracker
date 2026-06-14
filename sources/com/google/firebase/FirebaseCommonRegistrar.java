package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create("fire-core", BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create("device-name", e(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create("device-model", e(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create("device-brand", e(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext("android-target-sdk", new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.c
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-min-sdk", new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.d
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-platform", new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.e
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-installer", new LibraryVersionComponent.VersionExtractor() { // from class: com.google.firebase.f
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create("kotlin", strDetectVersion));
        }
        return arrayList;
    }
}
