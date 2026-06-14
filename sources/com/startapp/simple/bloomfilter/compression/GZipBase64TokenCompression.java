package com.startapp.simple.bloomfilter.compression;

import com.startapp.simple.bloomfilter.codec.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class GZipBase64TokenCompression implements TokenCompression {
    private final StringReplacer replacer;

    public GZipBase64TokenCompression(StringReplacer stringReplacer) {
        this.replacer = stringReplacer;
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String compress(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                IOUtils.closeQuietly((OutputStream) gZIPOutputStream2);
                String strReplaceToUrl = this.replacer.replaceToUrl(Base64.encodeBase64String(byteArrayOutputStream.toByteArray()));
                IOUtils.closeQuietly((OutputStream) gZIPOutputStream2);
                return strReplaceToUrl;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                IOUtils.closeQuietly((OutputStream) gZIPOutputStream);
                return "";
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                IOUtils.closeQuietly((OutputStream) gZIPOutputStream);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String decompress(String str) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(this.replacer.replaceFromUrl(str))));
        } catch (Exception unused) {
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String string = IOUtils.toString(gZIPInputStream);
            gZIPInputStream.close();
            IOUtils.closeQuietly((InputStream) gZIPInputStream);
            return string;
        } catch (Exception unused2) {
            IOUtils.closeQuietly((InputStream) gZIPInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream2 = gZIPInputStream;
            IOUtils.closeQuietly((InputStream) gZIPInputStream2);
            throw th;
        }
    }
}
