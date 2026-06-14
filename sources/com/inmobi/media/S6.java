package com.inmobi.media;

import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class S6 extends AbstractC4086ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37694a;

    public S6(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(com.ironsource.D5.L, "contentType");
        this.f37694a = fileName;
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final void a(vh.f bufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String filePath = this.f37694a;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        vh.e eVar = new vh.e();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        try {
            eVar.V(fileInputStream);
            uf.c.a(fileInputStream, null);
            try {
                try {
                    try {
                        bufferedSink.i(eVar);
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                    } catch (IOException e10) {
                        throw e10;
                    } catch (Exception unused) {
                        Unit unit = Unit.f93236a;
                    }
                    try {
                        eVar.close();
                    } catch (IOException unused2) {
                    }
                    uf.c.a(eVar, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        uf.c.a(eVar, th2);
                        throw th3;
                    }
                }
            } finally {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                try {
                    eVar.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                uf.c.a(fileInputStream, th4);
                throw th5;
            }
        }
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final String a() {
        return com.ironsource.D5.L;
    }
}
