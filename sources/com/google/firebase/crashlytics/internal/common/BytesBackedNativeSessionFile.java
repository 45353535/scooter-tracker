package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes9.dex */
class BytesBackedNativeSessionFile implements NativeSessionFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f31983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31985c;

    BytesBackedNativeSessionFile(String str, String str2, byte[] bArr) {
        this.f31984b = str;
        this.f31985c = str2;
        this.f31983a = bArr;
    }

    private byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f31983a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean b() {
        byte[] bArr = this.f31983a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] bArrA = a();
        if (bArrA == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.builder().setContents(bArrA).setFilename(this.f31984b).build();
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @NonNull
    public String getReportsEndpointFilename() {
        return this.f31985c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public InputStream getStream() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f31983a);
    }
}
