package com.startapp.simple.bloomfilter.codec;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    private static final int EOF = -1;
    public static final String LINE_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        LINE_SEPARATOR = stringBuilderWriter.toString();
        printWriter.close();
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        copy(new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static String toString(InputStream inputStream) throws IOException {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j10 = 0;
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return j10;
            }
            writer.write(cArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        copy(inputStream, stringBuilderWriter, charset);
        return stringBuilderWriter.toString();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long jCopyLarge = copyLarge(reader, writer);
        if (jCopyLarge > SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) jCopyLarge;
    }
}
