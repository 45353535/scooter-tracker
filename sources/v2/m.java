package v2;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f105718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f105719c;

    public interface a {
        void a(File file);
    }

    public m(String uriStr, File destFile, a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f105717a = uriStr;
        this.f105718b = destFile;
        this.f105719c = onSuccess;
    }

    public Boolean a(String... args) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f105717a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f105718b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    protected void b(boolean z10) {
        if (!e3.a.d(this) && z10) {
            try {
                this.f105719c.a(this.f105718b);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            b(((Boolean) obj).booleanValue());
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
