package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List<String> f49094a;

    class a implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f49097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f49098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f49099e;

        a(String str, String str2, c cVar, String str3, String str4) {
            this.f49095a = str;
            this.f49096b = str2;
            this.f49097c = cVar;
            this.f49098d = str3;
            this.f49099e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f49095a + File.separator + this.f49096b;
                String str3 = this.f49095a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.f49097c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            q0.b("DynamicViewResourceManager", th2.getMessage());
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.f49097c.a(this.f49098d, str3, this.f49099e, str, false);
                    } catch (Exception e10) {
                        q0.b("DynamicViewResourceManager", e10.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.f49097c;
            if (cVar != null) {
                try {
                    cVar.a(this.f49098d, downloadError);
                } catch (Exception e10) {
                    q0.b("DynamicViewResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    class b implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49101b;

        b(String str, String str2) {
            this.f49100a = str;
            this.f49101b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f49100a + File.separator + this.f49101b, this.f49100a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z10);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f49094a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r13 != 5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r13, java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.tools.z.c r16, com.mbridge.msdk.foundation.entity.CampaignEx r17) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.z.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.z$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i10, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String path = new URL(str2).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    return strSubstring.replace(".zip", "");
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = new URL(str).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    String strReplace = strSubstring.replace(".zip", "");
                    List<String> list = f49094a;
                    if (list != null) {
                        if (!list.contains(strReplace)) {
                            return strReplace;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static String a(int i10, String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strB = b(i10, str, str2);
        } catch (Exception unused) {
            strB = "";
        }
        String str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        File file = !TextUtils.isEmpty(strB) ? new File(str3, strB) : null;
        if (file == null || !file.exists()) {
            file = new File(str3 + File.separator + strB.replace(".xml", ""), strB);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String strB;
        String str2;
        File file;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.equals("1")) {
                    return "";
                }
            }
        } catch (Throwable unused) {
        }
        try {
            strB = b(str);
        } catch (Exception unused2) {
            strB = "";
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            str2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            file = new File(str2, strB);
        } catch (Exception unused3) {
        }
        if (file.isFile() && file.exists()) {
            return file.getPath();
        }
        String path = new URL(str).getPath();
        a(str, path.substring(path.lastIndexOf(47) + 1), str2, strB);
        return "";
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i10) throws Exception {
        q0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i10));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.f48609u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.f48608t).withTimeout(60000L).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.f48607s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f48609u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f48603o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.f48607s).withTimeout(60000L).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
