package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    @NonNull
    private static final wd.e TASK_MANAGER = new xd.b();

    @Nullable
    private InterfaceC0975b callback;

    @Nullable
    private c cancelCallback;

    @Nullable
    private ArrayList<h> contentEncoders;

    @Nullable
    private URLConnection currentConnection;
    private i currentState = i.Idle;

    @Nullable
    private g dataBinder;

    @Nullable
    private ArrayList<h> dataEncoders;

    @Nullable
    private Object errorResult;

    @NonNull
    private final e method;

    @Nullable
    private final String path;

    @Nullable
    private final Object requestData;

    @Nullable
    private Object requestResult;

    /* JADX INFO: renamed from: io.bidmachine.core.b$b, reason: collision with other inner class name */
    public interface InterfaceC0975b {
        void onFail(Object obj);

        void onSuccess(Object obj);
    }

    public interface c {
        void onCanceled();
    }

    public static class d extends h {
        @Override // io.bidmachine.core.b.h
        protected byte[] a(b bVar, URLConnection uRLConnection, byte[] bArr) throws Throwable {
            GZIPInputStream gZIPInputStream;
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            ByteArrayOutputStream byteArrayOutputStream;
            if (!"gzip".equals(uRLConnection.getContentEncoding())) {
                return bArr;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    } catch (Throwable th3) {
                        gZIPInputStream = null;
                        th2 = th3;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i10 = gZIPInputStream.read(bArr2);
                            if (i10 == -1) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                io.bidmachine.core.h.o(byteArrayOutputStream);
                                io.bidmachine.core.h.i(byteArrayOutputStream);
                                io.bidmachine.core.h.i(byteArrayInputStream);
                                io.bidmachine.core.h.i(gZIPInputStream);
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i10);
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        io.bidmachine.core.h.o(byteArrayOutputStream);
                        io.bidmachine.core.h.i(byteArrayOutputStream);
                        io.bidmachine.core.h.i(byteArrayInputStream);
                        io.bidmachine.core.h.i(gZIPInputStream);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    byteArrayInputStream = null;
                    th2 = th5;
                    gZIPInputStream = null;
                }
            } catch (Throwable th6) {
                gZIPInputStream = null;
                byteArrayInputStream = null;
                th2 = th6;
                byteArrayOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.b.h
        protected byte[] b(b bVar, URLConnection uRLConnection, byte[] bArr) throws Throwable {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        io.bidmachine.core.h.i(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        io.bidmachine.core.h.o(byteArrayOutputStream2);
                        io.bidmachine.core.h.i(byteArrayOutputStream2);
                        io.bidmachine.core.h.o(null);
                        io.bidmachine.core.h.i(null);
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        io.bidmachine.core.h.o(byteArrayOutputStream);
                        io.bidmachine.core.h.i(byteArrayOutputStream);
                        io.bidmachine.core.h.o(gZIPOutputStream);
                        io.bidmachine.core.h.i(gZIPOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
            }
        }

        @Override // io.bidmachine.core.b.h
        protected void c(b bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
    }

    public enum e {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f80031b;

        e(String str) {
            this.f80031b = str;
        }

        public void g(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.f80031b);
            }
        }
    }

    private final class f implements Runnable {
        private f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b();
            if (b.this.callback == null || b.this.isCanceled()) {
                return;
            }
            if (b.this.currentState == i.Success) {
                b.this.callback.onSuccess(b.this.requestResult);
            } else {
                b.this.callback.onFail(b.this.errorResult);
            }
        }
    }

    public static abstract class g {
        protected Object createFailResult(b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        protected abstract Object createSuccessResult(b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

        @Nullable
        protected abstract byte[] obtainData(b bVar, URLConnection uRLConnection, @Nullable Object obj) throws Exception;

        protected abstract void prepareHeaders(b bVar, URLConnection uRLConnection);

        protected void prepareRequest(b bVar, URLConnection uRLConnection) {
        }
    }

    public static abstract class h {
        protected abstract byte[] a(b bVar, URLConnection uRLConnection, byte[] bArr);

        protected abstract byte[] b(b bVar, URLConnection uRLConnection, byte[] bArr);

        protected abstract void c(b bVar, URLConnection uRLConnection);
    }

    public enum i {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    public b(e eVar, String str, Object obj) {
        this.method = eVar;
        this.path = str;
        this.requestData = obj;
    }

    private int a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        URLConnection uRLConnection;
        URL url;
        URLConnection uRLConnectionOpenConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        g gVar;
        BufferedOutputStream bufferedOutputStream;
        this.currentState = i.Running;
        try {
            if (this.path != null) {
                url = new URL(getBaseUrl() + "/" + this.path);
            } else {
                url = new URL(getBaseUrl());
            }
            uRLConnectionOpenConnection = url.openConnection();
        } catch (Throwable th2) {
            th = th2;
            uRLConnection = null;
        }
        try {
            this.currentConnection = uRLConnectionOpenConnection;
            this.method.g(uRLConnectionOpenConnection);
            prepareRequestParams(uRLConnectionOpenConnection);
            byte[] bArrObtainRequestData = obtainRequestData(uRLConnectionOpenConnection);
            if (bArrObtainRequestData != null) {
                byte[] bArrEncodeRequestData = encodeRequestData(uRLConnectionOpenConnection, bArrObtainRequestData);
                uRLConnectionOpenConnection.setDoOutput(true);
                try {
                    bufferedOutputStream = new BufferedOutputStream(uRLConnectionOpenConnection.getOutputStream());
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
                try {
                    bufferedOutputStream.write(bArrEncodeRequestData);
                    io.bidmachine.core.h.o(bufferedOutputStream);
                    io.bidmachine.core.h.i(bufferedOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    io.bidmachine.core.h.o(bufferedOutputStream);
                    io.bidmachine.core.h.i(bufferedOutputStream);
                    throw th;
                }
            }
            try {
                int iA = a(uRLConnectionOpenConnection);
                if (isCanceled()) {
                    io.bidmachine.core.h.o(null);
                    io.bidmachine.core.h.i(null);
                    io.bidmachine.core.h.i(null);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                    }
                    this.currentConnection = null;
                    if (isCanceled()) {
                        return;
                    }
                    this.currentState = this.errorResult == null ? i.Success : i.Fail;
                    return;
                }
                if (iA != 200) {
                    this.errorResult = obtainError(uRLConnectionOpenConnection, iA);
                    inputStream2 = null;
                    byteArrayOutputStream2 = null;
                } else {
                    inputStream2 = uRLConnectionOpenConnection.getInputStream();
                    try {
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i10 = inputStream2.read(bArr);
                                if (i10 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr, 0, i10);
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            if (byteArray != null) {
                                byteArray = decodeResponseData(uRLConnectionOpenConnection, byteArray);
                            }
                            if (byteArray != null && byteArray.length > 0 && (gVar = this.dataBinder) != null) {
                                Object objCreateSuccessResult = gVar.createSuccessResult(this, uRLConnectionOpenConnection, byteArray);
                                this.requestResult = objCreateSuccessResult;
                                if (objCreateSuccessResult == null) {
                                    this.errorResult = this.dataBinder.createFailResult(this, uRLConnectionOpenConnection, byteArray);
                                }
                            }
                        } catch (Throwable th5) {
                            inputStream = inputStream2;
                            th = th5;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            io.bidmachine.core.h.o(byteArrayOutputStream);
                            io.bidmachine.core.h.i(byteArrayOutputStream);
                            io.bidmachine.core.h.i(inputStream);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        inputStream = inputStream2;
                        th = th6;
                        byteArrayOutputStream = null;
                    }
                }
                io.bidmachine.core.h.o(byteArrayOutputStream2);
                io.bidmachine.core.h.i(byteArrayOutputStream2);
                io.bidmachine.core.h.i(inputStream2);
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                }
                this.currentConnection = null;
                if (isCanceled()) {
                    return;
                }
                this.currentState = this.errorResult == null ? i.Success : i.Fail;
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th8) {
            uRLConnection = uRLConnectionOpenConnection;
            th = th8;
            try {
                io.bidmachine.core.a.p(th);
                this.errorResult = obtainError(uRLConnection, th);
            } finally {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
                this.currentConnection = null;
                if (!isCanceled()) {
                    this.currentState = this.errorResult == null ? i.Success : i.Fail;
                }
            }
        }
    }

    public void addContentEncoder(h hVar) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(hVar);
    }

    public void addDataEncoder(h hVar) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(hVar);
    }

    public void cancel() {
        this.currentState = i.Canceled;
        c cVar = this.cancelCallback;
        if (cVar != null) {
            cVar.onCanceled();
        }
    }

    protected byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<h> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().a(this, uRLConnection, bArr);
            }
        }
        ArrayList<h> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<h> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().a(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<h> arrayList = this.dataEncoders;
        if (arrayList != null) {
            for (h hVar : arrayList) {
                hVar.c(this, uRLConnection);
                bArr = hVar.b(this, uRLConnection, bArr);
            }
        }
        ArrayList<h> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            for (h hVar2 : arrayList2) {
                hVar2.c(this, uRLConnection);
                bArr = hVar2.b(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    protected abstract String getBaseUrl();

    @NonNull
    public e getMethod() {
        return this.method;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == i.Canceled;
    }

    protected abstract Object obtainError(URLConnection uRLConnection, int i10);

    protected abstract Object obtainError(URLConnection uRLConnection, Throwable th2);

    protected byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        g gVar = this.dataBinder;
        if (gVar == null) {
            return null;
        }
        gVar.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    protected void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    public void request() {
        request(TASK_MANAGER);
    }

    public void setCallback(@Nullable InterfaceC0975b interfaceC0975b) {
        this.callback = interfaceC0975b;
    }

    public void setCancelCallback(@Nullable c cVar) {
        this.cancelCallback = cVar;
    }

    public void setDataBinder(@Nullable g gVar) {
        this.dataBinder = gVar;
    }

    public void request(@NonNull wd.e eVar) {
        try {
            eVar.execute(new f());
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            InterfaceC0975b interfaceC0975b = this.callback;
            if (interfaceC0975b != null) {
                interfaceC0975b.onFail(obtainError((URLConnection) null, th2));
            }
        }
    }
}
