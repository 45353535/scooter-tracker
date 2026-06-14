package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f46540d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f46541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46543c = 9377;

    public n() {
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        this.f46541a = gVarD;
        if (gVarD == null) {
            this.f46541a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f46542b = host;
                jSONObject.put(com.taurusx.tax.o.g.f66428y, DtbConstants.HTTPS + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th2) {
            q0.b("SocketSpider", th2.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put("User-Agent", m0.i());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", m0.i());
                }
            } else {
                jSONObject2.put("User-Agent", m0.i());
            }
            jSONObject2.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            if (this.f46541a.J0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject2);
        } catch (Throwable th3) {
            q0.b("SocketSpider", th3.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f46502g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f46503h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z10, z11);
        if (jSONObjectB.length() == 0) {
            aVar.f46503h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString(com.taurusx.tax.o.g.f66428y))) {
            aVar.f46503h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f46543c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f46542b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f46503h = "request url parse error.";
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        int length;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.f46542b, this.f46543c);
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            socket.setSoTimeout(15000);
            outputStream2 = socket.getOutputStream();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.put((byte) 2);
            byteBufferWrap.put((byte) 3);
            byteBufferWrap.putShort((short) f46540d.getAndIncrement());
            if (TextUtils.isEmpty(str2)) {
                byteBufferWrap.putInt(0);
                outputStream2.write(byteBufferWrap.array());
                length = 0;
            } else {
                byte[] bArrA = a(str2);
                length = bArrA.length;
                byteBufferWrap.putInt(length);
                outputStream2.write(byteBufferWrap.array());
                outputStream2.write(bArrA);
            }
            outputStream2.flush();
            q0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
            InputStream inputStream = socket.getInputStream();
            byte[] bArr = new byte[8];
            inputStream.read(bArr, 0, 8);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
            byteBufferWrap2.order(byteOrder);
            int i10 = byteBufferWrap2.getInt(4);
            byte b10 = bArr[1];
            boolean z10 = b10 == 3;
            byte b11 = b10 == 2;
            q0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i10 + " isGzip : " + z10);
            byte[] bArr2 = new byte[i10];
            new DataInputStream(socket.getInputStream()).readFully(bArr2);
            if (!z10 && i10 > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                z10 = true;
            }
            if (b11 == true && i10 == 0) {
                aVar.f46501f = 200;
                aVar.f46502g = str;
                aVar.f46500e = 0;
                try {
                    socket.close();
                    outputStream2.close();
                    return aVar;
                } catch (Exception e10) {
                    q0.b("SocketSpider", e10.getMessage());
                }
            } else if (i10 < 1) {
                aVar.f46501f = 200;
                aVar.f46502g = str;
                aVar.f46500e = 0;
                try {
                    socket.close();
                    outputStream2.close();
                    return aVar;
                } catch (Exception e11) {
                    q0.b("SocketSpider", e11.getMessage());
                }
            } else {
                try {
                    if (z10) {
                        str3 = a(bArr2);
                    } else {
                        str3 = new String(bArr2);
                    }
                } catch (Throwable th3) {
                    q0.b("SocketSpider", th3.getMessage());
                    aVar.f46503h = th3.getMessage();
                }
                if (!TextUtils.isEmpty(str3)) {
                    aVar.f46501f = 200;
                    aVar.f46502g = str;
                    aVar.f46500e = 0;
                    try {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("data");
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("location");
                            if (!TextUtils.isEmpty(strOptString)) {
                                aVar.f46501f = 302;
                                aVar.f46496a = strOptString;
                            }
                        }
                    } catch (Throwable th4) {
                        q0.b("SocketSpider", th4.getMessage());
                    }
                    try {
                        socket.close();
                        outputStream2.close();
                    } catch (Exception e12) {
                        q0.b("SocketSpider", e12.getMessage());
                    }
                } else {
                    inputStream.close();
                    try {
                        socket.close();
                        outputStream2.close();
                    } catch (Exception e13) {
                        q0.b("SocketSpider", e13.getMessage());
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = outputStream2;
            socket2 = socket;
            try {
                q0.a("SocketSpider", "Socket exception: " + th.getMessage());
                aVar.f46503h = th.getMessage();
                if (socket2 != null) {
                    try {
                        socket2.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Exception e14) {
                        q0.b("SocketSpider", e14.getMessage());
                    }
                }
            } finally {
            }
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
