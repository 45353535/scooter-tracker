package com.taurusx.tax.vast;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.taurusx.tax.f.a;
import com.taurusx.tax.f.c;
import com.taurusx.tax.f.n;
import com.taurusx.tax.f.o;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.t;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastResource;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VastXmlManagerAggregator extends AsyncTask<String, Void, VastConfig> {
    public static final String ADS_BY_AD_SLOT_ID = "adsBy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67038a = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67039f = 300;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<String> f67040g = Arrays.asList("video/mp4", "video/3gpp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67041i = 700;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f67042m = 250;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67043n = "video/mp4";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f67044p = 1500;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f67045s = "MoPub";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f67046t = "video/3gpp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67047c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67048o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final double f67049w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f67050y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w f67051z;

    public interface w {
        void onAggregationComplete(VastConfig vastConfig);
    }

    public enum z {
        LANDSCAPE,
        PORTRAIT
    }

    public VastXmlManagerAggregator(w wVar, double d10, int i10, Context context) {
        r.z(wVar);
        r.z(context);
        this.f67051z = wVar;
        this.f67049w = d10;
        this.f67047c = i10;
        this.f67050y = context.getApplicationContext();
    }

    private void w(y yVar, VastConfig vastConfig) {
        VastExtensionParentXmlManager vastExtensionParentXmlManagerO = yVar.o();
        if (vastExtensionParentXmlManagerO != null) {
            for (VastExtensionXmlManager vastExtensionXmlManager : vastExtensionParentXmlManagerO.z()) {
                if (vastExtensionXmlManager != null) {
                    z(vastExtensionXmlManager.f66982z, vastConfig);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        w wVar = this.f67051z;
        if (wVar != null) {
            wVar.onAggregationComplete(null);
        } else {
            LogUtil.v("taurusx", "onCancelled listener is null");
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        System.getProperty("http.agent");
    }

    public ArrayList<VastVideoBean> y(List<a> list) {
        ArrayList<VastVideoBean> arrayList = new ArrayList<>();
        r.z(list, "managers cannot be null");
        Iterator it = new ArrayList(list).iterator();
        double d10 = Double.NEGATIVE_INFINITY;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strO = aVar.o();
            String strC = aVar.c();
            if (!f67040g.contains(strO) || strC == null) {
                it.remove();
            } else {
                Integer numS = aVar.s();
                Integer numY = aVar.y();
                Integer numZ = aVar.z();
                if (numS != null && numS.intValue() > 0 && numY != null && numY.intValue() > 0) {
                    double dZ = z(numS.intValue(), numY.intValue(), numZ, strO);
                    if (dZ > d10) {
                        arrayList.add(new VastVideoBean(strC, numS.intValue(), numY.intValue()));
                        d10 = dZ;
                    }
                }
            }
        }
        return arrayList;
    }

    public VastConfig z(String str, List<VastTracker> list) {
        VastConfig vastConfigZ;
        VastConfig vastConfigZ2;
        r.z(str, "vastXml cannot be null");
        r.z(list, "errorTrackers cannot be null");
        t tVar = new t();
        try {
            tVar.z(str);
            List<com.taurusx.tax.f.w> listZ = tVar.z();
            if (z(listZ, tVar, this.f67050y)) {
                return null;
            }
            for (com.taurusx.tax.f.w wVar : listZ) {
                if (y(wVar.w())) {
                    o oVarZ = wVar.z();
                    if (oVarZ != null && (vastConfigZ2 = z(oVarZ, list)) != null) {
                        z(tVar, vastConfigZ2);
                        return vastConfigZ2;
                    }
                    n nVarY = wVar.y();
                    if (nVarY != null) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.addAll(nVarY.w());
                        String strZ = z(nVarY, arrayList);
                        if (strZ != null && (vastConfigZ = z(strZ, arrayList)) != null) {
                            vastConfigZ.addImpressionTrackers(nVarY.y());
                            Iterator<s> it = nVarY.c().iterator();
                            while (it.hasNext()) {
                                z(it.next(), vastConfigZ);
                            }
                            z(nVarY, vastConfigZ);
                            w(nVarY, vastConfigZ);
                            z(nVarY.f66059z, vastConfigZ);
                            List<c> listZ2 = nVarY.z();
                            if (vastConfigZ.hasCompanionAd()) {
                                for (VastCompanionAdConfig vastCompanionAdConfig : vastConfigZ.getVastCompanionAdConfigs()) {
                                    for (c cVar : listZ2) {
                                        if (!cVar.n()) {
                                            vastCompanionAdConfig.addClickTrackers(cVar.y());
                                            vastCompanionAdConfig.addCreativeViewTrackers(cVar.c());
                                        }
                                    }
                                }
                            } else {
                                vastConfigZ.addVastCompanionAdConfigs(z(listZ2));
                            }
                            z(tVar, vastConfigZ);
                            return vastConfigZ;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e10) {
            LogUtil.v("taurusx", "Failed to parse VAST XML" + e10);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public VastConfig doInBackground(String... strArr) {
        String str;
        if (strArr != null && strArr.length != 0 && (str = strArr[0]) != null) {
            try {
                return z(str, new ArrayList());
            } catch (Exception e10) {
                LogUtil.v("taurusx", "Unable to generate VastVideoConfig." + e10);
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(VastConfig vastConfig) {
        w wVar = this.f67051z;
        if (wVar != null) {
            wVar.onAggregationComplete(vastConfig);
        } else {
            LogUtil.v("taurusx", "onPostExecute listener is null");
        }
    }

    public VastIconConfig w(List<VastIconXmlManager> list) {
        VastResource vastResourceFromVastResourceXmlManager;
        r.z(list, "managers cannot be null");
        ArrayList<VastIconXmlManager> arrayList = new ArrayList(list);
        for (VastResource.Type type : VastResource.Type.valuesCustom()) {
            for (VastIconXmlManager vastIconXmlManager : arrayList) {
                Integer numN = vastIconXmlManager.n();
                Integer numC = vastIconXmlManager.c();
                if (numN != null && numN.intValue() > 0 && numN.intValue() <= 300 && numC != null && numC.intValue() > 0 && numC.intValue() <= 300 && (vastResourceFromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(vastIconXmlManager.s(), type, numN.intValue(), numC.intValue())) != null) {
                    return new VastIconConfig(vastIconXmlManager.n().intValue(), vastIconXmlManager.c().intValue(), vastIconXmlManager.o(), vastIconXmlManager.y(), vastResourceFromVastResourceXmlManager, vastIconXmlManager.w(), vastIconXmlManager.z(), vastIconXmlManager.a());
                }
            }
        }
        return null;
    }

    public static boolean y(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    private String w(String str) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnectionZ;
        BufferedInputStream bufferedInputStream;
        r.z(str);
        int i10 = this.f67048o;
        BufferedInputStream bufferedInputStream2 = null;
        if (i10 >= 10) {
            return null;
        }
        this.f67048o = i10 + 1;
        try {
            long jF = com.taurusx.tax.w.o.w.f();
            httpURLConnectionZ = com.taurusx.tax.c.s.z(str, jF, jF);
            try {
                bufferedInputStream = new BufferedInputStream(httpURLConnectionZ.getInputStream());
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                String strZ = j0.z((InputStream) bufferedInputStream);
                j0.z((Closeable) bufferedInputStream);
                httpURLConnectionZ.disconnect();
                return strZ;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedInputStream2 = bufferedInputStream;
                j0.z((Closeable) bufferedInputStream2);
                if (httpURLConnectionZ != null) {
                    httpURLConnectionZ.disconnect();
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnectionZ = null;
        }
    }

    private VastConfig z(o oVar, List<VastTracker> list) {
        r.z(oVar);
        r.z(list);
        for (s sVar : oVar.c()) {
            ArrayList<VastVideoBean> arrayListY = y(sVar.a());
            if (arrayListY != null && arrayListY.size() > 0) {
                VastConfig vastConfig = new VastConfig();
                vastConfig.addImpressionTrackers(oVar.y());
                z(sVar, vastConfig);
                vastConfig.setClickThroughUrl(sVar.w());
                vastConfig.setNetworkMediaFileUrl(arrayListY.get(arrayListY.size() - 1).getUrl());
                vastConfig.setVideoWidth(arrayListY.get(arrayListY.size() - 1).getWidth());
                vastConfig.setVideoHeight(arrayListY.get(arrayListY.size() - 1).getHeight());
                vastConfig.setNetworkVideoBeans(arrayListY);
                vastConfig.addVastCompanionAdConfigs(z(oVar.z()));
                list.addAll(oVar.w());
                vastConfig.addErrorTrackers(list);
                z(oVar, vastConfig);
                w(oVar, vastConfig);
                z(oVar.f66059z, vastConfig);
                return vastConfig;
            }
        }
        return null;
    }

    private void z(y yVar, VastConfig vastConfig) {
        VastExtensionParentXmlManager vastExtensionParentXmlManagerO;
        r.z(yVar);
        r.z(vastConfig);
        if (vastConfig.getVideoViewabilityTracker() == null && (vastExtensionParentXmlManagerO = yVar.o()) != null) {
            for (VastExtensionXmlManager vastExtensionXmlManager : vastExtensionParentXmlManagerO.z()) {
                if (f67045s.equals(vastExtensionXmlManager.z())) {
                    vastConfig.setVideoViewabilityTracker(vastExtensionXmlManager.w());
                    return;
                }
            }
        }
    }

    private void z(Node node, VastConfig vastConfig) {
        vastConfig.addViewabilityVendors(new com.taurusx.tax.f.z(node).z());
    }

    private String z(n nVar, List<VastTracker> list) {
        String strS = nVar.s();
        if (strS == null) {
            return null;
        }
        try {
            return w(strS);
        } catch (Exception e10) {
            LogUtil.v("taurusx", "Failed to follow VAST redirect" + e10);
            list.isEmpty();
            return null;
        }
    }

    private void z(s sVar, VastConfig vastConfig) {
        r.z(sVar, "linearXmlManager cannot be null");
        r.z(vastConfig, "vastVideoConfig cannot be null");
        vastConfig.addOffsetPercentProgressTrackers(sVar.g());
        vastConfig.addOffsetAbsoluteProgressTrackers(sVar.t());
        vastConfig.addAbsoluteTrackers(sVar.z());
        vastConfig.addFractionalTrackers(sVar.o());
        vastConfig.addStartTrackers(sVar.i());
        vastConfig.addFirstQuartileTrackers(sVar.c());
        vastConfig.addMidPointTrackers(sVar.n());
        vastConfig.addThirdQuartileTrackers(sVar.v());
        vastConfig.addPauseTrackers(sVar.f());
        vastConfig.addResumeTrackers(sVar.m());
        vastConfig.addCompleteTrackers(sVar.e());
        vastConfig.addCloseTrackers(sVar.l());
        vastConfig.addSkipTrackers(sVar.k());
        vastConfig.addClickTrackers(sVar.y());
        if (vastConfig.getSkipOffset() == null) {
            vastConfig.setSkipOffset(sVar.p());
        }
        if (vastConfig.getVastIconConfig() == null) {
            vastConfig.setVastIconConfig(w(sVar.s()));
        }
    }

    private void z(t tVar, VastConfig vastConfig) {
        r.z(tVar, "xmlManager cannot be null");
        r.z(vastConfig, "vastVideoConfig cannot be null");
        vastConfig.addImpressionTrackers(tVar.s());
        if (vastConfig.getCustomCtaText() == null) {
            vastConfig.setCustomCtaText(tVar.y());
        }
        if (vastConfig.getCustomSkipText() == null) {
            vastConfig.setCustomSkipText(tVar.c());
        }
        if (vastConfig.getCustomCloseIconUrl() == null) {
            vastConfig.setCustomCloseIconUrl(tVar.w());
        }
    }

    private boolean z(List<com.taurusx.tax.f.w> list, t tVar, Context context) {
        return list.isEmpty() && tVar.o() != null;
    }

    public String z(List<a> list, Rect rect) {
        r.z(list, "managers cannot be null");
        Iterator it = new ArrayList(list).iterator();
        double d10 = Double.NEGATIVE_INFINITY;
        String str = null;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strO = aVar.o();
            String strC = aVar.c();
            if (f67040g.contains(strO) && strC != null) {
                Integer numS = aVar.s();
                Integer numY = aVar.y();
                Integer numZ = aVar.z();
                if (numS != null && numS.intValue() > 0 && numY != null && numY.intValue() > 0) {
                    double dZ = z(numS.intValue(), numY.intValue(), numZ, strO);
                    if (dZ > d10) {
                        rect.set(0, 0, numS.intValue(), numY.intValue());
                        d10 = dZ;
                        str = strC;
                    }
                }
            } else {
                it.remove();
            }
        }
        return str;
    }

    public Set<VastCompanionAdConfig> z(List<c> list) {
        r.z(list, "managers cannot be null");
        HashSet hashSet = new HashSet();
        ArrayList<c> arrayList = new ArrayList(list);
        for (VastResource.Type type : VastResource.Type.valuesCustom()) {
            for (c cVar : arrayList) {
                Point pointZ = z(cVar.a() == null ? 300 : cVar.a().intValue(), cVar.o() == null ? 250 : cVar.o().intValue(), type);
                VastResource vastResourceFromVastResourceXmlManager = VastResource.fromVastResourceXmlManager(cVar.s(), type, pointZ.x, pointZ.y);
                if (vastResourceFromVastResourceXmlManager != null) {
                    hashSet.add(new VastCompanionAdConfig(pointZ.x, pointZ.y, vastResourceFromVastResourceXmlManager, cVar.w(), cVar.y(), cVar.c(), null));
                }
            }
        }
        return hashSet;
    }

    public Point z(int i10, int i11, VastResource.Type type) {
        return new Point(i10, i11);
    }

    private double z(int i10, int i11, Integer num, String str) {
        double dZ = z(i10, i11);
        return z(str) * (1.0d / ((dZ + 1.0d) + z(num)));
    }

    private double z(Integer num) {
        int iIntValue = (num == null || num.intValue() < 0) ? 0 : num.intValue();
        if (700 > iIntValue || iIntValue > 1500) {
            return Math.min(Math.abs(700 - iIntValue) / 700.0f, Math.abs(1500 - iIntValue) / 1500.0f);
        }
        return 0.0d;
    }

    private double z(int i10, int i11) {
        double dAbs = Math.abs(this.f67049w - (((double) i10) / ((double) i11)));
        int i12 = this.f67047c;
        return dAbs + ((double) Math.abs((i12 - i10) / i12));
    }

    private double z(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }

    @Deprecated
    public void z(int i10) {
        this.f67048o = i10;
    }
}
