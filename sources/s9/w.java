package s9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f99895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f99896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f99897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f99898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f99899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f99900j;

    public static class a extends h {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public w(Context context) {
        super(false);
        this.f99895e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor g(Context context, k kVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = kVar.f99819a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = h(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) q9.a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = h(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    private static int h(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // s9.g
    public long b(k kVar) throws a {
        this.f99896f = kVar;
        e(kVar);
        AssetFileDescriptor assetFileDescriptorG = g(this.f99895e, kVar);
        this.f99897g = assetFileDescriptorG;
        long length = assetFileDescriptorG.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f99897g.getFileDescriptor());
        this.f99898h = fileInputStream;
        if (length != -1) {
            try {
                if (kVar.f99825g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f99897g.getStartOffset();
        long jSkip = fileInputStream.skip(kVar.f99825g + startOffset) - startOffset;
        if (jSkip != kVar.f99825g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f99899i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f99899i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f99899i = j10;
            if (j10 < 0) {
                throw new h(2008);
            }
        }
        long jMin = kVar.f99826h;
        if (jMin != -1) {
            long j11 = this.f99899i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f99899i = jMin;
        }
        this.f99900j = true;
        f(kVar);
        long j12 = kVar.f99826h;
        return j12 != -1 ? j12 : this.f99899i;
    }

    @Override // s9.g
    public void close() {
        this.f99896f = null;
        try {
            try {
                InputStream inputStream = this.f99898h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f99898h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f99897g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f99897g = null;
                    if (this.f99900j) {
                        this.f99900j = false;
                        d();
                    }
                }
            } catch (Throwable th2) {
                this.f99898h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f99897g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f99897g = null;
                        if (this.f99900j) {
                            this.f99900j = false;
                            d();
                        }
                        throw th2;
                    } finally {
                        this.f99897g = null;
                        if (this.f99900j) {
                            this.f99900j = false;
                            d();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // s9.g
    public Uri getUri() {
        k kVar = this.f99896f;
        if (kVar != null) {
            return kVar.f99819a;
        }
        return null;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f99899i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) o0.i(this.f99898h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f99899i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f99899i;
        if (j11 != -1) {
            this.f99899i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
