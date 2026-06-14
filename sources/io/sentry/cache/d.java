package io.sentry.cache;

import io.sentry.g7;
import io.sentry.t1;
import io.sentry.v7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f83318a = Charset.forName("UTF-8");

    static void a(v7 v7Var, String str, String str2) {
        File fileB = b(v7Var, str);
        if (fileB == null) {
            v7Var.getLogger().c(g7.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        v7Var.getLogger().c(g7.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        v7Var.getLogger().c(g7.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    static File b(v7 v7Var, String str) {
        String cacheDirPath = v7Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static Object c(v7 v7Var, String str, String str2, Class cls, t1 t1Var) {
        File fileB = b(v7Var, str);
        if (fileB == null) {
            v7Var.getLogger().c(g7.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f83318a));
                try {
                    Object objC = t1Var == null ? v7Var.getSerializer().c(bufferedReader, cls) : v7Var.getSerializer().d(bufferedReader, cls, t1Var);
                    bufferedReader.close();
                    return objC;
                } finally {
                }
            } catch (Throwable th2) {
                v7Var.getLogger().b(g7.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            v7Var.getLogger().c(g7.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    static void d(v7 v7Var, Object obj, String str, String str2) {
        File fileB = b(v7Var, str);
        if (fileB == null) {
            v7Var.getLogger().c(g7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f83318a));
                try {
                    v7Var.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            v7Var.getLogger().b(g7.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}
